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

package com.aliyuncs.mindlive_biz.transform.v20210214;

import com.aliyuncs.mindlive_biz.model.v20210214.RequestResettingQrCodeResponse;
import com.aliyuncs.mindlive_biz.model.v20210214.RequestResettingQrCodeResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class RequestResettingQrCodeResponseUnmarshaller {

	public static RequestResettingQrCodeResponse unmarshall(RequestResettingQrCodeResponse requestResettingQrCodeResponse, UnmarshallerContext _ctx) {
		
		requestResettingQrCodeResponse.setRequestId(_ctx.stringValue("RequestResettingQrCodeResponse.RequestId"));
		requestResettingQrCodeResponse.setErrorMessage(_ctx.stringValue("RequestResettingQrCodeResponse.ErrorMessage"));
		requestResettingQrCodeResponse.setSuccess(_ctx.booleanValue("RequestResettingQrCodeResponse.Success"));
		requestResettingQrCodeResponse.setErrorCode(_ctx.stringValue("RequestResettingQrCodeResponse.ErrorCode"));

		Data data = new Data();
		data.setUrl(_ctx.stringValue("RequestResettingQrCodeResponse.Data.Url"));
		requestResettingQrCodeResponse.setData(data);
	 
	 	return requestResettingQrCodeResponse;
	}
}