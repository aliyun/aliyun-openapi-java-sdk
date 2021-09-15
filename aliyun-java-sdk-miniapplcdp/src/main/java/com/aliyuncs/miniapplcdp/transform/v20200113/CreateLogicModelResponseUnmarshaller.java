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

import com.aliyuncs.miniapplcdp.model.v20200113.CreateLogicModelResponse;
import com.aliyuncs.miniapplcdp.model.v20200113.CreateLogicModelResponse.Data;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateLogicModelResponseUnmarshaller {

	public static CreateLogicModelResponse unmarshall(CreateLogicModelResponse createLogicModelResponse, UnmarshallerContext _ctx) {
		
		createLogicModelResponse.setRequestId(_ctx.stringValue("CreateLogicModelResponse.RequestId"));

		Data data = new Data();
		data.setCreateTime(_ctx.stringValue("CreateLogicModelResponse.Data.CreateTime"));
		data.setModelType(_ctx.stringValue("CreateLogicModelResponse.Data.ModelType"));
		data.setSubType(_ctx.stringValue("CreateLogicModelResponse.Data.SubType"));
		data.setRevision(_ctx.integerValue("CreateLogicModelResponse.Data.Revision"));
		data.setModifiedTime(_ctx.stringValue("CreateLogicModelResponse.Data.ModifiedTime"));
		data.setDescription(_ctx.stringValue("CreateLogicModelResponse.Data.Description"));
		data.setSchemaVersion(_ctx.stringValue("CreateLogicModelResponse.Data.SchemaVersion"));
		data.setAppId(_ctx.stringValue("CreateLogicModelResponse.Data.AppId"));
		data.setProps(_ctx.mapValue("CreateLogicModelResponse.Data.Props"));
		data.setModelStatus(_ctx.stringValue("CreateLogicModelResponse.Data.ModelStatus"));
		data.setModelName(_ctx.stringValue("CreateLogicModelResponse.Data.ModelName"));
		data.setContent(_ctx.mapValue("CreateLogicModelResponse.Data.Content"));
		data.setId(_ctx.stringValue("CreateLogicModelResponse.Data.Id"));
		data.setModelId(_ctx.stringValue("CreateLogicModelResponse.Data.ModelId"));
		createLogicModelResponse.setData(data);
	 
	 	return createLogicModelResponse;
	}
}