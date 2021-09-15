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

import com.aliyuncs.miniapplcdp.model.v20200113.CreateDataModelResponse;
import com.aliyuncs.miniapplcdp.model.v20200113.CreateDataModelResponse.Data;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateDataModelResponseUnmarshaller {

	public static CreateDataModelResponse unmarshall(CreateDataModelResponse createDataModelResponse, UnmarshallerContext _ctx) {
		
		createDataModelResponse.setRequestId(_ctx.stringValue("CreateDataModelResponse.RequestId"));

		Data data = new Data();
		data.setCreateTime(_ctx.stringValue("CreateDataModelResponse.Data.CreateTime"));
		data.setModelType(_ctx.stringValue("CreateDataModelResponse.Data.ModelType"));
		data.setSubType(_ctx.stringValue("CreateDataModelResponse.Data.SubType"));
		data.setRevision(_ctx.integerValue("CreateDataModelResponse.Data.Revision"));
		data.setModifiedTime(_ctx.stringValue("CreateDataModelResponse.Data.ModifiedTime"));
		data.setDescription(_ctx.stringValue("CreateDataModelResponse.Data.Description"));
		data.setSchemaVersion(_ctx.stringValue("CreateDataModelResponse.Data.SchemaVersion"));
		data.setAppId(_ctx.stringValue("CreateDataModelResponse.Data.AppId"));
		data.setProps(_ctx.mapValue("CreateDataModelResponse.Data.Props"));
		data.setModelStatus(_ctx.stringValue("CreateDataModelResponse.Data.ModelStatus"));
		data.setModelName(_ctx.stringValue("CreateDataModelResponse.Data.ModelName"));
		data.setContent(_ctx.mapValue("CreateDataModelResponse.Data.Content"));
		data.setId(_ctx.stringValue("CreateDataModelResponse.Data.Id"));
		data.setModelId(_ctx.stringValue("CreateDataModelResponse.Data.ModelId"));

		List<Map<Object, Object>> attributes = _ctx.listMapValue("CreateDataModelResponse.Data.Attributes");
		data.setAttributes(attributes);
		createDataModelResponse.setData(data);
	 
	 	return createDataModelResponse;
	}
}