/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.alb.transform.v20200616;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.alb.model.v20200616.GetListenerAttributeResponse;
import com.aliyuncs.alb.model.v20200616.GetListenerAttributeResponse.AclConfig;
import com.aliyuncs.alb.model.v20200616.GetListenerAttributeResponse.AclConfig.AclRelation;
import com.aliyuncs.alb.model.v20200616.GetListenerAttributeResponse.Certificate;
import com.aliyuncs.alb.model.v20200616.GetListenerAttributeResponse.DefaultAction;
import com.aliyuncs.alb.model.v20200616.GetListenerAttributeResponse.DefaultAction.ForwardGroupConfig;
import com.aliyuncs.alb.model.v20200616.GetListenerAttributeResponse.DefaultAction.ForwardGroupConfig.ServerGroupTuple;
import com.aliyuncs.alb.model.v20200616.GetListenerAttributeResponse.LogConfig;
import com.aliyuncs.alb.model.v20200616.GetListenerAttributeResponse.LogConfig.AccessLogTracingConfig;
import com.aliyuncs.alb.model.v20200616.GetListenerAttributeResponse.QuicConfig;
import com.aliyuncs.alb.model.v20200616.GetListenerAttributeResponse.XForwardedForConfig;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetListenerAttributeResponseUnmarshaller {

	public static GetListenerAttributeResponse unmarshall(GetListenerAttributeResponse getListenerAttributeResponse, UnmarshallerContext _ctx) {
		
		getListenerAttributeResponse.setRequestId(_ctx.stringValue("GetListenerAttributeResponse.RequestId"));
		getListenerAttributeResponse.setCaEnabled(_ctx.booleanValue("GetListenerAttributeResponse.CaEnabled"));
		getListenerAttributeResponse.setGzipEnabled(_ctx.booleanValue("GetListenerAttributeResponse.GzipEnabled"));
		getListenerAttributeResponse.setHttp2Enabled(_ctx.booleanValue("GetListenerAttributeResponse.Http2Enabled"));
		getListenerAttributeResponse.setIdleTimeout(_ctx.integerValue("GetListenerAttributeResponse.IdleTimeout"));
		getListenerAttributeResponse.setListenerDescription(_ctx.stringValue("GetListenerAttributeResponse.ListenerDescription"));
		getListenerAttributeResponse.setListenerId(_ctx.stringValue("GetListenerAttributeResponse.ListenerId"));
		getListenerAttributeResponse.setListenerPort(_ctx.integerValue("GetListenerAttributeResponse.ListenerPort"));
		getListenerAttributeResponse.setListenerProtocol(_ctx.stringValue("GetListenerAttributeResponse.ListenerProtocol"));
		getListenerAttributeResponse.setListenerStatus(_ctx.stringValue("GetListenerAttributeResponse.ListenerStatus"));
		getListenerAttributeResponse.setLoadBalancerId(_ctx.stringValue("GetListenerAttributeResponse.LoadBalancerId"));
		getListenerAttributeResponse.setRequestTimeout(_ctx.integerValue("GetListenerAttributeResponse.RequestTimeout"));
		getListenerAttributeResponse.setSecurityPolicyId(_ctx.stringValue("GetListenerAttributeResponse.SecurityPolicyId"));

		AclConfig aclConfig = new AclConfig();
		aclConfig.setAclType(_ctx.stringValue("GetListenerAttributeResponse.AclConfig.AclType"));

		List<AclRelation> aclRelations = new ArrayList<AclRelation>();
		for (int i = 0; i < _ctx.lengthValue("GetListenerAttributeResponse.AclConfig.AclRelations.Length"); i++) {
			AclRelation aclRelation = new AclRelation();
			aclRelation.setAclId(_ctx.stringValue("GetListenerAttributeResponse.AclConfig.AclRelations["+ i +"].AclId"));
			aclRelation.setStatus(_ctx.stringValue("GetListenerAttributeResponse.AclConfig.AclRelations["+ i +"].Status"));

			aclRelations.add(aclRelation);
		}
		aclConfig.setAclRelations(aclRelations);
		getListenerAttributeResponse.setAclConfig(aclConfig);

		LogConfig logConfig = new LogConfig();
		logConfig.setAccessLogRecordCustomizedHeadersEnabled(_ctx.booleanValue("GetListenerAttributeResponse.LogConfig.AccessLogRecordCustomizedHeadersEnabled"));

		AccessLogTracingConfig accessLogTracingConfig = new AccessLogTracingConfig();
		accessLogTracingConfig.setTracingEnabled(_ctx.booleanValue("GetListenerAttributeResponse.LogConfig.AccessLogTracingConfig.TracingEnabled"));
		accessLogTracingConfig.setTracingSample(_ctx.integerValue("GetListenerAttributeResponse.LogConfig.AccessLogTracingConfig.TracingSample"));
		accessLogTracingConfig.setTracingType(_ctx.stringValue("GetListenerAttributeResponse.LogConfig.AccessLogTracingConfig.TracingType"));
		logConfig.setAccessLogTracingConfig(accessLogTracingConfig);
		getListenerAttributeResponse.setLogConfig(logConfig);

		QuicConfig quicConfig = new QuicConfig();
		quicConfig.setQuicListenerId(_ctx.stringValue("GetListenerAttributeResponse.QuicConfig.QuicListenerId"));
		quicConfig.setQuicUpgradeEnabled(_ctx.booleanValue("GetListenerAttributeResponse.QuicConfig.QuicUpgradeEnabled"));
		getListenerAttributeResponse.setQuicConfig(quicConfig);

		XForwardedForConfig xForwardedForConfig = new XForwardedForConfig();
		xForwardedForConfig.setXForwardedForClientCertClientVerifyAlias(_ctx.stringValue("GetListenerAttributeResponse.XForwardedForConfig.XForwardedForClientCertClientVerifyAlias"));
		xForwardedForConfig.setXForwardedForClientCertClientVerifyEnabled(_ctx.booleanValue("GetListenerAttributeResponse.XForwardedForConfig.XForwardedForClientCertClientVerifyEnabled"));
		xForwardedForConfig.setXForwardedForClientCertFingerprintAlias(_ctx.stringValue("GetListenerAttributeResponse.XForwardedForConfig.XForwardedForClientCertFingerprintAlias"));
		xForwardedForConfig.setXForwardedForClientCertFingerprintEnabled(_ctx.booleanValue("GetListenerAttributeResponse.XForwardedForConfig.XForwardedForClientCertFingerprintEnabled"));
		xForwardedForConfig.setXForwardedForClientCertIssuerDNAlias(_ctx.stringValue("GetListenerAttributeResponse.XForwardedForConfig.XForwardedForClientCertIssuerDNAlias"));
		xForwardedForConfig.setXForwardedForClientCertIssuerDNEnabled(_ctx.booleanValue("GetListenerAttributeResponse.XForwardedForConfig.XForwardedForClientCertIssuerDNEnabled"));
		xForwardedForConfig.setXForwardedForClientCertSubjectDNAlias(_ctx.stringValue("GetListenerAttributeResponse.XForwardedForConfig.XForwardedForClientCertSubjectDNAlias"));
		xForwardedForConfig.setXForwardedForClientCertSubjectDNEnabled(_ctx.booleanValue("GetListenerAttributeResponse.XForwardedForConfig.XForwardedForClientCertSubjectDNEnabled"));
		xForwardedForConfig.setXForwardedForClientSrcPortEnabled(_ctx.booleanValue("GetListenerAttributeResponse.XForwardedForConfig.XForwardedForClientSrcPortEnabled"));
		xForwardedForConfig.setXForwardedForEnabled(_ctx.booleanValue("GetListenerAttributeResponse.XForwardedForConfig.XForwardedForEnabled"));
		xForwardedForConfig.setXForwardedForProtoEnabled(_ctx.booleanValue("GetListenerAttributeResponse.XForwardedForConfig.XForwardedForProtoEnabled"));
		xForwardedForConfig.setXForwardedForSLBIdEnabled(_ctx.booleanValue("GetListenerAttributeResponse.XForwardedForConfig.XForwardedForSLBIdEnabled"));
		xForwardedForConfig.setXForwardedForSLBPortEnabled(_ctx.booleanValue("GetListenerAttributeResponse.XForwardedForConfig.XForwardedForSLBPortEnabled"));
		getListenerAttributeResponse.setXForwardedForConfig(xForwardedForConfig);

		List<Certificate> certificates = new ArrayList<Certificate>();
		for (int i = 0; i < _ctx.lengthValue("GetListenerAttributeResponse.Certificates.Length"); i++) {
			Certificate certificate = new Certificate();
			certificate.setCertificateId(_ctx.stringValue("GetListenerAttributeResponse.Certificates["+ i +"].CertificateId"));

			certificates.add(certificate);
		}
		getListenerAttributeResponse.setCertificates(certificates);

		List<DefaultAction> defaultActions = new ArrayList<DefaultAction>();
		for (int i = 0; i < _ctx.lengthValue("GetListenerAttributeResponse.DefaultActions.Length"); i++) {
			DefaultAction defaultAction = new DefaultAction();
			defaultAction.setType(_ctx.stringValue("GetListenerAttributeResponse.DefaultActions["+ i +"].Type"));

			ForwardGroupConfig forwardGroupConfig = new ForwardGroupConfig();

			List<ServerGroupTuple> serverGroupTuples = new ArrayList<ServerGroupTuple>();
			for (int j = 0; j < _ctx.lengthValue("GetListenerAttributeResponse.DefaultActions["+ i +"].ForwardGroupConfig.ServerGroupTuples.Length"); j++) {
				ServerGroupTuple serverGroupTuple = new ServerGroupTuple();
				serverGroupTuple.setServerGroupId(_ctx.stringValue("GetListenerAttributeResponse.DefaultActions["+ i +"].ForwardGroupConfig.ServerGroupTuples["+ j +"].ServerGroupId"));

				serverGroupTuples.add(serverGroupTuple);
			}
			forwardGroupConfig.setServerGroupTuples(serverGroupTuples);
			defaultAction.setForwardGroupConfig(forwardGroupConfig);

			defaultActions.add(defaultAction);
		}
		getListenerAttributeResponse.setDefaultActions(defaultActions);
	 
	 	return getListenerAttributeResponse;
	}
}