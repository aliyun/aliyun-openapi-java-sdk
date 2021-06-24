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

import com.aliyuncs.ecsops.model.v20160401.OpsAddCloudOpsDrillEventResponse;
import com.aliyuncs.ecsops.model.v20160401.OpsAddCloudOpsDrillEventResponse.DrillEvent;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpsAddCloudOpsDrillEventResponseUnmarshaller {

	public static OpsAddCloudOpsDrillEventResponse unmarshall(OpsAddCloudOpsDrillEventResponse opsAddCloudOpsDrillEventResponse, UnmarshallerContext _ctx) {
		
		opsAddCloudOpsDrillEventResponse.setRequestId(_ctx.stringValue("OpsAddCloudOpsDrillEventResponse.RequestId"));
		opsAddCloudOpsDrillEventResponse.setBizMessage(_ctx.stringValue("OpsAddCloudOpsDrillEventResponse.BizMessage"));
		opsAddCloudOpsDrillEventResponse.setBizCode(_ctx.stringValue("OpsAddCloudOpsDrillEventResponse.BizCode"));

		DrillEvent drillEvent = new DrillEvent();
		drillEvent.setStatus(_ctx.stringValue("OpsAddCloudOpsDrillEventResponse.DrillEvent.Status"));
		drillEvent.setToken(_ctx.stringValue("OpsAddCloudOpsDrillEventResponse.DrillEvent.Token"));
		drillEvent.setExceptionType(_ctx.stringValue("OpsAddCloudOpsDrillEventResponse.DrillEvent.ExceptionType"));
		drillEvent.setGmtModified(_ctx.stringValue("OpsAddCloudOpsDrillEventResponse.DrillEvent.GmtModified"));
		drillEvent.setExtInfo(_ctx.stringValue("OpsAddCloudOpsDrillEventResponse.DrillEvent.ExtInfo"));
		drillEvent.setRegionId(_ctx.stringValue("OpsAddCloudOpsDrillEventResponse.DrillEvent.RegionId"));
		drillEvent.setEndTime(_ctx.stringValue("OpsAddCloudOpsDrillEventResponse.DrillEvent.EndTime"));
		drillEvent.setStartTime(_ctx.stringValue("OpsAddCloudOpsDrillEventResponse.DrillEvent.StartTime"));
		drillEvent.setGmtCreate(_ctx.stringValue("OpsAddCloudOpsDrillEventResponse.DrillEvent.GmtCreate"));
		drillEvent.setTitle(_ctx.stringValue("OpsAddCloudOpsDrillEventResponse.DrillEvent.Title"));

		List<String> machineIds = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("OpsAddCloudOpsDrillEventResponse.DrillEvent.MachineIds.Length"); i++) {
			machineIds.add(_ctx.stringValue("OpsAddCloudOpsDrillEventResponse.DrillEvent.MachineIds["+ i +"]"));
		}
		drillEvent.setMachineIds(machineIds);

		List<String> clusters = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("OpsAddCloudOpsDrillEventResponse.DrillEvent.Clusters.Length"); i++) {
			clusters.add(_ctx.stringValue("OpsAddCloudOpsDrillEventResponse.DrillEvent.Clusters["+ i +"]"));
		}
		drillEvent.setClusters(clusters);
		opsAddCloudOpsDrillEventResponse.setDrillEvent(drillEvent);
	 
	 	return opsAddCloudOpsDrillEventResponse;
	}
}