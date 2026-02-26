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

package com.aliyuncs.trademark.transform.v20190902;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.trademark.model.v20190902.DescribePartnerTrademarkApplicationResponse;
import com.aliyuncs.trademark.model.v20190902.DescribePartnerTrademarkApplicationResponse.Applicant;
import com.aliyuncs.trademark.model.v20190902.DescribePartnerTrademarkApplicationResponse.FirstClassification;
import com.aliyuncs.trademark.model.v20190902.DescribePartnerTrademarkApplicationResponse.Supplement;
import com.aliyuncs.trademark.model.v20190902.DescribePartnerTrademarkApplicationResponse.ThirdClassification;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribePartnerTrademarkApplicationResponseUnmarshaller {

	public static DescribePartnerTrademarkApplicationResponse unmarshall(DescribePartnerTrademarkApplicationResponse describePartnerTrademarkApplicationResponse, UnmarshallerContext _ctx) {
		
		describePartnerTrademarkApplicationResponse.setRequestId(_ctx.stringValue("DescribePartnerTrademarkApplicationResponse.RequestId"));
		describePartnerTrademarkApplicationResponse.setAcceptUrl(_ctx.stringValue("DescribePartnerTrademarkApplicationResponse.AcceptUrl"));
		describePartnerTrademarkApplicationResponse.setOrderPrice(_ctx.floatValue("DescribePartnerTrademarkApplicationResponse.OrderPrice"));
		describePartnerTrademarkApplicationResponse.setBlackAndWhiteIconUrl(_ctx.stringValue("DescribePartnerTrademarkApplicationResponse.BlackAndWhiteIconUrl"));
		describePartnerTrademarkApplicationResponse.setUpdateTime(_ctx.longValue("DescribePartnerTrademarkApplicationResponse.UpdateTime"));
		describePartnerTrademarkApplicationResponse.setCreateTime(_ctx.longValue("DescribePartnerTrademarkApplicationResponse.CreateTime"));
		describePartnerTrademarkApplicationResponse.setServicePrice(_ctx.floatValue("DescribePartnerTrademarkApplicationResponse.ServicePrice"));
		describePartnerTrademarkApplicationResponse.setRecvUserLogistics(_ctx.stringValue("DescribePartnerTrademarkApplicationResponse.RecvUserLogistics"));
		describePartnerTrademarkApplicationResponse.setTrademarkIcon(_ctx.stringValue("DescribePartnerTrademarkApplicationResponse.TrademarkIcon"));
		describePartnerTrademarkApplicationResponse.setSendSbjLogistics(_ctx.stringValue("DescribePartnerTrademarkApplicationResponse.SendSbjLogistics"));
		describePartnerTrademarkApplicationResponse.setApplicantId(_ctx.longValue("DescribePartnerTrademarkApplicationResponse.ApplicantId"));
		describePartnerTrademarkApplicationResponse.setApplicationStatus(_ctx.integerValue("DescribePartnerTrademarkApplicationResponse.ApplicationStatus"));
		describePartnerTrademarkApplicationResponse.setSendUserLogistics(_ctx.stringValue("DescribePartnerTrademarkApplicationResponse.SendUserLogistics"));
		describePartnerTrademarkApplicationResponse.setNote(_ctx.stringValue("DescribePartnerTrademarkApplicationResponse.Note"));
		describePartnerTrademarkApplicationResponse.setPrincipalName(_ctx.integerValue("DescribePartnerTrademarkApplicationResponse.PrincipalName"));
		describePartnerTrademarkApplicationResponse.setTrademarkName(_ctx.stringValue("DescribePartnerTrademarkApplicationResponse.TrademarkName"));
		describePartnerTrademarkApplicationResponse.setAuthorizationUrl(_ctx.stringValue("DescribePartnerTrademarkApplicationResponse.AuthorizationUrl"));
		describePartnerTrademarkApplicationResponse.setApplicationType(_ctx.integerValue("DescribePartnerTrademarkApplicationResponse.ApplicationType"));
		describePartnerTrademarkApplicationResponse.setBizId(_ctx.stringValue("DescribePartnerTrademarkApplicationResponse.BizId"));
		describePartnerTrademarkApplicationResponse.setExtendInfo(_ctx.mapValue("DescribePartnerTrademarkApplicationResponse.ExtendInfo"));
		describePartnerTrademarkApplicationResponse.setTrademarkNameType(_ctx.integerValue("DescribePartnerTrademarkApplicationResponse.TrademarkNameType"));
		describePartnerTrademarkApplicationResponse.setTrademarkNumber(_ctx.stringValue("DescribePartnerTrademarkApplicationResponse.TrademarkNumber"));
		describePartnerTrademarkApplicationResponse.setTotalPrice(_ctx.floatValue("DescribePartnerTrademarkApplicationResponse.TotalPrice"));
		describePartnerTrademarkApplicationResponse.setOrderId(_ctx.stringValue("DescribePartnerTrademarkApplicationResponse.OrderId"));

		List<String> judgeResultUrls = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribePartnerTrademarkApplicationResponse.JudgeResultUrls.Length"); i++) {
			judgeResultUrls.add(_ctx.stringValue("DescribePartnerTrademarkApplicationResponse.JudgeResultUrls["+ i +"]"));
		}
		describePartnerTrademarkApplicationResponse.setJudgeResultUrls(judgeResultUrls);

		List<String> receiptUrls = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribePartnerTrademarkApplicationResponse.ReceiptUrls.Length"); i++) {
			receiptUrls.add(_ctx.stringValue("DescribePartnerTrademarkApplicationResponse.ReceiptUrls["+ i +"]"));
		}
		describePartnerTrademarkApplicationResponse.setReceiptUrls(receiptUrls);

		Applicant applicant = new Applicant();
		applicant.setContactNumber(_ctx.stringValue("DescribePartnerTrademarkApplicationResponse.Applicant.ContactNumber"));
		applicant.setContactAddress(_ctx.stringValue("DescribePartnerTrademarkApplicationResponse.Applicant.ContactAddress"));
		applicant.setBusinessLicenceUrl(_ctx.stringValue("DescribePartnerTrademarkApplicationResponse.Applicant.BusinessLicenceUrl"));
		applicant.setPassportUrl(_ctx.stringValue("DescribePartnerTrademarkApplicationResponse.Applicant.PassportUrl"));
		applicant.setContactZipcode(_ctx.stringValue("DescribePartnerTrademarkApplicationResponse.Applicant.ContactZipcode"));
		applicant.setAuthorizationUrl(_ctx.stringValue("DescribePartnerTrademarkApplicationResponse.Applicant.AuthorizationUrl"));
		applicant.setContactName(_ctx.stringValue("DescribePartnerTrademarkApplicationResponse.Applicant.ContactName"));
		applicant.setLegalNoticeUrl(_ctx.stringValue("DescribePartnerTrademarkApplicationResponse.Applicant.LegalNoticeUrl"));
		applicant.setEAddress(_ctx.stringValue("DescribePartnerTrademarkApplicationResponse.Applicant.EAddress"));
		applicant.setEName(_ctx.stringValue("DescribePartnerTrademarkApplicationResponse.Applicant.EName"));
		applicant.setIdCardUrl(_ctx.stringValue("DescribePartnerTrademarkApplicationResponse.Applicant.IdCardUrl"));
		applicant.setApplicantName(_ctx.stringValue("DescribePartnerTrademarkApplicationResponse.Applicant.ApplicantName"));
		applicant.setCardNumber(_ctx.stringValue("DescribePartnerTrademarkApplicationResponse.Applicant.CardNumber"));
		applicant.setContactEmail(_ctx.stringValue("DescribePartnerTrademarkApplicationResponse.Applicant.ContactEmail"));
		applicant.setApplicantRegion(_ctx.integerValue("DescribePartnerTrademarkApplicationResponse.Applicant.ApplicantRegion"));
		applicant.setAddress(_ctx.stringValue("DescribePartnerTrademarkApplicationResponse.Applicant.Address"));
		applicant.setCountry(_ctx.stringValue("DescribePartnerTrademarkApplicationResponse.Applicant.Country"));
		applicant.setPrincipalName(_ctx.integerValue("DescribePartnerTrademarkApplicationResponse.Applicant.PrincipalName"));
		applicant.setApplicantType(_ctx.integerValue("DescribePartnerTrademarkApplicationResponse.Applicant.ApplicantType"));
		applicant.setAuditStatus(_ctx.integerValue("DescribePartnerTrademarkApplicationResponse.Applicant.AuditStatus"));
		applicant.setProvince(_ctx.stringValue("DescribePartnerTrademarkApplicationResponse.Applicant.Province"));
		describePartnerTrademarkApplicationResponse.setApplicant(applicant);

		FirstClassification firstClassification = new FirstClassification();
		firstClassification.setClassificationName(_ctx.stringValue("DescribePartnerTrademarkApplicationResponse.FirstClassification.ClassificationName"));
		firstClassification.setClassificationCode(_ctx.stringValue("DescribePartnerTrademarkApplicationResponse.FirstClassification.ClassificationCode"));
		describePartnerTrademarkApplicationResponse.setFirstClassification(firstClassification);

		List<ThirdClassification> thirdClassifications = new ArrayList<ThirdClassification>();
		for (int i = 0; i < _ctx.lengthValue("DescribePartnerTrademarkApplicationResponse.ThirdClassifications.Length"); i++) {
			ThirdClassification thirdClassification = new ThirdClassification();
			thirdClassification.setClassificationName(_ctx.stringValue("DescribePartnerTrademarkApplicationResponse.ThirdClassifications["+ i +"].ClassificationName"));
			thirdClassification.setClassificationCode(_ctx.stringValue("DescribePartnerTrademarkApplicationResponse.ThirdClassifications["+ i +"].ClassificationCode"));

			thirdClassifications.add(thirdClassification);
		}
		describePartnerTrademarkApplicationResponse.setThirdClassifications(thirdClassifications);

		List<Supplement> supplements = new ArrayList<Supplement>();
		for (int i = 0; i < _ctx.lengthValue("DescribePartnerTrademarkApplicationResponse.Supplements.Length"); i++) {
			Supplement supplement = new Supplement();
			supplement.setOperateTime(_ctx.longValue("DescribePartnerTrademarkApplicationResponse.Supplements["+ i +"].OperateTime"));
			supplement.setSerialNumber(_ctx.stringValue("DescribePartnerTrademarkApplicationResponse.Supplements["+ i +"].SerialNumber"));
			supplement.setOfficialFile(_ctx.stringValue("DescribePartnerTrademarkApplicationResponse.Supplements["+ i +"].OfficialFile"));
			supplement.setAcceptExpirationDate(_ctx.longValue("DescribePartnerTrademarkApplicationResponse.Supplements["+ i +"].AcceptExpirationDate"));
			supplement.setApplicationType(_ctx.integerValue("DescribePartnerTrademarkApplicationResponse.Supplements["+ i +"].ApplicationType"));
			supplement.setSendTime(_ctx.longValue("DescribePartnerTrademarkApplicationResponse.Supplements["+ i +"].SendTime"));
			supplement.setAcceptTime(_ctx.longValue("DescribePartnerTrademarkApplicationResponse.Supplements["+ i +"].AcceptTime"));
			supplement.setSbjExpirationDate(_ctx.longValue("DescribePartnerTrademarkApplicationResponse.Supplements["+ i +"].SbjExpirationDate"));
			supplement.setSupplementId(_ctx.longValue("DescribePartnerTrademarkApplicationResponse.Supplements["+ i +"].SupplementId"));
			supplement.setTrademarkNumber(_ctx.stringValue("DescribePartnerTrademarkApplicationResponse.Supplements["+ i +"].TrademarkNumber"));
			supplement.setSupplementStatus(_ctx.integerValue("DescribePartnerTrademarkApplicationResponse.Supplements["+ i +"].SupplementStatus"));
			supplement.setContent(_ctx.stringValue("DescribePartnerTrademarkApplicationResponse.Supplements["+ i +"].Content"));
			supplement.setOrderId(_ctx.stringValue("DescribePartnerTrademarkApplicationResponse.Supplements["+ i +"].OrderId"));

			List<String> userFiles = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribePartnerTrademarkApplicationResponse.Supplements["+ i +"].UserFiles.Length"); j++) {
				userFiles.add(_ctx.stringValue("DescribePartnerTrademarkApplicationResponse.Supplements["+ i +"].UserFiles["+ j +"]"));
			}
			supplement.setUserFiles(userFiles);

			supplements.add(supplement);
		}
		describePartnerTrademarkApplicationResponse.setSupplements(supplements);
	 
	 	return describePartnerTrademarkApplicationResponse;
	}
}