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

package com.aliyuncs.retailadvqa_public.transform.v20200515;

import com.aliyuncs.retailadvqa_public.model.v20200515.DetailTemplateResponse;
import com.aliyuncs.retailadvqa_public.model.v20200515.DetailTemplateResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class DetailTemplateResponseUnmarshaller {

	public static DetailTemplateResponse unmarshall(DetailTemplateResponse detailTemplateResponse, UnmarshallerContext _ctx) {
		
		detailTemplateResponse.setRequestId(_ctx.stringValue("DetailTemplateResponse.RequestId"));
		detailTemplateResponse.setErrorCode(_ctx.stringValue("DetailTemplateResponse.ErrorCode"));
		detailTemplateResponse.setErrorDesc(_ctx.stringValue("DetailTemplateResponse.ErrorDesc"));
		detailTemplateResponse.setSuccess(_ctx.booleanValue("DetailTemplateResponse.Success"));
		detailTemplateResponse.setTraceId(_ctx.stringValue("DetailTemplateResponse.TraceId"));
		detailTemplateResponse.setExStack(_ctx.stringValue("DetailTemplateResponse.ExStack"));

		Data data = new Data();
		data.setId(_ctx.stringValue("DetailTemplateResponse.Data.Id"));
		data.setTemplateStatus(_ctx.longValue("DetailTemplateResponse.Data.TemplateStatus"));
		data.setTemplateType(_ctx.longValue("DetailTemplateResponse.Data.TemplateType"));
		data.setReason(_ctx.stringValue("DetailTemplateResponse.Data.Reason"));
		data.setSmsTemplateCode(_ctx.stringValue("DetailTemplateResponse.Data.SmsTemplateCode"));
		data.setTemplateName(_ctx.stringValue("DetailTemplateResponse.Data.TemplateName"));
		data.setTemplateContent(_ctx.stringValue("DetailTemplateResponse.Data.TemplateContent"));
		data.setSmsContentSuffix(_ctx.stringValue("DetailTemplateResponse.Data.SmsContentSuffix"));
		data.setRemark(_ctx.stringValue("DetailTemplateResponse.Data.Remark"));
		data.setIsVariable(_ctx.longValue("DetailTemplateResponse.Data.IsVariable"));
		data.setPlatformId(_ctx.stringValue("DetailTemplateResponse.Data.PlatformId"));
		detailTemplateResponse.setData(data);
	 
	 	return detailTemplateResponse;
	}
}