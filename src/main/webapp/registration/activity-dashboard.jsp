<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>

<%@taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@taglib prefix="h" uri="http://java.sun.com/jsf/html"%>

<%@taglib prefix="t" uri="/WEB-INF/eclnt"%>


<!-- ========== CONTENT BEGIN ========== -->
<f:view>
<h:form>
<f:subview id="registration_activity-dashboardg_sv">
<t:rowbodypane id="g_1" >
<t:row id="g_2" coldistance="20" >
<t:button id="g_3" actionListener="#{d.ApplicationFrameBean.onStartActivity}" clientname="register-patient" height="200" rounding="10" text="Register patient" verticaltextposition="top" width="200" />
<t:button id="g_4" actionListener="#{d.ApplicationFrameBean.onStartActivity}" clientname="receive-payment" height="200" rounding="10" text="Receive payment" width="200" />
</t:row>
</t:rowbodypane>
<t:pageaddons id="g_pa"/>
</f:subview>
</h:form>
</f:view>
<!-- ========== CONTENT END ========== -->
