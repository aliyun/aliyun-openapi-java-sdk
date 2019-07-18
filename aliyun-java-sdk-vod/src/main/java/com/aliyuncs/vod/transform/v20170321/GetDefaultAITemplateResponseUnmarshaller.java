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

import com.aliyuncs.vod.model.v20170321.GetDefaultAITemplateResponse;
import com.aliyuncs.vod.model.v20170321.GetDefaultAITemplateResponse.TemplateInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetDefaultAITemplateResponseUnmarshaller {

	public static GetDefaultAITemplateResponse unmarshall(GetDefaultAITemplateResponse getDefaultAITemplateResponse, UnmarshallerContext _ctx) {
		
		getDefaultAITemplateResponse.setRequestId(_ctx.stringValue("GetDefaultAITemplateResponse.RequestId"));

		TemplateInfo templateInfo = new TemplateInfo();
		templateInfo.setTemplateId(_ctx.stringValue("GetDefaultAITemplateResponse.TemplateInfo.TemplateId"));
		templateInfo.setTemplateType(_ctx.stringValue("GetDefaultAITemplateResponse.TemplateInfo.TemplateType"));
		templateInfo.setTemplateName(_ctx.stringValue("GetDefaultAITemplateResponse.TemplateInfo.TemplateName"));
		templateInfo.setTemplateConfig(_ctx.stringValue("GetDefaultAITemplateResponse.TemplateInfo.TemplateConfig"));
		templateInfo.setSource(_ctx.stringValue("GetDefaultAITemplateResponse.TemplateInfo.Source"));
		templateInfo.setIsDefault(_ctx.stringValue("GetDefaultAITemplateResponse.TemplateInfo.IsDefault"));
		templateInfo.setCreationTime(_ctx.stringValue("GetDefaultAITemplateResponse.TemplateInfo.CreationTime"));
		templateInfo.setModifyTime(_ctx.stringValue("GetDefaultAITemplateResponse.TemplateInfo.ModifyTime"));
		getDefaultAITemplateResponse.setTemplateInfo(templateInfo);
	 
	 	return getDefaultAITemplateResponse;
	}
}