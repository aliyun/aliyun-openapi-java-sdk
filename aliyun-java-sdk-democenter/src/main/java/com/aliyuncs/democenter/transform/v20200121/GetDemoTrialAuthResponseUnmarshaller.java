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

package com.aliyuncs.democenter.transform.v20200121;

import com.aliyuncs.democenter.model.v20200121.GetDemoTrialAuthResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetDemoTrialAuthResponseUnmarshaller {

	public static GetDemoTrialAuthResponse unmarshall(GetDemoTrialAuthResponse getDemoTrialAuthResponse, UnmarshallerContext _ctx) {
		
		getDemoTrialAuthResponse.setRequestId(_ctx.stringValue("GetDemoTrialAuthResponse.RequestId"));
		getDemoTrialAuthResponse.setAuthorization(_ctx.stringValue("GetDemoTrialAuthResponse.Authorization"));
	 
	 	return getDemoTrialAuthResponse;
	}
}