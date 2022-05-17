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

package com.aliyuncs.retailbot.transform.v20210224;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.retailbot.model.v20210224.UpgradePackageResponse;
import com.aliyuncs.retailbot.model.v20210224.UpgradePackageResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpgradePackageResponseUnmarshaller {

	public static UpgradePackageResponse unmarshall(UpgradePackageResponse upgradePackageResponse, UnmarshallerContext _ctx) {
		
		upgradePackageResponse.setRequestId(_ctx.stringValue("UpgradePackageResponse.RequestId"));
		upgradePackageResponse.setSuccess(_ctx.booleanValue("UpgradePackageResponse.Success"));
		upgradePackageResponse.setCode(_ctx.stringValue("UpgradePackageResponse.Code"));
		upgradePackageResponse.setMessage(_ctx.stringValue("UpgradePackageResponse.Message"));

		Data data = new Data();

		List<String> successRobotCodes = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("UpgradePackageResponse.Data.SuccessRobotCodes.Length"); i++) {
			successRobotCodes.add(_ctx.stringValue("UpgradePackageResponse.Data.SuccessRobotCodes["+ i +"]"));
		}
		data.setSuccessRobotCodes(successRobotCodes);

		List<String> failedRobotCodes = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("UpgradePackageResponse.Data.FailedRobotCodes.Length"); i++) {
			failedRobotCodes.add(_ctx.stringValue("UpgradePackageResponse.Data.FailedRobotCodes["+ i +"]"));
		}
		data.setFailedRobotCodes(failedRobotCodes);
		upgradePackageResponse.setData(data);
	 
	 	return upgradePackageResponse;
	}
}