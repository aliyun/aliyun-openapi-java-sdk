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

import com.aliyuncs.miniapplcdp.model.v20200113.GetModelPackResponse;
import com.aliyuncs.miniapplcdp.model.v20200113.GetModelPackResponse.Data;
import com.aliyuncs.miniapplcdp.model.v20200113.GetModelPackResponse.Data.AppModel;
import com.aliyuncs.miniapplcdp.model.v20200113.GetModelPackResponse.Data.DataModelsItem;
import com.aliyuncs.miniapplcdp.model.v20200113.GetModelPackResponse.Data.LogicModelsItem;
import com.aliyuncs.miniapplcdp.model.v20200113.GetModelPackResponse.Data.PageModelsItem;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetModelPackResponseUnmarshaller {

	public static GetModelPackResponse unmarshall(GetModelPackResponse getModelPackResponse, UnmarshallerContext _ctx) {
		
		getModelPackResponse.setRequestId(_ctx.stringValue("GetModelPackResponse.RequestId"));

		Data data = new Data();

		AppModel appModel = new AppModel();
		appModel.setCreateTime(_ctx.stringValue("GetModelPackResponse.Data.AppModel.CreateTime"));
		appModel.setModelType(_ctx.stringValue("GetModelPackResponse.Data.AppModel.ModelType"));
		appModel.setSubType(_ctx.stringValue("GetModelPackResponse.Data.AppModel.SubType"));
		appModel.setRevision(_ctx.integerValue("GetModelPackResponse.Data.AppModel.Revision"));
		appModel.setModifiedTime(_ctx.stringValue("GetModelPackResponse.Data.AppModel.ModifiedTime"));
		appModel.setDescription(_ctx.stringValue("GetModelPackResponse.Data.AppModel.Description"));
		appModel.setSchemaVersion(_ctx.stringValue("GetModelPackResponse.Data.AppModel.SchemaVersion"));
		appModel.setAppId(_ctx.stringValue("GetModelPackResponse.Data.AppModel.AppId"));
		appModel.setProps(_ctx.mapValue("GetModelPackResponse.Data.AppModel.Props"));
		appModel.setModelStatus(_ctx.stringValue("GetModelPackResponse.Data.AppModel.ModelStatus"));
		appModel.setModelName(_ctx.stringValue("GetModelPackResponse.Data.AppModel.ModelName"));
		appModel.setContent(_ctx.mapValue("GetModelPackResponse.Data.AppModel.Content"));
		appModel.setModelId(_ctx.stringValue("GetModelPackResponse.Data.AppModel.ModelId"));
		data.setAppModel(appModel);

		List<DataModelsItem> dataModels = new ArrayList<DataModelsItem>();
		for (int i = 0; i < _ctx.lengthValue("GetModelPackResponse.Data.DataModels.Length"); i++) {
			DataModelsItem dataModelsItem = new DataModelsItem();
			dataModelsItem.setCreateTime(_ctx.stringValue("GetModelPackResponse.Data.DataModels["+ i +"].CreateTime"));
			dataModelsItem.setModelType(_ctx.stringValue("GetModelPackResponse.Data.DataModels["+ i +"].ModelType"));
			dataModelsItem.setSubType(_ctx.stringValue("GetModelPackResponse.Data.DataModels["+ i +"].SubType"));
			dataModelsItem.setRevision(_ctx.integerValue("GetModelPackResponse.Data.DataModels["+ i +"].Revision"));
			dataModelsItem.setModifiedTime(_ctx.stringValue("GetModelPackResponse.Data.DataModels["+ i +"].ModifiedTime"));
			dataModelsItem.setDescription(_ctx.stringValue("GetModelPackResponse.Data.DataModels["+ i +"].Description"));
			dataModelsItem.setSchemaVersion(_ctx.stringValue("GetModelPackResponse.Data.DataModels["+ i +"].SchemaVersion"));
			dataModelsItem.setAppId(_ctx.stringValue("GetModelPackResponse.Data.DataModels["+ i +"].AppId"));
			dataModelsItem.setProps(_ctx.mapValue("GetModelPackResponse.Data.DataModels["+ i +"].Props"));
			dataModelsItem.setModelStatus(_ctx.stringValue("GetModelPackResponse.Data.DataModels["+ i +"].ModelStatus"));
			dataModelsItem.setModelName(_ctx.stringValue("GetModelPackResponse.Data.DataModels["+ i +"].ModelName"));
			dataModelsItem.setContent(_ctx.mapValue("GetModelPackResponse.Data.DataModels["+ i +"].Content"));
			dataModelsItem.setModelId(_ctx.stringValue("GetModelPackResponse.Data.DataModels["+ i +"].ModelId"));

			List<Map<Object, Object>> attributes = _ctx.listMapValue("GetModelPackResponse.Data.DataModels["+ i +"].Attributes");
			dataModelsItem.setAttributes(attributes);

			dataModels.add(dataModelsItem);
		}
		data.setDataModels(dataModels);

		List<PageModelsItem> pageModels = new ArrayList<PageModelsItem>();
		for (int i = 0; i < _ctx.lengthValue("GetModelPackResponse.Data.PageModels.Length"); i++) {
			PageModelsItem pageModelsItem = new PageModelsItem();
			pageModelsItem.setCreateTime(_ctx.stringValue("GetModelPackResponse.Data.PageModels["+ i +"].CreateTime"));
			pageModelsItem.setModelType(_ctx.stringValue("GetModelPackResponse.Data.PageModels["+ i +"].ModelType"));
			pageModelsItem.setSubType(_ctx.stringValue("GetModelPackResponse.Data.PageModels["+ i +"].SubType"));
			pageModelsItem.setRevision(_ctx.integerValue("GetModelPackResponse.Data.PageModels["+ i +"].Revision"));
			pageModelsItem.setModifiedTime(_ctx.stringValue("GetModelPackResponse.Data.PageModels["+ i +"].ModifiedTime"));
			pageModelsItem.setDescription(_ctx.stringValue("GetModelPackResponse.Data.PageModels["+ i +"].Description"));
			pageModelsItem.setSchemaVersion(_ctx.stringValue("GetModelPackResponse.Data.PageModels["+ i +"].SchemaVersion"));
			pageModelsItem.setAppId(_ctx.stringValue("GetModelPackResponse.Data.PageModels["+ i +"].AppId"));
			pageModelsItem.setProps(_ctx.mapValue("GetModelPackResponse.Data.PageModels["+ i +"].Props"));
			pageModelsItem.setModelStatus(_ctx.stringValue("GetModelPackResponse.Data.PageModels["+ i +"].ModelStatus"));
			pageModelsItem.setModelName(_ctx.stringValue("GetModelPackResponse.Data.PageModels["+ i +"].ModelName"));
			pageModelsItem.setContent(_ctx.mapValue("GetModelPackResponse.Data.PageModels["+ i +"].Content"));
			pageModelsItem.setModelId(_ctx.stringValue("GetModelPackResponse.Data.PageModels["+ i +"].ModelId"));

			pageModels.add(pageModelsItem);
		}
		data.setPageModels(pageModels);

		List<LogicModelsItem> logicModels = new ArrayList<LogicModelsItem>();
		for (int i = 0; i < _ctx.lengthValue("GetModelPackResponse.Data.LogicModels.Length"); i++) {
			LogicModelsItem logicModelsItem = new LogicModelsItem();
			logicModelsItem.setCreateTime(_ctx.stringValue("GetModelPackResponse.Data.LogicModels["+ i +"].CreateTime"));
			logicModelsItem.setModelType(_ctx.stringValue("GetModelPackResponse.Data.LogicModels["+ i +"].ModelType"));
			logicModelsItem.setSubType(_ctx.stringValue("GetModelPackResponse.Data.LogicModels["+ i +"].SubType"));
			logicModelsItem.setRevision(_ctx.integerValue("GetModelPackResponse.Data.LogicModels["+ i +"].Revision"));
			logicModelsItem.setModifiedTime(_ctx.stringValue("GetModelPackResponse.Data.LogicModels["+ i +"].ModifiedTime"));
			logicModelsItem.setDescription(_ctx.stringValue("GetModelPackResponse.Data.LogicModels["+ i +"].Description"));
			logicModelsItem.setSchemaVersion(_ctx.stringValue("GetModelPackResponse.Data.LogicModels["+ i +"].SchemaVersion"));
			logicModelsItem.setAppId(_ctx.stringValue("GetModelPackResponse.Data.LogicModels["+ i +"].AppId"));
			logicModelsItem.setProps(_ctx.mapValue("GetModelPackResponse.Data.LogicModels["+ i +"].Props"));
			logicModelsItem.setModelStatus(_ctx.stringValue("GetModelPackResponse.Data.LogicModels["+ i +"].ModelStatus"));
			logicModelsItem.setModelName(_ctx.stringValue("GetModelPackResponse.Data.LogicModels["+ i +"].ModelName"));
			logicModelsItem.setContent(_ctx.mapValue("GetModelPackResponse.Data.LogicModels["+ i +"].Content"));
			logicModelsItem.setModelId(_ctx.stringValue("GetModelPackResponse.Data.LogicModels["+ i +"].ModelId"));

			logicModels.add(logicModelsItem);
		}
		data.setLogicModels(logicModels);
		getModelPackResponse.setData(data);
	 
	 	return getModelPackResponse;
	}
}