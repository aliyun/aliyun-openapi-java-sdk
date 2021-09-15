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

import com.aliyuncs.miniapplcdp.model.v20200113.UpdateModelInfoResponse;
import com.aliyuncs.miniapplcdp.model.v20200113.UpdateModelInfoResponse.Data;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateModelInfoResponseUnmarshaller {

	public static UpdateModelInfoResponse unmarshall(UpdateModelInfoResponse updateModelInfoResponse, UnmarshallerContext _ctx) {
		
		updateModelInfoResponse.setRequestId(_ctx.stringValue("UpdateModelInfoResponse.RequestId"));

		Data data = new Data();
		data.setCreateTime(_ctx.stringValue("UpdateModelInfoResponse.Data.CreateTime"));
		data.setModelType(_ctx.stringValue("UpdateModelInfoResponse.Data.ModelType"));
		data.setSubType(_ctx.stringValue("UpdateModelInfoResponse.Data.SubType"));
		data.setRevision(_ctx.integerValue("UpdateModelInfoResponse.Data.Revision"));
		data.setModifiedTime(_ctx.stringValue("UpdateModelInfoResponse.Data.ModifiedTime"));
		data.setDescription(_ctx.stringValue("UpdateModelInfoResponse.Data.Description"));
		data.setSchemaVersion(_ctx.stringValue("UpdateModelInfoResponse.Data.SchemaVersion"));
		data.setAppId(_ctx.stringValue("UpdateModelInfoResponse.Data.AppId"));
		data.setProps(_ctx.mapValue("UpdateModelInfoResponse.Data.Props"));
		data.setModelStatus(_ctx.stringValue("UpdateModelInfoResponse.Data.ModelStatus"));
		data.setModelName(_ctx.stringValue("UpdateModelInfoResponse.Data.ModelName"));
		data.setContent(_ctx.mapValue("UpdateModelInfoResponse.Data.Content"));
		data.setId(_ctx.stringValue("UpdateModelInfoResponse.Data.Id"));
		data.setModelId(_ctx.stringValue("UpdateModelInfoResponse.Data.ModelId"));
		updateModelInfoResponse.setData(data);
	 
	 	return updateModelInfoResponse;
	}
}