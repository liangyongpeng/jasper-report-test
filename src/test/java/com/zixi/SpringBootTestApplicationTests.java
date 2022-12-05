package com.zixi;

import com.zixi.codetest.*;
import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.engine.util.JRLoader;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@SpringBootTest
class SpringBootTestApplicationTests {

    @Test
    public void testJasperReports() throws Exception {

        File inFile = new File("D:\\company-project\\jasper-report\\jasper-report-test-private\\jasper-report-test\\src\\main\\resources\\template\\moreComplexReport.jasper");

        String outFilePath = "D:\\moreComplexReport.pdf";

        Map parameters = new HashMap();
        List resourceList = new ArrayList();
        List dataBeanList = new ArrayList();

       parameters.put("zh_company_name","这是一个测试公司名称参数");
       parameters.put("en_company_name","This is a test company name parameter");
       parameters.put("reprot_no","测 123456789");
       parameters.put("parameter_1","子兮工作室");
       parameters.put("parameter_2","测试A");
       parameters.put("parameter_3","CS01");
       parameters.put("parameter_4","BA0012");
       parameters.put("parameter_5","这里是目标客户");
       parameters.put("approved","子兮");
       parameters.put("checked","子兮");
       parameters.put("inspected","子兮");
       parameters.put("inspection_date","2022\t年\t01  月\t05\t日");
       parameters.put("test_date","2022\t年\t01  月\t06\t日");
       parameters.put("release_date","2022\t年\t01  月\t06\t日");


        TestListVO vo1 = new TestListVO();
        vo1.setEqTableName("测试A");
        vo1.setEqTableSerialNo("123");
        vo1.setEqTableModel("23面");
        vo1.setEqTableAMU("A“XXX");
        vo1.setEqTableCertNo("测试BB");
        vo1.setEqTableInstitute("测试CC");
        vo1.setEqTableUntil("2022年11月16日");

        TestListVO vo2 = new TestListVO();
        vo2.setEqTableName("测试B");
        vo2.setEqTableSerialNo("12654");
        vo2.setEqTableModel("0.5″");
        vo2.setEqTableAMU("CCCXXX");
        vo2.setEqTableCertNo("证书号123456");
        vo2.setEqTableInstitute("某某知名公司");
        vo2.setEqTableUntil("2022年07月19日");

        TestListVO vo3 = new TestListVO();
        vo3.setEqTableName("测试C");
        vo3.setEqTableSerialNo("02154");
        vo3.setEqTableModel("0.61");
        vo3.setEqTableAMU("xxx");
        vo3.setEqTableCertNo("证书号1234456");
        vo3.setEqTableInstitute("某某知名公司");
        vo3.setEqTableUntil("2022年07月19日");


        TestListVO vo4 = new TestListVO();
        vo4.setEqTableName("测试D");
        vo4.setEqTableSerialNo("12678");
        vo4.setEqTableModel("0.5");
        vo4.setEqTableAMU("xx2y");
        vo4.setEqTableCertNo("GFJGJL2042211070569");
        vo4.setEqTableInstitute("证书号2546325");
        vo4.setEqTableUntil("2022年07月19日");

        TestListVO vo5 = new TestListVO();
        vo5.setEqTableName("测试E");
        vo5.setEqTableSerialNo("12694");
        vo5.setEqTableModel("0.5");
        vo5.setEqTableAMU("xadfew");
        vo5.setEqTableCertNo("证书号25462154");
        vo5.setEqTableInstitute("某某知名公司");
        vo5.setEqTableUntil("2022年07月19日");

        TestListVO vo6 = new TestListVO();
        vo6.setEqTableName("测试F");
        vo6.setEqTableSerialNo("56942");
        vo6.setEqTableModel("0.5");
        vo6.setEqTableAMU("2dsv1");
        vo6.setEqTableCertNo("证书号2546325");
        vo6.setEqTableInstitute("某某知名公司");
        vo6.setEqTableUntil("2022年07月19日");

        TestListVO vo7 = new TestListVO();
        vo7.setEqTableName("测试G");
        vo7.setEqTableSerialNo("65482");
        vo7.setEqTableModel("0.5");
        vo7.setEqTableAMU("asqer13");
        vo7.setEqTableCertNo("证书号2546325");
        vo7.setEqTableInstitute("某某知名公司");
        vo7.setEqTableUntil("2022年07月19日");

        dataBeanList.add(vo1);
        dataBeanList.add(vo2);
        dataBeanList.add(vo3);
        dataBeanList.add(vo4);
        dataBeanList.add(vo5);
        dataBeanList.add(vo6);

        parameters.put("result_1","符合要求");
        parameters.put("result_2","符合要求");
        parameters.put("result_3","符合要求");
        parameters.put("result_4","符合要求");
        parameters.put("result_5","符合要求");
        parameters.put("result_6","符合要求");
        parameters.put("result_7","符合要求");
        parameters.put("result_8","符合要求");
        parameters.put("result_9","3");
        parameters.put("result_10","1.0");
        parameters.put("result_11","0.01");
        parameters.put("result_12","4");
        parameters.put("result_13","5");
        parameters.put("result_14","8");
        parameters.put("result_15","0.002");
        parameters.put("result_16","0.002");
        parameters.put("result_17","0.003");
        parameters.put("result_18","0.003");
        parameters.put("result_19","7");
        parameters.put("result_20","8");

        TestListFieldVO testListFieldVO = new TestListFieldVO();
        testListFieldVO.setTableList(new JRBeanCollectionDataSource(dataBeanList));
        resourceList.add(testListFieldVO);
        //填充数据
        // 将JasperPrint已PDF的形式输出
        JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(resourceList);
        JasperReport jasperPath = (JasperReport) JRLoader.loadObject(inFile);
        JasperPrint jasperPrint = JasperFillManager.fillReport(jasperPath,parameters,dataSource);
        //输出文件
        JasperExportManager.exportReportToPdfFile(jasperPrint,outFilePath);
    }

    @Test
    void testReport() throws JRException {

        File inFile = new File("D:\\company-project\\jasper-report\\jasper-report-test-private\\jasper-report-test\\src\\main\\resources\\template\\testReport.jasper");

        String outFilePath = "D:\\testReport.pdf";

        Map parameters = new HashMap();
        List resourceList = new ArrayList();
        List dataBeanList = new ArrayList();

        TestBean bean0 = new TestBean();
        bean0.setNo("001");
        bean0.setAge("20");
        bean0.setName("张三");
        dataBeanList.add(bean0);

        TestBean bean1 = new TestBean();
        bean1.setNo("002");
        bean1.setAge("21");
        bean1.setName("李四");
        dataBeanList.add(bean1);

        TestBean bean2 = new TestBean();
        bean2.setNo("003");
        bean2.setAge("22");
        bean2.setName("王五");
        dataBeanList.add(bean2);

        TestField testField = new TestField();
        testField.setTableList(new JRBeanCollectionDataSource(dataBeanList));
        testField.setHeadNo("L123456789");
        testField.setHeadName("子兮工作室");
        resourceList.add(testField);

        parameters.put("parameter_1","信息统计");
        parameters.put("parameter_2","RabbitMQ是实现了高级消息队列协议（AMQP）的开源消息代理软件（亦称面向消息的中间件）。RabbitMQ服务器是用Erlang语言编写的，而集群和故障转移是构建在开放电信平台框架上的。所有主要的编程语言均有与代理接口通讯的客户端库.");

        // 将JasperPrint已PDF的形式输出
        JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(resourceList);
        JasperReport jasperPath = (JasperReport) JRLoader.loadObject(inFile);
        JasperPrint jasperPrint = JasperFillManager.fillReport(jasperPath,parameters,dataSource);
        //输出文件
        JasperExportManager.exportReportToPdfFile(jasperPrint,outFilePath);


    }


}
