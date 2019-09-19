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

import com.aliyuncs.companyreg.model.v20190508.ListCompanyRegConsultationsResponse;
import com.aliyuncs.companyreg.model.v20190508.ListCompanyRegConsultationsResponse.CompanyRegConsultation;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListCompanyRegConsultationsResponseUnmarshaller {

	public static ListCompanyRegConsultationsResponse unmarshall(ListCompanyRegConsultationsResponse listCompanyRegConsultationsResponse, UnmarshallerContext _ctx) {
		
		listCompanyRegConsultationsResponse.setRequestId(_ctx.stringValue("ListCompanyRegConsultationsResponse.RequestId"));
		listCompanyRegConsultationsResponse.setTotalItemNum(_ctx.integerValue("ListCompanyRegConsultationsResponse.TotalItemNum"));
		listCompanyRegConsultationsResponse.setCurrentPageNum(_ctx.integerValue("ListCompanyRegConsultationsResponse.CurrentPageNum"));
		listCompanyRegConsultationsResponse.setPageSize(_ctx.integerValue("ListCompanyRegConsultationsResponse.PageSize"));
		listCompanyRegConsultationsResponse.setTotalPageNum(_ctx.integerValue("ListCompanyRegConsultationsResponse.TotalPageNum"));
		listCompanyRegConsultationsResponse.setPrePage(_ctx.booleanValue("ListCompanyRegConsultationsResponse.PrePage"));
		listCompanyRegConsultationsResponse.setNextPage(_ctx.booleanValue("ListCompanyRegConsultationsResponse.NextPage"));

		List<CompanyRegConsultation> data = new ArrayList<CompanyRegConsultation>();
		for (int i = 0; i < _ctx.lengthValue("ListCompanyRegConsultationsResponse.Data.Length"); i++) {
			CompanyRegConsultation companyRegConsultation = new CompanyRegConsultation();
			companyRegConsultation.setBizId(_ctx.stringValue("ListCompanyRegConsultationsResponse.Data["+ i +"].BizId"));
			companyRegConsultation.setConsultInfo(_ctx.stringValue("ListCompanyRegConsultationsResponse.Data["+ i +"].ConsultInfo"));
			companyRegConsultation.setGmtModified(_ctx.longValue("ListCompanyRegConsultationsResponse.Data["+ i +"].GmtModified"));
			companyRegConsultation.setCity(_ctx.stringValue("ListCompanyRegConsultationsResponse.Data["+ i +"].City"));
			companyRegConsultation.setPlatformName(_ctx.stringValue("ListCompanyRegConsultationsResponse.Data["+ i +"].PlatformName"));
			companyRegConsultation.setInboundPhone(_ctx.stringValue("ListCompanyRegConsultationsResponse.Data["+ i +"].InboundPhone"));
			companyRegConsultation.setOutboundPhone(_ctx.stringValue("ListCompanyRegConsultationsResponse.Data["+ i +"].OutboundPhone"));

			data.add(companyRegConsultation);
		}
		listCompanyRegConsultationsResponse.setData(data);
	 
	 	return listCompanyRegConsultationsResponse;
	}
}