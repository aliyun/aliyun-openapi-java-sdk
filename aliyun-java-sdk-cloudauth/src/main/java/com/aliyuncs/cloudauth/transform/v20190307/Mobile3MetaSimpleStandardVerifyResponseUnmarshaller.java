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

import com.aliyuncs.cloudauth.model.v20190307.Mobile3MetaSimpleStandardVerifyResponse;
import com.aliyuncs.cloudauth.model.v20190307.Mobile3MetaSimpleStandardVerifyResponse.ResultObject;
import com.aliyuncs.transform.UnmarshallerContext;


public class Mobile3MetaSimpleStandardVerifyResponseUnmarshaller {

	public static Mobile3MetaSimpleStandardVerifyResponse unmarshall(Mobile3MetaSimpleStandardVerifyResponse mobile3MetaSimpleStandardVerifyResponse, UnmarshallerContext _ctx) {
		
		mobile3MetaSimpleStandardVerifyResponse.setRequestId(_ctx.stringValue("Mobile3MetaSimpleStandardVerifyResponse.RequestId"));
		mobile3MetaSimpleStandardVerifyResponse.setCode(_ctx.stringValue("Mobile3MetaSimpleStandardVerifyResponse.Code"));
		mobile3MetaSimpleStandardVerifyResponse.setMessage(_ctx.stringValue("Mobile3MetaSimpleStandardVerifyResponse.Message"));

		ResultObject resultObject = new ResultObject();
		resultObject.setBizCode(_ctx.stringValue("Mobile3MetaSimpleStandardVerifyResponse.ResultObject.BizCode"));
		resultObject.setIspName(_ctx.stringValue("Mobile3MetaSimpleStandardVerifyResponse.ResultObject.IspName"));
		mobile3MetaSimpleStandardVerifyResponse.setResultObject(resultObject);
	 
	 	return mobile3MetaSimpleStandardVerifyResponse;
	}
}