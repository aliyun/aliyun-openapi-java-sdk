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

package com.aliyuncs.cloudcallcenter.transform.v20170705;

import com.aliyuncs.cloudcallcenter.model.v20170705.CreatePrivacyNumberPoolResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreatePrivacyNumberPoolResponseUnmarshaller {

	public static CreatePrivacyNumberPoolResponse unmarshall(CreatePrivacyNumberPoolResponse createPrivacyNumberPoolResponse, UnmarshallerContext context) {
		
		createPrivacyNumberPoolResponse.setRequestId(context.stringValue("CreatePrivacyNumberPoolResponse.RequestId"));
		createPrivacyNumberPoolResponse.setSuccess(context.booleanValue("CreatePrivacyNumberPoolResponse.Success"));
		createPrivacyNumberPoolResponse.setCode(context.stringValue("CreatePrivacyNumberPoolResponse.Code"));
		createPrivacyNumberPoolResponse.setMessage(context.stringValue("CreatePrivacyNumberPoolResponse.Message"));
		createPrivacyNumberPoolResponse.setHttpStatusCode(context.integerValue("CreatePrivacyNumberPoolResponse.HttpStatusCode"));
	 
	 	return createPrivacyNumberPoolResponse;
	}
}