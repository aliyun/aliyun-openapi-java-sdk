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

import com.aliyuncs.cloudcallcenter.model.v20170705.UnbindPrivacyNumberResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class UnbindPrivacyNumberResponseUnmarshaller {

	public static UnbindPrivacyNumberResponse unmarshall(UnbindPrivacyNumberResponse unbindPrivacyNumberResponse, UnmarshallerContext context) {
		
		unbindPrivacyNumberResponse.setRequestId(context.stringValue("UnbindPrivacyNumberResponse.RequestId"));
		unbindPrivacyNumberResponse.setSuccess(context.booleanValue("UnbindPrivacyNumberResponse.Success"));
		unbindPrivacyNumberResponse.setCode(context.stringValue("UnbindPrivacyNumberResponse.Code"));
		unbindPrivacyNumberResponse.setMessage(context.stringValue("UnbindPrivacyNumberResponse.Message"));
		unbindPrivacyNumberResponse.setHttpStatusCode(context.integerValue("UnbindPrivacyNumberResponse.HttpStatusCode"));
	 
	 	return unbindPrivacyNumberResponse;
	}
}