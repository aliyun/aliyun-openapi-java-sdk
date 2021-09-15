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

import com.aliyuncs.miniapplcdp.model.v20200113.CreatePageModelResponse;
import com.aliyuncs.miniapplcdp.model.v20200113.CreatePageModelResponse.Data;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreatePageModelResponseUnmarshaller {

	public static CreatePageModelResponse unmarshall(CreatePageModelResponse createPageModelResponse, UnmarshallerContext _ctx) {
		
		createPageModelResponse.setRequestId(_ctx.stringValue("CreatePageModelResponse.RequestId"));

		Data data = new Data();
		data.setCreateTime(_ctx.stringValue("CreatePageModelResponse.Data.CreateTime"));
		data.setModelType(_ctx.stringValue("CreatePageModelResponse.Data.ModelType"));
		data.setSubType(_ctx.stringValue("CreatePageModelResponse.Data.SubType"));
		data.setRevision(_ctx.integerValue("CreatePageModelResponse.Data.Revision"));
		data.setModifiedTime(_ctx.stringValue("CreatePageModelResponse.Data.ModifiedTime"));
		data.setDescription(_ctx.stringValue("CreatePageModelResponse.Data.Description"));
		data.setSchemaVersion(_ctx.stringValue("CreatePageModelResponse.Data.SchemaVersion"));
		data.setAppId(_ctx.stringValue("CreatePageModelResponse.Data.AppId"));
		data.setProps(_ctx.mapValue("CreatePageModelResponse.Data.Props"));
		data.setModelStatus(_ctx.stringValue("CreatePageModelResponse.Data.ModelStatus"));
		data.setModelName(_ctx.stringValue("CreatePageModelResponse.Data.ModelName"));
		data.setContent(_ctx.mapValue("CreatePageModelResponse.Data.Content"));
		data.setId(_ctx.stringValue("CreatePageModelResponse.Data.Id"));
		data.setModelId(_ctx.stringValue("CreatePageModelResponse.Data.ModelId"));
		createPageModelResponse.setData(data);
	 
	 	return createPageModelResponse;
	}
}