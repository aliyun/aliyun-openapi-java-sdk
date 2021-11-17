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

import com.aliyuncs.mindlive_biz.model.v20210214.RequestBindingQrCodeResponse;
import com.aliyuncs.mindlive_biz.model.v20210214.RequestBindingQrCodeResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class RequestBindingQrCodeResponseUnmarshaller {

	public static RequestBindingQrCodeResponse unmarshall(RequestBindingQrCodeResponse requestBindingQrCodeResponse, UnmarshallerContext _ctx) {
		
		requestBindingQrCodeResponse.setRequestId(_ctx.stringValue("RequestBindingQrCodeResponse.RequestId"));
		requestBindingQrCodeResponse.setErrorMessage(_ctx.stringValue("RequestBindingQrCodeResponse.ErrorMessage"));
		requestBindingQrCodeResponse.setSuccess(_ctx.booleanValue("RequestBindingQrCodeResponse.Success"));
		requestBindingQrCodeResponse.setErrorCode(_ctx.stringValue("RequestBindingQrCodeResponse.ErrorCode"));

		Data data = new Data();
		data.setCode(_ctx.stringValue("RequestBindingQrCodeResponse.Data.Code"));
		data.setMaxKeepSeconds(_ctx.integerValue("RequestBindingQrCodeResponse.Data.MaxKeepSeconds"));
		data.setUrl(_ctx.stringValue("RequestBindingQrCodeResponse.Data.Url"));
		requestBindingQrCodeResponse.setData(data);
	 
	 	return requestBindingQrCodeResponse;
	}
}