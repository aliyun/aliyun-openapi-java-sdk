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

package com.aliyuncs.eiam.transform.v20211201;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.eiam.model.v20211201.ListCustomPrivacyPoliciesResponse;
import com.aliyuncs.eiam.model.v20211201.ListCustomPrivacyPoliciesResponse.CustomPrivacyPolicy;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListCustomPrivacyPoliciesResponseUnmarshaller {

	public static ListCustomPrivacyPoliciesResponse unmarshall(ListCustomPrivacyPoliciesResponse listCustomPrivacyPoliciesResponse, UnmarshallerContext _ctx) {
		
		listCustomPrivacyPoliciesResponse.setRequestId(_ctx.stringValue("ListCustomPrivacyPoliciesResponse.RequestId"));
		listCustomPrivacyPoliciesResponse.setTotalCount(_ctx.longValue("ListCustomPrivacyPoliciesResponse.TotalCount"));
		listCustomPrivacyPoliciesResponse.setNextToken(_ctx.stringValue("ListCustomPrivacyPoliciesResponse.NextToken"));
		listCustomPrivacyPoliciesResponse.setPreviousToken(_ctx.stringValue("ListCustomPrivacyPoliciesResponse.PreviousToken"));
		listCustomPrivacyPoliciesResponse.setMaxResults(_ctx.longValue("ListCustomPrivacyPoliciesResponse.MaxResults"));

		List<CustomPrivacyPolicy> customPrivacyPolicies = new ArrayList<CustomPrivacyPolicy>();
		for (int i = 0; i < _ctx.lengthValue("ListCustomPrivacyPoliciesResponse.CustomPrivacyPolicies.Length"); i++) {
			CustomPrivacyPolicy customPrivacyPolicy = new CustomPrivacyPolicy();
			customPrivacyPolicy.setInstanceId(_ctx.stringValue("ListCustomPrivacyPoliciesResponse.CustomPrivacyPolicies["+ i +"].InstanceId"));
			customPrivacyPolicy.setCustomPrivacyPolicyId(_ctx.stringValue("ListCustomPrivacyPoliciesResponse.CustomPrivacyPolicies["+ i +"].CustomPrivacyPolicyId"));
			customPrivacyPolicy.setCustomPrivacyPolicyName(_ctx.stringValue("ListCustomPrivacyPoliciesResponse.CustomPrivacyPolicies["+ i +"].CustomPrivacyPolicyName"));
			customPrivacyPolicy.setStatus(_ctx.stringValue("ListCustomPrivacyPoliciesResponse.CustomPrivacyPolicies["+ i +"].Status"));
			customPrivacyPolicy.setUserConsentType(_ctx.stringValue("ListCustomPrivacyPoliciesResponse.CustomPrivacyPolicies["+ i +"].UserConsentType"));
			customPrivacyPolicy.setDefaultLanguageCode(_ctx.stringValue("ListCustomPrivacyPoliciesResponse.CustomPrivacyPolicies["+ i +"].DefaultLanguageCode"));

			customPrivacyPolicies.add(customPrivacyPolicy);
		}
		listCustomPrivacyPoliciesResponse.setCustomPrivacyPolicies(customPrivacyPolicies);
	 
	 	return listCustomPrivacyPoliciesResponse;
	}
}