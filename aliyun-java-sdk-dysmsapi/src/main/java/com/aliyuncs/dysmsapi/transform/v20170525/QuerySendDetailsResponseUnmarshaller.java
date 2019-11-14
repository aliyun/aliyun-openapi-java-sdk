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

import com.aliyuncs.dysmsapi.model.v20170525.QuerySendDetailsResponse;
import com.aliyuncs.dysmsapi.model.v20170525.QuerySendDetailsResponse.SmsSendDetailDTO;
import com.aliyuncs.transform.UnmarshallerContext;


public class QuerySendDetailsResponseUnmarshaller {

	public static QuerySendDetailsResponse unmarshall(QuerySendDetailsResponse querySendDetailsResponse, UnmarshallerContext _ctx) {
		
		querySendDetailsResponse.setRequestId(_ctx.stringValue("QuerySendDetailsResponse.RequestId"));
		querySendDetailsResponse.setCode(_ctx.stringValue("QuerySendDetailsResponse.Code"));
		querySendDetailsResponse.setMessage(_ctx.stringValue("QuerySendDetailsResponse.Message"));
		querySendDetailsResponse.setTotalCount(_ctx.stringValue("QuerySendDetailsResponse.TotalCount"));

		List<SmsSendDetailDTO> smsSendDetailDTOs = new ArrayList<SmsSendDetailDTO>();
		for (int i = 0; i < _ctx.lengthValue("QuerySendDetailsResponse.SmsSendDetailDTOs.Length"); i++) {
			SmsSendDetailDTO smsSendDetailDTO = new SmsSendDetailDTO();
			smsSendDetailDTO.setPhoneNum(_ctx.stringValue("QuerySendDetailsResponse.SmsSendDetailDTOs["+ i +"].PhoneNum"));
			smsSendDetailDTO.setSendStatus(_ctx.longValue("QuerySendDetailsResponse.SmsSendDetailDTOs["+ i +"].SendStatus"));
			smsSendDetailDTO.setErrCode(_ctx.stringValue("QuerySendDetailsResponse.SmsSendDetailDTOs["+ i +"].ErrCode"));
			smsSendDetailDTO.setTemplateCode(_ctx.stringValue("QuerySendDetailsResponse.SmsSendDetailDTOs["+ i +"].TemplateCode"));
			smsSendDetailDTO.setContent(_ctx.stringValue("QuerySendDetailsResponse.SmsSendDetailDTOs["+ i +"].Content"));
			smsSendDetailDTO.setSendDate(_ctx.stringValue("QuerySendDetailsResponse.SmsSendDetailDTOs["+ i +"].SendDate"));
			smsSendDetailDTO.setReceiveDate(_ctx.stringValue("QuerySendDetailsResponse.SmsSendDetailDTOs["+ i +"].ReceiveDate"));
			smsSendDetailDTO.setOutId(_ctx.stringValue("QuerySendDetailsResponse.SmsSendDetailDTOs["+ i +"].OutId"));

			smsSendDetailDTOs.add(smsSendDetailDTO);
		}
		querySendDetailsResponse.setSmsSendDetailDTOs(smsSendDetailDTOs);
	 
	 	return querySendDetailsResponse;
	}
}