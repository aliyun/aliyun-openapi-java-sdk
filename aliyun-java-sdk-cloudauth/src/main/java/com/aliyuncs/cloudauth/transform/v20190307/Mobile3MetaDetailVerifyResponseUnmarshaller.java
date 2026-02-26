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

import com.aliyuncs.cloudauth.model.v20190307.Mobile3MetaDetailVerifyResponse;
import com.aliyuncs.cloudauth.model.v20190307.Mobile3MetaDetailVerifyResponse.ResultObject;
import com.aliyuncs.transform.UnmarshallerContext;


public class Mobile3MetaDetailVerifyResponseUnmarshaller {

	public static Mobile3MetaDetailVerifyResponse unmarshall(Mobile3MetaDetailVerifyResponse mobile3MetaDetailVerifyResponse, UnmarshallerContext _ctx) {
		
		mobile3MetaDetailVerifyResponse.setRequestId(_ctx.stringValue("Mobile3MetaDetailVerifyResponse.RequestId"));
		mobile3MetaDetailVerifyResponse.setCode(_ctx.stringValue("Mobile3MetaDetailVerifyResponse.Code"));
		mobile3MetaDetailVerifyResponse.setMessage(_ctx.stringValue("Mobile3MetaDetailVerifyResponse.Message"));

		ResultObject resultObject = new ResultObject();
		resultObject.setBizCode(_ctx.stringValue("Mobile3MetaDetailVerifyResponse.ResultObject.BizCode"));
		resultObject.setSubCode(_ctx.stringValue("Mobile3MetaDetailVerifyResponse.ResultObject.SubCode"));
		resultObject.setIspName(_ctx.stringValue("Mobile3MetaDetailVerifyResponse.ResultObject.IspName"));
		mobile3MetaDetailVerifyResponse.setResultObject(resultObject);
	 
	 	return mobile3MetaDetailVerifyResponse;
	}
}