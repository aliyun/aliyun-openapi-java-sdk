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

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.polardb.model.v20170801.DescribeLicenseOrdersResponse;
import com.aliyuncs.polardb.model.v20170801.DescribeLicenseOrdersResponse.LicenseOrder;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeLicenseOrdersResponseUnmarshaller {

	public static DescribeLicenseOrdersResponse unmarshall(DescribeLicenseOrdersResponse describeLicenseOrdersResponse, UnmarshallerContext _ctx) {
		
		describeLicenseOrdersResponse.setRequestId(_ctx.stringValue("DescribeLicenseOrdersResponse.RequestId"));
		describeLicenseOrdersResponse.setPageNumber(_ctx.integerValue("DescribeLicenseOrdersResponse.PageNumber"));
		describeLicenseOrdersResponse.setPageRecordCount(_ctx.integerValue("DescribeLicenseOrdersResponse.PageRecordCount"));
		describeLicenseOrdersResponse.setTotalRecordCount(_ctx.integerValue("DescribeLicenseOrdersResponse.TotalRecordCount"));

		List<LicenseOrder> items = new ArrayList<LicenseOrder>();
		for (int i = 0; i < _ctx.lengthValue("DescribeLicenseOrdersResponse.Items.Length"); i++) {
			LicenseOrder licenseOrder = new LicenseOrder();
			licenseOrder.setActivatedCodeCount(_ctx.integerValue("DescribeLicenseOrdersResponse.Items["+ i +"].ActivatedCodeCount"));
			licenseOrder.setActivationCodeQuota(_ctx.integerValue("DescribeLicenseOrdersResponse.Items["+ i +"].ActivationCodeQuota"));
			licenseOrder.setAliyunOrderId(_ctx.stringValue("DescribeLicenseOrdersResponse.Items["+ i +"].AliyunOrderId"));
			licenseOrder.setAllowEmptySystemIdentifier(_ctx.booleanValue("DescribeLicenseOrdersResponse.Items["+ i +"].AllowEmptySystemIdentifier"));
			licenseOrder.setEngine(_ctx.stringValue("DescribeLicenseOrdersResponse.Items["+ i +"].Engine"));
			licenseOrder.setGmtCreated(_ctx.stringValue("DescribeLicenseOrdersResponse.Items["+ i +"].GmtCreated"));
			licenseOrder.setGmtModified(_ctx.stringValue("DescribeLicenseOrdersResponse.Items["+ i +"].GmtModified"));
			licenseOrder.setIsVirtualOrder(_ctx.booleanValue("DescribeLicenseOrdersResponse.Items["+ i +"].IsVirtualOrder"));
			licenseOrder.setIsVirtualOrderFrozen(_ctx.booleanValue("DescribeLicenseOrdersResponse.Items["+ i +"].IsVirtualOrderFrozen"));
			licenseOrder.setPackageType(_ctx.stringValue("DescribeLicenseOrdersResponse.Items["+ i +"].PackageType"));
			licenseOrder.setPackageValidity(_ctx.stringValue("DescribeLicenseOrdersResponse.Items["+ i +"].PackageValidity"));
			licenseOrder.setPurchaseChannel(_ctx.stringValue("DescribeLicenseOrdersResponse.Items["+ i +"].PurchaseChannel"));
			licenseOrder.setVirtualAliyunOrderId(_ctx.stringValue("DescribeLicenseOrdersResponse.Items["+ i +"].VirtualAliyunOrderId"));

			items.add(licenseOrder);
		}
		describeLicenseOrdersResponse.setItems(items);
	 
	 	return describeLicenseOrdersResponse;
	}
}