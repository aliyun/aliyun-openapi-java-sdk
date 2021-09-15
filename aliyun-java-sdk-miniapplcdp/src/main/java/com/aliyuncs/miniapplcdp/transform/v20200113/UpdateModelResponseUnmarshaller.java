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

import com.aliyuncs.miniapplcdp.model.v20200113.UpdateModelResponse;
import com.aliyuncs.miniapplcdp.model.v20200113.UpdateModelResponse.Data;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateModelResponseUnmarshaller {

	public static UpdateModelResponse unmarshall(UpdateModelResponse updateModelResponse, UnmarshallerContext _ctx) {
		
		updateModelResponse.setRequestId(_ctx.stringValue("UpdateModelResponse.RequestId"));

		Data data = new Data();
		data.setCreateTime(_ctx.stringValue("UpdateModelResponse.Data.CreateTime"));
		data.setModelType(_ctx.stringValue("UpdateModelResponse.Data.ModelType"));
		data.setSubType(_ctx.stringValue("UpdateModelResponse.Data.SubType"));
		data.setRevision(_ctx.integerValue("UpdateModelResponse.Data.Revision"));
		data.setModifiedTime(_ctx.stringValue("UpdateModelResponse.Data.ModifiedTime"));
		data.setDescription(_ctx.stringValue("UpdateModelResponse.Data.Description"));
		data.setSchemaVersion(_ctx.stringValue("UpdateModelResponse.Data.SchemaVersion"));
		data.setAppId(_ctx.stringValue("UpdateModelResponse.Data.AppId"));
		data.setProps(_ctx.mapValue("UpdateModelResponse.Data.Props"));
		data.setModelStatus(_ctx.stringValue("UpdateModelResponse.Data.ModelStatus"));
		data.setModelName(_ctx.stringValue("UpdateModelResponse.Data.ModelName"));
		data.setContent(_ctx.mapValue("UpdateModelResponse.Data.Content"));
		data.setId(_ctx.stringValue("UpdateModelResponse.Data.Id"));
		data.setModelId(_ctx.stringValue("UpdateModelResponse.Data.ModelId"));
		updateModelResponse.setData(data);
	 
	 	return updateModelResponse;
	}
}