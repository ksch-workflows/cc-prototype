<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>

<%@taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@taglib prefix="h" uri="http://java.sun.com/jsf/html"%>

<%@taglib prefix="t" uri="/WEB-INF/eclnt"%>


<!-- ========== CONTENT BEGIN ========== -->
<f:view>
<h:form>
<f:subview id="common_headerg_sv">
<t:rowheader id="g_1" background="#7f7f7f" >
<t:button id="g_2" actionListener="#{d.common.Header.onHomeButtonClicked}" text="Home" />
<t:coldistance id="g_3" width="100%" />
<t:button id="g_4" actionListener="#{d.common.Header.onLogoutButtonClicked}" text="Logout" />
</t:rowheader>
<t:pageaddons id="g_pa"/>
</f:subview>
</h:form>
</f:view>
<!-- ========== CONTENT END ========== -->
