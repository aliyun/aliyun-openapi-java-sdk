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

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.baas.model.v20181221.DescribeFabricOrganizationChaincodePackageResponse;
import com.aliyuncs.baas.model.v20181221.DescribeFabricOrganizationChaincodePackageResponse.ChaincodePackages;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeFabricOrganizationChaincodePackageResponseUnmarshaller {

	public static DescribeFabricOrganizationChaincodePackageResponse unmarshall(DescribeFabricOrganizationChaincodePackageResponse describeFabricOrganizationChaincodePackageResponse, UnmarshallerContext _ctx) {
		
		describeFabricOrganizationChaincodePackageResponse.setRequestId(_ctx.stringValue("DescribeFabricOrganizationChaincodePackageResponse.RequestId"));
		describeFabricOrganizationChaincodePackageResponse.setMessage(_ctx.stringValue("DescribeFabricOrganizationChaincodePackageResponse.Message"));
		describeFabricOrganizationChaincodePackageResponse.setSuccess(_ctx.booleanValue("DescribeFabricOrganizationChaincodePackageResponse.Success"));
		describeFabricOrganizationChaincodePackageResponse.setErrorCode(_ctx.integerValue("DescribeFabricOrganizationChaincodePackageResponse.ErrorCode"));

		List<ChaincodePackages> result = new ArrayList<ChaincodePackages>();
		for (int i = 0; i < _ctx.lengthValue("DescribeFabricOrganizationChaincodePackageResponse.Result.Length"); i++) {
			ChaincodePackages chaincodePackages = new ChaincodePackages();
			chaincodePackages.setOrganizationId(_ctx.stringValue("DescribeFabricOrganizationChaincodePackageResponse.Result["+ i +"].OrganizationId"));
			chaincodePackages.setLabel(_ctx.stringValue("DescribeFabricOrganizationChaincodePackageResponse.Result["+ i +"].Label"));
			chaincodePackages.setChecksum(_ctx.stringValue("DescribeFabricOrganizationChaincodePackageResponse.Result["+ i +"].Checksum"));
			chaincodePackages.setChaincodePackageId(_ctx.stringValue("DescribeFabricOrganizationChaincodePackageResponse.Result["+ i +"].ChaincodePackageId"));
			chaincodePackages.setMd5sum(_ctx.stringValue("DescribeFabricOrganizationChaincodePackageResponse.Result["+ i +"].Md5sum"));
			chaincodePackages.setProviderUid(_ctx.stringValue("DescribeFabricOrganizationChaincodePackageResponse.Result["+ i +"].ProviderUid"));
			chaincodePackages.setProviderBid(_ctx.stringValue("DescribeFabricOrganizationChaincodePackageResponse.Result["+ i +"].ProviderBid"));
			chaincodePackages.setType(_ctx.integerValue("DescribeFabricOrganizationChaincodePackageResponse.Result["+ i +"].Type"));
			chaincodePackages.setTypeName(_ctx.stringValue("DescribeFabricOrganizationChaincodePackageResponse.Result["+ i +"].TypeName"));
			chaincodePackages.setUploadTime(_ctx.stringValue("DescribeFabricOrganizationChaincodePackageResponse.Result["+ i +"].UploadTime"));
			chaincodePackages.setInstallTime(_ctx.stringValue("DescribeFabricOrganizationChaincodePackageResponse.Result["+ i +"].InstallTime"));
			chaincodePackages.setState(_ctx.stringValue("DescribeFabricOrganizationChaincodePackageResponse.Result["+ i +"].State"));
			chaincodePackages.setOssURL(_ctx.stringValue("DescribeFabricOrganizationChaincodePackageResponse.Result["+ i +"].OssURL"));
			chaincodePackages.setDeleteTime(_ctx.stringValue("DescribeFabricOrganizationChaincodePackageResponse.Result["+ i +"].DeleteTime"));
			chaincodePackages.setDeleted(_ctx.booleanValue("DescribeFabricOrganizationChaincodePackageResponse.Result["+ i +"].Deleted"));
			chaincodePackages.setMessage(_ctx.stringValue("DescribeFabricOrganizationChaincodePackageResponse.Result["+ i +"].Message"));

			result.add(chaincodePackages);
		}
		describeFabricOrganizationChaincodePackageResponse.setResult(result);
	 
	 	return describeFabricOrganizationChaincodePackageResponse;
	}
}