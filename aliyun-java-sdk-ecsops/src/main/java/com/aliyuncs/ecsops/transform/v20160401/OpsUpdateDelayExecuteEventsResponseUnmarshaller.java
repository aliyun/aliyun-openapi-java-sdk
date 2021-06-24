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

import com.aliyuncs.ecsops.model.v20160401.OpsUpdateDelayExecuteEventsResponse;
import com.aliyuncs.ecsops.model.v20160401.OpsUpdateDelayExecuteEventsResponse.DelayExecuteEvent;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpsUpdateDelayExecuteEventsResponseUnmarshaller {

	public static OpsUpdateDelayExecuteEventsResponse unmarshall(OpsUpdateDelayExecuteEventsResponse opsUpdateDelayExecuteEventsResponse, UnmarshallerContext _ctx) {
		
		opsUpdateDelayExecuteEventsResponse.setRequestId(_ctx.stringValue("OpsUpdateDelayExecuteEventsResponse.RequestId"));
		opsUpdateDelayExecuteEventsResponse.setBizMessage(_ctx.stringValue("OpsUpdateDelayExecuteEventsResponse.BizMessage"));
		opsUpdateDelayExecuteEventsResponse.setBizCode(_ctx.stringValue("OpsUpdateDelayExecuteEventsResponse.BizCode"));

		DelayExecuteEvent delayExecuteEvent = new DelayExecuteEvent();
		delayExecuteEvent.setEventFinishTime(_ctx.stringValue("OpsUpdateDelayExecuteEventsResponse.DelayExecuteEvent.EventFinishTime"));
		delayExecuteEvent.setEventStartTime(_ctx.stringValue("OpsUpdateDelayExecuteEventsResponse.DelayExecuteEvent.EventStartTime"));
		delayExecuteEvent.setExtendData(_ctx.stringValue("OpsUpdateDelayExecuteEventsResponse.DelayExecuteEvent.ExtendData"));
		delayExecuteEvent.setPlanTime(_ctx.stringValue("OpsUpdateDelayExecuteEventsResponse.DelayExecuteEvent.PlanTime"));
		delayExecuteEvent.setMaintenanceId(_ctx.longValue("OpsUpdateDelayExecuteEventsResponse.DelayExecuteEvent.MaintenanceId"));
		delayExecuteEvent.setVmName(_ctx.stringValue("OpsUpdateDelayExecuteEventsResponse.DelayExecuteEvent.VmName"));
		delayExecuteEvent.setGmtModified(_ctx.stringValue("OpsUpdateDelayExecuteEventsResponse.DelayExecuteEvent.GmtModified"));
		delayExecuteEvent.setEffective(_ctx.integerValue("OpsUpdateDelayExecuteEventsResponse.DelayExecuteEvent.Effective"));
		delayExecuteEvent.setPublishTime(_ctx.stringValue("OpsUpdateDelayExecuteEventsResponse.DelayExecuteEvent.PublishTime"));
		delayExecuteEvent.setEventType(_ctx.stringValue("OpsUpdateDelayExecuteEventsResponse.DelayExecuteEvent.EventType"));
		delayExecuteEvent.setGmtCreate(_ctx.stringValue("OpsUpdateDelayExecuteEventsResponse.DelayExecuteEvent.GmtCreate"));
		delayExecuteEvent.setEventStatus(_ctx.stringValue("OpsUpdateDelayExecuteEventsResponse.DelayExecuteEvent.EventStatus"));
		delayExecuteEvent.setDelayTimes(_ctx.integerValue("OpsUpdateDelayExecuteEventsResponse.DelayExecuteEvent.DelayTimes"));
		delayExecuteEvent.setId(_ctx.longValue("OpsUpdateDelayExecuteEventsResponse.DelayExecuteEvent.Id"));
		opsUpdateDelayExecuteEventsResponse.setDelayExecuteEvent(delayExecuteEvent);
	 
	 	return opsUpdateDelayExecuteEventsResponse;
	}
}