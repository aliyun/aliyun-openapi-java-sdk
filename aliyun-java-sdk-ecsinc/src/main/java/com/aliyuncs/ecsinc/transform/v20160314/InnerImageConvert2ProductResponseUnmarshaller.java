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

package com.aliyuncs.ecsinc.transform.v20160314;

import com.aliyuncs.ecsinc.model.v20160314.InnerImageConvert2ProductResponse;
import com.aliyuncs.ecsinc.model.v20160314.InnerImageConvert2ProductResponse.ErrorCode;
import com.aliyuncs.transform.UnmarshallerContext;


public class InnerImageConvert2ProductResponseUnmarshaller {

	public static InnerImageConvert2ProductResponse unmarshall(InnerImageConvert2ProductResponse innerImageConvert2ProductResponse, UnmarshallerContext context) {
		
		innerImageConvert2ProductResponse.setRequestId(context.stringValue("InnerImageConvert2ProductResponse.RequestId"));
		innerImageConvert2ProductResponse.setIsSuccess(context.stringValue("InnerImageConvert2ProductResponse.isSuccess"));

		ErrorCode errorCode = new ErrorCode();
		errorCode.setCode(context.stringValue("InnerImageConvert2ProductResponse.errorCode.code"));
		errorCode.setMessage(context.stringValue("InnerImageConvert2ProductResponse.errorCode.message"));
		errorCode.setIsSuccess(context.booleanValue("InnerImageConvert2ProductResponse.errorCode.isSuccess"));
		innerImageConvert2ProductResponse.setErrorCode(errorCode);
	 
	 	return innerImageConvert2ProductResponse;
	}
}