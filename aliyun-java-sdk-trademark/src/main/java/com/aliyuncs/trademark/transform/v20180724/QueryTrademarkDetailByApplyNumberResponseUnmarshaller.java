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

import com.aliyuncs.trademark.model.v20180724.QueryTrademarkDetailByApplyNumberResponse;
import com.aliyuncs.trademark.model.v20180724.QueryTrademarkDetailByApplyNumberResponse.Moudle;
import com.aliyuncs.trademark.model.v20180724.QueryTrademarkDetailByApplyNumberResponse.Moudle.LeafCode;
import com.aliyuncs.trademark.model.v20180724.QueryTrademarkDetailByApplyNumberResponse.Moudle.MaterialInfo;
import com.aliyuncs.trademark.model.v20180724.QueryTrademarkDetailByApplyNumberResponse.Moudle.RootCode;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryTrademarkDetailByApplyNumberResponseUnmarshaller {

	public static QueryTrademarkDetailByApplyNumberResponse unmarshall(QueryTrademarkDetailByApplyNumberResponse queryTrademarkDetailByApplyNumberResponse, UnmarshallerContext _ctx) {
		
		queryTrademarkDetailByApplyNumberResponse.setRequestId(_ctx.stringValue("QueryTrademarkDetailByApplyNumberResponse.RequestId"));

		Moudle moudle = new Moudle();
		moudle.setBizId(_ctx.stringValue("QueryTrademarkDetailByApplyNumberResponse.Moudle.BizId"));
		moudle.setBizType(_ctx.stringValue("QueryTrademarkDetailByApplyNumberResponse.Moudle.BizType"));
		moudle.setTrademarkNumber(_ctx.stringValue("QueryTrademarkDetailByApplyNumberResponse.Moudle.TrademarkNumber"));
		moudle.setTrademarkName(_ctx.stringValue("QueryTrademarkDetailByApplyNumberResponse.Moudle.TrademarkName"));
		moudle.setTrademarkNameType(_ctx.integerValue("QueryTrademarkDetailByApplyNumberResponse.Moudle.TrademarkNameType"));
		moudle.setProduceType(_ctx.stringValue("QueryTrademarkDetailByApplyNumberResponse.Moudle.ProduceType"));
		moudle.setStatus(_ctx.stringValue("QueryTrademarkDetailByApplyNumberResponse.Moudle.Status"));
		moudle.setStatusStr(_ctx.stringValue("QueryTrademarkDetailByApplyNumberResponse.Moudle.StatusStr"));
		moudle.setBitFlag(_ctx.integerValue("QueryTrademarkDetailByApplyNumberResponse.Moudle.BitFlag"));
		moudle.setIcon(_ctx.stringValue("QueryTrademarkDetailByApplyNumberResponse.Moudle.Icon"));
		moudle.setGrayIconUrl(_ctx.stringValue("QueryTrademarkDetailByApplyNumberResponse.Moudle.GrayIconUrl"));
		moudle.setOrderId(_ctx.stringValue("QueryTrademarkDetailByApplyNumberResponse.Moudle.OrderId"));
		moudle.setPartnerCode(_ctx.stringValue("QueryTrademarkDetailByApplyNumberResponse.Moudle.PartnerCode"));
		moudle.setSubmitTimes(_ctx.integerValue("QueryTrademarkDetailByApplyNumberResponse.Moudle.SubmitTimes"));
		moudle.setSubmitStatus(_ctx.stringValue("QueryTrademarkDetailByApplyNumberResponse.Moudle.SubmitStatus"));
		moudle.setSubmitTimeValue(_ctx.longValue("QueryTrademarkDetailByApplyNumberResponse.Moudle.SubmitTimeValue"));
		moudle.setSubmitTimeStr(_ctx.stringValue("QueryTrademarkDetailByApplyNumberResponse.Moudle.SubmitTimeStr"));
		moudle.setSubmitAuditTimeValue(_ctx.longValue("QueryTrademarkDetailByApplyNumberResponse.Moudle.SubmitAuditTimeValue"));
		moudle.setSubmitAuditTimeStr(_ctx.stringValue("QueryTrademarkDetailByApplyNumberResponse.Moudle.SubmitAuditTimeStr"));
		moudle.setPrincipalName(_ctx.stringValue("QueryTrademarkDetailByApplyNumberResponse.Moudle.PrincipalName"));
		moudle.setPrincipalKey(_ctx.stringValue("QueryTrademarkDetailByApplyNumberResponse.Moudle.PrincipalKey"));
		moudle.setExtendInfo(_ctx.mapValue("QueryTrademarkDetailByApplyNumberResponse.Moudle.ExtendInfo"));

		MaterialInfo materialInfo = new MaterialInfo();
		materialInfo.setName(_ctx.stringValue("QueryTrademarkDetailByApplyNumberResponse.Moudle.MaterialInfo.Name"));
		materialInfo.setType(_ctx.integerValue("QueryTrademarkDetailByApplyNumberResponse.Moudle.MaterialInfo.Type"));
		materialInfo.setRegion(_ctx.integerValue("QueryTrademarkDetailByApplyNumberResponse.Moudle.MaterialInfo.Region"));
		materialInfo.setLoaUrl(_ctx.stringValue("QueryTrademarkDetailByApplyNumberResponse.Moudle.MaterialInfo.LoaUrl"));
		materialInfo.setCardNumber(_ctx.stringValue("QueryTrademarkDetailByApplyNumberResponse.Moudle.MaterialInfo.CardNumber"));
		materialInfo.setProvince(_ctx.stringValue("QueryTrademarkDetailByApplyNumberResponse.Moudle.MaterialInfo.Province"));
		materialInfo.setCountry(_ctx.stringValue("QueryTrademarkDetailByApplyNumberResponse.Moudle.MaterialInfo.Country"));
		materialInfo.setAddress(_ctx.stringValue("QueryTrademarkDetailByApplyNumberResponse.Moudle.MaterialInfo.Address"));
		materialInfo.setEName(_ctx.stringValue("QueryTrademarkDetailByApplyNumberResponse.Moudle.MaterialInfo.EName"));
		materialInfo.setEAddress(_ctx.stringValue("QueryTrademarkDetailByApplyNumberResponse.Moudle.MaterialInfo.EAddress"));
		materialInfo.setLoaKey(_ctx.stringValue("QueryTrademarkDetailByApplyNumberResponse.Moudle.MaterialInfo.LoaKey"));
		materialInfo.setIdCardUrl(_ctx.stringValue("QueryTrademarkDetailByApplyNumberResponse.Moudle.MaterialInfo.IdCardUrl"));
		materialInfo.setBusinessLicenceUrl(_ctx.stringValue("QueryTrademarkDetailByApplyNumberResponse.Moudle.MaterialInfo.BusinessLicenceUrl"));
		materialInfo.setPassportUrl(_ctx.stringValue("QueryTrademarkDetailByApplyNumberResponse.Moudle.MaterialInfo.PassportUrl"));
		materialInfo.setCnInfoUrl(_ctx.stringValue("QueryTrademarkDetailByApplyNumberResponse.Moudle.MaterialInfo.CnInfoUrl"));
		materialInfo.setReasonFileOssKey(_ctx.stringValue("QueryTrademarkDetailByApplyNumberResponse.Moudle.MaterialInfo.ReasonFileOssKey"));
		materialInfo.setPostCode(_ctx.stringValue("QueryTrademarkDetailByApplyNumberResponse.Moudle.MaterialInfo.PostCode"));
		materialInfo.setPersonalType(_ctx.integerValue("QueryTrademarkDetailByApplyNumberResponse.Moudle.MaterialInfo.PersonalType"));
		materialInfo.setIdCardNumber(_ctx.stringValue("QueryTrademarkDetailByApplyNumberResponse.Moudle.MaterialInfo.IdCardNumber"));
		materialInfo.setContactAddress(_ctx.stringValue("QueryTrademarkDetailByApplyNumberResponse.Moudle.MaterialInfo.ContactAddress"));
		materialInfo.setContactEmail(_ctx.stringValue("QueryTrademarkDetailByApplyNumberResponse.Moudle.MaterialInfo.ContactEmail"));
		materialInfo.setContactZipCode(_ctx.stringValue("QueryTrademarkDetailByApplyNumberResponse.Moudle.MaterialInfo.ContactZipCode"));
		materialInfo.setContactName(_ctx.stringValue("QueryTrademarkDetailByApplyNumberResponse.Moudle.MaterialInfo.ContactName"));
		materialInfo.setContactPhoneNumber(_ctx.stringValue("QueryTrademarkDetailByApplyNumberResponse.Moudle.MaterialInfo.ContactPhoneNumber"));
		materialInfo.setReviewFileMap(_ctx.mapValue("QueryTrademarkDetailByApplyNumberResponse.Moudle.MaterialInfo.ReviewFileMap"));
		moudle.setMaterialInfo(materialInfo);

		RootCode rootCode = new RootCode();
		rootCode.setClassificationCode(_ctx.stringValue("QueryTrademarkDetailByApplyNumberResponse.Moudle.RootCode.ClassificationCode"));
		rootCode.setClassificationName(_ctx.stringValue("QueryTrademarkDetailByApplyNumberResponse.Moudle.RootCode.ClassificationName"));
		moudle.setRootCode(rootCode);

		List<LeafCode> leafCodes = new ArrayList<LeafCode>();
		for (int i = 0; i < _ctx.lengthValue("QueryTrademarkDetailByApplyNumberResponse.Moudle.LeafCodes.Length"); i++) {
			LeafCode leafCode = new LeafCode();
			leafCode.setClassificationCode(_ctx.stringValue("QueryTrademarkDetailByApplyNumberResponse.Moudle.LeafCodes["+ i +"].ClassificationCode"));
			leafCode.setClassificationName(_ctx.stringValue("QueryTrademarkDetailByApplyNumberResponse.Moudle.LeafCodes["+ i +"].ClassificationName"));

			leafCodes.add(leafCode);
		}
		moudle.setLeafCodes(leafCodes);
		queryTrademarkDetailByApplyNumberResponse.setMoudle(moudle);
	 
	 	return queryTrademarkDetailByApplyNumberResponse;
	}
}