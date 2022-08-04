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

	public static GetNotaryOrderResponse unmarshall(GetNotaryOrderResponse getNotaryOrderResponse, UnmarshallerContext _ctx) {
		
		getNotaryOrderResponse.setRequestId(_ctx.stringValue("GetNotaryOrderResponse.RequestId"));
		getNotaryOrderResponse.setType(_ctx.stringValue("GetNotaryOrderResponse.Type"));
		getNotaryOrderResponse.setOrderPrice(_ctx.floatValue("GetNotaryOrderResponse.OrderPrice"));
		getNotaryOrderResponse.setLegalPersonIdCard(_ctx.stringValue("GetNotaryOrderResponse.LegalPersonIdCard"));
		getNotaryOrderResponse.setBusinessLicenseId(_ctx.stringValue("GetNotaryOrderResponse.BusinessLicenseId"));
		getNotaryOrderResponse.setNotaryPostReceipt(_ctx.stringValue("GetNotaryOrderResponse.NotaryPostReceipt"));
		getNotaryOrderResponse.setCompanyContactName(_ctx.stringValue("GetNotaryOrderResponse.CompanyContactName"));
		getNotaryOrderResponse.setNotaryStatus(_ctx.integerValue("GetNotaryOrderResponse.NotaryStatus"));
		getNotaryOrderResponse.setSellerBackOfIdCard(_ctx.stringValue("GetNotaryOrderResponse.SellerBackOfIdCard"));
		getNotaryOrderResponse.setTmRegisterChangeCertificate(_ctx.stringValue("GetNotaryOrderResponse.TmRegisterChangeCertificate"));
		getNotaryOrderResponse.setLegalPersonName(_ctx.stringValue("GetNotaryOrderResponse.LegalPersonName"));
		getNotaryOrderResponse.setTmImage(_ctx.stringValue("GetNotaryOrderResponse.TmImage"));
		getNotaryOrderResponse.setNotaryAcceptDate(_ctx.longValue("GetNotaryOrderResponse.NotaryAcceptDate"));
		getNotaryOrderResponse.setErrorCode(_ctx.stringValue("GetNotaryOrderResponse.ErrorCode"));
		getNotaryOrderResponse.setAliyunOrderId(_ctx.stringValue("GetNotaryOrderResponse.AliyunOrderId"));
		getNotaryOrderResponse.setNotarySucceedDate(_ctx.longValue("GetNotaryOrderResponse.NotarySucceedDate"));
		getNotaryOrderResponse.setApplyPostStatus(_ctx.integerValue("GetNotaryOrderResponse.ApplyPostStatus"));
		getNotaryOrderResponse.setErrorMsg(_ctx.stringValue("GetNotaryOrderResponse.ErrorMsg"));
		getNotaryOrderResponse.setName(_ctx.stringValue("GetNotaryOrderResponse.Name"));
		getNotaryOrderResponse.setBusinessLicense(_ctx.stringValue("GetNotaryOrderResponse.BusinessLicense"));
		getNotaryOrderResponse.setReceiverName(_ctx.stringValue("GetNotaryOrderResponse.ReceiverName"));
		getNotaryOrderResponse.setOrderDate(_ctx.longValue("GetNotaryOrderResponse.OrderDate"));
		getNotaryOrderResponse.setCompanyContactPhone(_ctx.stringValue("GetNotaryOrderResponse.CompanyContactPhone"));
		getNotaryOrderResponse.setNotaryType(_ctx.integerValue("GetNotaryOrderResponse.NotaryType"));
		getNotaryOrderResponse.setNotaryFailedDate(_ctx.longValue("GetNotaryOrderResponse.NotaryFailedDate"));
		getNotaryOrderResponse.setTmClassification(_ctx.stringValue("GetNotaryOrderResponse.TmClassification"));
		getNotaryOrderResponse.setSuccess(_ctx.booleanValue("GetNotaryOrderResponse.Success"));
		getNotaryOrderResponse.setBizId(_ctx.stringValue("GetNotaryOrderResponse.BizId"));
		getNotaryOrderResponse.setNotaryOrderId(_ctx.longValue("GetNotaryOrderResponse.NotaryOrderId"));
		getNotaryOrderResponse.setPhone(_ctx.stringValue("GetNotaryOrderResponse.Phone"));
		getNotaryOrderResponse.setReceiverPhone(_ctx.stringValue("GetNotaryOrderResponse.ReceiverPhone"));
		getNotaryOrderResponse.setTmRegisterCertificate(_ctx.stringValue("GetNotaryOrderResponse.TmRegisterCertificate"));
		getNotaryOrderResponse.setTmName(_ctx.stringValue("GetNotaryOrderResponse.TmName"));
		getNotaryOrderResponse.setTmRegisterNo(_ctx.stringValue("GetNotaryOrderResponse.TmRegisterNo"));
		getNotaryOrderResponse.setSellerCompanyName(_ctx.stringValue("GetNotaryOrderResponse.SellerCompanyName"));
		getNotaryOrderResponse.setTmAcceptCertificate(_ctx.stringValue("GetNotaryOrderResponse.TmAcceptCertificate"));
		getNotaryOrderResponse.setReceiverPostalCode(_ctx.stringValue("GetNotaryOrderResponse.ReceiverPostalCode"));
		getNotaryOrderResponse.setNotaryCertificate(_ctx.stringValue("GetNotaryOrderResponse.NotaryCertificate"));
		getNotaryOrderResponse.setLegalPersonPhone(_ctx.stringValue("GetNotaryOrderResponse.LegalPersonPhone"));
		getNotaryOrderResponse.setNotaryFailedReason(_ctx.stringValue("GetNotaryOrderResponse.NotaryFailedReason"));
		getNotaryOrderResponse.setSellerFrontOfIdCard(_ctx.stringValue("GetNotaryOrderResponse.SellerFrontOfIdCard"));
		getNotaryOrderResponse.setReceiverAddress(_ctx.stringValue("GetNotaryOrderResponse.ReceiverAddress"));
		getNotaryOrderResponse.setNotaryPlatformName(_ctx.stringValue("GetNotaryOrderResponse.NotaryPlatformName"));
	 
	 	return getNotaryOrderResponse;
	}
}