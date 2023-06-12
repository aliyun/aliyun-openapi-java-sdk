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

import com.aliyuncs.csas.model.v20230120.ListPolicesForPrivateAccessTagResponse;
import com.aliyuncs.csas.model.v20230120.ListPolicesForPrivateAccessTagResponse.Tag;
import com.aliyuncs.csas.model.v20230120.ListPolicesForPrivateAccessTagResponse.Tag.Policy;
import com.aliyuncs.csas.model.v20230120.ListPolicesForPrivateAccessTagResponse.Tag.Policy.CustomUserAttribute;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListPolicesForPrivateAccessTagResponseUnmarshaller {

	public static ListPolicesForPrivateAccessTagResponse unmarshall(ListPolicesForPrivateAccessTagResponse listPolicesForPrivateAccessTagResponse, UnmarshallerContext _ctx) {
		
		listPolicesForPrivateAccessTagResponse.setRequestId(_ctx.stringValue("ListPolicesForPrivateAccessTagResponse.RequestId"));

		List<Tag> tags = new ArrayList<Tag>();
		for (int i = 0; i < _ctx.lengthValue("ListPolicesForPrivateAccessTagResponse.Tags.Length"); i++) {
			Tag tag = new Tag();
			tag.setTagId(_ctx.stringValue("ListPolicesForPrivateAccessTagResponse.Tags["+ i +"].TagId"));

			List<Policy> polices = new ArrayList<Policy>();
			for (int j = 0; j < _ctx.lengthValue("ListPolicesForPrivateAccessTagResponse.Tags["+ i +"].Polices.Length"); j++) {
				Policy policy = new Policy();
				policy.setPolicyId(_ctx.stringValue("ListPolicesForPrivateAccessTagResponse.Tags["+ i +"].Polices["+ j +"].PolicyId"));
				policy.setName(_ctx.stringValue("ListPolicesForPrivateAccessTagResponse.Tags["+ i +"].Polices["+ j +"].Name"));
				policy.setDescription(_ctx.stringValue("ListPolicesForPrivateAccessTagResponse.Tags["+ i +"].Polices["+ j +"].Description"));
				policy.setPolicyAction(_ctx.stringValue("ListPolicesForPrivateAccessTagResponse.Tags["+ i +"].Polices["+ j +"].PolicyAction"));
				policy.setPriority(_ctx.integerValue("ListPolicesForPrivateAccessTagResponse.Tags["+ i +"].Polices["+ j +"].Priority"));
				policy.setStatus(_ctx.stringValue("ListPolicesForPrivateAccessTagResponse.Tags["+ i +"].Polices["+ j +"].Status"));
				policy.setApplicationType(_ctx.stringValue("ListPolicesForPrivateAccessTagResponse.Tags["+ i +"].Polices["+ j +"].ApplicationType"));
				policy.setUserGroupType(_ctx.stringValue("ListPolicesForPrivateAccessTagResponse.Tags["+ i +"].Polices["+ j +"].UserGroupType"));
				policy.setCreateTime(_ctx.stringValue("ListPolicesForPrivateAccessTagResponse.Tags["+ i +"].Polices["+ j +"].CreateTime"));

				List<CustomUserAttribute> customUserAttributes = new ArrayList<CustomUserAttribute>();
				for (int k = 0; k < _ctx.lengthValue("ListPolicesForPrivateAccessTagResponse.Tags["+ i +"].Polices["+ j +"].CustomUserAttributes.Length"); k++) {
					CustomUserAttribute customUserAttribute = new CustomUserAttribute();
					customUserAttribute.setUserGroupType(_ctx.stringValue("ListPolicesForPrivateAccessTagResponse.Tags["+ i +"].Polices["+ j +"].CustomUserAttributes["+ k +"].UserGroupType"));
					customUserAttribute.setRelation(_ctx.stringValue("ListPolicesForPrivateAccessTagResponse.Tags["+ i +"].Polices["+ j +"].CustomUserAttributes["+ k +"].Relation"));
					customUserAttribute.setValue(_ctx.stringValue("ListPolicesForPrivateAccessTagResponse.Tags["+ i +"].Polices["+ j +"].CustomUserAttributes["+ k +"].Value"));
					customUserAttribute.setIdpId(_ctx.integerValue("ListPolicesForPrivateAccessTagResponse.Tags["+ i +"].Polices["+ j +"].CustomUserAttributes["+ k +"].IdpId"));

					customUserAttributes.add(customUserAttribute);
				}
				policy.setCustomUserAttributes(customUserAttributes);

				polices.add(policy);
			}
			tag.setPolices(polices);

			tags.add(tag);
		}
		listPolicesForPrivateAccessTagResponse.setTags(tags);
	 
	 	return listPolicesForPrivateAccessTagResponse;
	}
}