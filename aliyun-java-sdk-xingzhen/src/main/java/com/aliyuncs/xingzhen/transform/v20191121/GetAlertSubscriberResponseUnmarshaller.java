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

package com.aliyuncs.xingzhen.transform.v20191121;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.xingzhen.model.v20191121.GetAlertSubscriberResponse;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetAlertSubscriberResponseUnmarshaller {

	public static GetAlertSubscriberResponse unmarshall(GetAlertSubscriberResponse getAlertSubscriberResponse, UnmarshallerContext _ctx) {
		
		getAlertSubscriberResponse.setRequestId(_ctx.stringValue("GetAlertSubscriberResponse.RequestId"));
		getAlertSubscriberResponse.setSuccess(_ctx.booleanValue("GetAlertSubscriberResponse.Success"));
		getAlertSubscriberResponse.setCode(_ctx.stringValue("GetAlertSubscriberResponse.Code"));
		getAlertSubscriberResponse.setMessage(_ctx.stringValue("GetAlertSubscriberResponse.Message"));

		List<Map<Object, Object>> data = _ctx.listMapValue("GetAlertSubscriberResponse.Data");
		getAlertSubscriberResponse.setData(data);
	 
	 	return getAlertSubscriberResponse;
	}
}