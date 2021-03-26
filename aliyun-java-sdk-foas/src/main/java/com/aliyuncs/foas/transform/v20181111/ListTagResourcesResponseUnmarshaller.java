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

package com.aliyuncs.foas.transform.v20181111;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.foas.model.v20181111.ListTagResourcesResponse;
import com.aliyuncs.foas.model.v20181111.ListTagResourcesResponse.Data;
import com.aliyuncs.foas.model.v20181111.ListTagResourcesResponse.Data.TagResource;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListTagResourcesResponseUnmarshaller {

	public static ListTagResourcesResponse unmarshall(ListTagResourcesResponse listTagResourcesResponse, UnmarshallerContext _ctx) {
		
		listTagResourcesResponse.setRequestId(_ctx.stringValue("ListTagResourcesResponse.RequestId"));
		listTagResourcesResponse.setSuccess(_ctx.booleanValue("ListTagResourcesResponse.Success"));
		listTagResourcesResponse.setHttpStatusCode(_ctx.integerValue("ListTagResourcesResponse.HttpStatusCode"));
		listTagResourcesResponse.setCode(_ctx.stringValue("ListTagResourcesResponse.Code"));
		listTagResourcesResponse.setMessage(_ctx.stringValue("ListTagResourcesResponse.Message"));

		Data data = new Data();
		data.setNextToken(_ctx.stringValue("ListTagResourcesResponse.Data.NextToken"));

		List<TagResource> tagResources = new ArrayList<TagResource>();
		for (int i = 0; i < _ctx.lengthValue("ListTagResourcesResponse.Data.TagResources.Length"); i++) {
			TagResource tagResource = new TagResource();
			tagResource.setResourceType(_ctx.stringValue("ListTagResourcesResponse.Data.TagResources["+ i +"].ResourceType"));
			tagResource.setTagKey(_ctx.stringValue("ListTagResourcesResponse.Data.TagResources["+ i +"].TagKey"));
			tagResource.setTagValue(_ctx.stringValue("ListTagResourcesResponse.Data.TagResources["+ i +"].TagValue"));
			tagResource.setResourceId(_ctx.stringValue("ListTagResourcesResponse.Data.TagResources["+ i +"].ResourceId"));

			tagResources.add(tagResource);
		}
		data.setTagResources(tagResources);
		listTagResourcesResponse.setData(data);
	 
	 	return listTagResourcesResponse;
	}
}