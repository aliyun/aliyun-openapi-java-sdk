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

package com.aliyuncs.adb.transform.v20190315;

import com.aliyuncs.adb.model.v20190315.DescribeActiveOperationMaintainConfResponse;
import com.aliyuncs.adb.model.v20190315.DescribeActiveOperationMaintainConfResponse.Config;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeActiveOperationMaintainConfResponseUnmarshaller {

	public static DescribeActiveOperationMaintainConfResponse unmarshall(DescribeActiveOperationMaintainConfResponse describeActiveOperationMaintainConfResponse, UnmarshallerContext _ctx) {
		
		describeActiveOperationMaintainConfResponse.setRequestId(_ctx.stringValue("DescribeActiveOperationMaintainConfResponse.RequestId"));
		describeActiveOperationMaintainConfResponse.setHasConfig(_ctx.integerValue("DescribeActiveOperationMaintainConfResponse.HasConfig"));

		Config config = new Config();
		config.setCycleType(_ctx.stringValue("DescribeActiveOperationMaintainConfResponse.Config.CycleType"));
		config.setStatus(_ctx.integerValue("DescribeActiveOperationMaintainConfResponse.Config.Status"));
		config.setModifiedTime(_ctx.stringValue("DescribeActiveOperationMaintainConfResponse.Config.ModifiedTime"));
		config.setMaintainStartTime(_ctx.stringValue("DescribeActiveOperationMaintainConfResponse.Config.MaintainStartTime"));
		config.setMaintainEndTime(_ctx.stringValue("DescribeActiveOperationMaintainConfResponse.Config.MaintainEndTime"));
		config.setCycleTime(_ctx.stringValue("DescribeActiveOperationMaintainConfResponse.Config.CycleTime"));
		config.setCreatedTime(_ctx.stringValue("DescribeActiveOperationMaintainConfResponse.Config.CreatedTime"));
		describeActiveOperationMaintainConfResponse.setConfig(config);
	 
	 	return describeActiveOperationMaintainConfResponse;
	}
}