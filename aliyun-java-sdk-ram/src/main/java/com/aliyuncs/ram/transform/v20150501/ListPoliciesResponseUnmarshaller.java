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

package com.aliyuncs.ram.transform.v20150501;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ram.model.v20150501.ListPoliciesResponse;
import com.aliyuncs.ram.model.v20150501.ListPoliciesResponse.Policy;
import com.aliyuncs.ram.model.v20150501.ListPoliciesResponse.Policy.Tag;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListPoliciesResponseUnmarshaller {

	public static ListPoliciesResponse unmarshall(ListPoliciesResponse listPoliciesResponse, UnmarshallerContext _ctx) {
		
		listPoliciesResponse.setRequestId(_ctx.stringValue("ListPoliciesResponse.RequestId"));
		listPoliciesResponse.setIsTruncated(_ctx.booleanValue("ListPoliciesResponse.IsTruncated"));
		listPoliciesResponse.setMarker(_ctx.stringValue("ListPoliciesResponse.Marker"));

		List<Policy> policies = new ArrayList<Policy>();
		for (int i = 0; i < _ctx.lengthValue("ListPoliciesResponse.Policies.Length"); i++) {
			Policy policy = new Policy();
			policy.setDefaultVersion(_ctx.stringValue("ListPoliciesResponse.Policies["+ i +"].DefaultVersion"));
			policy.setDescription(_ctx.stringValue("ListPoliciesResponse.Policies["+ i +"].Description"));
			policy.setUpdateDate(_ctx.stringValue("ListPoliciesResponse.Policies["+ i +"].UpdateDate"));
			policy.setAttachmentCount(_ctx.integerValue("ListPoliciesResponse.Policies["+ i +"].AttachmentCount"));
			policy.setPolicyName(_ctx.stringValue("ListPoliciesResponse.Policies["+ i +"].PolicyName"));
			policy.setCreateDate(_ctx.stringValue("ListPoliciesResponse.Policies["+ i +"].CreateDate"));
			policy.setPolicyType(_ctx.stringValue("ListPoliciesResponse.Policies["+ i +"].PolicyType"));

			List<Tag> tags = new ArrayList<Tag>();
			for (int j = 0; j < _ctx.lengthValue("ListPoliciesResponse.Policies["+ i +"].Tags.Length"); j++) {
				Tag tag = new Tag();
				tag.setTagKey(_ctx.stringValue("ListPoliciesResponse.Policies["+ i +"].Tags["+ j +"].TagKey"));
				tag.setTagValue(_ctx.stringValue("ListPoliciesResponse.Policies["+ i +"].Tags["+ j +"].TagValue"));

				tags.add(tag);
			}
			policy.setTags(tags);

			policies.add(policy);
		}
		listPoliciesResponse.setPolicies(policies);
	 
	 	return listPoliciesResponse;
	}
}