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

import com.aliyuncs.ecsinc.model.v20160314.InnerGroupCreateResponse;
import com.aliyuncs.ecsinc.model.v20160314.InnerGroupCreateResponse.ErrorCode;
import com.aliyuncs.transform.UnmarshallerContext;


public class InnerGroupCreateResponseUnmarshaller {

	public static InnerGroupCreateResponse unmarshall(InnerGroupCreateResponse innerGroupCreateResponse, UnmarshallerContext context) {
		
		innerGroupCreateResponse.setRequestId(context.stringValue("InnerGroupCreateResponse.RequestId"));
		innerGroupCreateResponse.setData(context.stringValue("InnerGroupCreateResponse.data"));

		ErrorCode errorCode = new ErrorCode();
		errorCode.setCode(context.stringValue("InnerGroupCreateResponse.errorCode.code"));
		errorCode.setMessage(context.stringValue("InnerGroupCreateResponse.errorCode.message"));
		errorCode.setIsSuccess(context.booleanValue("InnerGroupCreateResponse.errorCode.isSuccess"));
		innerGroupCreateResponse.setErrorCode(errorCode);
	 
	 	return innerGroupCreateResponse;
	}
}