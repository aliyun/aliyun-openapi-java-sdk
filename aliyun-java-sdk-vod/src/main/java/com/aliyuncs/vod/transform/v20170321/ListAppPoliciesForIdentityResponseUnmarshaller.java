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

package com.aliyuncs.vod.transform.v20170321;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.vod.model.v20170321.ListAppPoliciesForIdentityResponse;
import com.aliyuncs.vod.model.v20170321.ListAppPoliciesForIdentityResponse.AppPolicy;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListAppPoliciesForIdentityResponseUnmarshaller {

	public static ListAppPoliciesForIdentityResponse unmarshall(ListAppPoliciesForIdentityResponse listAppPoliciesForIdentityResponse, UnmarshallerContext context) {
		
		listAppPoliciesForIdentityResponse.setRequestId(context.stringValue("ListAppPoliciesForIdentityResponse.RequestId"));

		List<AppPolicy> appPolicyList = new ArrayList<AppPolicy>();
		for (int i = 0; i < context.lengthValue("ListAppPoliciesForIdentityResponse.AppPolicyList.Length"); i++) {
			AppPolicy appPolicy = new AppPolicy();
			appPolicy.setAppId(context.stringValue("ListAppPoliciesForIdentityResponse.AppPolicyList["+ i +"].AppId"));
			appPolicy.setCreationTime(context.stringValue("ListAppPoliciesForIdentityResponse.AppPolicyList["+ i +"].CreationTime"));
			appPolicy.setPolicyName(context.stringValue("ListAppPoliciesForIdentityResponse.AppPolicyList["+ i +"].PolicyName"));
			appPolicy.setPolicyType(context.stringValue("ListAppPoliciesForIdentityResponse.AppPolicyList["+ i +"].PolicyType"));
			appPolicy.setPolicyValue(context.stringValue("ListAppPoliciesForIdentityResponse.AppPolicyList["+ i +"].PolicyValue"));
			appPolicy.setDescription(context.stringValue("ListAppPoliciesForIdentityResponse.AppPolicyList["+ i +"].Description"));
			appPolicy.setModificationTime(context.stringValue("ListAppPoliciesForIdentityResponse.AppPolicyList["+ i +"].ModificationTime"));

			appPolicyList.add(appPolicy);
		}
		listAppPoliciesForIdentityResponse.setAppPolicyList(appPolicyList);
	 
	 	return listAppPoliciesForIdentityResponse;
	}
}