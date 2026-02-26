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

package com.aliyuncs.dt_oc_info.transform.v20220829;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dt_oc_info.model.v20220829.GetOcIcAdminLicenseResponse;
import com.aliyuncs.dt_oc_info.model.v20220829.GetOcIcAdminLicenseResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetOcIcAdminLicenseResponseUnmarshaller {

	public static GetOcIcAdminLicenseResponse unmarshall(GetOcIcAdminLicenseResponse getOcIcAdminLicenseResponse, UnmarshallerContext _ctx) {
		
		getOcIcAdminLicenseResponse.setRequestId(_ctx.stringValue("GetOcIcAdminLicenseResponse.RequestId"));
		getOcIcAdminLicenseResponse.setCode(_ctx.stringValue("GetOcIcAdminLicenseResponse.Code"));
		getOcIcAdminLicenseResponse.setSuccess(_ctx.booleanValue("GetOcIcAdminLicenseResponse.Success"));
		getOcIcAdminLicenseResponse.setMessage(_ctx.stringValue("GetOcIcAdminLicenseResponse.Message"));
		getOcIcAdminLicenseResponse.setTotalNum(_ctx.integerValue("GetOcIcAdminLicenseResponse.TotalNum"));
		getOcIcAdminLicenseResponse.setPageIndex(_ctx.integerValue("GetOcIcAdminLicenseResponse.PageIndex"));
		getOcIcAdminLicenseResponse.setPageNum(_ctx.integerValue("GetOcIcAdminLicenseResponse.PageNum"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("GetOcIcAdminLicenseResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setLicenseNo(_ctx.stringValue("GetOcIcAdminLicenseResponse.Data["+ i +"].LicenseNo"));
			dataItem.setLicenseName(_ctx.stringValue("GetOcIcAdminLicenseResponse.Data["+ i +"].LicenseName"));
			dataItem.setDepartment(_ctx.stringValue("GetOcIcAdminLicenseResponse.Data["+ i +"].Department"));
			dataItem.setStartDate(_ctx.stringValue("GetOcIcAdminLicenseResponse.Data["+ i +"].StartDate"));
			dataItem.setEndDate(_ctx.stringValue("GetOcIcAdminLicenseResponse.Data["+ i +"].EndDate"));
			dataItem.setContent(_ctx.stringValue("GetOcIcAdminLicenseResponse.Data["+ i +"].Content"));

			data.add(dataItem);
		}
		getOcIcAdminLicenseResponse.setData(data);
	 
	 	return getOcIcAdminLicenseResponse;
	}
}