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
import com.aliyuncs.trademark.model.v20180724.QueryTradeMarkApplicationDetailResponse.FirstClassification;
import com.aliyuncs.trademark.model.v20180724.QueryTradeMarkApplicationDetailResponse.MaterialDetail;
import com.aliyuncs.trademark.model.v20180724.QueryTradeMarkApplicationDetailResponse.ThirdClassifications;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryTradeMarkApplicationDetailResponseUnmarshaller {

	public static QueryTradeMarkApplicationDetailResponse unmarshall(QueryTradeMarkApplicationDetailResponse queryTradeMarkApplicationDetailResponse, UnmarshallerContext context) {
		
		queryTradeMarkApplicationDetailResponse.setRequestId(context.stringValue("QueryTradeMarkApplicationDetailResponse.RequestId"));
		queryTradeMarkApplicationDetailResponse.setStatus(context.integerValue("QueryTradeMarkApplicationDetailResponse.Status"));
		queryTradeMarkApplicationDetailResponse.setLoaUrl(context.stringValue("QueryTradeMarkApplicationDetailResponse.LoaUrl"));
		queryTradeMarkApplicationDetailResponse.setOrderPrice(context.integerValue("QueryTradeMarkApplicationDetailResponse.OrderPrice"));
		queryTradeMarkApplicationDetailResponse.setTmIcon(context.stringValue("QueryTradeMarkApplicationDetailResponse.TmIcon"));
		queryTradeMarkApplicationDetailResponse.setOrderId(context.stringValue("QueryTradeMarkApplicationDetailResponse.OrderId"));
		queryTradeMarkApplicationDetailResponse.setType(context.integerValue("QueryTradeMarkApplicationDetailResponse.Type"));
		queryTradeMarkApplicationDetailResponse.setTmNameType(context.integerValue("QueryTradeMarkApplicationDetailResponse.TmNameType"));
		queryTradeMarkApplicationDetailResponse.setTmName(context.stringValue("QueryTradeMarkApplicationDetailResponse.TmName"));
		queryTradeMarkApplicationDetailResponse.setBizId(context.stringValue("QueryTradeMarkApplicationDetailResponse.BizId"));
		queryTradeMarkApplicationDetailResponse.setGrayIconUrl(context.stringValue("QueryTradeMarkApplicationDetailResponse.GrayIconUrl"));
		queryTradeMarkApplicationDetailResponse.setNote(context.stringValue("QueryTradeMarkApplicationDetailResponse.Note"));
		queryTradeMarkApplicationDetailResponse.setTmNumber(context.stringValue("QueryTradeMarkApplicationDetailResponse.TmNumber"));

		List<String> receiptUrl = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("QueryTradeMarkApplicationDetailResponse.ReceiptUrl.Length"); i++) {
			receiptUrl.add(context.stringValue("QueryTradeMarkApplicationDetailResponse.ReceiptUrl["+ i +"]"));
		}
		queryTradeMarkApplicationDetailResponse.setReceiptUrl(receiptUrl);

		MaterialDetail materialDetail = new MaterialDetail();
		materialDetail.setCardNumber(context.stringValue("QueryTradeMarkApplicationDetailResponse.MaterialDetail.CardNumber"));
		materialDetail.setContactAddress(context.stringValue("QueryTradeMarkApplicationDetailResponse.MaterialDetail.ContactAddress"));
		materialDetail.setStatus(context.integerValue("QueryTradeMarkApplicationDetailResponse.MaterialDetail.Status"));
		materialDetail.setEName(context.stringValue("QueryTradeMarkApplicationDetailResponse.MaterialDetail.EName"));
		materialDetail.setAddress(context.stringValue("QueryTradeMarkApplicationDetailResponse.MaterialDetail.Address"));
		materialDetail.setLoaUrl(context.stringValue("QueryTradeMarkApplicationDetailResponse.MaterialDetail.LoaUrl"));
		materialDetail.setCity(context.stringValue("QueryTradeMarkApplicationDetailResponse.MaterialDetail.City"));
		materialDetail.setPassportUrl(context.stringValue("QueryTradeMarkApplicationDetailResponse.MaterialDetail.PassportUrl"));
		materialDetail.setProvince(context.stringValue("QueryTradeMarkApplicationDetailResponse.MaterialDetail.Province"));
		materialDetail.setEAddress(context.stringValue("QueryTradeMarkApplicationDetailResponse.MaterialDetail.EAddress"));
		materialDetail.setName(context.stringValue("QueryTradeMarkApplicationDetailResponse.MaterialDetail.Name"));
		materialDetail.setIdCardUrl(context.stringValue("QueryTradeMarkApplicationDetailResponse.MaterialDetail.IdCardUrl"));
		materialDetail.setBusinessLicenceUrl(context.stringValue("QueryTradeMarkApplicationDetailResponse.MaterialDetail.BusinessLicenceUrl"));
		materialDetail.setType(context.integerValue("QueryTradeMarkApplicationDetailResponse.MaterialDetail.Type"));
		materialDetail.setExpirationDate(context.stringValue("QueryTradeMarkApplicationDetailResponse.MaterialDetail.ExpirationDate"));
		materialDetail.setContactZipcode(context.stringValue("QueryTradeMarkApplicationDetailResponse.MaterialDetail.ContactZipcode"));
		materialDetail.setTown(context.stringValue("QueryTradeMarkApplicationDetailResponse.MaterialDetail.Town"));
		materialDetail.setContactNumber(context.stringValue("QueryTradeMarkApplicationDetailResponse.MaterialDetail.ContactNumber"));
		materialDetail.setContactEmail(context.stringValue("QueryTradeMarkApplicationDetailResponse.MaterialDetail.ContactEmail"));
		materialDetail.setCountry(context.stringValue("QueryTradeMarkApplicationDetailResponse.MaterialDetail.Country"));
		materialDetail.setRegion(context.integerValue("QueryTradeMarkApplicationDetailResponse.MaterialDetail.Region"));
		materialDetail.setContactName(context.stringValue("QueryTradeMarkApplicationDetailResponse.MaterialDetail.ContactName"));
		queryTradeMarkApplicationDetailResponse.setMaterialDetail(materialDetail);

		FirstClassification firstClassification = new FirstClassification();
		firstClassification.setCode(context.stringValue("QueryTradeMarkApplicationDetailResponse.FirstClassification.Code"));
		firstClassification.setName(context.stringValue("QueryTradeMarkApplicationDetailResponse.FirstClassification.Name"));
		queryTradeMarkApplicationDetailResponse.setFirstClassification(firstClassification);

		List<ThirdClassifications> thirdClassification = new ArrayList<ThirdClassifications>();
		for (int i = 0; i < context.lengthValue("QueryTradeMarkApplicationDetailResponse.ThirdClassification.Length"); i++) {
			ThirdClassifications thirdClassifications = new ThirdClassifications();
			thirdClassifications.setCode(context.stringValue("QueryTradeMarkApplicationDetailResponse.ThirdClassification["+ i +"].Code"));
			thirdClassifications.setName(context.stringValue("QueryTradeMarkApplicationDetailResponse.ThirdClassification["+ i +"].Name"));

			thirdClassification.add(thirdClassifications);
		}
		queryTradeMarkApplicationDetailResponse.setThirdClassification(thirdClassification);
	 
	 	return queryTradeMarkApplicationDetailResponse;
	}
}