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

package com.aliyuncs.dysmsapi.transform.v20170525;

import com.aliyuncs.dysmsapi.model.v20170525.QuerySmsTemplateResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class QuerySmsTemplateResponseUnmarshaller {

	public static QuerySmsTemplateResponse unmarshall(QuerySmsTemplateResponse querySmsTemplateResponse, UnmarshallerContext _ctx) {
		
		querySmsTemplateResponse.setRequestId(_ctx.stringValue("QuerySmsTemplateResponse.RequestId"));
		querySmsTemplateResponse.setCode(_ctx.stringValue("QuerySmsTemplateResponse.Code"));
		querySmsTemplateResponse.setMessage(_ctx.stringValue("QuerySmsTemplateResponse.Message"));
		querySmsTemplateResponse.setTemplateStatus(_ctx.integerValue("QuerySmsTemplateResponse.TemplateStatus"));
		querySmsTemplateResponse.setReason(_ctx.stringValue("QuerySmsTemplateResponse.Reason"));
		querySmsTemplateResponse.setTemplateCode(_ctx.stringValue("QuerySmsTemplateResponse.TemplateCode"));
		querySmsTemplateResponse.setTemplateType(_ctx.integerValue("QuerySmsTemplateResponse.TemplateType"));
		querySmsTemplateResponse.setTemplateName(_ctx.stringValue("QuerySmsTemplateResponse.TemplateName"));
		querySmsTemplateResponse.setTemplateContent(_ctx.stringValue("QuerySmsTemplateResponse.TemplateContent"));
		querySmsTemplateResponse.setCreateDate(_ctx.stringValue("QuerySmsTemplateResponse.CreateDate"));
	 
	 	return querySmsTemplateResponse;
	}
}