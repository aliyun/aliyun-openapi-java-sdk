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

import com.aliyuncs.miniapplcdp.model.v20200113.UpdateDataModelContentResponse;
import com.aliyuncs.miniapplcdp.model.v20200113.UpdateDataModelContentResponse.Data;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateDataModelContentResponseUnmarshaller {

	public static UpdateDataModelContentResponse unmarshall(UpdateDataModelContentResponse updateDataModelContentResponse, UnmarshallerContext _ctx) {
		
		updateDataModelContentResponse.setRequestId(_ctx.stringValue("UpdateDataModelContentResponse.RequestId"));

		Data data = new Data();
		data.setCreateTime(_ctx.stringValue("UpdateDataModelContentResponse.Data.CreateTime"));
		data.setModelType(_ctx.stringValue("UpdateDataModelContentResponse.Data.ModelType"));
		data.setSubType(_ctx.stringValue("UpdateDataModelContentResponse.Data.SubType"));
		data.setRevision(_ctx.integerValue("UpdateDataModelContentResponse.Data.Revision"));
		data.setModifiedTime(_ctx.stringValue("UpdateDataModelContentResponse.Data.ModifiedTime"));
		data.setDescription(_ctx.stringValue("UpdateDataModelContentResponse.Data.Description"));
		data.setSchemaVersion(_ctx.stringValue("UpdateDataModelContentResponse.Data.SchemaVersion"));
		data.setAppId(_ctx.stringValue("UpdateDataModelContentResponse.Data.AppId"));
		data.setProps(_ctx.mapValue("UpdateDataModelContentResponse.Data.Props"));
		data.setModelStatus(_ctx.stringValue("UpdateDataModelContentResponse.Data.ModelStatus"));
		data.setModelName(_ctx.stringValue("UpdateDataModelContentResponse.Data.ModelName"));
		data.setContent(_ctx.mapValue("UpdateDataModelContentResponse.Data.Content"));
		data.setId(_ctx.stringValue("UpdateDataModelContentResponse.Data.Id"));
		data.setModelId(_ctx.stringValue("UpdateDataModelContentResponse.Data.ModelId"));

		List<Map<Object, Object>> attributes = _ctx.listMapValue("UpdateDataModelContentResponse.Data.Attributes");
		data.setAttributes(attributes);
		updateDataModelContentResponse.setData(data);
	 
	 	return updateDataModelContentResponse;
	}
}