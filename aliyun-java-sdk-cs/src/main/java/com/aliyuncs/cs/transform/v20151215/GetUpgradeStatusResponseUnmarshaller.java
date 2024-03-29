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

package com.aliyuncs.cs.transform.v20151215;

import com.aliyuncs.cs.model.v20151215.GetUpgradeStatusResponse;
import com.aliyuncs.cs.model.v20151215.GetUpgradeStatusResponse.Upgrade_task;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetUpgradeStatusResponseUnmarshaller {

	public static GetUpgradeStatusResponse unmarshall(GetUpgradeStatusResponse getUpgradeStatusResponse, UnmarshallerContext _ctx) {
		
		getUpgradeStatusResponse.setError_message(_ctx.stringValue("GetUpgradeStatusResponse.error_message"));
		getUpgradeStatusResponse.setPrecheck_report_id(_ctx.stringValue("GetUpgradeStatusResponse.precheck_report_id"));
		getUpgradeStatusResponse.setStatus(_ctx.stringValue("GetUpgradeStatusResponse.status"));
		getUpgradeStatusResponse.setUpgrade_step(_ctx.stringValue("GetUpgradeStatusResponse.upgrade_step"));

		Upgrade_task upgrade_task = new Upgrade_task();
		upgrade_task.setStatus(_ctx.stringValue("GetUpgradeStatusResponse.upgrade_task.status"));
		upgrade_task.setMessage(_ctx.stringValue("GetUpgradeStatusResponse.upgrade_task.message"));
		getUpgradeStatusResponse.setUpgrade_task(upgrade_task);
	 
	 	return getUpgradeStatusResponse;
	}
}