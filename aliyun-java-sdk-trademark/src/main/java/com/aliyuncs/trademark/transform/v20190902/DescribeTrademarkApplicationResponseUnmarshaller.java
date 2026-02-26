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

import com.aliyuncs.trademark.model.v20190902.DescribeTrademarkApplicationResponse;
import com.aliyuncs.trademark.model.v20190902.DescribeTrademarkApplicationResponse.Applicant;
import com.aliyuncs.trademark.model.v20190902.DescribeTrademarkApplicationResponse.FirstClassification;
import com.aliyuncs.trademark.model.v20190902.DescribeTrademarkApplicationResponse.Supplement;
import com.aliyuncs.trademark.model.v20190902.DescribeTrademarkApplicationResponse.ThirdClassification;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeTrademarkApplicationResponseUnmarshaller {

	public static DescribeTrademarkApplicationResponse unmarshall(DescribeTrademarkApplicationResponse describeTrademarkApplicationResponse, UnmarshallerContext _ctx) {
		
		describeTrademarkApplicationResponse.setRequestId(_ctx.stringValue("DescribeTrademarkApplicationResponse.RequestId"));
		describeTrademarkApplicationResponse.setAcceptUrl(_ctx.stringValue("DescribeTrademarkApplicationResponse.AcceptUrl"));
		describeTrademarkApplicationResponse.setOrderPrice(_ctx.floatValue("DescribeTrademarkApplicationResponse.OrderPrice"));
		describeTrademarkApplicationResponse.setBlackAndWhiteIconUrl(_ctx.stringValue("DescribeTrademarkApplicationResponse.BlackAndWhiteIconUrl"));
		describeTrademarkApplicationResponse.setUpdateTime(_ctx.longValue("DescribeTrademarkApplicationResponse.UpdateTime"));
		describeTrademarkApplicationResponse.setCreateTime(_ctx.longValue("DescribeTrademarkApplicationResponse.CreateTime"));
		describeTrademarkApplicationResponse.setServicePrice(_ctx.floatValue("DescribeTrademarkApplicationResponse.ServicePrice"));
		describeTrademarkApplicationResponse.setRecvUserLogistics(_ctx.stringValue("DescribeTrademarkApplicationResponse.RecvUserLogistics"));
		describeTrademarkApplicationResponse.setTrademarkIcon(_ctx.stringValue("DescribeTrademarkApplicationResponse.TrademarkIcon"));
		describeTrademarkApplicationResponse.setSendSbjLogistics(_ctx.stringValue("DescribeTrademarkApplicationResponse.SendSbjLogistics"));
		describeTrademarkApplicationResponse.setApplicantId(_ctx.longValue("DescribeTrademarkApplicationResponse.ApplicantId"));
		describeTrademarkApplicationResponse.setApplicationStatus(_ctx.integerValue("DescribeTrademarkApplicationResponse.ApplicationStatus"));
		describeTrademarkApplicationResponse.setSendUserLogistics(_ctx.stringValue("DescribeTrademarkApplicationResponse.SendUserLogistics"));
		describeTrademarkApplicationResponse.setNote(_ctx.stringValue("DescribeTrademarkApplicationResponse.Note"));
		describeTrademarkApplicationResponse.setPrincipalName(_ctx.integerValue("DescribeTrademarkApplicationResponse.PrincipalName"));
		describeTrademarkApplicationResponse.setTrademarkName(_ctx.stringValue("DescribeTrademarkApplicationResponse.TrademarkName"));
		describeTrademarkApplicationResponse.setAuthorizationUrl(_ctx.stringValue("DescribeTrademarkApplicationResponse.AuthorizationUrl"));
		describeTrademarkApplicationResponse.setApplicationType(_ctx.integerValue("DescribeTrademarkApplicationResponse.ApplicationType"));
		describeTrademarkApplicationResponse.setBizId(_ctx.stringValue("DescribeTrademarkApplicationResponse.BizId"));
		describeTrademarkApplicationResponse.setExtendInfo(_ctx.mapValue("DescribeTrademarkApplicationResponse.ExtendInfo"));
		describeTrademarkApplicationResponse.setTrademarkNameType(_ctx.integerValue("DescribeTrademarkApplicationResponse.TrademarkNameType"));
		describeTrademarkApplicationResponse.setTrademarkNumber(_ctx.stringValue("DescribeTrademarkApplicationResponse.TrademarkNumber"));
		describeTrademarkApplicationResponse.setTotalPrice(_ctx.floatValue("DescribeTrademarkApplicationResponse.TotalPrice"));
		describeTrademarkApplicationResponse.setOrderId(_ctx.stringValue("DescribeTrademarkApplicationResponse.OrderId"));
		describeTrademarkApplicationResponse.setAgreementId(_ctx.stringValue("DescribeTrademarkApplicationResponse.AgreementId"));

		List<String> judgeResultUrls = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeTrademarkApplicationResponse.JudgeResultUrls.Length"); i++) {
			judgeResultUrls.add(_ctx.stringValue("DescribeTrademarkApplicationResponse.JudgeResultUrls["+ i +"]"));
		}
		describeTrademarkApplicationResponse.setJudgeResultUrls(judgeResultUrls);

		List<String> receiptUrls = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeTrademarkApplicationResponse.ReceiptUrls.Length"); i++) {
			receiptUrls.add(_ctx.stringValue("DescribeTrademarkApplicationResponse.ReceiptUrls["+ i +"]"));
		}
		describeTrademarkApplicationResponse.setReceiptUrls(receiptUrls);

		List<Integer> flags = new ArrayList<Integer>();
		for (int i = 0; i < _ctx.lengthValue("DescribeTrademarkApplicationResponse.Flags.Length"); i++) {
			flags.add(_ctx.integerValue("DescribeTrademarkApplicationResponse.Flags["+ i +"]"));
		}
		describeTrademarkApplicationResponse.setFlags(flags);

		Applicant applicant = new Applicant();
		applicant.setContactNumber(_ctx.stringValue("DescribeTrademarkApplicationResponse.Applicant.ContactNumber"));
		applicant.setContactAddress(_ctx.stringValue("DescribeTrademarkApplicationResponse.Applicant.ContactAddress"));
		applicant.setBusinessLicenceUrl(_ctx.stringValue("DescribeTrademarkApplicationResponse.Applicant.BusinessLicenceUrl"));
		applicant.setPassportUrl(_ctx.stringValue("DescribeTrademarkApplicationResponse.Applicant.PassportUrl"));
		applicant.setContactZipcode(_ctx.stringValue("DescribeTrademarkApplicationResponse.Applicant.ContactZipcode"));
		applicant.setAuthorizationUrl(_ctx.stringValue("DescribeTrademarkApplicationResponse.Applicant.AuthorizationUrl"));
		applicant.setContactName(_ctx.stringValue("DescribeTrademarkApplicationResponse.Applicant.ContactName"));
		applicant.setLegalNoticeUrl(_ctx.stringValue("DescribeTrademarkApplicationResponse.Applicant.LegalNoticeUrl"));
		applicant.setEAddress(_ctx.stringValue("DescribeTrademarkApplicationResponse.Applicant.EAddress"));
		applicant.setEName(_ctx.stringValue("DescribeTrademarkApplicationResponse.Applicant.EName"));
		applicant.setIdCardUrl(_ctx.stringValue("DescribeTrademarkApplicationResponse.Applicant.IdCardUrl"));
		applicant.setApplicantName(_ctx.stringValue("DescribeTrademarkApplicationResponse.Applicant.ApplicantName"));
		applicant.setCardNumber(_ctx.stringValue("DescribeTrademarkApplicationResponse.Applicant.CardNumber"));
		applicant.setContactEmail(_ctx.stringValue("DescribeTrademarkApplicationResponse.Applicant.ContactEmail"));
		applicant.setApplicantRegion(_ctx.integerValue("DescribeTrademarkApplicationResponse.Applicant.ApplicantRegion"));
		applicant.setAddress(_ctx.stringValue("DescribeTrademarkApplicationResponse.Applicant.Address"));
		applicant.setCountry(_ctx.stringValue("DescribeTrademarkApplicationResponse.Applicant.Country"));
		applicant.setPrincipalName(_ctx.integerValue("DescribeTrademarkApplicationResponse.Applicant.PrincipalName"));
		applicant.setApplicantType(_ctx.integerValue("DescribeTrademarkApplicationResponse.Applicant.ApplicantType"));
		applicant.setAuditStatus(_ctx.integerValue("DescribeTrademarkApplicationResponse.Applicant.AuditStatus"));
		applicant.setProvince(_ctx.stringValue("DescribeTrademarkApplicationResponse.Applicant.Province"));
		applicant.setPersonalType(_ctx.longValue("DescribeTrademarkApplicationResponse.Applicant.PersonalType"));
		applicant.setIdCardName(_ctx.stringValue("DescribeTrademarkApplicationResponse.Applicant.IdCardName"));
		applicant.setIdCardNumber(_ctx.stringValue("DescribeTrademarkApplicationResponse.Applicant.IdCardNumber"));
		describeTrademarkApplicationResponse.setApplicant(applicant);

		FirstClassification firstClassification = new FirstClassification();
		firstClassification.setClassificationName(_ctx.stringValue("DescribeTrademarkApplicationResponse.FirstClassification.ClassificationName"));
		firstClassification.setClassificationCode(_ctx.stringValue("DescribeTrademarkApplicationResponse.FirstClassification.ClassificationCode"));
		describeTrademarkApplicationResponse.setFirstClassification(firstClassification);

		List<ThirdClassification> thirdClassifications = new ArrayList<ThirdClassification>();
		for (int i = 0; i < _ctx.lengthValue("DescribeTrademarkApplicationResponse.ThirdClassifications.Length"); i++) {
			ThirdClassification thirdClassification = new ThirdClassification();
			thirdClassification.setClassificationName(_ctx.stringValue("DescribeTrademarkApplicationResponse.ThirdClassifications["+ i +"].ClassificationName"));
			thirdClassification.setClassificationCode(_ctx.stringValue("DescribeTrademarkApplicationResponse.ThirdClassifications["+ i +"].ClassificationCode"));

			thirdClassifications.add(thirdClassification);
		}
		describeTrademarkApplicationResponse.setThirdClassifications(thirdClassifications);

		List<Supplement> supplements = new ArrayList<Supplement>();
		for (int i = 0; i < _ctx.lengthValue("DescribeTrademarkApplicationResponse.Supplements.Length"); i++) {
			Supplement supplement = new Supplement();
			supplement.setOperateTime(_ctx.longValue("DescribeTrademarkApplicationResponse.Supplements["+ i +"].OperateTime"));
			supplement.setSerialNumber(_ctx.stringValue("DescribeTrademarkApplicationResponse.Supplements["+ i +"].SerialNumber"));
			supplement.setOfficialFile(_ctx.stringValue("DescribeTrademarkApplicationResponse.Supplements["+ i +"].OfficialFile"));
			supplement.setAcceptExpirationDate(_ctx.longValue("DescribeTrademarkApplicationResponse.Supplements["+ i +"].AcceptExpirationDate"));
			supplement.setApplicationType(_ctx.integerValue("DescribeTrademarkApplicationResponse.Supplements["+ i +"].ApplicationType"));
			supplement.setSendTime(_ctx.longValue("DescribeTrademarkApplicationResponse.Supplements["+ i +"].SendTime"));
			supplement.setAcceptTime(_ctx.longValue("DescribeTrademarkApplicationResponse.Supplements["+ i +"].AcceptTime"));
			supplement.setSbjExpirationDate(_ctx.longValue("DescribeTrademarkApplicationResponse.Supplements["+ i +"].SbjExpirationDate"));
			supplement.setSupplementId(_ctx.longValue("DescribeTrademarkApplicationResponse.Supplements["+ i +"].SupplementId"));
			supplement.setTrademarkNumber(_ctx.stringValue("DescribeTrademarkApplicationResponse.Supplements["+ i +"].TrademarkNumber"));
			supplement.setSupplementStatus(_ctx.integerValue("DescribeTrademarkApplicationResponse.Supplements["+ i +"].SupplementStatus"));
			supplement.setContent(_ctx.stringValue("DescribeTrademarkApplicationResponse.Supplements["+ i +"].Content"));
			supplement.setOrderId(_ctx.stringValue("DescribeTrademarkApplicationResponse.Supplements["+ i +"].OrderId"));

			List<String> userFiles = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeTrademarkApplicationResponse.Supplements["+ i +"].UserFiles.Length"); j++) {
				userFiles.add(_ctx.stringValue("DescribeTrademarkApplicationResponse.Supplements["+ i +"].UserFiles["+ j +"]"));
			}
			supplement.setUserFiles(userFiles);

			supplements.add(supplement);
		}
		describeTrademarkApplicationResponse.setSupplements(supplements);
	 
	 	return describeTrademarkApplicationResponse;
	}
}