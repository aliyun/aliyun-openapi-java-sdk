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

import com.aliyuncs.dyplsapi.model.v20170525.CreateSubscriptionResponse;
import com.aliyuncs.dyplsapi.model.v20170525.CreateSubscriptionResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateSubscriptionResponseUnmarshaller {

	public static CreateSubscriptionResponse unmarshall(CreateSubscriptionResponse createSubscriptionResponse, UnmarshallerContext _ctx) {
		
		createSubscriptionResponse.setRequestId(_ctx.stringValue("CreateSubscriptionResponse.RequestId"));
		createSubscriptionResponse.setCode(_ctx.stringValue("CreateSubscriptionResponse.Code"));
		createSubscriptionResponse.setMessage(_ctx.stringValue("CreateSubscriptionResponse.Message"));

		Data data = new Data();
		data.setSubsId(_ctx.stringValue("CreateSubscriptionResponse.Data.SubsId"));
		createSubscriptionResponse.setData(data);
	 
	 	return createSubscriptionResponse;
	}
}