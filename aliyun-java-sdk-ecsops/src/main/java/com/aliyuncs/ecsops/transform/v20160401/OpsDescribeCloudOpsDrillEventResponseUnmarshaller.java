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

package com.aliyuncs.ecsops.transform.v20160401;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecsops.model.v20160401.OpsDescribeCloudOpsDrillEventResponse;
import com.aliyuncs.ecsops.model.v20160401.OpsDescribeCloudOpsDrillEventResponse.DrillEvent;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpsDescribeCloudOpsDrillEventResponseUnmarshaller {

	public static OpsDescribeCloudOpsDrillEventResponse unmarshall(OpsDescribeCloudOpsDrillEventResponse opsDescribeCloudOpsDrillEventResponse, UnmarshallerContext _ctx) {
		
		opsDescribeCloudOpsDrillEventResponse.setRequestId(_ctx.stringValue("OpsDescribeCloudOpsDrillEventResponse.RequestId"));
		opsDescribeCloudOpsDrillEventResponse.setBizMessage(_ctx.stringValue("OpsDescribeCloudOpsDrillEventResponse.BizMessage"));
		opsDescribeCloudOpsDrillEventResponse.setBizCode(_ctx.stringValue("OpsDescribeCloudOpsDrillEventResponse.BizCode"));

		DrillEvent drillEvent = new DrillEvent();
		drillEvent.setStatus(_ctx.stringValue("OpsDescribeCloudOpsDrillEventResponse.DrillEvent.Status"));
		drillEvent.setToken(_ctx.stringValue("OpsDescribeCloudOpsDrillEventResponse.DrillEvent.Token"));
		drillEvent.setExceptionType(_ctx.stringValue("OpsDescribeCloudOpsDrillEventResponse.DrillEvent.ExceptionType"));
		drillEvent.setGmtModified(_ctx.stringValue("OpsDescribeCloudOpsDrillEventResponse.DrillEvent.GmtModified"));
		drillEvent.setExtInfo(_ctx.stringValue("OpsDescribeCloudOpsDrillEventResponse.DrillEvent.ExtInfo"));
		drillEvent.setRegionId(_ctx.stringValue("OpsDescribeCloudOpsDrillEventResponse.DrillEvent.RegionId"));
		drillEvent.setEndTime(_ctx.stringValue("OpsDescribeCloudOpsDrillEventResponse.DrillEvent.EndTime"));
		drillEvent.setStartTime(_ctx.stringValue("OpsDescribeCloudOpsDrillEventResponse.DrillEvent.StartTime"));
		drillEvent.setGmtCreate(_ctx.stringValue("OpsDescribeCloudOpsDrillEventResponse.DrillEvent.GmtCreate"));
		drillEvent.setTitle(_ctx.stringValue("OpsDescribeCloudOpsDrillEventResponse.DrillEvent.Title"));

		List<String> machineIds = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("OpsDescribeCloudOpsDrillEventResponse.DrillEvent.MachineIds.Length"); i++) {
			machineIds.add(_ctx.stringValue("OpsDescribeCloudOpsDrillEventResponse.DrillEvent.MachineIds["+ i +"]"));
		}
		drillEvent.setMachineIds(machineIds);

		List<String> clusters = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("OpsDescribeCloudOpsDrillEventResponse.DrillEvent.Clusters.Length"); i++) {
			clusters.add(_ctx.stringValue("OpsDescribeCloudOpsDrillEventResponse.DrillEvent.Clusters["+ i +"]"));
		}
		drillEvent.setClusters(clusters);
		opsDescribeCloudOpsDrillEventResponse.setDrillEvent(drillEvent);
	 
	 	return opsDescribeCloudOpsDrillEventResponse;
	}
}