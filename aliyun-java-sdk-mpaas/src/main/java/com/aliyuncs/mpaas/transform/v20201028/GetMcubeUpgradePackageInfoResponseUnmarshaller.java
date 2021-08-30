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

package com.aliyuncs.mpaas.transform.v20201028;

import com.aliyuncs.mpaas.model.v20201028.GetMcubeUpgradePackageInfoResponse;
import com.aliyuncs.mpaas.model.v20201028.GetMcubeUpgradePackageInfoResponse.GetPackageResult;
import com.aliyuncs.mpaas.model.v20201028.GetMcubeUpgradePackageInfoResponse.GetPackageResult.PackageInfo;
import com.aliyuncs.mpaas.model.v20201028.GetMcubeUpgradePackageInfoResponse.GetPackageResult.PackageInfo.MobileTestFlightConfigDO;
import com.aliyuncs.mpaas.model.v20201028.GetMcubeUpgradePackageInfoResponse.GetPackageResult.PackageInfo.UpgradeBaseInfoDO;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetMcubeUpgradePackageInfoResponseUnmarshaller {

	public static GetMcubeUpgradePackageInfoResponse unmarshall(GetMcubeUpgradePackageInfoResponse getMcubeUpgradePackageInfoResponse, UnmarshallerContext _ctx) {
		
		getMcubeUpgradePackageInfoResponse.setRequestId(_ctx.stringValue("GetMcubeUpgradePackageInfoResponse.RequestId"));
		getMcubeUpgradePackageInfoResponse.setResultCode(_ctx.stringValue("GetMcubeUpgradePackageInfoResponse.ResultCode"));
		getMcubeUpgradePackageInfoResponse.setResultMessage(_ctx.stringValue("GetMcubeUpgradePackageInfoResponse.ResultMessage"));

		GetPackageResult getPackageResult = new GetPackageResult();
		getPackageResult.setErrorCode(_ctx.stringValue("GetMcubeUpgradePackageInfoResponse.GetPackageResult.ErrorCode"));
		getPackageResult.setResultMsg(_ctx.stringValue("GetMcubeUpgradePackageInfoResponse.GetPackageResult.ResultMsg"));
		getPackageResult.setSuccess(_ctx.booleanValue("GetMcubeUpgradePackageInfoResponse.GetPackageResult.Success"));
		getPackageResult.setRequestId(_ctx.stringValue("GetMcubeUpgradePackageInfoResponse.GetPackageResult.RequestId"));

		PackageInfo packageInfo = new PackageInfo();

		UpgradeBaseInfoDO upgradeBaseInfoDO = new UpgradeBaseInfoDO();
		upgradeBaseInfoDO.setOssPath(_ctx.stringValue("GetMcubeUpgradePackageInfoResponse.GetPackageResult.PackageInfo.UpgradeBaseInfoDO.OssPath"));
		upgradeBaseInfoDO.setQrcodeUrl(_ctx.stringValue("GetMcubeUpgradePackageInfoResponse.GetPackageResult.PackageInfo.UpgradeBaseInfoDO.QrcodeUrl"));
		upgradeBaseInfoDO.setGmtCreateStr(_ctx.stringValue("GetMcubeUpgradePackageInfoResponse.GetPackageResult.PackageInfo.UpgradeBaseInfoDO.GmtCreateStr"));
		upgradeBaseInfoDO.setId(_ctx.longValue("GetMcubeUpgradePackageInfoResponse.GetPackageResult.PackageInfo.UpgradeBaseInfoDO.Id"));
		upgradeBaseInfoDO.setIosSymbol(_ctx.stringValue("GetMcubeUpgradePackageInfoResponse.GetPackageResult.PackageInfo.UpgradeBaseInfoDO.IosSymbol"));
		upgradeBaseInfoDO.setGmtModifiedStr(_ctx.stringValue("GetMcubeUpgradePackageInfoResponse.GetPackageResult.PackageInfo.UpgradeBaseInfoDO.GmtModifiedStr"));
		upgradeBaseInfoDO.setReleaseType(_ctx.stringValue("GetMcubeUpgradePackageInfoResponse.GetPackageResult.PackageInfo.UpgradeBaseInfoDO.ReleaseType"));
		upgradeBaseInfoDO.setProductVersion(_ctx.stringValue("GetMcubeUpgradePackageInfoResponse.GetPackageResult.PackageInfo.UpgradeBaseInfoDO.ProductVersion"));
		upgradeBaseInfoDO.setBackLog(_ctx.stringValue("GetMcubeUpgradePackageInfoResponse.GetPackageResult.PackageInfo.UpgradeBaseInfoDO.BackLog"));
		upgradeBaseInfoDO.setPlatform(_ctx.stringValue("GetMcubeUpgradePackageInfoResponse.GetPackageResult.PackageInfo.UpgradeBaseInfoDO.Platform"));
		upgradeBaseInfoDO.setProductName(_ctx.stringValue("GetMcubeUpgradePackageInfoResponse.GetPackageResult.PackageInfo.UpgradeBaseInfoDO.ProductName"));
		upgradeBaseInfoDO.setIsRelease(_ctx.integerValue("GetMcubeUpgradePackageInfoResponse.GetPackageResult.PackageInfo.UpgradeBaseInfoDO.IsRelease"));
		upgradeBaseInfoDO.setPackageType(_ctx.stringValue("GetMcubeUpgradePackageInfoResponse.GetPackageResult.PackageInfo.UpgradeBaseInfoDO.PackageType"));
		upgradeBaseInfoDO.setIsRc(_ctx.integerValue("GetMcubeUpgradePackageInfoResponse.GetPackageResult.PackageInfo.UpgradeBaseInfoDO.IsRc"));
		upgradeBaseInfoDO.setAppCode(_ctx.stringValue("GetMcubeUpgradePackageInfoResponse.GetPackageResult.PackageInfo.UpgradeBaseInfoDO.AppCode"));
		upgradeBaseInfoDO.setNeedCheck(_ctx.integerValue("GetMcubeUpgradePackageInfoResponse.GetPackageResult.PackageInfo.UpgradeBaseInfoDO.NeedCheck"));
		upgradeBaseInfoDO.setDownloadUrl(_ctx.stringValue("GetMcubeUpgradePackageInfoResponse.GetPackageResult.PackageInfo.UpgradeBaseInfoDO.DownloadUrl"));
		upgradeBaseInfoDO.setChangeLog(_ctx.stringValue("GetMcubeUpgradePackageInfoResponse.GetPackageResult.PackageInfo.UpgradeBaseInfoDO.ChangeLog"));
		upgradeBaseInfoDO.setCpId(_ctx.stringValue("GetMcubeUpgradePackageInfoResponse.GetPackageResult.PackageInfo.UpgradeBaseInfoDO.CpId"));
		upgradeBaseInfoDO.setModifier(_ctx.stringValue("GetMcubeUpgradePackageInfoResponse.GetPackageResult.PackageInfo.UpgradeBaseInfoDO.Modifier"));
		upgradeBaseInfoDO.setClientName(_ctx.stringValue("GetMcubeUpgradePackageInfoResponse.GetPackageResult.PackageInfo.UpgradeBaseInfoDO.ClientName"));
		upgradeBaseInfoDO.setGmtModified(_ctx.stringValue("GetMcubeUpgradePackageInfoResponse.GetPackageResult.PackageInfo.UpgradeBaseInfoDO.GmtModified"));
		upgradeBaseInfoDO.setServerVersion(_ctx.integerValue("GetMcubeUpgradePackageInfoResponse.GetPackageResult.PackageInfo.UpgradeBaseInfoDO.ServerVersion"));
		upgradeBaseInfoDO.setScmDownloadUrl(_ctx.stringValue("GetMcubeUpgradePackageInfoResponse.GetPackageResult.PackageInfo.UpgradeBaseInfoDO.ScmDownloadUrl"));
		upgradeBaseInfoDO.setInnerVersion(_ctx.stringValue("GetMcubeUpgradePackageInfoResponse.GetPackageResult.PackageInfo.UpgradeBaseInfoDO.InnerVersion"));
		upgradeBaseInfoDO.setGlobalVariables(_ctx.stringValue("GetMcubeUpgradePackageInfoResponse.GetPackageResult.PackageInfo.UpgradeBaseInfoDO.GlobalVariables"));
		upgradeBaseInfoDO.setClientFileSize(_ctx.integerValue("GetMcubeUpgradePackageInfoResponse.GetPackageResult.PackageInfo.UpgradeBaseInfoDO.ClientFileSize"));
		upgradeBaseInfoDO.setMd5(_ctx.stringValue("GetMcubeUpgradePackageInfoResponse.GetPackageResult.PackageInfo.UpgradeBaseInfoDO.Md5"));
		upgradeBaseInfoDO.setAppstoreUrl(_ctx.stringValue("GetMcubeUpgradePackageInfoResponse.GetPackageResult.PackageInfo.UpgradeBaseInfoDO.AppstoreUrl"));
		upgradeBaseInfoDO.setIsEnterprise(_ctx.integerValue("GetMcubeUpgradePackageInfoResponse.GetPackageResult.PackageInfo.UpgradeBaseInfoDO.IsEnterprise"));
		upgradeBaseInfoDO.setMaxVersion(_ctx.stringValue("GetMcubeUpgradePackageInfoResponse.GetPackageResult.PackageInfo.UpgradeBaseInfoDO.MaxVersion"));
		upgradeBaseInfoDO.setAllowCreateTask(_ctx.booleanValue("GetMcubeUpgradePackageInfoResponse.GetPackageResult.PackageInfo.UpgradeBaseInfoDO.AllowCreateTask"));
		upgradeBaseInfoDO.setVersionCode(_ctx.stringValue("GetMcubeUpgradePackageInfoResponse.GetPackageResult.PackageInfo.UpgradeBaseInfoDO.VersionCode"));
		upgradeBaseInfoDO.setVerificationCode(_ctx.stringValue("GetMcubeUpgradePackageInfoResponse.GetPackageResult.PackageInfo.UpgradeBaseInfoDO.VerificationCode"));
		upgradeBaseInfoDO.setGmtCreate(_ctx.stringValue("GetMcubeUpgradePackageInfoResponse.GetPackageResult.PackageInfo.UpgradeBaseInfoDO.GmtCreate"));
		upgradeBaseInfoDO.setReleaseWindow(_ctx.stringValue("GetMcubeUpgradePackageInfoResponse.GetPackageResult.PackageInfo.UpgradeBaseInfoDO.ReleaseWindow"));
		upgradeBaseInfoDO.setVerifyResult(_ctx.integerValue("GetMcubeUpgradePackageInfoResponse.GetPackageResult.PackageInfo.UpgradeBaseInfoDO.VerifyResult"));
		upgradeBaseInfoDO.setProductId(_ctx.stringValue("GetMcubeUpgradePackageInfoResponse.GetPackageResult.PackageInfo.UpgradeBaseInfoDO.ProductId"));
		upgradeBaseInfoDO.setPublishPeriod(_ctx.integerValue("GetMcubeUpgradePackageInfoResponse.GetPackageResult.PackageInfo.UpgradeBaseInfoDO.PublishPeriod"));
		upgradeBaseInfoDO.setCreator(_ctx.stringValue("GetMcubeUpgradePackageInfoResponse.GetPackageResult.PackageInfo.UpgradeBaseInfoDO.Creator"));
		packageInfo.setUpgradeBaseInfoDO(upgradeBaseInfoDO);

		MobileTestFlightConfigDO mobileTestFlightConfigDO = new MobileTestFlightConfigDO();
		mobileTestFlightConfigDO.setInstallAmount(_ctx.integerValue("GetMcubeUpgradePackageInfoResponse.GetPackageResult.PackageInfo.MobileTestFlightConfigDO.InstallAmount"));
		mobileTestFlightConfigDO.setGmtModified(_ctx.stringValue("GetMcubeUpgradePackageInfoResponse.GetPackageResult.PackageInfo.MobileTestFlightConfigDO.GmtModified"));
		mobileTestFlightConfigDO.setId(_ctx.longValue("GetMcubeUpgradePackageInfoResponse.GetPackageResult.PackageInfo.MobileTestFlightConfigDO.Id"));
		mobileTestFlightConfigDO.setInvalidTime(_ctx.stringValue("GetMcubeUpgradePackageInfoResponse.GetPackageResult.PackageInfo.MobileTestFlightConfigDO.InvalidTime"));
		mobileTestFlightConfigDO.setGmtCreate(_ctx.stringValue("GetMcubeUpgradePackageInfoResponse.GetPackageResult.PackageInfo.MobileTestFlightConfigDO.GmtCreate"));
		mobileTestFlightConfigDO.setUpgradeId(_ctx.longValue("GetMcubeUpgradePackageInfoResponse.GetPackageResult.PackageInfo.MobileTestFlightConfigDO.UpgradeId"));
		packageInfo.setMobileTestFlightConfigDO(mobileTestFlightConfigDO);
		getPackageResult.setPackageInfo(packageInfo);
		getMcubeUpgradePackageInfoResponse.setGetPackageResult(getPackageResult);
	 
	 	return getMcubeUpgradePackageInfoResponse;
	}
}