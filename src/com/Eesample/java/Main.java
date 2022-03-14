package com.Eesample.java;
import com.Eesample.java.Aescoom.AESmn;
import com.Eesample.java.alcpbe.Cpabe;

import javax.xml.bind.annotation.adapters.HexBinaryAdapter;
import java.io.*;
import java.security.DigestInputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Date;


public class Main {
    final static boolean DEBUG = true;

    static String pubfile = "E:/Support/SupportedTransfer/src/com/Eesample/java/star/pub_key";
    static String mskfile = "E:/Support/SupportedTransfer/src/com/Eesample/java/star/master_key";
    static String prvfile = "E:/Support/SupportedTransfer/src/com/Eesample/java/star/prv_key";

    static String inputfile = "E:/Support/SupportedTransfer/src/com/Eesample/java/star/input.pdf";
    static String encfile = "E:/Support/SupportedTransfer/src/com/Eesample/java/star/input.pdf.cpabe";
    static String decfile = "E:/Support/SupportedTransfer/src/com/Eesample/java/star/input.pdf.new";

    static String[] attr = {"baf", "fim1", "foo"};
    static String[] another_attr = {"baf1", "fim1", "foo"};
    static String policy = "foo bar fim 2of3 baf 1of2";

    static String student_attr = "objectClass:inetOrgPerson "
            + "objectClass:organizationalPerson sn:student2 cn:student2 "
            + "uid:student2 userPassword:student2 ou:idp o:computer "
            + "mail:student2@sdu.edu.cn title:student";

    static String student_policy = "sn:student2 cn:student2 "
            + "uid:student2 3of3";

    public static void main(String[] args) throws Exception {
        String attr_str;
        // policy = student_policy;
        // attr_str = array2Str(student_attr);
        long startTimes, endTimes;
        double results;
        long startTimek, endTimek;
        double resultk;
        long startTimee, endTimee;
        double resulte;
        long startTimed, endTimed;
        double resultd;
        long startTimeh, endTimeh;
        double resulth;
        long startTimea, endTimea;
        double resultea;
        long startTimeed, endTimeed;
        double resulteed;
        long startTimep, endTimep;
        double resultp;
        long startTimeel, endTimeel;
        double resulteel;
        long startTimeeld, endTimeeld;
        double resulteeld;

String datelog;
String enclog;
String declog;
String rolog;
        attr_str = student_attr;
        policy = student_policy;
        int stauser=0;
        int stafile=0;

        Cpabe test = new Cpabe();
        startTimes = System.nanoTime();
        System.out.println("//start to setup");
        test.setup(pubfile, mskfile);
        endTimes = System.nanoTime();
        System.out.println("//end to setup");
        results=(double)(endTimes - startTimes)/1000000000.0;
        System.out.println(results);


        System.out.println("//start to keygen");
        startTimek=System.nanoTime();
        test.keygen(pubfile, prvfile, mskfile, attr_str);
        endTimek=System.nanoTime();
        System.out.println("//end to keygen");
        resultk=(double)(endTimek - startTimek)/1000000000.0;
        System.out.println(resultk);

        System.out.println("//start to enc");
        startTimee = System.nanoTime();
        test.enc(pubfile, policy, inputfile, encfile);
        endTimee=System.nanoTime();
        resulte=(double)(endTimee - startTimee)/1000000000.0;
        System.out.println("//end to enc");
        System.out.println(resulte);

        System.out.println("//start to dec");
        startTimed = System.nanoTime();
        test.dec(pubfile, prvfile, encfile, decfile);
        endTimed=System.nanoTime();
        System.out.println("//end to dec");
        resultd=(double)(endTimed - startTimed)/1000000000.0;
        System.out.println(resultd);


        System.out.println("//start to hash");
        startTimeh = System.nanoTime();
        String result = computeFileSHA1("E:/Support/SupportedTransfer/src/com/Eesample/java/star/input.pdf");
        endTimeh=System.nanoTime();
        System.out.println(result);
        resulth=(double)(endTimeh - startTimeh)/1000000000.0;
        System.out.println("//end to hash");
        System.out.println(resulth);

        System.out.println("//start to encAES hash");
        startTimea = System.nanoTime();
        AESmn as =new AESmn();
        String mah=as.encrypt(result);
        endTimea=System.nanoTime();
        System.out.println(mah);
        System.out.println("//end to encAES hash");
        resultea=(double)(endTimea - startTimea)/1000000000.0;
        System.out.println(resultea);

        System.out.println("//start to decAES hash");
        startTimeed = System.nanoTime();
        String maho=as.decrypt(mah);
        System.out.println(maho);
        endTimeed=System.nanoTime();
        System.out.println("//end to decAES hash");
        resulteed=(double)(endTimeed - startTimeed)/1000000000.0;
        System.out.println(resulteed);


        System.out.println("//start to policy ");
        startTimep=System.nanoTime();

        for(int i=1;i<=5;i++){
            stafile=1;
        }
        for(int j=1;j<=5;j++){
            stauser=1;
        }
if(stauser==0 || stafile==0)
{
    System.out.println("shoma ");
    Date rm =new Date();
}
else if (stauser==1 || stafile==1)
{
    System.out.println("az ettlate bimar yek copye gaire ghable taghir  dar driv c shoma garar dade shode ");
    File file = new File("C:/output/output.txt");
    if(file.exists()){
        // set file as read only
        boolean resulthhh = file.setReadOnly();

        // evaluate the result
        if(resulthhh){
            System.out.println("Operation succeeded");
        }else{
            System.out.println("Operation failed");
        }
    }else{
        System.out.println("File does not exist");
    }


    Date kv=new Date();
    datelog=kv.toString();
    rolog="karar dar in tarikh file  shomara ra khande ast"+datelog;
    System.out.println(rolog);
    System.out.println("tole reshte log "+rolog.length());
    System.out.println("//start to encAES for log ");
  startTimeel  =System.nanoTime();

    enclog = as.encrypt(rolog);
    endTimeel=System.nanoTime();
    System.out.println("//end to encAES for log ");

    resulteel=(double)(endTimeel - startTimeel)/1000000000.0;
    System.out.println(enclog);
    System.out.println("tole reshte log ramze shode "+enclog.length());
    System.out.println(resulteel);

    System.out.println("//start to decAES for log ");
    startTimeeld=System.nanoTime();
    declog = as.decrypt(enclog);
    endTimeeld=System.nanoTime();
    System.out.println(declog);
    resulteeld=(double)(endTimeeld - startTimeeld)/1000000000.0;
    System.out.println("//end to decAES for log ");

    System.out.println(resulteeld);

}
else if (stauser==2 || stafile==2)
{
    System.out.println("shomarb ");
}
else if (stauser==3 || stafile==3)
{
    System.out.println("shomamm ");
}
else {
    System.out.println("shomfffmm ");
}
endTimep=System.nanoTime();
        System.out.println("//end to policy ");
        resultp=(double)(endTimep - startTimep)/1000000000.0;
        System.out.println(resultp);


    }


    public static String computeFileSHA1(String file) throws IOException {
        String sha1 = null;
        MessageDigest digest;
        try {
            digest = MessageDigest.getInstance("SHA-1");
        } catch (NoSuchAlgorithmException e1) {
            throw new IOException("Impossible to get SHA-1 digester", e1);
        }
        try (InputStream input = new FileInputStream(file);
             DigestInputStream digestStream = new DigestInputStream(input, digest)) {
            while (digestStream.read() != -1) {
                // read file stream without buffer
            }
            MessageDigest msgDigest = digestStream.getMessageDigest();
            sha1 = new HexBinaryAdapter().marshal(msgDigest.digest());
        }
        return sha1;
    }
    public static void copyFileUsingFileStreams(String source, String dest)

            throws IOException {

        InputStream input = null;

        OutputStream output = null;

        try {

            input = new FileInputStream(source);

            output = new FileOutputStream(dest);

            byte[] buf = new byte[1024];

            int bytesRead;

            while ((bytesRead = input.read(buf)) > 0) {

                output.write(buf, 0, bytesRead);

            }

        } finally {

            input.close();

            output.close();

        }

    }
}


