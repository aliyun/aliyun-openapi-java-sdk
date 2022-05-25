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
		userStatus.setUseOssSize(_ctx.longValue("DescribeUserStatusResponse.UserStatus.UseOssSize"));
		userStatus.setUseInstanceNum(_ctx.integerValue("DescribeUserStatusResponse.UserStatus.UseInstanceNum"));
		userStatus.setInstanceNum(_ctx.integerValue("DescribeUserStatusResponse.UserStatus.InstanceNum"));
		userStatus.setChargeType(_ctx.stringValue("DescribeUserStatusResponse.UserStatus.ChargeType"));
		userStatus.setIncSensitiveTables(_ctx.longValue("DescribeUserStatusResponse.UserStatus.IncSensitiveTables"));
		userStatus.setAuditUpgradeStatus(_ctx.booleanValue("DescribeUserStatusResponse.UserStatus.AuditUpgradeStatus"));
		userStatus.setDataMaskTasks(_ctx.longValue("DescribeUserStatusResponse.UserStatus.DataMaskTasks"));
		userStatus.setAuthed(_ctx.booleanValue("DescribeUserStatusResponse.UserStatus.Authed"));
		userStatus.setLabStatus(_ctx.integerValue("DescribeUserStatusResponse.UserStatus.LabStatus"));
		userStatus.setVersion(_ctx.stringValue("DescribeUserStatusResponse.UserStatus.Version"));
		userStatus.setOdpsSet(_ctx.booleanValue("DescribeUserStatusResponse.UserStatus.OdpsSet"));
		userStatus.setOssBucketSet(_ctx.booleanValue("DescribeUserStatusResponse.UserStatus.OssBucketSet"));
		userStatus.setSensitiveTable(_ctx.longValue("DescribeUserStatusResponse.UserStatus.SensitiveTable"));
		userStatus.setRemainDays(_ctx.integerValue("DescribeUserStatusResponse.UserStatus.RemainDays"));
		userStatus.setTotalDataMaskColumns(_ctx.longValue("DescribeUserStatusResponse.UserStatus.TotalDataMaskColumns"));
		userStatus.setDatamaskColumns(_ctx.longValue("DescribeUserStatusResponse.UserStatus.DatamaskColumns"));
		userStatus.setAuthProductList(_ctx.stringValue("DescribeUserStatusResponse.UserStatus.AuthProductList"));
		userStatus.setTrail(_ctx.booleanValue("DescribeUserStatusResponse.UserStatus.Trail"));
		userStatus.setDivulgeCount(_ctx.longValue("DescribeUserStatusResponse.UserStatus.DivulgeCount"));
		userStatus.setRdsSet(_ctx.booleanValue("DescribeUserStatusResponse.UserStatus.RdsSet"));
		userStatus.setDbAuditStatus(_ctx.integerValue("DescribeUserStatusResponse.UserStatus.DbAuditStatus"));
		userStatus.setRenewStatus(_ctx.booleanValue("DescribeUserStatusResponse.UserStatus.RenewStatus"));
		userStatus.setSensitiveObjects(_ctx.longValue("DescribeUserStatusResponse.UserStatus.SensitiveObjects"));
		userStatus.setDataMaskColumns(_ctx.longValue("DescribeUserStatusResponse.UserStatus.DataMaskColumns"));
		userStatus.setDlpTotalCount(_ctx.longValue("DescribeUserStatusResponse.UserStatus.DlpTotalCount"));
		userStatus.setSensitiveObject(_ctx.longValue("DescribeUserStatusResponse.UserStatus.SensitiveObject"));
		userStatus.setDlpCount(_ctx.longValue("DescribeUserStatusResponse.UserStatus.DlpCount"));
		userStatus.setInstanceId(_ctx.stringValue("DescribeUserStatusResponse.UserStatus.InstanceId"));
		userStatus.setAccessKeyId(_ctx.stringValue("DescribeUserStatusResponse.UserStatus.AccessKeyId"));
		userStatus.setOssSize(_ctx.longValue("DescribeUserStatusResponse.UserStatus.OssSize"));
		userStatus.setSensitiveTotalTop(_ctx.stringValue("DescribeUserStatusResponse.UserStatus.SensitiveTotalTop"));
		userStatus.setSensitiveTables(_ctx.longValue("DescribeUserStatusResponse.UserStatus.SensitiveTables"));
		userStatus.setSensitiveTop(_ctx.stringValue("DescribeUserStatusResponse.UserStatus.SensitiveTop"));
		userStatus.setPurchased(_ctx.booleanValue("DescribeUserStatusResponse.UserStatus.Purchased"));
		userStatus.setBuyed(_ctx.booleanValue("DescribeUserStatusResponse.UserStatus.Buyed"));
		userStatus.setIncSensitiveObjects(_ctx.longValue("DescribeUserStatusResponse.UserStatus.IncSensitiveObjects"));
		userStatus.setInstanceStatus(_ctx.integerValue("DescribeUserStatusResponse.UserStatus.InstanceStatus"));
		userStatus.setAssetScanned(_ctx.booleanValue("DescribeUserStatusResponse.UserStatus.AssetScanned"));
		userStatus.setAlarmCount(_ctx.longValue("DescribeUserStatusResponse.UserStatus.AlarmCount"));
		userStatus.setDisplayTime(_ctx.stringValue("DescribeUserStatusResponse.UserStatus.DisplayTime"));
		userStatus.setDataManagerRole(_ctx.integerValue("DescribeUserStatusResponse.UserStatus.DataManagerRole"));
		describeUserStatusResponse.setUserStatus(userStatus);
	 
	 	return describeUserStatusResponse;
	}
}