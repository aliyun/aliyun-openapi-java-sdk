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

package com.aliyuncs.sae.transform.v20190506;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sae.model.v20190506.ListTagResourcesResponse;
import com.aliyuncs.sae.model.v20190506.ListTagResourcesResponse.Data;
import com.aliyuncs.sae.model.v20190506.ListTagResourcesResponse.Data.TagResource;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListTagResourcesResponseUnmarshaller {

	public static ListTagResourcesResponse unmarshall(ListTagResourcesResponse listTagResourcesResponse, UnmarshallerContext _ctx) {
		
		listTagResourcesResponse.setRequestId(_ctx.stringValue("ListTagResourcesResponse.RequestId"));
		listTagResourcesResponse.setCode(_ctx.stringValue("ListTagResourcesResponse.Code"));
		listTagResourcesResponse.setErrorCode(_ctx.stringValue("ListTagResourcesResponse.ErrorCode"));
		listTagResourcesResponse.setMessage(_ctx.stringValue("ListTagResourcesResponse.Message"));
		listTagResourcesResponse.setSuccess(_ctx.booleanValue("ListTagResourcesResponse.Success"));
		listTagResourcesResponse.setTraceId(_ctx.stringValue("ListTagResourcesResponse.TraceId"));

		Data data = new Data();
		data.setNextToken(_ctx.stringValue("ListTagResourcesResponse.Data.NextToken"));

		List<TagResource> tagResources = new ArrayList<TagResource>();
		for (int i = 0; i < _ctx.lengthValue("ListTagResourcesResponse.Data.TagResources.Length"); i++) {
			TagResource tagResource = new TagResource();
			tagResource.setTagKey(_ctx.stringValue("ListTagResourcesResponse.Data.TagResources["+ i +"].TagKey"));
			tagResource.setTagValue(_ctx.stringValue("ListTagResourcesResponse.Data.TagResources["+ i +"].TagValue"));
			tagResource.setResourceId(_ctx.stringValue("ListTagResourcesResponse.Data.TagResources["+ i +"].ResourceId"));
			tagResource.setResourceType(_ctx.stringValue("ListTagResourcesResponse.Data.TagResources["+ i +"].ResourceType"));

			tagResources.add(tagResource);
		}
		data.setTagResources(tagResources);
		listTagResourcesResponse.setData(data);
	 
	 	return listTagResourcesResponse;
	}
}