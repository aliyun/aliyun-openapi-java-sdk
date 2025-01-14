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

import com.aliyuncs.csas.model.v20230120.ListUserPrivateAccessPoliciesResponse;
import com.aliyuncs.csas.model.v20230120.ListUserPrivateAccessPoliciesResponse.Policies;
import com.aliyuncs.csas.model.v20230120.ListUserPrivateAccessPoliciesResponse.Policies.CustomUserAttributesItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListUserPrivateAccessPoliciesResponseUnmarshaller {

	public static ListUserPrivateAccessPoliciesResponse unmarshall(ListUserPrivateAccessPoliciesResponse listUserPrivateAccessPoliciesResponse, UnmarshallerContext _ctx) {
		
		listUserPrivateAccessPoliciesResponse.setRequestId(_ctx.stringValue("ListUserPrivateAccessPoliciesResponse.RequestId"));
		listUserPrivateAccessPoliciesResponse.setTotalNum(_ctx.integerValue("ListUserPrivateAccessPoliciesResponse.TotalNum"));

		List<Policies> polices = new ArrayList<Policies>();
		for (int i = 0; i < _ctx.lengthValue("ListUserPrivateAccessPoliciesResponse.Polices.Length"); i++) {
			Policies policies = new Policies();
			policies.setPolicyId(_ctx.stringValue("ListUserPrivateAccessPoliciesResponse.Polices["+ i +"].PolicyId"));
			policies.setName(_ctx.stringValue("ListUserPrivateAccessPoliciesResponse.Polices["+ i +"].Name"));
			policies.setPriority(_ctx.longValue("ListUserPrivateAccessPoliciesResponse.Polices["+ i +"].Priority"));
			policies.setPolicyAction(_ctx.stringValue("ListUserPrivateAccessPoliciesResponse.Polices["+ i +"].PolicyAction"));
			policies.setUserGroupMode(_ctx.stringValue("ListUserPrivateAccessPoliciesResponse.Polices["+ i +"].UserGroupMode"));
			policies.setMatchedUserGroup(_ctx.stringValue("ListUserPrivateAccessPoliciesResponse.Polices["+ i +"].MatchedUserGroup"));
			policies.setDeviceAttributeName(_ctx.stringValue("ListUserPrivateAccessPoliciesResponse.Polices["+ i +"].DeviceAttributeName"));

			List<CustomUserAttributesItem> customUserAttributes = new ArrayList<CustomUserAttributesItem>();
			for (int j = 0; j < _ctx.lengthValue("ListUserPrivateAccessPoliciesResponse.Polices["+ i +"].CustomUserAttributes.Length"); j++) {
				CustomUserAttributesItem customUserAttributesItem = new CustomUserAttributesItem();
				customUserAttributesItem.setUserGroupType(_ctx.stringValue("ListUserPrivateAccessPoliciesResponse.Polices["+ i +"].CustomUserAttributes["+ j +"].UserGroupType"));
				customUserAttributesItem.setRelation(_ctx.stringValue("ListUserPrivateAccessPoliciesResponse.Polices["+ i +"].CustomUserAttributes["+ j +"].Relation"));
				customUserAttributesItem.setValue(_ctx.stringValue("ListUserPrivateAccessPoliciesResponse.Polices["+ i +"].CustomUserAttributes["+ j +"].Value"));
				customUserAttributesItem.setIdpId(_ctx.integerValue("ListUserPrivateAccessPoliciesResponse.Polices["+ i +"].CustomUserAttributes["+ j +"].IdpId"));

				customUserAttributes.add(customUserAttributesItem);
			}
			policies.setCustomUserAttributes(customUserAttributes);

			polices.add(policies);
		}
		listUserPrivateAccessPoliciesResponse.setPolices(polices);
	 
	 	return listUserPrivateAccessPoliciesResponse;
	}
}