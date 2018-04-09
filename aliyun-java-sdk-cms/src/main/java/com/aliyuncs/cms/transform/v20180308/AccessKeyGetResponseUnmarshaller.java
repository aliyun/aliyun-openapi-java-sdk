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

package com.aliyuncs.cms.transform.v20180308;

import com.aliyuncs.cms.model.v20180308.AccessKeyGetResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class AccessKeyGetResponseUnmarshaller {

	public static AccessKeyGetResponse unmarshall(AccessKeyGetResponse accessKeyGetResponse, UnmarshallerContext context) {
		
		accessKeyGetResponse.setRequestId(context.stringValue("AccessKeyGetResponse.RequestId"));
		accessKeyGetResponse.setErrorCode(context.integerValue("AccessKeyGetResponse.ErrorCode"));
		accessKeyGetResponse.setErrorMessage(context.stringValue("AccessKeyGetResponse.ErrorMessage"));
		accessKeyGetResponse.setSuccess(context.booleanValue("AccessKeyGetResponse.Success"));
		accessKeyGetResponse.setUserId(context.longValue("AccessKeyGetResponse.UserId"));
		accessKeyGetResponse.setAccessKey(context.stringValue("AccessKeyGetResponse.AccessKey"));
		accessKeyGetResponse.setSecretKey(context.stringValue("AccessKeyGetResponse.SecretKey"));
	 
	 	return accessKeyGetResponse;
	}
}