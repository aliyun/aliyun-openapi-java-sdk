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

package com.aliyuncs.ocr.transform.v20191230;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ocr.model.v20191230.RecognizeStructuredTaxiInvoicesResponse;
import com.aliyuncs.ocr.model.v20191230.RecognizeStructuredTaxiInvoicesResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class RecognizeStructuredTaxiInvoicesResponseUnmarshaller {

	public static RecognizeStructuredTaxiInvoicesResponse unmarshall(RecognizeStructuredTaxiInvoicesResponse recognizeStructuredTaxiInvoicesResponse, UnmarshallerContext _ctx) {
		
		recognizeStructuredTaxiInvoicesResponse.setRequestId(_ctx.stringValue("RecognizeStructuredTaxiInvoicesResponse.RequestId"));

		Data data = new Data();
		data.setName(_ctx.stringValue("RecognizeStructuredTaxiInvoicesResponse.Data.Name"));

		List<String> companies = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("RecognizeStructuredTaxiInvoicesResponse.Data.Companies.Length"); i++) {
			companies.add(_ctx.stringValue("RecognizeStructuredTaxiInvoicesResponse.Data.Companies["+ i +"]"));
		}
		data.setCompanies(companies);

		List<String> titles = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("RecognizeStructuredTaxiInvoicesResponse.Data.Titles.Length"); i++) {
			titles.add(_ctx.stringValue("RecognizeStructuredTaxiInvoicesResponse.Data.Titles["+ i +"]"));
		}
		data.setTitles(titles);

		List<String> emails = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("RecognizeStructuredTaxiInvoicesResponse.Data.Emails.Length"); i++) {
			emails.add(_ctx.stringValue("RecognizeStructuredTaxiInvoicesResponse.Data.Emails["+ i +"]"));
		}
		data.setEmails(emails);

		List<String> departments = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("RecognizeStructuredTaxiInvoicesResponse.Data.Departments.Length"); i++) {
			departments.add(_ctx.stringValue("RecognizeStructuredTaxiInvoicesResponse.Data.Departments["+ i +"]"));
		}
		data.setDepartments(departments);

		List<String> officePhoneNumbers = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("RecognizeStructuredTaxiInvoicesResponse.Data.OfficePhoneNumbers.Length"); i++) {
			officePhoneNumbers.add(_ctx.stringValue("RecognizeStructuredTaxiInvoicesResponse.Data.OfficePhoneNumbers["+ i +"]"));
		}
		data.setOfficePhoneNumbers(officePhoneNumbers);

		List<String> cellPhoneNumbers = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("RecognizeStructuredTaxiInvoicesResponse.Data.CellPhoneNumbers.Length"); i++) {
			cellPhoneNumbers.add(_ctx.stringValue("RecognizeStructuredTaxiInvoicesResponse.Data.CellPhoneNumbers["+ i +"]"));
		}
		data.setCellPhoneNumbers(cellPhoneNumbers);

		List<String> addresses = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("RecognizeStructuredTaxiInvoicesResponse.Data.Addresses.Length"); i++) {
			addresses.add(_ctx.stringValue("RecognizeStructuredTaxiInvoicesResponse.Data.Addresses["+ i +"]"));
		}
		data.setAddresses(addresses);
		recognizeStructuredTaxiInvoicesResponse.setData(data);
	 
	 	return recognizeStructuredTaxiInvoicesResponse;
	}
}