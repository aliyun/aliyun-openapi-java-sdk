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

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.retailadvqa_public.model.v20200515.SmsShortUrlTaskQueryResponse;
import com.aliyuncs.retailadvqa_public.model.v20200515.SmsShortUrlTaskQueryResponse.Data;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class SmsShortUrlTaskQueryResponseUnmarshaller {

	public static SmsShortUrlTaskQueryResponse unmarshall(SmsShortUrlTaskQueryResponse smsShortUrlTaskQueryResponse, UnmarshallerContext _ctx) {
		
		smsShortUrlTaskQueryResponse.setRequestId(_ctx.stringValue("SmsShortUrlTaskQueryResponse.RequestId"));
		smsShortUrlTaskQueryResponse.setErrorDesc(_ctx.stringValue("SmsShortUrlTaskQueryResponse.ErrorDesc"));
		smsShortUrlTaskQueryResponse.setTraceId(_ctx.stringValue("SmsShortUrlTaskQueryResponse.TraceId"));
		smsShortUrlTaskQueryResponse.setErrorCode(_ctx.stringValue("SmsShortUrlTaskQueryResponse.ErrorCode"));
		smsShortUrlTaskQueryResponse.setSuccess(_ctx.booleanValue("SmsShortUrlTaskQueryResponse.Success"));

		Data data = new Data();
		data.setTotalNum(_ctx.longValue("SmsShortUrlTaskQueryResponse.Data.TotalNum"));
		data.setPageSize(_ctx.longValue("SmsShortUrlTaskQueryResponse.Data.PageSize"));
		data.setPageNum(_ctx.longValue("SmsShortUrlTaskQueryResponse.Data.PageNum"));

		List<Map<Object, Object>> data1 = _ctx.listMapValue("SmsShortUrlTaskQueryResponse.Data.Data");
		data.setData1(data1);
		smsShortUrlTaskQueryResponse.setData(data);
	 
	 	return smsShortUrlTaskQueryResponse;
	}
}