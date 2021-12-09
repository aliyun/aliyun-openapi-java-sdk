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

package com.aliyuncs.unimkt_dunshan.transform.v20211201;

import com.aliyuncs.unimkt_dunshan.model.v20211201.SdkCallApiServiceResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class SdkCallApiServiceResponseUnmarshaller {

	public static SdkCallApiServiceResponse unmarshall(SdkCallApiServiceResponse sdkCallApiServiceResponse, UnmarshallerContext _ctx) {
		
		sdkCallApiServiceResponse.setRequestId(_ctx.stringValue("SdkCallApiServiceResponse.RequestId"));
		sdkCallApiServiceResponse.setResult(_ctx.stringValue("SdkCallApiServiceResponse.Result"));
		sdkCallApiServiceResponse.setSuccess(_ctx.booleanValue("SdkCallApiServiceResponse.Success"));
		sdkCallApiServiceResponse.setErrorCode(_ctx.stringValue("SdkCallApiServiceResponse.ErrorCode"));
		sdkCallApiServiceResponse.setMessage(_ctx.stringValue("SdkCallApiServiceResponse.Message"));
	 
	 	return sdkCallApiServiceResponse;
	}
}