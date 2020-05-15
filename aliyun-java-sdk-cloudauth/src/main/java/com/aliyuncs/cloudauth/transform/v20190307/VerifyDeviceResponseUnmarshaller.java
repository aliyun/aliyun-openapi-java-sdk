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

package com.aliyuncs.cloudauth.transform.v20190307;

import com.aliyuncs.cloudauth.model.v20190307.VerifyDeviceResponse;
import com.aliyuncs.cloudauth.model.v20190307.VerifyDeviceResponse.ResultObject;
import com.aliyuncs.transform.UnmarshallerContext;


public class VerifyDeviceResponseUnmarshaller {

	public static VerifyDeviceResponse unmarshall(VerifyDeviceResponse verifyDeviceResponse, UnmarshallerContext _ctx) {
		
		verifyDeviceResponse.setRequestId(_ctx.stringValue("VerifyDeviceResponse.RequestId"));
		verifyDeviceResponse.setCode(_ctx.stringValue("VerifyDeviceResponse.Code"));
		verifyDeviceResponse.setMessage(_ctx.stringValue("VerifyDeviceResponse.Message"));

		ResultObject resultObject = new ResultObject();
		resultObject.setValidationRetCode(_ctx.stringValue("VerifyDeviceResponse.ResultObject.ValidationRetCode"));
		resultObject.setProductRetCode(_ctx.stringValue("VerifyDeviceResponse.ResultObject.ProductRetCode"));
		resultObject.setRetCodeSub(_ctx.stringValue("VerifyDeviceResponse.ResultObject.RetCodeSub"));
		resultObject.setRetMessageSub(_ctx.stringValue("VerifyDeviceResponse.ResultObject.RetMessageSub"));
		resultObject.setHasNext(_ctx.stringValue("VerifyDeviceResponse.ResultObject.HasNext"));
		resultObject.setExtParams(_ctx.stringValue("VerifyDeviceResponse.ResultObject.ExtParams"));
		verifyDeviceResponse.setResultObject(resultObject);
	 
	 	return verifyDeviceResponse;
	}
}