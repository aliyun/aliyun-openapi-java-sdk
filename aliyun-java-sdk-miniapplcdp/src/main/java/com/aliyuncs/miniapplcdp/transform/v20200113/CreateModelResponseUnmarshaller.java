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

import com.aliyuncs.miniapplcdp.model.v20200113.CreateModelResponse;
import com.aliyuncs.miniapplcdp.model.v20200113.CreateModelResponse.Data;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateModelResponseUnmarshaller {

	public static CreateModelResponse unmarshall(CreateModelResponse createModelResponse, UnmarshallerContext _ctx) {
		
		createModelResponse.setRequestId(_ctx.stringValue("CreateModelResponse.RequestId"));

		Data data = new Data();
		data.setCreateTime(_ctx.stringValue("CreateModelResponse.Data.CreateTime"));
		data.setModelType(_ctx.stringValue("CreateModelResponse.Data.ModelType"));
		data.setSubType(_ctx.stringValue("CreateModelResponse.Data.SubType"));
		data.setRevision(_ctx.integerValue("CreateModelResponse.Data.Revision"));
		data.setModifiedTime(_ctx.stringValue("CreateModelResponse.Data.ModifiedTime"));
		data.setDescription(_ctx.stringValue("CreateModelResponse.Data.Description"));
		data.setSchemaVersion(_ctx.stringValue("CreateModelResponse.Data.SchemaVersion"));
		data.setAppId(_ctx.stringValue("CreateModelResponse.Data.AppId"));
		data.setProps(_ctx.mapValue("CreateModelResponse.Data.Props"));
		data.setModelStatus(_ctx.stringValue("CreateModelResponse.Data.ModelStatus"));
		data.setModelName(_ctx.stringValue("CreateModelResponse.Data.ModelName"));
		data.setContent(_ctx.mapValue("CreateModelResponse.Data.Content"));
		data.setId(_ctx.stringValue("CreateModelResponse.Data.Id"));
		data.setModelId(_ctx.stringValue("CreateModelResponse.Data.ModelId"));
		createModelResponse.setData(data);
	 
	 	return createModelResponse;
	}
}