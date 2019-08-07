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

package com.aliyuncs.webplus.transform.v20190320;

import com.aliyuncs.webplus.model.v20190320.CreateConfigTemplateResponse;
import com.aliyuncs.webplus.model.v20190320.CreateConfigTemplateResponse.ConfigTemplate;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateConfigTemplateResponseUnmarshaller {

	public static CreateConfigTemplateResponse unmarshall(CreateConfigTemplateResponse createConfigTemplateResponse, UnmarshallerContext _ctx) {
		
		createConfigTemplateResponse.setRequestId(_ctx.stringValue("CreateConfigTemplateResponse.RequestId"));
		createConfigTemplateResponse.setCode(_ctx.stringValue("CreateConfigTemplateResponse.Code"));
		createConfigTemplateResponse.setMessage(_ctx.stringValue("CreateConfigTemplateResponse.Message"));

		ConfigTemplate configTemplate = new ConfigTemplate();
		configTemplate.setTemplateId(_ctx.stringValue("CreateConfigTemplateResponse.ConfigTemplate.TemplateId"));
		configTemplate.setTemplateName(_ctx.stringValue("CreateConfigTemplateResponse.ConfigTemplate.TemplateName"));
		configTemplate.setAppId(_ctx.stringValue("CreateConfigTemplateResponse.ConfigTemplate.AppId"));
		configTemplate.setStackId(_ctx.stringValue("CreateConfigTemplateResponse.ConfigTemplate.StackId"));
		configTemplate.setAppName(_ctx.stringValue("CreateConfigTemplateResponse.ConfigTemplate.AppName"));
		configTemplate.setStackName(_ctx.stringValue("CreateConfigTemplateResponse.ConfigTemplate.StackName"));
		configTemplate.setCreateTime(_ctx.longValue("CreateConfigTemplateResponse.ConfigTemplate.CreateTime"));
		configTemplate.setUpdateTime(_ctx.longValue("CreateConfigTemplateResponse.ConfigTemplate.UpdateTime"));
		configTemplate.setPkgVersionId(_ctx.stringValue("CreateConfigTemplateResponse.ConfigTemplate.PkgVersionId"));
		configTemplate.setTemplateType(_ctx.stringValue("CreateConfigTemplateResponse.ConfigTemplate.TemplateType"));
		configTemplate.setTemplateDescription(_ctx.stringValue("CreateConfigTemplateResponse.ConfigTemplate.TemplateDescription"));
		configTemplate.setPkgVersionLabel(_ctx.stringValue("CreateConfigTemplateResponse.ConfigTemplate.PkgVersionLabel"));
		createConfigTemplateResponse.setConfigTemplate(configTemplate);
	 
	 	return createConfigTemplateResponse;
	}
}