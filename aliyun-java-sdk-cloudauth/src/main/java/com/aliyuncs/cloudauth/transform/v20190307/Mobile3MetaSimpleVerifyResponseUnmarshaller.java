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

import com.aliyuncs.cloudauth.model.v20190307.Mobile3MetaSimpleVerifyResponse;
import com.aliyuncs.cloudauth.model.v20190307.Mobile3MetaSimpleVerifyResponse.ResultObject;
import com.aliyuncs.transform.UnmarshallerContext;


public class Mobile3MetaSimpleVerifyResponseUnmarshaller {

	public static Mobile3MetaSimpleVerifyResponse unmarshall(Mobile3MetaSimpleVerifyResponse mobile3MetaSimpleVerifyResponse, UnmarshallerContext _ctx) {
		
		mobile3MetaSimpleVerifyResponse.setRequestId(_ctx.stringValue("Mobile3MetaSimpleVerifyResponse.RequestId"));
		mobile3MetaSimpleVerifyResponse.setCode(_ctx.stringValue("Mobile3MetaSimpleVerifyResponse.Code"));
		mobile3MetaSimpleVerifyResponse.setMessage(_ctx.stringValue("Mobile3MetaSimpleVerifyResponse.Message"));

		ResultObject resultObject = new ResultObject();
		resultObject.setBizCode(_ctx.stringValue("Mobile3MetaSimpleVerifyResponse.ResultObject.BizCode"));
		resultObject.setIspName(_ctx.stringValue("Mobile3MetaSimpleVerifyResponse.ResultObject.IspName"));
		mobile3MetaSimpleVerifyResponse.setResultObject(resultObject);
	 
	 	return mobile3MetaSimpleVerifyResponse;
	}
}