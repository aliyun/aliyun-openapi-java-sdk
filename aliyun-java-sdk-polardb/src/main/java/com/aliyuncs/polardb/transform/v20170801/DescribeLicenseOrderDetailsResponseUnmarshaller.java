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

import com.aliyuncs.polardb.model.v20170801.DescribeLicenseOrderDetailsResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeLicenseOrderDetailsResponseUnmarshaller {

	public static DescribeLicenseOrderDetailsResponse unmarshall(DescribeLicenseOrderDetailsResponse describeLicenseOrderDetailsResponse, UnmarshallerContext _ctx) {
		
		describeLicenseOrderDetailsResponse.setRequestId(_ctx.stringValue("DescribeLicenseOrderDetailsResponse.RequestId"));
		describeLicenseOrderDetailsResponse.setActivatedCodeCount(_ctx.integerValue("DescribeLicenseOrderDetailsResponse.ActivatedCodeCount"));
		describeLicenseOrderDetailsResponse.setActivationCodeQuota(_ctx.integerValue("DescribeLicenseOrderDetailsResponse.ActivationCodeQuota"));
		describeLicenseOrderDetailsResponse.setAliyunOrderId(_ctx.stringValue("DescribeLicenseOrderDetailsResponse.AliyunOrderId"));
		describeLicenseOrderDetailsResponse.setAllowEmptySystemIdentifier(_ctx.booleanValue("DescribeLicenseOrderDetailsResponse.AllowEmptySystemIdentifier"));
		describeLicenseOrderDetailsResponse.setEngine(_ctx.stringValue("DescribeLicenseOrderDetailsResponse.Engine"));
		describeLicenseOrderDetailsResponse.setGmtCreated(_ctx.stringValue("DescribeLicenseOrderDetailsResponse.GmtCreated"));
		describeLicenseOrderDetailsResponse.setGmtModified(_ctx.stringValue("DescribeLicenseOrderDetailsResponse.GmtModified"));
		describeLicenseOrderDetailsResponse.setIsVirtualOrder(_ctx.booleanValue("DescribeLicenseOrderDetailsResponse.IsVirtualOrder"));
		describeLicenseOrderDetailsResponse.setIsVirtualOrderFrozen(_ctx.booleanValue("DescribeLicenseOrderDetailsResponse.IsVirtualOrderFrozen"));
		describeLicenseOrderDetailsResponse.setPackageType(_ctx.stringValue("DescribeLicenseOrderDetailsResponse.PackageType"));
		describeLicenseOrderDetailsResponse.setPackageValidity(_ctx.stringValue("DescribeLicenseOrderDetailsResponse.PackageValidity"));
		describeLicenseOrderDetailsResponse.setPurchaseChannel(_ctx.stringValue("DescribeLicenseOrderDetailsResponse.PurchaseChannel"));
		describeLicenseOrderDetailsResponse.setVirtualOrderId(_ctx.stringValue("DescribeLicenseOrderDetailsResponse.VirtualOrderId"));
	 
	 	return describeLicenseOrderDetailsResponse;
	}
}