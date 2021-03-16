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

import com.aliyuncs.ecsops.model.v20160401.OpsDescribeCloudOpsVmOpsEventsResponse;
import com.aliyuncs.ecsops.model.v20160401.OpsDescribeCloudOpsVmOpsEventsResponse.OpsEventInfo;
import com.aliyuncs.ecsops.model.v20160401.OpsDescribeCloudOpsVmOpsEventsResponse.OpsEventInfo.EventInfo;
import com.aliyuncs.ecsops.model.v20160401.OpsDescribeCloudOpsVmOpsEventsResponse.OpsEventInfo.EventInfo.MaintenanceReason1;
import com.aliyuncs.ecsops.model.v20160401.OpsDescribeCloudOpsVmOpsEventsResponse.OpsEventInfo.MaintenanceReason;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpsDescribeCloudOpsVmOpsEventsResponseUnmarshaller {

	public static OpsDescribeCloudOpsVmOpsEventsResponse unmarshall(OpsDescribeCloudOpsVmOpsEventsResponse opsDescribeCloudOpsVmOpsEventsResponse, UnmarshallerContext _ctx) {
		
		opsDescribeCloudOpsVmOpsEventsResponse.setRequestId(_ctx.stringValue("OpsDescribeCloudOpsVmOpsEventsResponse.RequestId"));
		opsDescribeCloudOpsVmOpsEventsResponse.setBizCode(_ctx.stringValue("OpsDescribeCloudOpsVmOpsEventsResponse.BizCode"));
		opsDescribeCloudOpsVmOpsEventsResponse.setBizMessage(_ctx.stringValue("OpsDescribeCloudOpsVmOpsEventsResponse.BizMessage"));
		opsDescribeCloudOpsVmOpsEventsResponse.setCount(_ctx.integerValue("OpsDescribeCloudOpsVmOpsEventsResponse.Count"));
		opsDescribeCloudOpsVmOpsEventsResponse.setPage(_ctx.integerValue("OpsDescribeCloudOpsVmOpsEventsResponse.Page"));
		opsDescribeCloudOpsVmOpsEventsResponse.setPageSize(_ctx.integerValue("OpsDescribeCloudOpsVmOpsEventsResponse.PageSize"));
		opsDescribeCloudOpsVmOpsEventsResponse.setTotalCount(_ctx.integerValue("OpsDescribeCloudOpsVmOpsEventsResponse.TotalCount"));

		List<OpsEventInfo> data = new ArrayList<OpsEventInfo>();
		for (int i = 0; i < _ctx.lengthValue("OpsDescribeCloudOpsVmOpsEventsResponse.Data.Length"); i++) {
			OpsEventInfo opsEventInfo = new OpsEventInfo();
			opsEventInfo.setClusterName(_ctx.stringValue("OpsDescribeCloudOpsVmOpsEventsResponse.Data["+ i +"].ClusterName"));
			opsEventInfo.setComment(_ctx.stringValue("OpsDescribeCloudOpsVmOpsEventsResponse.Data["+ i +"].Comment"));
			opsEventInfo.setEventStatus(_ctx.stringValue("OpsDescribeCloudOpsVmOpsEventsResponse.Data["+ i +"].EventStatus"));
			opsEventInfo.setEventType(_ctx.stringValue("OpsDescribeCloudOpsVmOpsEventsResponse.Data["+ i +"].EventType"));
			opsEventInfo.setExtendData(_ctx.stringValue("OpsDescribeCloudOpsVmOpsEventsResponse.Data["+ i +"].ExtendData"));
			opsEventInfo.setId(_ctx.longValue("OpsDescribeCloudOpsVmOpsEventsResponse.Data["+ i +"].Id"));
			opsEventInfo.setVmName(_ctx.stringValue("OpsDescribeCloudOpsVmOpsEventsResponse.Data["+ i +"].VmName"));

			MaintenanceReason maintenanceReason = new MaintenanceReason();
			maintenanceReason.setGmtCreate(_ctx.stringValue("OpsDescribeCloudOpsVmOpsEventsResponse.Data["+ i +"].MaintenanceReason.GmtCreate"));
			maintenanceReason.setGmtModified(_ctx.stringValue("OpsDescribeCloudOpsVmOpsEventsResponse.Data["+ i +"].MaintenanceReason.GmtModified"));
			maintenanceReason.setIsDeleted(_ctx.integerValue("OpsDescribeCloudOpsVmOpsEventsResponse.Data["+ i +"].MaintenanceReason.IsDeleted"));
			maintenanceReason.setReasonLevel1(_ctx.stringValue("OpsDescribeCloudOpsVmOpsEventsResponse.Data["+ i +"].MaintenanceReason.ReasonLevel1"));
			maintenanceReason.setReasonLevel2(_ctx.stringValue("OpsDescribeCloudOpsVmOpsEventsResponse.Data["+ i +"].MaintenanceReason.ReasonLevel2"));
			maintenanceReason.setReasonLevel3(_ctx.stringValue("OpsDescribeCloudOpsVmOpsEventsResponse.Data["+ i +"].MaintenanceReason.ReasonLevel3"));
			maintenanceReason.setReasonType(_ctx.stringValue("OpsDescribeCloudOpsVmOpsEventsResponse.Data["+ i +"].MaintenanceReason.ReasonType"));
			opsEventInfo.setMaintenanceReason(maintenanceReason);

			List<EventInfo> eventInfos = new ArrayList<EventInfo>();
			for (int j = 0; j < _ctx.lengthValue("OpsDescribeCloudOpsVmOpsEventsResponse.Data["+ i +"].EventInfos.Length"); j++) {
				EventInfo eventInfo = new EventInfo();
				eventInfo.setId(_ctx.longValue("OpsDescribeCloudOpsVmOpsEventsResponse.Data["+ i +"].EventInfos["+ j +"].Id"));
				eventInfo.setEventType(_ctx.stringValue("OpsDescribeCloudOpsVmOpsEventsResponse.Data["+ i +"].EventInfos["+ j +"].EventType"));
				eventInfo.setPublishTime(_ctx.stringValue("OpsDescribeCloudOpsVmOpsEventsResponse.Data["+ i +"].EventInfos["+ j +"].PublishTime"));
				eventInfo.setPlanTime(_ctx.stringValue("OpsDescribeCloudOpsVmOpsEventsResponse.Data["+ i +"].EventInfos["+ j +"].PlanTime"));
				eventInfo.setEventStartTime(_ctx.stringValue("OpsDescribeCloudOpsVmOpsEventsResponse.Data["+ i +"].EventInfos["+ j +"].EventStartTime"));
				eventInfo.setEventFinishTime(_ctx.stringValue("OpsDescribeCloudOpsVmOpsEventsResponse.Data["+ i +"].EventInfos["+ j +"].EventFinishTime"));
				eventInfo.setEventStatus(_ctx.stringValue("OpsDescribeCloudOpsVmOpsEventsResponse.Data["+ i +"].EventInfos["+ j +"].EventStatus"));
				eventInfo.setUserAction(_ctx.stringValue("OpsDescribeCloudOpsVmOpsEventsResponse.Data["+ i +"].EventInfos["+ j +"].UserAction"));
				eventInfo.setNcIp(_ctx.stringValue("OpsDescribeCloudOpsVmOpsEventsResponse.Data["+ i +"].EventInfos["+ j +"].NcIp"));
				eventInfo.setClusterName(_ctx.stringValue("OpsDescribeCloudOpsVmOpsEventsResponse.Data["+ i +"].EventInfos["+ j +"].ClusterName"));
				eventInfo.setOpsUser(_ctx.stringValue("OpsDescribeCloudOpsVmOpsEventsResponse.Data["+ i +"].EventInfos["+ j +"].OpsUser"));
				eventInfo.setComment(_ctx.stringValue("OpsDescribeCloudOpsVmOpsEventsResponse.Data["+ i +"].EventInfos["+ j +"].Comment"));
				eventInfo.setReason(_ctx.stringValue("OpsDescribeCloudOpsVmOpsEventsResponse.Data["+ i +"].EventInfos["+ j +"].Reason"));
				eventInfo.setUpdateTime(_ctx.stringValue("OpsDescribeCloudOpsVmOpsEventsResponse.Data["+ i +"].EventInfos["+ j +"].UpdateTime"));
				eventInfo.setExtendData(_ctx.stringValue("OpsDescribeCloudOpsVmOpsEventsResponse.Data["+ i +"].EventInfos["+ j +"].ExtendData"));

				MaintenanceReason1 maintenanceReason1 = new MaintenanceReason1();
				maintenanceReason1.setGmtCreate(_ctx.stringValue("OpsDescribeCloudOpsVmOpsEventsResponse.Data["+ i +"].EventInfos["+ j +"].MaintenanceReason.GmtCreate"));
				maintenanceReason1.setGmtModified(_ctx.stringValue("OpsDescribeCloudOpsVmOpsEventsResponse.Data["+ i +"].EventInfos["+ j +"].MaintenanceReason.GmtModified"));
				maintenanceReason1.setIsDeleted(_ctx.integerValue("OpsDescribeCloudOpsVmOpsEventsResponse.Data["+ i +"].EventInfos["+ j +"].MaintenanceReason.IsDeleted"));
				maintenanceReason1.setReasonLevel1(_ctx.stringValue("OpsDescribeCloudOpsVmOpsEventsResponse.Data["+ i +"].EventInfos["+ j +"].MaintenanceReason.ReasonLevel1"));
				maintenanceReason1.setReasonLevel2(_ctx.stringValue("OpsDescribeCloudOpsVmOpsEventsResponse.Data["+ i +"].EventInfos["+ j +"].MaintenanceReason.ReasonLevel2"));
				maintenanceReason1.setReasonLevel3(_ctx.stringValue("OpsDescribeCloudOpsVmOpsEventsResponse.Data["+ i +"].EventInfos["+ j +"].MaintenanceReason.ReasonLevel3"));
				maintenanceReason1.setReasonType(_ctx.stringValue("OpsDescribeCloudOpsVmOpsEventsResponse.Data["+ i +"].EventInfos["+ j +"].MaintenanceReason.ReasonType"));
				eventInfo.setMaintenanceReason1(maintenanceReason1);

				eventInfos.add(eventInfo);
			}
			opsEventInfo.setEventInfos(eventInfos);

			data.add(opsEventInfo);
		}
		opsDescribeCloudOpsVmOpsEventsResponse.setData(data);
	 
	 	return opsDescribeCloudOpsVmOpsEventsResponse;
	}
}