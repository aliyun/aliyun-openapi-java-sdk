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

import com.aliyuncs.cloudauth.model.v20190307.Id2MetaStandardVerifyResponse;
import com.aliyuncs.cloudauth.model.v20190307.Id2MetaStandardVerifyResponse.ResultObject;
import com.aliyuncs.transform.UnmarshallerContext;


public class Id2MetaStandardVerifyResponseUnmarshaller {

	public static Id2MetaStandardVerifyResponse unmarshall(Id2MetaStandardVerifyResponse id2MetaStandardVerifyResponse, UnmarshallerContext _ctx) {
		
		id2MetaStandardVerifyResponse.setRequestId(_ctx.stringValue("Id2MetaStandardVerifyResponse.RequestId"));
		id2MetaStandardVerifyResponse.setCode(_ctx.stringValue("Id2MetaStandardVerifyResponse.Code"));
		id2MetaStandardVerifyResponse.setMessage(_ctx.stringValue("Id2MetaStandardVerifyResponse.Message"));

		ResultObject resultObject = new ResultObject();
		resultObject.setBizCode(_ctx.stringValue("Id2MetaStandardVerifyResponse.ResultObject.BizCode"));
		id2MetaStandardVerifyResponse.setResultObject(resultObject);
	 
	 	return id2MetaStandardVerifyResponse;
	}
}