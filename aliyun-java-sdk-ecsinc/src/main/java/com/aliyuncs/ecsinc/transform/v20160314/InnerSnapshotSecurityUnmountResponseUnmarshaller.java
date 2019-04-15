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

import com.aliyuncs.ecsinc.model.v20160314.InnerSnapshotSecurityUnmountResponse;
import com.aliyuncs.ecsinc.model.v20160314.InnerSnapshotSecurityUnmountResponse.ErrorCode;
import com.aliyuncs.transform.UnmarshallerContext;


public class InnerSnapshotSecurityUnmountResponseUnmarshaller {

	public static InnerSnapshotSecurityUnmountResponse unmarshall(InnerSnapshotSecurityUnmountResponse innerSnapshotSecurityUnmountResponse, UnmarshallerContext context) {
		
		innerSnapshotSecurityUnmountResponse.setRequestId(context.stringValue("InnerSnapshotSecurityUnmountResponse.RequestId"));
		innerSnapshotSecurityUnmountResponse.setIsSuccess(context.stringValue("InnerSnapshotSecurityUnmountResponse.isSuccess"));

		ErrorCode errorCode = new ErrorCode();
		errorCode.setCode(context.stringValue("InnerSnapshotSecurityUnmountResponse.errorCode.code"));
		errorCode.setMessage(context.stringValue("InnerSnapshotSecurityUnmountResponse.errorCode.message"));
		errorCode.setIsSuccess(context.booleanValue("InnerSnapshotSecurityUnmountResponse.errorCode.isSuccess"));
		innerSnapshotSecurityUnmountResponse.setErrorCode(errorCode);
	 
	 	return innerSnapshotSecurityUnmountResponse;
	}
}