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

import com.aliyuncs.baas.model.v20181221.CreateFabricChaincodePackageResponse;
import com.aliyuncs.baas.model.v20181221.CreateFabricChaincodePackageResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateFabricChaincodePackageResponseUnmarshaller {

	public static CreateFabricChaincodePackageResponse unmarshall(CreateFabricChaincodePackageResponse createFabricChaincodePackageResponse, UnmarshallerContext _ctx) {
		
		createFabricChaincodePackageResponse.setRequestId(_ctx.stringValue("CreateFabricChaincodePackageResponse.RequestId"));
		createFabricChaincodePackageResponse.setMessage(_ctx.stringValue("CreateFabricChaincodePackageResponse.Message"));
		createFabricChaincodePackageResponse.setSuccess(_ctx.booleanValue("CreateFabricChaincodePackageResponse.Success"));
		createFabricChaincodePackageResponse.setErrorCode(_ctx.integerValue("CreateFabricChaincodePackageResponse.ErrorCode"));

		Result result = new Result();
		result.setOrganizationId(_ctx.stringValue("CreateFabricChaincodePackageResponse.Result.OrganizationId"));
		result.setLabel(_ctx.stringValue("CreateFabricChaincodePackageResponse.Result.Label"));
		result.setChecksum(_ctx.stringValue("CreateFabricChaincodePackageResponse.Result.Checksum"));
		result.setChaincodePackageId(_ctx.stringValue("CreateFabricChaincodePackageResponse.Result.ChaincodePackageId"));
		result.setMd5sum(_ctx.stringValue("CreateFabricChaincodePackageResponse.Result.Md5sum"));
		result.setProviderUid(_ctx.stringValue("CreateFabricChaincodePackageResponse.Result.ProviderUid"));
		result.setProviderBid(_ctx.stringValue("CreateFabricChaincodePackageResponse.Result.ProviderBid"));
		result.setType(_ctx.integerValue("CreateFabricChaincodePackageResponse.Result.Type"));
		result.setTypeName(_ctx.stringValue("CreateFabricChaincodePackageResponse.Result.TypeName"));
		result.setUploadTime(_ctx.stringValue("CreateFabricChaincodePackageResponse.Result.UploadTime"));
		result.setInstallTime(_ctx.stringValue("CreateFabricChaincodePackageResponse.Result.InstallTime"));
		result.setState(_ctx.stringValue("CreateFabricChaincodePackageResponse.Result.State"));
		result.setOssURL(_ctx.stringValue("CreateFabricChaincodePackageResponse.Result.OssURL"));
		result.setDeleteTime(_ctx.stringValue("CreateFabricChaincodePackageResponse.Result.DeleteTime"));
		result.setDeleted(_ctx.booleanValue("CreateFabricChaincodePackageResponse.Result.Deleted"));
		result.setMessage(_ctx.stringValue("CreateFabricChaincodePackageResponse.Result.Message"));
		createFabricChaincodePackageResponse.setResult(result);
	 
	 	return createFabricChaincodePackageResponse;
	}
}