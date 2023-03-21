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

package com.aliyuncs.appstream_center.transform.v20210901;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.appstream_center.model.v20210901.GetAppInstanceGroupResponse;
import com.aliyuncs.appstream_center.model.v20210901.GetAppInstanceGroupResponse.AppInstanceGroupModels;
import com.aliyuncs.appstream_center.model.v20210901.GetAppInstanceGroupResponse.AppInstanceGroupModels.AppsItem;
import com.aliyuncs.appstream_center.model.v20210901.GetAppInstanceGroupResponse.AppInstanceGroupModels.Node;
import com.aliyuncs.appstream_center.model.v20210901.GetAppInstanceGroupResponse.AppInstanceGroupModels.Node.RecurrenceSchedule;
import com.aliyuncs.appstream_center.model.v20210901.GetAppInstanceGroupResponse.AppInstanceGroupModels.Node.RecurrenceSchedule.TimerPeriod;
import com.aliyuncs.appstream_center.model.v20210901.GetAppInstanceGroupResponse.AppInstanceGroupModels.OtaInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetAppInstanceGroupResponseUnmarshaller {

	public static GetAppInstanceGroupResponse unmarshall(GetAppInstanceGroupResponse getAppInstanceGroupResponse, UnmarshallerContext _ctx) {
		
		getAppInstanceGroupResponse.setRequestId(_ctx.stringValue("GetAppInstanceGroupResponse.RequestId"));
		getAppInstanceGroupResponse.setTotalCount(_ctx.integerValue("GetAppInstanceGroupResponse.TotalCount"));
		getAppInstanceGroupResponse.setPageSize(_ctx.integerValue("GetAppInstanceGroupResponse.PageSize"));
		getAppInstanceGroupResponse.setPageNumber(_ctx.integerValue("GetAppInstanceGroupResponse.PageNumber"));

		AppInstanceGroupModels appInstanceGroupModels = new AppInstanceGroupModels();
		appInstanceGroupModels.setAppCenterImageId(_ctx.stringValue("GetAppInstanceGroupResponse.AppInstanceGroupModels.AppCenterImageId"));
		appInstanceGroupModels.setAliyunImageId(_ctx.stringValue("GetAppInstanceGroupResponse.AppInstanceGroupModels.AliyunImageId"));
		appInstanceGroupModels.setRegionId(_ctx.stringValue("GetAppInstanceGroupResponse.AppInstanceGroupModels.RegionId"));
		appInstanceGroupModels.setProductType(_ctx.stringValue("GetAppInstanceGroupResponse.AppInstanceGroupModels.ProductType"));
		appInstanceGroupModels.setAppInstanceType(_ctx.stringValue("GetAppInstanceGroupResponse.AppInstanceGroupModels.AppInstanceType"));
		appInstanceGroupModels.setAppInstanceGroupId(_ctx.stringValue("GetAppInstanceGroupResponse.AppInstanceGroupModels.AppInstanceGroupId"));
		appInstanceGroupModels.setCpu(_ctx.stringValue("GetAppInstanceGroupResponse.AppInstanceGroupModels.Cpu"));
		appInstanceGroupModels.setGpu(_ctx.stringValue("GetAppInstanceGroupResponse.AppInstanceGroupModels.Gpu"));
		appInstanceGroupModels.setMemory(_ctx.longValue("GetAppInstanceGroupResponse.AppInstanceGroupModels.Memory"));
		appInstanceGroupModels.setAmount(_ctx.integerValue("GetAppInstanceGroupResponse.AppInstanceGroupModels.Amount"));
		appInstanceGroupModels.setMinAmount(_ctx.integerValue("GetAppInstanceGroupResponse.AppInstanceGroupModels.MinAmount"));
		appInstanceGroupModels.setMaxAmount(_ctx.integerValue("GetAppInstanceGroupResponse.AppInstanceGroupModels.MaxAmount"));
		appInstanceGroupModels.setChargeType(_ctx.stringValue("GetAppInstanceGroupResponse.AppInstanceGroupModels.ChargeType"));
		appInstanceGroupModels.setGmtCreate(_ctx.stringValue("GetAppInstanceGroupResponse.AppInstanceGroupModels.GmtCreate"));
		appInstanceGroupModels.setStatus(_ctx.stringValue("GetAppInstanceGroupResponse.AppInstanceGroupModels.Status"));
		appInstanceGroupModels.setSpecId(_ctx.stringValue("GetAppInstanceGroupResponse.AppInstanceGroupModels.SpecId"));
		appInstanceGroupModels.setSessionTimeout(_ctx.stringValue("GetAppInstanceGroupResponse.AppInstanceGroupModels.SessionTimeout"));
		appInstanceGroupModels.setAppInstanceGroupName(_ctx.stringValue("GetAppInstanceGroupResponse.AppInstanceGroupModels.AppInstanceGroupName"));
		appInstanceGroupModels.setExpiredTime(_ctx.stringValue("GetAppInstanceGroupResponse.AppInstanceGroupModels.ExpiredTime"));
		appInstanceGroupModels.setOsType(_ctx.stringValue("GetAppInstanceGroupResponse.AppInstanceGroupModels.OsType"));
		appInstanceGroupModels.setAppCenterImageName(_ctx.stringValue("GetAppInstanceGroupResponse.AppInstanceGroupModels.AppCenterImageName"));
		appInstanceGroupModels.setResourceStatus(_ctx.stringValue("GetAppInstanceGroupResponse.AppInstanceGroupModels.ResourceStatus"));

		OtaInfo otaInfo = new OtaInfo();
		otaInfo.setOtaVersion(_ctx.stringValue("GetAppInstanceGroupResponse.AppInstanceGroupModels.OtaInfo.OtaVersion"));
		otaInfo.setNewOtaVersion(_ctx.stringValue("GetAppInstanceGroupResponse.AppInstanceGroupModels.OtaInfo.NewOtaVersion"));
		otaInfo.setTaskId(_ctx.stringValue("GetAppInstanceGroupResponse.AppInstanceGroupModels.OtaInfo.TaskId"));
		appInstanceGroupModels.setOtaInfo(otaInfo);

		List<AppsItem> apps = new ArrayList<AppsItem>();
		for (int i = 0; i < _ctx.lengthValue("GetAppInstanceGroupResponse.AppInstanceGroupModels.Apps.Length"); i++) {
			AppsItem appsItem = new AppsItem();
			appsItem.setAppId(_ctx.stringValue("GetAppInstanceGroupResponse.AppInstanceGroupModels.Apps["+ i +"].AppId"));
			appsItem.setAppName(_ctx.stringValue("GetAppInstanceGroupResponse.AppInstanceGroupModels.Apps["+ i +"].AppName"));

			apps.add(appsItem);
		}
		appInstanceGroupModels.setApps(apps);

		List<Node> nodePool = new ArrayList<Node>();
		for (int i = 0; i < _ctx.lengthValue("GetAppInstanceGroupResponse.AppInstanceGroupModels.NodePool.Length"); i++) {
			Node node = new Node();
			node.setNodePoolId(_ctx.stringValue("GetAppInstanceGroupResponse.AppInstanceGroupModels.NodePool["+ i +"].NodePoolId"));
			node.setNodeInstanceType(_ctx.stringValue("GetAppInstanceGroupResponse.AppInstanceGroupModels.NodePool["+ i +"].NodeInstanceType"));
			node.setNodeAmount(_ctx.integerValue("GetAppInstanceGroupResponse.AppInstanceGroupModels.NodePool["+ i +"].NodeAmount"));
			node.setNodeUsed(_ctx.integerValue("GetAppInstanceGroupResponse.AppInstanceGroupModels.NodePool["+ i +"].NodeUsed"));
			node.setNodeCapacity(_ctx.integerValue("GetAppInstanceGroupResponse.AppInstanceGroupModels.NodePool["+ i +"].NodeCapacity"));
			node.setScalingNodeAmount(_ctx.integerValue("GetAppInstanceGroupResponse.AppInstanceGroupModels.NodePool["+ i +"].ScalingNodeAmount"));
			node.setScalingNodeUsed(_ctx.integerValue("GetAppInstanceGroupResponse.AppInstanceGroupModels.NodePool["+ i +"].ScalingNodeUsed"));
			node.setStrategyType(_ctx.stringValue("GetAppInstanceGroupResponse.AppInstanceGroupModels.NodePool["+ i +"].StrategyType"));
			node.setAmount(_ctx.integerValue("GetAppInstanceGroupResponse.AppInstanceGroupModels.NodePool["+ i +"].Amount"));
			node.setMaxScalingAmount(_ctx.integerValue("GetAppInstanceGroupResponse.AppInstanceGroupModels.NodePool["+ i +"].MaxScalingAmount"));
			node.setScalingStep(_ctx.integerValue("GetAppInstanceGroupResponse.AppInstanceGroupModels.NodePool["+ i +"].ScalingStep"));
			node.setScalingUsageThreshold(_ctx.stringValue("GetAppInstanceGroupResponse.AppInstanceGroupModels.NodePool["+ i +"].ScalingUsageThreshold"));
			node.setScalingDownAfterIdleMinutes(_ctx.integerValue("GetAppInstanceGroupResponse.AppInstanceGroupModels.NodePool["+ i +"].ScalingDownAfterIdleMinutes"));
			node.setStrategyDisableDate(_ctx.stringValue("GetAppInstanceGroupResponse.AppInstanceGroupModels.NodePool["+ i +"].StrategyDisableDate"));
			node.setStrategyEnableDate(_ctx.stringValue("GetAppInstanceGroupResponse.AppInstanceGroupModels.NodePool["+ i +"].StrategyEnableDate"));
			node.setWarmUp(_ctx.booleanValue("GetAppInstanceGroupResponse.AppInstanceGroupModels.NodePool["+ i +"].WarmUp"));
			node.setNodeTypeName(_ctx.stringValue("GetAppInstanceGroupResponse.AppInstanceGroupModels.NodePool["+ i +"].NodeTypeName"));

			List<RecurrenceSchedule> recurrenceSchedules = new ArrayList<RecurrenceSchedule>();
			for (int j = 0; j < _ctx.lengthValue("GetAppInstanceGroupResponse.AppInstanceGroupModels.NodePool["+ i +"].RecurrenceSchedules.Length"); j++) {
				RecurrenceSchedule recurrenceSchedule = new RecurrenceSchedule();
				recurrenceSchedule.setRecurrenceType(_ctx.stringValue("GetAppInstanceGroupResponse.AppInstanceGroupModels.NodePool["+ i +"].RecurrenceSchedules["+ j +"].RecurrenceType"));

				List<Integer> recurrenceValues = new ArrayList<Integer>();
				for (int k = 0; k < _ctx.lengthValue("GetAppInstanceGroupResponse.AppInstanceGroupModels.NodePool["+ i +"].RecurrenceSchedules["+ j +"].RecurrenceValues.Length"); k++) {
					recurrenceValues.add(_ctx.integerValue("GetAppInstanceGroupResponse.AppInstanceGroupModels.NodePool["+ i +"].RecurrenceSchedules["+ j +"].RecurrenceValues["+ k +"]"));
				}
				recurrenceSchedule.setRecurrenceValues(recurrenceValues);

				List<TimerPeriod> timerPeriods = new ArrayList<TimerPeriod>();
				for (int k = 0; k < _ctx.lengthValue("GetAppInstanceGroupResponse.AppInstanceGroupModels.NodePool["+ i +"].RecurrenceSchedules["+ j +"].TimerPeriods.Length"); k++) {
					TimerPeriod timerPeriod = new TimerPeriod();
					timerPeriod.setAmount(_ctx.integerValue("GetAppInstanceGroupResponse.AppInstanceGroupModels.NodePool["+ i +"].RecurrenceSchedules["+ j +"].TimerPeriods["+ k +"].Amount"));
					timerPeriod.setEndTime(_ctx.stringValue("GetAppInstanceGroupResponse.AppInstanceGroupModels.NodePool["+ i +"].RecurrenceSchedules["+ j +"].TimerPeriods["+ k +"].EndTime"));
					timerPeriod.setStartTime(_ctx.stringValue("GetAppInstanceGroupResponse.AppInstanceGroupModels.NodePool["+ i +"].RecurrenceSchedules["+ j +"].TimerPeriods["+ k +"].StartTime"));

					timerPeriods.add(timerPeriod);
				}
				recurrenceSchedule.setTimerPeriods(timerPeriods);

				recurrenceSchedules.add(recurrenceSchedule);
			}
			node.setRecurrenceSchedules(recurrenceSchedules);

			nodePool.add(node);
		}
		appInstanceGroupModels.setNodePool(nodePool);
		getAppInstanceGroupResponse.setAppInstanceGroupModels(appInstanceGroupModels);
	 
	 	return getAppInstanceGroupResponse;
	}
}