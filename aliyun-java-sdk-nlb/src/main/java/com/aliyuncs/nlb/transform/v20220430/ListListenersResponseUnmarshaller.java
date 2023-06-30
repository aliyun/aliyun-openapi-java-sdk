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

package com.aliyuncs.nlb.transform.v20220430;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.nlb.model.v20220430.ListListenersResponse;
import com.aliyuncs.nlb.model.v20220430.ListListenersResponse.ListenerInfo;
import com.aliyuncs.nlb.model.v20220430.ListListenersResponse.ListenerInfo.TagModels;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListListenersResponseUnmarshaller {

	public static ListListenersResponse unmarshall(ListListenersResponse listListenersResponse, UnmarshallerContext _ctx) {
		
		listListenersResponse.setRequestId(_ctx.stringValue("ListListenersResponse.RequestId"));
		listListenersResponse.setSuccess(_ctx.booleanValue("ListListenersResponse.Success"));
		listListenersResponse.setCode(_ctx.stringValue("ListListenersResponse.Code"));
		listListenersResponse.setMessage(_ctx.stringValue("ListListenersResponse.Message"));
		listListenersResponse.setHttpStatusCode(_ctx.integerValue("ListListenersResponse.HttpStatusCode"));
		listListenersResponse.setDynamicCode(_ctx.stringValue("ListListenersResponse.DynamicCode"));
		listListenersResponse.setDynamicMessage(_ctx.stringValue("ListListenersResponse.DynamicMessage"));
		listListenersResponse.setTotalCount(_ctx.integerValue("ListListenersResponse.TotalCount"));
		listListenersResponse.setNextToken(_ctx.stringValue("ListListenersResponse.NextToken"));
		listListenersResponse.setMaxResults(_ctx.integerValue("ListListenersResponse.MaxResults"));

		List<ListenerInfo> listeners = new ArrayList<ListenerInfo>();
		for (int i = 0; i < _ctx.lengthValue("ListListenersResponse.Listeners.Length"); i++) {
			ListenerInfo listenerInfo = new ListenerInfo();
			listenerInfo.setLoadBalancerId(_ctx.stringValue("ListListenersResponse.Listeners["+ i +"].LoadBalancerId"));
			listenerInfo.setListenerId(_ctx.stringValue("ListListenersResponse.Listeners["+ i +"].ListenerId"));
			listenerInfo.setListenerProtocol(_ctx.stringValue("ListListenersResponse.Listeners["+ i +"].ListenerProtocol"));
			listenerInfo.setListenerPort(_ctx.integerValue("ListListenersResponse.Listeners["+ i +"].ListenerPort"));
			listenerInfo.setStartPort(_ctx.stringValue("ListListenersResponse.Listeners["+ i +"].StartPort"));
			listenerInfo.setEndPort(_ctx.stringValue("ListListenersResponse.Listeners["+ i +"].EndPort"));
			listenerInfo.setListenerDescription(_ctx.stringValue("ListListenersResponse.Listeners["+ i +"].ListenerDescription"));
			listenerInfo.setServerGroupId(_ctx.stringValue("ListListenersResponse.Listeners["+ i +"].ServerGroupId"));
			listenerInfo.setIdleTimeout(_ctx.integerValue("ListListenersResponse.Listeners["+ i +"].IdleTimeout"));
			listenerInfo.setSecurityPolicyId(_ctx.stringValue("ListListenersResponse.Listeners["+ i +"].SecurityPolicyId"));
			listenerInfo.setCaEnabled(_ctx.booleanValue("ListListenersResponse.Listeners["+ i +"].CaEnabled"));
			listenerInfo.setListenerStatus(_ctx.stringValue("ListListenersResponse.Listeners["+ i +"].ListenerStatus"));
			listenerInfo.setRegionId(_ctx.stringValue("ListListenersResponse.Listeners["+ i +"].RegionId"));
			listenerInfo.setAlpnEnabled(_ctx.booleanValue("ListListenersResponse.Listeners["+ i +"].AlpnEnabled"));
			listenerInfo.setAlpnPolicy(_ctx.stringValue("ListListenersResponse.Listeners["+ i +"].AlpnPolicy"));
			listenerInfo.setSecSensorEnabled(_ctx.booleanValue("ListListenersResponse.Listeners["+ i +"].SecSensorEnabled"));
			listenerInfo.setProxyProtocolEnabled(_ctx.booleanValue("ListListenersResponse.Listeners["+ i +"].ProxyProtocolEnabled"));
			listenerInfo.setCps(_ctx.integerValue("ListListenersResponse.Listeners["+ i +"].Cps"));
			listenerInfo.setMss(_ctx.integerValue("ListListenersResponse.Listeners["+ i +"].Mss"));

			List<String> certificateIds = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListListenersResponse.Listeners["+ i +"].CertificateIds.Length"); j++) {
				certificateIds.add(_ctx.stringValue("ListListenersResponse.Listeners["+ i +"].CertificateIds["+ j +"]"));
			}
			listenerInfo.setCertificateIds(certificateIds);

			List<String> caCertificateIds = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListListenersResponse.Listeners["+ i +"].CaCertificateIds.Length"); j++) {
				caCertificateIds.add(_ctx.stringValue("ListListenersResponse.Listeners["+ i +"].CaCertificateIds["+ j +"]"));
			}
			listenerInfo.setCaCertificateIds(caCertificateIds);

			List<TagModels> tags = new ArrayList<TagModels>();
			for (int j = 0; j < _ctx.lengthValue("ListListenersResponse.Listeners["+ i +"].Tags.Length"); j++) {
				TagModels tagModels = new TagModels();
				tagModels.setKey(_ctx.stringValue("ListListenersResponse.Listeners["+ i +"].Tags["+ j +"].Key"));
				tagModels.setValue(_ctx.stringValue("ListListenersResponse.Listeners["+ i +"].Tags["+ j +"].Value"));

				tags.add(tagModels);
			}
			listenerInfo.setTags(tags);

			listeners.add(listenerInfo);
		}
		listListenersResponse.setListeners(listeners);
	 
	 	return listListenersResponse;
	}
}