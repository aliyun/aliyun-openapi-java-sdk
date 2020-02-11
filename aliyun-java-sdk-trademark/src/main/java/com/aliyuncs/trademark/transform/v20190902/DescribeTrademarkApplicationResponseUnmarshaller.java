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
		describeTrademarkApplicationResponse.setApplicationStatus(_ctx.integerValue("DescribeTrademarkApplicationResponse.ApplicationStatus"));
		describeTrademarkApplicationResponse.setAuthorizationUrl(_ctx.stringValue("DescribeTrademarkApplicationResponse.AuthorizationUrl"));
		describeTrademarkApplicationResponse.setOrderPrice(_ctx.floatValue("DescribeTrademarkApplicationResponse.OrderPrice"));
		describeTrademarkApplicationResponse.setTrademarkIcon(_ctx.stringValue("DescribeTrademarkApplicationResponse.TrademarkIcon"));
		describeTrademarkApplicationResponse.setOrderId(_ctx.stringValue("DescribeTrademarkApplicationResponse.OrderId"));
		describeTrademarkApplicationResponse.setApplicationType(_ctx.integerValue("DescribeTrademarkApplicationResponse.ApplicationType"));
		describeTrademarkApplicationResponse.setTrademarkNameType(_ctx.integerValue("DescribeTrademarkApplicationResponse.TrademarkNameType"));
		describeTrademarkApplicationResponse.setTrademarkName(_ctx.stringValue("DescribeTrademarkApplicationResponse.TrademarkName"));
		describeTrademarkApplicationResponse.setBizId(_ctx.stringValue("DescribeTrademarkApplicationResponse.BizId"));
		describeTrademarkApplicationResponse.setBlackAndWhiteIconUrl(_ctx.stringValue("DescribeTrademarkApplicationResponse.BlackAndWhiteIconUrl"));
		describeTrademarkApplicationResponse.setNote(_ctx.stringValue("DescribeTrademarkApplicationResponse.Note"));
		describeTrademarkApplicationResponse.setTrademarkNumber(_ctx.stringValue("DescribeTrademarkApplicationResponse.TrademarkNumber"));
		describeTrademarkApplicationResponse.setAcceptUrl(_ctx.stringValue("DescribeTrademarkApplicationResponse.AcceptUrl"));
		describeTrademarkApplicationResponse.setCreateTime(_ctx.longValue("DescribeTrademarkApplicationResponse.CreateTime"));
		describeTrademarkApplicationResponse.setUpdateTime(_ctx.longValue("DescribeTrademarkApplicationResponse.UpdateTime"));
		describeTrademarkApplicationResponse.setExtendInfo(_ctx.mapValue("DescribeTrademarkApplicationResponse.ExtendInfo"));
		describeTrademarkApplicationResponse.setSendSbjLogistics(_ctx.stringValue("DescribeTrademarkApplicationResponse.SendSbjLogistics"));
		describeTrademarkApplicationResponse.setSendUserLogistics(_ctx.stringValue("DescribeTrademarkApplicationResponse.SendUserLogistics"));
		describeTrademarkApplicationResponse.setRecvUserLogistics(_ctx.stringValue("DescribeTrademarkApplicationResponse.RecvUserLogistics"));
		describeTrademarkApplicationResponse.setApplicantId(_ctx.longValue("DescribeTrademarkApplicationResponse.ApplicantId"));
		describeTrademarkApplicationResponse.setTotalPrice(_ctx.floatValue("DescribeTrademarkApplicationResponse.TotalPrice"));
		describeTrademarkApplicationResponse.setServicePrice(_ctx.floatValue("DescribeTrademarkApplicationResponse.ServicePrice"));

		List<String> receiptUrls = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeTrademarkApplicationResponse.ReceiptUrls.Length"); i++) {
			receiptUrls.add(_ctx.stringValue("DescribeTrademarkApplicationResponse.ReceiptUrls["+ i +"]"));
		}
		describeTrademarkApplicationResponse.setReceiptUrls(receiptUrls);

		List<String> judgeResultUrls = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeTrademarkApplicationResponse.JudgeResultUrls.Length"); i++) {
			judgeResultUrls.add(_ctx.stringValue("DescribeTrademarkApplicationResponse.JudgeResultUrls["+ i +"]"));
		}
		describeTrademarkApplicationResponse.setJudgeResultUrls(judgeResultUrls);

		Applicant applicant = new Applicant();
		applicant.setCardNumber(_ctx.stringValue("DescribeTrademarkApplicationResponse.Applicant.CardNumber"));
		applicant.setContactAddress(_ctx.stringValue("DescribeTrademarkApplicationResponse.Applicant.ContactAddress"));
		applicant.setAuditStatus(_ctx.integerValue("DescribeTrademarkApplicationResponse.Applicant.AuditStatus"));
		applicant.setEName(_ctx.stringValue("DescribeTrademarkApplicationResponse.Applicant.EName"));
		applicant.setAddress(_ctx.stringValue("DescribeTrademarkApplicationResponse.Applicant.Address"));
		applicant.setAuthorizationUrl(_ctx.stringValue("DescribeTrademarkApplicationResponse.Applicant.AuthorizationUrl"));
		applicant.setPassportUrl(_ctx.stringValue("DescribeTrademarkApplicationResponse.Applicant.PassportUrl"));
		applicant.setProvince(_ctx.stringValue("DescribeTrademarkApplicationResponse.Applicant.Province"));
		applicant.setEAddress(_ctx.stringValue("DescribeTrademarkApplicationResponse.Applicant.EAddress"));
		applicant.setApplicantName(_ctx.stringValue("DescribeTrademarkApplicationResponse.Applicant.ApplicantName"));
		applicant.setIdCardUrl(_ctx.stringValue("DescribeTrademarkApplicationResponse.Applicant.IdCardUrl"));
		applicant.setBusinessLicenceUrl(_ctx.stringValue("DescribeTrademarkApplicationResponse.Applicant.BusinessLicenceUrl"));
		applicant.setApplicantType(_ctx.integerValue("DescribeTrademarkApplicationResponse.Applicant.ApplicantType"));
		applicant.setContactZipcode(_ctx.stringValue("DescribeTrademarkApplicationResponse.Applicant.ContactZipcode"));
		applicant.setContactNumber(_ctx.stringValue("DescribeTrademarkApplicationResponse.Applicant.ContactNumber"));
		applicant.setContactEmail(_ctx.stringValue("DescribeTrademarkApplicationResponse.Applicant.ContactEmail"));
		applicant.setCountry(_ctx.stringValue("DescribeTrademarkApplicationResponse.Applicant.Country"));
		applicant.setApplicantRegion(_ctx.integerValue("DescribeTrademarkApplicationResponse.Applicant.ApplicantRegion"));
		applicant.setContactName(_ctx.stringValue("DescribeTrademarkApplicationResponse.Applicant.ContactName"));
		applicant.setLegalNoticeUrl(_ctx.stringValue("DescribeTrademarkApplicationResponse.Applicant.LegalNoticeUrl"));
		describeTrademarkApplicationResponse.setApplicant(applicant);

		FirstClassification firstClassification = new FirstClassification();
		firstClassification.setClassificationCode(_ctx.stringValue("DescribeTrademarkApplicationResponse.FirstClassification.ClassificationCode"));
		firstClassification.setClassificationName(_ctx.stringValue("DescribeTrademarkApplicationResponse.FirstClassification.ClassificationName"));
		describeTrademarkApplicationResponse.setFirstClassification(firstClassification);

		List<ThirdClassification> thirdClassifications = new ArrayList<ThirdClassification>();
		for (int i = 0; i < _ctx.lengthValue("DescribeTrademarkApplicationResponse.ThirdClassifications.Length"); i++) {
			ThirdClassification thirdClassification = new ThirdClassification();
			thirdClassification.setClassificationCode(_ctx.stringValue("DescribeTrademarkApplicationResponse.ThirdClassifications["+ i +"].ClassificationCode"));
			thirdClassification.setClassificationName(_ctx.stringValue("DescribeTrademarkApplicationResponse.ThirdClassifications["+ i +"].ClassificationName"));

			thirdClassifications.add(thirdClassification);
		}
		describeTrademarkApplicationResponse.setThirdClassifications(thirdClassifications);

		List<Supplement> supplements = new ArrayList<Supplement>();
		for (int i = 0; i < _ctx.lengthValue("DescribeTrademarkApplicationResponse.Supplements.Length"); i++) {
			Supplement supplement = new Supplement();
			supplement.setSupplementId(_ctx.longValue("DescribeTrademarkApplicationResponse.Supplements["+ i +"].SupplementId"));
			supplement.setSerialNumber(_ctx.stringValue("DescribeTrademarkApplicationResponse.Supplements["+ i +"].SerialNumber"));
			supplement.setApplicationType(_ctx.integerValue("DescribeTrademarkApplicationResponse.Supplements["+ i +"].ApplicationType"));
			supplement.setSupplementStatus(_ctx.integerValue("DescribeTrademarkApplicationResponse.Supplements["+ i +"].SupplementStatus"));
			supplement.setOrderId(_ctx.stringValue("DescribeTrademarkApplicationResponse.Supplements["+ i +"].OrderId"));
			supplement.setTrademarkNumber(_ctx.stringValue("DescribeTrademarkApplicationResponse.Supplements["+ i +"].TrademarkNumber"));
			supplement.setSendTime(_ctx.longValue("DescribeTrademarkApplicationResponse.Supplements["+ i +"].SendTime"));
			supplement.setAcceptTime(_ctx.longValue("DescribeTrademarkApplicationResponse.Supplements["+ i +"].AcceptTime"));
			supplement.setSbjExpirationDate(_ctx.longValue("DescribeTrademarkApplicationResponse.Supplements["+ i +"].SbjExpirationDate"));
			supplement.setAcceptExpirationDate(_ctx.longValue("DescribeTrademarkApplicationResponse.Supplements["+ i +"].AcceptExpirationDate"));
			supplement.setOfficialFile(_ctx.stringValue("DescribeTrademarkApplicationResponse.Supplements["+ i +"].OfficialFile"));
			supplement.setContent(_ctx.stringValue("DescribeTrademarkApplicationResponse.Supplements["+ i +"].Content"));
			supplement.setOperateTime(_ctx.longValue("DescribeTrademarkApplicationResponse.Supplements["+ i +"].OperateTime"));

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