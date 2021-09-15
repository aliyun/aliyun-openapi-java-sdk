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

import com.aliyuncs.miniapplcdp.model.v20200113.UpdateResourceInfoResponse;
import com.aliyuncs.miniapplcdp.model.v20200113.UpdateResourceInfoResponse.Data;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateResourceInfoResponseUnmarshaller {

	public static UpdateResourceInfoResponse unmarshall(UpdateResourceInfoResponse updateResourceInfoResponse, UnmarshallerContext _ctx) {
		
		updateResourceInfoResponse.setRequestId(_ctx.stringValue("UpdateResourceInfoResponse.RequestId"));

		Data data = new Data();
		data.setModuleId(_ctx.stringValue("UpdateResourceInfoResponse.Data.ModuleId"));
		data.setCreateTime(_ctx.stringValue("UpdateResourceInfoResponse.Data.CreateTime"));
		data.setRevision(_ctx.integerValue("UpdateResourceInfoResponse.Data.Revision"));
		data.setModifiedTime(_ctx.stringValue("UpdateResourceInfoResponse.Data.ModifiedTime"));
		data.setResourceType(_ctx.stringValue("UpdateResourceInfoResponse.Data.ResourceType"));
		data.setDescription(_ctx.stringValue("UpdateResourceInfoResponse.Data.Description"));
		data.setSchemaVersion(_ctx.stringValue("UpdateResourceInfoResponse.Data.SchemaVersion"));
		data.setAppId(_ctx.stringValue("UpdateResourceInfoResponse.Data.AppId"));
		data.setScope(_ctx.stringValue("UpdateResourceInfoResponse.Data.Scope"));
		data.setResourceId(_ctx.stringValue("UpdateResourceInfoResponse.Data.ResourceId"));
		data.setContent(_ctx.mapValue("UpdateResourceInfoResponse.Data.Content"));
		data.setResourceName(_ctx.stringValue("UpdateResourceInfoResponse.Data.ResourceName"));
		updateResourceInfoResponse.setData(data);
	 
	 	return updateResourceInfoResponse;
	}
}