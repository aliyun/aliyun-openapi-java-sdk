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

import com.aliyuncs.miniapplcdp.model.v20200113.GetLogicModelResponse;
import com.aliyuncs.miniapplcdp.model.v20200113.GetLogicModelResponse.Data;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetLogicModelResponseUnmarshaller {

	public static GetLogicModelResponse unmarshall(GetLogicModelResponse getLogicModelResponse, UnmarshallerContext _ctx) {
		
		getLogicModelResponse.setRequestId(_ctx.stringValue("GetLogicModelResponse.RequestId"));

		Data data = new Data();
		data.setCreateTime(_ctx.stringValue("GetLogicModelResponse.Data.CreateTime"));
		data.setModelType(_ctx.stringValue("GetLogicModelResponse.Data.ModelType"));
		data.setSubType(_ctx.stringValue("GetLogicModelResponse.Data.SubType"));
		data.setRevision(_ctx.integerValue("GetLogicModelResponse.Data.Revision"));
		data.setModifiedTime(_ctx.stringValue("GetLogicModelResponse.Data.ModifiedTime"));
		data.setDescription(_ctx.stringValue("GetLogicModelResponse.Data.Description"));
		data.setSchemaVersion(_ctx.stringValue("GetLogicModelResponse.Data.SchemaVersion"));
		data.setAppId(_ctx.stringValue("GetLogicModelResponse.Data.AppId"));
		data.setProps(_ctx.mapValue("GetLogicModelResponse.Data.Props"));
		data.setModelStatus(_ctx.stringValue("GetLogicModelResponse.Data.ModelStatus"));
		data.setModelName(_ctx.stringValue("GetLogicModelResponse.Data.ModelName"));
		data.setContent(_ctx.mapValue("GetLogicModelResponse.Data.Content"));
		data.setId(_ctx.stringValue("GetLogicModelResponse.Data.Id"));
		data.setModelId(_ctx.stringValue("GetLogicModelResponse.Data.ModelId"));
		getLogicModelResponse.setData(data);
	 
	 	return getLogicModelResponse;
	}
}