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

import com.aliyuncs.trademark.model.v20190902.DescribeAdminTrademarkApplicationResponse;
import com.aliyuncs.trademark.model.v20190902.DescribeAdminTrademarkApplicationResponse.Applicant;
import com.aliyuncs.trademark.model.v20190902.DescribeAdminTrademarkApplicationResponse.FirstClassification;
import com.aliyuncs.trademark.model.v20190902.DescribeAdminTrademarkApplicationResponse.Supplement;
import com.aliyuncs.trademark.model.v20190902.DescribeAdminTrademarkApplicationResponse.ThirdClassification;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeAdminTrademarkApplicationResponseUnmarshaller {

	public static DescribeAdminTrademarkApplicationResponse unmarshall(DescribeAdminTrademarkApplicationResponse describeAdminTrademarkApplicationResponse, UnmarshallerContext _ctx) {
		
		describeAdminTrademarkApplicationResponse.setRequestId(_ctx.stringValue("DescribeAdminTrademarkApplicationResponse.RequestId"));
		describeAdminTrademarkApplicationResponse.setAcceptUrl(_ctx.stringValue("DescribeAdminTrademarkApplicationResponse.AcceptUrl"));
		describeAdminTrademarkApplicationResponse.setOrderPrice(_ctx.floatValue("DescribeAdminTrademarkApplicationResponse.OrderPrice"));
		describeAdminTrademarkApplicationResponse.setBlackAndWhiteIconUrl(_ctx.stringValue("DescribeAdminTrademarkApplicationResponse.BlackAndWhiteIconUrl"));
		describeAdminTrademarkApplicationResponse.setUpdateTime(_ctx.longValue("DescribeAdminTrademarkApplicationResponse.UpdateTime"));
		describeAdminTrademarkApplicationResponse.setCreateTime(_ctx.longValue("DescribeAdminTrademarkApplicationResponse.CreateTime"));
		describeAdminTrademarkApplicationResponse.setUserId(_ctx.stringValue("DescribeAdminTrademarkApplicationResponse.UserId"));
		describeAdminTrademarkApplicationResponse.setServicePrice(_ctx.floatValue("DescribeAdminTrademarkApplicationResponse.ServicePrice"));
		describeAdminTrademarkApplicationResponse.setRecvUserLogistics(_ctx.stringValue("DescribeAdminTrademarkApplicationResponse.RecvUserLogistics"));
		describeAdminTrademarkApplicationResponse.setTrademarkIcon(_ctx.stringValue("DescribeAdminTrademarkApplicationResponse.TrademarkIcon"));
		describeAdminTrademarkApplicationResponse.setSendSbjLogistics(_ctx.stringValue("DescribeAdminTrademarkApplicationResponse.SendSbjLogistics"));
		describeAdminTrademarkApplicationResponse.setApplicantId(_ctx.longValue("DescribeAdminTrademarkApplicationResponse.ApplicantId"));
		describeAdminTrademarkApplicationResponse.setApplicationStatus(_ctx.integerValue("DescribeAdminTrademarkApplicationResponse.ApplicationStatus"));
		describeAdminTrademarkApplicationResponse.setSendUserLogistics(_ctx.stringValue("DescribeAdminTrademarkApplicationResponse.SendUserLogistics"));
		describeAdminTrademarkApplicationResponse.setNote(_ctx.stringValue("DescribeAdminTrademarkApplicationResponse.Note"));
		describeAdminTrademarkApplicationResponse.setPrincipalName(_ctx.integerValue("DescribeAdminTrademarkApplicationResponse.PrincipalName"));
		describeAdminTrademarkApplicationResponse.setTrademarkName(_ctx.stringValue("DescribeAdminTrademarkApplicationResponse.TrademarkName"));
		describeAdminTrademarkApplicationResponse.setAuthorizationUrl(_ctx.stringValue("DescribeAdminTrademarkApplicationResponse.AuthorizationUrl"));
		describeAdminTrademarkApplicationResponse.setApplicationType(_ctx.integerValue("DescribeAdminTrademarkApplicationResponse.ApplicationType"));
		describeAdminTrademarkApplicationResponse.setBizId(_ctx.stringValue("DescribeAdminTrademarkApplicationResponse.BizId"));
		describeAdminTrademarkApplicationResponse.setExtendInfo(_ctx.mapValue("DescribeAdminTrademarkApplicationResponse.ExtendInfo"));
		describeAdminTrademarkApplicationResponse.setTrademarkNameType(_ctx.integerValue("DescribeAdminTrademarkApplicationResponse.TrademarkNameType"));
		describeAdminTrademarkApplicationResponse.setTrademarkNumber(_ctx.stringValue("DescribeAdminTrademarkApplicationResponse.TrademarkNumber"));
		describeAdminTrademarkApplicationResponse.setTotalPrice(_ctx.floatValue("DescribeAdminTrademarkApplicationResponse.TotalPrice"));
		describeAdminTrademarkApplicationResponse.setOrderId(_ctx.stringValue("DescribeAdminTrademarkApplicationResponse.OrderId"));

		List<String> judgeResultUrls = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeAdminTrademarkApplicationResponse.JudgeResultUrls.Length"); i++) {
			judgeResultUrls.add(_ctx.stringValue("DescribeAdminTrademarkApplicationResponse.JudgeResultUrls["+ i +"]"));
		}
		describeAdminTrademarkApplicationResponse.setJudgeResultUrls(judgeResultUrls);

		List<String> receiptUrls = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeAdminTrademarkApplicationResponse.ReceiptUrls.Length"); i++) {
			receiptUrls.add(_ctx.stringValue("DescribeAdminTrademarkApplicationResponse.ReceiptUrls["+ i +"]"));
		}
		describeAdminTrademarkApplicationResponse.setReceiptUrls(receiptUrls);

		Applicant applicant = new Applicant();
		applicant.setContactNumber(_ctx.stringValue("DescribeAdminTrademarkApplicationResponse.Applicant.ContactNumber"));
		applicant.setContactAddress(_ctx.stringValue("DescribeAdminTrademarkApplicationResponse.Applicant.ContactAddress"));
		applicant.setBusinessLicenceUrl(_ctx.stringValue("DescribeAdminTrademarkApplicationResponse.Applicant.BusinessLicenceUrl"));
		applicant.setPassportUrl(_ctx.stringValue("DescribeAdminTrademarkApplicationResponse.Applicant.PassportUrl"));
		applicant.setContactZipcode(_ctx.stringValue("DescribeAdminTrademarkApplicationResponse.Applicant.ContactZipcode"));
		applicant.setAuthorizationUrl(_ctx.stringValue("DescribeAdminTrademarkApplicationResponse.Applicant.AuthorizationUrl"));
		applicant.setContactName(_ctx.stringValue("DescribeAdminTrademarkApplicationResponse.Applicant.ContactName"));
		applicant.setLegalNoticeUrl(_ctx.stringValue("DescribeAdminTrademarkApplicationResponse.Applicant.LegalNoticeUrl"));
		applicant.setEAddress(_ctx.stringValue("DescribeAdminTrademarkApplicationResponse.Applicant.EAddress"));
		applicant.setEName(_ctx.stringValue("DescribeAdminTrademarkApplicationResponse.Applicant.EName"));
		applicant.setIdCardUrl(_ctx.stringValue("DescribeAdminTrademarkApplicationResponse.Applicant.IdCardUrl"));
		applicant.setApplicantName(_ctx.stringValue("DescribeAdminTrademarkApplicationResponse.Applicant.ApplicantName"));
		applicant.setCardNumber(_ctx.stringValue("DescribeAdminTrademarkApplicationResponse.Applicant.CardNumber"));
		applicant.setContactEmail(_ctx.stringValue("DescribeAdminTrademarkApplicationResponse.Applicant.ContactEmail"));
		applicant.setApplicantRegion(_ctx.integerValue("DescribeAdminTrademarkApplicationResponse.Applicant.ApplicantRegion"));
		applicant.setAddress(_ctx.stringValue("DescribeAdminTrademarkApplicationResponse.Applicant.Address"));
		applicant.setCountry(_ctx.stringValue("DescribeAdminTrademarkApplicationResponse.Applicant.Country"));
		applicant.setPrincipalName(_ctx.integerValue("DescribeAdminTrademarkApplicationResponse.Applicant.PrincipalName"));
		applicant.setApplicantType(_ctx.integerValue("DescribeAdminTrademarkApplicationResponse.Applicant.ApplicantType"));
		applicant.setAuditStatus(_ctx.integerValue("DescribeAdminTrademarkApplicationResponse.Applicant.AuditStatus"));
		applicant.setProvince(_ctx.stringValue("DescribeAdminTrademarkApplicationResponse.Applicant.Province"));
		describeAdminTrademarkApplicationResponse.setApplicant(applicant);

		FirstClassification firstClassification = new FirstClassification();
		firstClassification.setClassificationName(_ctx.stringValue("DescribeAdminTrademarkApplicationResponse.FirstClassification.ClassificationName"));
		firstClassification.setClassificationCode(_ctx.stringValue("DescribeAdminTrademarkApplicationResponse.FirstClassification.ClassificationCode"));
		describeAdminTrademarkApplicationResponse.setFirstClassification(firstClassification);

		List<ThirdClassification> thirdClassifications = new ArrayList<ThirdClassification>();
		for (int i = 0; i < _ctx.lengthValue("DescribeAdminTrademarkApplicationResponse.ThirdClassifications.Length"); i++) {
			ThirdClassification thirdClassification = new ThirdClassification();
			thirdClassification.setClassificationName(_ctx.stringValue("DescribeAdminTrademarkApplicationResponse.ThirdClassifications["+ i +"].ClassificationName"));
			thirdClassification.setClassificationCode(_ctx.stringValue("DescribeAdminTrademarkApplicationResponse.ThirdClassifications["+ i +"].ClassificationCode"));

			thirdClassifications.add(thirdClassification);
		}
		describeAdminTrademarkApplicationResponse.setThirdClassifications(thirdClassifications);

		List<Supplement> supplements = new ArrayList<Supplement>();
		for (int i = 0; i < _ctx.lengthValue("DescribeAdminTrademarkApplicationResponse.Supplements.Length"); i++) {
			Supplement supplement = new Supplement();
			supplement.setOperateTime(_ctx.longValue("DescribeAdminTrademarkApplicationResponse.Supplements["+ i +"].OperateTime"));
			supplement.setSerialNumber(_ctx.stringValue("DescribeAdminTrademarkApplicationResponse.Supplements["+ i +"].SerialNumber"));
			supplement.setOfficialFile(_ctx.stringValue("DescribeAdminTrademarkApplicationResponse.Supplements["+ i +"].OfficialFile"));
			supplement.setAcceptExpirationDate(_ctx.longValue("DescribeAdminTrademarkApplicationResponse.Supplements["+ i +"].AcceptExpirationDate"));
			supplement.setApplicationType(_ctx.integerValue("DescribeAdminTrademarkApplicationResponse.Supplements["+ i +"].ApplicationType"));
			supplement.setSendTime(_ctx.longValue("DescribeAdminTrademarkApplicationResponse.Supplements["+ i +"].SendTime"));
			supplement.setAcceptTime(_ctx.longValue("DescribeAdminTrademarkApplicationResponse.Supplements["+ i +"].AcceptTime"));
			supplement.setSbjExpirationDate(_ctx.longValue("DescribeAdminTrademarkApplicationResponse.Supplements["+ i +"].SbjExpirationDate"));
			supplement.setSupplementId(_ctx.longValue("DescribeAdminTrademarkApplicationResponse.Supplements["+ i +"].SupplementId"));
			supplement.setTrademarkNumber(_ctx.stringValue("DescribeAdminTrademarkApplicationResponse.Supplements["+ i +"].TrademarkNumber"));
			supplement.setSupplementStatus(_ctx.integerValue("DescribeAdminTrademarkApplicationResponse.Supplements["+ i +"].SupplementStatus"));
			supplement.setContent(_ctx.stringValue("DescribeAdminTrademarkApplicationResponse.Supplements["+ i +"].Content"));
			supplement.setOrderId(_ctx.stringValue("DescribeAdminTrademarkApplicationResponse.Supplements["+ i +"].OrderId"));

			List<String> userFiles = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeAdminTrademarkApplicationResponse.Supplements["+ i +"].UserFiles.Length"); j++) {
				userFiles.add(_ctx.stringValue("DescribeAdminTrademarkApplicationResponse.Supplements["+ i +"].UserFiles["+ j +"]"));
			}
			supplement.setUserFiles(userFiles);

			supplements.add(supplement);
		}
		describeAdminTrademarkApplicationResponse.setSupplements(supplements);
	 
	 	return describeAdminTrademarkApplicationResponse;
	}
}