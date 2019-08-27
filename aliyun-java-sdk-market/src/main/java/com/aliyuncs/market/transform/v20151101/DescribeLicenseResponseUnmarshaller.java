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

package com.aliyuncs.market.transform.v20151101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.market.model.v20151101.DescribeLicenseResponse;
import com.aliyuncs.market.model.v20151101.DescribeLicenseResponse.License;
import com.aliyuncs.market.model.v20151101.DescribeLicenseResponse.License.ExtendInfo;
import com.aliyuncs.market.model.v20151101.DescribeLicenseResponse.License.LicenseAttribute;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeLicenseResponseUnmarshaller {

	public static DescribeLicenseResponse unmarshall(DescribeLicenseResponse describeLicenseResponse, UnmarshallerContext _ctx) {
		
		describeLicenseResponse.setRequestId(_ctx.stringValue("DescribeLicenseResponse.RequestId"));

		License license = new License();
		license.setLicenseStatus(_ctx.stringValue("DescribeLicenseResponse.License.LicenseStatus"));
		license.setLicenseCode(_ctx.stringValue("DescribeLicenseResponse.License.LicenseCode"));
		license.setInstanceId(_ctx.stringValue("DescribeLicenseResponse.License.InstanceId"));
		license.setCreateTime(_ctx.stringValue("DescribeLicenseResponse.License.CreateTime"));
		license.setExpiredTime(_ctx.stringValue("DescribeLicenseResponse.License.ExpiredTime"));
		license.setActivateTime(_ctx.stringValue("DescribeLicenseResponse.License.ActivateTime"));
		license.setProductSkuId(_ctx.stringValue("DescribeLicenseResponse.License.ProductSkuId"));
		license.setProductCode(_ctx.stringValue("DescribeLicenseResponse.License.ProductCode"));
		license.setProductName(_ctx.stringValue("DescribeLicenseResponse.License.ProductName"));
		license.setSupplierName(_ctx.stringValue("DescribeLicenseResponse.License.SupplierName"));

		ExtendInfo extendInfo = new ExtendInfo();
		extendInfo.setAliUid(_ctx.longValue("DescribeLicenseResponse.License.ExtendInfo.AliUid"));
		extendInfo.setEmail(_ctx.stringValue("DescribeLicenseResponse.License.ExtendInfo.Email"));
		extendInfo.setMobile(_ctx.stringValue("DescribeLicenseResponse.License.ExtendInfo.Mobile"));
		extendInfo.setAccountQuantity(_ctx.longValue("DescribeLicenseResponse.License.ExtendInfo.AccountQuantity"));
		license.setExtendInfo(extendInfo);

		List<LicenseAttribute> extendArray = new ArrayList<LicenseAttribute>();
		for (int i = 0; i < _ctx.lengthValue("DescribeLicenseResponse.License.ExtendArray.Length"); i++) {
			LicenseAttribute licenseAttribute = new LicenseAttribute();
			licenseAttribute.setCode(_ctx.stringValue("DescribeLicenseResponse.License.ExtendArray["+ i +"].Code"));
			licenseAttribute.setValue(_ctx.stringValue("DescribeLicenseResponse.License.ExtendArray["+ i +"].Value"));

			extendArray.add(licenseAttribute);
		}
		license.setExtendArray(extendArray);
		describeLicenseResponse.setLicense(license);
	 
	 	return describeLicenseResponse;
	}
}