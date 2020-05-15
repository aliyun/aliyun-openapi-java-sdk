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

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sofa.model.v20190815.AllMsGuardianAppsResponse;
import com.aliyuncs.sofa.model.v20190815.AllMsGuardianAppsResponse.GuardianAppsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class AllMsGuardianAppsResponseUnmarshaller {

	public static AllMsGuardianAppsResponse unmarshall(AllMsGuardianAppsResponse allMsGuardianAppsResponse, UnmarshallerContext _ctx) {
		
		allMsGuardianAppsResponse.setRequestId(_ctx.stringValue("AllMsGuardianAppsResponse.RequestId"));
		allMsGuardianAppsResponse.setResultCode(_ctx.stringValue("AllMsGuardianAppsResponse.ResultCode"));
		allMsGuardianAppsResponse.setResultMessage(_ctx.stringValue("AllMsGuardianAppsResponse.ResultMessage"));

		List<GuardianAppsItem> guardianApps = new ArrayList<GuardianAppsItem>();
		for (int i = 0; i < _ctx.lengthValue("AllMsGuardianAppsResponse.GuardianApps.Length"); i++) {
			GuardianAppsItem guardianAppsItem = new GuardianAppsItem();
			guardianAppsItem.setEnable(_ctx.booleanValue("AllMsGuardianAppsResponse.GuardianApps["+ i +"].Enable"));
			guardianAppsItem.setId(_ctx.longValue("AllMsGuardianAppsResponse.GuardianApps["+ i +"].Id"));
			guardianAppsItem.setInstanceId(_ctx.stringValue("AllMsGuardianAppsResponse.GuardianApps["+ i +"].InstanceId"));
			guardianAppsItem.setName(_ctx.stringValue("AllMsGuardianAppsResponse.GuardianApps["+ i +"].Name"));
			guardianAppsItem.setRunMode(_ctx.stringValue("AllMsGuardianAppsResponse.GuardianApps["+ i +"].RunMode"));

			guardianApps.add(guardianAppsItem);
		}
		allMsGuardianAppsResponse.setGuardianApps(guardianApps);
	 
	 	return allMsGuardianAppsResponse;
	}
}