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

package com.aliyuncs.resourcemanager.transform.v20200331;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.resourcemanager.model.v20200331.ListDelegatedServicesForAccountResponse;
import com.aliyuncs.resourcemanager.model.v20200331.ListDelegatedServicesForAccountResponse.DelegatedService;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListDelegatedServicesForAccountResponseUnmarshaller {

	public static ListDelegatedServicesForAccountResponse unmarshall(ListDelegatedServicesForAccountResponse listDelegatedServicesForAccountResponse, UnmarshallerContext _ctx) {
		
		listDelegatedServicesForAccountResponse.setRequestId(_ctx.stringValue("ListDelegatedServicesForAccountResponse.RequestId"));

		List<DelegatedService> delegatedServices = new ArrayList<DelegatedService>();
		for (int i = 0; i < _ctx.lengthValue("ListDelegatedServicesForAccountResponse.DelegatedServices.Length"); i++) {
			DelegatedService delegatedService = new DelegatedService();
			delegatedService.setDelegationEnabledTime(_ctx.stringValue("ListDelegatedServicesForAccountResponse.DelegatedServices["+ i +"].DelegationEnabledTime"));
			delegatedService.setServicePrincipal(_ctx.stringValue("ListDelegatedServicesForAccountResponse.DelegatedServices["+ i +"].ServicePrincipal"));
			delegatedService.setStatus(_ctx.stringValue("ListDelegatedServicesForAccountResponse.DelegatedServices["+ i +"].Status"));

			delegatedServices.add(delegatedService);
		}
		listDelegatedServicesForAccountResponse.setDelegatedServices(delegatedServices);
	 
	 	return listDelegatedServicesForAccountResponse;
	}
}