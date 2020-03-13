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

package com.aliyuncs.sofa.transform.v20190815;

import com.aliyuncs.sofa.model.v20190815.GetMsGuardianAppsResponse;
import com.aliyuncs.sofa.model.v20190815.GetMsGuardianAppsResponse.GuardianApp;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetMsGuardianAppsResponseUnmarshaller {

	public static GetMsGuardianAppsResponse unmarshall(GetMsGuardianAppsResponse getMsGuardianAppsResponse, UnmarshallerContext _ctx) {
		
		getMsGuardianAppsResponse.setRequestId(_ctx.stringValue("GetMsGuardianAppsResponse.RequestId"));
		getMsGuardianAppsResponse.setResultCode(_ctx.stringValue("GetMsGuardianAppsResponse.ResultCode"));
		getMsGuardianAppsResponse.setResultMessage(_ctx.stringValue("GetMsGuardianAppsResponse.ResultMessage"));

		GuardianApp guardianApp = new GuardianApp();
		guardianApp.setEnable(_ctx.booleanValue("GetMsGuardianAppsResponse.GuardianApp.Enable"));
		guardianApp.setId(_ctx.longValue("GetMsGuardianAppsResponse.GuardianApp.Id"));
		guardianApp.setInstanceId(_ctx.stringValue("GetMsGuardianAppsResponse.GuardianApp.InstanceId"));
		guardianApp.setName(_ctx.stringValue("GetMsGuardianAppsResponse.GuardianApp.Name"));
		guardianApp.setRunMode(_ctx.stringValue("GetMsGuardianAppsResponse.GuardianApp.RunMode"));
		getMsGuardianAppsResponse.setGuardianApp(guardianApp);
	 
	 	return getMsGuardianAppsResponse;
	}
}