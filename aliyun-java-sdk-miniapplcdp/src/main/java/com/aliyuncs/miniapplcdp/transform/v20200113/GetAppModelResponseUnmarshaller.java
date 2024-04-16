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

import com.aliyuncs.miniapplcdp.model.v20200113.GetAppModelResponse;
import com.aliyuncs.miniapplcdp.model.v20200113.GetAppModelResponse.Data;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetAppModelResponseUnmarshaller {

	public static GetAppModelResponse unmarshall(GetAppModelResponse getAppModelResponse, UnmarshallerContext _ctx) {
		
		getAppModelResponse.setRequestId(_ctx.stringValue("GetAppModelResponse.RequestId"));

		Data data = new Data();
		data.setAppId(_ctx.stringValue("GetAppModelResponse.Data.AppId"));
		data.setContent(_ctx.mapValue("GetAppModelResponse.Data.Content"));
		data.setCreateTime(_ctx.stringValue("GetAppModelResponse.Data.CreateTime"));
		data.setDescription(_ctx.stringValue("GetAppModelResponse.Data.Description"));
		data.setId(_ctx.stringValue("GetAppModelResponse.Data.Id"));
		data.setLinkModelId(_ctx.stringValue("GetAppModelResponse.Data.LinkModelId"));
		data.setLinkModuleId(_ctx.stringValue("GetAppModelResponse.Data.LinkModuleId"));
		data.setLinked(_ctx.booleanValue("GetAppModelResponse.Data.Linked"));
		data.setModelId(_ctx.stringValue("GetAppModelResponse.Data.ModelId"));
		data.setModifiedTime(_ctx.stringValue("GetAppModelResponse.Data.ModifiedTime"));
		data.setModuleId(_ctx.stringValue("GetAppModelResponse.Data.ModuleId"));
		data.setModelName(_ctx.stringValue("GetAppModelResponse.Data.ModelName"));
		data.setProps(_ctx.mapValue("GetAppModelResponse.Data.Props"));
		data.setRevision(_ctx.integerValue("GetAppModelResponse.Data.Revision"));
		data.setSchemaVersion(_ctx.stringValue("GetAppModelResponse.Data.SchemaVersion"));
		data.setModelStatus(_ctx.stringValue("GetAppModelResponse.Data.ModelStatus"));
		data.setSubType(_ctx.stringValue("GetAppModelResponse.Data.SubType"));
		data.setModelType(_ctx.stringValue("GetAppModelResponse.Data.ModelType"));
		data.setVisibility(_ctx.stringValue("GetAppModelResponse.Data.Visibility"));
		data.setModelDigest(_ctx.stringValue("GetAppModelResponse.Data.ModelDigest"));

		List<Map<Object, Object>> attributes = _ctx.listMapValue("GetAppModelResponse.Data.Attributes");
		data.setAttributes(attributes);
		getAppModelResponse.setData(data);
	 
	 	return getAppModelResponse;
	}
}