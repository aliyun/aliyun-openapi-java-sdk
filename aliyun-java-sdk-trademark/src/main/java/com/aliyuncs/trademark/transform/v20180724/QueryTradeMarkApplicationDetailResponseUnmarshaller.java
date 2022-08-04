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

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.trademark.model.v20180724.QueryTradeMarkApplicationDetailResponse;
import com.aliyuncs.trademark.model.v20180724.QueryTradeMarkApplicationDetailResponse.AdminUploads;
import com.aliyuncs.trademark.model.v20180724.QueryTradeMarkApplicationDetailResponse.FirstClassification;
import com.aliyuncs.trademark.model.v20180724.QueryTradeMarkApplicationDetailResponse.MaterialDetail;
import com.aliyuncs.trademark.model.v20180724.QueryTradeMarkApplicationDetailResponse.RenewResponse;
import com.aliyuncs.trademark.model.v20180724.QueryTradeMarkApplicationDetailResponse.ReviewOfficialFiles;
import com.aliyuncs.trademark.model.v20180724.QueryTradeMarkApplicationDetailResponse.SupplementsItem;
import com.aliyuncs.trademark.model.v20180724.QueryTradeMarkApplicationDetailResponse.ThirdClassifications;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryTradeMarkApplicationDetailResponseUnmarshaller {

	public static QueryTradeMarkApplicationDetailResponse unmarshall(QueryTradeMarkApplicationDetailResponse queryTradeMarkApplicationDetailResponse, UnmarshallerContext _ctx) {
		
		queryTradeMarkApplicationDetailResponse.setRequestId(_ctx.stringValue("QueryTradeMarkApplicationDetailResponse.RequestId"));
		queryTradeMarkApplicationDetailResponse.setType(_ctx.integerValue("QueryTradeMarkApplicationDetailResponse.Type"));
		queryTradeMarkApplicationDetailResponse.setStatus(_ctx.integerValue("QueryTradeMarkApplicationDetailResponse.Status"));
		queryTradeMarkApplicationDetailResponse.setAcceptUrl(_ctx.stringValue("QueryTradeMarkApplicationDetailResponse.AcceptUrl"));
		queryTradeMarkApplicationDetailResponse.setOrderPrice(_ctx.floatValue("QueryTradeMarkApplicationDetailResponse.OrderPrice"));
		queryTradeMarkApplicationDetailResponse.setSubmitAuditTime(_ctx.longValue("QueryTradeMarkApplicationDetailResponse.SubmitAuditTime"));
		queryTradeMarkApplicationDetailResponse.setUpdateTime(_ctx.longValue("QueryTradeMarkApplicationDetailResponse.UpdateTime"));
		queryTradeMarkApplicationDetailResponse.setCreateTime(_ctx.longValue("QueryTradeMarkApplicationDetailResponse.CreateTime"));
		queryTradeMarkApplicationDetailResponse.setNotAcceptUrl(_ctx.stringValue("QueryTradeMarkApplicationDetailResponse.NotAcceptUrl"));
		queryTradeMarkApplicationDetailResponse.setSendTime(_ctx.stringValue("QueryTradeMarkApplicationDetailResponse.SendTime"));
		queryTradeMarkApplicationDetailResponse.setServicePrice(_ctx.floatValue("QueryTradeMarkApplicationDetailResponse.ServicePrice"));
		queryTradeMarkApplicationDetailResponse.setPartnerMobile(_ctx.stringValue("QueryTradeMarkApplicationDetailResponse.PartnerMobile"));
		queryTradeMarkApplicationDetailResponse.setRecvUserLogistics(_ctx.stringValue("QueryTradeMarkApplicationDetailResponse.RecvUserLogistics"));
		queryTradeMarkApplicationDetailResponse.setGrayIconUrl(_ctx.stringValue("QueryTradeMarkApplicationDetailResponse.GrayIconUrl"));
		queryTradeMarkApplicationDetailResponse.setMaterialId(_ctx.longValue("QueryTradeMarkApplicationDetailResponse.MaterialId"));
		queryTradeMarkApplicationDetailResponse.setSendSbjLogistics(_ctx.stringValue("QueryTradeMarkApplicationDetailResponse.SendSbjLogistics"));
		queryTradeMarkApplicationDetailResponse.setSendUserLogistics(_ctx.stringValue("QueryTradeMarkApplicationDetailResponse.SendUserLogistics"));
		queryTradeMarkApplicationDetailResponse.setLoaUrl(_ctx.stringValue("QueryTradeMarkApplicationDetailResponse.LoaUrl"));
		queryTradeMarkApplicationDetailResponse.setLegalNoticeUrl(_ctx.stringValue("QueryTradeMarkApplicationDetailResponse.LegalNoticeUrl"));
		queryTradeMarkApplicationDetailResponse.setTmNumber(_ctx.stringValue("QueryTradeMarkApplicationDetailResponse.TmNumber"));
		queryTradeMarkApplicationDetailResponse.setNote(_ctx.stringValue("QueryTradeMarkApplicationDetailResponse.Note"));
		queryTradeMarkApplicationDetailResponse.setPrincipalName(_ctx.integerValue("QueryTradeMarkApplicationDetailResponse.PrincipalName"));
		queryTradeMarkApplicationDetailResponse.setPartnerName(_ctx.stringValue("QueryTradeMarkApplicationDetailResponse.PartnerName"));
		queryTradeMarkApplicationDetailResponse.setLogisticsCertificateUrl(_ctx.stringValue("QueryTradeMarkApplicationDetailResponse.LogisticsCertificateUrl"));
		queryTradeMarkApplicationDetailResponse.setBizId(_ctx.stringValue("QueryTradeMarkApplicationDetailResponse.BizId"));
		queryTradeMarkApplicationDetailResponse.setPartnerCode(_ctx.stringValue("QueryTradeMarkApplicationDetailResponse.PartnerCode"));
		queryTradeMarkApplicationDetailResponse.setTmNameType(_ctx.integerValue("QueryTradeMarkApplicationDetailResponse.TmNameType"));
		queryTradeMarkApplicationDetailResponse.setExtendInfo(_ctx.mapValue("QueryTradeMarkApplicationDetailResponse.ExtendInfo"));
		queryTradeMarkApplicationDetailResponse.setTmIcon(_ctx.stringValue("QueryTradeMarkApplicationDetailResponse.TmIcon"));
		queryTradeMarkApplicationDetailResponse.setTmName(_ctx.stringValue("QueryTradeMarkApplicationDetailResponse.TmName"));
		queryTradeMarkApplicationDetailResponse.setLogisticsNo(_ctx.stringValue("QueryTradeMarkApplicationDetailResponse.LogisticsNo"));
		queryTradeMarkApplicationDetailResponse.setTotalPrice(_ctx.floatValue("QueryTradeMarkApplicationDetailResponse.TotalPrice"));
		queryTradeMarkApplicationDetailResponse.setSubmitTime(_ctx.longValue("QueryTradeMarkApplicationDetailResponse.SubmitTime"));
		queryTradeMarkApplicationDetailResponse.setOrderId(_ctx.stringValue("QueryTradeMarkApplicationDetailResponse.OrderId"));

		List<String> receiptUrl = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("QueryTradeMarkApplicationDetailResponse.ReceiptUrl.Length"); i++) {
			receiptUrl.add(_ctx.stringValue("QueryTradeMarkApplicationDetailResponse.ReceiptUrl["+ i +"]"));
		}
		queryTradeMarkApplicationDetailResponse.setReceiptUrl(receiptUrl);

		List<String> judgeResultUrl = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("QueryTradeMarkApplicationDetailResponse.JudgeResultUrl.Length"); i++) {
			judgeResultUrl.add(_ctx.stringValue("QueryTradeMarkApplicationDetailResponse.JudgeResultUrl["+ i +"]"));
		}
		queryTradeMarkApplicationDetailResponse.setJudgeResultUrl(judgeResultUrl);

		List<Integer> flags = new ArrayList<Integer>();
		for (int i = 0; i < _ctx.lengthValue("QueryTradeMarkApplicationDetailResponse.Flags.Length"); i++) {
			flags.add(_ctx.integerValue("QueryTradeMarkApplicationDetailResponse.Flags["+ i +"]"));
		}
		queryTradeMarkApplicationDetailResponse.setFlags(flags);

		AdminUploads adminUploads = new AdminUploads();
		adminUploads.setLoaPicUrl(_ctx.stringValue("QueryTradeMarkApplicationDetailResponse.AdminUploads.LoaPicUrl"));
		adminUploads.setLicensePicUrl(_ctx.stringValue("QueryTradeMarkApplicationDetailResponse.AdminUploads.LicensePicUrl"));
		queryTradeMarkApplicationDetailResponse.setAdminUploads(adminUploads);

		FirstClassification firstClassification = new FirstClassification();
		firstClassification.setName(_ctx.stringValue("QueryTradeMarkApplicationDetailResponse.FirstClassification.Name"));
		firstClassification.setCode(_ctx.stringValue("QueryTradeMarkApplicationDetailResponse.FirstClassification.Code"));
		queryTradeMarkApplicationDetailResponse.setFirstClassification(firstClassification);

		MaterialDetail materialDetail = new MaterialDetail();
		materialDetail.setType(_ctx.integerValue("QueryTradeMarkApplicationDetailResponse.MaterialDetail.Type"));
		materialDetail.setReviewApplicationFile(_ctx.stringValue("QueryTradeMarkApplicationDetailResponse.MaterialDetail.ReviewApplicationFile"));
		materialDetail.setStatus(_ctx.integerValue("QueryTradeMarkApplicationDetailResponse.MaterialDetail.Status"));
		materialDetail.setBusinessLicenceUrl(_ctx.stringValue("QueryTradeMarkApplicationDetailResponse.MaterialDetail.BusinessLicenceUrl"));
		materialDetail.setPassportUrl(_ctx.stringValue("QueryTradeMarkApplicationDetailResponse.MaterialDetail.PassportUrl"));
		materialDetail.setCity(_ctx.stringValue("QueryTradeMarkApplicationDetailResponse.MaterialDetail.City"));
		materialDetail.setLegalNoticeUrl(_ctx.stringValue("QueryTradeMarkApplicationDetailResponse.MaterialDetail.LegalNoticeUrl"));
		materialDetail.setEAddress(_ctx.stringValue("QueryTradeMarkApplicationDetailResponse.MaterialDetail.EAddress"));
		materialDetail.setContactEmail(_ctx.stringValue("QueryTradeMarkApplicationDetailResponse.MaterialDetail.ContactEmail"));
		materialDetail.setRegion(_ctx.integerValue("QueryTradeMarkApplicationDetailResponse.MaterialDetail.Region"));
		materialDetail.setLoaUrl(_ctx.stringValue("QueryTradeMarkApplicationDetailResponse.MaterialDetail.LoaUrl"));
		materialDetail.setAddress(_ctx.stringValue("QueryTradeMarkApplicationDetailResponse.MaterialDetail.Address"));
		materialDetail.setPrincipalName(_ctx.integerValue("QueryTradeMarkApplicationDetailResponse.MaterialDetail.PrincipalName"));
		materialDetail.setName(_ctx.stringValue("QueryTradeMarkApplicationDetailResponse.MaterialDetail.Name"));
		materialDetail.setContactNumber(_ctx.stringValue("QueryTradeMarkApplicationDetailResponse.MaterialDetail.ContactNumber"));
		materialDetail.setContactCity(_ctx.stringValue("QueryTradeMarkApplicationDetailResponse.MaterialDetail.ContactCity"));
		materialDetail.setContactDistrict(_ctx.stringValue("QueryTradeMarkApplicationDetailResponse.MaterialDetail.ContactDistrict"));
		materialDetail.setContactProvince(_ctx.stringValue("QueryTradeMarkApplicationDetailResponse.MaterialDetail.ContactProvince"));
		materialDetail.setContactAddress(_ctx.stringValue("QueryTradeMarkApplicationDetailResponse.MaterialDetail.ContactAddress"));
		materialDetail.setContactZipcode(_ctx.stringValue("QueryTradeMarkApplicationDetailResponse.MaterialDetail.ContactZipcode"));
		materialDetail.setContactName(_ctx.stringValue("QueryTradeMarkApplicationDetailResponse.MaterialDetail.ContactName"));
		materialDetail.setEName(_ctx.stringValue("QueryTradeMarkApplicationDetailResponse.MaterialDetail.EName"));
		materialDetail.setCardNumber(_ctx.stringValue("QueryTradeMarkApplicationDetailResponse.MaterialDetail.CardNumber"));
		materialDetail.setExpirationDate(_ctx.stringValue("QueryTradeMarkApplicationDetailResponse.MaterialDetail.ExpirationDate"));
		materialDetail.setIdCardUrl(_ctx.stringValue("QueryTradeMarkApplicationDetailResponse.MaterialDetail.IdCardUrl"));
		materialDetail.setCountry(_ctx.stringValue("QueryTradeMarkApplicationDetailResponse.MaterialDetail.Country"));
		materialDetail.setTown(_ctx.stringValue("QueryTradeMarkApplicationDetailResponse.MaterialDetail.Town"));
		materialDetail.setProvince(_ctx.stringValue("QueryTradeMarkApplicationDetailResponse.MaterialDetail.Province"));
		materialDetail.setDetailedContactAddress(_ctx.stringValue("QueryTradeMarkApplicationDetailResponse.MaterialDetail.DetailedContactAddress"));
		materialDetail.setIdCardNumber(_ctx.stringValue("QueryTradeMarkApplicationDetailResponse.MaterialDetail.IdCardNumber"));
		materialDetail.setPersonalType(_ctx.longValue("QueryTradeMarkApplicationDetailResponse.MaterialDetail.PersonalType"));
		materialDetail.setIdCardName(_ctx.stringValue("QueryTradeMarkApplicationDetailResponse.MaterialDetail.IdCardName"));
		materialDetail.setMaterialVersion(_ctx.stringValue("QueryTradeMarkApplicationDetailResponse.MaterialDetail.MaterialVersion"));

		List<String> reviewAdditionalFiles = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("QueryTradeMarkApplicationDetailResponse.MaterialDetail.ReviewAdditionalFiles.Length"); i++) {
			reviewAdditionalFiles.add(_ctx.stringValue("QueryTradeMarkApplicationDetailResponse.MaterialDetail.ReviewAdditionalFiles["+ i +"]"));
		}
		materialDetail.setReviewAdditionalFiles(reviewAdditionalFiles);
		queryTradeMarkApplicationDetailResponse.setMaterialDetail(materialDetail);

		RenewResponse renewResponse = new RenewResponse();
		renewResponse.setEngName(_ctx.stringValue("QueryTradeMarkApplicationDetailResponse.RenewResponse.EngName"));
		renewResponse.setRegisterTime(_ctx.longValue("QueryTradeMarkApplicationDetailResponse.RenewResponse.RegisterTime"));
		renewResponse.setEngAddress(_ctx.stringValue("QueryTradeMarkApplicationDetailResponse.RenewResponse.EngAddress"));
		renewResponse.setAddress(_ctx.stringValue("QueryTradeMarkApplicationDetailResponse.RenewResponse.Address"));
		renewResponse.setName(_ctx.stringValue("QueryTradeMarkApplicationDetailResponse.RenewResponse.Name"));
		renewResponse.setSubmitSbjtime(_ctx.longValue("QueryTradeMarkApplicationDetailResponse.RenewResponse.SubmitSbjtime"));
		queryTradeMarkApplicationDetailResponse.setRenewResponse(renewResponse);

		ReviewOfficialFiles reviewOfficialFiles = new ReviewOfficialFiles();
		reviewOfficialFiles.setReviewKeep(_ctx.stringValue("QueryTradeMarkApplicationDetailResponse.ReviewOfficialFiles.ReviewKeep"));
		reviewOfficialFiles.setReviewAudit(_ctx.stringValue("QueryTradeMarkApplicationDetailResponse.ReviewOfficialFiles.ReviewAudit"));
		reviewOfficialFiles.setReviewPart(_ctx.stringValue("QueryTradeMarkApplicationDetailResponse.ReviewOfficialFiles.ReviewPart"));
		reviewOfficialFiles.setReviewPass(_ctx.stringValue("QueryTradeMarkApplicationDetailResponse.ReviewOfficialFiles.ReviewPass"));

		List<String> reviewSupplements = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("QueryTradeMarkApplicationDetailResponse.ReviewOfficialFiles.ReviewSupplements.Length"); i++) {
			reviewSupplements.add(_ctx.stringValue("QueryTradeMarkApplicationDetailResponse.ReviewOfficialFiles.ReviewSupplements["+ i +"]"));
		}
		reviewOfficialFiles.setReviewSupplements(reviewSupplements);
		queryTradeMarkApplicationDetailResponse.setReviewOfficialFiles(reviewOfficialFiles);

		List<SupplementsItem> supplements = new ArrayList<SupplementsItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryTradeMarkApplicationDetailResponse.Supplements.Length"); i++) {
			SupplementsItem supplementsItem = new SupplementsItem();
			supplementsItem.setType(_ctx.integerValue("QueryTradeMarkApplicationDetailResponse.Supplements["+ i +"].Type"));
			supplementsItem.setOperateTime(_ctx.longValue("QueryTradeMarkApplicationDetailResponse.Supplements["+ i +"].OperateTime"));
			supplementsItem.setSerialNumber(_ctx.stringValue("QueryTradeMarkApplicationDetailResponse.Supplements["+ i +"].SerialNumber"));
			supplementsItem.setStatus(_ctx.integerValue("QueryTradeMarkApplicationDetailResponse.Supplements["+ i +"].Status"));
			supplementsItem.setSbjDeadTime(_ctx.longValue("QueryTradeMarkApplicationDetailResponse.Supplements["+ i +"].SbjDeadTime"));
			supplementsItem.setAcceptDeadTime(_ctx.longValue("QueryTradeMarkApplicationDetailResponse.Supplements["+ i +"].AcceptDeadTime"));
			supplementsItem.setSendTime(_ctx.longValue("QueryTradeMarkApplicationDetailResponse.Supplements["+ i +"].SendTime"));
			supplementsItem.setBatchNum(_ctx.stringValue("QueryTradeMarkApplicationDetailResponse.Supplements["+ i +"].BatchNum"));
			supplementsItem.setAcceptTime(_ctx.longValue("QueryTradeMarkApplicationDetailResponse.Supplements["+ i +"].AcceptTime"));
			supplementsItem.setTmNumber(_ctx.stringValue("QueryTradeMarkApplicationDetailResponse.Supplements["+ i +"].TmNumber"));
			supplementsItem.setUploadFileTemplateUrl(_ctx.stringValue("QueryTradeMarkApplicationDetailResponse.Supplements["+ i +"].UploadFileTemplateUrl"));
			supplementsItem.setContent(_ctx.stringValue("QueryTradeMarkApplicationDetailResponse.Supplements["+ i +"].Content"));
			supplementsItem.setId(_ctx.longValue("QueryTradeMarkApplicationDetailResponse.Supplements["+ i +"].Id"));
			supplementsItem.setOrderId(_ctx.stringValue("QueryTradeMarkApplicationDetailResponse.Supplements["+ i +"].OrderId"));

			List<String> fileTemplateUrls = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("QueryTradeMarkApplicationDetailResponse.Supplements["+ i +"].FileTemplateUrls.Length"); j++) {
				fileTemplateUrls.add(_ctx.stringValue("QueryTradeMarkApplicationDetailResponse.Supplements["+ i +"].FileTemplateUrls["+ j +"]"));
			}
			supplementsItem.setFileTemplateUrls(fileTemplateUrls);

			supplements.add(supplementsItem);
		}
		queryTradeMarkApplicationDetailResponse.setSupplements(supplements);

		List<ThirdClassifications> thirdClassification = new ArrayList<ThirdClassifications>();
		for (int i = 0; i < _ctx.lengthValue("QueryTradeMarkApplicationDetailResponse.ThirdClassification.Length"); i++) {
			ThirdClassifications thirdClassifications = new ThirdClassifications();
			thirdClassifications.setName(_ctx.stringValue("QueryTradeMarkApplicationDetailResponse.ThirdClassification["+ i +"].Name"));
			thirdClassifications.setCode(_ctx.stringValue("QueryTradeMarkApplicationDetailResponse.ThirdClassification["+ i +"].Code"));

			thirdClassification.add(thirdClassifications);
		}
		queryTradeMarkApplicationDetailResponse.setThirdClassification(thirdClassification);
	 
	 	return queryTradeMarkApplicationDetailResponse;
	}
}