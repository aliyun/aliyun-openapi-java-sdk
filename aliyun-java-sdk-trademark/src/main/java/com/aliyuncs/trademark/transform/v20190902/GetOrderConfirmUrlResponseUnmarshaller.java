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

package com.aliyuncs.trademark.transform.v20190902;

import com.aliyuncs.trademark.model.v20190902.GetOrderConfirmUrlResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetOrderConfirmUrlResponseUnmarshaller {

	public static GetOrderConfirmUrlResponse unmarshall(GetOrderConfirmUrlResponse getOrderConfirmUrlResponse, UnmarshallerContext _ctx) {
		
		getOrderConfirmUrlResponse.setRequestId(_ctx.stringValue("GetOrderConfirmUrlResponse.RequestId"));
		getOrderConfirmUrlResponse.setErrorMessage(_ctx.stringValue("GetOrderConfirmUrlResponse.ErrorMessage"));
		getOrderConfirmUrlResponse.setSuccess(_ctx.booleanValue("GetOrderConfirmUrlResponse.Success"));
		getOrderConfirmUrlResponse.setErrorCode(_ctx.stringValue("GetOrderConfirmUrlResponse.ErrorCode"));
		getOrderConfirmUrlResponse.setConfirmUrl(_ctx.stringValue("GetOrderConfirmUrlResponse.ConfirmUrl"));
	 
	 	return getOrderConfirmUrlResponse;
	}
}