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

import com.aliyuncs.eiam.model.v20211201.GetCustomPrivacyPolicyResponse;
import com.aliyuncs.eiam.model.v20211201.GetCustomPrivacyPolicyResponse.CustomPrivacyPolicy;
import com.aliyuncs.eiam.model.v20211201.GetCustomPrivacyPolicyResponse.CustomPrivacyPolicy.CustomPrivacyPolicyContentsItem;
import com.aliyuncs.eiam.model.v20211201.GetCustomPrivacyPolicyResponse.CustomPrivacyPolicy.CustomPrivacyPolicyContentsItem.CustomPrivacyPolicyItemsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetCustomPrivacyPolicyResponseUnmarshaller {

	public static GetCustomPrivacyPolicyResponse unmarshall(GetCustomPrivacyPolicyResponse getCustomPrivacyPolicyResponse, UnmarshallerContext _ctx) {
		
		getCustomPrivacyPolicyResponse.setRequestId(_ctx.stringValue("GetCustomPrivacyPolicyResponse.RequestId"));

		CustomPrivacyPolicy customPrivacyPolicy = new CustomPrivacyPolicy();
		customPrivacyPolicy.setCustomPrivacyPolicyId(_ctx.stringValue("GetCustomPrivacyPolicyResponse.CustomPrivacyPolicy.CustomPrivacyPolicyId"));
		customPrivacyPolicy.setCustomPrivacyPolicyName(_ctx.stringValue("GetCustomPrivacyPolicyResponse.CustomPrivacyPolicy.CustomPrivacyPolicyName"));
		customPrivacyPolicy.setStatus(_ctx.stringValue("GetCustomPrivacyPolicyResponse.CustomPrivacyPolicy.Status"));
		customPrivacyPolicy.setDefaultLanguageCode(_ctx.stringValue("GetCustomPrivacyPolicyResponse.CustomPrivacyPolicy.DefaultLanguageCode"));
		customPrivacyPolicy.setUserConsentType(_ctx.stringValue("GetCustomPrivacyPolicyResponse.CustomPrivacyPolicy.UserConsentType"));
		customPrivacyPolicy.setInstanceId(_ctx.stringValue("GetCustomPrivacyPolicyResponse.CustomPrivacyPolicy.InstanceId"));

		List<CustomPrivacyPolicyContentsItem> customPrivacyPolicyContents = new ArrayList<CustomPrivacyPolicyContentsItem>();
		for (int i = 0; i < _ctx.lengthValue("GetCustomPrivacyPolicyResponse.CustomPrivacyPolicy.CustomPrivacyPolicyContents.Length"); i++) {
			CustomPrivacyPolicyContentsItem customPrivacyPolicyContentsItem = new CustomPrivacyPolicyContentsItem();
			customPrivacyPolicyContentsItem.setCustomPrivacyPolicyTip(_ctx.stringValue("GetCustomPrivacyPolicyResponse.CustomPrivacyPolicy.CustomPrivacyPolicyContents["+ i +"].CustomPrivacyPolicyTip"));
			customPrivacyPolicyContentsItem.setLanguageCode(_ctx.stringValue("GetCustomPrivacyPolicyResponse.CustomPrivacyPolicy.CustomPrivacyPolicyContents["+ i +"].LanguageCode"));

			List<CustomPrivacyPolicyItemsItem> customPrivacyPolicyItems = new ArrayList<CustomPrivacyPolicyItemsItem>();
			for (int j = 0; j < _ctx.lengthValue("GetCustomPrivacyPolicyResponse.CustomPrivacyPolicy.CustomPrivacyPolicyContents["+ i +"].CustomPrivacyPolicyItems.Length"); j++) {
				CustomPrivacyPolicyItemsItem customPrivacyPolicyItemsItem = new CustomPrivacyPolicyItemsItem();
				customPrivacyPolicyItemsItem.setCustomPrivacyPolicyItemName(_ctx.stringValue("GetCustomPrivacyPolicyResponse.CustomPrivacyPolicy.CustomPrivacyPolicyContents["+ i +"].CustomPrivacyPolicyItems["+ j +"].CustomPrivacyPolicyItemName"));
				customPrivacyPolicyItemsItem.setCustomPrivacyPolicyItemUrl(_ctx.stringValue("GetCustomPrivacyPolicyResponse.CustomPrivacyPolicy.CustomPrivacyPolicyContents["+ i +"].CustomPrivacyPolicyItems["+ j +"].CustomPrivacyPolicyItemUrl"));

				customPrivacyPolicyItems.add(customPrivacyPolicyItemsItem);
			}
			customPrivacyPolicyContentsItem.setCustomPrivacyPolicyItems(customPrivacyPolicyItems);

			customPrivacyPolicyContents.add(customPrivacyPolicyContentsItem);
		}
		customPrivacyPolicy.setCustomPrivacyPolicyContents(customPrivacyPolicyContents);
		getCustomPrivacyPolicyResponse.setCustomPrivacyPolicy(customPrivacyPolicy);
	 
	 	return getCustomPrivacyPolicyResponse;
	}
}