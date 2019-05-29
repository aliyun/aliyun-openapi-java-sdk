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

package com.aliyuncs.smartag.transform.v20180313;

import com.aliyuncs.smartag.model.v20180313.SmartAccessGatewayPrepayNotifyPaidResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class SmartAccessGatewayPrepayNotifyPaidResponseUnmarshaller {

	public static SmartAccessGatewayPrepayNotifyPaidResponse unmarshall(SmartAccessGatewayPrepayNotifyPaidResponse smartAccessGatewayPrepayNotifyPaidResponse, UnmarshallerContext context) {
		
		smartAccessGatewayPrepayNotifyPaidResponse.setRequestId(context.stringValue("SmartAccessGatewayPrepayNotifyPaidResponse.RequestId"));
		smartAccessGatewayPrepayNotifyPaidResponse.setData(context.stringValue("SmartAccessGatewayPrepayNotifyPaidResponse.data"));
		smartAccessGatewayPrepayNotifyPaidResponse.setCode(context.stringValue("SmartAccessGatewayPrepayNotifyPaidResponse.code"));
		smartAccessGatewayPrepayNotifyPaidResponse.setSuccess(context.booleanValue("SmartAccessGatewayPrepayNotifyPaidResponse.success"));
		smartAccessGatewayPrepayNotifyPaidResponse.setMessage(context.stringValue("SmartAccessGatewayPrepayNotifyPaidResponse.message"));
	 
	 	return smartAccessGatewayPrepayNotifyPaidResponse;
	}
}