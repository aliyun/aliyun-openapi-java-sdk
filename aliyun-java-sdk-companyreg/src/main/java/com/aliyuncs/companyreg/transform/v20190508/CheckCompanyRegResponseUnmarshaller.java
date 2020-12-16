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

import com.aliyuncs.companyreg.model.v20190508.CheckCompanyRegResponse;
import com.aliyuncs.companyreg.model.v20190508.CheckCompanyRegResponse.Company;
import com.aliyuncs.transform.UnmarshallerContext;


public class CheckCompanyRegResponseUnmarshaller {

	public static CheckCompanyRegResponse unmarshall(CheckCompanyRegResponse checkCompanyRegResponse, UnmarshallerContext _ctx) {
		
		checkCompanyRegResponse.setRequestId(_ctx.stringValue("CheckCompanyRegResponse.RequestId"));
		checkCompanyRegResponse.setMatchCity(_ctx.stringValue("CheckCompanyRegResponse.MatchCity"));
		checkCompanyRegResponse.setMatchBrand(_ctx.stringValue("CheckCompanyRegResponse.MatchBrand"));
		checkCompanyRegResponse.setMatchSensitive(_ctx.stringValue("CheckCompanyRegResponse.MatchSensitive"));
		checkCompanyRegResponse.setLevel(_ctx.stringValue("CheckCompanyRegResponse.Level"));

		List<Company> similarCompanies = new ArrayList<Company>();
		for (int i = 0; i < _ctx.lengthValue("CheckCompanyRegResponse.SimilarCompanies.Length"); i++) {
			Company company = new Company();
			company.setCompanyName(_ctx.stringValue("CheckCompanyRegResponse.SimilarCompanies["+ i +"].CompanyName"));
			company.setLevel(_ctx.stringValue("CheckCompanyRegResponse.SimilarCompanies["+ i +"].Level"));

			similarCompanies.add(company);
		}
		checkCompanyRegResponse.setSimilarCompanies(similarCompanies);
	 
	 	return checkCompanyRegResponse;
	}
}