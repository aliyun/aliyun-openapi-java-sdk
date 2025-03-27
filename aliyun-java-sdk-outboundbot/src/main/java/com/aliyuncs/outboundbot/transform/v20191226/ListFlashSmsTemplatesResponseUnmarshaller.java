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

package com.aliyuncs.outboundbot.transform.v20191226;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.outboundbot.model.v20191226.ListFlashSmsTemplatesResponse;
import com.aliyuncs.outboundbot.model.v20191226.ListFlashSmsTemplatesResponse.FlashSmsTemplate;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListFlashSmsTemplatesResponseUnmarshaller {

	public static ListFlashSmsTemplatesResponse unmarshall(ListFlashSmsTemplatesResponse listFlashSmsTemplatesResponse, UnmarshallerContext _ctx) {
		
		listFlashSmsTemplatesResponse.setRequestId(_ctx.stringValue("ListFlashSmsTemplatesResponse.RequestId"));
		listFlashSmsTemplatesResponse.setHttpStatusCode(_ctx.integerValue("ListFlashSmsTemplatesResponse.HttpStatusCode"));
		listFlashSmsTemplatesResponse.setCode(_ctx.stringValue("ListFlashSmsTemplatesResponse.Code"));
		listFlashSmsTemplatesResponse.setMessage(_ctx.stringValue("ListFlashSmsTemplatesResponse.Message"));
		listFlashSmsTemplatesResponse.setSuccess(_ctx.booleanValue("ListFlashSmsTemplatesResponse.Success"));

		List<FlashSmsTemplate> data = new ArrayList<FlashSmsTemplate>();
		for (int i = 0; i < _ctx.lengthValue("ListFlashSmsTemplatesResponse.Data.Length"); i++) {
			FlashSmsTemplate flashSmsTemplate = new FlashSmsTemplate();
			flashSmsTemplate.setTemplateName(_ctx.stringValue("ListFlashSmsTemplatesResponse.Data["+ i +"].TemplateName"));
			flashSmsTemplate.setTemplateId(_ctx.stringValue("ListFlashSmsTemplatesResponse.Data["+ i +"].TemplateId"));
			flashSmsTemplate.setTemplateContent(_ctx.stringValue("ListFlashSmsTemplatesResponse.Data["+ i +"].TemplateContent"));

			data.add(flashSmsTemplate);
		}
		listFlashSmsTemplatesResponse.setData(data);
	 
	 	return listFlashSmsTemplatesResponse;
	}
}