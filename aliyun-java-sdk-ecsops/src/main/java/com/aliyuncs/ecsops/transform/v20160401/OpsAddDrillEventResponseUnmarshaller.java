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

import com.aliyuncs.ecsops.model.v20160401.OpsAddDrillEventResponse;
import com.aliyuncs.ecsops.model.v20160401.OpsAddDrillEventResponse.DrillEvent;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpsAddDrillEventResponseUnmarshaller {

	public static OpsAddDrillEventResponse unmarshall(OpsAddDrillEventResponse opsAddDrillEventResponse, UnmarshallerContext _ctx) {
		
		opsAddDrillEventResponse.setRequestId(_ctx.stringValue("OpsAddDrillEventResponse.RequestId"));

		List<DrillEvent> drillEvents = new ArrayList<DrillEvent>();
		for (int i = 0; i < _ctx.lengthValue("OpsAddDrillEventResponse.DrillEvents.Length"); i++) {
			DrillEvent drillEvent = new DrillEvent();
			drillEvent.setClusterName(_ctx.stringValue("OpsAddDrillEventResponse.DrillEvents["+ i +"].ClusterName"));
			drillEvent.setMachineId(_ctx.stringValue("OpsAddDrillEventResponse.DrillEvents["+ i +"].MachineId"));
			drillEvent.setDrillReason(_ctx.stringValue("OpsAddDrillEventResponse.DrillEvents["+ i +"].DrillReason"));
			drillEvent.setStartTime(_ctx.stringValue("OpsAddDrillEventResponse.DrillEvents["+ i +"].StartTime"));
			drillEvent.setEndTime(_ctx.stringValue("OpsAddDrillEventResponse.DrillEvents["+ i +"].EndTime"));
			drillEvent.setDrillExecResult(_ctx.stringValue("OpsAddDrillEventResponse.DrillEvents["+ i +"].DrillExecResult"));
			drillEvent.setDrillExecTime(_ctx.stringValue("OpsAddDrillEventResponse.DrillEvents["+ i +"].DrillExecTime"));

			drillEvents.add(drillEvent);
		}
		opsAddDrillEventResponse.setDrillEvents(drillEvents);
	 
	 	return opsAddDrillEventResponse;
	}
}