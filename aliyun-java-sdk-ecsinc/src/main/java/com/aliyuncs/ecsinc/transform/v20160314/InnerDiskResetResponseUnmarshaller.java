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

import com.aliyuncs.ecsinc.model.v20160314.InnerDiskResetResponse;
import com.aliyuncs.ecsinc.model.v20160314.InnerDiskResetResponse.ErrorCode;
import com.aliyuncs.transform.UnmarshallerContext;


public class InnerDiskResetResponseUnmarshaller {

	public static InnerDiskResetResponse unmarshall(InnerDiskResetResponse innerDiskResetResponse, UnmarshallerContext context) {
		
		innerDiskResetResponse.setRequestId(context.stringValue("InnerDiskResetResponse.RequestId"));
		innerDiskResetResponse.setIsSuccess(context.stringValue("InnerDiskResetResponse.isSuccess"));

		ErrorCode errorCode = new ErrorCode();
		errorCode.setCode(context.stringValue("InnerDiskResetResponse.errorCode.code"));
		errorCode.setMessage(context.stringValue("InnerDiskResetResponse.errorCode.message"));
		errorCode.setIsSuccess(context.booleanValue("InnerDiskResetResponse.errorCode.isSuccess"));
		innerDiskResetResponse.setErrorCode(errorCode);
	 
	 	return innerDiskResetResponse;
	}
}