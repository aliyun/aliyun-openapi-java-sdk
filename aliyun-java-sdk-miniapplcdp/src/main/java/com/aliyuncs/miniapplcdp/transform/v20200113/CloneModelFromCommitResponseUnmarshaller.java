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

import com.aliyuncs.miniapplcdp.model.v20200113.CloneModelFromCommitResponse;
import com.aliyuncs.miniapplcdp.model.v20200113.CloneModelFromCommitResponse.Data;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class CloneModelFromCommitResponseUnmarshaller {

	public static CloneModelFromCommitResponse unmarshall(CloneModelFromCommitResponse cloneModelFromCommitResponse, UnmarshallerContext _ctx) {
		
		cloneModelFromCommitResponse.setRequestId(_ctx.stringValue("CloneModelFromCommitResponse.RequestId"));

		Data data = new Data();
		data.setAppId(_ctx.stringValue("CloneModelFromCommitResponse.Data.AppId"));
		data.setContent(_ctx.mapValue("CloneModelFromCommitResponse.Data.Content"));
		data.setCreateTime(_ctx.stringValue("CloneModelFromCommitResponse.Data.CreateTime"));
		data.setDescription(_ctx.stringValue("CloneModelFromCommitResponse.Data.Description"));
		data.setId(_ctx.stringValue("CloneModelFromCommitResponse.Data.Id"));
		data.setLinkModelId(_ctx.stringValue("CloneModelFromCommitResponse.Data.LinkModelId"));
		data.setLinkModuleId(_ctx.stringValue("CloneModelFromCommitResponse.Data.LinkModuleId"));
		data.setLinked(_ctx.booleanValue("CloneModelFromCommitResponse.Data.Linked"));
		data.setModelId(_ctx.stringValue("CloneModelFromCommitResponse.Data.ModelId"));
		data.setModifiedTime(_ctx.stringValue("CloneModelFromCommitResponse.Data.ModifiedTime"));
		data.setModuleId(_ctx.stringValue("CloneModelFromCommitResponse.Data.ModuleId"));
		data.setModelName(_ctx.stringValue("CloneModelFromCommitResponse.Data.ModelName"));
		data.setProps(_ctx.mapValue("CloneModelFromCommitResponse.Data.Props"));
		data.setRevision(_ctx.integerValue("CloneModelFromCommitResponse.Data.Revision"));
		data.setSchemaVersion(_ctx.stringValue("CloneModelFromCommitResponse.Data.SchemaVersion"));
		data.setModelStatus(_ctx.stringValue("CloneModelFromCommitResponse.Data.ModelStatus"));
		data.setSubType(_ctx.stringValue("CloneModelFromCommitResponse.Data.SubType"));
		data.setModelType(_ctx.stringValue("CloneModelFromCommitResponse.Data.ModelType"));
		data.setVisibility(_ctx.stringValue("CloneModelFromCommitResponse.Data.Visibility"));

		List<Map<Object, Object>> attributes = _ctx.listMapValue("CloneModelFromCommitResponse.Data.Attributes");
		data.setAttributes(attributes);
		cloneModelFromCommitResponse.setData(data);
	 
	 	return cloneModelFromCommitResponse;
	}
}