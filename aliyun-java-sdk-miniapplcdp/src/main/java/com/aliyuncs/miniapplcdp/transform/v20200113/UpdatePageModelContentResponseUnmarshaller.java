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

import com.aliyuncs.miniapplcdp.model.v20200113.UpdatePageModelContentResponse;
import com.aliyuncs.miniapplcdp.model.v20200113.UpdatePageModelContentResponse.Data;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdatePageModelContentResponseUnmarshaller {

	public static UpdatePageModelContentResponse unmarshall(UpdatePageModelContentResponse updatePageModelContentResponse, UnmarshallerContext _ctx) {
		
		updatePageModelContentResponse.setRequestId(_ctx.stringValue("UpdatePageModelContentResponse.RequestId"));

		Data data = new Data();
		data.setCreateTime(_ctx.stringValue("UpdatePageModelContentResponse.Data.CreateTime"));
		data.setModelType(_ctx.stringValue("UpdatePageModelContentResponse.Data.ModelType"));
		data.setSubType(_ctx.stringValue("UpdatePageModelContentResponse.Data.SubType"));
		data.setRevision(_ctx.integerValue("UpdatePageModelContentResponse.Data.Revision"));
		data.setModifiedTime(_ctx.stringValue("UpdatePageModelContentResponse.Data.ModifiedTime"));
		data.setDescription(_ctx.stringValue("UpdatePageModelContentResponse.Data.Description"));
		data.setSchemaVersion(_ctx.stringValue("UpdatePageModelContentResponse.Data.SchemaVersion"));
		data.setAppId(_ctx.stringValue("UpdatePageModelContentResponse.Data.AppId"));
		data.setProps(_ctx.mapValue("UpdatePageModelContentResponse.Data.Props"));
		data.setModelStatus(_ctx.stringValue("UpdatePageModelContentResponse.Data.ModelStatus"));
		data.setModelName(_ctx.stringValue("UpdatePageModelContentResponse.Data.ModelName"));
		data.setContent(_ctx.mapValue("UpdatePageModelContentResponse.Data.Content"));
		data.setId(_ctx.stringValue("UpdatePageModelContentResponse.Data.Id"));
		data.setModelId(_ctx.stringValue("UpdatePageModelContentResponse.Data.ModelId"));
		updatePageModelContentResponse.setData(data);
	 
	 	return updatePageModelContentResponse;
	}
}