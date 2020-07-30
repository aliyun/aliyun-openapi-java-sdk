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

package com.aliyuncs.teambition_aliyun.transform.v20200226;

import com.aliyuncs.teambition_aliyun.model.v20200226.CheckAliyunUserExistsResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CheckAliyunUserExistsResponseUnmarshaller {

	public static CheckAliyunUserExistsResponse unmarshall(CheckAliyunUserExistsResponse checkAliyunUserExistsResponse, UnmarshallerContext _ctx) {
		
		checkAliyunUserExistsResponse.setRequestId(_ctx.stringValue("CheckAliyunUserExistsResponse.RequestId"));
		checkAliyunUserExistsResponse.setSuccessful(_ctx.booleanValue("CheckAliyunUserExistsResponse.Successful"));
		checkAliyunUserExistsResponse.setErrorCode(_ctx.stringValue("CheckAliyunUserExistsResponse.ErrorCode"));
		checkAliyunUserExistsResponse.setErrorMsg(_ctx.stringValue("CheckAliyunUserExistsResponse.ErrorMsg"));
		checkAliyunUserExistsResponse.setObject(_ctx.booleanValue("CheckAliyunUserExistsResponse.Object"));
	 
	 	return checkAliyunUserExistsResponse;
	}
}