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

package com.aliyuncs.csas.transform.v20230120;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.csas.model.v20230120.GetPrivateAccessApplicationResponse;
import com.aliyuncs.csas.model.v20230120.GetPrivateAccessApplicationResponse.Application;
import com.aliyuncs.csas.model.v20230120.GetPrivateAccessApplicationResponse.Application.PortRange;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetPrivateAccessApplicationResponseUnmarshaller {

	public static GetPrivateAccessApplicationResponse unmarshall(GetPrivateAccessApplicationResponse getPrivateAccessApplicationResponse, UnmarshallerContext _ctx) {
		
		getPrivateAccessApplicationResponse.setRequestId(_ctx.stringValue("GetPrivateAccessApplicationResponse.RequestId"));

		Application application = new Application();
		application.setApplicationId(_ctx.stringValue("GetPrivateAccessApplicationResponse.Application.ApplicationId"));
		application.setName(_ctx.stringValue("GetPrivateAccessApplicationResponse.Application.Name"));
		application.setDescription(_ctx.stringValue("GetPrivateAccessApplicationResponse.Application.Description"));
		application.setBizProtocol(_ctx.stringValue("GetPrivateAccessApplicationResponse.Application.Protocol"));
		application.setStatus(_ctx.stringValue("GetPrivateAccessApplicationResponse.Application.Status"));
		application.setCreateTime(_ctx.stringValue("GetPrivateAccessApplicationResponse.Application.CreateTime"));
		application.setBrowserAccessStatus(_ctx.stringValue("GetPrivateAccessApplicationResponse.Application.BrowserAccessStatus"));
		application.setL7ProxyDomainAutomatic(_ctx.stringValue("GetPrivateAccessApplicationResponse.Application.L7ProxyDomainAutomatic"));
		application.setL7ProxyDomainCustom(_ctx.stringValue("GetPrivateAccessApplicationResponse.Application.L7ProxyDomainCustom"));

		List<String> addresses = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetPrivateAccessApplicationResponse.Application.Addresses.Length"); i++) {
			addresses.add(_ctx.stringValue("GetPrivateAccessApplicationResponse.Application.Addresses["+ i +"]"));
		}
		application.setAddresses(addresses);

		List<String> tagIds = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetPrivateAccessApplicationResponse.Application.TagIds.Length"); i++) {
			tagIds.add(_ctx.stringValue("GetPrivateAccessApplicationResponse.Application.TagIds["+ i +"]"));
		}
		application.setTagIds(tagIds);

		List<String> policyIds = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetPrivateAccessApplicationResponse.Application.PolicyIds.Length"); i++) {
			policyIds.add(_ctx.stringValue("GetPrivateAccessApplicationResponse.Application.PolicyIds["+ i +"]"));
		}
		application.setPolicyIds(policyIds);

		List<String> connectorIds = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetPrivateAccessApplicationResponse.Application.ConnectorIds.Length"); i++) {
			connectorIds.add(_ctx.stringValue("GetPrivateAccessApplicationResponse.Application.ConnectorIds["+ i +"]"));
		}
		application.setConnectorIds(connectorIds);

		List<PortRange> portRanges = new ArrayList<PortRange>();
		for (int i = 0; i < _ctx.lengthValue("GetPrivateAccessApplicationResponse.Application.PortRanges.Length"); i++) {
			PortRange portRange = new PortRange();
			portRange.setBegin(_ctx.integerValue("GetPrivateAccessApplicationResponse.Application.PortRanges["+ i +"].Begin"));
			portRange.setEnd(_ctx.integerValue("GetPrivateAccessApplicationResponse.Application.PortRanges["+ i +"].End"));

			portRanges.add(portRange);
		}
		application.setPortRanges(portRanges);
		getPrivateAccessApplicationResponse.setApplication(application);
	 
	 	return getPrivateAccessApplicationResponse;
	}
}