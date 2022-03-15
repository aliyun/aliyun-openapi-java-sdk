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

import com.aliyuncs.miniapplcdp.model.v20200113.ListSystemModelsResponse;
import com.aliyuncs.miniapplcdp.model.v20200113.ListSystemModelsResponse.Data;
import com.aliyuncs.miniapplcdp.model.v20200113.ListSystemModelsResponse.Data.ModelItem;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListSystemModelsResponseUnmarshaller {

	public static ListSystemModelsResponse unmarshall(ListSystemModelsResponse listSystemModelsResponse, UnmarshallerContext _ctx) {
		
		listSystemModelsResponse.setRequestId(_ctx.stringValue("ListSystemModelsResponse.RequestId"));

		Data data = new Data();

		List<ModelItem> items = new ArrayList<ModelItem>();
		for (int i = 0; i < _ctx.lengthValue("ListSystemModelsResponse.Data.Items.Length"); i++) {
			ModelItem modelItem = new ModelItem();
			modelItem.setAppId(_ctx.stringValue("ListSystemModelsResponse.Data.Items["+ i +"].AppId"));
			modelItem.setContent(_ctx.mapValue("ListSystemModelsResponse.Data.Items["+ i +"].Content"));
			modelItem.setCreateTime(_ctx.stringValue("ListSystemModelsResponse.Data.Items["+ i +"].CreateTime"));
			modelItem.setDescription(_ctx.stringValue("ListSystemModelsResponse.Data.Items["+ i +"].Description"));
			modelItem.setId(_ctx.stringValue("ListSystemModelsResponse.Data.Items["+ i +"].Id"));
			modelItem.setLinkModelId(_ctx.stringValue("ListSystemModelsResponse.Data.Items["+ i +"].LinkModelId"));
			modelItem.setLinkModuleId(_ctx.stringValue("ListSystemModelsResponse.Data.Items["+ i +"].LinkModuleId"));
			modelItem.setLinked(_ctx.booleanValue("ListSystemModelsResponse.Data.Items["+ i +"].Linked"));
			modelItem.setModelId(_ctx.stringValue("ListSystemModelsResponse.Data.Items["+ i +"].ModelId"));
			modelItem.setModifiedTime(_ctx.stringValue("ListSystemModelsResponse.Data.Items["+ i +"].ModifiedTime"));
			modelItem.setModuleId(_ctx.stringValue("ListSystemModelsResponse.Data.Items["+ i +"].ModuleId"));
			modelItem.setModelName(_ctx.stringValue("ListSystemModelsResponse.Data.Items["+ i +"].ModelName"));
			modelItem.setProps(_ctx.mapValue("ListSystemModelsResponse.Data.Items["+ i +"].Props"));
			modelItem.setRevision(_ctx.integerValue("ListSystemModelsResponse.Data.Items["+ i +"].Revision"));
			modelItem.setSchemaVersion(_ctx.stringValue("ListSystemModelsResponse.Data.Items["+ i +"].SchemaVersion"));
			modelItem.setModelStatus(_ctx.stringValue("ListSystemModelsResponse.Data.Items["+ i +"].ModelStatus"));
			modelItem.setSubType(_ctx.stringValue("ListSystemModelsResponse.Data.Items["+ i +"].SubType"));
			modelItem.setModelType(_ctx.stringValue("ListSystemModelsResponse.Data.Items["+ i +"].ModelType"));
			modelItem.setVisibility(_ctx.stringValue("ListSystemModelsResponse.Data.Items["+ i +"].Visibility"));

			List<Map<Object, Object>> attributes = _ctx.listMapValue("ListSystemModelsResponse.Data.Items["+ i +"].Attributes");
			modelItem.setAttributes(attributes);

			items.add(modelItem);
		}
		data.setItems(items);
		listSystemModelsResponse.setData(data);
	 
	 	return listSystemModelsResponse;
	}
}