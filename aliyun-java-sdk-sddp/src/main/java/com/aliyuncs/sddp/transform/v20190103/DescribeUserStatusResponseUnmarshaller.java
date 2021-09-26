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

package com.aliyuncs.sddp.transform.v20190103;

import com.aliyuncs.sddp.model.v20190103.DescribeUserStatusResponse;
import com.aliyuncs.sddp.model.v20190103.DescribeUserStatusResponse.UserStatus;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeUserStatusResponseUnmarshaller {

	public static DescribeUserStatusResponse unmarshall(DescribeUserStatusResponse describeUserStatusResponse, UnmarshallerContext _ctx) {
		
		describeUserStatusResponse.setRequestId(_ctx.stringValue("DescribeUserStatusResponse.RequestId"));

		UserStatus userStatus = new UserStatus();
		userStatus.setAuthed(_ctx.booleanValue("DescribeUserStatusResponse.UserStatus.Authed"));
		userStatus.setBuyed(_ctx.booleanValue("DescribeUserStatusResponse.UserStatus.Buyed"));
		userStatus.setOssBucketSet(_ctx.booleanValue("DescribeUserStatusResponse.UserStatus.OssBucketSet"));
		userStatus.setOdpsSet(_ctx.booleanValue("DescribeUserStatusResponse.UserStatus.OdpsSet"));
		userStatus.setRdsSet(_ctx.booleanValue("DescribeUserStatusResponse.UserStatus.RdsSet"));
		userStatus.setAuthProductList(_ctx.stringValue("DescribeUserStatusResponse.UserStatus.AuthProductList"));
		userStatus.setAccessKeyId(_ctx.stringValue("DescribeUserStatusResponse.UserStatus.AccessKeyId"));
		userStatus.setTrail(_ctx.booleanValue("DescribeUserStatusResponse.UserStatus.Trail"));
		userStatus.setInstanceStatus(_ctx.integerValue("DescribeUserStatusResponse.UserStatus.InstanceStatus"));
		userStatus.setInstanceId(_ctx.stringValue("DescribeUserStatusResponse.UserStatus.InstanceId"));
		userStatus.setRemainDays(_ctx.integerValue("DescribeUserStatusResponse.UserStatus.RemainDays"));
		userStatus.setRenewStatus(_ctx.booleanValue("DescribeUserStatusResponse.UserStatus.RenewStatus"));
		userStatus.setInstanceNum(_ctx.integerValue("DescribeUserStatusResponse.UserStatus.InstanceNum"));
		userStatus.setUseInstanceNum(_ctx.integerValue("DescribeUserStatusResponse.UserStatus.UseInstanceNum"));
		userStatus.setOssSize(_ctx.longValue("DescribeUserStatusResponse.UserStatus.OssSize"));
		userStatus.setUseOssSize(_ctx.longValue("DescribeUserStatusResponse.UserStatus.UseOssSize"));
		userStatus.setChargeType(_ctx.stringValue("DescribeUserStatusResponse.UserStatus.ChargeType"));
		userStatus.setLabStatus(_ctx.integerValue("DescribeUserStatusResponse.UserStatus.LabStatus"));
		userStatus.setVersion(_ctx.stringValue("DescribeUserStatusResponse.UserStatus.Version"));
		userStatus.setDbAuditStatus(_ctx.integerValue("DescribeUserStatusResponse.UserStatus.DbAuditStatus"));
		userStatus.setAssetScanned(_ctx.booleanValue("DescribeUserStatusResponse.UserStatus.AssetScanned"));
		userStatus.setAuditUpgradeStatus(_ctx.booleanValue("DescribeUserStatusResponse.UserStatus.AuditUpgradeStatus"));
		userStatus.setSensitiveTable(_ctx.longValue("DescribeUserStatusResponse.UserStatus.SensitiveTable"));
		userStatus.setSensitiveObject(_ctx.longValue("DescribeUserStatusResponse.UserStatus.SensitiveObject"));
		userStatus.setDatamaskColumns(_ctx.longValue("DescribeUserStatusResponse.UserStatus.DatamaskColumns"));
		userStatus.setAlarmCount(_ctx.longValue("DescribeUserStatusResponse.UserStatus.AlarmCount"));
		userStatus.setDivulgeCount(_ctx.longValue("DescribeUserStatusResponse.UserStatus.DivulgeCount"));
		userStatus.setDisplayTime(_ctx.stringValue("DescribeUserStatusResponse.UserStatus.DisplayTime"));
		userStatus.setTotalDataMaskColumns(_ctx.longValue("DescribeUserStatusResponse.UserStatus.TotalDataMaskColumns"));
		userStatus.setDataMaskTasks(_ctx.longValue("DescribeUserStatusResponse.UserStatus.DataMaskTasks"));
		userStatus.setDataMaskColumns(_ctx.longValue("DescribeUserStatusResponse.UserStatus.DataMaskColumns"));
		userStatus.setSensitiveTables(_ctx.longValue("DescribeUserStatusResponse.UserStatus.SensitiveTables"));
		userStatus.setSensitiveObjects(_ctx.longValue("DescribeUserStatusResponse.UserStatus.SensitiveObjects"));
		userStatus.setIncSensitiveTables(_ctx.longValue("DescribeUserStatusResponse.UserStatus.IncSensitiveTables"));
		userStatus.setIncSensitiveObjects(_ctx.longValue("DescribeUserStatusResponse.UserStatus.IncSensitiveObjects"));
		userStatus.setSensitiveTop(_ctx.stringValue("DescribeUserStatusResponse.UserStatus.SensitiveTop"));
		userStatus.setDlpTotalCount(_ctx.longValue("DescribeUserStatusResponse.UserStatus.DlpTotalCount"));
		userStatus.setDlpCount(_ctx.longValue("DescribeUserStatusResponse.UserStatus.DlpCount"));
		userStatus.setSensitiveTotalTop(_ctx.stringValue("DescribeUserStatusResponse.UserStatus.SensitiveTotalTop"));
		describeUserStatusResponse.setUserStatus(userStatus);
	 
	 	return describeUserStatusResponse;
	}
}