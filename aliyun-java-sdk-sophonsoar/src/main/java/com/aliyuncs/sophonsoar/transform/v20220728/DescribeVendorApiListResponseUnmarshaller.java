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

package com.aliyuncs.sophonsoar.transform.v20220728;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sophonsoar.model.v20220728.DescribeVendorApiListResponse;
import com.aliyuncs.sophonsoar.model.v20220728.DescribeVendorApiListResponse.Data;
import com.aliyuncs.sophonsoar.model.v20220728.DescribeVendorApiListResponse.Page;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeVendorApiListResponseUnmarshaller {

	public static DescribeVendorApiListResponse unmarshall(DescribeVendorApiListResponse describeVendorApiListResponse, UnmarshallerContext _ctx) {
		
		describeVendorApiListResponse.setRequestId(_ctx.stringValue("DescribeVendorApiListResponse.RequestId"));

		Page page = new Page();
		page.setTotalCount(_ctx.longValue("DescribeVendorApiListResponse.Page.TotalCount"));
		page.setPageNumber(_ctx.longValue("DescribeVendorApiListResponse.Page.PageNumber"));
		page.setPageSize(_ctx.integerValue("DescribeVendorApiListResponse.Page.PageSize"));
		describeVendorApiListResponse.setPage(page);

		List<Data> apiList = new ArrayList<Data>();
		for (int i = 0; i < _ctx.lengthValue("DescribeVendorApiListResponse.ApiList.Length"); i++) {
			Data data = new Data();
			data.setVendorCode(_ctx.stringValue("DescribeVendorApiListResponse.ApiList["+ i +"].VendorCode"));
			data.setProductCode(_ctx.stringValue("DescribeVendorApiListResponse.ApiList["+ i +"].ProductCode"));
			data.setProductName(_ctx.stringValue("DescribeVendorApiListResponse.ApiList["+ i +"].ProductName"));
			data.setParameter(_ctx.stringValue("DescribeVendorApiListResponse.ApiList["+ i +"].Parameter"));
			data.setProductDomain(_ctx.stringValue("DescribeVendorApiListResponse.ApiList["+ i +"].ProductDomain"));
			data.setBizProtocol(_ctx.stringValue("DescribeVendorApiListResponse.ApiList["+ i +"].Protocol"));
			data.setBizMethod(_ctx.stringValue("DescribeVendorApiListResponse.ApiList["+ i +"].Method"));
			data.setApiName(_ctx.stringValue("DescribeVendorApiListResponse.ApiList["+ i +"].ApiName"));
			data.setNeedPageInfo(_ctx.booleanValue("DescribeVendorApiListResponse.ApiList["+ i +"].NeedPageInfo"));
			data.setPageInfo(_ctx.stringValue("DescribeVendorApiListResponse.ApiList["+ i +"].PageInfo"));
			data.setApiVersion(_ctx.stringValue("DescribeVendorApiListResponse.ApiList["+ i +"].ApiVersion"));
			data.setNeedAdvanceConfig(_ctx.booleanValue("DescribeVendorApiListResponse.ApiList["+ i +"].NeedAdvanceConfig"));
			data.setAdvanceConfig(_ctx.stringValue("DescribeVendorApiListResponse.ApiList["+ i +"].AdvanceConfig"));

			apiList.add(data);
		}
		describeVendorApiListResponse.setApiList(apiList);
	 
	 	return describeVendorApiListResponse;
	}
}