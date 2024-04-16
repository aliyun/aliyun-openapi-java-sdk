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

import com.aliyuncs.miniapplcdp.model.v20200113.GetModelResponse;
import com.aliyuncs.miniapplcdp.model.v20200113.GetModelResponse.Data;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetModelResponseUnmarshaller {

	public static GetModelResponse unmarshall(GetModelResponse getModelResponse, UnmarshallerContext _ctx) {
		
		getModelResponse.setRequestId(_ctx.stringValue("GetModelResponse.RequestId"));

		Data data = new Data();
		data.setAppId(_ctx.stringValue("GetModelResponse.Data.AppId"));
		data.setContent(_ctx.mapValue("GetModelResponse.Data.Content"));
		data.setCreateTime(_ctx.stringValue("GetModelResponse.Data.CreateTime"));
		data.setDescription(_ctx.stringValue("GetModelResponse.Data.Description"));
		data.setId(_ctx.stringValue("GetModelResponse.Data.Id"));
		data.setLinkModelId(_ctx.stringValue("GetModelResponse.Data.LinkModelId"));
		data.setLinkModuleId(_ctx.stringValue("GetModelResponse.Data.LinkModuleId"));
		data.setLinked(_ctx.booleanValue("GetModelResponse.Data.Linked"));
		data.setModelId(_ctx.stringValue("GetModelResponse.Data.ModelId"));
		data.setModifiedTime(_ctx.stringValue("GetModelResponse.Data.ModifiedTime"));
		data.setModuleId(_ctx.stringValue("GetModelResponse.Data.ModuleId"));
		data.setModelName(_ctx.stringValue("GetModelResponse.Data.ModelName"));
		data.setProps(_ctx.mapValue("GetModelResponse.Data.Props"));
		data.setRevision(_ctx.integerValue("GetModelResponse.Data.Revision"));
		data.setSchemaVersion(_ctx.stringValue("GetModelResponse.Data.SchemaVersion"));
		data.setModelStatus(_ctx.stringValue("GetModelResponse.Data.ModelStatus"));
		data.setSubType(_ctx.stringValue("GetModelResponse.Data.SubType"));
		data.setModelType(_ctx.stringValue("GetModelResponse.Data.ModelType"));
		data.setVisibility(_ctx.stringValue("GetModelResponse.Data.Visibility"));

		List<Map<Object, Object>> attributes = _ctx.listMapValue("GetModelResponse.Data.Attributes");
		data.setAttributes(attributes);
		getModelResponse.setData(data);
	 
	 	return getModelResponse;
	}
}