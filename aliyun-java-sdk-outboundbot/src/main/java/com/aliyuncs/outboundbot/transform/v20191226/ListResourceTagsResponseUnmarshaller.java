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

package com.aliyuncs.outboundbot.transform.v20191226;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.outboundbot.model.v20191226.ListResourceTagsResponse;
import com.aliyuncs.outboundbot.model.v20191226.ListResourceTagsResponse.ResourceTags;
import com.aliyuncs.outboundbot.model.v20191226.ListResourceTagsResponse.ResourceTags.ResourceTag;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListResourceTagsResponseUnmarshaller {

	public static ListResourceTagsResponse unmarshall(ListResourceTagsResponse listResourceTagsResponse, UnmarshallerContext _ctx) {
		
		listResourceTagsResponse.setRequestId(_ctx.stringValue("ListResourceTagsResponse.RequestId"));
		listResourceTagsResponse.setSuccess(_ctx.booleanValue("ListResourceTagsResponse.Success"));
		listResourceTagsResponse.setCode(_ctx.stringValue("ListResourceTagsResponse.Code"));
		listResourceTagsResponse.setMessage(_ctx.stringValue("ListResourceTagsResponse.Message"));
		listResourceTagsResponse.setHttpStatusCode(_ctx.integerValue("ListResourceTagsResponse.HttpStatusCode"));

		ResourceTags resourceTags = new ResourceTags();
		resourceTags.setTotalCount(_ctx.integerValue("ListResourceTagsResponse.ResourceTags.TotalCount"));
		resourceTags.setPageNumber(_ctx.integerValue("ListResourceTagsResponse.ResourceTags.PageNumber"));
		resourceTags.setPageSize(_ctx.integerValue("ListResourceTagsResponse.ResourceTags.PageSize"));

		List<ResourceTag> list = new ArrayList<ResourceTag>();
		for (int i = 0; i < _ctx.lengthValue("ListResourceTagsResponse.ResourceTags.List.Length"); i++) {
			ResourceTag resourceTag = new ResourceTag();
			resourceTag.setKey(_ctx.stringValue("ListResourceTagsResponse.ResourceTags.List["+ i +"].Key"));
			resourceTag.setValue(_ctx.stringValue("ListResourceTagsResponse.ResourceTags.List["+ i +"].Value"));

			list.add(resourceTag);
		}
		resourceTags.setList(list);
		listResourceTagsResponse.setResourceTags(resourceTags);
	 
	 	return listResourceTagsResponse;
	}
}