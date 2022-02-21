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

import com.aliyuncs.dysmsapi.model.v20170525.QuerySmsSignListResponse;
import com.aliyuncs.dysmsapi.model.v20170525.QuerySmsSignListResponse.QuerySmsSignDTO;
import com.aliyuncs.dysmsapi.model.v20170525.QuerySmsSignListResponse.QuerySmsSignDTO.Reason;
import com.aliyuncs.transform.UnmarshallerContext;


public class QuerySmsSignListResponseUnmarshaller {

	public static QuerySmsSignListResponse unmarshall(QuerySmsSignListResponse querySmsSignListResponse, UnmarshallerContext _ctx) {
		
		querySmsSignListResponse.setRequestId(_ctx.stringValue("QuerySmsSignListResponse.RequestId"));
		querySmsSignListResponse.setCode(_ctx.stringValue("QuerySmsSignListResponse.Code"));
		querySmsSignListResponse.setMessage(_ctx.stringValue("QuerySmsSignListResponse.Message"));

		List<QuerySmsSignDTO> smsSignList = new ArrayList<QuerySmsSignDTO>();
		for (int i = 0; i < _ctx.lengthValue("QuerySmsSignListResponse.SmsSignList.Length"); i++) {
			QuerySmsSignDTO querySmsSignDTO = new QuerySmsSignDTO();
			querySmsSignDTO.setSignName(_ctx.stringValue("QuerySmsSignListResponse.SmsSignList["+ i +"].SignName"));
			querySmsSignDTO.setAuditStatus(_ctx.stringValue("QuerySmsSignListResponse.SmsSignList["+ i +"].AuditStatus"));
			querySmsSignDTO.setCreateDate(_ctx.stringValue("QuerySmsSignListResponse.SmsSignList["+ i +"].CreateDate"));
			querySmsSignDTO.setBusinessType(_ctx.stringValue("QuerySmsSignListResponse.SmsSignList["+ i +"].BusinessType"));
			querySmsSignDTO.setOrderId(_ctx.stringValue("QuerySmsSignListResponse.SmsSignList["+ i +"].OrderId"));

			Reason reason = new Reason();
			reason.setRejectSubInfo(_ctx.stringValue("QuerySmsSignListResponse.SmsSignList["+ i +"].Reason.RejectSubInfo"));
			reason.setRejectDate(_ctx.stringValue("QuerySmsSignListResponse.SmsSignList["+ i +"].Reason.RejectDate"));
			reason.setRejectInfo(_ctx.stringValue("QuerySmsSignListResponse.SmsSignList["+ i +"].Reason.RejectInfo"));
			querySmsSignDTO.setReason(reason);

			smsSignList.add(querySmsSignDTO);
		}
		querySmsSignListResponse.setSmsSignList(smsSignList);
	 
	 	return querySmsSignListResponse;
	}
}