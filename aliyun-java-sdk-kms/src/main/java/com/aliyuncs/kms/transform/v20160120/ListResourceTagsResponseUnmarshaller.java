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

package com.aliyuncs.kms.transform.v20160120;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.kms.model.v20160120.ListResourceTagsResponse;
import com.aliyuncs.kms.model.v20160120.ListResourceTagsResponse.Tag;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListResourceTagsResponseUnmarshaller {

	public static ListResourceTagsResponse unmarshall(ListResourceTagsResponse listResourceTagsResponse, UnmarshallerContext _ctx) {
		
		listResourceTagsResponse.setRequestId(_ctx.stringValue("ListResourceTagsResponse.RequestId"));

		List<Tag> tags = new ArrayList<Tag>();
		for (int i = 0; i < _ctx.lengthValue("ListResourceTagsResponse.Tags.Length"); i++) {
			Tag tag = new Tag();
			tag.setKeyId(_ctx.stringValue("ListResourceTagsResponse.Tags["+ i +"].KeyId"));
			tag.setTagKey(_ctx.stringValue("ListResourceTagsResponse.Tags["+ i +"].TagKey"));
			tag.setTagValue(_ctx.stringValue("ListResourceTagsResponse.Tags["+ i +"].TagValue"));

			tags.add(tag);
		}
		listResourceTagsResponse.setTags(tags);
	 
	 	return listResourceTagsResponse;
	}
}