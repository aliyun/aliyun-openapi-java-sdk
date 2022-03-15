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

import com.aliyuncs.miniapplcdp.model.v20200113.DeleteModelResponse;
import com.aliyuncs.miniapplcdp.model.v20200113.DeleteModelResponse.Data;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteModelResponseUnmarshaller {

	public static DeleteModelResponse unmarshall(DeleteModelResponse deleteModelResponse, UnmarshallerContext _ctx) {
		
		deleteModelResponse.setRequestId(_ctx.stringValue("DeleteModelResponse.RequestId"));

		Data data = new Data();
		data.setAppId(_ctx.stringValue("DeleteModelResponse.Data.AppId"));
		data.setContent(_ctx.mapValue("DeleteModelResponse.Data.Content"));
		data.setCreateTime(_ctx.stringValue("DeleteModelResponse.Data.CreateTime"));
		data.setDescription(_ctx.stringValue("DeleteModelResponse.Data.Description"));
		data.setId(_ctx.stringValue("DeleteModelResponse.Data.Id"));
		data.setLinkModelId(_ctx.stringValue("DeleteModelResponse.Data.LinkModelId"));
		data.setLinkModuleId(_ctx.stringValue("DeleteModelResponse.Data.LinkModuleId"));
		data.setLinked(_ctx.booleanValue("DeleteModelResponse.Data.Linked"));
		data.setModelId(_ctx.stringValue("DeleteModelResponse.Data.ModelId"));
		data.setModifiedTime(_ctx.stringValue("DeleteModelResponse.Data.ModifiedTime"));
		data.setModuleId(_ctx.stringValue("DeleteModelResponse.Data.ModuleId"));
		data.setModelName(_ctx.stringValue("DeleteModelResponse.Data.ModelName"));
		data.setProps(_ctx.mapValue("DeleteModelResponse.Data.Props"));
		data.setRevision(_ctx.integerValue("DeleteModelResponse.Data.Revision"));
		data.setSchemaVersion(_ctx.stringValue("DeleteModelResponse.Data.SchemaVersion"));
		data.setModelStatus(_ctx.stringValue("DeleteModelResponse.Data.ModelStatus"));
		data.setSubType(_ctx.stringValue("DeleteModelResponse.Data.SubType"));
		data.setModelType(_ctx.stringValue("DeleteModelResponse.Data.ModelType"));
		data.setVisibility(_ctx.stringValue("DeleteModelResponse.Data.Visibility"));

		List<Map<Object, Object>> attributes = _ctx.listMapValue("DeleteModelResponse.Data.Attributes");
		data.setAttributes(attributes);
		deleteModelResponse.setData(data);
	 
	 	return deleteModelResponse;
	}
}