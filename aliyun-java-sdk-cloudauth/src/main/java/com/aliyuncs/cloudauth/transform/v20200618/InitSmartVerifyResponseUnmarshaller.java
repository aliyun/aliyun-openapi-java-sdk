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

package com.aliyuncs.cloudauth.transform.v20200618;

import com.aliyuncs.cloudauth.model.v20200618.InitSmartVerifyResponse;
import com.aliyuncs.cloudauth.model.v20200618.InitSmartVerifyResponse.ResultObject;
import com.aliyuncs.transform.UnmarshallerContext;


public class InitSmartVerifyResponseUnmarshaller {

	public static InitSmartVerifyResponse unmarshall(InitSmartVerifyResponse initSmartVerifyResponse, UnmarshallerContext _ctx) {
		
		initSmartVerifyResponse.setRequestId(_ctx.stringValue("InitSmartVerifyResponse.RequestId"));
		initSmartVerifyResponse.setMessage(_ctx.stringValue("InitSmartVerifyResponse.Message"));
		initSmartVerifyResponse.setCode(_ctx.stringValue("InitSmartVerifyResponse.Code"));

		ResultObject resultObject = new ResultObject();
		resultObject.setCertifyId(_ctx.stringValue("InitSmartVerifyResponse.ResultObject.CertifyId"));
		initSmartVerifyResponse.setResultObject(resultObject);
	 
	 	return initSmartVerifyResponse;
	}
}