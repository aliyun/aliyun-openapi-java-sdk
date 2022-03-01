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

package com.aliyuncs.baas.transform.v20181221;

import com.aliyuncs.baas.model.v20181221.InstallFabricChaincodePackageResponse;
import com.aliyuncs.baas.model.v20181221.InstallFabricChaincodePackageResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class InstallFabricChaincodePackageResponseUnmarshaller {

	public static InstallFabricChaincodePackageResponse unmarshall(InstallFabricChaincodePackageResponse installFabricChaincodePackageResponse, UnmarshallerContext _ctx) {
		
		installFabricChaincodePackageResponse.setRequestId(_ctx.stringValue("InstallFabricChaincodePackageResponse.RequestId"));
		installFabricChaincodePackageResponse.setMessage(_ctx.stringValue("InstallFabricChaincodePackageResponse.Message"));
		installFabricChaincodePackageResponse.setSuccess(_ctx.booleanValue("InstallFabricChaincodePackageResponse.Success"));
		installFabricChaincodePackageResponse.setErrorCode(_ctx.integerValue("InstallFabricChaincodePackageResponse.ErrorCode"));

		Result result = new Result();
		result.setOrganizationId(_ctx.stringValue("InstallFabricChaincodePackageResponse.Result.OrganizationId"));
		result.setLabel(_ctx.stringValue("InstallFabricChaincodePackageResponse.Result.Label"));
		result.setChecksum(_ctx.stringValue("InstallFabricChaincodePackageResponse.Result.Checksum"));
		result.setChaincodePackageId(_ctx.stringValue("InstallFabricChaincodePackageResponse.Result.ChaincodePackageId"));
		result.setMd5sum(_ctx.stringValue("InstallFabricChaincodePackageResponse.Result.Md5sum"));
		result.setProviderUid(_ctx.stringValue("InstallFabricChaincodePackageResponse.Result.ProviderUid"));
		result.setProviderBid(_ctx.stringValue("InstallFabricChaincodePackageResponse.Result.ProviderBid"));
		result.setType(_ctx.integerValue("InstallFabricChaincodePackageResponse.Result.Type"));
		result.setTypeName(_ctx.stringValue("InstallFabricChaincodePackageResponse.Result.TypeName"));
		result.setUploadTime(_ctx.stringValue("InstallFabricChaincodePackageResponse.Result.UploadTime"));
		result.setInstallTime(_ctx.stringValue("InstallFabricChaincodePackageResponse.Result.InstallTime"));
		result.setState(_ctx.stringValue("InstallFabricChaincodePackageResponse.Result.State"));
		result.setOssURL(_ctx.stringValue("InstallFabricChaincodePackageResponse.Result.OssURL"));
		result.setDeleteTime(_ctx.stringValue("InstallFabricChaincodePackageResponse.Result.DeleteTime"));
		result.setDeleted(_ctx.booleanValue("InstallFabricChaincodePackageResponse.Result.Deleted"));
		result.setMessage(_ctx.stringValue("InstallFabricChaincodePackageResponse.Result.Message"));
		installFabricChaincodePackageResponse.setResult(result);
	 
	 	return installFabricChaincodePackageResponse;
	}
}