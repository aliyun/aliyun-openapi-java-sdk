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

import com.aliyuncs.cloudauth.model.v20190307.Mobile3MetaDetailStandardVerifyResponse;
import com.aliyuncs.cloudauth.model.v20190307.Mobile3MetaDetailStandardVerifyResponse.ResultObject;
import com.aliyuncs.transform.UnmarshallerContext;


public class Mobile3MetaDetailStandardVerifyResponseUnmarshaller {

	public static Mobile3MetaDetailStandardVerifyResponse unmarshall(Mobile3MetaDetailStandardVerifyResponse mobile3MetaDetailStandardVerifyResponse, UnmarshallerContext _ctx) {
		
		mobile3MetaDetailStandardVerifyResponse.setRequestId(_ctx.stringValue("Mobile3MetaDetailStandardVerifyResponse.RequestId"));
		mobile3MetaDetailStandardVerifyResponse.setCode(_ctx.stringValue("Mobile3MetaDetailStandardVerifyResponse.Code"));
		mobile3MetaDetailStandardVerifyResponse.setMessage(_ctx.stringValue("Mobile3MetaDetailStandardVerifyResponse.Message"));

		ResultObject resultObject = new ResultObject();
		resultObject.setBizCode(_ctx.stringValue("Mobile3MetaDetailStandardVerifyResponse.ResultObject.BizCode"));
		resultObject.setSubCode(_ctx.stringValue("Mobile3MetaDetailStandardVerifyResponse.ResultObject.SubCode"));
		resultObject.setIspName(_ctx.stringValue("Mobile3MetaDetailStandardVerifyResponse.ResultObject.IspName"));
		mobile3MetaDetailStandardVerifyResponse.setResultObject(resultObject);
	 
	 	return mobile3MetaDetailStandardVerifyResponse;
	}
}