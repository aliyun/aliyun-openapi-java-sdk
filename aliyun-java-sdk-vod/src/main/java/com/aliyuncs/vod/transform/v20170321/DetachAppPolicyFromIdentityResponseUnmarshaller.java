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

import com.aliyuncs.vod.model.v20170321.DetachAppPolicyFromIdentityResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DetachAppPolicyFromIdentityResponseUnmarshaller {

	public static DetachAppPolicyFromIdentityResponse unmarshall(DetachAppPolicyFromIdentityResponse detachAppPolicyFromIdentityResponse, UnmarshallerContext context) {
		
		detachAppPolicyFromIdentityResponse.setRequestId(context.stringValue("DetachAppPolicyFromIdentityResponse.RequestId"));

		List<String> nonExistPolicyNames = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("DetachAppPolicyFromIdentityResponse.NonExistPolicyNames.Length"); i++) {
			nonExistPolicyNames.add(context.stringValue("DetachAppPolicyFromIdentityResponse.NonExistPolicyNames["+ i +"]"));
		}
		detachAppPolicyFromIdentityResponse.setNonExistPolicyNames(nonExistPolicyNames);

		List<String> failedPolicyNames = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("DetachAppPolicyFromIdentityResponse.FailedPolicyNames.Length"); i++) {
			failedPolicyNames.add(context.stringValue("DetachAppPolicyFromIdentityResponse.FailedPolicyNames["+ i +"]"));
		}
		detachAppPolicyFromIdentityResponse.setFailedPolicyNames(failedPolicyNames);
	 
	 	return detachAppPolicyFromIdentityResponse;
	}
}