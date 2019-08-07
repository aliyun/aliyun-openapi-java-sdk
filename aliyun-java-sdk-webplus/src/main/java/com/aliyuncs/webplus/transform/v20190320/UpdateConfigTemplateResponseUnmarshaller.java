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

import com.aliyuncs.webplus.model.v20190320.UpdateConfigTemplateResponse;
import com.aliyuncs.webplus.model.v20190320.UpdateConfigTemplateResponse.ConfigTemplate;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateConfigTemplateResponseUnmarshaller {

	public static UpdateConfigTemplateResponse unmarshall(UpdateConfigTemplateResponse updateConfigTemplateResponse, UnmarshallerContext _ctx) {
		
		updateConfigTemplateResponse.setRequestId(_ctx.stringValue("UpdateConfigTemplateResponse.RequestId"));
		updateConfigTemplateResponse.setCode(_ctx.stringValue("UpdateConfigTemplateResponse.Code"));
		updateConfigTemplateResponse.setMessage(_ctx.stringValue("UpdateConfigTemplateResponse.Message"));

		ConfigTemplate configTemplate = new ConfigTemplate();
		configTemplate.setTemplateId(_ctx.stringValue("UpdateConfigTemplateResponse.ConfigTemplate.TemplateId"));
		configTemplate.setTemplateName(_ctx.stringValue("UpdateConfigTemplateResponse.ConfigTemplate.TemplateName"));
		configTemplate.setAppId(_ctx.stringValue("UpdateConfigTemplateResponse.ConfigTemplate.AppId"));
		configTemplate.setStackId(_ctx.stringValue("UpdateConfigTemplateResponse.ConfigTemplate.StackId"));
		configTemplate.setAppName(_ctx.stringValue("UpdateConfigTemplateResponse.ConfigTemplate.AppName"));
		configTemplate.setStackName(_ctx.stringValue("UpdateConfigTemplateResponse.ConfigTemplate.StackName"));
		configTemplate.setCreateTime(_ctx.longValue("UpdateConfigTemplateResponse.ConfigTemplate.CreateTime"));
		configTemplate.setUpdateTime(_ctx.longValue("UpdateConfigTemplateResponse.ConfigTemplate.UpdateTime"));
		updateConfigTemplateResponse.setConfigTemplate(configTemplate);
	 
	 	return updateConfigTemplateResponse;
	}
}