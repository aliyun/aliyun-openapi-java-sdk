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

import com.aliyuncs.cloudauth.model.v20190307.Id2MetaVerifyResponse;
import com.aliyuncs.cloudauth.model.v20190307.Id2MetaVerifyResponse.ResultObject;
import com.aliyuncs.transform.UnmarshallerContext;


public class Id2MetaVerifyResponseUnmarshaller {

	public static Id2MetaVerifyResponse unmarshall(Id2MetaVerifyResponse id2MetaVerifyResponse, UnmarshallerContext _ctx) {
		
		id2MetaVerifyResponse.setRequestId(_ctx.stringValue("Id2MetaVerifyResponse.RequestId"));
		id2MetaVerifyResponse.setCode(_ctx.stringValue("Id2MetaVerifyResponse.Code"));
		id2MetaVerifyResponse.setMessage(_ctx.stringValue("Id2MetaVerifyResponse.Message"));

		ResultObject resultObject = new ResultObject();
		resultObject.setBizCode(_ctx.stringValue("Id2MetaVerifyResponse.ResultObject.BizCode"));
		id2MetaVerifyResponse.setResultObject(resultObject);
	 
	 	return id2MetaVerifyResponse;
	}
}