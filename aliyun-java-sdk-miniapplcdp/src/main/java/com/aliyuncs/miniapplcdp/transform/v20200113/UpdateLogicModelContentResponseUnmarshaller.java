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

import com.aliyuncs.miniapplcdp.model.v20200113.UpdateLogicModelContentResponse;
import com.aliyuncs.miniapplcdp.model.v20200113.UpdateLogicModelContentResponse.Data;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateLogicModelContentResponseUnmarshaller {

	public static UpdateLogicModelContentResponse unmarshall(UpdateLogicModelContentResponse updateLogicModelContentResponse, UnmarshallerContext _ctx) {
		
		updateLogicModelContentResponse.setRequestId(_ctx.stringValue("UpdateLogicModelContentResponse.RequestId"));

		Data data = new Data();
		data.setCreateTime(_ctx.stringValue("UpdateLogicModelContentResponse.Data.CreateTime"));
		data.setModelType(_ctx.stringValue("UpdateLogicModelContentResponse.Data.ModelType"));
		data.setSubType(_ctx.stringValue("UpdateLogicModelContentResponse.Data.SubType"));
		data.setRevision(_ctx.integerValue("UpdateLogicModelContentResponse.Data.Revision"));
		data.setModifiedTime(_ctx.stringValue("UpdateLogicModelContentResponse.Data.ModifiedTime"));
		data.setDescription(_ctx.stringValue("UpdateLogicModelContentResponse.Data.Description"));
		data.setSchemaVersion(_ctx.stringValue("UpdateLogicModelContentResponse.Data.SchemaVersion"));
		data.setAppId(_ctx.stringValue("UpdateLogicModelContentResponse.Data.AppId"));
		data.setProps(_ctx.mapValue("UpdateLogicModelContentResponse.Data.Props"));
		data.setModelStatus(_ctx.stringValue("UpdateLogicModelContentResponse.Data.ModelStatus"));
		data.setModelName(_ctx.stringValue("UpdateLogicModelContentResponse.Data.ModelName"));
		data.setContent(_ctx.mapValue("UpdateLogicModelContentResponse.Data.Content"));
		data.setId(_ctx.stringValue("UpdateLogicModelContentResponse.Data.Id"));
		data.setModelId(_ctx.stringValue("UpdateLogicModelContentResponse.Data.ModelId"));
		updateLogicModelContentResponse.setData(data);
	 
	 	return updateLogicModelContentResponse;
	}
}