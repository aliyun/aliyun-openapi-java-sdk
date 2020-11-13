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

package com.aliyuncs.r_kvstore.transform.v20150101;

import com.aliyuncs.r_kvstore.model.v20150101.DescribeEngineVersionResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeEngineVersionResponseUnmarshaller {

	public static DescribeEngineVersionResponse unmarshall(DescribeEngineVersionResponse describeEngineVersionResponse, UnmarshallerContext _ctx) {
		
		describeEngineVersionResponse.setRequestId(_ctx.stringValue("DescribeEngineVersionResponse.RequestId"));
		describeEngineVersionResponse.setEngine(_ctx.stringValue("DescribeEngineVersionResponse.Engine"));
		describeEngineVersionResponse.setIsLatestVersion(_ctx.booleanValue("DescribeEngineVersionResponse.IsLatestVersion"));
		describeEngineVersionResponse.setMinorVersion(_ctx.stringValue("DescribeEngineVersionResponse.MinorVersion"));
		describeEngineVersionResponse.setEnableUpgradeMinorVersion(_ctx.booleanValue("DescribeEngineVersionResponse.EnableUpgradeMinorVersion"));
		describeEngineVersionResponse.setMajorVersion(_ctx.stringValue("DescribeEngineVersionResponse.MajorVersion"));
		describeEngineVersionResponse.setEnableUpgradeMajorVersion(_ctx.booleanValue("DescribeEngineVersionResponse.EnableUpgradeMajorVersion"));
	 
	 	return describeEngineVersionResponse;
	}
}