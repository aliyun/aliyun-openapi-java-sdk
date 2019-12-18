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
		queryTradeMarkApplicationDetailResponse.setStatus(_ctx.integerValue("QueryTradeMarkApplicationDetailResponse.Status"));
		queryTradeMarkApplicationDetailResponse.setLoaUrl(_ctx.stringValue("QueryTradeMarkApplicationDetailResponse.LoaUrl"));
		queryTradeMarkApplicationDetailResponse.setOrderPrice(_ctx.floatValue("QueryTradeMarkApplicationDetailResponse.OrderPrice"));
		queryTradeMarkApplicationDetailResponse.setTmIcon(_ctx.stringValue("QueryTradeMarkApplicationDetailResponse.TmIcon"));
		queryTradeMarkApplicationDetailResponse.setOrderId(_ctx.stringValue("QueryTradeMarkApplicationDetailResponse.OrderId"));
		queryTradeMarkApplicationDetailResponse.setType(_ctx.integerValue("QueryTradeMarkApplicationDetailResponse.Type"));
		queryTradeMarkApplicationDetailResponse.setTmNameType(_ctx.integerValue("QueryTradeMarkApplicationDetailResponse.TmNameType"));
		queryTradeMarkApplicationDetailResponse.setTmName(_ctx.stringValue("QueryTradeMarkApplicationDetailResponse.TmName"));
		queryTradeMarkApplicationDetailResponse.setBizId(_ctx.stringValue("QueryTradeMarkApplicationDetailResponse.BizId"));
		queryTradeMarkApplicationDetailResponse.setGrayIconUrl(_ctx.stringValue("QueryTradeMarkApplicationDetailResponse.GrayIconUrl"));
		queryTradeMarkApplicationDetailResponse.setNote(_ctx.stringValue("QueryTradeMarkApplicationDetailResponse.Note"));
		queryTradeMarkApplicationDetailResponse.setTmNumber(_ctx.stringValue("QueryTradeMarkApplicationDetailResponse.TmNumber"));
		queryTradeMarkApplicationDetailResponse.setAcceptUrl(_ctx.stringValue("QueryTradeMarkApplicationDetailResponse.AcceptUrl"));
		queryTradeMarkApplicationDetailResponse.setCreateTime(_ctx.longValue("QueryTradeMarkApplicationDetailResponse.CreateTime"));
		queryTradeMarkApplicationDetailResponse.setUpdateTime(_ctx.longValue("QueryTradeMarkApplicationDetailResponse.UpdateTime"));
		queryTradeMarkApplicationDetailResponse.setExtendInfo(_ctx.mapValue("QueryTradeMarkApplicationDetailResponse.ExtendInfo"));
		queryTradeMarkApplicationDetailResponse.setSendSbjLogistics(_ctx.stringValue("QueryTradeMarkApplicationDetailResponse.SendSbjLogistics"));
		queryTradeMarkApplicationDetailResponse.setSendUserLogistics(_ctx.stringValue("QueryTradeMarkApplicationDetailResponse.SendUserLogistics"));
		queryTradeMarkApplicationDetailResponse.setRecvUserLogistics(_ctx.stringValue("QueryTradeMarkApplicationDetailResponse.RecvUserLogistics"));
		queryTradeMarkApplicationDetailResponse.setMaterialId(_ctx.longValue("QueryTradeMarkApplicationDetailResponse.MaterialId"));
		queryTradeMarkApplicationDetailResponse.setTotalPrice(_ctx.floatValue("QueryTradeMarkApplicationDetailResponse.TotalPrice"));
		queryTradeMarkApplicationDetailResponse.setServicePrice(_ctx.floatValue("QueryTradeMarkApplicationDetailResponse.ServicePrice"));
		queryTradeMarkApplicationDetailResponse.setPartnerCode(_ctx.stringValue("QueryTradeMarkApplicationDetailResponse.PartnerCode"));
		queryTradeMarkApplicationDetailResponse.setPartnerMobile(_ctx.stringValue("QueryTradeMarkApplicationDetailResponse.PartnerMobile"));
		queryTradeMarkApplicationDetailResponse.setNotAcceptUrl(_ctx.stringValue("QueryTradeMarkApplicationDetailResponse.NotAcceptUrl"));
		queryTradeMarkApplicationDetailResponse.setPartnerName(_ctx.stringValue("QueryTradeMarkApplicationDetailResponse.PartnerName"));

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

		MaterialDetail materialDetail = new MaterialDetail();
		materialDetail.setCardNumber(_ctx.stringValue("QueryTradeMarkApplicationDetailResponse.MaterialDetail.CardNumber"));
		materialDetail.setContactAddress(_ctx.stringValue("QueryTradeMarkApplicationDetailResponse.MaterialDetail.ContactAddress"));
		materialDetail.setStatus(_ctx.integerValue("QueryTradeMarkApplicationDetailResponse.MaterialDetail.Status"));
		materialDetail.setEName(_ctx.stringValue("QueryTradeMarkApplicationDetailResponse.MaterialDetail.EName"));
		materialDetail.setAddress(_ctx.stringValue("QueryTradeMarkApplicationDetailResponse.MaterialDetail.Address"));
		materialDetail.setLoaUrl(_ctx.stringValue("QueryTradeMarkApplicationDetailResponse.MaterialDetail.LoaUrl"));
		materialDetail.setCity(_ctx.stringValue("QueryTradeMarkApplicationDetailResponse.MaterialDetail.City"));
		materialDetail.setPassportUrl(_ctx.stringValue("QueryTradeMarkApplicationDetailResponse.MaterialDetail.PassportUrl"));
		materialDetail.setProvince(_ctx.stringValue("QueryTradeMarkApplicationDetailResponse.MaterialDetail.Province"));
		materialDetail.setEAddress(_ctx.stringValue("QueryTradeMarkApplicationDetailResponse.MaterialDetail.EAddress"));
		materialDetail.setName(_ctx.stringValue("QueryTradeMarkApplicationDetailResponse.MaterialDetail.Name"));
		materialDetail.setIdCardUrl(_ctx.stringValue("QueryTradeMarkApplicationDetailResponse.MaterialDetail.IdCardUrl"));
		materialDetail.setBusinessLicenceUrl(_ctx.stringValue("QueryTradeMarkApplicationDetailResponse.MaterialDetail.BusinessLicenceUrl"));
		materialDetail.setType(_ctx.integerValue("QueryTradeMarkApplicationDetailResponse.MaterialDetail.Type"));
		materialDetail.setExpirationDate(_ctx.stringValue("QueryTradeMarkApplicationDetailResponse.MaterialDetail.ExpirationDate"));
		materialDetail.setContactZipcode(_ctx.stringValue("QueryTradeMarkApplicationDetailResponse.MaterialDetail.ContactZipcode"));
		materialDetail.setTown(_ctx.stringValue("QueryTradeMarkApplicationDetailResponse.MaterialDetail.Town"));
		materialDetail.setContactNumber(_ctx.stringValue("QueryTradeMarkApplicationDetailResponse.MaterialDetail.ContactNumber"));
		materialDetail.setContactEmail(_ctx.stringValue("QueryTradeMarkApplicationDetailResponse.MaterialDetail.ContactEmail"));
		materialDetail.setCountry(_ctx.stringValue("QueryTradeMarkApplicationDetailResponse.MaterialDetail.Country"));
		materialDetail.setRegion(_ctx.integerValue("QueryTradeMarkApplicationDetailResponse.MaterialDetail.Region"));
		materialDetail.setContactName(_ctx.stringValue("QueryTradeMarkApplicationDetailResponse.MaterialDetail.ContactName"));
		materialDetail.setLegalNoticeUrl(_ctx.stringValue("QueryTradeMarkApplicationDetailResponse.MaterialDetail.LegalNoticeUrl"));
		materialDetail.setReviewApplicationFile(_ctx.stringValue("QueryTradeMarkApplicationDetailResponse.MaterialDetail.ReviewApplicationFile"));

		List<String> reviewAdditionalFiles = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("QueryTradeMarkApplicationDetailResponse.MaterialDetail.ReviewAdditionalFiles.Length"); i++) {
			reviewAdditionalFiles.add(_ctx.stringValue("QueryTradeMarkApplicationDetailResponse.MaterialDetail.ReviewAdditionalFiles["+ i +"]"));
		}
		materialDetail.setReviewAdditionalFiles(reviewAdditionalFiles);
		queryTradeMarkApplicationDetailResponse.setMaterialDetail(materialDetail);

		FirstClassification firstClassification = new FirstClassification();
		firstClassification.setCode(_ctx.stringValue("QueryTradeMarkApplicationDetailResponse.FirstClassification.Code"));
		firstClassification.setName(_ctx.stringValue("QueryTradeMarkApplicationDetailResponse.FirstClassification.Name"));
		queryTradeMarkApplicationDetailResponse.setFirstClassification(firstClassification);

		RenewResponse renewResponse = new RenewResponse();
		renewResponse.setName(_ctx.stringValue("QueryTradeMarkApplicationDetailResponse.RenewResponse.Name"));
		renewResponse.setEngName(_ctx.stringValue("QueryTradeMarkApplicationDetailResponse.RenewResponse.EngName"));
		renewResponse.setAddress(_ctx.stringValue("QueryTradeMarkApplicationDetailResponse.RenewResponse.Address"));
		renewResponse.setEngAddress(_ctx.stringValue("QueryTradeMarkApplicationDetailResponse.RenewResponse.EngAddress"));
		renewResponse.setRegisterTime(_ctx.longValue("QueryTradeMarkApplicationDetailResponse.RenewResponse.RegisterTime"));
		renewResponse.setSubmitSbjtime(_ctx.longValue("QueryTradeMarkApplicationDetailResponse.RenewResponse.SubmitSbjtime"));
		queryTradeMarkApplicationDetailResponse.setRenewResponse(renewResponse);

		ReviewOfficialFiles reviewOfficialFiles = new ReviewOfficialFiles();
		reviewOfficialFiles.setReviewAudit(_ctx.stringValue("QueryTradeMarkApplicationDetailResponse.ReviewOfficialFiles.ReviewAudit"));
		reviewOfficialFiles.setReviewPass(_ctx.stringValue("QueryTradeMarkApplicationDetailResponse.ReviewOfficialFiles.ReviewPass"));
		reviewOfficialFiles.setReviewKeep(_ctx.stringValue("QueryTradeMarkApplicationDetailResponse.ReviewOfficialFiles.ReviewKeep"));
		reviewOfficialFiles.setReviewPart(_ctx.stringValue("QueryTradeMarkApplicationDetailResponse.ReviewOfficialFiles.ReviewPart"));

		List<String> reviewSupplements = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("QueryTradeMarkApplicationDetailResponse.ReviewOfficialFiles.ReviewSupplements.Length"); i++) {
			reviewSupplements.add(_ctx.stringValue("QueryTradeMarkApplicationDetailResponse.ReviewOfficialFiles.ReviewSupplements["+ i +"]"));
		}
		reviewOfficialFiles.setReviewSupplements(reviewSupplements);
		queryTradeMarkApplicationDetailResponse.setReviewOfficialFiles(reviewOfficialFiles);

		List<ThirdClassifications> thirdClassification = new ArrayList<ThirdClassifications>();
		for (int i = 0; i < _ctx.lengthValue("QueryTradeMarkApplicationDetailResponse.ThirdClassification.Length"); i++) {
			ThirdClassifications thirdClassifications = new ThirdClassifications();
			thirdClassifications.setCode(_ctx.stringValue("QueryTradeMarkApplicationDetailResponse.ThirdClassification["+ i +"].Code"));
			thirdClassifications.setName(_ctx.stringValue("QueryTradeMarkApplicationDetailResponse.ThirdClassification["+ i +"].Name"));

			thirdClassification.add(thirdClassifications);
		}
		queryTradeMarkApplicationDetailResponse.setThirdClassification(thirdClassification);

		List<SupplementsItem> supplements = new ArrayList<SupplementsItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryTradeMarkApplicationDetailResponse.Supplements.Length"); i++) {
			SupplementsItem supplementsItem = new SupplementsItem();
			supplementsItem.setId(_ctx.longValue("QueryTradeMarkApplicationDetailResponse.Supplements["+ i +"].Id"));
			supplementsItem.setSerialNumber(_ctx.stringValue("QueryTradeMarkApplicationDetailResponse.Supplements["+ i +"].SerialNumber"));
			supplementsItem.setType(_ctx.integerValue("QueryTradeMarkApplicationDetailResponse.Supplements["+ i +"].Type"));
			supplementsItem.setStatus(_ctx.integerValue("QueryTradeMarkApplicationDetailResponse.Supplements["+ i +"].Status"));
			supplementsItem.setOrderId(_ctx.stringValue("QueryTradeMarkApplicationDetailResponse.Supplements["+ i +"].OrderId"));
			supplementsItem.setTmNumber(_ctx.stringValue("QueryTradeMarkApplicationDetailResponse.Supplements["+ i +"].TmNumber"));
			supplementsItem.setSendTime(_ctx.longValue("QueryTradeMarkApplicationDetailResponse.Supplements["+ i +"].SendTime"));
			supplementsItem.setAcceptTime(_ctx.longValue("QueryTradeMarkApplicationDetailResponse.Supplements["+ i +"].AcceptTime"));
			supplementsItem.setSbjDeadTime(_ctx.longValue("QueryTradeMarkApplicationDetailResponse.Supplements["+ i +"].SbjDeadTime"));
			supplementsItem.setAcceptDeadTime(_ctx.longValue("QueryTradeMarkApplicationDetailResponse.Supplements["+ i +"].AcceptDeadTime"));
			supplementsItem.setUploadFileTemplateUrl(_ctx.stringValue("QueryTradeMarkApplicationDetailResponse.Supplements["+ i +"].UploadFileTemplateUrl"));
			supplementsItem.setContent(_ctx.stringValue("QueryTradeMarkApplicationDetailResponse.Supplements["+ i +"].Content"));
			supplementsItem.setBatchNum(_ctx.stringValue("QueryTradeMarkApplicationDetailResponse.Supplements["+ i +"].BatchNum"));
			supplementsItem.setOperateTime(_ctx.longValue("QueryTradeMarkApplicationDetailResponse.Supplements["+ i +"].OperateTime"));

			List<String> fileTemplateUrls = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("QueryTradeMarkApplicationDetailResponse.Supplements["+ i +"].FileTemplateUrls.Length"); j++) {
				fileTemplateUrls.add(_ctx.stringValue("QueryTradeMarkApplicationDetailResponse.Supplements["+ i +"].FileTemplateUrls["+ j +"]"));
			}
			supplementsItem.setFileTemplateUrls(fileTemplateUrls);

			supplements.add(supplementsItem);
		}
		queryTradeMarkApplicationDetailResponse.setSupplements(supplements);
	 
	 	return queryTradeMarkApplicationDetailResponse;
	}
}