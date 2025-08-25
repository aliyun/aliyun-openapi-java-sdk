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

package com.aliyuncs.mpaas.transform.v20200710;

import com.aliyuncs.mpaas.model.v20200710.GetMcubeUpgradePackageInfoResponse;
import com.aliyuncs.mpaas.model.v20200710.GetMcubeUpgradePackageInfoResponse.GetPackageResult;
import com.aliyuncs.mpaas.model.v20200710.GetMcubeUpgradePackageInfoResponse.GetPackageResult.PackageInfo;
import com.aliyuncs.mpaas.model.v20200710.GetMcubeUpgradePackageInfoResponse.GetPackageResult.PackageInfo.MobileTestFlightConfigDO;
import com.aliyuncs.mpaas.model.v20200710.GetMcubeUpgradePackageInfoResponse.GetPackageResult.PackageInfo.UpgradeBaseInfoDO;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetMcubeUpgradePackageInfoResponseUnmarshaller {

	public static GetMcubeUpgradePackageInfoResponse unmarshall(GetMcubeUpgradePackageInfoResponse getMcubeUpgradePackageInfoResponse, UnmarshallerContext _ctx) {
		
		getMcubeUpgradePackageInfoResponse.setRequestId(_ctx.stringValue("GetMcubeUpgradePackageInfoResponse.RequestId"));
		getMcubeUpgradePackageInfoResponse.setResultMessage(_ctx.stringValue("GetMcubeUpgradePackageInfoResponse.ResultMessage"));
		getMcubeUpgradePackageInfoResponse.setResultCode(_ctx.stringValue("GetMcubeUpgradePackageInfoResponse.ResultCode"));

		GetPackageResult getPackageResult = new GetPackageResult();
		getPackageResult.setRequestId(_ctx.stringValue("GetMcubeUpgradePackageInfoResponse.GetPackageResult.RequestId"));
		getPackageResult.setErrorCode(_ctx.stringValue("GetMcubeUpgradePackageInfoResponse.GetPackageResult.ErrorCode"));
		getPackageResult.setSuccess(_ctx.booleanValue("GetMcubeUpgradePackageInfoResponse.GetPackageResult.Success"));
		getPackageResult.setResultMsg(_ctx.stringValue("GetMcubeUpgradePackageInfoResponse.GetPackageResult.ResultMsg"));

		PackageInfo packageInfo = new PackageInfo();

		UpgradeBaseInfoDO upgradeBaseInfoDO = new UpgradeBaseInfoDO();
		upgradeBaseInfoDO.setNeedCheck(_ctx.integerValue("GetMcubeUpgradePackageInfoResponse.GetPackageResult.PackageInfo.UpgradeBaseInfoDO.NeedCheck"));
		upgradeBaseInfoDO.setProductName(_ctx.stringValue("GetMcubeUpgradePackageInfoResponse.GetPackageResult.PackageInfo.UpgradeBaseInfoDO.ProductName"));
		upgradeBaseInfoDO.setDownloadUrl(_ctx.stringValue("GetMcubeUpgradePackageInfoResponse.GetPackageResult.PackageInfo.UpgradeBaseInfoDO.DownloadUrl"));
		upgradeBaseInfoDO.setAppCode(_ctx.stringValue("GetMcubeUpgradePackageInfoResponse.GetPackageResult.PackageInfo.UpgradeBaseInfoDO.AppCode"));
		upgradeBaseInfoDO.setPublishPeriod(_ctx.integerValue("GetMcubeUpgradePackageInfoResponse.GetPackageResult.PackageInfo.UpgradeBaseInfoDO.PublishPeriod"));
		upgradeBaseInfoDO.setGmtModified(_ctx.stringValue("GetMcubeUpgradePackageInfoResponse.GetPackageResult.PackageInfo.UpgradeBaseInfoDO.GmtModified"));
		upgradeBaseInfoDO.setIsEnterprise(_ctx.integerValue("GetMcubeUpgradePackageInfoResponse.GetPackageResult.PackageInfo.UpgradeBaseInfoDO.IsEnterprise"));
		upgradeBaseInfoDO.setPackageType(_ctx.stringValue("GetMcubeUpgradePackageInfoResponse.GetPackageResult.PackageInfo.UpgradeBaseInfoDO.PackageType"));
		upgradeBaseInfoDO.setProductVersion(_ctx.stringValue("GetMcubeUpgradePackageInfoResponse.GetPackageResult.PackageInfo.UpgradeBaseInfoDO.ProductVersion"));
		upgradeBaseInfoDO.setCreator(_ctx.stringValue("GetMcubeUpgradePackageInfoResponse.GetPackageResult.PackageInfo.UpgradeBaseInfoDO.Creator"));
		upgradeBaseInfoDO.setModifier(_ctx.stringValue("GetMcubeUpgradePackageInfoResponse.GetPackageResult.PackageInfo.UpgradeBaseInfoDO.Modifier"));
		upgradeBaseInfoDO.setAllowCreateTask(_ctx.booleanValue("GetMcubeUpgradePackageInfoResponse.GetPackageResult.PackageInfo.UpgradeBaseInfoDO.AllowCreateTask"));
		upgradeBaseInfoDO.setGmtCreate(_ctx.stringValue("GetMcubeUpgradePackageInfoResponse.GetPackageResult.PackageInfo.UpgradeBaseInfoDO.GmtCreate"));
		upgradeBaseInfoDO.setVerificationCode(_ctx.stringValue("GetMcubeUpgradePackageInfoResponse.GetPackageResult.PackageInfo.UpgradeBaseInfoDO.VerificationCode"));
		upgradeBaseInfoDO.setAppstoreUrl(_ctx.stringValue("GetMcubeUpgradePackageInfoResponse.GetPackageResult.PackageInfo.UpgradeBaseInfoDO.AppstoreUrl"));
		upgradeBaseInfoDO.setPlatform(_ctx.stringValue("GetMcubeUpgradePackageInfoResponse.GetPackageResult.PackageInfo.UpgradeBaseInfoDO.Platform"));
		upgradeBaseInfoDO.setProductId(_ctx.stringValue("GetMcubeUpgradePackageInfoResponse.GetPackageResult.PackageInfo.UpgradeBaseInfoDO.ProductId"));
		upgradeBaseInfoDO.setChangeLog(_ctx.stringValue("GetMcubeUpgradePackageInfoResponse.GetPackageResult.PackageInfo.UpgradeBaseInfoDO.ChangeLog"));
		upgradeBaseInfoDO.setId(_ctx.longValue("GetMcubeUpgradePackageInfoResponse.GetPackageResult.PackageInfo.UpgradeBaseInfoDO.Id"));
		packageInfo.setUpgradeBaseInfoDO(upgradeBaseInfoDO);

		MobileTestFlightConfigDO mobileTestFlightConfigDO = new MobileTestFlightConfigDO();
		mobileTestFlightConfigDO.setUpgradeId(_ctx.longValue("GetMcubeUpgradePackageInfoResponse.GetPackageResult.PackageInfo.MobileTestFlightConfigDO.UpgradeId"));
		mobileTestFlightConfigDO.setGmtCreate(_ctx.stringValue("GetMcubeUpgradePackageInfoResponse.GetPackageResult.PackageInfo.MobileTestFlightConfigDO.GmtCreate"));
		mobileTestFlightConfigDO.setInvalidTime(_ctx.stringValue("GetMcubeUpgradePackageInfoResponse.GetPackageResult.PackageInfo.MobileTestFlightConfigDO.InvalidTime"));
		mobileTestFlightConfigDO.setGmtModified(_ctx.stringValue("GetMcubeUpgradePackageInfoResponse.GetPackageResult.PackageInfo.MobileTestFlightConfigDO.GmtModified"));
		mobileTestFlightConfigDO.setInstallAmount(_ctx.integerValue("GetMcubeUpgradePackageInfoResponse.GetPackageResult.PackageInfo.MobileTestFlightConfigDO.InstallAmount"));
		mobileTestFlightConfigDO.setId(_ctx.longValue("GetMcubeUpgradePackageInfoResponse.GetPackageResult.PackageInfo.MobileTestFlightConfigDO.Id"));
		packageInfo.setMobileTestFlightConfigDO(mobileTestFlightConfigDO);
		getPackageResult.setPackageInfo(packageInfo);
		getMcubeUpgradePackageInfoResponse.setGetPackageResult(getPackageResult);
	 
	 	return getMcubeUpgradePackageInfoResponse;
	}
}