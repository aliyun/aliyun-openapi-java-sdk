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

import com.aliyuncs.alb.model.v20200616.ListListenersResponse;
import com.aliyuncs.alb.model.v20200616.ListListenersResponse.Listener;
import com.aliyuncs.alb.model.v20200616.ListListenersResponse.Listener.DefaultAction;
import com.aliyuncs.alb.model.v20200616.ListListenersResponse.Listener.DefaultAction.ForwardGroupConfig;
import com.aliyuncs.alb.model.v20200616.ListListenersResponse.Listener.DefaultAction.ForwardGroupConfig.ServerGroupTuple;
import com.aliyuncs.alb.model.v20200616.ListListenersResponse.Listener.LogConfig;
import com.aliyuncs.alb.model.v20200616.ListListenersResponse.Listener.LogConfig.AccessLogTracingConfig;
import com.aliyuncs.alb.model.v20200616.ListListenersResponse.Listener.QuicConfig;
import com.aliyuncs.alb.model.v20200616.ListListenersResponse.Listener.XForwardedForConfig;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListListenersResponseUnmarshaller {

	public static ListListenersResponse unmarshall(ListListenersResponse listListenersResponse, UnmarshallerContext _ctx) {
		
		listListenersResponse.setRequestId(_ctx.stringValue("ListListenersResponse.RequestId"));
		listListenersResponse.setMaxResults(_ctx.integerValue("ListListenersResponse.MaxResults"));
		listListenersResponse.setNextToken(_ctx.stringValue("ListListenersResponse.NextToken"));
		listListenersResponse.setTotalCount(_ctx.integerValue("ListListenersResponse.TotalCount"));

		List<Listener> listeners = new ArrayList<Listener>();
		for (int i = 0; i < _ctx.lengthValue("ListListenersResponse.Listeners.Length"); i++) {
			Listener listener = new Listener();
			listener.setGzipEnabled(_ctx.booleanValue("ListListenersResponse.Listeners["+ i +"].GzipEnabled"));
			listener.setHttp2Enabled(_ctx.booleanValue("ListListenersResponse.Listeners["+ i +"].Http2Enabled"));
			listener.setIdleTimeout(_ctx.integerValue("ListListenersResponse.Listeners["+ i +"].IdleTimeout"));
			listener.setListenerDescription(_ctx.stringValue("ListListenersResponse.Listeners["+ i +"].ListenerDescription"));
			listener.setListenerId(_ctx.stringValue("ListListenersResponse.Listeners["+ i +"].ListenerId"));
			listener.setListenerPort(_ctx.integerValue("ListListenersResponse.Listeners["+ i +"].ListenerPort"));
			listener.setListenerProtocol(_ctx.stringValue("ListListenersResponse.Listeners["+ i +"].ListenerProtocol"));
			listener.setListenerStatus(_ctx.stringValue("ListListenersResponse.Listeners["+ i +"].ListenerStatus"));
			listener.setLoadBalancerId(_ctx.stringValue("ListListenersResponse.Listeners["+ i +"].LoadBalancerId"));
			listener.setRequestTimeout(_ctx.integerValue("ListListenersResponse.Listeners["+ i +"].RequestTimeout"));
			listener.setSecurityPolicyId(_ctx.stringValue("ListListenersResponse.Listeners["+ i +"].SecurityPolicyId"));

			LogConfig logConfig = new LogConfig();
			logConfig.setAccessLogRecordCustomizedHeadersEnabled(_ctx.booleanValue("ListListenersResponse.Listeners["+ i +"].LogConfig.AccessLogRecordCustomizedHeadersEnabled"));

			AccessLogTracingConfig accessLogTracingConfig = new AccessLogTracingConfig();
			accessLogTracingConfig.setTracingEnabled(_ctx.booleanValue("ListListenersResponse.Listeners["+ i +"].LogConfig.AccessLogTracingConfig.TracingEnabled"));
			accessLogTracingConfig.setTracingSample(_ctx.integerValue("ListListenersResponse.Listeners["+ i +"].LogConfig.AccessLogTracingConfig.TracingSample"));
			accessLogTracingConfig.setTracingType(_ctx.stringValue("ListListenersResponse.Listeners["+ i +"].LogConfig.AccessLogTracingConfig.TracingType"));
			logConfig.setAccessLogTracingConfig(accessLogTracingConfig);
			listener.setLogConfig(logConfig);

			QuicConfig quicConfig = new QuicConfig();
			quicConfig.setQuicListenerId(_ctx.stringValue("ListListenersResponse.Listeners["+ i +"].QuicConfig.QuicListenerId"));
			quicConfig.setQuicUpgradeEnabled(_ctx.booleanValue("ListListenersResponse.Listeners["+ i +"].QuicConfig.QuicUpgradeEnabled"));
			listener.setQuicConfig(quicConfig);

			XForwardedForConfig xForwardedForConfig = new XForwardedForConfig();
			xForwardedForConfig.setXForwardedForClientCertClientVerifyAlias(_ctx.stringValue("ListListenersResponse.Listeners["+ i +"].XForwardedForConfig.XForwardedForClientCertClientVerifyAlias"));
			xForwardedForConfig.setXForwardedForClientCertClientVerifyEnabled(_ctx.booleanValue("ListListenersResponse.Listeners["+ i +"].XForwardedForConfig.XForwardedForClientCertClientVerifyEnabled"));
			xForwardedForConfig.setXForwardedForClientCertFingerprintAlias(_ctx.stringValue("ListListenersResponse.Listeners["+ i +"].XForwardedForConfig.XForwardedForClientCertFingerprintAlias"));
			xForwardedForConfig.setXForwardedForClientCertFingerprintEnabled(_ctx.booleanValue("ListListenersResponse.Listeners["+ i +"].XForwardedForConfig.XForwardedForClientCertFingerprintEnabled"));
			xForwardedForConfig.setXForwardedForClientCertIssuerDNAlias(_ctx.stringValue("ListListenersResponse.Listeners["+ i +"].XForwardedForConfig.XForwardedForClientCertIssuerDNAlias"));
			xForwardedForConfig.setXForwardedForClientCertIssuerDNEnabled(_ctx.booleanValue("ListListenersResponse.Listeners["+ i +"].XForwardedForConfig.XForwardedForClientCertIssuerDNEnabled"));
			xForwardedForConfig.setXForwardedForClientCertSubjectDNAlias(_ctx.stringValue("ListListenersResponse.Listeners["+ i +"].XForwardedForConfig.XForwardedForClientCertSubjectDNAlias"));
			xForwardedForConfig.setXForwardedForClientCertSubjectDNEnabled(_ctx.booleanValue("ListListenersResponse.Listeners["+ i +"].XForwardedForConfig.XForwardedForClientCertSubjectDNEnabled"));
			xForwardedForConfig.setXForwardedForClientSrcPortEnabled(_ctx.booleanValue("ListListenersResponse.Listeners["+ i +"].XForwardedForConfig.XForwardedForClientSrcPortEnabled"));
			xForwardedForConfig.setXForwardedForEnabled(_ctx.booleanValue("ListListenersResponse.Listeners["+ i +"].XForwardedForConfig.XForwardedForEnabled"));
			xForwardedForConfig.setXForwardedForProtoEnabled(_ctx.booleanValue("ListListenersResponse.Listeners["+ i +"].XForwardedForConfig.XForwardedForProtoEnabled"));
			xForwardedForConfig.setXForwardedForSLBIdEnabled(_ctx.booleanValue("ListListenersResponse.Listeners["+ i +"].XForwardedForConfig.XForwardedForSLBIdEnabled"));
			xForwardedForConfig.setXForwardedForSLBPortEnabled(_ctx.booleanValue("ListListenersResponse.Listeners["+ i +"].XForwardedForConfig.XForwardedForSLBPortEnabled"));
			listener.setXForwardedForConfig(xForwardedForConfig);

			List<DefaultAction> defaultActions = new ArrayList<DefaultAction>();
			for (int j = 0; j < _ctx.lengthValue("ListListenersResponse.Listeners["+ i +"].DefaultActions.Length"); j++) {
				DefaultAction defaultAction = new DefaultAction();
				defaultAction.setType(_ctx.stringValue("ListListenersResponse.Listeners["+ i +"].DefaultActions["+ j +"].Type"));

				ForwardGroupConfig forwardGroupConfig = new ForwardGroupConfig();

				List<ServerGroupTuple> serverGroupTuples = new ArrayList<ServerGroupTuple>();
				for (int k = 0; k < _ctx.lengthValue("ListListenersResponse.Listeners["+ i +"].DefaultActions["+ j +"].ForwardGroupConfig.ServerGroupTuples.Length"); k++) {
					ServerGroupTuple serverGroupTuple = new ServerGroupTuple();
					serverGroupTuple.setServerGroupId(_ctx.stringValue("ListListenersResponse.Listeners["+ i +"].DefaultActions["+ j +"].ForwardGroupConfig.ServerGroupTuples["+ k +"].ServerGroupId"));

					serverGroupTuples.add(serverGroupTuple);
				}
				forwardGroupConfig.setServerGroupTuples(serverGroupTuples);
				defaultAction.setForwardGroupConfig(forwardGroupConfig);

				defaultActions.add(defaultAction);
			}
			listener.setDefaultActions(defaultActions);

			listeners.add(listener);
		}
		listListenersResponse.setListeners(listeners);
	 
	 	return listListenersResponse;
	}
}