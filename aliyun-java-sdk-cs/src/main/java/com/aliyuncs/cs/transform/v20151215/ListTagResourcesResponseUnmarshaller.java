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

package com.aliyuncs.cs.transform.v20151215;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cs.model.v20151215.ListTagResourcesResponse;
import com.aliyuncs.cs.model.v20151215.ListTagResourcesResponse.Tag_resources;
import com.aliyuncs.cs.model.v20151215.ListTagResourcesResponse.Tag_resources.Tag_resourceItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListTagResourcesResponseUnmarshaller {

	public static ListTagResourcesResponse unmarshall(ListTagResourcesResponse listTagResourcesResponse, UnmarshallerContext _ctx) {
		
		listTagResourcesResponse.setNext_token(_ctx.stringValue("ListTagResourcesResponse.next_token"));
		listTagResourcesResponse.setRequest_id(_ctx.stringValue("ListTagResourcesResponse.request_id"));

		Tag_resources tag_resources = new Tag_resources();

		List<Tag_resourceItem> tag_resource = new ArrayList<Tag_resourceItem>();
		for (int i = 0; i < _ctx.lengthValue("ListTagResourcesResponse.tag_resources.tag_resource.Length"); i++) {
			Tag_resourceItem tag_resourceItem = new Tag_resourceItem();
			tag_resourceItem.setTag_key(_ctx.stringValue("ListTagResourcesResponse.tag_resources.tag_resource["+ i +"].tag_key"));
			tag_resourceItem.setTag_value(_ctx.stringValue("ListTagResourcesResponse.tag_resources.tag_resource["+ i +"].tag_value"));
			tag_resourceItem.setResource_id(_ctx.stringValue("ListTagResourcesResponse.tag_resources.tag_resource["+ i +"].resource_id"));
			tag_resourceItem.setResource_type(_ctx.stringValue("ListTagResourcesResponse.tag_resources.tag_resource["+ i +"].resource_type"));

			tag_resource.add(tag_resourceItem);
		}
		tag_resources.setTag_resource(tag_resource);
		listTagResourcesResponse.setTag_resources(tag_resources);
	 
	 	return listTagResourcesResponse;
	}
}