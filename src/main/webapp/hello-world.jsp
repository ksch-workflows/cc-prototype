<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>

<%@taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@taglib prefix="h" uri="http://java.sun.com/jsf/html"%>

<%@taglib prefix="t" uri="/WEB-INF/eclnt"%>


<!-- ========== CONTENT BEGIN ========== -->
<f:view>
<h:form>
<f:subview id="hello-worldg_sv">
<t:rowtitlebar id="g_1" text="Hello, World!" />
<t:rowheader id="g_2" />
<t:rowbodypane id="g_3" >
<t:row id="g_6" >
<t:label id="g_9" text="#{d.HelloWorld.name}" />
<t:button id="g_7" actionListener="#{d.HelloWorld.onHello}" text="button" />
</t:row>
</t:rowbodypane>
<t:rowstatusbar id="g_4" />
<t:pageaddons id="g_pa"/>
</f:subview>
</h:form>
</f:view>
<!-- ========== CONTENT END ========== -->
