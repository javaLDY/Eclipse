package com.shinowit.test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.Node;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;
import org.w3c.dom.NodeList;

public class Dom4j {

	public static void main(String[] args) throws IOException, DocumentException {
		   XMLWriter writer = null;// 声明写XML的对象
           SAXReader reader = new SAXReader();

           OutputFormat format = OutputFormat.createPrettyPrint();
           format.setEncoding("utf-8");// 设置XML文件的编码格式

           String filePath = "d:\\guizhou2.xml";
           File file = new File(filePath);
           
           if (file.exists()) {
               Document document = reader.read(file);// 读取XML文件
               Element root = document.getRootElement();// 得到根节点
               boolean bl = false;
               for (Iterator i = root.elementIterator("scene"); i.hasNext();) {
                   Element student = (Element) i.next();
                   for(int a = 0 ;a<student.content().size();a++){
                	   if(student.content().contains("type")){
                		   System.out.println("sfdsfsd");
                	   }
                   }
                   if (student.attributeValue("type").equals("public")) {
                       // 修改学生sid=001的学生信息
//                	   for(Iterator a = student.elementIterator("type"); i.hasNext();){
//                		   Element itemlist = (Element) a.next();
//                		   if(itemlist.getName().equals("type")){
//                			   System.out.println(itemlist.getName());
//                		   }
//                	   }
                	   student.selectNodes("type");
                	   //List typelist = student.elementIterator("item").selectNodes("type");
                	   System.out.println();
                       student.selectSingleNode("姓名").setText("王五");
                       student.selectSingleNode("年龄").setText("25");
                       	
                       writer = new XMLWriter(new FileWriter(filePath), format);
                       writer.write(document);
                       writer.close();
                       bl = true;
                       break;
                   }
               }
	}
	}
	
}
