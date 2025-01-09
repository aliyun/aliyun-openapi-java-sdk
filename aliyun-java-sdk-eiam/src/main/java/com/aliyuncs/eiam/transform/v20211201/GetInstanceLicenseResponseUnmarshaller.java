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

package com.aliyuncs.eiam.transform.v20211201;

import com.aliyuncs.eiam.model.v20211201.GetInstanceLicenseResponse;
import com.aliyuncs.eiam.model.v20211201.GetInstanceLicenseResponse.License;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetInstanceLicenseResponseUnmarshaller {

	public static GetInstanceLicenseResponse unmarshall(GetInstanceLicenseResponse getInstanceLicenseResponse, UnmarshallerContext _ctx) {
		
		getInstanceLicenseResponse.setRequestId(_ctx.stringValue("GetInstanceLicenseResponse.RequestId"));

		License license = new License();
		license.setLicenseId(_ctx.stringValue("GetInstanceLicenseResponse.License.LicenseId"));
		license.setLicenseStatus(_ctx.stringValue("GetInstanceLicenseResponse.License.LicenseStatus"));
		license.setLicenseChargeType(_ctx.stringValue("GetInstanceLicenseResponse.License.LicenseChargeType"));
		license.setLicenseConfigJson(_ctx.stringValue("GetInstanceLicenseResponse.License.LicenseConfigJson"));
		license.setLicenseCreateTime(_ctx.longValue("GetInstanceLicenseResponse.License.LicenseCreateTime"));
		license.setPurchaseChannel(_ctx.stringValue("GetInstanceLicenseResponse.License.PurchaseChannel"));
		license.setPurchaseInstanceId(_ctx.stringValue("GetInstanceLicenseResponse.License.PurchaseInstanceId"));
		license.setEdition(_ctx.stringValue("GetInstanceLicenseResponse.License.Edition"));
		license.setUserQuota(_ctx.longValue("GetInstanceLicenseResponse.License.UserQuota"));
		license.setStartTime(_ctx.longValue("GetInstanceLicenseResponse.License.StartTime"));
		license.setEndTime(_ctx.longValue("GetInstanceLicenseResponse.License.EndTime"));
		getInstanceLicenseResponse.setLicense(license);
	 
	 	return getInstanceLicenseResponse;
	}
}