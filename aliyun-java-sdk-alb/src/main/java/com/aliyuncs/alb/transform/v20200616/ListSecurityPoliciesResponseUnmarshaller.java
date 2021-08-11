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

import com.aliyuncs.alb.model.v20200616.ListSecurityPoliciesResponse;
import com.aliyuncs.alb.model.v20200616.ListSecurityPoliciesResponse.SecurityPolicy;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListSecurityPoliciesResponseUnmarshaller {

	public static ListSecurityPoliciesResponse unmarshall(ListSecurityPoliciesResponse listSecurityPoliciesResponse, UnmarshallerContext _ctx) {
		
		listSecurityPoliciesResponse.setRequestId(_ctx.stringValue("ListSecurityPoliciesResponse.RequestId"));
		listSecurityPoliciesResponse.setMaxResults(_ctx.integerValue("ListSecurityPoliciesResponse.MaxResults"));
		listSecurityPoliciesResponse.setNextToken(_ctx.stringValue("ListSecurityPoliciesResponse.NextToken"));
		listSecurityPoliciesResponse.setTotalCount(_ctx.integerValue("ListSecurityPoliciesResponse.TotalCount"));

		List<SecurityPolicy> securityPolicies = new ArrayList<SecurityPolicy>();
		for (int i = 0; i < _ctx.lengthValue("ListSecurityPoliciesResponse.SecurityPolicies.Length"); i++) {
			SecurityPolicy securityPolicy = new SecurityPolicy();
			securityPolicy.setResourceGroupId(_ctx.stringValue("ListSecurityPoliciesResponse.SecurityPolicies["+ i +"].ResourceGroupId"));
			securityPolicy.setSecurityPolicyId(_ctx.stringValue("ListSecurityPoliciesResponse.SecurityPolicies["+ i +"].SecurityPolicyId"));
			securityPolicy.setSecurityPolicyName(_ctx.stringValue("ListSecurityPoliciesResponse.SecurityPolicies["+ i +"].SecurityPolicyName"));
			securityPolicy.setSecurityPolicyStatus(_ctx.stringValue("ListSecurityPoliciesResponse.SecurityPolicies["+ i +"].SecurityPolicyStatus"));

			List<String> ciphers = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListSecurityPoliciesResponse.SecurityPolicies["+ i +"].Ciphers.Length"); j++) {
				ciphers.add(_ctx.stringValue("ListSecurityPoliciesResponse.SecurityPolicies["+ i +"].Ciphers["+ j +"]"));
			}
			securityPolicy.setCiphers(ciphers);

			List<String> tLSVersions = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListSecurityPoliciesResponse.SecurityPolicies["+ i +"].TLSVersions.Length"); j++) {
				tLSVersions.add(_ctx.stringValue("ListSecurityPoliciesResponse.SecurityPolicies["+ i +"].TLSVersions["+ j +"]"));
			}
			securityPolicy.setTLSVersions(tLSVersions);

			securityPolicies.add(securityPolicy);
		}
		listSecurityPoliciesResponse.setSecurityPolicies(securityPolicies);
	 
	 	return listSecurityPoliciesResponse;
	}
}