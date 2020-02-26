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

package com.aliyuncs.elasticsearch.transform.v20170613;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.elasticsearch.model.v20170613.ListTagResourcesResponse;
import com.aliyuncs.elasticsearch.model.v20170613.ListTagResourcesResponse.Headers;
import com.aliyuncs.elasticsearch.model.v20170613.ListTagResourcesResponse.TagResources;
import com.aliyuncs.elasticsearch.model.v20170613.ListTagResourcesResponse.TagResources.TagResourceItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListTagResourcesResponseUnmarshaller {

	public static ListTagResourcesResponse unmarshall(ListTagResourcesResponse listTagResourcesResponse, UnmarshallerContext _ctx) {
		
		listTagResourcesResponse.setRequestId(_ctx.stringValue("ListTagResourcesResponse.RequestId"));
		listTagResourcesResponse.setPageSize(_ctx.integerValue("ListTagResourcesResponse.PageSize"));

		Headers headers = new Headers();
		headers.setXTotalCount(_ctx.integerValue("ListTagResourcesResponse.Headers.X-Total-Count"));
		listTagResourcesResponse.setHeaders(headers);

		TagResources tagResources = new TagResources();

		List<TagResourceItem> tagResource = new ArrayList<TagResourceItem>();
		for (int i = 0; i < _ctx.lengthValue("ListTagResourcesResponse.TagResources.TagResource.Length"); i++) {
			TagResourceItem tagResourceItem = new TagResourceItem();
			tagResourceItem.setResourceId(_ctx.stringValue("ListTagResourcesResponse.TagResources.TagResource["+ i +"].ResourceId"));
			tagResourceItem.setResourceType(_ctx.stringValue("ListTagResourcesResponse.TagResources.TagResource["+ i +"].ResourceType"));
			tagResourceItem.setTagKey(_ctx.stringValue("ListTagResourcesResponse.TagResources.TagResource["+ i +"].TagKey"));
			tagResourceItem.setTagValue(_ctx.stringValue("ListTagResourcesResponse.TagResources.TagResource["+ i +"].TagValue"));

			tagResource.add(tagResourceItem);
		}
		tagResources.setTagResource(tagResource);
		listTagResourcesResponse.setTagResources(tagResources);
	 
	 	return listTagResourcesResponse;
	}
}