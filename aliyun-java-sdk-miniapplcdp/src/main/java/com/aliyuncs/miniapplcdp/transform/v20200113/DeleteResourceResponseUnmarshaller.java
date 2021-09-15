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

import com.aliyuncs.miniapplcdp.model.v20200113.DeleteResourceResponse;
import com.aliyuncs.miniapplcdp.model.v20200113.DeleteResourceResponse.Data;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteResourceResponseUnmarshaller {

	public static DeleteResourceResponse unmarshall(DeleteResourceResponse deleteResourceResponse, UnmarshallerContext _ctx) {
		
		deleteResourceResponse.setRequestId(_ctx.stringValue("DeleteResourceResponse.RequestId"));

		Data data = new Data();
		data.setModuleId(_ctx.stringValue("DeleteResourceResponse.Data.ModuleId"));
		data.setCreateTime(_ctx.stringValue("DeleteResourceResponse.Data.CreateTime"));
		data.setRevision(_ctx.integerValue("DeleteResourceResponse.Data.Revision"));
		data.setModifiedTime(_ctx.stringValue("DeleteResourceResponse.Data.ModifiedTime"));
		data.setResourceType(_ctx.stringValue("DeleteResourceResponse.Data.ResourceType"));
		data.setDescription(_ctx.stringValue("DeleteResourceResponse.Data.Description"));
		data.setSchemaVersion(_ctx.stringValue("DeleteResourceResponse.Data.SchemaVersion"));
		data.setAppId(_ctx.stringValue("DeleteResourceResponse.Data.AppId"));
		data.setScope(_ctx.stringValue("DeleteResourceResponse.Data.Scope"));
		data.setResourceId(_ctx.stringValue("DeleteResourceResponse.Data.ResourceId"));
		data.setContent(_ctx.mapValue("DeleteResourceResponse.Data.Content"));
		data.setResourceName(_ctx.stringValue("DeleteResourceResponse.Data.ResourceName"));
		deleteResourceResponse.setData(data);
	 
	 	return deleteResourceResponse;
	}
}