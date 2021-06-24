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
		opsDescribeCloudOpsPlanEventsResponse.setTotalCount(_ctx.integerValue("OpsDescribeCloudOpsPlanEventsResponse.TotalCount"));
		opsDescribeCloudOpsPlanEventsResponse.setPageSize(_ctx.integerValue("OpsDescribeCloudOpsPlanEventsResponse.PageSize"));
		opsDescribeCloudOpsPlanEventsResponse.setBizMessage(_ctx.stringValue("OpsDescribeCloudOpsPlanEventsResponse.BizMessage"));
		opsDescribeCloudOpsPlanEventsResponse.setPage(_ctx.integerValue("OpsDescribeCloudOpsPlanEventsResponse.Page"));
		opsDescribeCloudOpsPlanEventsResponse.setCount(_ctx.integerValue("OpsDescribeCloudOpsPlanEventsResponse.Count"));
		opsDescribeCloudOpsPlanEventsResponse.setBizCode(_ctx.stringValue("OpsDescribeCloudOpsPlanEventsResponse.BizCode"));

		List<PlanEventInfo> data = new ArrayList<PlanEventInfo>();
		for (int i = 0; i < _ctx.lengthValue("OpsDescribeCloudOpsPlanEventsResponse.Data.Length"); i++) {
			PlanEventInfo planEventInfo = new PlanEventInfo();
			planEventInfo.setStatus(_ctx.stringValue("OpsDescribeCloudOpsPlanEventsResponse.Data["+ i +"].Status"));
			planEventInfo.setEventTime(_ctx.stringValue("OpsDescribeCloudOpsPlanEventsResponse.Data["+ i +"].EventTime"));
			planEventInfo.setExtendData(_ctx.stringValue("OpsDescribeCloudOpsPlanEventsResponse.Data["+ i +"].ExtendData"));
			planEventInfo.setImpact(_ctx.stringValue("OpsDescribeCloudOpsPlanEventsResponse.Data["+ i +"].Impact"));
			planEventInfo.setRemark(_ctx.stringValue("OpsDescribeCloudOpsPlanEventsResponse.Data["+ i +"].Remark"));
			planEventInfo.setMaintenanceId(_ctx.stringValue("OpsDescribeCloudOpsPlanEventsResponse.Data["+ i +"].MaintenanceId"));
			planEventInfo.setGmtModified(_ctx.stringValue("OpsDescribeCloudOpsPlanEventsResponse.Data["+ i +"].GmtModified"));
			planEventInfo.setOpsCode(_ctx.stringValue("OpsDescribeCloudOpsPlanEventsResponse.Data["+ i +"].OpsCode"));
			planEventInfo.setEventId(_ctx.stringValue("OpsDescribeCloudOpsPlanEventsResponse.Data["+ i +"].EventId"));
			planEventInfo.setBizEventId(_ctx.stringValue("OpsDescribeCloudOpsPlanEventsResponse.Data["+ i +"].BizEventId"));
			planEventInfo.setActionCode(_ctx.stringValue("OpsDescribeCloudOpsPlanEventsResponse.Data["+ i +"].ActionCode"));
			planEventInfo.setResourceType(_ctx.stringValue("OpsDescribeCloudOpsPlanEventsResponse.Data["+ i +"].ResourceType"));
			planEventInfo.setEventType(_ctx.stringValue("OpsDescribeCloudOpsPlanEventsResponse.Data["+ i +"].EventType"));
			planEventInfo.setVersion(_ctx.integerValue("OpsDescribeCloudOpsPlanEventsResponse.Data["+ i +"].Version"));
			planEventInfo.setGmtCreate(_ctx.stringValue("OpsDescribeCloudOpsPlanEventsResponse.Data["+ i +"].GmtCreate"));
			planEventInfo.setScheduleId(_ctx.stringValue("OpsDescribeCloudOpsPlanEventsResponse.Data["+ i +"].ScheduleId"));
			planEventInfo.setOpsTime(_ctx.stringValue("OpsDescribeCloudOpsPlanEventsResponse.Data["+ i +"].OpsTime"));
			planEventInfo.setResourceId(_ctx.stringValue("OpsDescribeCloudOpsPlanEventsResponse.Data["+ i +"].ResourceId"));
			planEventInfo.setEventSource(_ctx.stringValue("OpsDescribeCloudOpsPlanEventsResponse.Data["+ i +"].EventSource"));

			data.add(planEventInfo);
		}
		opsDescribeCloudOpsPlanEventsResponse.setData(data);
	 
	 	return opsDescribeCloudOpsPlanEventsResponse;
	}
}