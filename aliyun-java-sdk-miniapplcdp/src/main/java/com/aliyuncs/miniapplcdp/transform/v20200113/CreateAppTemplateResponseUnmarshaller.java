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

import com.aliyuncs.miniapplcdp.model.v20200113.CreateAppTemplateResponse;
import com.aliyuncs.miniapplcdp.model.v20200113.CreateAppTemplateResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateAppTemplateResponseUnmarshaller {

	public static CreateAppTemplateResponse unmarshall(CreateAppTemplateResponse createAppTemplateResponse, UnmarshallerContext _ctx) {
		
		createAppTemplateResponse.setRequestId(_ctx.stringValue("CreateAppTemplateResponse.RequestId"));

		Data data = new Data();
		data.setAppId(_ctx.stringValue("CreateAppTemplateResponse.Data.AppId"));
		data.setAppType(_ctx.stringValue("CreateAppTemplateResponse.Data.AppType"));
		data.setDescription(_ctx.stringValue("CreateAppTemplateResponse.Data.Description"));
		data.setCreateTime(_ctx.stringValue("CreateAppTemplateResponse.Data.CreateTime"));
		data.setModifiedTime(_ctx.stringValue("CreateAppTemplateResponse.Data.ModifiedTime"));
		data.setIcon(_ctx.stringValue("CreateAppTemplateResponse.Data.Icon"));
		data.setLastEditTime(_ctx.stringValue("CreateAppTemplateResponse.Data.LastEditTime"));
		data.setMainModuleId(_ctx.stringValue("CreateAppTemplateResponse.Data.MainModuleId"));
		data.setAppName(_ctx.stringValue("CreateAppTemplateResponse.Data.AppName"));
		data.setSchemaVersion(_ctx.stringValue("CreateAppTemplateResponse.Data.SchemaVersion"));
		data.setSource(_ctx.stringValue("CreateAppTemplateResponse.Data.Source"));
		data.setAppStatus(_ctx.stringValue("CreateAppTemplateResponse.Data.AppStatus"));
		data.setTemplateId(_ctx.stringValue("CreateAppTemplateResponse.Data.TemplateId"));
		data.setTemplateType(_ctx.stringValue("CreateAppTemplateResponse.Data.TemplateType"));
		createAppTemplateResponse.setData(data);
	 
	 	return createAppTemplateResponse;
	}
}