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

import com.aliyuncs.ecsops.model.v20160401.OpsDescribeCloudOpsPlanEventsEventIdsResponse;
import com.aliyuncs.ecsops.model.v20160401.OpsDescribeCloudOpsPlanEventsEventIdsResponse.PlanEvent;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpsDescribeCloudOpsPlanEventsEventIdsResponseUnmarshaller {

	public static OpsDescribeCloudOpsPlanEventsEventIdsResponse unmarshall(OpsDescribeCloudOpsPlanEventsEventIdsResponse opsDescribeCloudOpsPlanEventsEventIdsResponse, UnmarshallerContext _ctx) {
		
		opsDescribeCloudOpsPlanEventsEventIdsResponse.setRequestId(_ctx.stringValue("OpsDescribeCloudOpsPlanEventsEventIdsResponse.RequestId"));
		opsDescribeCloudOpsPlanEventsEventIdsResponse.setTotalCount(_ctx.integerValue("OpsDescribeCloudOpsPlanEventsEventIdsResponse.TotalCount"));
		opsDescribeCloudOpsPlanEventsEventIdsResponse.setPageSize(_ctx.integerValue("OpsDescribeCloudOpsPlanEventsEventIdsResponse.PageSize"));
		opsDescribeCloudOpsPlanEventsEventIdsResponse.setPage(_ctx.integerValue("OpsDescribeCloudOpsPlanEventsEventIdsResponse.Page"));
		opsDescribeCloudOpsPlanEventsEventIdsResponse.setCount(_ctx.integerValue("OpsDescribeCloudOpsPlanEventsEventIdsResponse.Count"));

		List<PlanEvent> data = new ArrayList<PlanEvent>();
		for (int i = 0; i < _ctx.lengthValue("OpsDescribeCloudOpsPlanEventsEventIdsResponse.Data.Length"); i++) {
			PlanEvent planEvent = new PlanEvent();
			planEvent.setStatus(_ctx.stringValue("OpsDescribeCloudOpsPlanEventsEventIdsResponse.Data["+ i +"].Status"));
			planEvent.setEventTime(_ctx.stringValue("OpsDescribeCloudOpsPlanEventsEventIdsResponse.Data["+ i +"].EventTime"));
			planEvent.setExtendData(_ctx.stringValue("OpsDescribeCloudOpsPlanEventsEventIdsResponse.Data["+ i +"].ExtendData"));
			planEvent.setImpact(_ctx.stringValue("OpsDescribeCloudOpsPlanEventsEventIdsResponse.Data["+ i +"].Impact"));
			planEvent.setRemark(_ctx.stringValue("OpsDescribeCloudOpsPlanEventsEventIdsResponse.Data["+ i +"].Remark"));
			planEvent.setMaintenanceId(_ctx.stringValue("OpsDescribeCloudOpsPlanEventsEventIdsResponse.Data["+ i +"].MaintenanceId"));
			planEvent.setGmtModified(_ctx.stringValue("OpsDescribeCloudOpsPlanEventsEventIdsResponse.Data["+ i +"].GmtModified"));
			planEvent.setOpsCode(_ctx.stringValue("OpsDescribeCloudOpsPlanEventsEventIdsResponse.Data["+ i +"].OpsCode"));
			planEvent.setEventId(_ctx.stringValue("OpsDescribeCloudOpsPlanEventsEventIdsResponse.Data["+ i +"].EventId"));
			planEvent.setBizEventId(_ctx.stringValue("OpsDescribeCloudOpsPlanEventsEventIdsResponse.Data["+ i +"].BizEventId"));
			planEvent.setEventType(_ctx.stringValue("OpsDescribeCloudOpsPlanEventsEventIdsResponse.Data["+ i +"].EventType"));
			planEvent.setResourceType(_ctx.stringValue("OpsDescribeCloudOpsPlanEventsEventIdsResponse.Data["+ i +"].ResourceType"));
			planEvent.setVersion(_ctx.integerValue("OpsDescribeCloudOpsPlanEventsEventIdsResponse.Data["+ i +"].Version"));
			planEvent.setGmtCreate(_ctx.stringValue("OpsDescribeCloudOpsPlanEventsEventIdsResponse.Data["+ i +"].GmtCreate"));
			planEvent.setScheduleId(_ctx.stringValue("OpsDescribeCloudOpsPlanEventsEventIdsResponse.Data["+ i +"].ScheduleId"));
			planEvent.setResourceId(_ctx.stringValue("OpsDescribeCloudOpsPlanEventsEventIdsResponse.Data["+ i +"].ResourceId"));
			planEvent.setEventSource(_ctx.stringValue("OpsDescribeCloudOpsPlanEventsEventIdsResponse.Data["+ i +"].EventSource"));

			data.add(planEvent);
		}
		opsDescribeCloudOpsPlanEventsEventIdsResponse.setData(data);
	 
	 	return opsDescribeCloudOpsPlanEventsEventIdsResponse;
	}
}