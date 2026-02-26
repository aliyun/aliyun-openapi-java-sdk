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

import com.aliyuncs.polardb.model.v20170801.DescribeActiveOperationMaintainConfResponse;
import com.aliyuncs.polardb.model.v20170801.DescribeActiveOperationMaintainConfResponse.Config;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeActiveOperationMaintainConfResponseUnmarshaller {

	public static DescribeActiveOperationMaintainConfResponse unmarshall(DescribeActiveOperationMaintainConfResponse describeActiveOperationMaintainConfResponse, UnmarshallerContext _ctx) {
		
		describeActiveOperationMaintainConfResponse.setRequestId(_ctx.stringValue("DescribeActiveOperationMaintainConfResponse.RequestId"));
		describeActiveOperationMaintainConfResponse.setHasConfig(_ctx.longValue("DescribeActiveOperationMaintainConfResponse.HasConfig"));

		Config config = new Config();
		config.setCycleType(_ctx.integerValue("DescribeActiveOperationMaintainConfResponse.Config.CycleType"));
		config.setCycleTime(_ctx.stringValue("DescribeActiveOperationMaintainConfResponse.Config.CycleTime"));
		config.setMaintainStartTime(_ctx.stringValue("DescribeActiveOperationMaintainConfResponse.Config.MaintainStartTime"));
		config.setMaintainEndTime(_ctx.stringValue("DescribeActiveOperationMaintainConfResponse.Config.MaintainEndTime"));
		config.setStatus(_ctx.longValue("DescribeActiveOperationMaintainConfResponse.Config.Status"));
		config.setModifiedTime(_ctx.stringValue("DescribeActiveOperationMaintainConfResponse.Config.ModifiedTime"));
		config.setCreatedTime(_ctx.stringValue("DescribeActiveOperationMaintainConfResponse.Config.CreatedTime"));
		describeActiveOperationMaintainConfResponse.setConfig(config);
	 
	 	return describeActiveOperationMaintainConfResponse;
	}
}