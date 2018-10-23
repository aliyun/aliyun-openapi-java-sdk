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

package com.aliyuncs.finmall.transform.v20180723;

import com.aliyuncs.finmall.model.v20180723.GetCreditSignatureInfoResponse;
import com.aliyuncs.finmall.model.v20180723.GetCreditSignatureInfoResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetCreditSignatureInfoResponseUnmarshaller {

	public static GetCreditSignatureInfoResponse unmarshall(GetCreditSignatureInfoResponse getCreditSignatureInfoResponse, UnmarshallerContext context) {
		
		getCreditSignatureInfoResponse.setRequestId(context.stringValue("GetCreditSignatureInfoResponse.RequestId"));
		getCreditSignatureInfoResponse.setCode(context.stringValue("GetCreditSignatureInfoResponse.Code"));
		getCreditSignatureInfoResponse.setMessage(context.stringValue("GetCreditSignatureInfoResponse.Message"));

		Data data = new Data();
		data.setCreditId(context.stringValue("GetCreditSignatureInfoResponse.Data.CreditId"));
		data.setAgreementId(context.stringValue("GetCreditSignatureInfoResponse.Data.AgreementId"));
		data.setAgreementNo(context.stringValue("GetCreditSignatureInfoResponse.Data.AgreementNo"));
		data.setAgreementTitle(context.stringValue("GetCreditSignatureInfoResponse.Data.AgreementTitle"));
		data.setSignType(context.stringValue("GetCreditSignatureInfoResponse.Data.SignType"));
		data.setAgreementSigners(context.stringValue("GetCreditSignatureInfoResponse.Data.AgreementSigners"));
		data.setAgreementPath(context.stringValue("GetCreditSignatureInfoResponse.Data.AgreementPath"));
		data.setSignState(context.stringValue("GetCreditSignatureInfoResponse.Data.SignState"));
		getCreditSignatureInfoResponse.setData(data);
	 
	 	return getCreditSignatureInfoResponse;
	}
}