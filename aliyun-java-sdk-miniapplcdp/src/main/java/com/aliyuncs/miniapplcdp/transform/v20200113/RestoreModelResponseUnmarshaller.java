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

import com.aliyuncs.miniapplcdp.model.v20200113.RestoreModelResponse;
import com.aliyuncs.miniapplcdp.model.v20200113.RestoreModelResponse.Data;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class RestoreModelResponseUnmarshaller {

	public static RestoreModelResponse unmarshall(RestoreModelResponse restoreModelResponse, UnmarshallerContext _ctx) {
		
		restoreModelResponse.setRequestId(_ctx.stringValue("RestoreModelResponse.RequestId"));

		Data data = new Data();
		data.setAppId(_ctx.stringValue("RestoreModelResponse.Data.AppId"));
		data.setContent(_ctx.mapValue("RestoreModelResponse.Data.Content"));
		data.setCreateTime(_ctx.stringValue("RestoreModelResponse.Data.CreateTime"));
		data.setDescription(_ctx.stringValue("RestoreModelResponse.Data.Description"));
		data.setId(_ctx.stringValue("RestoreModelResponse.Data.Id"));
		data.setLinkModelId(_ctx.stringValue("RestoreModelResponse.Data.LinkModelId"));
		data.setLinkModuleId(_ctx.stringValue("RestoreModelResponse.Data.LinkModuleId"));
		data.setLinked(_ctx.booleanValue("RestoreModelResponse.Data.Linked"));
		data.setModelId(_ctx.stringValue("RestoreModelResponse.Data.ModelId"));
		data.setModifiedTime(_ctx.stringValue("RestoreModelResponse.Data.ModifiedTime"));
		data.setModuleId(_ctx.stringValue("RestoreModelResponse.Data.ModuleId"));
		data.setModelName(_ctx.stringValue("RestoreModelResponse.Data.ModelName"));
		data.setProps(_ctx.mapValue("RestoreModelResponse.Data.Props"));
		data.setRevision(_ctx.integerValue("RestoreModelResponse.Data.Revision"));
		data.setSchemaVersion(_ctx.stringValue("RestoreModelResponse.Data.SchemaVersion"));
		data.setModelStatus(_ctx.stringValue("RestoreModelResponse.Data.ModelStatus"));
		data.setSubType(_ctx.stringValue("RestoreModelResponse.Data.SubType"));
		data.setModelType(_ctx.stringValue("RestoreModelResponse.Data.ModelType"));
		data.setVisibility(_ctx.stringValue("RestoreModelResponse.Data.Visibility"));

		List<Map<Object, Object>> attributes = _ctx.listMapValue("RestoreModelResponse.Data.Attributes");
		data.setAttributes(attributes);
		restoreModelResponse.setData(data);
	 
	 	return restoreModelResponse;
	}
}