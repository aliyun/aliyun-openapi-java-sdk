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

import com.aliyuncs.sofa.model.v20190815.UpdateMsGuardianAppsResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateMsGuardianAppsResponseUnmarshaller {

	public static UpdateMsGuardianAppsResponse unmarshall(UpdateMsGuardianAppsResponse updateMsGuardianAppsResponse, UnmarshallerContext _ctx) {
		
		updateMsGuardianAppsResponse.setRequestId(_ctx.stringValue("UpdateMsGuardianAppsResponse.RequestId"));
		updateMsGuardianAppsResponse.setResultCode(_ctx.stringValue("UpdateMsGuardianAppsResponse.ResultCode"));
		updateMsGuardianAppsResponse.setResultMessage(_ctx.stringValue("UpdateMsGuardianAppsResponse.ResultMessage"));
		updateMsGuardianAppsResponse.setResult(_ctx.longValue("UpdateMsGuardianAppsResponse.Result"));
	 
	 	return updateMsGuardianAppsResponse;
	}
}