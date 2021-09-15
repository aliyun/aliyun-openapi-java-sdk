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

package com.aliyuncs.miniapplcdp.transform.v20200113;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.miniapplcdp.model.v20200113.ListResourcesResponse;
import com.aliyuncs.miniapplcdp.model.v20200113.ListResourcesResponse.Data;
import com.aliyuncs.miniapplcdp.model.v20200113.ListResourcesResponse.Data.ResourceItem;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListResourcesResponseUnmarshaller {

	public static ListResourcesResponse unmarshall(ListResourcesResponse listResourcesResponse, UnmarshallerContext _ctx) {
		
		listResourcesResponse.setRequestId(_ctx.stringValue("ListResourcesResponse.RequestId"));

		Data data = new Data();

		List<ResourceItem> items = new ArrayList<ResourceItem>();
		for (int i = 0; i < _ctx.lengthValue("ListResourcesResponse.Data.Items.Length"); i++) {
			ResourceItem resourceItem = new ResourceItem();
			resourceItem.setModuleId(_ctx.stringValue("ListResourcesResponse.Data.Items["+ i +"].ModuleId"));
			resourceItem.setCreateTime(_ctx.stringValue("ListResourcesResponse.Data.Items["+ i +"].CreateTime"));
			resourceItem.setRevision(_ctx.integerValue("ListResourcesResponse.Data.Items["+ i +"].Revision"));
			resourceItem.setModifiedTime(_ctx.stringValue("ListResourcesResponse.Data.Items["+ i +"].ModifiedTime"));
			resourceItem.setResourceType(_ctx.stringValue("ListResourcesResponse.Data.Items["+ i +"].ResourceType"));
			resourceItem.setDescription(_ctx.stringValue("ListResourcesResponse.Data.Items["+ i +"].Description"));
			resourceItem.setSchemaVersion(_ctx.stringValue("ListResourcesResponse.Data.Items["+ i +"].SchemaVersion"));
			resourceItem.setAppId(_ctx.stringValue("ListResourcesResponse.Data.Items["+ i +"].AppId"));
			resourceItem.setScope(_ctx.stringValue("ListResourcesResponse.Data.Items["+ i +"].Scope"));
			resourceItem.setResourceId(_ctx.stringValue("ListResourcesResponse.Data.Items["+ i +"].ResourceId"));
			resourceItem.setContent(_ctx.mapValue("ListResourcesResponse.Data.Items["+ i +"].Content"));
			resourceItem.setResourceName(_ctx.stringValue("ListResourcesResponse.Data.Items["+ i +"].ResourceName"));

			items.add(resourceItem);
		}
		data.setItems(items);
		listResourcesResponse.setData(data);
	 
	 	return listResourcesResponse;
	}
}