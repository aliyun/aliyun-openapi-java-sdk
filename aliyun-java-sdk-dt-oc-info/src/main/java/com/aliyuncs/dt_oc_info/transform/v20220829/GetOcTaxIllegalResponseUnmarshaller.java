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

import com.aliyuncs.dt_oc_info.model.v20220829.GetOcTaxIllegalResponse;
import com.aliyuncs.dt_oc_info.model.v20220829.GetOcTaxIllegalResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetOcTaxIllegalResponseUnmarshaller {

	public static GetOcTaxIllegalResponse unmarshall(GetOcTaxIllegalResponse getOcTaxIllegalResponse, UnmarshallerContext _ctx) {
		
		getOcTaxIllegalResponse.setRequestId(_ctx.stringValue("GetOcTaxIllegalResponse.RequestId"));
		getOcTaxIllegalResponse.setCode(_ctx.stringValue("GetOcTaxIllegalResponse.Code"));
		getOcTaxIllegalResponse.setSuccess(_ctx.booleanValue("GetOcTaxIllegalResponse.Success"));
		getOcTaxIllegalResponse.setMessage(_ctx.stringValue("GetOcTaxIllegalResponse.Message"));
		getOcTaxIllegalResponse.setTotalNum(_ctx.integerValue("GetOcTaxIllegalResponse.TotalNum"));
		getOcTaxIllegalResponse.setPageIndex(_ctx.integerValue("GetOcTaxIllegalResponse.PageIndex"));
		getOcTaxIllegalResponse.setPageNum(_ctx.integerValue("GetOcTaxIllegalResponse.PageNum"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("GetOcTaxIllegalResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setEntName(_ctx.stringValue("GetOcTaxIllegalResponse.Data["+ i +"].EntName"));
			dataItem.setTaxpayerNum(_ctx.stringValue("GetOcTaxIllegalResponse.Data["+ i +"].TaxpayerNum"));
			dataItem.setOrgCode(_ctx.stringValue("GetOcTaxIllegalResponse.Data["+ i +"].OrgCode"));
			dataItem.setEntAddress(_ctx.stringValue("GetOcTaxIllegalResponse.Data["+ i +"].EntAddress"));
			dataItem.setCaseType(_ctx.stringValue("GetOcTaxIllegalResponse.Data["+ i +"].CaseType"));
			dataItem.setIllegalTruth(_ctx.stringValue("GetOcTaxIllegalResponse.Data["+ i +"].IllegalTruth"));
			dataItem.setPublishDate(_ctx.stringValue("GetOcTaxIllegalResponse.Data["+ i +"].PublishDate"));
			dataItem.setLawBasis(_ctx.stringValue("GetOcTaxIllegalResponse.Data["+ i +"].LawBasis"));
			dataItem.setDepartment(_ctx.stringValue("GetOcTaxIllegalResponse.Data["+ i +"].Department"));
			dataItem.setLegalName(_ctx.stringValue("GetOcTaxIllegalResponse.Data["+ i +"].LegalName"));
			dataItem.setLegalSex(_ctx.stringValue("GetOcTaxIllegalResponse.Data["+ i +"].LegalSex"));
			dataItem.setLegalCardType(_ctx.stringValue("GetOcTaxIllegalResponse.Data["+ i +"].LegalCardType"));
			dataItem.setLegalCardNum(_ctx.stringValue("GetOcTaxIllegalResponse.Data["+ i +"].LegalCardNum"));
			dataItem.setFinancialName(_ctx.stringValue("GetOcTaxIllegalResponse.Data["+ i +"].FinancialName"));
			dataItem.setFinancialSex(_ctx.stringValue("GetOcTaxIllegalResponse.Data["+ i +"].FinancialSex"));
			dataItem.setFinancialCardType(_ctx.stringValue("GetOcTaxIllegalResponse.Data["+ i +"].FinancialCardType"));
			dataItem.setFinancialCardNum(_ctx.stringValue("GetOcTaxIllegalResponse.Data["+ i +"].FinancialCardNum"));
			dataItem.setAgencyEnt(_ctx.stringValue("GetOcTaxIllegalResponse.Data["+ i +"].AgencyEnt"));
			dataItem.setAgencyName(_ctx.stringValue("GetOcTaxIllegalResponse.Data["+ i +"].AgencyName"));
			dataItem.setAgencySex(_ctx.stringValue("GetOcTaxIllegalResponse.Data["+ i +"].AgencySex"));
			dataItem.setAgencyCardType(_ctx.stringValue("GetOcTaxIllegalResponse.Data["+ i +"].AgencyCardType"));
			dataItem.setAgencyCardNum(_ctx.stringValue("GetOcTaxIllegalResponse.Data["+ i +"].AgencyCardNum"));

			data.add(dataItem);
		}
		getOcTaxIllegalResponse.setData(data);
	 
	 	return getOcTaxIllegalResponse;
	}
}