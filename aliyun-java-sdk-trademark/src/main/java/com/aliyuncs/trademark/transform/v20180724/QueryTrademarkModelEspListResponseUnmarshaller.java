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

import com.aliyuncs.trademark.model.v20180724.QueryTrademarkModelEspListResponse;
import com.aliyuncs.trademark.model.v20180724.QueryTrademarkModelEspListResponse.Moudle;
import com.aliyuncs.trademark.model.v20180724.QueryTrademarkModelEspListResponse.Moudle.Item;
import com.aliyuncs.trademark.model.v20180724.QueryTrademarkModelEspListResponse.Moudle.Item.LeafCode;
import com.aliyuncs.trademark.model.v20180724.QueryTrademarkModelEspListResponse.Moudle.Item.MaterialInfo;
import com.aliyuncs.trademark.model.v20180724.QueryTrademarkModelEspListResponse.Moudle.Item.RootCode;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryTrademarkModelEspListResponseUnmarshaller {

	public static QueryTrademarkModelEspListResponse unmarshall(QueryTrademarkModelEspListResponse queryTrademarkModelEspListResponse, UnmarshallerContext _ctx) {
		

		Moudle moudle = new Moudle();
		moudle.setTotalPageNum(_ctx.integerValue("QueryTrademarkModelEspListResponse.Moudle.TotalPageNum"));
		moudle.setRequestId(_ctx.stringValue("QueryTrademarkModelEspListResponse.Moudle.RequestId"));

		List<Item> data = new ArrayList<Item>();
		for (int i = 0; i < _ctx.lengthValue("QueryTrademarkModelEspListResponse.Moudle.Data.Length"); i++) {
			Item item = new Item();
			item.setBizId(_ctx.stringValue("QueryTrademarkModelEspListResponse.Moudle.Data["+ i +"].BizId"));
			item.setBizType(_ctx.stringValue("QueryTrademarkModelEspListResponse.Moudle.Data["+ i +"].BizType"));
			item.setTrademarkNumber(_ctx.stringValue("QueryTrademarkModelEspListResponse.Moudle.Data["+ i +"].TrademarkNumber"));
			item.setTrademarkName(_ctx.stringValue("QueryTrademarkModelEspListResponse.Moudle.Data["+ i +"].TrademarkName"));
			item.setTrademarkNameType(_ctx.integerValue("QueryTrademarkModelEspListResponse.Moudle.Data["+ i +"].TrademarkNameType"));
			item.setProduceType(_ctx.stringValue("QueryTrademarkModelEspListResponse.Moudle.Data["+ i +"].ProduceType"));
			item.setStatus(_ctx.stringValue("QueryTrademarkModelEspListResponse.Moudle.Data["+ i +"].Status"));
			item.setStatusStr(_ctx.stringValue("QueryTrademarkModelEspListResponse.Moudle.Data["+ i +"].StatusStr"));
			item.setBitFlag(_ctx.integerValue("QueryTrademarkModelEspListResponse.Moudle.Data["+ i +"].BitFlag"));
			item.setIcon(_ctx.stringValue("QueryTrademarkModelEspListResponse.Moudle.Data["+ i +"].Icon"));
			item.setGrayIconUrl(_ctx.stringValue("QueryTrademarkModelEspListResponse.Moudle.Data["+ i +"].GrayIconUrl"));
			item.setOrderId(_ctx.stringValue("QueryTrademarkModelEspListResponse.Moudle.Data["+ i +"].OrderId"));
			item.setPartnerCode(_ctx.stringValue("QueryTrademarkModelEspListResponse.Moudle.Data["+ i +"].PartnerCode"));
			item.setSubmitTimes(_ctx.integerValue("QueryTrademarkModelEspListResponse.Moudle.Data["+ i +"].SubmitTimes"));
			item.setSubmitStatus(_ctx.stringValue("QueryTrademarkModelEspListResponse.Moudle.Data["+ i +"].SubmitStatus"));
			item.setSubmitTime(_ctx.longValue("QueryTrademarkModelEspListResponse.Moudle.Data["+ i +"].SubmitTime"));
			item.setSubmitAuditTime(_ctx.longValue("QueryTrademarkModelEspListResponse.Moudle.Data["+ i +"].SubmitAuditTime"));
			item.setPrincipalName(_ctx.stringValue("QueryTrademarkModelEspListResponse.Moudle.Data["+ i +"].PrincipalName"));
			item.setPrincipalKey(_ctx.stringValue("QueryTrademarkModelEspListResponse.Moudle.Data["+ i +"].PrincipalKey"));
			item.setExtendInfo(_ctx.mapValue("QueryTrademarkModelEspListResponse.Moudle.Data["+ i +"].ExtendInfo"));

			MaterialInfo materialInfo = new MaterialInfo();
			materialInfo.setName(_ctx.stringValue("QueryTrademarkModelEspListResponse.Moudle.Data["+ i +"].MaterialInfo.Name"));
			materialInfo.setType(_ctx.integerValue("QueryTrademarkModelEspListResponse.Moudle.Data["+ i +"].MaterialInfo.Type"));
			materialInfo.setRegion(_ctx.integerValue("QueryTrademarkModelEspListResponse.Moudle.Data["+ i +"].MaterialInfo.Region"));
			materialInfo.setLoaUrl(_ctx.stringValue("QueryTrademarkModelEspListResponse.Moudle.Data["+ i +"].MaterialInfo.LoaUrl"));
			materialInfo.setCardNumber(_ctx.stringValue("QueryTrademarkModelEspListResponse.Moudle.Data["+ i +"].MaterialInfo.CardNumber"));
			materialInfo.setProvince(_ctx.stringValue("QueryTrademarkModelEspListResponse.Moudle.Data["+ i +"].MaterialInfo.Province"));
			materialInfo.setCountry(_ctx.stringValue("QueryTrademarkModelEspListResponse.Moudle.Data["+ i +"].MaterialInfo.Country"));
			materialInfo.setAddress(_ctx.stringValue("QueryTrademarkModelEspListResponse.Moudle.Data["+ i +"].MaterialInfo.Address"));
			materialInfo.setEName(_ctx.stringValue("QueryTrademarkModelEspListResponse.Moudle.Data["+ i +"].MaterialInfo.EName"));
			materialInfo.setEAddress(_ctx.stringValue("QueryTrademarkModelEspListResponse.Moudle.Data["+ i +"].MaterialInfo.EAddress"));
			materialInfo.setLoaKey(_ctx.stringValue("QueryTrademarkModelEspListResponse.Moudle.Data["+ i +"].MaterialInfo.LoaKey"));
			materialInfo.setIdCardUrl(_ctx.stringValue("QueryTrademarkModelEspListResponse.Moudle.Data["+ i +"].MaterialInfo.IdCardUrl"));
			materialInfo.setBusinessLicenceUrl(_ctx.stringValue("QueryTrademarkModelEspListResponse.Moudle.Data["+ i +"].MaterialInfo.BusinessLicenceUrl"));
			materialInfo.setPassportUrl(_ctx.stringValue("QueryTrademarkModelEspListResponse.Moudle.Data["+ i +"].MaterialInfo.PassportUrl"));
			materialInfo.setCnInfoUrl(_ctx.stringValue("QueryTrademarkModelEspListResponse.Moudle.Data["+ i +"].MaterialInfo.CnInfoUrl"));
			materialInfo.setReasonFileOssKey(_ctx.stringValue("QueryTrademarkModelEspListResponse.Moudle.Data["+ i +"].MaterialInfo.ReasonFileOssKey"));
			materialInfo.setPostCode(_ctx.stringValue("QueryTrademarkModelEspListResponse.Moudle.Data["+ i +"].MaterialInfo.PostCode"));
			materialInfo.setPersonalType(_ctx.stringValue("QueryTrademarkModelEspListResponse.Moudle.Data["+ i +"].MaterialInfo.PersonalType"));
			materialInfo.setIdCardNumber(_ctx.stringValue("QueryTrademarkModelEspListResponse.Moudle.Data["+ i +"].MaterialInfo.IdCardNumber"));
			materialInfo.setContactAddress(_ctx.stringValue("QueryTrademarkModelEspListResponse.Moudle.Data["+ i +"].MaterialInfo.ContactAddress"));
			materialInfo.setContactEmail(_ctx.stringValue("QueryTrademarkModelEspListResponse.Moudle.Data["+ i +"].MaterialInfo.ContactEmail"));
			materialInfo.setContactZipCode(_ctx.stringValue("QueryTrademarkModelEspListResponse.Moudle.Data["+ i +"].MaterialInfo.ContactZipCode"));
			item.setMaterialInfo(materialInfo);

			RootCode rootCode = new RootCode();
			rootCode.setClassificationCode(_ctx.stringValue("QueryTrademarkModelEspListResponse.Moudle.Data["+ i +"].RootCode.ClassificationCode"));
			rootCode.setClassificationName(_ctx.stringValue("QueryTrademarkModelEspListResponse.Moudle.Data["+ i +"].RootCode.ClassificationName"));
			item.setRootCode(rootCode);

			List<LeafCode> leafCodes = new ArrayList<LeafCode>();
			for (int j = 0; j < _ctx.lengthValue("QueryTrademarkModelEspListResponse.Moudle.Data["+ i +"].LeafCodes.Length"); j++) {
				LeafCode leafCode = new LeafCode();
				leafCode.setClassificationCode(_ctx.stringValue("QueryTrademarkModelEspListResponse.Moudle.Data["+ i +"].LeafCodes["+ j +"].ClassificationCode"));
				leafCode.setClassificationName(_ctx.stringValue("QueryTrademarkModelEspListResponse.Moudle.Data["+ i +"].LeafCodes["+ j +"].ClassificationName"));

				leafCodes.add(leafCode);
			}
			item.setLeafCodes(leafCodes);

			data.add(item);
		}
		moudle.setData(data);
		queryTrademarkModelEspListResponse.setMoudle(moudle);
	 
	 	return queryTrademarkModelEspListResponse;
	}
}