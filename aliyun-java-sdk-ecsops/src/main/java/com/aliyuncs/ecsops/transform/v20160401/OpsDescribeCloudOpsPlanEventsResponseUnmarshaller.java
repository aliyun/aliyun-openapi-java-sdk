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

import com.aliyuncs.ecsops.model.v20160401.OpsDescribeCloudOpsPlanEventsResponse;
import com.aliyuncs.ecsops.model.v20160401.OpsDescribeCloudOpsPlanEventsResponse.PlanEventInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpsDescribeCloudOpsPlanEventsResponseUnmarshaller {

	public static OpsDescribeCloudOpsPlanEventsResponse unmarshall(OpsDescribeCloudOpsPlanEventsResponse opsDescribeCloudOpsPlanEventsResponse, UnmarshallerContext _ctx) {
		
		opsDescribeCloudOpsPlanEventsResponse.setRequestId(_ctx.stringValue("OpsDescribeCloudOpsPlanEventsResponse.RequestId"));
		opsDescribeCloudOpsPlanEventsResponse.setBizCode(_ctx.stringValue("OpsDescribeCloudOpsPlanEventsResponse.BizCode"));
		opsDescribeCloudOpsPlanEventsResponse.setBizMessage(_ctx.stringValue("OpsDescribeCloudOpsPlanEventsResponse.BizMessage"));
		opsDescribeCloudOpsPlanEventsResponse.setCount(_ctx.integerValue("OpsDescribeCloudOpsPlanEventsResponse.Count"));
		opsDescribeCloudOpsPlanEventsResponse.setPage(_ctx.integerValue("OpsDescribeCloudOpsPlanEventsResponse.Page"));
		opsDescribeCloudOpsPlanEventsResponse.setPageSize(_ctx.integerValue("OpsDescribeCloudOpsPlanEventsResponse.PageSize"));
		opsDescribeCloudOpsPlanEventsResponse.setTotalCount(_ctx.integerValue("OpsDescribeCloudOpsPlanEventsResponse.TotalCount"));

		List<PlanEventInfo> data = new ArrayList<PlanEventInfo>();
		for (int i = 0; i < _ctx.lengthValue("OpsDescribeCloudOpsPlanEventsResponse.Data.Length"); i++) {
			PlanEventInfo planEventInfo = new PlanEventInfo();
			planEventInfo.setBizEventId(_ctx.stringValue("OpsDescribeCloudOpsPlanEventsResponse.Data["+ i +"].BizEventId"));
			planEventInfo.setEventId(_ctx.stringValue("OpsDescribeCloudOpsPlanEventsResponse.Data["+ i +"].EventId"));
			planEventInfo.setEventSource(_ctx.stringValue("OpsDescribeCloudOpsPlanEventsResponse.Data["+ i +"].EventSource"));
			planEventInfo.setEventTime(_ctx.stringValue("OpsDescribeCloudOpsPlanEventsResponse.Data["+ i +"].EventTime"));
			planEventInfo.setEventType(_ctx.stringValue("OpsDescribeCloudOpsPlanEventsResponse.Data["+ i +"].EventType"));
			planEventInfo.setExtendData(_ctx.stringValue("OpsDescribeCloudOpsPlanEventsResponse.Data["+ i +"].ExtendData"));
			planEventInfo.setGmtCreate(_ctx.stringValue("OpsDescribeCloudOpsPlanEventsResponse.Data["+ i +"].GmtCreate"));
			planEventInfo.setGmtModified(_ctx.stringValue("OpsDescribeCloudOpsPlanEventsResponse.Data["+ i +"].GmtModified"));
			planEventInfo.setImpact(_ctx.stringValue("OpsDescribeCloudOpsPlanEventsResponse.Data["+ i +"].Impact"));
			planEventInfo.setMaintenanceId(_ctx.stringValue("OpsDescribeCloudOpsPlanEventsResponse.Data["+ i +"].MaintenanceId"));
			planEventInfo.setOpsCode(_ctx.stringValue("OpsDescribeCloudOpsPlanEventsResponse.Data["+ i +"].OpsCode"));
			planEventInfo.setRemark(_ctx.stringValue("OpsDescribeCloudOpsPlanEventsResponse.Data["+ i +"].Remark"));
			planEventInfo.setResourceId(_ctx.stringValue("OpsDescribeCloudOpsPlanEventsResponse.Data["+ i +"].ResourceId"));
			planEventInfo.setResourceType(_ctx.stringValue("OpsDescribeCloudOpsPlanEventsResponse.Data["+ i +"].ResourceType"));
			planEventInfo.setScheduleId(_ctx.stringValue("OpsDescribeCloudOpsPlanEventsResponse.Data["+ i +"].ScheduleId"));
			planEventInfo.setStatus(_ctx.stringValue("OpsDescribeCloudOpsPlanEventsResponse.Data["+ i +"].Status"));
			planEventInfo.setVersion(_ctx.integerValue("OpsDescribeCloudOpsPlanEventsResponse.Data["+ i +"].Version"));
			planEventInfo.setOpsTime(_ctx.stringValue("OpsDescribeCloudOpsPlanEventsResponse.Data["+ i +"].OpsTime"));
			planEventInfo.setActionCode(_ctx.stringValue("OpsDescribeCloudOpsPlanEventsResponse.Data["+ i +"].ActionCode"));

			data.add(planEventInfo);
		}
		opsDescribeCloudOpsPlanEventsResponse.setData(data);
	 
	 	return opsDescribeCloudOpsPlanEventsResponse;
	}
}