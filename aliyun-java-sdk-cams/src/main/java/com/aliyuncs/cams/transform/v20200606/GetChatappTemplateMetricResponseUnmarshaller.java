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

import com.aliyuncs.cams.model.v20200606.GetChatappTemplateMetricResponse;
import com.aliyuncs.cams.model.v20200606.GetChatappTemplateMetricResponse.返回数据;
import com.aliyuncs.cams.model.v20200606.GetChatappTemplateMetricResponse.返回数据.按钮点击数据;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetChatappTemplateMetricResponseUnmarshaller {

	public static GetChatappTemplateMetricResponse unmarshall(GetChatappTemplateMetricResponse getChatappTemplateMetricResponse, UnmarshallerContext _ctx) {
		
		getChatappTemplateMetricResponse.setRequestId(_ctx.stringValue("GetChatappTemplateMetricResponse.RequestId"));
		getChatappTemplateMetricResponse.setCode(_ctx.stringValue("GetChatappTemplateMetricResponse.Code"));
		getChatappTemplateMetricResponse.setMessage(_ctx.stringValue("GetChatappTemplateMetricResponse.Message"));
		getChatappTemplateMetricResponse.setAccessDeniedDetail(_ctx.stringValue("GetChatappTemplateMetricResponse.AccessDeniedDetail"));

		List<返回数据> data = new ArrayList<返回数据>();
		for (int i = 0; i < _ctx.lengthValue("GetChatappTemplateMetricResponse.Data.Length"); i++) {
			返回数据 返回数据 = new 返回数据();
			返回数据.setTemplateCode(_ctx.stringValue("GetChatappTemplateMetricResponse.Data["+ i +"].TemplateCode"));
			返回数据.setLanguage(_ctx.stringValue("GetChatappTemplateMetricResponse.Data["+ i +"].Language"));
			返回数据.setSentCount(_ctx.integerValue("GetChatappTemplateMetricResponse.Data["+ i +"].SentCount"));
			返回数据.setReadCount(_ctx.integerValue("GetChatappTemplateMetricResponse.Data["+ i +"].ReadCount"));
			返回数据.setDeliveredCount(_ctx.integerValue("GetChatappTemplateMetricResponse.Data["+ i +"].DeliveredCount"));
			返回数据.setStart(_ctx.longValue("GetChatappTemplateMetricResponse.Data["+ i +"].Start"));
			返回数据.setEnd(_ctx.longValue("GetChatappTemplateMetricResponse.Data["+ i +"].End"));

			List<按钮点击数据> cliented = new ArrayList<按钮点击数据>();
			for (int j = 0; j < _ctx.lengthValue("GetChatappTemplateMetricResponse.Data["+ i +"].Cliented.Length"); j++) {
				按钮点击数据 按钮点击数据 = new 按钮点击数据();
				按钮点击数据.setType(_ctx.stringValue("GetChatappTemplateMetricResponse.Data["+ i +"].Cliented["+ j +"].Type"));
				按钮点击数据.setButtonContent(_ctx.stringValue("GetChatappTemplateMetricResponse.Data["+ i +"].Cliented["+ j +"].ButtonContent"));
				按钮点击数据.setCount(_ctx.integerValue("GetChatappTemplateMetricResponse.Data["+ i +"].Cliented["+ j +"].Count"));

				cliented.add(按钮点击数据);
			}
			返回数据.setCliented(cliented);

			data.add(返回数据);
		}
		getChatappTemplateMetricResponse.setData(data);
	 
	 	return getChatappTemplateMetricResponse;
	}
}