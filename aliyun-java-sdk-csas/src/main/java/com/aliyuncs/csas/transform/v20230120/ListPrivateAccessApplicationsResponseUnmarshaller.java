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

import com.aliyuncs.csas.model.v20230120.ListPrivateAccessApplicationsResponse;
import com.aliyuncs.csas.model.v20230120.ListPrivateAccessApplicationsResponse.Application;
import com.aliyuncs.csas.model.v20230120.ListPrivateAccessApplicationsResponse.Application.PortRange;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListPrivateAccessApplicationsResponseUnmarshaller {

	public static ListPrivateAccessApplicationsResponse unmarshall(ListPrivateAccessApplicationsResponse listPrivateAccessApplicationsResponse, UnmarshallerContext _ctx) {
		
		listPrivateAccessApplicationsResponse.setRequestId(_ctx.stringValue("ListPrivateAccessApplicationsResponse.RequestId"));
		listPrivateAccessApplicationsResponse.setTotalNum(_ctx.integerValue("ListPrivateAccessApplicationsResponse.TotalNum"));

		List<Application> applications = new ArrayList<Application>();
		for (int i = 0; i < _ctx.lengthValue("ListPrivateAccessApplicationsResponse.Applications.Length"); i++) {
			Application application = new Application();
			application.setApplicationId(_ctx.stringValue("ListPrivateAccessApplicationsResponse.Applications["+ i +"].ApplicationId"));
			application.setName(_ctx.stringValue("ListPrivateAccessApplicationsResponse.Applications["+ i +"].Name"));
			application.setDescription(_ctx.stringValue("ListPrivateAccessApplicationsResponse.Applications["+ i +"].Description"));
			application.setBizProtocol(_ctx.stringValue("ListPrivateAccessApplicationsResponse.Applications["+ i +"].Protocol"));
			application.setStatus(_ctx.stringValue("ListPrivateAccessApplicationsResponse.Applications["+ i +"].Status"));
			application.setCreateTime(_ctx.stringValue("ListPrivateAccessApplicationsResponse.Applications["+ i +"].CreateTime"));
			application.setBrowserAccessStatus(_ctx.stringValue("ListPrivateAccessApplicationsResponse.Applications["+ i +"].BrowserAccessStatus"));
			application.setL7ProxyDomainAutomatic(_ctx.stringValue("ListPrivateAccessApplicationsResponse.Applications["+ i +"].L7ProxyDomainAutomatic"));
			application.setL7ProxyDomainCustom(_ctx.stringValue("ListPrivateAccessApplicationsResponse.Applications["+ i +"].L7ProxyDomainCustom"));

			List<String> addresses = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListPrivateAccessApplicationsResponse.Applications["+ i +"].Addresses.Length"); j++) {
				addresses.add(_ctx.stringValue("ListPrivateAccessApplicationsResponse.Applications["+ i +"].Addresses["+ j +"]"));
			}
			application.setAddresses(addresses);

			List<String> tagIds = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListPrivateAccessApplicationsResponse.Applications["+ i +"].TagIds.Length"); j++) {
				tagIds.add(_ctx.stringValue("ListPrivateAccessApplicationsResponse.Applications["+ i +"].TagIds["+ j +"]"));
			}
			application.setTagIds(tagIds);

			List<String> policyIds = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListPrivateAccessApplicationsResponse.Applications["+ i +"].PolicyIds.Length"); j++) {
				policyIds.add(_ctx.stringValue("ListPrivateAccessApplicationsResponse.Applications["+ i +"].PolicyIds["+ j +"]"));
			}
			application.setPolicyIds(policyIds);

			List<String> connectorIds = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListPrivateAccessApplicationsResponse.Applications["+ i +"].ConnectorIds.Length"); j++) {
				connectorIds.add(_ctx.stringValue("ListPrivateAccessApplicationsResponse.Applications["+ i +"].ConnectorIds["+ j +"]"));
			}
			application.setConnectorIds(connectorIds);

			List<PortRange> portRanges = new ArrayList<PortRange>();
			for (int j = 0; j < _ctx.lengthValue("ListPrivateAccessApplicationsResponse.Applications["+ i +"].PortRanges.Length"); j++) {
				PortRange portRange = new PortRange();
				portRange.setBegin(_ctx.integerValue("ListPrivateAccessApplicationsResponse.Applications["+ i +"].PortRanges["+ j +"].Begin"));
				portRange.setEnd(_ctx.integerValue("ListPrivateAccessApplicationsResponse.Applications["+ i +"].PortRanges["+ j +"].End"));

				portRanges.add(portRange);
			}
			application.setPortRanges(portRanges);

			applications.add(application);
		}
		listPrivateAccessApplicationsResponse.setApplications(applications);
	 
	 	return listPrivateAccessApplicationsResponse;
	}
}