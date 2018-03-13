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

import com.aliyuncs.ons.model.v20170918.OnsBuyOrdersProduceResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class OnsBuyOrdersProduceResponseUnmarshaller {

	public static OnsBuyOrdersProduceResponse unmarshall(OnsBuyOrdersProduceResponse onsBuyOrdersProduceResponse, UnmarshallerContext context) {
		
		onsBuyOrdersProduceResponse.setRequestId(context.stringValue("OnsBuyOrdersProduceResponse.RequestId"));
		onsBuyOrdersProduceResponse.setSuccess(context.booleanValue("OnsBuyOrdersProduceResponse.success"));
		onsBuyOrdersProduceResponse.setCode(context.stringValue("OnsBuyOrdersProduceResponse.Code"));
		onsBuyOrdersProduceResponse.setMessage(context.stringValue("OnsBuyOrdersProduceResponse.Message"));
		onsBuyOrdersProduceResponse.setData(context.stringValue("OnsBuyOrdersProduceResponse.Data"));
	 
	 	return onsBuyOrdersProduceResponse;
	}
}