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

package com.aliyuncs.polardb.transform.v20170801;

import com.aliyuncs.polardb.model.v20170801.ModifyPendingMaintenanceActionResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ModifyPendingMaintenanceActionResponseUnmarshaller {

	public static ModifyPendingMaintenanceActionResponse unmarshall(ModifyPendingMaintenanceActionResponse modifyPendingMaintenanceActionResponse, UnmarshallerContext _ctx) {
		
		modifyPendingMaintenanceActionResponse.setRequestId(_ctx.stringValue("ModifyPendingMaintenanceActionResponse.RequestId"));
		modifyPendingMaintenanceActionResponse.setIds(_ctx.stringValue("ModifyPendingMaintenanceActionResponse.Ids"));
	 
	 	return modifyPendingMaintenanceActionResponse;
	}
}