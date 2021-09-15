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

import com.aliyuncs.miniapplcdp.model.v20200113.GetPageModelResponse;
import com.aliyuncs.miniapplcdp.model.v20200113.GetPageModelResponse.Data;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetPageModelResponseUnmarshaller {

	public static GetPageModelResponse unmarshall(GetPageModelResponse getPageModelResponse, UnmarshallerContext _ctx) {
		
		getPageModelResponse.setRequestId(_ctx.stringValue("GetPageModelResponse.RequestId"));

		Data data = new Data();
		data.setCreateTime(_ctx.stringValue("GetPageModelResponse.Data.CreateTime"));
		data.setModelType(_ctx.stringValue("GetPageModelResponse.Data.ModelType"));
		data.setSubType(_ctx.stringValue("GetPageModelResponse.Data.SubType"));
		data.setRevision(_ctx.integerValue("GetPageModelResponse.Data.Revision"));
		data.setModifiedTime(_ctx.stringValue("GetPageModelResponse.Data.ModifiedTime"));
		data.setDescription(_ctx.stringValue("GetPageModelResponse.Data.Description"));
		data.setSchemaVersion(_ctx.stringValue("GetPageModelResponse.Data.SchemaVersion"));
		data.setAppId(_ctx.stringValue("GetPageModelResponse.Data.AppId"));
		data.setProps(_ctx.mapValue("GetPageModelResponse.Data.Props"));
		data.setModelStatus(_ctx.stringValue("GetPageModelResponse.Data.ModelStatus"));
		data.setModelName(_ctx.stringValue("GetPageModelResponse.Data.ModelName"));
		data.setContent(_ctx.mapValue("GetPageModelResponse.Data.Content"));
		data.setId(_ctx.stringValue("GetPageModelResponse.Data.Id"));
		data.setModelId(_ctx.stringValue("GetPageModelResponse.Data.ModelId"));
		getPageModelResponse.setData(data);
	 
	 	return getPageModelResponse;
	}
}