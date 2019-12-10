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

package com.aliyuncs.smartag.transform.v20180313;

import com.aliyuncs.smartag.model.v20180313.DescribeDeviceAutoUpgradePolicyResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDeviceAutoUpgradePolicyResponseUnmarshaller {

	public static DescribeDeviceAutoUpgradePolicyResponse unmarshall(DescribeDeviceAutoUpgradePolicyResponse describeDeviceAutoUpgradePolicyResponse, UnmarshallerContext _ctx) {
		
		describeDeviceAutoUpgradePolicyResponse.setRequestId(_ctx.stringValue("DescribeDeviceAutoUpgradePolicyResponse.RequestId"));
		describeDeviceAutoUpgradePolicyResponse.setSmartAGId(_ctx.stringValue("DescribeDeviceAutoUpgradePolicyResponse.SmartAGId"));
		describeDeviceAutoUpgradePolicyResponse.setSerialNumber(_ctx.stringValue("DescribeDeviceAutoUpgradePolicyResponse.SerialNumber"));
		describeDeviceAutoUpgradePolicyResponse.setUpgradeType(_ctx.stringValue("DescribeDeviceAutoUpgradePolicyResponse.UpgradeType"));
		describeDeviceAutoUpgradePolicyResponse.setCronExpression(_ctx.stringValue("DescribeDeviceAutoUpgradePolicyResponse.CronExpression"));
		describeDeviceAutoUpgradePolicyResponse.setDuration(_ctx.stringValue("DescribeDeviceAutoUpgradePolicyResponse.Duration"));
		describeDeviceAutoUpgradePolicyResponse.setTimeZone(_ctx.stringValue("DescribeDeviceAutoUpgradePolicyResponse.TimeZone"));
	 
	 	return describeDeviceAutoUpgradePolicyResponse;
	}
}