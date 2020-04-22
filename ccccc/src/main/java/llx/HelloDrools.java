package llx;

import org.drools.core.base.RuleNameEndsWithAgendaFilter;
import org.drools.core.base.RuleNameEqualsAgendaFilter;
import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;



public class HelloDrools {

    public static void main(String[] args) {

        KieServices kieServices = KieServices.Factory.get();
        KieContainer kieContainer = kieServices.getKieClasspathContainer();

        //helloWorldSession  应该是指向的Kmodule.xml中的ksession name
        KieSession kieSession = kieContainer.newKieSession("helloWorldSession");
        lzy.Message message = new lzy.Message();
        message.setId("123");
        message.setName("haha");
        kieSession.insert(message);
        //执行规则
        //  精确 寻找 校验规则。
        //int i = kieSession.fireAllRules(new RuleNameEqualsAgendaFilter("hello2"));//fire:火

        //执行所有规则
        //int i = kieSession.fireAllRules();//fire:火

        //执行所有o2结尾的规则
        int i = kieSession.fireAllRules(new RuleNameEndsWithAgendaFilter("o2"));//fire:火
        System.out.println("========"+i); // i  等于 执行了几个规则
        kieSession.dispose();
    }
}
