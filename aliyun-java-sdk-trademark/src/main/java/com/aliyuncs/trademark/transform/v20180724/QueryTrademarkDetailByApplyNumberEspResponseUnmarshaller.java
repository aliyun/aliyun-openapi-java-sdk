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

import com.aliyuncs.trademark.model.v20180724.QueryTrademarkDetailByApplyNumberEspResponse;
import com.aliyuncs.trademark.model.v20180724.QueryTrademarkDetailByApplyNumberEspResponse.Moudle;
import com.aliyuncs.trademark.model.v20180724.QueryTrademarkDetailByApplyNumberEspResponse.Moudle.LeafCode;
import com.aliyuncs.trademark.model.v20180724.QueryTrademarkDetailByApplyNumberEspResponse.Moudle.MaterialInfo;
import com.aliyuncs.trademark.model.v20180724.QueryTrademarkDetailByApplyNumberEspResponse.Moudle.RootCode;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryTrademarkDetailByApplyNumberEspResponseUnmarshaller {

	public static QueryTrademarkDetailByApplyNumberEspResponse unmarshall(QueryTrademarkDetailByApplyNumberEspResponse queryTrademarkDetailByApplyNumberEspResponse, UnmarshallerContext _ctx) {
		
		queryTrademarkDetailByApplyNumberEspResponse.setRequestId(_ctx.stringValue("QueryTrademarkDetailByApplyNumberEspResponse.RequestId"));

		Moudle moudle = new Moudle();
		moudle.setBizId(_ctx.stringValue("QueryTrademarkDetailByApplyNumberEspResponse.Moudle.BizId"));
		moudle.setBizType(_ctx.stringValue("QueryTrademarkDetailByApplyNumberEspResponse.Moudle.BizType"));
		moudle.setTrademarkNumber(_ctx.stringValue("QueryTrademarkDetailByApplyNumberEspResponse.Moudle.TrademarkNumber"));
		moudle.setTrademarkName(_ctx.stringValue("QueryTrademarkDetailByApplyNumberEspResponse.Moudle.TrademarkName"));
		moudle.setTrademarkNameType(_ctx.integerValue("QueryTrademarkDetailByApplyNumberEspResponse.Moudle.TrademarkNameType"));
		moudle.setProduceType(_ctx.stringValue("QueryTrademarkDetailByApplyNumberEspResponse.Moudle.ProduceType"));
		moudle.setStatus(_ctx.stringValue("QueryTrademarkDetailByApplyNumberEspResponse.Moudle.Status"));
		moudle.setStatusStr(_ctx.stringValue("QueryTrademarkDetailByApplyNumberEspResponse.Moudle.StatusStr"));
		moudle.setBitFlag(_ctx.integerValue("QueryTrademarkDetailByApplyNumberEspResponse.Moudle.BitFlag"));
		moudle.setIcon(_ctx.stringValue("QueryTrademarkDetailByApplyNumberEspResponse.Moudle.Icon"));
		moudle.setGrayIconUrl(_ctx.stringValue("QueryTrademarkDetailByApplyNumberEspResponse.Moudle.GrayIconUrl"));
		moudle.setOrderId(_ctx.stringValue("QueryTrademarkDetailByApplyNumberEspResponse.Moudle.OrderId"));
		moudle.setPartnerCode(_ctx.stringValue("QueryTrademarkDetailByApplyNumberEspResponse.Moudle.PartnerCode"));
		moudle.setSubmitTimes(_ctx.integerValue("QueryTrademarkDetailByApplyNumberEspResponse.Moudle.SubmitTimes"));
		moudle.setSubmitStatus(_ctx.stringValue("QueryTrademarkDetailByApplyNumberEspResponse.Moudle.SubmitStatus"));
		moudle.setSubmitTimeValue(_ctx.longValue("QueryTrademarkDetailByApplyNumberEspResponse.Moudle.SubmitTimeValue"));
		moudle.setSubmitTimeStr(_ctx.stringValue("QueryTrademarkDetailByApplyNumberEspResponse.Moudle.SubmitTimeStr"));
		moudle.setSubmitAuditTimeValue(_ctx.longValue("QueryTrademarkDetailByApplyNumberEspResponse.Moudle.SubmitAuditTimeValue"));
		moudle.setSubmitAuditTimeStr(_ctx.stringValue("QueryTrademarkDetailByApplyNumberEspResponse.Moudle.SubmitAuditTimeStr"));
		moudle.setPrincipalName(_ctx.stringValue("QueryTrademarkDetailByApplyNumberEspResponse.Moudle.PrincipalName"));
		moudle.setPrincipalKey(_ctx.stringValue("QueryTrademarkDetailByApplyNumberEspResponse.Moudle.PrincipalKey"));
		moudle.setExtendInfo(_ctx.mapValue("QueryTrademarkDetailByApplyNumberEspResponse.Moudle.ExtendInfo"));

		MaterialInfo materialInfo = new MaterialInfo();
		materialInfo.setName(_ctx.stringValue("QueryTrademarkDetailByApplyNumberEspResponse.Moudle.MaterialInfo.Name"));
		materialInfo.setType(_ctx.integerValue("QueryTrademarkDetailByApplyNumberEspResponse.Moudle.MaterialInfo.Type"));
		materialInfo.setRegion(_ctx.integerValue("QueryTrademarkDetailByApplyNumberEspResponse.Moudle.MaterialInfo.Region"));
		materialInfo.setLoaUrl(_ctx.stringValue("QueryTrademarkDetailByApplyNumberEspResponse.Moudle.MaterialInfo.LoaUrl"));
		materialInfo.setCardNumber(_ctx.stringValue("QueryTrademarkDetailByApplyNumberEspResponse.Moudle.MaterialInfo.CardNumber"));
		materialInfo.setProvince(_ctx.stringValue("QueryTrademarkDetailByApplyNumberEspResponse.Moudle.MaterialInfo.Province"));
		materialInfo.setCountry(_ctx.stringValue("QueryTrademarkDetailByApplyNumberEspResponse.Moudle.MaterialInfo.Country"));
		materialInfo.setAddress(_ctx.stringValue("QueryTrademarkDetailByApplyNumberEspResponse.Moudle.MaterialInfo.Address"));
		materialInfo.setEName(_ctx.stringValue("QueryTrademarkDetailByApplyNumberEspResponse.Moudle.MaterialInfo.EName"));
		materialInfo.setEAddress(_ctx.stringValue("QueryTrademarkDetailByApplyNumberEspResponse.Moudle.MaterialInfo.EAddress"));
		materialInfo.setLoaKey(_ctx.stringValue("QueryTrademarkDetailByApplyNumberEspResponse.Moudle.MaterialInfo.LoaKey"));
		materialInfo.setIdCardUrl(_ctx.stringValue("QueryTrademarkDetailByApplyNumberEspResponse.Moudle.MaterialInfo.IdCardUrl"));
		materialInfo.setBusinessLicenceUrl(_ctx.stringValue("QueryTrademarkDetailByApplyNumberEspResponse.Moudle.MaterialInfo.BusinessLicenceUrl"));
		materialInfo.setPassportUrl(_ctx.stringValue("QueryTrademarkDetailByApplyNumberEspResponse.Moudle.MaterialInfo.PassportUrl"));
		materialInfo.setCnInfoUrl(_ctx.stringValue("QueryTrademarkDetailByApplyNumberEspResponse.Moudle.MaterialInfo.CnInfoUrl"));
		materialInfo.setReasonFileOssKey(_ctx.stringValue("QueryTrademarkDetailByApplyNumberEspResponse.Moudle.MaterialInfo.ReasonFileOssKey"));
		materialInfo.setPostCode(_ctx.stringValue("QueryTrademarkDetailByApplyNumberEspResponse.Moudle.MaterialInfo.PostCode"));
		materialInfo.setPersonalType(_ctx.integerValue("QueryTrademarkDetailByApplyNumberEspResponse.Moudle.MaterialInfo.PersonalType"));
		materialInfo.setIdCardNumber(_ctx.stringValue("QueryTrademarkDetailByApplyNumberEspResponse.Moudle.MaterialInfo.IdCardNumber"));
		materialInfo.setContactAddress(_ctx.stringValue("QueryTrademarkDetailByApplyNumberEspResponse.Moudle.MaterialInfo.ContactAddress"));
		materialInfo.setContactEmail(_ctx.stringValue("QueryTrademarkDetailByApplyNumberEspResponse.Moudle.MaterialInfo.ContactEmail"));
		materialInfo.setContactZipCode(_ctx.stringValue("QueryTrademarkDetailByApplyNumberEspResponse.Moudle.MaterialInfo.ContactZipCode"));
		materialInfo.setContactName(_ctx.stringValue("QueryTrademarkDetailByApplyNumberEspResponse.Moudle.MaterialInfo.ContactName"));
		materialInfo.setContactPhoneNumber(_ctx.stringValue("QueryTrademarkDetailByApplyNumberEspResponse.Moudle.MaterialInfo.ContactPhoneNumber"));
		materialInfo.setReviewFileMap(_ctx.mapValue("QueryTrademarkDetailByApplyNumberEspResponse.Moudle.MaterialInfo.ReviewFileMap"));
		moudle.setMaterialInfo(materialInfo);

		RootCode rootCode = new RootCode();
		rootCode.setClassificationCode(_ctx.stringValue("QueryTrademarkDetailByApplyNumberEspResponse.Moudle.RootCode.ClassificationCode"));
		rootCode.setClassificationName(_ctx.stringValue("QueryTrademarkDetailByApplyNumberEspResponse.Moudle.RootCode.ClassificationName"));
		moudle.setRootCode(rootCode);

		List<LeafCode> leafCodes = new ArrayList<LeafCode>();
		for (int i = 0; i < _ctx.lengthValue("QueryTrademarkDetailByApplyNumberEspResponse.Moudle.LeafCodes.Length"); i++) {
			LeafCode leafCode = new LeafCode();
			leafCode.setClassificationCode(_ctx.stringValue("QueryTrademarkDetailByApplyNumberEspResponse.Moudle.LeafCodes["+ i +"].ClassificationCode"));
			leafCode.setClassificationName(_ctx.stringValue("QueryTrademarkDetailByApplyNumberEspResponse.Moudle.LeafCodes["+ i +"].ClassificationName"));

			leafCodes.add(leafCode);
		}
		moudle.setLeafCodes(leafCodes);
		queryTrademarkDetailByApplyNumberEspResponse.setMoudle(moudle);
	 
	 	return queryTrademarkDetailByApplyNumberEspResponse;
	}
}