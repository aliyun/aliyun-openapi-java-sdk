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

import com.aliyuncs.miniapplcdp.model.v20200113.UpdateAppModelContentResponse;
import com.aliyuncs.miniapplcdp.model.v20200113.UpdateAppModelContentResponse.Data;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateAppModelContentResponseUnmarshaller {

	public static UpdateAppModelContentResponse unmarshall(UpdateAppModelContentResponse updateAppModelContentResponse, UnmarshallerContext _ctx) {
		
		updateAppModelContentResponse.setRequestId(_ctx.stringValue("UpdateAppModelContentResponse.RequestId"));

		Data data = new Data();
		data.setCreateTime(_ctx.stringValue("UpdateAppModelContentResponse.Data.CreateTime"));
		data.setModelType(_ctx.stringValue("UpdateAppModelContentResponse.Data.ModelType"));
		data.setSubType(_ctx.stringValue("UpdateAppModelContentResponse.Data.SubType"));
		data.setRevision(_ctx.integerValue("UpdateAppModelContentResponse.Data.Revision"));
		data.setModifiedTime(_ctx.stringValue("UpdateAppModelContentResponse.Data.ModifiedTime"));
		data.setDescription(_ctx.stringValue("UpdateAppModelContentResponse.Data.Description"));
		data.setSchemaVersion(_ctx.stringValue("UpdateAppModelContentResponse.Data.SchemaVersion"));
		data.setAppId(_ctx.stringValue("UpdateAppModelContentResponse.Data.AppId"));
		data.setProps(_ctx.mapValue("UpdateAppModelContentResponse.Data.Props"));
		data.setModelStatus(_ctx.stringValue("UpdateAppModelContentResponse.Data.ModelStatus"));
		data.setModelName(_ctx.stringValue("UpdateAppModelContentResponse.Data.ModelName"));
		data.setContent(_ctx.mapValue("UpdateAppModelContentResponse.Data.Content"));
		data.setId(_ctx.stringValue("UpdateAppModelContentResponse.Data.Id"));
		data.setModelId(_ctx.stringValue("UpdateAppModelContentResponse.Data.ModelId"));
		updateAppModelContentResponse.setData(data);
	 
	 	return updateAppModelContentResponse;
	}
}