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

package com.aliyuncs.vod.transform.v20170321;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.vod.model.v20170321.AttachAppPolicyToIdentityResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class AttachAppPolicyToIdentityResponseUnmarshaller {

	public static AttachAppPolicyToIdentityResponse unmarshall(AttachAppPolicyToIdentityResponse attachAppPolicyToIdentityResponse, UnmarshallerContext context) {
		
		attachAppPolicyToIdentityResponse.setRequestId(context.stringValue("AttachAppPolicyToIdentityResponse.RequestId"));

		List<String> nonExistPolicyNames = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("AttachAppPolicyToIdentityResponse.NonExistPolicyNames.Length"); i++) {
			nonExistPolicyNames.add(context.stringValue("AttachAppPolicyToIdentityResponse.NonExistPolicyNames["+ i +"]"));
		}
		attachAppPolicyToIdentityResponse.setNonExistPolicyNames(nonExistPolicyNames);

		List<String> failedPolicyNames = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("AttachAppPolicyToIdentityResponse.FailedPolicyNames.Length"); i++) {
			failedPolicyNames.add(context.stringValue("AttachAppPolicyToIdentityResponse.FailedPolicyNames["+ i +"]"));
		}
		attachAppPolicyToIdentityResponse.setFailedPolicyNames(failedPolicyNames);
	 
	 	return attachAppPolicyToIdentityResponse;
	}
}