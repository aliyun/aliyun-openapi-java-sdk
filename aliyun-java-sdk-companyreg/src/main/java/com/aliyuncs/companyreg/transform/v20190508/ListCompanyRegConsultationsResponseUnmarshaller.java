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

	public static ListCompanyRegConsultationsResponse unmarshall(ListCompanyRegConsultationsResponse listCompanyRegConsultationsResponse, UnmarshallerContext context) {
		
		listCompanyRegConsultationsResponse.setRequestId(context.stringValue("ListCompanyRegConsultationsResponse.RequestId"));
		listCompanyRegConsultationsResponse.setTotalItemNum(context.integerValue("ListCompanyRegConsultationsResponse.TotalItemNum"));
		listCompanyRegConsultationsResponse.setCurrentPageNum(context.integerValue("ListCompanyRegConsultationsResponse.CurrentPageNum"));
		listCompanyRegConsultationsResponse.setPageSize(context.integerValue("ListCompanyRegConsultationsResponse.PageSize"));
		listCompanyRegConsultationsResponse.setTotalPageNum(context.integerValue("ListCompanyRegConsultationsResponse.TotalPageNum"));
		listCompanyRegConsultationsResponse.setPrePage(context.booleanValue("ListCompanyRegConsultationsResponse.PrePage"));
		listCompanyRegConsultationsResponse.setNextPage(context.booleanValue("ListCompanyRegConsultationsResponse.NextPage"));

		List<CompanyRegConsultation> data = new ArrayList<CompanyRegConsultation>();
		for (int i = 0; i < context.lengthValue("ListCompanyRegConsultationsResponse.Data.Length"); i++) {
			CompanyRegConsultation companyRegConsultation = new CompanyRegConsultation();
			companyRegConsultation.setBizId(context.stringValue("ListCompanyRegConsultationsResponse.Data["+ i +"].BizId"));
			companyRegConsultation.setConsultInfo(context.stringValue("ListCompanyRegConsultationsResponse.Data["+ i +"].ConsultInfo"));
			companyRegConsultation.setGmtModified(context.longValue("ListCompanyRegConsultationsResponse.Data["+ i +"].GmtModified"));
			companyRegConsultation.setCity(context.stringValue("ListCompanyRegConsultationsResponse.Data["+ i +"].City"));

			data.add(companyRegConsultation);
		}
		listCompanyRegConsultationsResponse.setData(data);
	 
	 	return listCompanyRegConsultationsResponse;
	}
}