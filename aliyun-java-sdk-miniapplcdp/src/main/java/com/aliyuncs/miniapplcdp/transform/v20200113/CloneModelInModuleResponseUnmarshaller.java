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

import com.aliyuncs.miniapplcdp.model.v20200113.CloneModelInModuleResponse;
import com.aliyuncs.miniapplcdp.model.v20200113.CloneModelInModuleResponse.Data;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class CloneModelInModuleResponseUnmarshaller {

	public static CloneModelInModuleResponse unmarshall(CloneModelInModuleResponse cloneModelInModuleResponse, UnmarshallerContext _ctx) {
		
		cloneModelInModuleResponse.setRequestId(_ctx.stringValue("CloneModelInModuleResponse.RequestId"));

		Data data = new Data();
		data.setAppId(_ctx.stringValue("CloneModelInModuleResponse.Data.AppId"));
		data.setContent(_ctx.mapValue("CloneModelInModuleResponse.Data.Content"));
		data.setCreateTime(_ctx.stringValue("CloneModelInModuleResponse.Data.CreateTime"));
		data.setDescription(_ctx.stringValue("CloneModelInModuleResponse.Data.Description"));
		data.setId(_ctx.stringValue("CloneModelInModuleResponse.Data.Id"));
		data.setLinkModelId(_ctx.stringValue("CloneModelInModuleResponse.Data.LinkModelId"));
		data.setLinkModuleId(_ctx.stringValue("CloneModelInModuleResponse.Data.LinkModuleId"));
		data.setLinked(_ctx.booleanValue("CloneModelInModuleResponse.Data.Linked"));
		data.setModelId(_ctx.stringValue("CloneModelInModuleResponse.Data.ModelId"));
		data.setModifiedTime(_ctx.stringValue("CloneModelInModuleResponse.Data.ModifiedTime"));
		data.setModuleId(_ctx.stringValue("CloneModelInModuleResponse.Data.ModuleId"));
		data.setModelName(_ctx.stringValue("CloneModelInModuleResponse.Data.ModelName"));
		data.setProps(_ctx.mapValue("CloneModelInModuleResponse.Data.Props"));
		data.setRevision(_ctx.integerValue("CloneModelInModuleResponse.Data.Revision"));
		data.setSchemaVersion(_ctx.stringValue("CloneModelInModuleResponse.Data.SchemaVersion"));
		data.setModelStatus(_ctx.stringValue("CloneModelInModuleResponse.Data.ModelStatus"));
		data.setSubType(_ctx.stringValue("CloneModelInModuleResponse.Data.SubType"));
		data.setModelType(_ctx.stringValue("CloneModelInModuleResponse.Data.ModelType"));
		data.setVisibility(_ctx.stringValue("CloneModelInModuleResponse.Data.Visibility"));

		List<Map<Object, Object>> attributes = _ctx.listMapValue("CloneModelInModuleResponse.Data.Attributes");
		data.setAttributes(attributes);
		cloneModelInModuleResponse.setData(data);
	 
	 	return cloneModelInModuleResponse;
	}
}