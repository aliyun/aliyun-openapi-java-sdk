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

import com.aliyuncs.miniapplcdp.model.v20200113.ListDataModelsResponse;
import com.aliyuncs.miniapplcdp.model.v20200113.ListDataModelsResponse.Data;
import com.aliyuncs.miniapplcdp.model.v20200113.ListDataModelsResponse.Data.ModelItem;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListDataModelsResponseUnmarshaller {

	public static ListDataModelsResponse unmarshall(ListDataModelsResponse listDataModelsResponse, UnmarshallerContext _ctx) {
		
		listDataModelsResponse.setRequestId(_ctx.stringValue("ListDataModelsResponse.RequestId"));

		Data data = new Data();

		List<ModelItem> items = new ArrayList<ModelItem>();
		for (int i = 0; i < _ctx.lengthValue("ListDataModelsResponse.Data.Items.Length"); i++) {
			ModelItem modelItem = new ModelItem();
			modelItem.setCreateTime(_ctx.stringValue("ListDataModelsResponse.Data.Items["+ i +"].CreateTime"));
			modelItem.setModelType(_ctx.stringValue("ListDataModelsResponse.Data.Items["+ i +"].ModelType"));
			modelItem.setSubType(_ctx.stringValue("ListDataModelsResponse.Data.Items["+ i +"].SubType"));
			modelItem.setRevision(_ctx.integerValue("ListDataModelsResponse.Data.Items["+ i +"].Revision"));
			modelItem.setModifiedTime(_ctx.stringValue("ListDataModelsResponse.Data.Items["+ i +"].ModifiedTime"));
			modelItem.setDescription(_ctx.stringValue("ListDataModelsResponse.Data.Items["+ i +"].Description"));
			modelItem.setSchemaVersion(_ctx.stringValue("ListDataModelsResponse.Data.Items["+ i +"].SchemaVersion"));
			modelItem.setAppId(_ctx.stringValue("ListDataModelsResponse.Data.Items["+ i +"].AppId"));
			modelItem.setProps(_ctx.mapValue("ListDataModelsResponse.Data.Items["+ i +"].Props"));
			modelItem.setModelStatus(_ctx.stringValue("ListDataModelsResponse.Data.Items["+ i +"].ModelStatus"));
			modelItem.setModelName(_ctx.stringValue("ListDataModelsResponse.Data.Items["+ i +"].ModelName"));
			modelItem.setContent(_ctx.mapValue("ListDataModelsResponse.Data.Items["+ i +"].Content"));
			modelItem.setId(_ctx.stringValue("ListDataModelsResponse.Data.Items["+ i +"].Id"));
			modelItem.setModelId(_ctx.stringValue("ListDataModelsResponse.Data.Items["+ i +"].ModelId"));

			List<Map<Object, Object>> attributes = _ctx.listMapValue("ListDataModelsResponse.Data.Items["+ i +"].Attributes");
			modelItem.setAttributes(attributes);

			items.add(modelItem);
		}
		data.setItems(items);
		listDataModelsResponse.setData(data);
	 
	 	return listDataModelsResponse;
	}
}