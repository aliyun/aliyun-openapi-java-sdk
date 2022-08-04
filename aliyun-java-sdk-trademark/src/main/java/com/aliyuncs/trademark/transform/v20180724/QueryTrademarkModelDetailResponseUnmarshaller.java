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

import com.aliyuncs.trademark.model.v20180724.QueryTrademarkModelDetailResponse;
import com.aliyuncs.trademark.model.v20180724.QueryTrademarkModelDetailResponse.Moudle;
import com.aliyuncs.trademark.model.v20180724.QueryTrademarkModelDetailResponse.Moudle.LeafCode;
import com.aliyuncs.trademark.model.v20180724.QueryTrademarkModelDetailResponse.Moudle.MaterialInfo;
import com.aliyuncs.trademark.model.v20180724.QueryTrademarkModelDetailResponse.Moudle.RootCode;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryTrademarkModelDetailResponseUnmarshaller {

	public static QueryTrademarkModelDetailResponse unmarshall(QueryTrademarkModelDetailResponse queryTrademarkModelDetailResponse, UnmarshallerContext _ctx) {
		

		Moudle moudle = new Moudle();
		moudle.setBizId(_ctx.stringValue("QueryTrademarkModelDetailResponse.Moudle.BizId"));
		moudle.setBizType(_ctx.stringValue("QueryTrademarkModelDetailResponse.Moudle.BizType"));
		moudle.setTrademarkNumber(_ctx.stringValue("QueryTrademarkModelDetailResponse.Moudle.TrademarkNumber"));
		moudle.setTrademarkName(_ctx.stringValue("QueryTrademarkModelDetailResponse.Moudle.TrademarkName"));
		moudle.setTrademarkNameType(_ctx.integerValue("QueryTrademarkModelDetailResponse.Moudle.TrademarkNameType"));
		moudle.setProduceType(_ctx.stringValue("QueryTrademarkModelDetailResponse.Moudle.ProduceType"));
		moudle.setStatus(_ctx.stringValue("QueryTrademarkModelDetailResponse.Moudle.Status"));
		moudle.setStatusStr(_ctx.stringValue("QueryTrademarkModelDetailResponse.Moudle.StatusStr"));
		moudle.setBitFlag(_ctx.integerValue("QueryTrademarkModelDetailResponse.Moudle.BitFlag"));
		moudle.setIcon(_ctx.stringValue("QueryTrademarkModelDetailResponse.Moudle.Icon"));
		moudle.setGrayIconUrl(_ctx.stringValue("QueryTrademarkModelDetailResponse.Moudle.GrayIconUrl"));
		moudle.setOrderId(_ctx.stringValue("QueryTrademarkModelDetailResponse.Moudle.OrderId"));
		moudle.setPartnerCode(_ctx.stringValue("QueryTrademarkModelDetailResponse.Moudle.PartnerCode"));
		moudle.setSubmitTimes(_ctx.integerValue("QueryTrademarkModelDetailResponse.Moudle.SubmitTimes"));
		moudle.setSubmitStatus(_ctx.stringValue("QueryTrademarkModelDetailResponse.Moudle.SubmitStatus"));
		moudle.setSubmitTimeValue(_ctx.longValue("QueryTrademarkModelDetailResponse.Moudle.SubmitTimeValue"));
		moudle.setSubmitTimeStr(_ctx.stringValue("QueryTrademarkModelDetailResponse.Moudle.SubmitTimeStr"));
		moudle.setSubmitAuditTimeValue(_ctx.longValue("QueryTrademarkModelDetailResponse.Moudle.SubmitAuditTimeValue"));
		moudle.setSubmitAuditTimeStr(_ctx.stringValue("QueryTrademarkModelDetailResponse.Moudle.SubmitAuditTimeStr"));
		moudle.setPrincipalName(_ctx.stringValue("QueryTrademarkModelDetailResponse.Moudle.PrincipalName"));
		moudle.setPrincipalKey(_ctx.stringValue("QueryTrademarkModelDetailResponse.Moudle.PrincipalKey"));
		moudle.setExtendInfo(_ctx.mapValue("QueryTrademarkModelDetailResponse.Moudle.ExtendInfo"));
		moudle.setRequestId(_ctx.stringValue("QueryTrademarkModelDetailResponse.Moudle.RequestId"));

		MaterialInfo materialInfo = new MaterialInfo();
		materialInfo.setName(_ctx.stringValue("QueryTrademarkModelDetailResponse.Moudle.MaterialInfo.Name"));
		materialInfo.setType(_ctx.integerValue("QueryTrademarkModelDetailResponse.Moudle.MaterialInfo.Type"));
		materialInfo.setRegion(_ctx.integerValue("QueryTrademarkModelDetailResponse.Moudle.MaterialInfo.Region"));
		materialInfo.setLoaUrl(_ctx.stringValue("QueryTrademarkModelDetailResponse.Moudle.MaterialInfo.LoaUrl"));
		materialInfo.setCardNumber(_ctx.stringValue("QueryTrademarkModelDetailResponse.Moudle.MaterialInfo.CardNumber"));
		materialInfo.setProvince(_ctx.stringValue("QueryTrademarkModelDetailResponse.Moudle.MaterialInfo.Province"));
		materialInfo.setCountry(_ctx.stringValue("QueryTrademarkModelDetailResponse.Moudle.MaterialInfo.Country"));
		materialInfo.setAddress(_ctx.stringValue("QueryTrademarkModelDetailResponse.Moudle.MaterialInfo.Address"));
		materialInfo.setEName(_ctx.stringValue("QueryTrademarkModelDetailResponse.Moudle.MaterialInfo.EName"));
		materialInfo.setEAddress(_ctx.stringValue("QueryTrademarkModelDetailResponse.Moudle.MaterialInfo.EAddress"));
		materialInfo.setLoaKey(_ctx.stringValue("QueryTrademarkModelDetailResponse.Moudle.MaterialInfo.LoaKey"));
		materialInfo.setIdCardUrl(_ctx.stringValue("QueryTrademarkModelDetailResponse.Moudle.MaterialInfo.IdCardUrl"));
		materialInfo.setBusinessLicenceUrl(_ctx.stringValue("QueryTrademarkModelDetailResponse.Moudle.MaterialInfo.BusinessLicenceUrl"));
		materialInfo.setPassportUrl(_ctx.stringValue("QueryTrademarkModelDetailResponse.Moudle.MaterialInfo.PassportUrl"));
		materialInfo.setCnInfoUrl(_ctx.stringValue("QueryTrademarkModelDetailResponse.Moudle.MaterialInfo.CnInfoUrl"));
		materialInfo.setReasonFileOssKey(_ctx.stringValue("QueryTrademarkModelDetailResponse.Moudle.MaterialInfo.ReasonFileOssKey"));
		materialInfo.setPostCode(_ctx.stringValue("QueryTrademarkModelDetailResponse.Moudle.MaterialInfo.PostCode"));
		materialInfo.setPersonalType(_ctx.integerValue("QueryTrademarkModelDetailResponse.Moudle.MaterialInfo.PersonalType"));
		materialInfo.setIdCardNumber(_ctx.stringValue("QueryTrademarkModelDetailResponse.Moudle.MaterialInfo.IdCardNumber"));
		materialInfo.setContactAddress(_ctx.stringValue("QueryTrademarkModelDetailResponse.Moudle.MaterialInfo.ContactAddress"));
		materialInfo.setContactEmail(_ctx.stringValue("QueryTrademarkModelDetailResponse.Moudle.MaterialInfo.ContactEmail"));
		materialInfo.setContactZipCode(_ctx.stringValue("QueryTrademarkModelDetailResponse.Moudle.MaterialInfo.ContactZipCode"));
		materialInfo.setContactName(_ctx.stringValue("QueryTrademarkModelDetailResponse.Moudle.MaterialInfo.ContactName"));
		materialInfo.setContactPhoneNumber(_ctx.stringValue("QueryTrademarkModelDetailResponse.Moudle.MaterialInfo.ContactPhoneNumber"));
		materialInfo.setReviewFileMap(_ctx.mapValue("QueryTrademarkModelDetailResponse.Moudle.MaterialInfo.ReviewFileMap"));
		moudle.setMaterialInfo(materialInfo);

		RootCode rootCode = new RootCode();
		rootCode.setClassificationCode(_ctx.stringValue("QueryTrademarkModelDetailResponse.Moudle.RootCode.ClassificationCode"));
		rootCode.setClassificationName(_ctx.stringValue("QueryTrademarkModelDetailResponse.Moudle.RootCode.ClassificationName"));
		moudle.setRootCode(rootCode);

		List<LeafCode> leafCodes = new ArrayList<LeafCode>();
		for (int i = 0; i < _ctx.lengthValue("QueryTrademarkModelDetailResponse.Moudle.LeafCodes.Length"); i++) {
			LeafCode leafCode = new LeafCode();
			leafCode.setClassificationCode(_ctx.stringValue("QueryTrademarkModelDetailResponse.Moudle.LeafCodes["+ i +"].ClassificationCode"));
			leafCode.setClassificationName(_ctx.stringValue("QueryTrademarkModelDetailResponse.Moudle.LeafCodes["+ i +"].ClassificationName"));

			leafCodes.add(leafCode);
		}
		moudle.setLeafCodes(leafCodes);
		queryTrademarkModelDetailResponse.setMoudle(moudle);
	 
	 	return queryTrademarkModelDetailResponse;
	}
}