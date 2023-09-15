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

package com.aliyuncs.cams.transform.v20200606;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cams.model.v20200606.GetChatappPhoneNumberMetricResponse;
import com.aliyuncs.cams.model.v20200606.GetChatappPhoneNumberMetricResponse.返回数据;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetChatappPhoneNumberMetricResponseUnmarshaller {

	public static GetChatappPhoneNumberMetricResponse unmarshall(GetChatappPhoneNumberMetricResponse getChatappPhoneNumberMetricResponse, UnmarshallerContext _ctx) {
		
		getChatappPhoneNumberMetricResponse.setRequestId(_ctx.stringValue("GetChatappPhoneNumberMetricResponse.RequestId"));
		getChatappPhoneNumberMetricResponse.setCode(_ctx.stringValue("GetChatappPhoneNumberMetricResponse.Code"));
		getChatappPhoneNumberMetricResponse.setMessage(_ctx.stringValue("GetChatappPhoneNumberMetricResponse.Message"));
		getChatappPhoneNumberMetricResponse.setAccessDeniedDetail(_ctx.stringValue("GetChatappPhoneNumberMetricResponse.AccessDeniedDetail"));

		List<返回数据> data = new ArrayList<返回数据>();
		for (int i = 0; i < _ctx.lengthValue("GetChatappPhoneNumberMetricResponse.Data.Length"); i++) {
			返回数据 返回数据 = new 返回数据();
			返回数据.setSentCount(_ctx.integerValue("GetChatappPhoneNumberMetricResponse.Data["+ i +"].SentCount"));
			返回数据.setDeliveredCount(_ctx.integerValue("GetChatappPhoneNumberMetricResponse.Data["+ i +"].DeliveredCount"));
			返回数据.setStart(_ctx.longValue("GetChatappPhoneNumberMetricResponse.Data["+ i +"].Start"));
			返回数据.setEnd(_ctx.longValue("GetChatappPhoneNumberMetricResponse.Data["+ i +"].End"));
			返回数据.setPhoneNumber(_ctx.stringValue("GetChatappPhoneNumberMetricResponse.Data["+ i +"].PhoneNumber"));
			返回数据.setGranularity(_ctx.stringValue("GetChatappPhoneNumberMetricResponse.Data["+ i +"].Granularity"));

			data.add(返回数据);
		}
		getChatappPhoneNumberMetricResponse.setData(data);
	 
	 	return getChatappPhoneNumberMetricResponse;
	}
}