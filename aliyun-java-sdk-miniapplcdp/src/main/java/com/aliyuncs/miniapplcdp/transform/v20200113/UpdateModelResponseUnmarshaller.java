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

import com.aliyuncs.miniapplcdp.model.v20200113.UpdateModelResponse;
import com.aliyuncs.miniapplcdp.model.v20200113.UpdateModelResponse.Data;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateModelResponseUnmarshaller {

	public static UpdateModelResponse unmarshall(UpdateModelResponse updateModelResponse, UnmarshallerContext _ctx) {
		
		updateModelResponse.setRequestId(_ctx.stringValue("UpdateModelResponse.RequestId"));

		Data data = new Data();
		data.setAppId(_ctx.stringValue("UpdateModelResponse.Data.AppId"));
		data.setContent(_ctx.mapValue("UpdateModelResponse.Data.Content"));
		data.setCreateTime(_ctx.stringValue("UpdateModelResponse.Data.CreateTime"));
		data.setDescription(_ctx.stringValue("UpdateModelResponse.Data.Description"));
		data.setId(_ctx.stringValue("UpdateModelResponse.Data.Id"));
		data.setLinkModelId(_ctx.stringValue("UpdateModelResponse.Data.LinkModelId"));
		data.setLinkModuleId(_ctx.stringValue("UpdateModelResponse.Data.LinkModuleId"));
		data.setLinked(_ctx.booleanValue("UpdateModelResponse.Data.Linked"));
		data.setModelId(_ctx.stringValue("UpdateModelResponse.Data.ModelId"));
		data.setModifiedTime(_ctx.stringValue("UpdateModelResponse.Data.ModifiedTime"));
		data.setModuleId(_ctx.stringValue("UpdateModelResponse.Data.ModuleId"));
		data.setModelName(_ctx.stringValue("UpdateModelResponse.Data.ModelName"));
		data.setProps(_ctx.mapValue("UpdateModelResponse.Data.Props"));
		data.setRevision(_ctx.integerValue("UpdateModelResponse.Data.Revision"));
		data.setSchemaVersion(_ctx.stringValue("UpdateModelResponse.Data.SchemaVersion"));
		data.setModelStatus(_ctx.stringValue("UpdateModelResponse.Data.ModelStatus"));
		data.setSubType(_ctx.stringValue("UpdateModelResponse.Data.SubType"));
		data.setModelType(_ctx.stringValue("UpdateModelResponse.Data.ModelType"));
		data.setVisibility(_ctx.stringValue("UpdateModelResponse.Data.Visibility"));
		data.setModelDigest(_ctx.stringValue("UpdateModelResponse.Data.ModelDigest"));

		List<Map<Object, Object>> attributes = _ctx.listMapValue("UpdateModelResponse.Data.Attributes");
		data.setAttributes(attributes);
		updateModelResponse.setData(data);
	 
	 	return updateModelResponse;
	}
}