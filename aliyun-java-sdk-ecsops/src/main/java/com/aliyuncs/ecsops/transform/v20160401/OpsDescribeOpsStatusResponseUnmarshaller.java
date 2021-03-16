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

import com.aliyuncs.ecsops.model.v20160401.OpsDescribeOpsStatusResponse;
import com.aliyuncs.ecsops.model.v20160401.OpsDescribeOpsStatusResponse.MaintenanceInfo;
import com.aliyuncs.ecsops.model.v20160401.OpsDescribeOpsStatusResponse.NcInAlarmCenterBlack;
import com.aliyuncs.ecsops.model.v20160401.OpsDescribeOpsStatusResponse.NcInGammaTest;
import com.aliyuncs.ecsops.model.v20160401.OpsDescribeOpsStatusResponse.NcReleaseHistoryItem;
import com.aliyuncs.ecsops.model.v20160401.OpsDescribeOpsStatusResponse.VmOpsEventItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpsDescribeOpsStatusResponseUnmarshaller {

	public static OpsDescribeOpsStatusResponse unmarshall(OpsDescribeOpsStatusResponse opsDescribeOpsStatusResponse, UnmarshallerContext _ctx) {
		
		opsDescribeOpsStatusResponse.setRequestId(_ctx.stringValue("OpsDescribeOpsStatusResponse.RequestId"));
		opsDescribeOpsStatusResponse.setBizCode(_ctx.stringValue("OpsDescribeOpsStatusResponse.BizCode"));
		opsDescribeOpsStatusResponse.setBizMessage(_ctx.stringValue("OpsDescribeOpsStatusResponse.BizMessage"));
		opsDescribeOpsStatusResponse.setNcInBlack(_ctx.booleanValue("OpsDescribeOpsStatusResponse.NcInBlack"));
		opsDescribeOpsStatusResponse.setNcInTest(_ctx.booleanValue("OpsDescribeOpsStatusResponse.NcInTest"));
		opsDescribeOpsStatusResponse.setNcInYaoChiTest(_ctx.booleanValue("OpsDescribeOpsStatusResponse.NcInYaoChiTest"));
		opsDescribeOpsStatusResponse.setNcIsDownAndNoVm(_ctx.booleanValue("OpsDescribeOpsStatusResponse.NcIsDownAndNoVm"));

		NcInGammaTest ncInGammaTest = new NcInGammaTest();
		ncInGammaTest.setNcInTest(_ctx.booleanValue("OpsDescribeOpsStatusResponse.NcInGammaTest.NcInTest"));
		ncInGammaTest.setStaffId(_ctx.stringValue("OpsDescribeOpsStatusResponse.NcInGammaTest.StaffId"));
		ncInGammaTest.setUserGroup(_ctx.stringValue("OpsDescribeOpsStatusResponse.NcInGammaTest.UserGroup"));
		opsDescribeOpsStatusResponse.setNcInGammaTest(ncInGammaTest);

		NcInAlarmCenterBlack ncInAlarmCenterBlack = new NcInAlarmCenterBlack();
		ncInAlarmCenterBlack.setNcInTest(_ctx.booleanValue("OpsDescribeOpsStatusResponse.NcInAlarmCenterBlack.NcInTest"));
		ncInAlarmCenterBlack.setStaffId(_ctx.stringValue("OpsDescribeOpsStatusResponse.NcInAlarmCenterBlack.StaffId"));
		ncInAlarmCenterBlack.setExtension(_ctx.stringValue("OpsDescribeOpsStatusResponse.NcInAlarmCenterBlack.Extension"));
		ncInAlarmCenterBlack.setNickName(_ctx.stringValue("OpsDescribeOpsStatusResponse.NcInAlarmCenterBlack.NickName"));
		ncInAlarmCenterBlack.setDueTime(_ctx.stringValue("OpsDescribeOpsStatusResponse.NcInAlarmCenterBlack.DueTime"));
		opsDescribeOpsStatusResponse.setNcInAlarmCenterBlack(ncInAlarmCenterBlack);

		List<VmOpsEventItem> vmOpsEvent = new ArrayList<VmOpsEventItem>();
		for (int i = 0; i < _ctx.lengthValue("OpsDescribeOpsStatusResponse.VmOpsEvent.Length"); i++) {
			VmOpsEventItem vmOpsEventItem = new VmOpsEventItem();
			vmOpsEventItem.setAliUid(_ctx.stringValue("OpsDescribeOpsStatusResponse.VmOpsEvent["+ i +"].AliUid"));
			vmOpsEventItem.setClusterAlias(_ctx.stringValue("OpsDescribeOpsStatusResponse.VmOpsEvent["+ i +"].ClusterAlias"));
			vmOpsEventItem.setEndTime(_ctx.stringValue("OpsDescribeOpsStatusResponse.VmOpsEvent["+ i +"].EndTime"));
			vmOpsEventItem.setEventStatus(_ctx.stringValue("OpsDescribeOpsStatusResponse.VmOpsEvent["+ i +"].EventStatus"));
			vmOpsEventItem.setNcIp(_ctx.stringValue("OpsDescribeOpsStatusResponse.VmOpsEvent["+ i +"].NcIp"));
			vmOpsEventItem.setOpsCode(_ctx.stringValue("OpsDescribeOpsStatusResponse.VmOpsEvent["+ i +"].OpsCode"));
			vmOpsEventItem.setOpsType(_ctx.stringValue("OpsDescribeOpsStatusResponse.VmOpsEvent["+ i +"].OpsType"));
			vmOpsEventItem.setPlanTime(_ctx.stringValue("OpsDescribeOpsStatusResponse.VmOpsEvent["+ i +"].PlanTime"));
			vmOpsEventItem.setPublishTime(_ctx.stringValue("OpsDescribeOpsStatusResponse.VmOpsEvent["+ i +"].PublishTime"));
			vmOpsEventItem.setStartTime(_ctx.stringValue("OpsDescribeOpsStatusResponse.VmOpsEvent["+ i +"].StartTime"));
			vmOpsEventItem.setVmName(_ctx.stringValue("OpsDescribeOpsStatusResponse.VmOpsEvent["+ i +"].VmName"));
			vmOpsEventItem.setClusterName(_ctx.stringValue("OpsDescribeOpsStatusResponse.VmOpsEvent["+ i +"].ClusterName"));

			vmOpsEvent.add(vmOpsEventItem);
		}
		opsDescribeOpsStatusResponse.setVmOpsEvent(vmOpsEvent);

		List<MaintenanceInfo> maintenanceRecord = new ArrayList<MaintenanceInfo>();
		for (int i = 0; i < _ctx.lengthValue("OpsDescribeOpsStatusResponse.MaintenanceRecord.Length"); i++) {
			MaintenanceInfo maintenanceInfo = new MaintenanceInfo();
			maintenanceInfo.setNcId(_ctx.stringValue("OpsDescribeOpsStatusResponse.MaintenanceRecord["+ i +"].NcId"));
			maintenanceInfo.setReason(_ctx.stringValue("OpsDescribeOpsStatusResponse.MaintenanceRecord["+ i +"].Reason"));
			maintenanceInfo.setGmtCreate(_ctx.stringValue("OpsDescribeOpsStatusResponse.MaintenanceRecord["+ i +"].GmtCreate"));
			maintenanceInfo.setGmtModified(_ctx.stringValue("OpsDescribeOpsStatusResponse.MaintenanceRecord["+ i +"].GmtModified"));
			maintenanceInfo.setOpsType(_ctx.stringValue("OpsDescribeOpsStatusResponse.MaintenanceRecord["+ i +"].OpsType"));
			maintenanceInfo.setComment(_ctx.stringValue("OpsDescribeOpsStatusResponse.MaintenanceRecord["+ i +"].Comment"));
			maintenanceInfo.setStatus(_ctx.stringValue("OpsDescribeOpsStatusResponse.MaintenanceRecord["+ i +"].Status"));

			maintenanceRecord.add(maintenanceInfo);
		}
		opsDescribeOpsStatusResponse.setMaintenanceRecord(maintenanceRecord);

		List<NcReleaseHistoryItem> ncReleaseHistory = new ArrayList<NcReleaseHistoryItem>();
		for (int i = 0; i < _ctx.lengthValue("OpsDescribeOpsStatusResponse.NcReleaseHistory.Length"); i++) {
			NcReleaseHistoryItem ncReleaseHistoryItem = new NcReleaseHistoryItem();
			ncReleaseHistoryItem.setNcIp(_ctx.stringValue("OpsDescribeOpsStatusResponse.NcReleaseHistory["+ i +"].NcIp"));
			ncReleaseHistoryItem.setPlanId(_ctx.stringValue("OpsDescribeOpsStatusResponse.NcReleaseHistory["+ i +"].PlanId"));
			ncReleaseHistoryItem.setServerRole(_ctx.stringValue("OpsDescribeOpsStatusResponse.NcReleaseHistory["+ i +"].ServerRole"));
			ncReleaseHistoryItem.setOperator(_ctx.stringValue("OpsDescribeOpsStatusResponse.NcReleaseHistory["+ i +"].Operator"));
			ncReleaseHistoryItem.setCreateTime(_ctx.stringValue("OpsDescribeOpsStatusResponse.NcReleaseHistory["+ i +"].CreateTime"));
			ncReleaseHistoryItem.setOperationStatus(_ctx.stringValue("OpsDescribeOpsStatusResponse.NcReleaseHistory["+ i +"].OperationStatus"));
			ncReleaseHistoryItem.setChangeDescription(_ctx.stringValue("OpsDescribeOpsStatusResponse.NcReleaseHistory["+ i +"].ChangeDescription"));

			ncReleaseHistory.add(ncReleaseHistoryItem);
		}
		opsDescribeOpsStatusResponse.setNcReleaseHistory(ncReleaseHistory);
	 
	 	return opsDescribeOpsStatusResponse;
	}
}