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

	public static GetAITemplateResponse unmarshall(GetAITemplateResponse getAITemplateResponse, UnmarshallerContext context) {
		
		getAITemplateResponse.setRequestId(context.stringValue("GetAITemplateResponse.RequestId"));

		TemplateInfo templateInfo = new TemplateInfo();
		templateInfo.setTemplateId(context.stringValue("GetAITemplateResponse.TemplateInfo.TemplateId"));
		templateInfo.setTemplateType(context.stringValue("GetAITemplateResponse.TemplateInfo.TemplateType"));
		templateInfo.setTemplateName(context.stringValue("GetAITemplateResponse.TemplateInfo.TemplateName"));
		templateInfo.setTemplateConfig(context.stringValue("GetAITemplateResponse.TemplateInfo.TemplateConfig"));
		templateInfo.setSource(context.stringValue("GetAITemplateResponse.TemplateInfo.Source"));
		templateInfo.setIsDefault(context.stringValue("GetAITemplateResponse.TemplateInfo.IsDefault"));
		templateInfo.setCreationTime(context.stringValue("GetAITemplateResponse.TemplateInfo.CreationTime"));
		templateInfo.setModifyTime(context.stringValue("GetAITemplateResponse.TemplateInfo.ModifyTime"));
		getAITemplateResponse.setTemplateInfo(templateInfo);
	 
	 	return getAITemplateResponse;
	}
}