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

package com.aliyuncs.ga.transform.v20191120;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ga.model.v20191120.ListSystemSecurityPoliciesResponse;
import com.aliyuncs.ga.model.v20191120.ListSystemSecurityPoliciesResponse.SecurityPoliciesItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListSystemSecurityPoliciesResponseUnmarshaller {

	public static ListSystemSecurityPoliciesResponse unmarshall(ListSystemSecurityPoliciesResponse listSystemSecurityPoliciesResponse, UnmarshallerContext _ctx) {
		
		listSystemSecurityPoliciesResponse.setRequestId(_ctx.stringValue("ListSystemSecurityPoliciesResponse.RequestId"));
		listSystemSecurityPoliciesResponse.setTotalCount(_ctx.integerValue("ListSystemSecurityPoliciesResponse.TotalCount"));
		listSystemSecurityPoliciesResponse.setPageSize(_ctx.integerValue("ListSystemSecurityPoliciesResponse.PageSize"));
		listSystemSecurityPoliciesResponse.setPageNumber(_ctx.integerValue("ListSystemSecurityPoliciesResponse.PageNumber"));

		List<SecurityPoliciesItem> securityPolicies = new ArrayList<SecurityPoliciesItem>();
		for (int i = 0; i < _ctx.lengthValue("ListSystemSecurityPoliciesResponse.SecurityPolicies.Length"); i++) {
			SecurityPoliciesItem securityPoliciesItem = new SecurityPoliciesItem();
			securityPoliciesItem.setSecurityPolicyId(_ctx.stringValue("ListSystemSecurityPoliciesResponse.SecurityPolicies["+ i +"].SecurityPolicyId"));

			List<String> tlsVersions = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListSystemSecurityPoliciesResponse.SecurityPolicies["+ i +"].TlsVersions.Length"); j++) {
				tlsVersions.add(_ctx.stringValue("ListSystemSecurityPoliciesResponse.SecurityPolicies["+ i +"].TlsVersions["+ j +"]"));
			}
			securityPoliciesItem.setTlsVersions(tlsVersions);

			List<String> ciphers = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListSystemSecurityPoliciesResponse.SecurityPolicies["+ i +"].Ciphers.Length"); j++) {
				ciphers.add(_ctx.stringValue("ListSystemSecurityPoliciesResponse.SecurityPolicies["+ i +"].Ciphers["+ j +"]"));
			}
			securityPoliciesItem.setCiphers(ciphers);

			securityPolicies.add(securityPoliciesItem);
		}
		listSystemSecurityPoliciesResponse.setSecurityPolicies(securityPolicies);
	 
	 	return listSystemSecurityPoliciesResponse;
	}
}