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

package com.aliyuncs.bssopenapi.transform.v20171214;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.bssopenapi.model.v20171214.QueryInvoicingCustomerListResponse;
import com.aliyuncs.bssopenapi.model.v20171214.QueryInvoicingCustomerListResponse.Data;
import com.aliyuncs.bssopenapi.model.v20171214.QueryInvoicingCustomerListResponse.Data.CustomerInvoice;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryInvoicingCustomerListResponseUnmarshaller {

	public static QueryInvoicingCustomerListResponse unmarshall(QueryInvoicingCustomerListResponse queryInvoicingCustomerListResponse, UnmarshallerContext context) {
		
		queryInvoicingCustomerListResponse.setRequestId(context.stringValue("QueryInvoicingCustomerListResponse.RequestId"));
		queryInvoicingCustomerListResponse.setSuccess(context.booleanValue("QueryInvoicingCustomerListResponse.Success"));
		queryInvoicingCustomerListResponse.setCode(context.stringValue("QueryInvoicingCustomerListResponse.Code"));
		queryInvoicingCustomerListResponse.setMessage(context.stringValue("QueryInvoicingCustomerListResponse.Message"));

		Data data = new Data();

		List<CustomerInvoice> customerInvoiceList = new ArrayList<CustomerInvoice>();
		for (int i = 0; i < context.lengthValue("QueryInvoicingCustomerListResponse.Data.CustomerInvoiceList.Length"); i++) {
			CustomerInvoice customerInvoice = new CustomerInvoice();
			customerInvoice.setId(context.longValue("QueryInvoicingCustomerListResponse.Data.CustomerInvoiceList["+ i +"].Id"));
			customerInvoice.setUserId(context.longValue("QueryInvoicingCustomerListResponse.Data.CustomerInvoiceList["+ i +"].UserId"));
			customerInvoice.setUserNick(context.stringValue("QueryInvoicingCustomerListResponse.Data.CustomerInvoiceList["+ i +"].UserNick"));
			customerInvoice.setInvoiceTitle(context.stringValue("QueryInvoicingCustomerListResponse.Data.CustomerInvoiceList["+ i +"].InvoiceTitle"));
			customerInvoice.setCustomerType(context.longValue("QueryInvoicingCustomerListResponse.Data.CustomerInvoiceList["+ i +"].CustomerType"));
			customerInvoice.setTaxpayerType(context.longValue("QueryInvoicingCustomerListResponse.Data.CustomerInvoiceList["+ i +"].TaxpayerType"));
			customerInvoice.setBank(context.stringValue("QueryInvoicingCustomerListResponse.Data.CustomerInvoiceList["+ i +"].Bank"));
			customerInvoice.setBankNo(context.stringValue("QueryInvoicingCustomerListResponse.Data.CustomerInvoiceList["+ i +"].BankNo"));
			customerInvoice.setOperatingLicenseAddress(context.stringValue("QueryInvoicingCustomerListResponse.Data.CustomerInvoiceList["+ i +"].OperatingLicenseAddress"));
			customerInvoice.setOperatingLicensePhone(context.stringValue("QueryInvoicingCustomerListResponse.Data.CustomerInvoiceList["+ i +"].OperatingLicensePhone"));
			customerInvoice.setRegisterNo(context.stringValue("QueryInvoicingCustomerListResponse.Data.CustomerInvoiceList["+ i +"].RegisterNo"));
			customerInvoice.setStartCycle(context.longValue("QueryInvoicingCustomerListResponse.Data.CustomerInvoiceList["+ i +"].StartCycle"));
			customerInvoice.setStatus(context.longValue("QueryInvoicingCustomerListResponse.Data.CustomerInvoiceList["+ i +"].Status"));
			customerInvoice.setGmtCreate(context.stringValue("QueryInvoicingCustomerListResponse.Data.CustomerInvoiceList["+ i +"].GmtCreate"));
			customerInvoice.setTaxationLicense(context.stringValue("QueryInvoicingCustomerListResponse.Data.CustomerInvoiceList["+ i +"].TaxationLicense"));
			customerInvoice.setAdjustType(context.longValue("QueryInvoicingCustomerListResponse.Data.CustomerInvoiceList["+ i +"].AdjustType"));
			customerInvoice.setEndCycle(context.longValue("QueryInvoicingCustomerListResponse.Data.CustomerInvoiceList["+ i +"].EndCycle"));
			customerInvoice.setTitleChangeInstructions(context.stringValue("QueryInvoicingCustomerListResponse.Data.CustomerInvoiceList["+ i +"].TitleChangeInstructions"));
			customerInvoice.setIssueType(context.longValue("QueryInvoicingCustomerListResponse.Data.CustomerInvoiceList["+ i +"].IssueType"));
			customerInvoice.setType(context.longValue("QueryInvoicingCustomerListResponse.Data.CustomerInvoiceList["+ i +"].Type"));
			customerInvoice.setDefaultRemark(context.stringValue("QueryInvoicingCustomerListResponse.Data.CustomerInvoiceList["+ i +"].DefaultRemark"));

			customerInvoiceList.add(customerInvoice);
		}
		data.setCustomerInvoiceList(customerInvoiceList);
		queryInvoicingCustomerListResponse.setData(data);
	 
	 	return queryInvoicingCustomerListResponse;
	}
}