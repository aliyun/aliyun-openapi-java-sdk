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

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.mpaas.model.v20200710.ListMcubeUpgradePackagesResponse;
import com.aliyuncs.mpaas.model.v20200710.ListMcubeUpgradePackagesResponse.ListPackagesResult;
import com.aliyuncs.mpaas.model.v20200710.ListMcubeUpgradePackagesResponse.ListPackagesResult.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListMcubeUpgradePackagesResponseUnmarshaller {

	public static ListMcubeUpgradePackagesResponse unmarshall(ListMcubeUpgradePackagesResponse listMcubeUpgradePackagesResponse, UnmarshallerContext _ctx) {
		
		listMcubeUpgradePackagesResponse.setRequestId(_ctx.stringValue("ListMcubeUpgradePackagesResponse.RequestId"));
		listMcubeUpgradePackagesResponse.setResultCode(_ctx.stringValue("ListMcubeUpgradePackagesResponse.ResultCode"));
		listMcubeUpgradePackagesResponse.setResultMessage(_ctx.stringValue("ListMcubeUpgradePackagesResponse.ResultMessage"));

		ListPackagesResult listPackagesResult = new ListPackagesResult();
		listPackagesResult.setErrorCode(_ctx.stringValue("ListMcubeUpgradePackagesResponse.ListPackagesResult.ErrorCode"));
		listPackagesResult.setResultMsg(_ctx.stringValue("ListMcubeUpgradePackagesResponse.ListPackagesResult.ResultMsg"));
		listPackagesResult.setSuccess(_ctx.booleanValue("ListMcubeUpgradePackagesResponse.ListPackagesResult.Success"));
		listPackagesResult.setRequestId(_ctx.stringValue("ListMcubeUpgradePackagesResponse.ListPackagesResult.RequestId"));

		List<Data> packages = new ArrayList<Data>();
		for (int i = 0; i < _ctx.lengthValue("ListMcubeUpgradePackagesResponse.ListPackagesResult.Packages.Length"); i++) {
			Data data = new Data();
			data.setId(_ctx.longValue("ListMcubeUpgradePackagesResponse.ListPackagesResult.Packages["+ i +"].Id"));
			data.setProductVersion(_ctx.stringValue("ListMcubeUpgradePackagesResponse.ListPackagesResult.Packages["+ i +"].ProductVersion"));
			data.setPlatform(_ctx.stringValue("ListMcubeUpgradePackagesResponse.ListPackagesResult.Packages["+ i +"].Platform"));
			data.setPackageType(_ctx.stringValue("ListMcubeUpgradePackagesResponse.ListPackagesResult.Packages["+ i +"].PackageType"));
			data.setAppCode(_ctx.stringValue("ListMcubeUpgradePackagesResponse.ListPackagesResult.Packages["+ i +"].AppCode"));
			data.setNeedCheck(_ctx.integerValue("ListMcubeUpgradePackagesResponse.ListPackagesResult.Packages["+ i +"].NeedCheck"));
			data.setDownloadUrl(_ctx.stringValue("ListMcubeUpgradePackagesResponse.ListPackagesResult.Packages["+ i +"].DownloadUrl"));
			data.setChangeLog(_ctx.stringValue("ListMcubeUpgradePackagesResponse.ListPackagesResult.Packages["+ i +"].ChangeLog"));
			data.setModifier(_ctx.stringValue("ListMcubeUpgradePackagesResponse.ListPackagesResult.Packages["+ i +"].Modifier"));
			data.setGmtModified(_ctx.stringValue("ListMcubeUpgradePackagesResponse.ListPackagesResult.Packages["+ i +"].GmtModified"));
			data.setMd5(_ctx.stringValue("ListMcubeUpgradePackagesResponse.ListPackagesResult.Packages["+ i +"].Md5"));
			data.setAppstoreUrl(_ctx.stringValue("ListMcubeUpgradePackagesResponse.ListPackagesResult.Packages["+ i +"].AppstoreUrl"));
			data.setIsEnterprise(_ctx.integerValue("ListMcubeUpgradePackagesResponse.ListPackagesResult.Packages["+ i +"].IsEnterprise"));
			data.setAllowCreateTask(_ctx.booleanValue("ListMcubeUpgradePackagesResponse.ListPackagesResult.Packages["+ i +"].AllowCreateTask"));
			data.setVerificationCode(_ctx.stringValue("ListMcubeUpgradePackagesResponse.ListPackagesResult.Packages["+ i +"].VerificationCode"));
			data.setGmtCreate(_ctx.stringValue("ListMcubeUpgradePackagesResponse.ListPackagesResult.Packages["+ i +"].GmtCreate"));
			data.setProductId(_ctx.stringValue("ListMcubeUpgradePackagesResponse.ListPackagesResult.Packages["+ i +"].ProductId"));
			data.setPublishPeriod(_ctx.integerValue("ListMcubeUpgradePackagesResponse.ListPackagesResult.Packages["+ i +"].PublishPeriod"));
			data.setCreator(_ctx.stringValue("ListMcubeUpgradePackagesResponse.ListPackagesResult.Packages["+ i +"].Creator"));

			packages.add(data);
		}
		listPackagesResult.setPackages(packages);
		listMcubeUpgradePackagesResponse.setListPackagesResult(listPackagesResult);
	 
	 	return listMcubeUpgradePackagesResponse;
	}
}