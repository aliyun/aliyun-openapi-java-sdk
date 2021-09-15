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

import com.aliyuncs.miniapplcdp.model.v20200113.GetResourceResponse;
import com.aliyuncs.miniapplcdp.model.v20200113.GetResourceResponse.Data;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetResourceResponseUnmarshaller {

	public static GetResourceResponse unmarshall(GetResourceResponse getResourceResponse, UnmarshallerContext _ctx) {
		
		getResourceResponse.setRequestId(_ctx.stringValue("GetResourceResponse.RequestId"));

		Data data = new Data();
		data.setModuleId(_ctx.stringValue("GetResourceResponse.Data.ModuleId"));
		data.setCreateTime(_ctx.stringValue("GetResourceResponse.Data.CreateTime"));
		data.setRevision(_ctx.integerValue("GetResourceResponse.Data.Revision"));
		data.setModifiedTime(_ctx.stringValue("GetResourceResponse.Data.ModifiedTime"));
		data.setResourceType(_ctx.stringValue("GetResourceResponse.Data.ResourceType"));
		data.setDescription(_ctx.stringValue("GetResourceResponse.Data.Description"));
		data.setSchemaVersion(_ctx.stringValue("GetResourceResponse.Data.SchemaVersion"));
		data.setAppId(_ctx.stringValue("GetResourceResponse.Data.AppId"));
		data.setScope(_ctx.stringValue("GetResourceResponse.Data.Scope"));
		data.setResourceId(_ctx.stringValue("GetResourceResponse.Data.ResourceId"));
		data.setContent(_ctx.mapValue("GetResourceResponse.Data.Content"));
		data.setResourceName(_ctx.stringValue("GetResourceResponse.Data.ResourceName"));
		getResourceResponse.setData(data);
	 
	 	return getResourceResponse;
	}
}