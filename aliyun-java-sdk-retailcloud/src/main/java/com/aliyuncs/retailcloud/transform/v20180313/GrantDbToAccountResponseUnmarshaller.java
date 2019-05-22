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

package com.aliyuncs.retailcloud.transform.v20180313;

import com.aliyuncs.retailcloud.model.v20180313.GrantDbToAccountResponse;
import com.aliyuncs.retailcloud.model.v20180313.GrantDbToAccountResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class GrantDbToAccountResponseUnmarshaller {

	public static GrantDbToAccountResponse unmarshall(GrantDbToAccountResponse grantDbToAccountResponse, UnmarshallerContext context) {
		
		grantDbToAccountResponse.setRequestId(context.stringValue("GrantDbToAccountResponse.RequestId"));
		grantDbToAccountResponse.setCode(context.integerValue("GrantDbToAccountResponse.Code"));
		grantDbToAccountResponse.setSuccess(context.booleanValue("GrantDbToAccountResponse.Success"));
		grantDbToAccountResponse.setErrMsg(context.stringValue("GrantDbToAccountResponse.ErrMsg"));
		grantDbToAccountResponse.set_Class(context.stringValue("GrantDbToAccountResponse.Class"));
		grantDbToAccountResponse.setTransmitAliyun(context.booleanValue("GrantDbToAccountResponse.TransmitAliyun"));

		Result result = new Result();
		result.set_Class(context.stringValue("GrantDbToAccountResponse.Result.Class"));
		grantDbToAccountResponse.setResult(result);
	 
	 	return grantDbToAccountResponse;
	}
}