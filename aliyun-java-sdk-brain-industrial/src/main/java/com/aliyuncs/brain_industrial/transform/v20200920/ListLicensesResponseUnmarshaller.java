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

package com.aliyuncs.brain_industrial.transform.v20200920;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.brain_industrial.model.v20200920.ListLicensesResponse;
import com.aliyuncs.brain_industrial.model.v20200920.ListLicensesResponse.License;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListLicensesResponseUnmarshaller {

	public static ListLicensesResponse unmarshall(ListLicensesResponse listLicensesResponse, UnmarshallerContext _ctx) {
		
		listLicensesResponse.setRequestId(_ctx.stringValue("ListLicensesResponse.RequestId"));
		listLicensesResponse.setTotalCount(_ctx.longValue("ListLicensesResponse.TotalCount"));
		listLicensesResponse.setMessage(_ctx.stringValue("ListLicensesResponse.Message"));
		listLicensesResponse.setPageSize(_ctx.integerValue("ListLicensesResponse.PageSize"));
		listLicensesResponse.setCurrentPage(_ctx.integerValue("ListLicensesResponse.CurrentPage"));
		listLicensesResponse.setTotalPage(_ctx.stringValue("ListLicensesResponse.TotalPage"));
		listLicensesResponse.setTotalPageCount(_ctx.stringValue("ListLicensesResponse.TotalPageCount"));
		listLicensesResponse.setCode(_ctx.stringValue("ListLicensesResponse.Code"));
		listLicensesResponse.setSuccess(_ctx.booleanValue("ListLicensesResponse.Success"));
		listLicensesResponse.setHttpStatusCode(_ctx.integerValue("ListLicensesResponse.HttpStatusCode"));
		listLicensesResponse.setAccessDeniedDetail(_ctx.stringValue("ListLicensesResponse.AccessDeniedDetail"));

		List<License> licenseList = new ArrayList<License>();
		for (int i = 0; i < _ctx.lengthValue("ListLicensesResponse.LicenseList.Length"); i++) {
			License license = new License();
			license.setId(_ctx.stringValue("ListLicensesResponse.LicenseList["+ i +"].Id"));
			license.setLicenseSpecName(_ctx.stringValue("ListLicensesResponse.LicenseList["+ i +"].LicenseSpecName"));
			license.setLicenseSpecType(_ctx.stringValue("ListLicensesResponse.LicenseList["+ i +"].LicenseSpecType"));
			license.setLicenseSpecCode(_ctx.stringValue("ListLicensesResponse.LicenseList["+ i +"].LicenseSpecCode"));
			license.setBuyTime(_ctx.stringValue("ListLicensesResponse.LicenseList["+ i +"].BuyTime"));
			license.setActivateTime(_ctx.stringValue("ListLicensesResponse.LicenseList["+ i +"].ActivateTime"));
			license.setEffectTime(_ctx.stringValue("ListLicensesResponse.LicenseList["+ i +"].EffectTime"));
			license.setExpireTime(_ctx.stringValue("ListLicensesResponse.LicenseList["+ i +"].ExpireTime"));
			license.setDuration(_ctx.stringValue("ListLicensesResponse.LicenseList["+ i +"].Duration"));
			license.setAdaptiveMachine(_ctx.integerValue("ListLicensesResponse.LicenseList["+ i +"].AdaptiveMachine"));
			license.setStatus(_ctx.stringValue("ListLicensesResponse.LicenseList["+ i +"].Status"));
			license.setMemoryLimit(_ctx.integerValue("ListLicensesResponse.LicenseList["+ i +"].MemoryLimit"));
			license.setInstanceId(_ctx.stringValue("ListLicensesResponse.LicenseList["+ i +"].InstanceId"));
			license.setDescription(_ctx.stringValue("ListLicensesResponse.LicenseList["+ i +"].Description"));
			license.setAllDuration(_ctx.stringValue("ListLicensesResponse.LicenseList["+ i +"].AllDuration"));
			license.setCpuLimit(_ctx.integerValue("ListLicensesResponse.LicenseList["+ i +"].CpuLimit"));
			license.setUnActivateAllDuration(_ctx.stringValue("ListLicensesResponse.LicenseList["+ i +"].UnActivateAllDuration"));

			licenseList.add(license);
		}
		listLicensesResponse.setLicenseList(licenseList);
	 
	 	return listLicensesResponse;
	}
}