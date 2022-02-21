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

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dysmsapi.model.v20170525.QuerySmsTemplateListResponse;
import com.aliyuncs.dysmsapi.model.v20170525.QuerySmsTemplateListResponse.SmsStatsResultDTO;
import com.aliyuncs.dysmsapi.model.v20170525.QuerySmsTemplateListResponse.SmsStatsResultDTO.Reason;
import com.aliyuncs.transform.UnmarshallerContext;


public class QuerySmsTemplateListResponseUnmarshaller {

	public static QuerySmsTemplateListResponse unmarshall(QuerySmsTemplateListResponse querySmsTemplateListResponse, UnmarshallerContext _ctx) {
		
		querySmsTemplateListResponse.setRequestId(_ctx.stringValue("QuerySmsTemplateListResponse.RequestId"));
		querySmsTemplateListResponse.setCode(_ctx.stringValue("QuerySmsTemplateListResponse.Code"));
		querySmsTemplateListResponse.setMessage(_ctx.stringValue("QuerySmsTemplateListResponse.Message"));

		List<SmsStatsResultDTO> smsTemplateList = new ArrayList<SmsStatsResultDTO>();
		for (int i = 0; i < _ctx.lengthValue("QuerySmsTemplateListResponse.SmsTemplateList.Length"); i++) {
			SmsStatsResultDTO smsStatsResultDTO = new SmsStatsResultDTO();
			smsStatsResultDTO.setTemplateCode(_ctx.stringValue("QuerySmsTemplateListResponse.SmsTemplateList["+ i +"].TemplateCode"));
			smsStatsResultDTO.setTemplateName(_ctx.stringValue("QuerySmsTemplateListResponse.SmsTemplateList["+ i +"].TemplateName"));
			smsStatsResultDTO.setTemplateType(_ctx.integerValue("QuerySmsTemplateListResponse.SmsTemplateList["+ i +"].TemplateType"));
			smsStatsResultDTO.setAuditStatus(_ctx.stringValue("QuerySmsTemplateListResponse.SmsTemplateList["+ i +"].AuditStatus"));
			smsStatsResultDTO.setTemplateContent(_ctx.stringValue("QuerySmsTemplateListResponse.SmsTemplateList["+ i +"].TemplateContent"));
			smsStatsResultDTO.setCreateDate(_ctx.stringValue("QuerySmsTemplateListResponse.SmsTemplateList["+ i +"].CreateDate"));
			smsStatsResultDTO.setOrderId(_ctx.stringValue("QuerySmsTemplateListResponse.SmsTemplateList["+ i +"].OrderId"));

			Reason reason = new Reason();
			reason.setRejectDate(_ctx.stringValue("QuerySmsTemplateListResponse.SmsTemplateList["+ i +"].Reason.RejectDate"));
			reason.setRejectInfo(_ctx.stringValue("QuerySmsTemplateListResponse.SmsTemplateList["+ i +"].Reason.RejectInfo"));
			reason.setRejectSubInfo(_ctx.stringValue("QuerySmsTemplateListResponse.SmsTemplateList["+ i +"].Reason.RejectSubInfo"));
			smsStatsResultDTO.setReason(reason);

			smsTemplateList.add(smsStatsResultDTO);
		}
		querySmsTemplateListResponse.setSmsTemplateList(smsTemplateList);
	 
	 	return querySmsTemplateListResponse;
	}
}