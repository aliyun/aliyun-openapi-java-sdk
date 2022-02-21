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

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.mpaas.model.v20201028.ListMcubeUpgradePackagesResponse;
import com.aliyuncs.mpaas.model.v20201028.ListMcubeUpgradePackagesResponse.ListPackagesResult;
import com.aliyuncs.mpaas.model.v20201028.ListMcubeUpgradePackagesResponse.ListPackagesResult.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListMcubeUpgradePackagesResponseUnmarshaller {

	public static ListMcubeUpgradePackagesResponse unmarshall(ListMcubeUpgradePackagesResponse listMcubeUpgradePackagesResponse, UnmarshallerContext _ctx) {
		
		listMcubeUpgradePackagesResponse.setRequestId(_ctx.stringValue("ListMcubeUpgradePackagesResponse.RequestId"));
		listMcubeUpgradePackagesResponse.setResultMessage(_ctx.stringValue("ListMcubeUpgradePackagesResponse.ResultMessage"));
		listMcubeUpgradePackagesResponse.setResultCode(_ctx.stringValue("ListMcubeUpgradePackagesResponse.ResultCode"));

		ListPackagesResult listPackagesResult = new ListPackagesResult();
		listPackagesResult.setRequestId(_ctx.stringValue("ListMcubeUpgradePackagesResponse.ListPackagesResult.RequestId"));
		listPackagesResult.setErrorCode(_ctx.stringValue("ListMcubeUpgradePackagesResponse.ListPackagesResult.ErrorCode"));
		listPackagesResult.setSuccess(_ctx.booleanValue("ListMcubeUpgradePackagesResponse.ListPackagesResult.Success"));
		listPackagesResult.setResultMsg(_ctx.stringValue("ListMcubeUpgradePackagesResponse.ListPackagesResult.ResultMsg"));

		List<Data> packages = new ArrayList<Data>();
		for (int i = 0; i < _ctx.lengthValue("ListMcubeUpgradePackagesResponse.ListPackagesResult.Packages.Length"); i++) {
			Data data = new Data();
			data.setNeedCheck(_ctx.integerValue("ListMcubeUpgradePackagesResponse.ListPackagesResult.Packages["+ i +"].NeedCheck"));
			data.setClientFileSize(_ctx.integerValue("ListMcubeUpgradePackagesResponse.ListPackagesResult.Packages["+ i +"].ClientFileSize"));
			data.setScmDownloadUrl(_ctx.stringValue("ListMcubeUpgradePackagesResponse.ListPackagesResult.Packages["+ i +"].ScmDownloadUrl"));
			data.setGmtModified(_ctx.stringValue("ListMcubeUpgradePackagesResponse.ListPackagesResult.Packages["+ i +"].GmtModified"));
			data.setClientName(_ctx.stringValue("ListMcubeUpgradePackagesResponse.ListPackagesResult.Packages["+ i +"].ClientName"));
			data.setIsEnterprise(_ctx.integerValue("ListMcubeUpgradePackagesResponse.ListPackagesResult.Packages["+ i +"].IsEnterprise"));
			data.setPackageType(_ctx.stringValue("ListMcubeUpgradePackagesResponse.ListPackagesResult.Packages["+ i +"].PackageType"));
			data.setBackLog(_ctx.stringValue("ListMcubeUpgradePackagesResponse.ListPackagesResult.Packages["+ i +"].BackLog"));
			data.setCreator(_ctx.stringValue("ListMcubeUpgradePackagesResponse.ListPackagesResult.Packages["+ i +"].Creator"));
			data.setModifier(_ctx.stringValue("ListMcubeUpgradePackagesResponse.ListPackagesResult.Packages["+ i +"].Modifier"));
			data.setIsRelease(_ctx.integerValue("ListMcubeUpgradePackagesResponse.ListPackagesResult.Packages["+ i +"].IsRelease"));
			data.setAllowCreateTask(_ctx.booleanValue("ListMcubeUpgradePackagesResponse.ListPackagesResult.Packages["+ i +"].AllowCreateTask"));
			data.setCpId(_ctx.stringValue("ListMcubeUpgradePackagesResponse.ListPackagesResult.Packages["+ i +"].CpId"));
			data.setAppstoreUrl(_ctx.stringValue("ListMcubeUpgradePackagesResponse.ListPackagesResult.Packages["+ i +"].AppstoreUrl"));
			data.setIsRc(_ctx.integerValue("ListMcubeUpgradePackagesResponse.ListPackagesResult.Packages["+ i +"].IsRc"));
			data.setPlatform(_ctx.stringValue("ListMcubeUpgradePackagesResponse.ListPackagesResult.Packages["+ i +"].Platform"));
			data.setMaxVersion(_ctx.stringValue("ListMcubeUpgradePackagesResponse.ListPackagesResult.Packages["+ i +"].MaxVersion"));
			data.setProductId(_ctx.stringValue("ListMcubeUpgradePackagesResponse.ListPackagesResult.Packages["+ i +"].ProductId"));
			data.setVersionCode(_ctx.stringValue("ListMcubeUpgradePackagesResponse.ListPackagesResult.Packages["+ i +"].VersionCode"));
			data.setGlobalVariables(_ctx.stringValue("ListMcubeUpgradePackagesResponse.ListPackagesResult.Packages["+ i +"].GlobalVariables"));
			data.setReleaseType(_ctx.stringValue("ListMcubeUpgradePackagesResponse.ListPackagesResult.Packages["+ i +"].ReleaseType"));
			data.setGmtCreateStr(_ctx.stringValue("ListMcubeUpgradePackagesResponse.ListPackagesResult.Packages["+ i +"].GmtCreateStr"));
			data.setProductName(_ctx.stringValue("ListMcubeUpgradePackagesResponse.ListPackagesResult.Packages["+ i +"].ProductName"));
			data.setGmtModifiedStr(_ctx.stringValue("ListMcubeUpgradePackagesResponse.ListPackagesResult.Packages["+ i +"].GmtModifiedStr"));
			data.setIosSymbol(_ctx.stringValue("ListMcubeUpgradePackagesResponse.ListPackagesResult.Packages["+ i +"].IosSymbol"));
			data.setDownloadUrl(_ctx.stringValue("ListMcubeUpgradePackagesResponse.ListPackagesResult.Packages["+ i +"].DownloadUrl"));
			data.setInnerVersion(_ctx.stringValue("ListMcubeUpgradePackagesResponse.ListPackagesResult.Packages["+ i +"].InnerVersion"));
			data.setAppCode(_ctx.stringValue("ListMcubeUpgradePackagesResponse.ListPackagesResult.Packages["+ i +"].AppCode"));
			data.setServerVersion(_ctx.integerValue("ListMcubeUpgradePackagesResponse.ListPackagesResult.Packages["+ i +"].ServerVersion"));
			data.setPublishPeriod(_ctx.integerValue("ListMcubeUpgradePackagesResponse.ListPackagesResult.Packages["+ i +"].PublishPeriod"));
			data.setVerifyResult(_ctx.integerValue("ListMcubeUpgradePackagesResponse.ListPackagesResult.Packages["+ i +"].VerifyResult"));
			data.setProductVersion(_ctx.stringValue("ListMcubeUpgradePackagesResponse.ListPackagesResult.Packages["+ i +"].ProductVersion"));
			data.setGmtCreate(_ctx.stringValue("ListMcubeUpgradePackagesResponse.ListPackagesResult.Packages["+ i +"].GmtCreate"));
			data.setVerificationCode(_ctx.stringValue("ListMcubeUpgradePackagesResponse.ListPackagesResult.Packages["+ i +"].VerificationCode"));
			data.setReleaseWindow(_ctx.stringValue("ListMcubeUpgradePackagesResponse.ListPackagesResult.Packages["+ i +"].ReleaseWindow"));
			data.setQrcodeUrl(_ctx.stringValue("ListMcubeUpgradePackagesResponse.ListPackagesResult.Packages["+ i +"].QrcodeUrl"));
			data.setMd5(_ctx.stringValue("ListMcubeUpgradePackagesResponse.ListPackagesResult.Packages["+ i +"].Md5"));
			data.setChangeLog(_ctx.stringValue("ListMcubeUpgradePackagesResponse.ListPackagesResult.Packages["+ i +"].ChangeLog"));
			data.setOssPath(_ctx.stringValue("ListMcubeUpgradePackagesResponse.ListPackagesResult.Packages["+ i +"].OssPath"));
			data.setId(_ctx.longValue("ListMcubeUpgradePackagesResponse.ListPackagesResult.Packages["+ i +"].Id"));

			packages.add(data);
		}
		listPackagesResult.setPackages(packages);
		listMcubeUpgradePackagesResponse.setListPackagesResult(listPackagesResult);
	 
	 	return listMcubeUpgradePackagesResponse;
	}
}