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

package com.aliyuncs.polardb.transform.v20170801;

import com.aliyuncs.polardb.model.v20170801.CreateOrGetVirtualLicenseOrderResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateOrGetVirtualLicenseOrderResponseUnmarshaller {

	public static CreateOrGetVirtualLicenseOrderResponse unmarshall(CreateOrGetVirtualLicenseOrderResponse createOrGetVirtualLicenseOrderResponse, UnmarshallerContext _ctx) {
		
		createOrGetVirtualLicenseOrderResponse.setRequestId(_ctx.stringValue("CreateOrGetVirtualLicenseOrderResponse.RequestId"));
		createOrGetVirtualLicenseOrderResponse.setActivatedCodeCount(_ctx.integerValue("CreateOrGetVirtualLicenseOrderResponse.ActivatedCodeCount"));
		createOrGetVirtualLicenseOrderResponse.setActivationCodeQuota(_ctx.integerValue("CreateOrGetVirtualLicenseOrderResponse.ActivationCodeQuota"));
		createOrGetVirtualLicenseOrderResponse.setAliyunOrderId(_ctx.stringValue("CreateOrGetVirtualLicenseOrderResponse.AliyunOrderId"));
		createOrGetVirtualLicenseOrderResponse.setAllowEmptySystemIdentifier(_ctx.booleanValue("CreateOrGetVirtualLicenseOrderResponse.AllowEmptySystemIdentifier"));
		createOrGetVirtualLicenseOrderResponse.setGmtCreated(_ctx.stringValue("CreateOrGetVirtualLicenseOrderResponse.GmtCreated"));
		createOrGetVirtualLicenseOrderResponse.setGmtModified(_ctx.stringValue("CreateOrGetVirtualLicenseOrderResponse.GmtModified"));
		createOrGetVirtualLicenseOrderResponse.setIsVirtualOrder(_ctx.booleanValue("CreateOrGetVirtualLicenseOrderResponse.IsVirtualOrder"));
		createOrGetVirtualLicenseOrderResponse.setIsVirtualOrderFrozen(_ctx.booleanValue("CreateOrGetVirtualLicenseOrderResponse.IsVirtualOrderFrozen"));
		createOrGetVirtualLicenseOrderResponse.setPackageType(_ctx.stringValue("CreateOrGetVirtualLicenseOrderResponse.PackageType"));
		createOrGetVirtualLicenseOrderResponse.setPackageValidity(_ctx.stringValue("CreateOrGetVirtualLicenseOrderResponse.PackageValidity"));
		createOrGetVirtualLicenseOrderResponse.setPurchaseChannel(_ctx.stringValue("CreateOrGetVirtualLicenseOrderResponse.PurchaseChannel"));
		createOrGetVirtualLicenseOrderResponse.setVirtualOrderId(_ctx.stringValue("CreateOrGetVirtualLicenseOrderResponse.VirtualOrderId"));
	 
	 	return createOrGetVirtualLicenseOrderResponse;
	}
}