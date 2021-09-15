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

import com.aliyuncs.miniapplcdp.model.v20200113.ListLogicModelsResponse;
import com.aliyuncs.miniapplcdp.model.v20200113.ListLogicModelsResponse.Data;
import com.aliyuncs.miniapplcdp.model.v20200113.ListLogicModelsResponse.Data.ModelItem;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListLogicModelsResponseUnmarshaller {

	public static ListLogicModelsResponse unmarshall(ListLogicModelsResponse listLogicModelsResponse, UnmarshallerContext _ctx) {
		
		listLogicModelsResponse.setRequestId(_ctx.stringValue("ListLogicModelsResponse.RequestId"));

		Data data = new Data();

		List<ModelItem> items = new ArrayList<ModelItem>();
		for (int i = 0; i < _ctx.lengthValue("ListLogicModelsResponse.Data.Items.Length"); i++) {
			ModelItem modelItem = new ModelItem();
			modelItem.setCreateTime(_ctx.stringValue("ListLogicModelsResponse.Data.Items["+ i +"].CreateTime"));
			modelItem.setModelType(_ctx.stringValue("ListLogicModelsResponse.Data.Items["+ i +"].ModelType"));
			modelItem.setSubType(_ctx.stringValue("ListLogicModelsResponse.Data.Items["+ i +"].SubType"));
			modelItem.setRevision(_ctx.integerValue("ListLogicModelsResponse.Data.Items["+ i +"].Revision"));
			modelItem.setModifiedTime(_ctx.stringValue("ListLogicModelsResponse.Data.Items["+ i +"].ModifiedTime"));
			modelItem.setDescription(_ctx.stringValue("ListLogicModelsResponse.Data.Items["+ i +"].Description"));
			modelItem.setSchemaVersion(_ctx.stringValue("ListLogicModelsResponse.Data.Items["+ i +"].SchemaVersion"));
			modelItem.setAppId(_ctx.stringValue("ListLogicModelsResponse.Data.Items["+ i +"].AppId"));
			modelItem.setProps(_ctx.mapValue("ListLogicModelsResponse.Data.Items["+ i +"].Props"));
			modelItem.setModelStatus(_ctx.stringValue("ListLogicModelsResponse.Data.Items["+ i +"].ModelStatus"));
			modelItem.setModelName(_ctx.stringValue("ListLogicModelsResponse.Data.Items["+ i +"].ModelName"));
			modelItem.setContent(_ctx.mapValue("ListLogicModelsResponse.Data.Items["+ i +"].Content"));
			modelItem.setId(_ctx.stringValue("ListLogicModelsResponse.Data.Items["+ i +"].Id"));
			modelItem.setModelId(_ctx.stringValue("ListLogicModelsResponse.Data.Items["+ i +"].ModelId"));

			items.add(modelItem);
		}
		data.setItems(items);
		listLogicModelsResponse.setData(data);
	 
	 	return listLogicModelsResponse;
	}
}