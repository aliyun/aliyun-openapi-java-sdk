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

import com.aliyuncs.ocr.model.v20191230.RecognizeBusinessCardResponse;
import com.aliyuncs.ocr.model.v20191230.RecognizeBusinessCardResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class RecognizeBusinessCardResponseUnmarshaller {

	public static RecognizeBusinessCardResponse unmarshall(RecognizeBusinessCardResponse recognizeBusinessCardResponse, UnmarshallerContext _ctx) {
		
		recognizeBusinessCardResponse.setRequestId(_ctx.stringValue("RecognizeBusinessCardResponse.RequestId"));

		Data data = new Data();
		data.setName(_ctx.stringValue("RecognizeBusinessCardResponse.Data.Name"));

		List<String> companies = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("RecognizeBusinessCardResponse.Data.Companies.Length"); i++) {
			companies.add(_ctx.stringValue("RecognizeBusinessCardResponse.Data.Companies["+ i +"]"));
		}
		data.setCompanies(companies);

		List<String> departments = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("RecognizeBusinessCardResponse.Data.Departments.Length"); i++) {
			departments.add(_ctx.stringValue("RecognizeBusinessCardResponse.Data.Departments["+ i +"]"));
		}
		data.setDepartments(departments);

		List<String> titles = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("RecognizeBusinessCardResponse.Data.Titles.Length"); i++) {
			titles.add(_ctx.stringValue("RecognizeBusinessCardResponse.Data.Titles["+ i +"]"));
		}
		data.setTitles(titles);

		List<String> cellPhoneNumbers = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("RecognizeBusinessCardResponse.Data.CellPhoneNumbers.Length"); i++) {
			cellPhoneNumbers.add(_ctx.stringValue("RecognizeBusinessCardResponse.Data.CellPhoneNumbers["+ i +"]"));
		}
		data.setCellPhoneNumbers(cellPhoneNumbers);

		List<String> officePhoneNumbers = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("RecognizeBusinessCardResponse.Data.OfficePhoneNumbers.Length"); i++) {
			officePhoneNumbers.add(_ctx.stringValue("RecognizeBusinessCardResponse.Data.OfficePhoneNumbers["+ i +"]"));
		}
		data.setOfficePhoneNumbers(officePhoneNumbers);

		List<String> addresses = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("RecognizeBusinessCardResponse.Data.Addresses.Length"); i++) {
			addresses.add(_ctx.stringValue("RecognizeBusinessCardResponse.Data.Addresses["+ i +"]"));
		}
		data.setAddresses(addresses);

		List<String> emails = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("RecognizeBusinessCardResponse.Data.Emails.Length"); i++) {
			emails.add(_ctx.stringValue("RecognizeBusinessCardResponse.Data.Emails["+ i +"]"));
		}
		data.setEmails(emails);
		recognizeBusinessCardResponse.setData(data);
	 
	 	return recognizeBusinessCardResponse;
	}
}