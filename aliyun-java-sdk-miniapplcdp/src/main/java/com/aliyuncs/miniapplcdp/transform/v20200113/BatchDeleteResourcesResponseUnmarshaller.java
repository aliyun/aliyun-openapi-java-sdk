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

import com.aliyuncs.miniapplcdp.model.v20200113.BatchDeleteResourcesResponse;
import com.aliyuncs.miniapplcdp.model.v20200113.BatchDeleteResourcesResponse.Data;
import com.aliyuncs.miniapplcdp.model.v20200113.BatchDeleteResourcesResponse.Data.ResourceItem;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class BatchDeleteResourcesResponseUnmarshaller {

	public static BatchDeleteResourcesResponse unmarshall(BatchDeleteResourcesResponse batchDeleteResourcesResponse, UnmarshallerContext _ctx) {
		
		batchDeleteResourcesResponse.setRequestId(_ctx.stringValue("BatchDeleteResourcesResponse.RequestId"));

		Data data = new Data();

		List<ResourceItem> items = new ArrayList<ResourceItem>();
		for (int i = 0; i < _ctx.lengthValue("BatchDeleteResourcesResponse.Data.Items.Length"); i++) {
			ResourceItem resourceItem = new ResourceItem();
			resourceItem.setModuleId(_ctx.stringValue("BatchDeleteResourcesResponse.Data.Items["+ i +"].ModuleId"));
			resourceItem.setCreateTime(_ctx.stringValue("BatchDeleteResourcesResponse.Data.Items["+ i +"].CreateTime"));
			resourceItem.setRevision(_ctx.integerValue("BatchDeleteResourcesResponse.Data.Items["+ i +"].Revision"));
			resourceItem.setModifiedTime(_ctx.stringValue("BatchDeleteResourcesResponse.Data.Items["+ i +"].ModifiedTime"));
			resourceItem.setResourceType(_ctx.stringValue("BatchDeleteResourcesResponse.Data.Items["+ i +"].ResourceType"));
			resourceItem.setDescription(_ctx.stringValue("BatchDeleteResourcesResponse.Data.Items["+ i +"].Description"));
			resourceItem.setSchemaVersion(_ctx.stringValue("BatchDeleteResourcesResponse.Data.Items["+ i +"].SchemaVersion"));
			resourceItem.setAppId(_ctx.stringValue("BatchDeleteResourcesResponse.Data.Items["+ i +"].AppId"));
			resourceItem.setScope(_ctx.stringValue("BatchDeleteResourcesResponse.Data.Items["+ i +"].Scope"));
			resourceItem.setResourceId(_ctx.stringValue("BatchDeleteResourcesResponse.Data.Items["+ i +"].ResourceId"));
			resourceItem.setContent(_ctx.mapValue("BatchDeleteResourcesResponse.Data.Items["+ i +"].Content"));
			resourceItem.setResourceName(_ctx.stringValue("BatchDeleteResourcesResponse.Data.Items["+ i +"].ResourceName"));

			items.add(resourceItem);
		}
		data.setItems(items);
		batchDeleteResourcesResponse.setData(data);
	 
	 	return batchDeleteResourcesResponse;
	}
}