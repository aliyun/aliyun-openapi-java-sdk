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

package com.aliyuncs.dds.transform.v20151201;

import com.aliyuncs.dds.model.v20151201.DescribeActiveOperationMaintenanceConfigResponse;
import com.aliyuncs.dds.model.v20151201.DescribeActiveOperationMaintenanceConfigResponse.Config;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeActiveOperationMaintenanceConfigResponseUnmarshaller {

	public static DescribeActiveOperationMaintenanceConfigResponse unmarshall(DescribeActiveOperationMaintenanceConfigResponse describeActiveOperationMaintenanceConfigResponse, UnmarshallerContext _ctx) {
		
		describeActiveOperationMaintenanceConfigResponse.setRequestId(_ctx.stringValue("DescribeActiveOperationMaintenanceConfigResponse.RequestId"));
		describeActiveOperationMaintenanceConfigResponse.setHasConfig(_ctx.integerValue("DescribeActiveOperationMaintenanceConfigResponse.HasConfig"));

		Config config = new Config();
		config.setCycleType(_ctx.stringValue("DescribeActiveOperationMaintenanceConfigResponse.Config.CycleType"));
		config.setStatus(_ctx.integerValue("DescribeActiveOperationMaintenanceConfigResponse.Config.Status"));
		config.setModifiedTime(_ctx.stringValue("DescribeActiveOperationMaintenanceConfigResponse.Config.ModifiedTime"));
		config.setMaintainStartTime(_ctx.stringValue("DescribeActiveOperationMaintenanceConfigResponse.Config.MaintainStartTime"));
		config.setMaintainEndTime(_ctx.stringValue("DescribeActiveOperationMaintenanceConfigResponse.Config.MaintainEndTime"));
		config.setCycleTime(_ctx.stringValue("DescribeActiveOperationMaintenanceConfigResponse.Config.CycleTime"));
		config.setCreatedTime(_ctx.stringValue("DescribeActiveOperationMaintenanceConfigResponse.Config.CreatedTime"));
		describeActiveOperationMaintenanceConfigResponse.setConfig(config);
	 
	 	return describeActiveOperationMaintenanceConfigResponse;
	}
}