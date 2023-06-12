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

import com.aliyuncs.csas.model.v20230120.ListPrivateAccessPolicesResponse;
import com.aliyuncs.csas.model.v20230120.ListPrivateAccessPolicesResponse.Policy;
import com.aliyuncs.csas.model.v20230120.ListPrivateAccessPolicesResponse.Policy.CustomUserAttribute;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListPrivateAccessPolicesResponseUnmarshaller {

	public static ListPrivateAccessPolicesResponse unmarshall(ListPrivateAccessPolicesResponse listPrivateAccessPolicesResponse, UnmarshallerContext _ctx) {
		
		listPrivateAccessPolicesResponse.setRequestId(_ctx.stringValue("ListPrivateAccessPolicesResponse.RequestId"));
		listPrivateAccessPolicesResponse.setTotalNum(_ctx.integerValue("ListPrivateAccessPolicesResponse.TotalNum"));

		List<Policy> polices = new ArrayList<Policy>();
		for (int i = 0; i < _ctx.lengthValue("ListPrivateAccessPolicesResponse.Polices.Length"); i++) {
			Policy policy = new Policy();
			policy.setPolicyId(_ctx.stringValue("ListPrivateAccessPolicesResponse.Polices["+ i +"].PolicyId"));
			policy.setName(_ctx.stringValue("ListPrivateAccessPolicesResponse.Polices["+ i +"].Name"));
			policy.setDescription(_ctx.stringValue("ListPrivateAccessPolicesResponse.Polices["+ i +"].Description"));
			policy.setPolicyAction(_ctx.stringValue("ListPrivateAccessPolicesResponse.Polices["+ i +"].PolicyAction"));
			policy.setPriority(_ctx.integerValue("ListPrivateAccessPolicesResponse.Polices["+ i +"].Priority"));
			policy.setStatus(_ctx.stringValue("ListPrivateAccessPolicesResponse.Polices["+ i +"].Status"));
			policy.setCreateTime(_ctx.stringValue("ListPrivateAccessPolicesResponse.Polices["+ i +"].CreateTime"));
			policy.setUserGroupMode(_ctx.stringValue("ListPrivateAccessPolicesResponse.Polices["+ i +"].UserGroupMode"));
			policy.setApplicationType(_ctx.stringValue("ListPrivateAccessPolicesResponse.Polices["+ i +"].ApplicationType"));

			List<String> userGroupIds = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListPrivateAccessPolicesResponse.Polices["+ i +"].UserGroupIds.Length"); j++) {
				userGroupIds.add(_ctx.stringValue("ListPrivateAccessPolicesResponse.Polices["+ i +"].UserGroupIds["+ j +"]"));
			}
			policy.setUserGroupIds(userGroupIds);

			List<String> applicationIds = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListPrivateAccessPolicesResponse.Polices["+ i +"].ApplicationIds.Length"); j++) {
				applicationIds.add(_ctx.stringValue("ListPrivateAccessPolicesResponse.Polices["+ i +"].ApplicationIds["+ j +"]"));
			}
			policy.setApplicationIds(applicationIds);

			List<String> tagIds = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListPrivateAccessPolicesResponse.Polices["+ i +"].TagIds.Length"); j++) {
				tagIds.add(_ctx.stringValue("ListPrivateAccessPolicesResponse.Polices["+ i +"].TagIds["+ j +"]"));
			}
			policy.setTagIds(tagIds);

			List<CustomUserAttribute> customUserAttributes = new ArrayList<CustomUserAttribute>();
			for (int j = 0; j < _ctx.lengthValue("ListPrivateAccessPolicesResponse.Polices["+ i +"].CustomUserAttributes.Length"); j++) {
				CustomUserAttribute customUserAttribute = new CustomUserAttribute();
				customUserAttribute.setUserGroupType(_ctx.stringValue("ListPrivateAccessPolicesResponse.Polices["+ i +"].CustomUserAttributes["+ j +"].UserGroupType"));
				customUserAttribute.setRelation(_ctx.stringValue("ListPrivateAccessPolicesResponse.Polices["+ i +"].CustomUserAttributes["+ j +"].Relation"));
				customUserAttribute.setValue(_ctx.stringValue("ListPrivateAccessPolicesResponse.Polices["+ i +"].CustomUserAttributes["+ j +"].Value"));
				customUserAttribute.setIdpId(_ctx.integerValue("ListPrivateAccessPolicesResponse.Polices["+ i +"].CustomUserAttributes["+ j +"].IdpId"));

				customUserAttributes.add(customUserAttribute);
			}
			policy.setCustomUserAttributes(customUserAttributes);

			polices.add(policy);
		}
		listPrivateAccessPolicesResponse.setPolices(polices);
	 
	 	return listPrivateAccessPolicesResponse;
	}
}