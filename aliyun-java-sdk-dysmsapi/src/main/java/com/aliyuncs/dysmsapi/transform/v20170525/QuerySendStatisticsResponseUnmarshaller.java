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

import com.aliyuncs.dysmsapi.model.v20170525.QuerySendStatisticsResponse;
import com.aliyuncs.dysmsapi.model.v20170525.QuerySendStatisticsResponse.Data;
import com.aliyuncs.dysmsapi.model.v20170525.QuerySendStatisticsResponse.Data.SmsStatisticsDTO;
import com.aliyuncs.transform.UnmarshallerContext;


public class QuerySendStatisticsResponseUnmarshaller {

	public static QuerySendStatisticsResponse unmarshall(QuerySendStatisticsResponse querySendStatisticsResponse, UnmarshallerContext _ctx) {
		
		querySendStatisticsResponse.setRequestId(_ctx.stringValue("QuerySendStatisticsResponse.RequestId"));
		querySendStatisticsResponse.setCode(_ctx.stringValue("QuerySendStatisticsResponse.Code"));
		querySendStatisticsResponse.setMessage(_ctx.stringValue("QuerySendStatisticsResponse.Message"));

		Data data = new Data();
		data.setTotalSize(_ctx.longValue("QuerySendStatisticsResponse.Data.TotalSize"));

		List<SmsStatisticsDTO> targetList = new ArrayList<SmsStatisticsDTO>();
		for (int i = 0; i < _ctx.lengthValue("QuerySendStatisticsResponse.Data.TargetList.Length"); i++) {
			SmsStatisticsDTO smsStatisticsDTO = new SmsStatisticsDTO();
			smsStatisticsDTO.setTotalCount(_ctx.longValue("QuerySendStatisticsResponse.Data.TargetList["+ i +"].TotalCount"));
			smsStatisticsDTO.setRespondedSuccessCount(_ctx.longValue("QuerySendStatisticsResponse.Data.TargetList["+ i +"].RespondedSuccessCount"));
			smsStatisticsDTO.setRespondedFailCount(_ctx.longValue("QuerySendStatisticsResponse.Data.TargetList["+ i +"].RespondedFailCount"));
			smsStatisticsDTO.setNoRespondedCount(_ctx.longValue("QuerySendStatisticsResponse.Data.TargetList["+ i +"].NoRespondedCount"));
			smsStatisticsDTO.setSendDate(_ctx.stringValue("QuerySendStatisticsResponse.Data.TargetList["+ i +"].SendDate"));

			targetList.add(smsStatisticsDTO);
		}
		data.setTargetList(targetList);
		querySendStatisticsResponse.setData(data);
	 
	 	return querySendStatisticsResponse;
	}
}