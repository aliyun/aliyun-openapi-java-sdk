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

import com.aliyuncs.miniapplcdp.model.v20200113.ListModelsByPageResponse;
import com.aliyuncs.miniapplcdp.model.v20200113.ListModelsByPageResponse.Data;
import com.aliyuncs.miniapplcdp.model.v20200113.ListModelsByPageResponse.Data.ModelItem;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListModelsByPageResponseUnmarshaller {

	public static ListModelsByPageResponse unmarshall(ListModelsByPageResponse listModelsByPageResponse, UnmarshallerContext _ctx) {
		
		listModelsByPageResponse.setRequestId(_ctx.stringValue("ListModelsByPageResponse.RequestId"));

		Data data = new Data();
		data.setPageNumber(_ctx.integerValue("ListModelsByPageResponse.Data.PageNumber"));
		data.setPageSize(_ctx.integerValue("ListModelsByPageResponse.Data.PageSize"));
		data.setTotalCount(_ctx.integerValue("ListModelsByPageResponse.Data.TotalCount"));

		List<ModelItem> items = new ArrayList<ModelItem>();
		for (int i = 0; i < _ctx.lengthValue("ListModelsByPageResponse.Data.Items.Length"); i++) {
			ModelItem modelItem = new ModelItem();
			modelItem.setAppId(_ctx.stringValue("ListModelsByPageResponse.Data.Items["+ i +"].AppId"));
			modelItem.setContent(_ctx.mapValue("ListModelsByPageResponse.Data.Items["+ i +"].Content"));
			modelItem.setCreateTime(_ctx.stringValue("ListModelsByPageResponse.Data.Items["+ i +"].CreateTime"));
			modelItem.setDescription(_ctx.stringValue("ListModelsByPageResponse.Data.Items["+ i +"].Description"));
			modelItem.setId(_ctx.stringValue("ListModelsByPageResponse.Data.Items["+ i +"].Id"));
			modelItem.setLinkModelId(_ctx.stringValue("ListModelsByPageResponse.Data.Items["+ i +"].LinkModelId"));
			modelItem.setLinkModuleId(_ctx.stringValue("ListModelsByPageResponse.Data.Items["+ i +"].LinkModuleId"));
			modelItem.setLinked(_ctx.booleanValue("ListModelsByPageResponse.Data.Items["+ i +"].Linked"));
			modelItem.setModelId(_ctx.stringValue("ListModelsByPageResponse.Data.Items["+ i +"].ModelId"));
			modelItem.setModifiedTime(_ctx.stringValue("ListModelsByPageResponse.Data.Items["+ i +"].ModifiedTime"));
			modelItem.setModuleId(_ctx.stringValue("ListModelsByPageResponse.Data.Items["+ i +"].ModuleId"));
			modelItem.setModelName(_ctx.stringValue("ListModelsByPageResponse.Data.Items["+ i +"].ModelName"));
			modelItem.setProps(_ctx.mapValue("ListModelsByPageResponse.Data.Items["+ i +"].Props"));
			modelItem.setRevision(_ctx.integerValue("ListModelsByPageResponse.Data.Items["+ i +"].Revision"));
			modelItem.setSchemaVersion(_ctx.stringValue("ListModelsByPageResponse.Data.Items["+ i +"].SchemaVersion"));
			modelItem.setModelStatus(_ctx.stringValue("ListModelsByPageResponse.Data.Items["+ i +"].ModelStatus"));
			modelItem.setSubType(_ctx.stringValue("ListModelsByPageResponse.Data.Items["+ i +"].SubType"));
			modelItem.setModelType(_ctx.stringValue("ListModelsByPageResponse.Data.Items["+ i +"].ModelType"));
			modelItem.setVisibility(_ctx.stringValue("ListModelsByPageResponse.Data.Items["+ i +"].Visibility"));

			List<Map<Object, Object>> attributes = _ctx.listMapValue("ListModelsByPageResponse.Data.Items["+ i +"].Attributes");
			modelItem.setAttributes(attributes);

			items.add(modelItem);
		}
		data.setItems(items);
		listModelsByPageResponse.setData(data);
	 
	 	return listModelsByPageResponse;
	}
}