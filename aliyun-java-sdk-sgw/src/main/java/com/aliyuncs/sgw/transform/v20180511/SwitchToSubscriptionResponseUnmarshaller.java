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

package com.aliyuncs.sgw.transform.v20180511;

import com.aliyuncs.sgw.model.v20180511.SwitchToSubscriptionResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class SwitchToSubscriptionResponseUnmarshaller {

	public static SwitchToSubscriptionResponse unmarshall(SwitchToSubscriptionResponse switchToSubscriptionResponse, UnmarshallerContext _ctx) {
		
		switchToSubscriptionResponse.setRequestId(_ctx.stringValue("SwitchToSubscriptionResponse.RequestId"));
		switchToSubscriptionResponse.setSuccess(_ctx.booleanValue("SwitchToSubscriptionResponse.Success"));
		switchToSubscriptionResponse.setCode(_ctx.stringValue("SwitchToSubscriptionResponse.Code"));
		switchToSubscriptionResponse.setMessage(_ctx.stringValue("SwitchToSubscriptionResponse.Message"));
		switchToSubscriptionResponse.setSubscriptionURL(_ctx.stringValue("SwitchToSubscriptionResponse.SubscriptionURL"));
	 
	 	return switchToSubscriptionResponse;
	}
}