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

import com.aliyuncs.miniapplcdp.model.v20200113.GetDataModelResponse;
import com.aliyuncs.miniapplcdp.model.v20200113.GetDataModelResponse.Data;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetDataModelResponseUnmarshaller {

	public static GetDataModelResponse unmarshall(GetDataModelResponse getDataModelResponse, UnmarshallerContext _ctx) {
		
		getDataModelResponse.setRequestId(_ctx.stringValue("GetDataModelResponse.RequestId"));

		Data data = new Data();
		data.setCreateTime(_ctx.stringValue("GetDataModelResponse.Data.CreateTime"));
		data.setModelType(_ctx.stringValue("GetDataModelResponse.Data.ModelType"));
		data.setSubType(_ctx.stringValue("GetDataModelResponse.Data.SubType"));
		data.setRevision(_ctx.integerValue("GetDataModelResponse.Data.Revision"));
		data.setModifiedTime(_ctx.stringValue("GetDataModelResponse.Data.ModifiedTime"));
		data.setDescription(_ctx.stringValue("GetDataModelResponse.Data.Description"));
		data.setSchemaVersion(_ctx.stringValue("GetDataModelResponse.Data.SchemaVersion"));
		data.setAppId(_ctx.stringValue("GetDataModelResponse.Data.AppId"));
		data.setProps(_ctx.mapValue("GetDataModelResponse.Data.Props"));
		data.setModelStatus(_ctx.stringValue("GetDataModelResponse.Data.ModelStatus"));
		data.setModelName(_ctx.stringValue("GetDataModelResponse.Data.ModelName"));
		data.setContent(_ctx.mapValue("GetDataModelResponse.Data.Content"));
		data.setId(_ctx.stringValue("GetDataModelResponse.Data.Id"));
		data.setModelId(_ctx.stringValue("GetDataModelResponse.Data.ModelId"));

		List<Map<Object, Object>> attributes = _ctx.listMapValue("GetDataModelResponse.Data.Attributes");
		data.setAttributes(attributes);
		getDataModelResponse.setData(data);
	 
	 	return getDataModelResponse;
	}
}