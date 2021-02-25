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

package com.aliyuncs.rtc.transform.v20180111;

import com.aliyuncs.rtc.model.v20180111.CreateSubscribeResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateSubscribeResponseUnmarshaller {

	public static CreateSubscribeResponse unmarshall(CreateSubscribeResponse createSubscribeResponse, UnmarshallerContext _ctx) {
		
		createSubscribeResponse.setRequestId(_ctx.stringValue("CreateSubscribeResponse.RequestId"));
		createSubscribeResponse.setSubscribeId(_ctx.stringValue("CreateSubscribeResponse.SubscribeId"));
	 
	 	return createSubscribeResponse;
	}
}