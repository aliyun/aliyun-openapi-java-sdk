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

import com.aliyuncs.miniapplcdp.model.v20200113.DeleteModelResponse;
import com.aliyuncs.miniapplcdp.model.v20200113.DeleteModelResponse.Data;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteModelResponseUnmarshaller {

	public static DeleteModelResponse unmarshall(DeleteModelResponse deleteModelResponse, UnmarshallerContext _ctx) {
		
		deleteModelResponse.setRequestId(_ctx.stringValue("DeleteModelResponse.RequestId"));

		Data data = new Data();
		data.setCreateTime(_ctx.stringValue("DeleteModelResponse.Data.CreateTime"));
		data.setModelType(_ctx.stringValue("DeleteModelResponse.Data.ModelType"));
		data.setSubType(_ctx.stringValue("DeleteModelResponse.Data.SubType"));
		data.setRevision(_ctx.integerValue("DeleteModelResponse.Data.Revision"));
		data.setModifiedTime(_ctx.stringValue("DeleteModelResponse.Data.ModifiedTime"));
		data.setDescription(_ctx.stringValue("DeleteModelResponse.Data.Description"));
		data.setSchemaVersion(_ctx.stringValue("DeleteModelResponse.Data.SchemaVersion"));
		data.setAppId(_ctx.stringValue("DeleteModelResponse.Data.AppId"));
		data.setProps(_ctx.mapValue("DeleteModelResponse.Data.Props"));
		data.setModelStatus(_ctx.stringValue("DeleteModelResponse.Data.ModelStatus"));
		data.setModelName(_ctx.stringValue("DeleteModelResponse.Data.ModelName"));
		data.setContent(_ctx.mapValue("DeleteModelResponse.Data.Content"));
		data.setId(_ctx.stringValue("DeleteModelResponse.Data.Id"));
		data.setModelId(_ctx.stringValue("DeleteModelResponse.Data.ModelId"));
		deleteModelResponse.setData(data);
	 
	 	return deleteModelResponse;
	}
}