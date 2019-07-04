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

package com.aliyuncs.green.transform.v20170823;

import com.aliyuncs.green.model.v20170823.UpgradeCdiBaseBagResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpgradeCdiBaseBagResponseUnmarshaller {

	public static UpgradeCdiBaseBagResponse unmarshall(UpgradeCdiBaseBagResponse upgradeCdiBaseBagResponse, UnmarshallerContext _ctx) {
		
		upgradeCdiBaseBagResponse.setRequestId(_ctx.stringValue("UpgradeCdiBaseBagResponse.RequestId"));
		upgradeCdiBaseBagResponse.setCode(_ctx.stringValue("UpgradeCdiBaseBagResponse.Code"));
		upgradeCdiBaseBagResponse.setMessage(_ctx.stringValue("UpgradeCdiBaseBagResponse.Message"));
		upgradeCdiBaseBagResponse.setOrderId(_ctx.stringValue("UpgradeCdiBaseBagResponse.OrderId"));
		upgradeCdiBaseBagResponse.setInstanceId(_ctx.stringValue("UpgradeCdiBaseBagResponse.InstanceId"));
	 
	 	return upgradeCdiBaseBagResponse;
	}
}