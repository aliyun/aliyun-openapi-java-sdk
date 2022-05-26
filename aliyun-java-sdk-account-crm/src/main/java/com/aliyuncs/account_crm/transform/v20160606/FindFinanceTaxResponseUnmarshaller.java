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

package com.aliyuncs.account_crm.transform.v20160606;

import com.aliyuncs.account_crm.model.v20160606.FindFinanceTaxResponse;
import com.aliyuncs.account_crm.model.v20160606.FindFinanceTaxResponse.FinanceVersion;
import com.aliyuncs.transform.UnmarshallerContext;


public class FindFinanceTaxResponseUnmarshaller {

	public static FindFinanceTaxResponse unmarshall(FindFinanceTaxResponse findFinanceTaxResponse, UnmarshallerContext _ctx) {
		
		findFinanceTaxResponse.setRequestId(_ctx.stringValue("FindFinanceTaxResponse.RequestId"));
		findFinanceTaxResponse.setCode(_ctx.stringValue("FindFinanceTaxResponse.Code"));
		findFinanceTaxResponse.setMessage(_ctx.stringValue("FindFinanceTaxResponse.Message"));
		findFinanceTaxResponse.setSuccess(_ctx.booleanValue("FindFinanceTaxResponse.Success"));

		FinanceVersion financeVersion = new FinanceVersion();
		financeVersion.setFinanceTaxCertificateImgName(_ctx.stringValue("FindFinanceTaxResponse.FinanceVersion.FinanceTaxCertificateImgName"));
		financeVersion.setVersion(_ctx.stringValue("FindFinanceTaxResponse.FinanceVersion.Version"));
		financeVersion.setFinanceTaxCertificateImgUrl(_ctx.stringValue("FindFinanceTaxResponse.FinanceVersion.FinanceTaxCertificateImgUrl"));
		financeVersion.setSecondFinanceTaxCertificateImgUrl(_ctx.stringValue("FindFinanceTaxResponse.FinanceVersion.SecondFinanceTaxCertificateImgUrl"));
		financeVersion.setTax(_ctx.stringValue("FindFinanceTaxResponse.FinanceVersion.Tax"));
		financeVersion.setSecondFinanceTax(_ctx.stringValue("FindFinanceTaxResponse.FinanceVersion.SecondFinanceTax"));
		financeVersion.setSecondFinanceTaxCertificateImgName(_ctx.stringValue("FindFinanceTaxResponse.FinanceVersion.SecondFinanceTaxCertificateImgName"));
		findFinanceTaxResponse.setFinanceVersion(financeVersion);
	 
	 	return findFinanceTaxResponse;
	}
}