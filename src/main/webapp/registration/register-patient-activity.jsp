<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>

<%@taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@taglib prefix="h" uri="http://java.sun.com/jsf/html"%>

<%@taglib prefix="t" uri="/WEB-INF/eclnt"%>


<!-- ========== CONTENT BEGIN ========== -->
<f:view>
<h:form>
<f:subview id="registration_register-patient-activityg_sv">
<t:row id="g_1" >
<t:pane id="g_2" width="100%" >
<t:row id="g_3" >
<t:button id="g_4" text="Add new patient" />
<t:coldistance id="g_5" width="100%" />
<t:field id="g_6" width="150" />
<t:coldistance id="g_7" />
<t:button id="g_8" text="Search" />
</t:row>
<t:rowdistance id="g_9" height="15" />
<t:row id="g_10" >
<t:fixgrid id="g_11" objectbinding="#{tobedfined}" width="100%" >
<t:gridcol id="g_12" text="Column" width="100" />
</t:fixgrid>
</t:row>
</t:pane>
</t:row>
<t:pageaddons id="g_pa"/>
</f:subview>
</h:form>
</f:view>
<!-- ========== CONTENT END ========== -->
