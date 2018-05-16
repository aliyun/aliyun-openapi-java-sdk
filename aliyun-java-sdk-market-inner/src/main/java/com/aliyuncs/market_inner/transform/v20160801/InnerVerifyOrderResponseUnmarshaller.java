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

package com.aliyuncs.market_inner.transform.v20160801;

import com.aliyuncs.market_inner.model.v20160801.InnerVerifyOrderResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class InnerVerifyOrderResponseUnmarshaller {

	public static InnerVerifyOrderResponse unmarshall(InnerVerifyOrderResponse innerVerifyOrderResponse, UnmarshallerContext context) {
		
		innerVerifyOrderResponse.setRequestId(context.stringValue("InnerVerifyOrderResponse.RequestId"));
		innerVerifyOrderResponse.setSuccess(context.booleanValue("InnerVerifyOrderResponse.Success"));
		innerVerifyOrderResponse.setData(context.stringValue("InnerVerifyOrderResponse.Data"));
		innerVerifyOrderResponse.setCode(context.stringValue("InnerVerifyOrderResponse.Code"));
		innerVerifyOrderResponse.setMessage(context.stringValue("InnerVerifyOrderResponse.Message"));
	 
	 	return innerVerifyOrderResponse;
	}
}