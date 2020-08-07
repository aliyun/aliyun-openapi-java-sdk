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

package com.aliyuncs.premiumpics.transform.v20200505;

import com.aliyuncs.premiumpics.model.v20200505.CreateImageOrderResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateImageOrderResponseUnmarshaller {

	public static CreateImageOrderResponse unmarshall(CreateImageOrderResponse createImageOrderResponse, UnmarshallerContext _ctx) {
		
		createImageOrderResponse.setRequestId(_ctx.stringValue("CreateImageOrderResponse.RequestId"));
		createImageOrderResponse.setSuccess(_ctx.booleanValue("CreateImageOrderResponse.Success"));
		createImageOrderResponse.setErrorMsg(_ctx.stringValue("CreateImageOrderResponse.ErrorMsg"));
		createImageOrderResponse.setErrorCode(_ctx.stringValue("CreateImageOrderResponse.ErrorCode"));
		createImageOrderResponse.setOrderId(_ctx.stringValue("CreateImageOrderResponse.OrderId"));
	 
	 	return createImageOrderResponse;
	}
}