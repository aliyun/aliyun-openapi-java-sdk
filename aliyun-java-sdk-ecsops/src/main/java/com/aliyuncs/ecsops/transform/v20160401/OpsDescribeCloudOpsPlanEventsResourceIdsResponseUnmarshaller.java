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

import com.aliyuncs.ecsops.model.v20160401.OpsDescribeCloudOpsPlanEventsResourceIdsResponse;
import com.aliyuncs.ecsops.model.v20160401.OpsDescribeCloudOpsPlanEventsResourceIdsResponse.PlanEventAttribute;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpsDescribeCloudOpsPlanEventsResourceIdsResponseUnmarshaller {

	public static OpsDescribeCloudOpsPlanEventsResourceIdsResponse unmarshall(OpsDescribeCloudOpsPlanEventsResourceIdsResponse opsDescribeCloudOpsPlanEventsResourceIdsResponse, UnmarshallerContext _ctx) {
		
		opsDescribeCloudOpsPlanEventsResourceIdsResponse.setRequestId(_ctx.stringValue("OpsDescribeCloudOpsPlanEventsResourceIdsResponse.RequestId"));
		opsDescribeCloudOpsPlanEventsResourceIdsResponse.setCount(_ctx.integerValue("OpsDescribeCloudOpsPlanEventsResourceIdsResponse.Count"));
		opsDescribeCloudOpsPlanEventsResourceIdsResponse.setPage(_ctx.integerValue("OpsDescribeCloudOpsPlanEventsResourceIdsResponse.Page"));
		opsDescribeCloudOpsPlanEventsResourceIdsResponse.setPageSize(_ctx.integerValue("OpsDescribeCloudOpsPlanEventsResourceIdsResponse.PageSize"));
		opsDescribeCloudOpsPlanEventsResourceIdsResponse.setTotalCount(_ctx.integerValue("OpsDescribeCloudOpsPlanEventsResourceIdsResponse.TotalCount"));

		List<PlanEventAttribute> data = new ArrayList<PlanEventAttribute>();
		for (int i = 0; i < _ctx.lengthValue("OpsDescribeCloudOpsPlanEventsResourceIdsResponse.Data.Length"); i++) {
			PlanEventAttribute planEventAttribute = new PlanEventAttribute();
			planEventAttribute.setBizEventId(_ctx.stringValue("OpsDescribeCloudOpsPlanEventsResourceIdsResponse.Data["+ i +"].BizEventId"));
			planEventAttribute.setEventId(_ctx.stringValue("OpsDescribeCloudOpsPlanEventsResourceIdsResponse.Data["+ i +"].EventId"));
			planEventAttribute.setEventSource(_ctx.stringValue("OpsDescribeCloudOpsPlanEventsResourceIdsResponse.Data["+ i +"].EventSource"));
			planEventAttribute.setEventTime(_ctx.stringValue("OpsDescribeCloudOpsPlanEventsResourceIdsResponse.Data["+ i +"].EventTime"));
			planEventAttribute.setEventType(_ctx.stringValue("OpsDescribeCloudOpsPlanEventsResourceIdsResponse.Data["+ i +"].EventType"));
			planEventAttribute.setExtendData(_ctx.stringValue("OpsDescribeCloudOpsPlanEventsResourceIdsResponse.Data["+ i +"].ExtendData"));
			planEventAttribute.setGmtCreate(_ctx.stringValue("OpsDescribeCloudOpsPlanEventsResourceIdsResponse.Data["+ i +"].GmtCreate"));
			planEventAttribute.setGmtModified(_ctx.stringValue("OpsDescribeCloudOpsPlanEventsResourceIdsResponse.Data["+ i +"].GmtModified"));
			planEventAttribute.setImpact(_ctx.stringValue("OpsDescribeCloudOpsPlanEventsResourceIdsResponse.Data["+ i +"].Impact"));
			planEventAttribute.setMaintenanceId(_ctx.stringValue("OpsDescribeCloudOpsPlanEventsResourceIdsResponse.Data["+ i +"].MaintenanceId"));
			planEventAttribute.setOpsCode(_ctx.stringValue("OpsDescribeCloudOpsPlanEventsResourceIdsResponse.Data["+ i +"].OpsCode"));
			planEventAttribute.setRemark(_ctx.stringValue("OpsDescribeCloudOpsPlanEventsResourceIdsResponse.Data["+ i +"].Remark"));
			planEventAttribute.setResourceId(_ctx.stringValue("OpsDescribeCloudOpsPlanEventsResourceIdsResponse.Data["+ i +"].ResourceId"));
			planEventAttribute.setResourceType(_ctx.stringValue("OpsDescribeCloudOpsPlanEventsResourceIdsResponse.Data["+ i +"].ResourceType"));
			planEventAttribute.setScheduleId(_ctx.stringValue("OpsDescribeCloudOpsPlanEventsResourceIdsResponse.Data["+ i +"].ScheduleId"));
			planEventAttribute.setStatus(_ctx.stringValue("OpsDescribeCloudOpsPlanEventsResourceIdsResponse.Data["+ i +"].Status"));
			planEventAttribute.setVersion(_ctx.integerValue("OpsDescribeCloudOpsPlanEventsResourceIdsResponse.Data["+ i +"].Version"));

			data.add(planEventAttribute);
		}
		opsDescribeCloudOpsPlanEventsResourceIdsResponse.setData(data);
	 
	 	return opsDescribeCloudOpsPlanEventsResourceIdsResponse;
	}
}