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

import com.aliyuncs.ecsinc.model.v20160314.InnerMaliceEcsLockResponse;
import com.aliyuncs.ecsinc.model.v20160314.InnerMaliceEcsLockResponse.ErrorCode;
import com.aliyuncs.transform.UnmarshallerContext;


public class InnerMaliceEcsLockResponseUnmarshaller {

	public static InnerMaliceEcsLockResponse unmarshall(InnerMaliceEcsLockResponse innerMaliceEcsLockResponse, UnmarshallerContext context) {
		
		innerMaliceEcsLockResponse.setRequestId(context.stringValue("InnerMaliceEcsLockResponse.RequestId"));
		innerMaliceEcsLockResponse.setData(context.stringValue("InnerMaliceEcsLockResponse.data"));

		ErrorCode errorCode = new ErrorCode();
		errorCode.setCode(context.stringValue("InnerMaliceEcsLockResponse.errorCode.code"));
		errorCode.setMessage(context.stringValue("InnerMaliceEcsLockResponse.errorCode.message"));
		errorCode.setIsSuccess(context.booleanValue("InnerMaliceEcsLockResponse.errorCode.isSuccess"));
		innerMaliceEcsLockResponse.setErrorCode(errorCode);
	 
	 	return innerMaliceEcsLockResponse;
	}
}