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
		opsDescribeOpsStatusResponse.setNcInTest(_ctx.booleanValue("OpsDescribeOpsStatusResponse.NcInTest"));
		opsDescribeOpsStatusResponse.setNcInYaoChiTest(_ctx.booleanValue("OpsDescribeOpsStatusResponse.NcInYaoChiTest"));
		opsDescribeOpsStatusResponse.setBizMessage(_ctx.stringValue("OpsDescribeOpsStatusResponse.BizMessage"));
		opsDescribeOpsStatusResponse.setNcInBlack(_ctx.booleanValue("OpsDescribeOpsStatusResponse.NcInBlack"));
		opsDescribeOpsStatusResponse.setNcIsDownAndNoVm(_ctx.booleanValue("OpsDescribeOpsStatusResponse.NcIsDownAndNoVm"));
		opsDescribeOpsStatusResponse.setBizCode(_ctx.stringValue("OpsDescribeOpsStatusResponse.BizCode"));

		NcInAlarmCenterBlack ncInAlarmCenterBlack = new NcInAlarmCenterBlack();
		ncInAlarmCenterBlack.setExtension(_ctx.stringValue("OpsDescribeOpsStatusResponse.NcInAlarmCenterBlack.Extension"));
		ncInAlarmCenterBlack.setDueTime(_ctx.stringValue("OpsDescribeOpsStatusResponse.NcInAlarmCenterBlack.DueTime"));
		ncInAlarmCenterBlack.setStaffId(_ctx.stringValue("OpsDescribeOpsStatusResponse.NcInAlarmCenterBlack.StaffId"));
		ncInAlarmCenterBlack.setNickName(_ctx.stringValue("OpsDescribeOpsStatusResponse.NcInAlarmCenterBlack.NickName"));
		ncInAlarmCenterBlack.setNcInTest(_ctx.booleanValue("OpsDescribeOpsStatusResponse.NcInAlarmCenterBlack.NcInTest"));
		opsDescribeOpsStatusResponse.setNcInAlarmCenterBlack(ncInAlarmCenterBlack);

		NcInGammaTest ncInGammaTest = new NcInGammaTest();
		ncInGammaTest.setUserGroup(_ctx.stringValue("OpsDescribeOpsStatusResponse.NcInGammaTest.UserGroup"));
		ncInGammaTest.setStaffId(_ctx.stringValue("OpsDescribeOpsStatusResponse.NcInGammaTest.StaffId"));
		ncInGammaTest.setNcInTest(_ctx.booleanValue("OpsDescribeOpsStatusResponse.NcInGammaTest.NcInTest"));
		opsDescribeOpsStatusResponse.setNcInGammaTest(ncInGammaTest);

		List<MaintenanceInfo> maintenanceRecord = new ArrayList<MaintenanceInfo>();
		for (int i = 0; i < _ctx.lengthValue("OpsDescribeOpsStatusResponse.MaintenanceRecord.Length"); i++) {
			MaintenanceInfo maintenanceInfo = new MaintenanceInfo();
			maintenanceInfo.setStatus(_ctx.stringValue("OpsDescribeOpsStatusResponse.MaintenanceRecord["+ i +"].Status"));
			maintenanceInfo.setNcId(_ctx.stringValue("OpsDescribeOpsStatusResponse.MaintenanceRecord["+ i +"].NcId"));
			maintenanceInfo.setOpsType(_ctx.stringValue("OpsDescribeOpsStatusResponse.MaintenanceRecord["+ i +"].OpsType"));
			maintenanceInfo.setComment(_ctx.stringValue("OpsDescribeOpsStatusResponse.MaintenanceRecord["+ i +"].Comment"));
			maintenanceInfo.setGmtCreate(_ctx.stringValue("OpsDescribeOpsStatusResponse.MaintenanceRecord["+ i +"].GmtCreate"));
			maintenanceInfo.setGmtModified(_ctx.stringValue("OpsDescribeOpsStatusResponse.MaintenanceRecord["+ i +"].GmtModified"));
			maintenanceInfo.setReason(_ctx.stringValue("OpsDescribeOpsStatusResponse.MaintenanceRecord["+ i +"].Reason"));

			maintenanceRecord.add(maintenanceInfo);
		}
		opsDescribeOpsStatusResponse.setMaintenanceRecord(maintenanceRecord);

		List<NcReleaseHistoryItem> ncReleaseHistory = new ArrayList<NcReleaseHistoryItem>();
		for (int i = 0; i < _ctx.lengthValue("OpsDescribeOpsStatusResponse.NcReleaseHistory.Length"); i++) {
			NcReleaseHistoryItem ncReleaseHistoryItem = new NcReleaseHistoryItem();
			ncReleaseHistoryItem.setChangeDescription(_ctx.stringValue("OpsDescribeOpsStatusResponse.NcReleaseHistory["+ i +"].ChangeDescription"));
			ncReleaseHistoryItem.setCreateTime(_ctx.stringValue("OpsDescribeOpsStatusResponse.NcReleaseHistory["+ i +"].CreateTime"));
			ncReleaseHistoryItem.setServerRole(_ctx.stringValue("OpsDescribeOpsStatusResponse.NcReleaseHistory["+ i +"].ServerRole"));
			ncReleaseHistoryItem.setNcIp(_ctx.stringValue("OpsDescribeOpsStatusResponse.NcReleaseHistory["+ i +"].NcIp"));
			ncReleaseHistoryItem.setOperator(_ctx.stringValue("OpsDescribeOpsStatusResponse.NcReleaseHistory["+ i +"].Operator"));
			ncReleaseHistoryItem.setPlanId(_ctx.stringValue("OpsDescribeOpsStatusResponse.NcReleaseHistory["+ i +"].PlanId"));
			ncReleaseHistoryItem.setOperationStatus(_ctx.stringValue("OpsDescribeOpsStatusResponse.NcReleaseHistory["+ i +"].OperationStatus"));

			ncReleaseHistory.add(ncReleaseHistoryItem);
		}
		opsDescribeOpsStatusResponse.setNcReleaseHistory(ncReleaseHistory);

		List<VmOpsEventItem> vmOpsEvent = new ArrayList<VmOpsEventItem>();
		for (int i = 0; i < _ctx.lengthValue("OpsDescribeOpsStatusResponse.VmOpsEvent.Length"); i++) {
			VmOpsEventItem vmOpsEventItem = new VmOpsEventItem();
			vmOpsEventItem.setPlanTime(_ctx.stringValue("OpsDescribeOpsStatusResponse.VmOpsEvent["+ i +"].PlanTime"));
			vmOpsEventItem.setVmName(_ctx.stringValue("OpsDescribeOpsStatusResponse.VmOpsEvent["+ i +"].VmName"));
			vmOpsEventItem.setAliUid(_ctx.stringValue("OpsDescribeOpsStatusResponse.VmOpsEvent["+ i +"].AliUid"));
			vmOpsEventItem.setNcIp(_ctx.stringValue("OpsDescribeOpsStatusResponse.VmOpsEvent["+ i +"].NcIp"));
			vmOpsEventItem.setOpsCode(_ctx.stringValue("OpsDescribeOpsStatusResponse.VmOpsEvent["+ i +"].OpsCode"));
			vmOpsEventItem.setEndTime(_ctx.stringValue("OpsDescribeOpsStatusResponse.VmOpsEvent["+ i +"].EndTime"));
			vmOpsEventItem.setStartTime(_ctx.stringValue("OpsDescribeOpsStatusResponse.VmOpsEvent["+ i +"].StartTime"));
			vmOpsEventItem.setPublishTime(_ctx.stringValue("OpsDescribeOpsStatusResponse.VmOpsEvent["+ i +"].PublishTime"));
			vmOpsEventItem.setOpsType(_ctx.stringValue("OpsDescribeOpsStatusResponse.VmOpsEvent["+ i +"].OpsType"));
			vmOpsEventItem.setClusterAlias(_ctx.stringValue("OpsDescribeOpsStatusResponse.VmOpsEvent["+ i +"].ClusterAlias"));
			vmOpsEventItem.setClusterName(_ctx.stringValue("OpsDescribeOpsStatusResponse.VmOpsEvent["+ i +"].ClusterName"));
			vmOpsEventItem.setEventStatus(_ctx.stringValue("OpsDescribeOpsStatusResponse.VmOpsEvent["+ i +"].EventStatus"));

			vmOpsEvent.add(vmOpsEventItem);
		}
		opsDescribeOpsStatusResponse.setVmOpsEvent(vmOpsEvent);
	 
	 	return opsDescribeOpsStatusResponse;
	}
}