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

import com.aliyuncs.csas.model.v20230120.ListTagsForPrivateAccessPolicyResponse;
import com.aliyuncs.csas.model.v20230120.ListTagsForPrivateAccessPolicyResponse.Policy;
import com.aliyuncs.csas.model.v20230120.ListTagsForPrivateAccessPolicyResponse.Policy.Tag;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListTagsForPrivateAccessPolicyResponseUnmarshaller {

	public static ListTagsForPrivateAccessPolicyResponse unmarshall(ListTagsForPrivateAccessPolicyResponse listTagsForPrivateAccessPolicyResponse, UnmarshallerContext _ctx) {
		
		listTagsForPrivateAccessPolicyResponse.setRequestId(_ctx.stringValue("ListTagsForPrivateAccessPolicyResponse.RequestId"));

		List<Policy> polices = new ArrayList<Policy>();
		for (int i = 0; i < _ctx.lengthValue("ListTagsForPrivateAccessPolicyResponse.Polices.Length"); i++) {
			Policy policy = new Policy();
			policy.setPolicyId(_ctx.stringValue("ListTagsForPrivateAccessPolicyResponse.Polices["+ i +"].PolicyId"));

			List<Tag> tags = new ArrayList<Tag>();
			for (int j = 0; j < _ctx.lengthValue("ListTagsForPrivateAccessPolicyResponse.Polices["+ i +"].Tags.Length"); j++) {
				Tag tag = new Tag();
				tag.setTagId(_ctx.stringValue("ListTagsForPrivateAccessPolicyResponse.Polices["+ i +"].Tags["+ j +"].TagId"));
				tag.setName(_ctx.stringValue("ListTagsForPrivateAccessPolicyResponse.Polices["+ i +"].Tags["+ j +"].Name"));
				tag.setDescription(_ctx.stringValue("ListTagsForPrivateAccessPolicyResponse.Polices["+ i +"].Tags["+ j +"].Description"));
				tag.setTagType(_ctx.stringValue("ListTagsForPrivateAccessPolicyResponse.Polices["+ i +"].Tags["+ j +"].TagType"));
				tag.setCreateTime(_ctx.stringValue("ListTagsForPrivateAccessPolicyResponse.Polices["+ i +"].Tags["+ j +"].CreateTime"));

				tags.add(tag);
			}
			policy.setTags(tags);

			polices.add(policy);
		}
		listTagsForPrivateAccessPolicyResponse.setPolices(polices);
	 
	 	return listTagsForPrivateAccessPolicyResponse;
	}
}