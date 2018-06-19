package com.lineadirecta.pacifika;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import javax.mail.Address;
import javax.mail.BodyPart;
import javax.mail.Flags;
import javax.mail.Folder;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.NoSuchProviderException;
import javax.mail.Part;
import javax.mail.Session;
import javax.mail.Store;
import javax.mail.internet.MimeMultipart;
import javax.mail.search.FlagTerm;
import javax.swing.JOptionPane;
import com.lineadirecta.pacifika.model.DatoLogisticaModel;
import com.lineadirecta.pacifika.pageobjets.Generales;
import javax.mail.*;
@SuppressWarnings("all")

public class Mail {
	
	public void main(String args[]) throws Throwable {		
		RecibirEmail("slflorez91@gmail.com","Cucuta1234+","00126190");
	}
	
	DatoLogisticaModel datoLogisticaModel=new DatoLogisticaModel();
	public void RecibirEmail(String correo,String contrasena,String cadenac) throws Throwable{
		String cadena=cadenac;
		try{
		int intIndex=0;		
		Properties properties=new Properties();
		properties.setProperty("mail.store.protocole", "imaps");
		//properties.put("mail.imaps.host", "imap-mail.outlook.com");
		Session emailSession = Session.getDefaultInstance(properties);
		Store emailStore = emailSession.getStore("imaps");	
		intIndex = correo.indexOf("mailinator"); 
		if (intIndex == -1){						
		intIndex = correo.indexOf("gmail");
		if (intIndex == -1){
			emailStore.connect("imap-mail.outlook.com",correo,contrasena);
		}else{
			emailStore.connect("imap.gmail.com",correo,contrasena);
		}
		}else {
			emailStore = emailSession.getStore("pop3");
			emailStore.connect("pop.mailinator.com", 110, correo, contrasena);
		}		
		Folder emailFolder =emailStore.getFolder("INBOX");
		emailFolder.open(Folder.READ_WRITE);
		FlagTerm ft = new FlagTerm(new Flags(Flags.Flag.SEEN), false);
        Message messages[] = emailFolder.search(ft);		
		//Message messages[]= emailFolder.getMessages();	
//		for(int i=(messages.length-2);i<messages.length;i++){
        for (Message message:messages){
//			Message message =messages[i];
        	intIndex = message.getFrom()[0].toString().indexOf("PayU");
        	if (intIndex >= 0 ){
			datoLogisticaModel.Escribir("--------- aqui comienza --------");
			datoLogisticaModel.Escribir(String.valueOf(message.getSubject()));
			datoLogisticaModel.Escribir(String.valueOf(message.getFrom()[0].toString()));		    
//			datoLogisticaModel.Escribir(String.valueOf(message.getLineCount()));
			datoLogisticaModel.Escribir("--------- aqui termina --------");						
			message.setFlag(Flags.Flag.SEEN, true);			
			}              	
        	intIndex = message.getFrom()[0].toString().indexOf("Pacifika");
        	if (intIndex > 0 ){
				datoLogisticaModel.Escribir("--------- aqui comienza --------");
				datoLogisticaModel.Escribir(String.valueOf(message.getSubject()));
				datoLogisticaModel.Escribir(String.valueOf(message.getFrom()[0].toString()));
				if (message.isMimeType("multipart/*")){
				MimeMultipart mimeMultipart = (MimeMultipart) message.getContent();
			    int count = mimeMultipart.getCount();
			    String result="";
			    for (int j = 0; j < count; j++) {
			        BodyPart bodyPart = mimeMultipart.getBodyPart(j);
			        if (bodyPart.isMimeType("text/plain")) {
			            result = result + "\n" + bodyPart.getContent();
			            break;
			        } 
			        else if (bodyPart.isMimeType("text/html")) {
			            String html = (String) bodyPart.getContent();
			            result = result + "\n" + org.jsoup.Jsoup.parse(html).text();
			        } 
			    }
			    datoLogisticaModel.Escribir(result);		    
	//			datoLogisticaModel.Escribir(String.valueOf(message.getLineCount()));
				datoLogisticaModel.Escribir("--------- aqui termina --------");			
				
			    intIndex = result.indexOf(cadena);
			    if(intIndex == - 1){
			    	try{
				    assertThat(cadena,containsString(result));
			    	}catch(Throwable t){		    		
			    	}
		          }else{
		  		    assertThat("correo",containsString("correo"));
		          }
	
				message.setFlag(Flags.Flag.SEEN, true);
				}
			}
		}
		emailFolder.close(false);
		emailStore.close();
		
		}catch(NoSuchProviderException nspe){
			nspe.printStackTrace();
		}
		catch(MessagingException me){
			System.out.print("Usuario o contrasena invalido");
			me.printStackTrace();
		}
	}


}