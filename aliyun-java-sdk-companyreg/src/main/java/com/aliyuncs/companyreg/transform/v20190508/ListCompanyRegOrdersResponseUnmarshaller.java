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

package com.aliyuncs.companyreg.transform.v20190508;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.companyreg.model.v20190508.ListCompanyRegOrdersResponse;
import com.aliyuncs.companyreg.model.v20190508.ListCompanyRegOrdersResponse.CompanyRegOrder;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListCompanyRegOrdersResponseUnmarshaller {

	public static ListCompanyRegOrdersResponse unmarshall(ListCompanyRegOrdersResponse listCompanyRegOrdersResponse, UnmarshallerContext _ctx) {
		
		listCompanyRegOrdersResponse.setRequestId(_ctx.stringValue("ListCompanyRegOrdersResponse.RequestId"));
		listCompanyRegOrdersResponse.setTotalItemNum(_ctx.integerValue("ListCompanyRegOrdersResponse.TotalItemNum"));
		listCompanyRegOrdersResponse.setCurrentPageNum(_ctx.integerValue("ListCompanyRegOrdersResponse.CurrentPageNum"));
		listCompanyRegOrdersResponse.setPageSize(_ctx.integerValue("ListCompanyRegOrdersResponse.PageSize"));
		listCompanyRegOrdersResponse.setTotalPageNum(_ctx.integerValue("ListCompanyRegOrdersResponse.TotalPageNum"));
		listCompanyRegOrdersResponse.setPrePage(_ctx.booleanValue("ListCompanyRegOrdersResponse.PrePage"));
		listCompanyRegOrdersResponse.setNextPage(_ctx.booleanValue("ListCompanyRegOrdersResponse.NextPage"));

		List<CompanyRegOrder> data = new ArrayList<CompanyRegOrder>();
		for (int i = 0; i < _ctx.lengthValue("ListCompanyRegOrdersResponse.Data.Length"); i++) {
			CompanyRegOrder companyRegOrder = new CompanyRegOrder();
			companyRegOrder.setBizId(_ctx.stringValue("ListCompanyRegOrdersResponse.Data["+ i +"].BizId"));
			companyRegOrder.setCompanyName(_ctx.stringValue("ListCompanyRegOrdersResponse.Data["+ i +"].CompanyName"));
			companyRegOrder.setBizStatus(_ctx.stringValue("ListCompanyRegOrdersResponse.Data["+ i +"].BizStatus"));
			companyRegOrder.setBizInfo(_ctx.stringValue("ListCompanyRegOrdersResponse.Data["+ i +"].BizInfo"));
			companyRegOrder.setSupplementBizInfo(_ctx.stringValue("ListCompanyRegOrdersResponse.Data["+ i +"].SupplementBizInfo"));
			companyRegOrder.setAliyunOrderId(_ctx.stringValue("ListCompanyRegOrdersResponse.Data["+ i +"].AliyunOrderId"));
			companyRegOrder.setGmtModified(_ctx.longValue("ListCompanyRegOrdersResponse.Data["+ i +"].GmtModified"));
			companyRegOrder.setExtend(_ctx.stringValue("ListCompanyRegOrdersResponse.Data["+ i +"].Extend"));
			companyRegOrder.setBizSubCode(_ctx.stringValue("ListCompanyRegOrdersResponse.Data["+ i +"].BizSubCode"));

			data.add(companyRegOrder);
		}
		listCompanyRegOrdersResponse.setData(data);
	 
	 	return listCompanyRegOrdersResponse;
	}
}