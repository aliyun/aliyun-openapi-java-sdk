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

package com.aliyuncs.retailbot.transform.v20210224;

import com.aliyuncs.retailbot.model.v20210224.VerifyOrderResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class VerifyOrderResponseUnmarshaller {

	public static VerifyOrderResponse unmarshall(VerifyOrderResponse verifyOrderResponse, UnmarshallerContext _ctx) {
		
		verifyOrderResponse.setRequestId(_ctx.stringValue("VerifyOrderResponse.requestId"));
		verifyOrderResponse.setSuccess(_ctx.booleanValue("VerifyOrderResponse.success"));
		verifyOrderResponse.setData(_ctx.stringValue("VerifyOrderResponse.data"));
		verifyOrderResponse.setCode(_ctx.stringValue("VerifyOrderResponse.code"));
		verifyOrderResponse.setMessage(_ctx.stringValue("VerifyOrderResponse.message"));
	 
	 	return verifyOrderResponse;
	}
}