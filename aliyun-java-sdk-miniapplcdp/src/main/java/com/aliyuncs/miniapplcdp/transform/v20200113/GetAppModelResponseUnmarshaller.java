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

import com.aliyuncs.miniapplcdp.model.v20200113.GetAppModelResponse;
import com.aliyuncs.miniapplcdp.model.v20200113.GetAppModelResponse.Data;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetAppModelResponseUnmarshaller {

	public static GetAppModelResponse unmarshall(GetAppModelResponse getAppModelResponse, UnmarshallerContext _ctx) {
		
		getAppModelResponse.setRequestId(_ctx.stringValue("GetAppModelResponse.RequestId"));

		Data data = new Data();
		data.setCreateTime(_ctx.stringValue("GetAppModelResponse.Data.CreateTime"));
		data.setModelType(_ctx.stringValue("GetAppModelResponse.Data.ModelType"));
		data.setSubType(_ctx.stringValue("GetAppModelResponse.Data.SubType"));
		data.setRevision(_ctx.integerValue("GetAppModelResponse.Data.Revision"));
		data.setModifiedTime(_ctx.stringValue("GetAppModelResponse.Data.ModifiedTime"));
		data.setDescription(_ctx.stringValue("GetAppModelResponse.Data.Description"));
		data.setSchemaVersion(_ctx.stringValue("GetAppModelResponse.Data.SchemaVersion"));
		data.setAppId(_ctx.stringValue("GetAppModelResponse.Data.AppId"));
		data.setProps(_ctx.mapValue("GetAppModelResponse.Data.Props"));
		data.setModelStatus(_ctx.stringValue("GetAppModelResponse.Data.ModelStatus"));
		data.setModelName(_ctx.stringValue("GetAppModelResponse.Data.ModelName"));
		data.setContent(_ctx.mapValue("GetAppModelResponse.Data.Content"));
		data.setId(_ctx.stringValue("GetAppModelResponse.Data.Id"));
		data.setModelId(_ctx.stringValue("GetAppModelResponse.Data.ModelId"));
		getAppModelResponse.setData(data);
	 
	 	return getAppModelResponse;
	}
}