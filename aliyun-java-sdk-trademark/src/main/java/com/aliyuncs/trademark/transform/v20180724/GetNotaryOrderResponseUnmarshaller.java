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

package com.aliyuncs.trademark.transform.v20180724;

import com.aliyuncs.trademark.model.v20180724.GetNotaryOrderResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetNotaryOrderResponseUnmarshaller {

	public static GetNotaryOrderResponse unmarshall(GetNotaryOrderResponse getNotaryOrderResponse, UnmarshallerContext context) {
		
		getNotaryOrderResponse.setRequestId(context.stringValue("GetNotaryOrderResponse.RequestId"));
		getNotaryOrderResponse.setNotaryOrderId(context.longValue("GetNotaryOrderResponse.NotaryOrderId"));
		getNotaryOrderResponse.setAliyunOrderId(context.stringValue("GetNotaryOrderResponse.AliyunOrderId"));
		getNotaryOrderResponse.setTmRegisterNo(context.stringValue("GetNotaryOrderResponse.TmRegisterNo"));
		getNotaryOrderResponse.setTmName(context.stringValue("GetNotaryOrderResponse.TmName"));
		getNotaryOrderResponse.setTmImage(context.stringValue("GetNotaryOrderResponse.TmImage"));
		getNotaryOrderResponse.setTmClassification(context.stringValue("GetNotaryOrderResponse.TmClassification"));
		getNotaryOrderResponse.setOrderPrice(context.floatValue("GetNotaryOrderResponse.OrderPrice"));
		getNotaryOrderResponse.setNotaryStatus(context.integerValue("GetNotaryOrderResponse.NotaryStatus"));
		getNotaryOrderResponse.setType(context.stringValue("GetNotaryOrderResponse.Type"));
		getNotaryOrderResponse.setName(context.stringValue("GetNotaryOrderResponse.Name"));
		getNotaryOrderResponse.setPhone(context.stringValue("GetNotaryOrderResponse.Phone"));
		getNotaryOrderResponse.setSellerCompanyName(context.stringValue("GetNotaryOrderResponse.SellerCompanyName"));
		getNotaryOrderResponse.setBusinessLicenseId(context.stringValue("GetNotaryOrderResponse.BusinessLicenseId"));
		getNotaryOrderResponse.setLegalPersonName(context.stringValue("GetNotaryOrderResponse.LegalPersonName"));
		getNotaryOrderResponse.setLegalPersonPhone(context.stringValue("GetNotaryOrderResponse.LegalPersonPhone"));
		getNotaryOrderResponse.setLegalPersonIdCard(context.stringValue("GetNotaryOrderResponse.LegalPersonIdCard"));
		getNotaryOrderResponse.setCompanyContactName(context.stringValue("GetNotaryOrderResponse.CompanyContactName"));
		getNotaryOrderResponse.setCompanyContactPhone(context.stringValue("GetNotaryOrderResponse.CompanyContactPhone"));
		getNotaryOrderResponse.setTmRegisterCertificate(context.stringValue("GetNotaryOrderResponse.TmRegisterCertificate"));
		getNotaryOrderResponse.setBusinessLicense(context.stringValue("GetNotaryOrderResponse.BusinessLicense"));
		getNotaryOrderResponse.setTmAcceptCertificate(context.stringValue("GetNotaryOrderResponse.TmAcceptCertificate"));
		getNotaryOrderResponse.setSellerFrontOfIdCard(context.stringValue("GetNotaryOrderResponse.SellerFrontOfIdCard"));
		getNotaryOrderResponse.setSellerBackOfIdCard(context.stringValue("GetNotaryOrderResponse.SellerBackOfIdCard"));
		getNotaryOrderResponse.setTmRegisterChangeCertificate(context.stringValue("GetNotaryOrderResponse.TmRegisterChangeCertificate"));
		getNotaryOrderResponse.setReceiverName(context.stringValue("GetNotaryOrderResponse.ReceiverName"));
		getNotaryOrderResponse.setReceiverAddress(context.stringValue("GetNotaryOrderResponse.ReceiverAddress"));
		getNotaryOrderResponse.setReceiverPhone(context.stringValue("GetNotaryOrderResponse.ReceiverPhone"));
		getNotaryOrderResponse.setReceiverPostalCode(context.stringValue("GetNotaryOrderResponse.ReceiverPostalCode"));
		getNotaryOrderResponse.setOrderDate(context.longValue("GetNotaryOrderResponse.OrderDate"));
		getNotaryOrderResponse.setNotaryAcceptDate(context.longValue("GetNotaryOrderResponse.NotaryAcceptDate"));
		getNotaryOrderResponse.setNotarySucceedDate(context.longValue("GetNotaryOrderResponse.NotarySucceedDate"));
		getNotaryOrderResponse.setNotaryFailedDate(context.longValue("GetNotaryOrderResponse.NotaryFailedDate"));
		getNotaryOrderResponse.setNotaryFailedReason(context.stringValue("GetNotaryOrderResponse.NotaryFailedReason"));
		getNotaryOrderResponse.setNotaryCertificate(context.stringValue("GetNotaryOrderResponse.NotaryCertificate"));
		getNotaryOrderResponse.setSuccess(context.booleanValue("GetNotaryOrderResponse.Success"));
		getNotaryOrderResponse.setErrorMsg(context.stringValue("GetNotaryOrderResponse.ErrorMsg"));
		getNotaryOrderResponse.setErrorCode(context.stringValue("GetNotaryOrderResponse.ErrorCode"));
		getNotaryOrderResponse.setBizId(context.stringValue("GetNotaryOrderResponse.BizId"));
		getNotaryOrderResponse.setNotaryType(context.integerValue("GetNotaryOrderResponse.NotaryType"));
		getNotaryOrderResponse.setNotaryPlatformName(context.stringValue("GetNotaryOrderResponse.NotaryPlatformName"));
		getNotaryOrderResponse.setApplyPostStatus(context.integerValue("GetNotaryOrderResponse.ApplyPostStatus"));
		getNotaryOrderResponse.setNotaryPostReceipt(context.stringValue("GetNotaryOrderResponse.NotaryPostReceipt"));
	 
	 	return getNotaryOrderResponse;
	}
}