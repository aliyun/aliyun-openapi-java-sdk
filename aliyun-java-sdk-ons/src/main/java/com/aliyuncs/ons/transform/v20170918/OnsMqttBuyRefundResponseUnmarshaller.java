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

package com.aliyuncs.ons.transform.v20170918;

import com.aliyuncs.ons.model.v20170918.OnsMqttBuyRefundResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class OnsMqttBuyRefundResponseUnmarshaller {

	public static OnsMqttBuyRefundResponse unmarshall(OnsMqttBuyRefundResponse onsMqttBuyRefundResponse, UnmarshallerContext context) {
		
		onsMqttBuyRefundResponse.setSuccess(context.booleanValue("OnsMqttBuyRefundResponse.success"));
		onsMqttBuyRefundResponse.setRequestId(context.stringValue("OnsMqttBuyRefundResponse.requestId"));
		onsMqttBuyRefundResponse.setCode(context.stringValue("OnsMqttBuyRefundResponse.code"));
		onsMqttBuyRefundResponse.setMessage(context.stringValue("OnsMqttBuyRefundResponse.message"));
		onsMqttBuyRefundResponse.setData(context.stringValue("OnsMqttBuyRefundResponse.data"));
	 
	 	return onsMqttBuyRefundResponse;
	}
}