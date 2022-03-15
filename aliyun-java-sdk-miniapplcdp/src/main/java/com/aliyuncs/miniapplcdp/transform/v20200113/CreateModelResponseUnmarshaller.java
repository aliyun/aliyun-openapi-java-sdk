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

import com.aliyuncs.miniapplcdp.model.v20200113.CreateModelResponse;
import com.aliyuncs.miniapplcdp.model.v20200113.CreateModelResponse.Data;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateModelResponseUnmarshaller {

	public static CreateModelResponse unmarshall(CreateModelResponse createModelResponse, UnmarshallerContext _ctx) {
		
		createModelResponse.setRequestId(_ctx.stringValue("CreateModelResponse.RequestId"));

		Data data = new Data();
		data.setAppId(_ctx.stringValue("CreateModelResponse.Data.AppId"));
		data.setContent(_ctx.mapValue("CreateModelResponse.Data.Content"));
		data.setCreateTime(_ctx.stringValue("CreateModelResponse.Data.CreateTime"));
		data.setDescription(_ctx.stringValue("CreateModelResponse.Data.Description"));
		data.setId(_ctx.stringValue("CreateModelResponse.Data.Id"));
		data.setLinkModelId(_ctx.stringValue("CreateModelResponse.Data.LinkModelId"));
		data.setLinkModuleId(_ctx.stringValue("CreateModelResponse.Data.LinkModuleId"));
		data.setLinked(_ctx.booleanValue("CreateModelResponse.Data.Linked"));
		data.setModelId(_ctx.stringValue("CreateModelResponse.Data.ModelId"));
		data.setModifiedTime(_ctx.stringValue("CreateModelResponse.Data.ModifiedTime"));
		data.setModuleId(_ctx.stringValue("CreateModelResponse.Data.ModuleId"));
		data.setModelName(_ctx.stringValue("CreateModelResponse.Data.ModelName"));
		data.setProps(_ctx.mapValue("CreateModelResponse.Data.Props"));
		data.setRevision(_ctx.integerValue("CreateModelResponse.Data.Revision"));
		data.setSchemaVersion(_ctx.stringValue("CreateModelResponse.Data.SchemaVersion"));
		data.setModelStatus(_ctx.stringValue("CreateModelResponse.Data.ModelStatus"));
		data.setSubType(_ctx.stringValue("CreateModelResponse.Data.SubType"));
		data.setModelType(_ctx.stringValue("CreateModelResponse.Data.ModelType"));
		data.setVisibility(_ctx.stringValue("CreateModelResponse.Data.Visibility"));

		List<Map<Object, Object>> attributes = _ctx.listMapValue("CreateModelResponse.Data.Attributes");
		data.setAttributes(attributes);
		createModelResponse.setData(data);
	 
	 	return createModelResponse;
	}
}