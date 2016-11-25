/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EMail;

import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.*;
import javax.mail.internet.*;
import javax.activation.*;
/**
 *
 * @author Bauer
 */
public class SendEMail {

    public SendEMail(String[] to, String from,String pw, String subjectLine, String text,String filename ) {
        
        // Assuming you are sending email from localhost
      String host = "localhost";

      // Get system properties
      Properties properties = System.getProperties();

      // Setup mail server
      properties.setProperty("mail.smtp.host", host);
      properties.setProperty("mail.user", from);
      properties.setProperty("mail.password", pw);
      

      // Get the default Session object.
      Session session = Session.getDefaultInstance(properties);
        
        try{
            // Create a default MimeMessage object.
         MimeMessage message = new MimeMessage(session);

         // Set From: header field of the header.
         message.setFrom(new InternetAddress(from));

         // Set To: header field of the header.
         for(int i=0;i<to.length;i++){
               message.addRecipient(Message.RecipientType.TO, new InternetAddress(to[i]));
         }

         // Set Subject: header field
         message.setSubject(subjectLine);
         BodyPart bp=new MimeBodyPart();
         bp.setText(text);
         
         Multipart multi=new MimeMultipart();
         multi.addBodyPart(bp);
         
         //attachment
         if(filename!=null){
         bp=new MimeBodyPart();
         String file =filename;
         DataSource source= new FileDataSource(file);
         bp.setDataHandler(new DataHandler(source));
         bp.setFileName(file);
         multi.addBodyPart(bp);

         }
         // Send message
         message.setContent(multi);
         Transport.send(message);
            
        } catch (MessagingException ex) {
           ex.printStackTrace();
        } 
    }
    
}
