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

package com.aliyuncs.polardb.transform.v20170801;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.polardb.model.v20170801.DescribeHALogsResponse;
import com.aliyuncs.polardb.model.v20170801.DescribeHALogsResponse.HaSwitchLogItem;
import com.aliyuncs.polardb.model.v20170801.DescribeHALogsResponse.SwitchListItem;
import com.aliyuncs.polardb.model.v20170801.DescribeHALogsResponse.SwitchListItem.SwitchLogItem;
import com.aliyuncs.polardb.model.v20170801.DescribeHALogsResponse.SwitchListItem.SwitchLogItem.SwitchDetailItem;
import com.aliyuncs.polardb.model.v20170801.DescribeHALogsResponse.SwitchListItem.SwitchStepItem;
import com.aliyuncs.polardb.model.v20170801.DescribeHALogsResponse.SwitchLogItem3;
import com.aliyuncs.polardb.model.v20170801.DescribeHALogsResponse.SwitchLogItem3.SwitchStepItem5;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeHALogsResponseUnmarshaller {

	public static DescribeHALogsResponse unmarshall(DescribeHALogsResponse describeHALogsResponse, UnmarshallerContext _ctx) {
		
		describeHALogsResponse.setRequestId(_ctx.stringValue("DescribeHALogsResponse.RequestId"));
		describeHALogsResponse.setTotalRecords(_ctx.integerValue("DescribeHALogsResponse.TotalRecords"));
		describeHALogsResponse.setItemsNumbers(_ctx.integerValue("DescribeHALogsResponse.ItemsNumbers"));
		describeHALogsResponse.setPageNumber(_ctx.integerValue("DescribeHALogsResponse.PageNumber"));
		describeHALogsResponse.setDBInstanceName(_ctx.stringValue("DescribeHALogsResponse.DBInstanceName"));
		describeHALogsResponse.setDBInstanceType(_ctx.stringValue("DescribeHALogsResponse.DBInstanceType"));
		describeHALogsResponse.setHaStatus(_ctx.integerValue("DescribeHALogsResponse.HaStatus"));
		describeHALogsResponse.setPageSize(_ctx.integerValue("DescribeHALogsResponse.PageSize"));

		List<HaSwitchLogItem> haLogItems = new ArrayList<HaSwitchLogItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeHALogsResponse.HaLogItems.Length"); i++) {
			HaSwitchLogItem haSwitchLogItem = new HaSwitchLogItem();
			haSwitchLogItem.setSwitchId(_ctx.stringValue("DescribeHALogsResponse.HaLogItems["+ i +"].SwitchId"));
			haSwitchLogItem.setFromDBType(_ctx.stringValue("DescribeHALogsResponse.HaLogItems["+ i +"].FromDBType"));
			haSwitchLogItem.setSwitchCauseCode(_ctx.stringValue("DescribeHALogsResponse.HaLogItems["+ i +"].SwitchCauseCode"));
			haSwitchLogItem.setSwitchCauseDetail(_ctx.stringValue("DescribeHALogsResponse.HaLogItems["+ i +"].SwitchCauseDetail"));
			haSwitchLogItem.setSwitchStartTime(_ctx.stringValue("DescribeHALogsResponse.HaLogItems["+ i +"].SwitchStartTime"));
			haSwitchLogItem.setSwitchFinishTime(_ctx.stringValue("DescribeHALogsResponse.HaLogItems["+ i +"].SwitchFinishTime"));
			haSwitchLogItem.setTotalSessions(_ctx.longValue("DescribeHALogsResponse.HaLogItems["+ i +"].TotalSessions"));
			haSwitchLogItem.setAffectedSessions(_ctx.longValue("DescribeHALogsResponse.HaLogItems["+ i +"].AffectedSessions"));
			haSwitchLogItem.setSwitchType(_ctx.longValue("DescribeHALogsResponse.HaLogItems["+ i +"].SwitchType"));

			haLogItems.add(haSwitchLogItem);
		}
		describeHALogsResponse.setHaLogItems(haLogItems);

		List<SwitchListItem> switchListItems = new ArrayList<SwitchListItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeHALogsResponse.SwitchListItems.Length"); i++) {
			SwitchListItem switchListItem = new SwitchListItem();
			switchListItem.setSimulateListId(_ctx.stringValue("DescribeHALogsResponse.SwitchListItems["+ i +"].SimulateListId"));
			switchListItem.setSimulateMode(_ctx.stringValue("DescribeHALogsResponse.SwitchListItems["+ i +"].SimulateMode"));
			switchListItem.setSimulateStatus(_ctx.stringValue("DescribeHALogsResponse.SwitchListItems["+ i +"].SimulateStatus"));
			switchListItem.setStartTime(_ctx.stringValue("DescribeHALogsResponse.SwitchListItems["+ i +"].StartTime"));
			switchListItem.setEndTime(_ctx.stringValue("DescribeHALogsResponse.SwitchListItems["+ i +"].EndTime"));
			switchListItem.setEventStartTime(_ctx.stringValue("DescribeHALogsResponse.SwitchListItems["+ i +"].EventStartTime"));
			switchListItem.setEventFinishTime(_ctx.stringValue("DescribeHALogsResponse.SwitchListItems["+ i +"].EventFinishTime"));
			switchListItem.setSimulateTaskId(_ctx.stringValue("DescribeHALogsResponse.SwitchListItems["+ i +"].SimulateTaskId"));
			switchListItem.setPreferredSimulateStartTime(_ctx.stringValue("DescribeHALogsResponse.SwitchListItems["+ i +"].PreferredSimulateStartTime"));
			switchListItem.setPlannedEscapeMode(_ctx.stringValue("DescribeHALogsResponse.SwitchListItems["+ i +"].PlannedEscapeMode"));
			switchListItem.setPlannedEscapeTime(_ctx.stringValue("DescribeHALogsResponse.SwitchListItems["+ i +"].PlannedEscapeTime"));
			switchListItem.setFaultInjectionType(_ctx.stringValue("DescribeHALogsResponse.SwitchListItems["+ i +"].FaultInjectionType"));

			List<String> dBNodeCrashList = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeHALogsResponse.SwitchListItems["+ i +"].DBNodeCrashList.Length"); j++) {
				dBNodeCrashList.add(_ctx.stringValue("DescribeHALogsResponse.SwitchListItems["+ i +"].DBNodeCrashList["+ j +"]"));
			}
			switchListItem.setDBNodeCrashList(dBNodeCrashList);

			List<SwitchLogItem> switchLogItems1 = new ArrayList<SwitchLogItem>();
			for (int j = 0; j < _ctx.lengthValue("DescribeHALogsResponse.SwitchListItems["+ i +"].SwitchLogItems.Length"); j++) {
				SwitchLogItem switchLogItem = new SwitchLogItem();
				switchLogItem.setSimulateListId(_ctx.stringValue("DescribeHALogsResponse.SwitchListItems["+ i +"].SwitchLogItems["+ j +"].SimulateListId"));
				switchLogItem.setSimulateLogId(_ctx.stringValue("DescribeHALogsResponse.SwitchListItems["+ i +"].SwitchLogItems["+ j +"].SimulateLogId"));
				switchLogItem.setDBInstanceId(_ctx.stringValue("DescribeHALogsResponse.SwitchListItems["+ i +"].SwitchLogItems["+ j +"].DBInstanceId"));
				switchLogItem.setSrcIpPort(_ctx.stringValue("DescribeHALogsResponse.SwitchListItems["+ i +"].SwitchLogItems["+ j +"].SrcIpPort"));
				switchLogItem.setSrcDbType(_ctx.stringValue("DescribeHALogsResponse.SwitchListItems["+ i +"].SwitchLogItems["+ j +"].SrcDbType"));
				switchLogItem.setDstIpPort(_ctx.stringValue("DescribeHALogsResponse.SwitchListItems["+ i +"].SwitchLogItems["+ j +"].DstIpPort"));
				switchLogItem.setDstDbType(_ctx.stringValue("DescribeHALogsResponse.SwitchListItems["+ i +"].SwitchLogItems["+ j +"].DstDbType"));
				switchLogItem.setSimulateStatus(_ctx.stringValue("DescribeHALogsResponse.SwitchListItems["+ i +"].SwitchLogItems["+ j +"].SimulateStatus"));
				switchLogItem.setEventStartTime(_ctx.stringValue("DescribeHALogsResponse.SwitchListItems["+ i +"].SwitchLogItems["+ j +"].EventStartTime"));
				switchLogItem.setEventFinishTime(_ctx.stringValue("DescribeHALogsResponse.SwitchListItems["+ i +"].SwitchLogItems["+ j +"].EventFinishTime"));

				List<SwitchDetailItem> switchStepItems2 = new ArrayList<SwitchDetailItem>();
				for (int k = 0; k < _ctx.lengthValue("DescribeHALogsResponse.SwitchListItems["+ i +"].SwitchLogItems["+ j +"].SwitchStepItems.Length"); k++) {
					SwitchDetailItem switchDetailItem = new SwitchDetailItem();
					switchDetailItem.setStepName(_ctx.stringValue("DescribeHALogsResponse.SwitchListItems["+ i +"].SwitchLogItems["+ j +"].SwitchStepItems["+ k +"].StepName"));
					switchDetailItem.setStartTime(_ctx.stringValue("DescribeHALogsResponse.SwitchListItems["+ i +"].SwitchLogItems["+ j +"].SwitchStepItems["+ k +"].StartTime"));
					switchDetailItem.setSimulatePhase(_ctx.stringValue("DescribeHALogsResponse.SwitchListItems["+ i +"].SwitchLogItems["+ j +"].SwitchStepItems["+ k +"].SimulatePhase"));
					switchDetailItem.setEndTime(_ctx.stringValue("DescribeHALogsResponse.SwitchListItems["+ i +"].SwitchLogItems["+ j +"].SwitchStepItems["+ k +"].EndTime"));
					switchDetailItem.setTimeCost(_ctx.stringValue("DescribeHALogsResponse.SwitchListItems["+ i +"].SwitchLogItems["+ j +"].SwitchStepItems["+ k +"].TimeCost"));
					switchDetailItem.setIsSuccess(_ctx.stringValue("DescribeHALogsResponse.SwitchListItems["+ i +"].SwitchLogItems["+ j +"].SwitchStepItems["+ k +"].IsSuccess"));

					switchStepItems2.add(switchDetailItem);
				}
				switchLogItem.setSwitchStepItems2(switchStepItems2);

				switchLogItems1.add(switchLogItem);
			}
			switchListItem.setSwitchLogItems1(switchLogItems1);

			List<SwitchStepItem> switchStepItems = new ArrayList<SwitchStepItem>();
			for (int j = 0; j < _ctx.lengthValue("DescribeHALogsResponse.SwitchListItems["+ i +"].SwitchStepItems.Length"); j++) {
				SwitchStepItem switchStepItem = new SwitchStepItem();
				switchStepItem.setSimulatePhase(_ctx.stringValue("DescribeHALogsResponse.SwitchListItems["+ i +"].SwitchStepItems["+ j +"].SimulatePhase"));
				switchStepItem.setStepName(_ctx.stringValue("DescribeHALogsResponse.SwitchListItems["+ i +"].SwitchStepItems["+ j +"].StepName"));
				switchStepItem.setStartTime(_ctx.stringValue("DescribeHALogsResponse.SwitchListItems["+ i +"].SwitchStepItems["+ j +"].StartTime"));
				switchStepItem.setEndTime(_ctx.stringValue("DescribeHALogsResponse.SwitchListItems["+ i +"].SwitchStepItems["+ j +"].EndTime"));
				switchStepItem.setTimeCost(_ctx.stringValue("DescribeHALogsResponse.SwitchListItems["+ i +"].SwitchStepItems["+ j +"].TimeCost"));
				switchStepItem.setIsSuccess(_ctx.stringValue("DescribeHALogsResponse.SwitchListItems["+ i +"].SwitchStepItems["+ j +"].IsSuccess"));
				switchStepItem.setDBNodeId(_ctx.stringValue("DescribeHALogsResponse.SwitchListItems["+ i +"].SwitchStepItems["+ j +"].DBNodeId"));

				switchStepItems.add(switchStepItem);
			}
			switchListItem.setSwitchStepItems(switchStepItems);

			switchListItems.add(switchListItem);
		}
		describeHALogsResponse.setSwitchListItems(switchListItems);

		List<SwitchLogItem3> switchLogItems = new ArrayList<SwitchLogItem3>();
		for (int i = 0; i < _ctx.lengthValue("DescribeHALogsResponse.SwitchLogItems.Length"); i++) {
			SwitchLogItem3 switchLogItem3 = new SwitchLogItem3();
			switchLogItem3.setSimulateListId(_ctx.stringValue("DescribeHALogsResponse.SwitchLogItems["+ i +"].SimulateListId"));
			switchLogItem3.setSimulatecode(_ctx.stringValue("DescribeHALogsResponse.SwitchLogItems["+ i +"].Simulatecode"));
			switchLogItem3.setDBInstanceId(_ctx.stringValue("DescribeHALogsResponse.SwitchLogItems["+ i +"].DBInstanceId"));
			switchLogItem3.setSrcIpPort(_ctx.stringValue("DescribeHALogsResponse.SwitchLogItems["+ i +"].SrcIpPort"));
			switchLogItem3.setSrcDbType(_ctx.stringValue("DescribeHALogsResponse.SwitchLogItems["+ i +"].SrcDbType"));
			switchLogItem3.setDstIpPort(_ctx.stringValue("DescribeHALogsResponse.SwitchLogItems["+ i +"].DstIpPort"));
			switchLogItem3.setDstDbType(_ctx.stringValue("DescribeHALogsResponse.SwitchLogItems["+ i +"].DstDbType"));
			switchLogItem3.setSimulateStatus(_ctx.stringValue("DescribeHALogsResponse.SwitchLogItems["+ i +"].SimulateStatus"));
			switchLogItem3.setEventStartTime(_ctx.stringValue("DescribeHALogsResponse.SwitchLogItems["+ i +"].EventStartTime"));
			switchLogItem3.setEventFinishTime(_ctx.stringValue("DescribeHALogsResponse.SwitchLogItems["+ i +"].EventFinishTime"));

			List<SwitchStepItem5> switchStepItems4 = new ArrayList<SwitchStepItem5>();
			for (int j = 0; j < _ctx.lengthValue("DescribeHALogsResponse.SwitchLogItems["+ i +"].SwitchStepItems.Length"); j++) {
				SwitchStepItem5 switchStepItem5 = new SwitchStepItem5();
				switchStepItem5.setStepName(_ctx.stringValue("DescribeHALogsResponse.SwitchLogItems["+ i +"].SwitchStepItems["+ j +"].StepName"));
				switchStepItem5.setStepMsg(_ctx.stringValue("DescribeHALogsResponse.SwitchLogItems["+ i +"].SwitchStepItems["+ j +"].StepMsg"));
				switchStepItem5.setStartTime(_ctx.stringValue("DescribeHALogsResponse.SwitchLogItems["+ i +"].SwitchStepItems["+ j +"].StartTime"));
				switchStepItem5.setEndTime(_ctx.stringValue("DescribeHALogsResponse.SwitchLogItems["+ i +"].SwitchStepItems["+ j +"].EndTime"));
				switchStepItem5.setTimeCost(_ctx.stringValue("DescribeHALogsResponse.SwitchLogItems["+ i +"].SwitchStepItems["+ j +"].TimeCost"));
				switchStepItem5.setIsSuccess(_ctx.stringValue("DescribeHALogsResponse.SwitchLogItems["+ i +"].SwitchStepItems["+ j +"].IsSuccess"));
				switchStepItem5.setSimulatePhase(_ctx.stringValue("DescribeHALogsResponse.SwitchLogItems["+ i +"].SwitchStepItems["+ j +"].SimulatePhase"));
				switchStepItem5.setDBNodeId(_ctx.stringValue("DescribeHALogsResponse.SwitchLogItems["+ i +"].SwitchStepItems["+ j +"].DBNodeId"));

				switchStepItems4.add(switchStepItem5);
			}
			switchLogItem3.setSwitchStepItems4(switchStepItems4);

			switchLogItems.add(switchLogItem3);
		}
		describeHALogsResponse.setSwitchLogItems(switchLogItems);
	 
	 	return describeHALogsResponse;
	}
}