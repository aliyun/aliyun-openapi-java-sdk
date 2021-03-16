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

import com.aliyuncs.ecsops.model.v20160401.OpsQueryDrillEventResponse;
import com.aliyuncs.ecsops.model.v20160401.OpsQueryDrillEventResponse.DrillEvent;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpsQueryDrillEventResponseUnmarshaller {

	public static OpsQueryDrillEventResponse unmarshall(OpsQueryDrillEventResponse opsQueryDrillEventResponse, UnmarshallerContext _ctx) {
		
		opsQueryDrillEventResponse.setRequestId(_ctx.stringValue("OpsQueryDrillEventResponse.RequestId"));
		opsQueryDrillEventResponse.setTotalCount(_ctx.integerValue("OpsQueryDrillEventResponse.TotalCount"));
		opsQueryDrillEventResponse.setPageNumber(_ctx.integerValue("OpsQueryDrillEventResponse.PageNumber"));
		opsQueryDrillEventResponse.setPageSize(_ctx.integerValue("OpsQueryDrillEventResponse.PageSize"));

		List<DrillEvent> drillEvents = new ArrayList<DrillEvent>();
		for (int i = 0; i < _ctx.lengthValue("OpsQueryDrillEventResponse.DrillEvents.Length"); i++) {
			DrillEvent drillEvent = new DrillEvent();
			drillEvent.setClusterName(_ctx.stringValue("OpsQueryDrillEventResponse.DrillEvents["+ i +"].ClusterName"));
			drillEvent.setMachineId(_ctx.stringValue("OpsQueryDrillEventResponse.DrillEvents["+ i +"].MachineId"));
			drillEvent.setDrillReason(_ctx.stringValue("OpsQueryDrillEventResponse.DrillEvents["+ i +"].DrillReason"));
			drillEvent.setStartTime(_ctx.stringValue("OpsQueryDrillEventResponse.DrillEvents["+ i +"].StartTime"));
			drillEvent.setEndTime(_ctx.stringValue("OpsQueryDrillEventResponse.DrillEvents["+ i +"].EndTime"));
			drillEvent.setDrillExecResult(_ctx.stringValue("OpsQueryDrillEventResponse.DrillEvents["+ i +"].DrillExecResult"));
			drillEvent.setDrillExecTime(_ctx.stringValue("OpsQueryDrillEventResponse.DrillEvents["+ i +"].DrillExecTime"));

			drillEvents.add(drillEvent);
		}
		opsQueryDrillEventResponse.setDrillEvents(drillEvents);
	 
	 	return opsQueryDrillEventResponse;
	}
}