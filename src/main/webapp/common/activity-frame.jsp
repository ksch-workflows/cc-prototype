<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>

<%@taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@taglib prefix="h" uri="http://java.sun.com/jsf/html"%>

<%@taglib prefix="t" uri="/WEB-INF/eclnt"%>


<!-- ========== CONTENT BEGIN ========== -->
<f:view>
<h:form>
<f:subview id="common_activity-frameg_sv">
<t:rowbodypane id="g_1" >
<t:row id="g_2" >
<t:coldistance id="g_3" width="25" />
<t:button id="g_4" text="Back" width="50" />
<t:coldistance id="g_5" width="25" />
<t:label id="g_6" font="size:18;weight:bold" text="#{d.ActivityFrameBean.activityName}" />
</t:row>
<t:rowdistance id="g_7" height="20" />
<t:row id="g_8" >
<t:coldistance id="g_9" width="100" />
<t:pagebeaninclude id="g_10" pagebeanbinding="#{d.ActivityFrameBean.activity}" />
</t:row>
</t:rowbodypane>
<t:pageaddons id="g_pa"/>
</f:subview>
</h:form>
</f:view>
<!-- ========== CONTENT END ========== -->
