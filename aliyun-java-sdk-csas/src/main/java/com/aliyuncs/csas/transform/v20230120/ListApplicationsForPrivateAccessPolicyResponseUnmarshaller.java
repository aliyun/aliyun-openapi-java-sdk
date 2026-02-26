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

import com.aliyuncs.csas.model.v20230120.ListApplicationsForPrivateAccessPolicyResponse;
import com.aliyuncs.csas.model.v20230120.ListApplicationsForPrivateAccessPolicyResponse.Policy;
import com.aliyuncs.csas.model.v20230120.ListApplicationsForPrivateAccessPolicyResponse.Policy.Application;
import com.aliyuncs.csas.model.v20230120.ListApplicationsForPrivateAccessPolicyResponse.Policy.Application.PortRange;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListApplicationsForPrivateAccessPolicyResponseUnmarshaller {

	public static ListApplicationsForPrivateAccessPolicyResponse unmarshall(ListApplicationsForPrivateAccessPolicyResponse listApplicationsForPrivateAccessPolicyResponse, UnmarshallerContext _ctx) {
		
		listApplicationsForPrivateAccessPolicyResponse.setRequestId(_ctx.stringValue("ListApplicationsForPrivateAccessPolicyResponse.RequestId"));

		List<Policy> polices = new ArrayList<Policy>();
		for (int i = 0; i < _ctx.lengthValue("ListApplicationsForPrivateAccessPolicyResponse.Polices.Length"); i++) {
			Policy policy = new Policy();
			policy.setPolicyId(_ctx.stringValue("ListApplicationsForPrivateAccessPolicyResponse.Polices["+ i +"].PolicyId"));

			List<Application> applications = new ArrayList<Application>();
			for (int j = 0; j < _ctx.lengthValue("ListApplicationsForPrivateAccessPolicyResponse.Polices["+ i +"].Applications.Length"); j++) {
				Application application = new Application();
				application.setApplicationId(_ctx.stringValue("ListApplicationsForPrivateAccessPolicyResponse.Polices["+ i +"].Applications["+ j +"].ApplicationId"));
				application.setName(_ctx.stringValue("ListApplicationsForPrivateAccessPolicyResponse.Polices["+ i +"].Applications["+ j +"].Name"));
				application.setDescription(_ctx.stringValue("ListApplicationsForPrivateAccessPolicyResponse.Polices["+ i +"].Applications["+ j +"].Description"));
				application.setBizProtocol(_ctx.stringValue("ListApplicationsForPrivateAccessPolicyResponse.Polices["+ i +"].Applications["+ j +"].Protocol"));
				application.setStatus(_ctx.stringValue("ListApplicationsForPrivateAccessPolicyResponse.Polices["+ i +"].Applications["+ j +"].Status"));
				application.setCreateTime(_ctx.stringValue("ListApplicationsForPrivateAccessPolicyResponse.Polices["+ i +"].Applications["+ j +"].CreateTime"));

				List<String> addresses = new ArrayList<String>();
				for (int k = 0; k < _ctx.lengthValue("ListApplicationsForPrivateAccessPolicyResponse.Polices["+ i +"].Applications["+ j +"].Addresses.Length"); k++) {
					addresses.add(_ctx.stringValue("ListApplicationsForPrivateAccessPolicyResponse.Polices["+ i +"].Applications["+ j +"].Addresses["+ k +"]"));
				}
				application.setAddresses(addresses);

				List<PortRange> portRanges = new ArrayList<PortRange>();
				for (int k = 0; k < _ctx.lengthValue("ListApplicationsForPrivateAccessPolicyResponse.Polices["+ i +"].Applications["+ j +"].PortRanges.Length"); k++) {
					PortRange portRange = new PortRange();
					portRange.setBegin(_ctx.integerValue("ListApplicationsForPrivateAccessPolicyResponse.Polices["+ i +"].Applications["+ j +"].PortRanges["+ k +"].Begin"));
					portRange.setEnd(_ctx.integerValue("ListApplicationsForPrivateAccessPolicyResponse.Polices["+ i +"].Applications["+ j +"].PortRanges["+ k +"].End"));

					portRanges.add(portRange);
				}
				application.setPortRanges(portRanges);

				applications.add(application);
			}
			policy.setApplications(applications);

			polices.add(policy);
		}
		listApplicationsForPrivateAccessPolicyResponse.setPolices(polices);
	 
	 	return listApplicationsForPrivateAccessPolicyResponse;
	}
}