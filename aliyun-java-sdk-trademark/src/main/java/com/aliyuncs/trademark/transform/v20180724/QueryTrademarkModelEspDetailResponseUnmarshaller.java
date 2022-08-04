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

import com.aliyuncs.trademark.model.v20180724.QueryTrademarkModelEspDetailResponse;
import com.aliyuncs.trademark.model.v20180724.QueryTrademarkModelEspDetailResponse.Moudle;
import com.aliyuncs.trademark.model.v20180724.QueryTrademarkModelEspDetailResponse.Moudle.LeafCode;
import com.aliyuncs.trademark.model.v20180724.QueryTrademarkModelEspDetailResponse.Moudle.MaterialInfo;
import com.aliyuncs.trademark.model.v20180724.QueryTrademarkModelEspDetailResponse.Moudle.RootCode;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryTrademarkModelEspDetailResponseUnmarshaller {

	public static QueryTrademarkModelEspDetailResponse unmarshall(QueryTrademarkModelEspDetailResponse queryTrademarkModelEspDetailResponse, UnmarshallerContext _ctx) {
		

		Moudle moudle = new Moudle();
		moudle.setBizId(_ctx.stringValue("QueryTrademarkModelEspDetailResponse.Moudle.BizId"));
		moudle.setBizType(_ctx.stringValue("QueryTrademarkModelEspDetailResponse.Moudle.BizType"));
		moudle.setTrademarkNumber(_ctx.stringValue("QueryTrademarkModelEspDetailResponse.Moudle.TrademarkNumber"));
		moudle.setTrademarkName(_ctx.stringValue("QueryTrademarkModelEspDetailResponse.Moudle.TrademarkName"));
		moudle.setTrademarkNameType(_ctx.integerValue("QueryTrademarkModelEspDetailResponse.Moudle.TrademarkNameType"));
		moudle.setProduceType(_ctx.stringValue("QueryTrademarkModelEspDetailResponse.Moudle.ProduceType"));
		moudle.setStatus(_ctx.stringValue("QueryTrademarkModelEspDetailResponse.Moudle.Status"));
		moudle.setStatusStr(_ctx.stringValue("QueryTrademarkModelEspDetailResponse.Moudle.StatusStr"));
		moudle.setBitFlag(_ctx.integerValue("QueryTrademarkModelEspDetailResponse.Moudle.BitFlag"));
		moudle.setIcon(_ctx.stringValue("QueryTrademarkModelEspDetailResponse.Moudle.Icon"));
		moudle.setGrayIconUrl(_ctx.stringValue("QueryTrademarkModelEspDetailResponse.Moudle.GrayIconUrl"));
		moudle.setOrderId(_ctx.stringValue("QueryTrademarkModelEspDetailResponse.Moudle.OrderId"));
		moudle.setPartnerCode(_ctx.stringValue("QueryTrademarkModelEspDetailResponse.Moudle.PartnerCode"));
		moudle.setSubmitTimes(_ctx.integerValue("QueryTrademarkModelEspDetailResponse.Moudle.SubmitTimes"));
		moudle.setSubmitStatus(_ctx.stringValue("QueryTrademarkModelEspDetailResponse.Moudle.SubmitStatus"));
		moudle.setSubmitTime(_ctx.longValue("QueryTrademarkModelEspDetailResponse.Moudle.SubmitTime"));
		moudle.setSubmitAuditTime(_ctx.longValue("QueryTrademarkModelEspDetailResponse.Moudle.SubmitAuditTime"));
		moudle.setPrincipalName(_ctx.stringValue("QueryTrademarkModelEspDetailResponse.Moudle.PrincipalName"));
		moudle.setPrincipalKey(_ctx.stringValue("QueryTrademarkModelEspDetailResponse.Moudle.PrincipalKey"));
		moudle.setExtendInfo(_ctx.mapValue("QueryTrademarkModelEspDetailResponse.Moudle.ExtendInfo"));
		moudle.setRequestId(_ctx.stringValue("QueryTrademarkModelEspDetailResponse.Moudle.RequestId"));

		MaterialInfo materialInfo = new MaterialInfo();
		materialInfo.setName(_ctx.stringValue("QueryTrademarkModelEspDetailResponse.Moudle.MaterialInfo.Name"));
		materialInfo.setType(_ctx.integerValue("QueryTrademarkModelEspDetailResponse.Moudle.MaterialInfo.Type"));
		materialInfo.setRegion(_ctx.integerValue("QueryTrademarkModelEspDetailResponse.Moudle.MaterialInfo.Region"));
		materialInfo.setLoaUrl(_ctx.stringValue("QueryTrademarkModelEspDetailResponse.Moudle.MaterialInfo.LoaUrl"));
		materialInfo.setCardNumber(_ctx.stringValue("QueryTrademarkModelEspDetailResponse.Moudle.MaterialInfo.CardNumber"));
		materialInfo.setProvince(_ctx.stringValue("QueryTrademarkModelEspDetailResponse.Moudle.MaterialInfo.Province"));
		materialInfo.setCountry(_ctx.stringValue("QueryTrademarkModelEspDetailResponse.Moudle.MaterialInfo.Country"));
		materialInfo.setAddress(_ctx.stringValue("QueryTrademarkModelEspDetailResponse.Moudle.MaterialInfo.Address"));
		materialInfo.setEName(_ctx.stringValue("QueryTrademarkModelEspDetailResponse.Moudle.MaterialInfo.EName"));
		materialInfo.setEAddress(_ctx.stringValue("QueryTrademarkModelEspDetailResponse.Moudle.MaterialInfo.EAddress"));
		materialInfo.setLoaKey(_ctx.stringValue("QueryTrademarkModelEspDetailResponse.Moudle.MaterialInfo.LoaKey"));
		materialInfo.setIdCardUrl(_ctx.stringValue("QueryTrademarkModelEspDetailResponse.Moudle.MaterialInfo.IdCardUrl"));
		materialInfo.setBusinessLicenceUrl(_ctx.stringValue("QueryTrademarkModelEspDetailResponse.Moudle.MaterialInfo.BusinessLicenceUrl"));
		materialInfo.setPassportUrl(_ctx.stringValue("QueryTrademarkModelEspDetailResponse.Moudle.MaterialInfo.PassportUrl"));
		materialInfo.setCnInfoUrl(_ctx.stringValue("QueryTrademarkModelEspDetailResponse.Moudle.MaterialInfo.CnInfoUrl"));
		materialInfo.setReasonFileOssKey(_ctx.stringValue("QueryTrademarkModelEspDetailResponse.Moudle.MaterialInfo.ReasonFileOssKey"));
		materialInfo.setPostCode(_ctx.stringValue("QueryTrademarkModelEspDetailResponse.Moudle.MaterialInfo.PostCode"));
		materialInfo.setPersonalType(_ctx.stringValue("QueryTrademarkModelEspDetailResponse.Moudle.MaterialInfo.PersonalType"));
		materialInfo.setIdCardNumber(_ctx.stringValue("QueryTrademarkModelEspDetailResponse.Moudle.MaterialInfo.IdCardNumber"));
		materialInfo.setContactAddress(_ctx.stringValue("QueryTrademarkModelEspDetailResponse.Moudle.MaterialInfo.ContactAddress"));
		materialInfo.setContactEmail(_ctx.stringValue("QueryTrademarkModelEspDetailResponse.Moudle.MaterialInfo.ContactEmail"));
		materialInfo.setContactZipCode(_ctx.stringValue("QueryTrademarkModelEspDetailResponse.Moudle.MaterialInfo.ContactZipCode"));
		moudle.setMaterialInfo(materialInfo);

		RootCode rootCode = new RootCode();
		rootCode.setClassificationCode(_ctx.stringValue("QueryTrademarkModelEspDetailResponse.Moudle.RootCode.ClassificationCode"));
		rootCode.setClassificationName(_ctx.stringValue("QueryTrademarkModelEspDetailResponse.Moudle.RootCode.ClassificationName"));
		moudle.setRootCode(rootCode);

		List<LeafCode> leafCodes = new ArrayList<LeafCode>();
		for (int i = 0; i < _ctx.lengthValue("QueryTrademarkModelEspDetailResponse.Moudle.LeafCodes.Length"); i++) {
			LeafCode leafCode = new LeafCode();
			leafCode.setClassificationCode(_ctx.stringValue("QueryTrademarkModelEspDetailResponse.Moudle.LeafCodes["+ i +"].ClassificationCode"));
			leafCode.setClassificationName(_ctx.stringValue("QueryTrademarkModelEspDetailResponse.Moudle.LeafCodes["+ i +"].ClassificationName"));

			leafCodes.add(leafCode);
		}
		moudle.setLeafCodes(leafCodes);
		queryTrademarkModelEspDetailResponse.setMoudle(moudle);
	 
	 	return queryTrademarkModelEspDetailResponse;
	}
}