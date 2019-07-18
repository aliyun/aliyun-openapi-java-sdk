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

package com.aliyuncs.vod.transform.v20170321;

import com.aliyuncs.vod.model.v20170321.GetAITemplateResponse;
import com.aliyuncs.vod.model.v20170321.GetAITemplateResponse.TemplateInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetAITemplateResponseUnmarshaller {

	public static GetAITemplateResponse unmarshall(GetAITemplateResponse getAITemplateResponse, UnmarshallerContext _ctx) {
		
		getAITemplateResponse.setRequestId(_ctx.stringValue("GetAITemplateResponse.RequestId"));

		TemplateInfo templateInfo = new TemplateInfo();
		templateInfo.setTemplateId(_ctx.stringValue("GetAITemplateResponse.TemplateInfo.TemplateId"));
		templateInfo.setTemplateType(_ctx.stringValue("GetAITemplateResponse.TemplateInfo.TemplateType"));
		templateInfo.setTemplateName(_ctx.stringValue("GetAITemplateResponse.TemplateInfo.TemplateName"));
		templateInfo.setTemplateConfig(_ctx.stringValue("GetAITemplateResponse.TemplateInfo.TemplateConfig"));
		templateInfo.setSource(_ctx.stringValue("GetAITemplateResponse.TemplateInfo.Source"));
		templateInfo.setIsDefault(_ctx.stringValue("GetAITemplateResponse.TemplateInfo.IsDefault"));
		templateInfo.setCreationTime(_ctx.stringValue("GetAITemplateResponse.TemplateInfo.CreationTime"));
		templateInfo.setModifyTime(_ctx.stringValue("GetAITemplateResponse.TemplateInfo.ModifyTime"));
		getAITemplateResponse.setTemplateInfo(templateInfo);
	 
	 	return getAITemplateResponse;
	}
}