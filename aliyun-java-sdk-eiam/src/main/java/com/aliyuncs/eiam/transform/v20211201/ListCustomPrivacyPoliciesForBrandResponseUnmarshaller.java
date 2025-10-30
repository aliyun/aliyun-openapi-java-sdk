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

import com.aliyuncs.eiam.model.v20211201.ListCustomPrivacyPoliciesForBrandResponse;
import com.aliyuncs.eiam.model.v20211201.ListCustomPrivacyPoliciesForBrandResponse.BrandCustomPrivacyPolicy;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListCustomPrivacyPoliciesForBrandResponseUnmarshaller {

	public static ListCustomPrivacyPoliciesForBrandResponse unmarshall(ListCustomPrivacyPoliciesForBrandResponse listCustomPrivacyPoliciesForBrandResponse, UnmarshallerContext _ctx) {
		
		listCustomPrivacyPoliciesForBrandResponse.setRequestId(_ctx.stringValue("ListCustomPrivacyPoliciesForBrandResponse.RequestId"));
		listCustomPrivacyPoliciesForBrandResponse.setTotalCount(_ctx.longValue("ListCustomPrivacyPoliciesForBrandResponse.TotalCount"));
		listCustomPrivacyPoliciesForBrandResponse.setNextToken(_ctx.stringValue("ListCustomPrivacyPoliciesForBrandResponse.NextToken"));
		listCustomPrivacyPoliciesForBrandResponse.setPreviousToken(_ctx.stringValue("ListCustomPrivacyPoliciesForBrandResponse.PreviousToken"));
		listCustomPrivacyPoliciesForBrandResponse.setMaxResults(_ctx.longValue("ListCustomPrivacyPoliciesForBrandResponse.MaxResults"));

		List<BrandCustomPrivacyPolicy> brandCustomPrivacyPolicies = new ArrayList<BrandCustomPrivacyPolicy>();
		for (int i = 0; i < _ctx.lengthValue("ListCustomPrivacyPoliciesForBrandResponse.BrandCustomPrivacyPolicies.Length"); i++) {
			BrandCustomPrivacyPolicy brandCustomPrivacyPolicy = new BrandCustomPrivacyPolicy();
			brandCustomPrivacyPolicy.setCustomPrivacyPolicyId(_ctx.stringValue("ListCustomPrivacyPoliciesForBrandResponse.BrandCustomPrivacyPolicies["+ i +"].CustomPrivacyPolicyId"));

			brandCustomPrivacyPolicies.add(brandCustomPrivacyPolicy);
		}
		listCustomPrivacyPoliciesForBrandResponse.setBrandCustomPrivacyPolicies(brandCustomPrivacyPolicies);
	 
	 	return listCustomPrivacyPoliciesForBrandResponse;
	}
}