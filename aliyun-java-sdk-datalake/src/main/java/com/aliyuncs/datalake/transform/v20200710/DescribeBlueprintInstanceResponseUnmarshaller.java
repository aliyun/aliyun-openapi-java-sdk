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

package com.aliyuncs.datalake.transform.v20200710;

import com.aliyuncs.datalake.model.v20200710.DescribeBlueprintInstanceResponse;
import com.aliyuncs.datalake.model.v20200710.DescribeBlueprintInstanceResponse.BlueprintInstance;
import com.aliyuncs.datalake.model.v20200710.DescribeBlueprintInstanceResponse.BlueprintInstance.LastRunFlowInstance;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeBlueprintInstanceResponseUnmarshaller {

	public static DescribeBlueprintInstanceResponse unmarshall(DescribeBlueprintInstanceResponse describeBlueprintInstanceResponse, UnmarshallerContext _ctx) {
		
		describeBlueprintInstanceResponse.setRequestId(_ctx.stringValue("DescribeBlueprintInstanceResponse.RequestId"));
		describeBlueprintInstanceResponse.setSuccess(_ctx.stringValue("DescribeBlueprintInstanceResponse.Success"));

		BlueprintInstance blueprintInstance = new BlueprintInstance();
		blueprintInstance.setBlueprintInstanceId(_ctx.stringValue("DescribeBlueprintInstanceResponse.BlueprintInstance.BlueprintInstanceId"));
		blueprintInstance.setName(_ctx.stringValue("DescribeBlueprintInstanceResponse.BlueprintInstance.Name"));
		blueprintInstance.setRegionId(_ctx.stringValue("DescribeBlueprintInstanceResponse.BlueprintInstance.RegionId"));
		blueprintInstance.setBlueprintType(_ctx.stringValue("DescribeBlueprintInstanceResponse.BlueprintInstance.BlueprintType"));
		blueprintInstance.setSourceDataSourceId(_ctx.stringValue("DescribeBlueprintInstanceResponse.BlueprintInstance.SourceDataSourceId"));
		blueprintInstance.setSourceInclude(_ctx.stringValue("DescribeBlueprintInstanceResponse.BlueprintInstance.SourceInclude"));
		blueprintInstance.setSourceSchema(_ctx.stringValue("DescribeBlueprintInstanceResponse.BlueprintInstance.SourceSchema"));
		blueprintInstance.setSourcePrimaryColumn(_ctx.stringValue("DescribeBlueprintInstanceResponse.BlueprintInstance.SourcePrimaryColumn"));
		blueprintInstance.setSourceChannelId(_ctx.stringValue("DescribeBlueprintInstanceResponse.BlueprintInstance.SourceChannelId"));
		blueprintInstance.setSourceChannelName(_ctx.stringValue("DescribeBlueprintInstanceResponse.BlueprintInstance.SourceChannelName"));
		blueprintInstance.setSourceChannelType(_ctx.stringValue("DescribeBlueprintInstanceResponse.BlueprintInstance.SourceChannelType"));
		blueprintInstance.setTargetDatabase(_ctx.stringValue("DescribeBlueprintInstanceResponse.BlueprintInstance.TargetDatabase"));
		blueprintInstance.setTargetLocationUri(_ctx.stringValue("DescribeBlueprintInstanceResponse.BlueprintInstance.TargetLocationUri"));
		blueprintInstance.setTargetFormat(_ctx.stringValue("DescribeBlueprintInstanceResponse.BlueprintInstance.TargetFormat"));
		blueprintInstance.setTargetTablePrefix(_ctx.stringValue("DescribeBlueprintInstanceResponse.BlueprintInstance.TargetTablePrefix"));
		blueprintInstance.setExecuteType(_ctx.stringValue("DescribeBlueprintInstanceResponse.BlueprintInstance.ExecuteType"));
		blueprintInstance.setExecuteParameters(_ctx.stringValue("DescribeBlueprintInstanceResponse.BlueprintInstance.ExecuteParameters"));
		blueprintInstance.setExecuteCapacity(_ctx.longValue("DescribeBlueprintInstanceResponse.BlueprintInstance.ExecuteCapacity"));
		blueprintInstance.setRoleName(_ctx.longValue("DescribeBlueprintInstanceResponse.BlueprintInstance.RoleName"));
		blueprintInstance.setEmrFlowId(_ctx.stringValue("DescribeBlueprintInstanceResponse.BlueprintInstance.EmrFlowId"));
		blueprintInstance.setEmrFlowProjectId(_ctx.stringValue("DescribeBlueprintInstanceResponse.BlueprintInstance.EmrFlowProjectId"));
		blueprintInstance.setCreator(_ctx.stringValue("DescribeBlueprintInstanceResponse.BlueprintInstance.Creator"));
		blueprintInstance.setOwner(_ctx.stringValue("DescribeBlueprintInstanceResponse.BlueprintInstance.Owner"));
		blueprintInstance.setEmrFlowScheduleStatus(_ctx.stringValue("DescribeBlueprintInstanceResponse.BlueprintInstance.EmrFlowScheduleStatus"));
		blueprintInstance.setGmtModified(_ctx.stringValue("DescribeBlueprintInstanceResponse.BlueprintInstance.GmtModified"));
		blueprintInstance.setGmtCreate(_ctx.stringValue("DescribeBlueprintInstanceResponse.BlueprintInstance.GmtCreate"));
		blueprintInstance.setStatus(_ctx.integerValue("DescribeBlueprintInstanceResponse.BlueprintInstance.Status"));
		blueprintInstance.setSourceLocationUri(_ctx.stringValue("DescribeBlueprintInstanceResponse.BlueprintInstance.SourceLocationUri"));
		blueprintInstance.setSourceFormat(_ctx.stringValue("DescribeBlueprintInstanceResponse.BlueprintInstance.SourceFormat"));
		blueprintInstance.setReason(_ctx.stringValue("DescribeBlueprintInstanceResponse.BlueprintInstance.Reason"));
		blueprintInstance.setSourceDataSourceName(_ctx.stringValue("DescribeBlueprintInstanceResponse.BlueprintInstance.SourceDataSourceName"));
		blueprintInstance.setPreProcessingConfig(_ctx.stringValue("DescribeBlueprintInstanceResponse.BlueprintInstance.PreProcessingConfig"));
		blueprintInstance.setDataSourceConfig(_ctx.stringValue("DescribeBlueprintInstanceResponse.BlueprintInstance.DataSourceConfig"));

		LastRunFlowInstance lastRunFlowInstance = new LastRunFlowInstance();
		lastRunFlowInstance.setFlowInstanceId(_ctx.stringValue("DescribeBlueprintInstanceResponse.BlueprintInstance.LastRunFlowInstance.FlowInstanceId"));
		lastRunFlowInstance.setFlowId(_ctx.stringValue("DescribeBlueprintInstanceResponse.BlueprintInstance.LastRunFlowInstance.FlowId"));
		lastRunFlowInstance.setDuration(_ctx.longValue("DescribeBlueprintInstanceResponse.BlueprintInstance.LastRunFlowInstance.Duration"));
		lastRunFlowInstance.setStartTime(_ctx.stringValue("DescribeBlueprintInstanceResponse.BlueprintInstance.LastRunFlowInstance.StartTime"));
		lastRunFlowInstance.setEndTime(_ctx.stringValue("DescribeBlueprintInstanceResponse.BlueprintInstance.LastRunFlowInstance.EndTime"));
		lastRunFlowInstance.setStatus(_ctx.stringValue("DescribeBlueprintInstanceResponse.BlueprintInstance.LastRunFlowInstance.Status"));
		lastRunFlowInstance.setFlowName(_ctx.stringValue("DescribeBlueprintInstanceResponse.BlueprintInstance.LastRunFlowInstance.FlowName"));
		lastRunFlowInstance.setProjectId(_ctx.stringValue("DescribeBlueprintInstanceResponse.BlueprintInstance.LastRunFlowInstance.ProjectId"));
		lastRunFlowInstance.setClusterId(_ctx.stringValue("DescribeBlueprintInstanceResponse.BlueprintInstance.LastRunFlowInstance.ClusterId"));
		lastRunFlowInstance.setReason(_ctx.stringValue("DescribeBlueprintInstanceResponse.BlueprintInstance.LastRunFlowInstance.Reason"));
		blueprintInstance.setLastRunFlowInstance(lastRunFlowInstance);
		describeBlueprintInstanceResponse.setBlueprintInstance(blueprintInstance);
	 
	 	return describeBlueprintInstanceResponse;
	}
}