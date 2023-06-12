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

import com.aliyuncs.csas.model.v20230120.ListPrivateAccessTagsResponse;
import com.aliyuncs.csas.model.v20230120.ListPrivateAccessTagsResponse.Tag;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListPrivateAccessTagsResponseUnmarshaller {

	public static ListPrivateAccessTagsResponse unmarshall(ListPrivateAccessTagsResponse listPrivateAccessTagsResponse, UnmarshallerContext _ctx) {
		
		listPrivateAccessTagsResponse.setRequestId(_ctx.stringValue("ListPrivateAccessTagsResponse.RequestId"));
		listPrivateAccessTagsResponse.setTotalNum(_ctx.integerValue("ListPrivateAccessTagsResponse.TotalNum"));

		List<Tag> tags = new ArrayList<Tag>();
		for (int i = 0; i < _ctx.lengthValue("ListPrivateAccessTagsResponse.Tags.Length"); i++) {
			Tag tag = new Tag();
			tag.setTagId(_ctx.stringValue("ListPrivateAccessTagsResponse.Tags["+ i +"].TagId"));
			tag.setName(_ctx.stringValue("ListPrivateAccessTagsResponse.Tags["+ i +"].Name"));
			tag.setDescription(_ctx.stringValue("ListPrivateAccessTagsResponse.Tags["+ i +"].Description"));
			tag.setTagType(_ctx.stringValue("ListPrivateAccessTagsResponse.Tags["+ i +"].TagType"));
			tag.setCreateTime(_ctx.stringValue("ListPrivateAccessTagsResponse.Tags["+ i +"].CreateTime"));

			List<String> applicationIds = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListPrivateAccessTagsResponse.Tags["+ i +"].ApplicationIds.Length"); j++) {
				applicationIds.add(_ctx.stringValue("ListPrivateAccessTagsResponse.Tags["+ i +"].ApplicationIds["+ j +"]"));
			}
			tag.setApplicationIds(applicationIds);

			List<String> policyIds = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListPrivateAccessTagsResponse.Tags["+ i +"].PolicyIds.Length"); j++) {
				policyIds.add(_ctx.stringValue("ListPrivateAccessTagsResponse.Tags["+ i +"].PolicyIds["+ j +"]"));
			}
			tag.setPolicyIds(policyIds);

			tags.add(tag);
		}
		listPrivateAccessTagsResponse.setTags(tags);
	 
	 	return listPrivateAccessTagsResponse;
	}
}