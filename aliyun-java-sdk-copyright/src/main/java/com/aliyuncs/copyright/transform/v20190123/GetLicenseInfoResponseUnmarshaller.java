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

package com.aliyuncs.copyright.transform.v20190123;

import com.aliyuncs.copyright.model.v20190123.GetLicenseInfoResponse;
import com.aliyuncs.copyright.model.v20190123.GetLicenseInfoResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetLicenseInfoResponseUnmarshaller {

	public static GetLicenseInfoResponse unmarshall(GetLicenseInfoResponse getLicenseInfoResponse, UnmarshallerContext _ctx) {
		
		getLicenseInfoResponse.setRequestId(_ctx.stringValue("GetLicenseInfoResponse.RequestId"));
		getLicenseInfoResponse.setSuccess(_ctx.booleanValue("GetLicenseInfoResponse.Success"));

		Data data = new Data();
		data.setCompanyName(_ctx.stringValue("GetLicenseInfoResponse.Data.CompanyName"));
		data.setCardNum(_ctx.stringValue("GetLicenseInfoResponse.Data.CardNum"));
		data.setAddress(_ctx.stringValue("GetLicenseInfoResponse.Data.Address"));
		data.setEnterpriseTime(_ctx.stringValue("GetLicenseInfoResponse.Data.EnterpriseTime"));
		data.setName(_ctx.stringValue("GetLicenseInfoResponse.Data.Name"));
		data.setEffectivePeriod(_ctx.stringValue("GetLicenseInfoResponse.Data.EffectivePeriod"));
		data.setProvince(_ctx.stringValue("GetLicenseInfoResponse.Data.Province"));
		data.setCity(_ctx.stringValue("GetLicenseInfoResponse.Data.City"));
		getLicenseInfoResponse.setData(data);
	 
	 	return getLicenseInfoResponse;
	}
}