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

import com.aliyuncs.nlb.model.v20220430.GetListenerAttributeResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetListenerAttributeResponseUnmarshaller {

	public static GetListenerAttributeResponse unmarshall(GetListenerAttributeResponse getListenerAttributeResponse, UnmarshallerContext _ctx) {
		
		getListenerAttributeResponse.setRequestId(_ctx.stringValue("GetListenerAttributeResponse.RequestId"));
		getListenerAttributeResponse.setSuccess(_ctx.booleanValue("GetListenerAttributeResponse.Success"));
		getListenerAttributeResponse.setCode(_ctx.stringValue("GetListenerAttributeResponse.Code"));
		getListenerAttributeResponse.setMessage(_ctx.stringValue("GetListenerAttributeResponse.Message"));
		getListenerAttributeResponse.setHttpStatusCode(_ctx.integerValue("GetListenerAttributeResponse.HttpStatusCode"));
		getListenerAttributeResponse.setDynamicCode(_ctx.stringValue("GetListenerAttributeResponse.DynamicCode"));
		getListenerAttributeResponse.setDynamicMessage(_ctx.stringValue("GetListenerAttributeResponse.DynamicMessage"));
		getListenerAttributeResponse.setRegionId(_ctx.stringValue("GetListenerAttributeResponse.RegionId"));
		getListenerAttributeResponse.setLoadBalancerId(_ctx.stringValue("GetListenerAttributeResponse.LoadBalancerId"));
		getListenerAttributeResponse.setListenerId(_ctx.stringValue("GetListenerAttributeResponse.ListenerId"));
		getListenerAttributeResponse.setListenerProtocol(_ctx.stringValue("GetListenerAttributeResponse.ListenerProtocol"));
		getListenerAttributeResponse.setListenerPort(_ctx.integerValue("GetListenerAttributeResponse.ListenerPort"));
		getListenerAttributeResponse.setStartPort(_ctx.stringValue("GetListenerAttributeResponse.StartPort"));
		getListenerAttributeResponse.setEndPort(_ctx.stringValue("GetListenerAttributeResponse.EndPort"));
		getListenerAttributeResponse.setListenerDescription(_ctx.stringValue("GetListenerAttributeResponse.ListenerDescription"));
		getListenerAttributeResponse.setServerGroupId(_ctx.stringValue("GetListenerAttributeResponse.ServerGroupId"));
		getListenerAttributeResponse.setIdleTimeout(_ctx.integerValue("GetListenerAttributeResponse.IdleTimeout"));
		getListenerAttributeResponse.setSecurityPolicyId(_ctx.stringValue("GetListenerAttributeResponse.SecurityPolicyId"));
		getListenerAttributeResponse.setCaEnabled(_ctx.booleanValue("GetListenerAttributeResponse.CaEnabled"));
		getListenerAttributeResponse.setAlpnEnabled(_ctx.booleanValue("GetListenerAttributeResponse.AlpnEnabled"));
		getListenerAttributeResponse.setAlpnPolicy(_ctx.stringValue("GetListenerAttributeResponse.AlpnPolicy"));
		getListenerAttributeResponse.setProxyProtocolEnabled(_ctx.booleanValue("GetListenerAttributeResponse.ProxyProtocolEnabled"));
		getListenerAttributeResponse.setSecSensorEnabled(_ctx.booleanValue("GetListenerAttributeResponse.SecSensorEnabled"));
		getListenerAttributeResponse.setListenerStatus(_ctx.stringValue("GetListenerAttributeResponse.ListenerStatus"));
		getListenerAttributeResponse.setCps(_ctx.integerValue("GetListenerAttributeResponse.Cps"));
		getListenerAttributeResponse.setMss(_ctx.integerValue("GetListenerAttributeResponse.Mss"));

		List<String> certificateIds = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetListenerAttributeResponse.CertificateIds.Length"); i++) {
			certificateIds.add(_ctx.stringValue("GetListenerAttributeResponse.CertificateIds["+ i +"]"));
		}
		getListenerAttributeResponse.setCertificateIds(certificateIds);

		List<String> caCertificateIds = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetListenerAttributeResponse.CaCertificateIds.Length"); i++) {
			caCertificateIds.add(_ctx.stringValue("GetListenerAttributeResponse.CaCertificateIds["+ i +"]"));
		}
		getListenerAttributeResponse.setCaCertificateIds(caCertificateIds);
	 
	 	return getListenerAttributeResponse;
	}
}