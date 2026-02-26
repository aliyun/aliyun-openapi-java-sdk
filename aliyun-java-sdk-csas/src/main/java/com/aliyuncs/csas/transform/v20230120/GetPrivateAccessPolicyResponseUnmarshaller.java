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

import com.aliyuncs.csas.model.v20230120.GetPrivateAccessPolicyResponse;
import com.aliyuncs.csas.model.v20230120.GetPrivateAccessPolicyResponse.Policy;
import com.aliyuncs.csas.model.v20230120.GetPrivateAccessPolicyResponse.Policy.CustomUserAttribute;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetPrivateAccessPolicyResponseUnmarshaller {

	public static GetPrivateAccessPolicyResponse unmarshall(GetPrivateAccessPolicyResponse getPrivateAccessPolicyResponse, UnmarshallerContext _ctx) {
		
		getPrivateAccessPolicyResponse.setRequestId(_ctx.stringValue("GetPrivateAccessPolicyResponse.RequestId"));

		Policy policy = new Policy();
		policy.setPolicyId(_ctx.stringValue("GetPrivateAccessPolicyResponse.Policy.PolicyId"));
		policy.setName(_ctx.stringValue("GetPrivateAccessPolicyResponse.Policy.Name"));
		policy.setDescription(_ctx.stringValue("GetPrivateAccessPolicyResponse.Policy.Description"));
		policy.setPolicyAction(_ctx.stringValue("GetPrivateAccessPolicyResponse.Policy.PolicyAction"));
		policy.setPriority(_ctx.integerValue("GetPrivateAccessPolicyResponse.Policy.Priority"));
		policy.setStatus(_ctx.stringValue("GetPrivateAccessPolicyResponse.Policy.Status"));
		policy.setCreateTime(_ctx.stringValue("GetPrivateAccessPolicyResponse.Policy.CreateTime"));
		policy.setUserGroupMode(_ctx.stringValue("GetPrivateAccessPolicyResponse.Policy.UserGroupMode"));
		policy.setApplicationType(_ctx.stringValue("GetPrivateAccessPolicyResponse.Policy.ApplicationType"));
		policy.setDeviceAttributeId(_ctx.stringValue("GetPrivateAccessPolicyResponse.Policy.DeviceAttributeId"));
		policy.setDeviceAttributeAction(_ctx.stringValue("GetPrivateAccessPolicyResponse.Policy.DeviceAttributeAction"));

		List<String> userGroupIds = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetPrivateAccessPolicyResponse.Policy.UserGroupIds.Length"); i++) {
			userGroupIds.add(_ctx.stringValue("GetPrivateAccessPolicyResponse.Policy.UserGroupIds["+ i +"]"));
		}
		policy.setUserGroupIds(userGroupIds);

		List<String> applicationIds = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetPrivateAccessPolicyResponse.Policy.ApplicationIds.Length"); i++) {
			applicationIds.add(_ctx.stringValue("GetPrivateAccessPolicyResponse.Policy.ApplicationIds["+ i +"]"));
		}
		policy.setApplicationIds(applicationIds);

		List<String> tagIds = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetPrivateAccessPolicyResponse.Policy.TagIds.Length"); i++) {
			tagIds.add(_ctx.stringValue("GetPrivateAccessPolicyResponse.Policy.TagIds["+ i +"]"));
		}
		policy.setTagIds(tagIds);

		List<CustomUserAttribute> customUserAttributes = new ArrayList<CustomUserAttribute>();
		for (int i = 0; i < _ctx.lengthValue("GetPrivateAccessPolicyResponse.Policy.CustomUserAttributes.Length"); i++) {
			CustomUserAttribute customUserAttribute = new CustomUserAttribute();
			customUserAttribute.setUserGroupType(_ctx.stringValue("GetPrivateAccessPolicyResponse.Policy.CustomUserAttributes["+ i +"].UserGroupType"));
			customUserAttribute.setRelation(_ctx.stringValue("GetPrivateAccessPolicyResponse.Policy.CustomUserAttributes["+ i +"].Relation"));
			customUserAttribute.setValue(_ctx.stringValue("GetPrivateAccessPolicyResponse.Policy.CustomUserAttributes["+ i +"].Value"));
			customUserAttribute.setIdpId(_ctx.integerValue("GetPrivateAccessPolicyResponse.Policy.CustomUserAttributes["+ i +"].IdpId"));

			customUserAttributes.add(customUserAttribute);
		}
		policy.setCustomUserAttributes(customUserAttributes);
		getPrivateAccessPolicyResponse.setPolicy(policy);
	 
	 	return getPrivateAccessPolicyResponse;
	}
}