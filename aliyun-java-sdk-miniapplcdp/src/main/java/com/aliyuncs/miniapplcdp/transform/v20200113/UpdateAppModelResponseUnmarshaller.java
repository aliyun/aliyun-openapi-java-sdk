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

import com.aliyuncs.miniapplcdp.model.v20200113.UpdateAppModelResponse;
import com.aliyuncs.miniapplcdp.model.v20200113.UpdateAppModelResponse.Data;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateAppModelResponseUnmarshaller {

	public static UpdateAppModelResponse unmarshall(UpdateAppModelResponse updateAppModelResponse, UnmarshallerContext _ctx) {
		
		updateAppModelResponse.setRequestId(_ctx.stringValue("UpdateAppModelResponse.RequestId"));

		Data data = new Data();
		data.setCreateTime(_ctx.stringValue("UpdateAppModelResponse.Data.CreateTime"));
		data.setModelType(_ctx.stringValue("UpdateAppModelResponse.Data.ModelType"));
		data.setSubType(_ctx.stringValue("UpdateAppModelResponse.Data.SubType"));
		data.setRevision(_ctx.integerValue("UpdateAppModelResponse.Data.Revision"));
		data.setModifiedTime(_ctx.stringValue("UpdateAppModelResponse.Data.ModifiedTime"));
		data.setDescription(_ctx.stringValue("UpdateAppModelResponse.Data.Description"));
		data.setSchemaVersion(_ctx.stringValue("UpdateAppModelResponse.Data.SchemaVersion"));
		data.setAppId(_ctx.stringValue("UpdateAppModelResponse.Data.AppId"));
		data.setProps(_ctx.mapValue("UpdateAppModelResponse.Data.Props"));
		data.setModelStatus(_ctx.stringValue("UpdateAppModelResponse.Data.ModelStatus"));
		data.setModelName(_ctx.stringValue("UpdateAppModelResponse.Data.ModelName"));
		data.setContent(_ctx.mapValue("UpdateAppModelResponse.Data.Content"));
		data.setId(_ctx.stringValue("UpdateAppModelResponse.Data.Id"));
		data.setModelId(_ctx.stringValue("UpdateAppModelResponse.Data.ModelId"));
		updateAppModelResponse.setData(data);
	 
	 	return updateAppModelResponse;
	}
}