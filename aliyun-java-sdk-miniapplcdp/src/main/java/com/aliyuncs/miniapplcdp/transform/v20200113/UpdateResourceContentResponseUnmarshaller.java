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

import com.aliyuncs.miniapplcdp.model.v20200113.UpdateResourceContentResponse;
import com.aliyuncs.miniapplcdp.model.v20200113.UpdateResourceContentResponse.Data;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateResourceContentResponseUnmarshaller {

	public static UpdateResourceContentResponse unmarshall(UpdateResourceContentResponse updateResourceContentResponse, UnmarshallerContext _ctx) {
		
		updateResourceContentResponse.setRequestId(_ctx.stringValue("UpdateResourceContentResponse.RequestId"));

		Data data = new Data();
		data.setModuleId(_ctx.stringValue("UpdateResourceContentResponse.Data.ModuleId"));
		data.setCreateTime(_ctx.stringValue("UpdateResourceContentResponse.Data.CreateTime"));
		data.setRevision(_ctx.integerValue("UpdateResourceContentResponse.Data.Revision"));
		data.setModifiedTime(_ctx.stringValue("UpdateResourceContentResponse.Data.ModifiedTime"));
		data.setResourceType(_ctx.stringValue("UpdateResourceContentResponse.Data.ResourceType"));
		data.setDescription(_ctx.stringValue("UpdateResourceContentResponse.Data.Description"));
		data.setSchemaVersion(_ctx.stringValue("UpdateResourceContentResponse.Data.SchemaVersion"));
		data.setAppId(_ctx.stringValue("UpdateResourceContentResponse.Data.AppId"));
		data.setScope(_ctx.stringValue("UpdateResourceContentResponse.Data.Scope"));
		data.setResourceId(_ctx.stringValue("UpdateResourceContentResponse.Data.ResourceId"));
		data.setContent(_ctx.mapValue("UpdateResourceContentResponse.Data.Content"));
		data.setResourceName(_ctx.stringValue("UpdateResourceContentResponse.Data.ResourceName"));
		updateResourceContentResponse.setData(data);
	 
	 	return updateResourceContentResponse;
	}
}