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

package com.aliyuncs.gpdb.transform.v20160503;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.gpdb.model.v20160503.ListSupabaseProjectTagsResponse;
import com.aliyuncs.gpdb.model.v20160503.ListSupabaseProjectTagsResponse.TagResource;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListSupabaseProjectTagsResponseUnmarshaller {

	public static ListSupabaseProjectTagsResponse unmarshall(ListSupabaseProjectTagsResponse listSupabaseProjectTagsResponse, UnmarshallerContext _ctx) {
		
		listSupabaseProjectTagsResponse.setRequestId(_ctx.stringValue("ListSupabaseProjectTagsResponse.RequestId"));
		listSupabaseProjectTagsResponse.setNextToken(_ctx.stringValue("ListSupabaseProjectTagsResponse.NextToken"));

		List<TagResource> tagResources = new ArrayList<TagResource>();
		for (int i = 0; i < _ctx.lengthValue("ListSupabaseProjectTagsResponse.TagResources.Length"); i++) {
			TagResource tagResource = new TagResource();
			tagResource.setResourceId(_ctx.stringValue("ListSupabaseProjectTagsResponse.TagResources["+ i +"].ResourceId"));
			tagResource.setTagKey(_ctx.stringValue("ListSupabaseProjectTagsResponse.TagResources["+ i +"].TagKey"));
			tagResource.setResourceType(_ctx.stringValue("ListSupabaseProjectTagsResponse.TagResources["+ i +"].ResourceType"));
			tagResource.setTagValue(_ctx.stringValue("ListSupabaseProjectTagsResponse.TagResources["+ i +"].TagValue"));

			tagResources.add(tagResource);
		}
		listSupabaseProjectTagsResponse.setTagResources(tagResources);
	 
	 	return listSupabaseProjectTagsResponse;
	}
}