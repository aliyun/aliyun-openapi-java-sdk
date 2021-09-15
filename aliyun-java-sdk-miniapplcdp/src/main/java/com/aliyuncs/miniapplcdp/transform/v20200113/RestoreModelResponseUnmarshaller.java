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

import com.aliyuncs.miniapplcdp.model.v20200113.RestoreModelResponse;
import com.aliyuncs.miniapplcdp.model.v20200113.RestoreModelResponse.Data;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class RestoreModelResponseUnmarshaller {

	public static RestoreModelResponse unmarshall(RestoreModelResponse restoreModelResponse, UnmarshallerContext _ctx) {
		
		restoreModelResponse.setRequestId(_ctx.stringValue("RestoreModelResponse.RequestId"));

		Data data = new Data();
		data.setCreateTime(_ctx.stringValue("RestoreModelResponse.Data.CreateTime"));
		data.setModelType(_ctx.stringValue("RestoreModelResponse.Data.ModelType"));
		data.setSubType(_ctx.stringValue("RestoreModelResponse.Data.SubType"));
		data.setRevision(_ctx.integerValue("RestoreModelResponse.Data.Revision"));
		data.setModifiedTime(_ctx.stringValue("RestoreModelResponse.Data.ModifiedTime"));
		data.setDescription(_ctx.stringValue("RestoreModelResponse.Data.Description"));
		data.setSchemaVersion(_ctx.stringValue("RestoreModelResponse.Data.SchemaVersion"));
		data.setAppId(_ctx.stringValue("RestoreModelResponse.Data.AppId"));
		data.setProps(_ctx.mapValue("RestoreModelResponse.Data.Props"));
		data.setModelStatus(_ctx.stringValue("RestoreModelResponse.Data.ModelStatus"));
		data.setModelName(_ctx.stringValue("RestoreModelResponse.Data.ModelName"));
		data.setContent(_ctx.mapValue("RestoreModelResponse.Data.Content"));
		data.setId(_ctx.stringValue("RestoreModelResponse.Data.Id"));
		data.setModelId(_ctx.stringValue("RestoreModelResponse.Data.ModelId"));
		restoreModelResponse.setData(data);
	 
	 	return restoreModelResponse;
	}
}