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

import com.aliyuncs.resourcemanager.model.v20200331.ListTrustedServiceStatusResponse;
import com.aliyuncs.resourcemanager.model.v20200331.ListTrustedServiceStatusResponse.EnabledServicePrincipal;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListTrustedServiceStatusResponseUnmarshaller {

	public static ListTrustedServiceStatusResponse unmarshall(ListTrustedServiceStatusResponse listTrustedServiceStatusResponse, UnmarshallerContext _ctx) {
		
		listTrustedServiceStatusResponse.setRequestId(_ctx.stringValue("ListTrustedServiceStatusResponse.RequestId"));
		listTrustedServiceStatusResponse.setPageNumber(_ctx.integerValue("ListTrustedServiceStatusResponse.PageNumber"));
		listTrustedServiceStatusResponse.setPageSize(_ctx.integerValue("ListTrustedServiceStatusResponse.PageSize"));
		listTrustedServiceStatusResponse.setTotalCount(_ctx.integerValue("ListTrustedServiceStatusResponse.TotalCount"));

		List<EnabledServicePrincipal> enabledServicePrincipals = new ArrayList<EnabledServicePrincipal>();
		for (int i = 0; i < _ctx.lengthValue("ListTrustedServiceStatusResponse.EnabledServicePrincipals.Length"); i++) {
			EnabledServicePrincipal enabledServicePrincipal = new EnabledServicePrincipal();
			enabledServicePrincipal.setEnableTime(_ctx.stringValue("ListTrustedServiceStatusResponse.EnabledServicePrincipals["+ i +"].EnableTime"));
			enabledServicePrincipal.setServicePrincipal(_ctx.stringValue("ListTrustedServiceStatusResponse.EnabledServicePrincipals["+ i +"].ServicePrincipal"));

			enabledServicePrincipals.add(enabledServicePrincipal);
		}
		listTrustedServiceStatusResponse.setEnabledServicePrincipals(enabledServicePrincipals);
	 
	 	return listTrustedServiceStatusResponse;
	}
}