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

package com.aliyuncs.cspro.transform.v20180315;

import com.aliyuncs.cspro.model.v20180315.PostPunishOrderResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class PostPunishOrderResponseUnmarshaller {

	public static PostPunishOrderResponse unmarshall(PostPunishOrderResponse postPunishOrderResponse, UnmarshallerContext _ctx) {
		
		postPunishOrderResponse.setRequestId(_ctx.stringValue("PostPunishOrderResponse.RequestId"));
		postPunishOrderResponse.setCode(_ctx.integerValue("PostPunishOrderResponse.Code"));
		postPunishOrderResponse.setMessage(_ctx.stringValue("PostPunishOrderResponse.Message"));
		postPunishOrderResponse.setSuccess(_ctx.booleanValue("PostPunishOrderResponse.Success"));
	 
	 	return postPunishOrderResponse;
	}
}