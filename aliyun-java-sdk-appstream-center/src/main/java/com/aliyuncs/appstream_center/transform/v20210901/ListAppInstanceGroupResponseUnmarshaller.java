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

import com.aliyuncs.appstream_center.model.v20210901.ListAppInstanceGroupResponse;
import com.aliyuncs.appstream_center.model.v20210901.ListAppInstanceGroupResponse.Data;
import com.aliyuncs.appstream_center.model.v20210901.ListAppInstanceGroupResponse.Data.AppsItem;
import com.aliyuncs.appstream_center.model.v20210901.ListAppInstanceGroupResponse.Data.Node;
import com.aliyuncs.appstream_center.model.v20210901.ListAppInstanceGroupResponse.Data.Node.RecurrenceSchedule;
import com.aliyuncs.appstream_center.model.v20210901.ListAppInstanceGroupResponse.Data.Node.RecurrenceSchedule.TimerPeriod;
import com.aliyuncs.appstream_center.model.v20210901.ListAppInstanceGroupResponse.Data.OtaInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListAppInstanceGroupResponseUnmarshaller {

	public static ListAppInstanceGroupResponse unmarshall(ListAppInstanceGroupResponse listAppInstanceGroupResponse, UnmarshallerContext _ctx) {
		
		listAppInstanceGroupResponse.setRequestId(_ctx.stringValue("ListAppInstanceGroupResponse.RequestId"));
		listAppInstanceGroupResponse.setTotalCount(_ctx.integerValue("ListAppInstanceGroupResponse.TotalCount"));
		listAppInstanceGroupResponse.setPageSize(_ctx.integerValue("ListAppInstanceGroupResponse.PageSize"));
		listAppInstanceGroupResponse.setPageNumber(_ctx.integerValue("ListAppInstanceGroupResponse.PageNumber"));

		List<Data> appInstanceGroupModels = new ArrayList<Data>();
		for (int i = 0; i < _ctx.lengthValue("ListAppInstanceGroupResponse.AppInstanceGroupModels.Length"); i++) {
			Data data = new Data();
			data.setAppCenterImageId(_ctx.stringValue("ListAppInstanceGroupResponse.AppInstanceGroupModels["+ i +"].AppCenterImageId"));
			data.setAliyunImageId(_ctx.stringValue("ListAppInstanceGroupResponse.AppInstanceGroupModels["+ i +"].AliyunImageId"));
			data.setRegionId(_ctx.stringValue("ListAppInstanceGroupResponse.AppInstanceGroupModels["+ i +"].RegionId"));
			data.setProductType(_ctx.stringValue("ListAppInstanceGroupResponse.AppInstanceGroupModels["+ i +"].ProductType"));
			data.setAppInstanceType(_ctx.stringValue("ListAppInstanceGroupResponse.AppInstanceGroupModels["+ i +"].AppInstanceType"));
			data.setAppInstanceGroupId(_ctx.stringValue("ListAppInstanceGroupResponse.AppInstanceGroupModels["+ i +"].AppInstanceGroupId"));
			data.setCpu(_ctx.stringValue("ListAppInstanceGroupResponse.AppInstanceGroupModels["+ i +"].Cpu"));
			data.setGpu(_ctx.stringValue("ListAppInstanceGroupResponse.AppInstanceGroupModels["+ i +"].Gpu"));
			data.setMemory(_ctx.longValue("ListAppInstanceGroupResponse.AppInstanceGroupModels["+ i +"].Memory"));
			data.setAmount(_ctx.integerValue("ListAppInstanceGroupResponse.AppInstanceGroupModels["+ i +"].Amount"));
			data.setMinAmount(_ctx.integerValue("ListAppInstanceGroupResponse.AppInstanceGroupModels["+ i +"].MinAmount"));
			data.setMaxAmount(_ctx.integerValue("ListAppInstanceGroupResponse.AppInstanceGroupModels["+ i +"].MaxAmount"));
			data.setChargeType(_ctx.stringValue("ListAppInstanceGroupResponse.AppInstanceGroupModels["+ i +"].ChargeType"));
			data.setGmtCreate(_ctx.stringValue("ListAppInstanceGroupResponse.AppInstanceGroupModels["+ i +"].GmtCreate"));
			data.setStatus(_ctx.stringValue("ListAppInstanceGroupResponse.AppInstanceGroupModels["+ i +"].Status"));
			data.setSpecId(_ctx.stringValue("ListAppInstanceGroupResponse.AppInstanceGroupModels["+ i +"].SpecId"));
			data.setSessionTimeout(_ctx.stringValue("ListAppInstanceGroupResponse.AppInstanceGroupModels["+ i +"].SessionTimeout"));
			data.setAppInstanceGroupName(_ctx.stringValue("ListAppInstanceGroupResponse.AppInstanceGroupModels["+ i +"].AppInstanceGroupName"));
			data.setExpiredTime(_ctx.stringValue("ListAppInstanceGroupResponse.AppInstanceGroupModels["+ i +"].ExpiredTime"));
			data.setOsType(_ctx.stringValue("ListAppInstanceGroupResponse.AppInstanceGroupModels["+ i +"].OsType"));
			data.setResourceStatus(_ctx.stringValue("ListAppInstanceGroupResponse.AppInstanceGroupModels["+ i +"].ResourceStatus"));
			data.setAppPolicyId(_ctx.stringValue("ListAppInstanceGroupResponse.AppInstanceGroupModels["+ i +"].AppPolicyId"));
			data.setChargeResourceMode(_ctx.stringValue("ListAppInstanceGroupResponse.AppInstanceGroupModels["+ i +"].ChargeResourceMode"));

			OtaInfo otaInfo = new OtaInfo();
			otaInfo.setOtaVersion(_ctx.stringValue("ListAppInstanceGroupResponse.AppInstanceGroupModels["+ i +"].OtaInfo.OtaVersion"));
			otaInfo.setNewOtaVersion(_ctx.stringValue("ListAppInstanceGroupResponse.AppInstanceGroupModels["+ i +"].OtaInfo.NewOtaVersion"));
			otaInfo.setTaskId(_ctx.stringValue("ListAppInstanceGroupResponse.AppInstanceGroupModels["+ i +"].OtaInfo.TaskId"));
			data.setOtaInfo(otaInfo);

			List<AppsItem> apps = new ArrayList<AppsItem>();
			for (int j = 0; j < _ctx.lengthValue("ListAppInstanceGroupResponse.AppInstanceGroupModels["+ i +"].Apps.Length"); j++) {
				AppsItem appsItem = new AppsItem();
				appsItem.setAppId(_ctx.stringValue("ListAppInstanceGroupResponse.AppInstanceGroupModels["+ i +"].Apps["+ j +"].AppId"));
				appsItem.setAppName(_ctx.stringValue("ListAppInstanceGroupResponse.AppInstanceGroupModels["+ i +"].Apps["+ j +"].AppName"));
				appsItem.setAppVersion(_ctx.stringValue("ListAppInstanceGroupResponse.AppInstanceGroupModels["+ i +"].Apps["+ j +"].AppVersion"));
				appsItem.setAppVersionName(_ctx.stringValue("ListAppInstanceGroupResponse.AppInstanceGroupModels["+ i +"].Apps["+ j +"].AppVersionName"));
				appsItem.setAppIcon(_ctx.stringValue("ListAppInstanceGroupResponse.AppInstanceGroupModels["+ i +"].Apps["+ j +"].AppIcon"));

				apps.add(appsItem);
			}
			data.setApps(apps);

			List<Node> nodePool = new ArrayList<Node>();
			for (int j = 0; j < _ctx.lengthValue("ListAppInstanceGroupResponse.AppInstanceGroupModels["+ i +"].NodePool.Length"); j++) {
				Node node = new Node();
				node.setNodePoolId(_ctx.stringValue("ListAppInstanceGroupResponse.AppInstanceGroupModels["+ i +"].NodePool["+ j +"].NodePoolId"));
				node.setNodeInstanceType(_ctx.stringValue("ListAppInstanceGroupResponse.AppInstanceGroupModels["+ i +"].NodePool["+ j +"].NodeInstanceType"));
				node.setNodeAmount(_ctx.integerValue("ListAppInstanceGroupResponse.AppInstanceGroupModels["+ i +"].NodePool["+ j +"].NodeAmount"));
				node.setNodeUsed(_ctx.integerValue("ListAppInstanceGroupResponse.AppInstanceGroupModels["+ i +"].NodePool["+ j +"].NodeUsed"));
				node.setNodeCapacity(_ctx.integerValue("ListAppInstanceGroupResponse.AppInstanceGroupModels["+ i +"].NodePool["+ j +"].NodeCapacity"));
				node.setScalingNodeAmount(_ctx.integerValue("ListAppInstanceGroupResponse.AppInstanceGroupModels["+ i +"].NodePool["+ j +"].ScalingNodeAmount"));
				node.setScalingNodeUsed(_ctx.integerValue("ListAppInstanceGroupResponse.AppInstanceGroupModels["+ i +"].NodePool["+ j +"].ScalingNodeUsed"));
				node.setStrategyType(_ctx.stringValue("ListAppInstanceGroupResponse.AppInstanceGroupModels["+ i +"].NodePool["+ j +"].StrategyType"));
				node.setAmount(_ctx.integerValue("ListAppInstanceGroupResponse.AppInstanceGroupModels["+ i +"].NodePool["+ j +"].Amount"));
				node.setMaxScalingAmount(_ctx.integerValue("ListAppInstanceGroupResponse.AppInstanceGroupModels["+ i +"].NodePool["+ j +"].MaxScalingAmount"));
				node.setScalingStep(_ctx.integerValue("ListAppInstanceGroupResponse.AppInstanceGroupModels["+ i +"].NodePool["+ j +"].ScalingStep"));
				node.setScalingUsageThreshold(_ctx.stringValue("ListAppInstanceGroupResponse.AppInstanceGroupModels["+ i +"].NodePool["+ j +"].ScalingUsageThreshold"));
				node.setScalingDownAfterIdleMinutes(_ctx.integerValue("ListAppInstanceGroupResponse.AppInstanceGroupModels["+ i +"].NodePool["+ j +"].ScalingDownAfterIdleMinutes"));
				node.setStrategyDisableDate(_ctx.stringValue("ListAppInstanceGroupResponse.AppInstanceGroupModels["+ i +"].NodePool["+ j +"].StrategyDisableDate"));
				node.setStrategyEnableDate(_ctx.stringValue("ListAppInstanceGroupResponse.AppInstanceGroupModels["+ i +"].NodePool["+ j +"].StrategyEnableDate"));
				node.setWarmUp(_ctx.booleanValue("ListAppInstanceGroupResponse.AppInstanceGroupModels["+ i +"].NodePool["+ j +"].WarmUp"));
				node.setNodeTypeName(_ctx.stringValue("ListAppInstanceGroupResponse.AppInstanceGroupModels["+ i +"].NodePool["+ j +"].NodeTypeName"));

				List<RecurrenceSchedule> recurrenceSchedules = new ArrayList<RecurrenceSchedule>();
				for (int k = 0; k < _ctx.lengthValue("ListAppInstanceGroupResponse.AppInstanceGroupModels["+ i +"].NodePool["+ j +"].RecurrenceSchedules.Length"); k++) {
					RecurrenceSchedule recurrenceSchedule = new RecurrenceSchedule();
					recurrenceSchedule.setRecurrenceType(_ctx.stringValue("ListAppInstanceGroupResponse.AppInstanceGroupModels["+ i +"].NodePool["+ j +"].RecurrenceSchedules["+ k +"].RecurrenceType"));

					List<Integer> recurrenceValues = new ArrayList<Integer>();
					for (int l = 0; l < _ctx.lengthValue("ListAppInstanceGroupResponse.AppInstanceGroupModels["+ i +"].NodePool["+ j +"].RecurrenceSchedules["+ k +"].RecurrenceValues.Length"); l++) {
						recurrenceValues.add(_ctx.integerValue("ListAppInstanceGroupResponse.AppInstanceGroupModels["+ i +"].NodePool["+ j +"].RecurrenceSchedules["+ k +"].RecurrenceValues["+ l +"]"));
					}
					recurrenceSchedule.setRecurrenceValues(recurrenceValues);

					List<TimerPeriod> timerPeriods = new ArrayList<TimerPeriod>();
					for (int l = 0; l < _ctx.lengthValue("ListAppInstanceGroupResponse.AppInstanceGroupModels["+ i +"].NodePool["+ j +"].RecurrenceSchedules["+ k +"].TimerPeriods.Length"); l++) {
						TimerPeriod timerPeriod = new TimerPeriod();
						timerPeriod.setAmount(_ctx.integerValue("ListAppInstanceGroupResponse.AppInstanceGroupModels["+ i +"].NodePool["+ j +"].RecurrenceSchedules["+ k +"].TimerPeriods["+ l +"].Amount"));
						timerPeriod.setEndTime(_ctx.stringValue("ListAppInstanceGroupResponse.AppInstanceGroupModels["+ i +"].NodePool["+ j +"].RecurrenceSchedules["+ k +"].TimerPeriods["+ l +"].EndTime"));
						timerPeriod.setStartTime(_ctx.stringValue("ListAppInstanceGroupResponse.AppInstanceGroupModels["+ i +"].NodePool["+ j +"].RecurrenceSchedules["+ k +"].TimerPeriods["+ l +"].StartTime"));

						timerPeriods.add(timerPeriod);
					}
					recurrenceSchedule.setTimerPeriods(timerPeriods);

					recurrenceSchedules.add(recurrenceSchedule);
				}
				node.setRecurrenceSchedules(recurrenceSchedules);

				nodePool.add(node);
			}
			data.setNodePool(nodePool);

			appInstanceGroupModels.add(data);
		}
		listAppInstanceGroupResponse.setAppInstanceGroupModels(appInstanceGroupModels);
	 
	 	return listAppInstanceGroupResponse;
	}
}