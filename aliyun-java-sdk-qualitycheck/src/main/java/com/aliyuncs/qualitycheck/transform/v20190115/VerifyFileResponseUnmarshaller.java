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

package com.aliyuncs.qualitycheck.transform.v20190115;

import com.aliyuncs.qualitycheck.model.v20190115.VerifyFileResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class VerifyFileResponseUnmarshaller {

	public static VerifyFileResponse unmarshall(VerifyFileResponse verifyFileResponse, UnmarshallerContext _ctx) {
		
		verifyFileResponse.setRequestId(_ctx.stringValue("VerifyFileResponse.RequestId"));
		verifyFileResponse.setSuccess(_ctx.booleanValue("VerifyFileResponse.Success"));
		verifyFileResponse.setCode(_ctx.stringValue("VerifyFileResponse.Code"));
		verifyFileResponse.setMessage(_ctx.stringValue("VerifyFileResponse.Message"));
		verifyFileResponse.setData(_ctx.floatValue("VerifyFileResponse.Data"));
	 
	 	return verifyFileResponse;
	}
}