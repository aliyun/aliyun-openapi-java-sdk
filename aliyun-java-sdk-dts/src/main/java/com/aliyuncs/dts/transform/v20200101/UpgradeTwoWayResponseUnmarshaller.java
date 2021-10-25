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

package com.aliyuncs.dts.transform.v20200101;

import com.aliyuncs.dts.model.v20200101.UpgradeTwoWayResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpgradeTwoWayResponseUnmarshaller {

	public static UpgradeTwoWayResponse unmarshall(UpgradeTwoWayResponse upgradeTwoWayResponse, UnmarshallerContext _ctx) {
		
		upgradeTwoWayResponse.setRequestId(_ctx.stringValue("UpgradeTwoWayResponse.RequestId"));
		upgradeTwoWayResponse.setDynamicCode(_ctx.stringValue("UpgradeTwoWayResponse.DynamicCode"));
		upgradeTwoWayResponse.setDynamicMessage(_ctx.stringValue("UpgradeTwoWayResponse.DynamicMessage"));
		upgradeTwoWayResponse.setErrCode(_ctx.stringValue("UpgradeTwoWayResponse.ErrCode"));
		upgradeTwoWayResponse.setErrMessage(_ctx.stringValue("UpgradeTwoWayResponse.ErrMessage"));
		upgradeTwoWayResponse.setHttpStatusCode(_ctx.integerValue("UpgradeTwoWayResponse.HttpStatusCode"));
		upgradeTwoWayResponse.setSuccess(_ctx.booleanValue("UpgradeTwoWayResponse.Success"));
	 
	 	return upgradeTwoWayResponse;
	}
}