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

package com.aliyuncs.multimediaai.transform.v20190810;

import com.aliyuncs.multimediaai.model.v20190810.GetTemplateResponse;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetTemplateResponseUnmarshaller {

	public static GetTemplateResponse unmarshall(GetTemplateResponse getTemplateResponse, UnmarshallerContext _ctx) {
		
		getTemplateResponse.setRequestId(_ctx.stringValue("GetTemplateResponse.RequestId"));
		getTemplateResponse.setTemplateId(_ctx.stringValue("GetTemplateResponse.TemplateId"));
		getTemplateResponse.setTemplateName(_ctx.stringValue("GetTemplateResponse.TemplateName"));
		getTemplateResponse.setContent(_ctx.mapValue("GetTemplateResponse.Content"));
		getTemplateResponse.setCategory(_ctx.integerValue("GetTemplateResponse.Category"));
		getTemplateResponse.setIsDefault(_ctx.booleanValue("GetTemplateResponse.IsDefault"));
		getTemplateResponse.setCreateTime(_ctx.stringValue("GetTemplateResponse.CreateTime"));
		getTemplateResponse.setUpdateTime(_ctx.stringValue("GetTemplateResponse.UpdateTime"));
	 
	 	return getTemplateResponse;
	}
}