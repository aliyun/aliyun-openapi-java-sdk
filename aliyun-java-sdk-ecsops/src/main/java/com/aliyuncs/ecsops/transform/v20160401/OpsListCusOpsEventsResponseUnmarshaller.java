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

import com.aliyuncs.ecsops.model.v20160401.OpsListCusOpsEventsResponse;
import com.aliyuncs.ecsops.model.v20160401.OpsListCusOpsEventsResponse.OpsEventModel;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpsListCusOpsEventsResponseUnmarshaller {

	public static OpsListCusOpsEventsResponse unmarshall(OpsListCusOpsEventsResponse opsListCusOpsEventsResponse, UnmarshallerContext _ctx) {
		
		opsListCusOpsEventsResponse.setRequestId(_ctx.stringValue("OpsListCusOpsEventsResponse.RequestId"));
		opsListCusOpsEventsResponse.setPageNo(_ctx.integerValue("OpsListCusOpsEventsResponse.PageNo"));
		opsListCusOpsEventsResponse.setPageSize(_ctx.integerValue("OpsListCusOpsEventsResponse.PageSize"));
		opsListCusOpsEventsResponse.setTotal(_ctx.integerValue("OpsListCusOpsEventsResponse.Total"));

		List<OpsEventModel> opsEventModelList = new ArrayList<OpsEventModel>();
		for (int i = 0; i < _ctx.lengthValue("OpsListCusOpsEventsResponse.OpsEventModelList.Length"); i++) {
			OpsEventModel opsEventModel = new OpsEventModel();
			opsEventModel.setId(_ctx.longValue("OpsListCusOpsEventsResponse.OpsEventModelList["+ i +"].Id"));
			opsEventModel.setGmtCreate(_ctx.stringValue("OpsListCusOpsEventsResponse.OpsEventModelList["+ i +"].GmtCreate"));
			opsEventModel.setGmtModified(_ctx.stringValue("OpsListCusOpsEventsResponse.OpsEventModelList["+ i +"].GmtModified"));
			opsEventModel.setEventId(_ctx.stringValue("OpsListCusOpsEventsResponse.OpsEventModelList["+ i +"].EventId"));
			opsEventModel.setAliUid(_ctx.longValue("OpsListCusOpsEventsResponse.OpsEventModelList["+ i +"].AliUid"));
			opsEventModel.setRegionId(_ctx.longValue("OpsListCusOpsEventsResponse.OpsEventModelList["+ i +"].RegionId"));
			opsEventModel.setZoneId(_ctx.longValue("OpsListCusOpsEventsResponse.OpsEventModelList["+ i +"].ZoneId"));
			opsEventModel.setRegionNo(_ctx.stringValue("OpsListCusOpsEventsResponse.OpsEventModelList["+ i +"].RegionNo"));
			opsEventModel.setZoneNo(_ctx.stringValue("OpsListCusOpsEventsResponse.OpsEventModelList["+ i +"].ZoneNo"));
			opsEventModel.setVmName(_ctx.stringValue("OpsListCusOpsEventsResponse.OpsEventModelList["+ i +"].VmName"));
			opsEventModel.setDiskId(_ctx.stringValue("OpsListCusOpsEventsResponse.OpsEventModelList["+ i +"].DiskId"));
			opsEventModel.setHostId(_ctx.stringValue("OpsListCusOpsEventsResponse.OpsEventModelList["+ i +"].HostId"));
			opsEventModel.setNcIp(_ctx.stringValue("OpsListCusOpsEventsResponse.OpsEventModelList["+ i +"].NcIp"));
			opsEventModel.setClusterName(_ctx.stringValue("OpsListCusOpsEventsResponse.OpsEventModelList["+ i +"].ClusterName"));
			opsEventModel.setOpsType(_ctx.stringValue("OpsListCusOpsEventsResponse.OpsEventModelList["+ i +"].OpsType"));
			opsEventModel.setOpsUser(_ctx.stringValue("OpsListCusOpsEventsResponse.OpsEventModelList["+ i +"].OpsUser"));
			opsEventModel.setPublishTime(_ctx.stringValue("OpsListCusOpsEventsResponse.OpsEventModelList["+ i +"].PublishTime"));
			opsEventModel.setPlanTime(_ctx.stringValue("OpsListCusOpsEventsResponse.OpsEventModelList["+ i +"].PlanTime"));
			opsEventModel.setStartTime(_ctx.stringValue("OpsListCusOpsEventsResponse.OpsEventModelList["+ i +"].StartTime"));
			opsEventModel.setEndTime(_ctx.stringValue("OpsListCusOpsEventsResponse.OpsEventModelList["+ i +"].EndTime"));
			opsEventModel.setOpsCode(_ctx.stringValue("OpsListCusOpsEventsResponse.OpsEventModelList["+ i +"].OpsCode"));
			opsEventModel.setEventStatus(_ctx.stringValue("OpsListCusOpsEventsResponse.OpsEventModelList["+ i +"].EventStatus"));
			opsEventModel.setOpsBeforeInstanceStatus(_ctx.stringValue("OpsListCusOpsEventsResponse.OpsEventModelList["+ i +"].OpsBeforeInstanceStatus"));
			opsEventModel.setOpsBeforeSystemStatus(_ctx.stringValue("OpsListCusOpsEventsResponse.OpsEventModelList["+ i +"].OpsBeforeSystemStatus"));
			opsEventModel.setOpsInstanceStatus(_ctx.stringValue("OpsListCusOpsEventsResponse.OpsEventModelList["+ i +"].OpsInstanceStatus"));
			opsEventModel.setOpsSystemStatus(_ctx.stringValue("OpsListCusOpsEventsResponse.OpsEventModelList["+ i +"].OpsSystemStatus"));
			opsEventModel.setDiskEventType(_ctx.stringValue("OpsListCusOpsEventsResponse.OpsEventModelList["+ i +"].DiskEventType"));
			opsEventModel.setHostEventType(_ctx.stringValue("OpsListCusOpsEventsResponse.OpsEventModelList["+ i +"].HostEventType"));
			opsEventModel.setDiskHealthStatus(_ctx.stringValue("OpsListCusOpsEventsResponse.OpsEventModelList["+ i +"].DiskHealthStatus"));
			opsEventModel.setComments(_ctx.stringValue("OpsListCusOpsEventsResponse.OpsEventModelList["+ i +"].Comments"));
			opsEventModel.setOpsSource(_ctx.stringValue("OpsListCusOpsEventsResponse.OpsEventModelList["+ i +"].OpsSource"));
			opsEventModel.setExt1(_ctx.stringValue("OpsListCusOpsEventsResponse.OpsEventModelList["+ i +"].Ext1"));
			opsEventModel.setExt2(_ctx.stringValue("OpsListCusOpsEventsResponse.OpsEventModelList["+ i +"].Ext2"));
			opsEventModel.setExt3(_ctx.stringValue("OpsListCusOpsEventsResponse.OpsEventModelList["+ i +"].Ext3"));
			opsEventModel.setDstNcIp(_ctx.stringValue("OpsListCusOpsEventsResponse.OpsEventModelList["+ i +"].DstNcIp"));
			opsEventModel.setTs(_ctx.stringValue("OpsListCusOpsEventsResponse.OpsEventModelList["+ i +"].Ts"));
			opsEventModel.setReasonLevel1(_ctx.stringValue("OpsListCusOpsEventsResponse.OpsEventModelList["+ i +"].ReasonLevel1"));
			opsEventModel.setReasonLevel2(_ctx.stringValue("OpsListCusOpsEventsResponse.OpsEventModelList["+ i +"].ReasonLevel2"));
			opsEventModel.setReasonLevel3(_ctx.stringValue("OpsListCusOpsEventsResponse.OpsEventModelList["+ i +"].ReasonLevel3"));

			opsEventModelList.add(opsEventModel);
		}
		opsListCusOpsEventsResponse.setOpsEventModelList(opsEventModelList);
	 
	 	return opsListCusOpsEventsResponse;
	}
}