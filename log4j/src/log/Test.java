package log;

import org.apache.log4j.Logger;

public class Test {
    public static void main(String[] args) {
        Logger logger=Logger.getLogger(Test.class);
        //设置级别
        logger.debug("debug：查出错误的信息..");
        logger.info("info:错误信息..");
        logger.warn("warn：警告信息..");
        logger.error("error：异常信息..");
        logger.error("fatal:重大错误信息..");

        try{
            System.out.println(1 / 0);
        }catch (Exception e){
            logger.error(e.getMessage());
        }
    }
}
