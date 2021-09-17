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

package com.aliyuncs.dyplsapi.transform.v20170525;

import com.aliyuncs.dyplsapi.model.v20170525.UnbindSubscriptionResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class UnbindSubscriptionResponseUnmarshaller {

	public static UnbindSubscriptionResponse unmarshall(UnbindSubscriptionResponse unbindSubscriptionResponse, UnmarshallerContext _ctx) {
		
		unbindSubscriptionResponse.setRequestId(_ctx.stringValue("UnbindSubscriptionResponse.RequestId"));
		unbindSubscriptionResponse.setCode(_ctx.stringValue("UnbindSubscriptionResponse.Code"));
		unbindSubscriptionResponse.setMessage(_ctx.stringValue("UnbindSubscriptionResponse.Message"));
		unbindSubscriptionResponse.setChargeId(_ctx.stringValue("UnbindSubscriptionResponse.ChargeId"));
	 
	 	return unbindSubscriptionResponse;
	}
}