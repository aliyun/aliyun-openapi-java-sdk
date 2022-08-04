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

import com.aliyuncs.trademark.model.v20180724.QueryTmSbjProduceDetailResponse;
import com.aliyuncs.trademark.model.v20180724.QueryTmSbjProduceDetailResponse.LeafCodesItem;
import com.aliyuncs.trademark.model.v20180724.QueryTmSbjProduceDetailResponse.MaterialDetail;
import com.aliyuncs.trademark.model.v20180724.QueryTmSbjProduceDetailResponse.RootCode;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryTmSbjProduceDetailResponseUnmarshaller {

	public static QueryTmSbjProduceDetailResponse unmarshall(QueryTmSbjProduceDetailResponse queryTmSbjProduceDetailResponse, UnmarshallerContext _ctx) {
		
		queryTmSbjProduceDetailResponse.setRequestId(_ctx.stringValue("QueryTmSbjProduceDetailResponse.RequestId"));
		queryTmSbjProduceDetailResponse.setAcceptUrl(_ctx.stringValue("QueryTmSbjProduceDetailResponse.AcceptUrl"));
		queryTmSbjProduceDetailResponse.setCnInfoUrl(_ctx.stringValue("QueryTmSbjProduceDetailResponse.CnInfoUrl"));
		queryTmSbjProduceDetailResponse.setType(_ctx.integerValue("QueryTmSbjProduceDetailResponse.Type"));
		queryTmSbjProduceDetailResponse.setStatus(_ctx.integerValue("QueryTmSbjProduceDetailResponse.Status"));
		queryTmSbjProduceDetailResponse.setBizId(_ctx.stringValue("QueryTmSbjProduceDetailResponse.BizId"));
		queryTmSbjProduceDetailResponse.setExtendInfo(_ctx.mapValue("QueryTmSbjProduceDetailResponse.ExtendInfo"));
		queryTmSbjProduceDetailResponse.setTmNameType(_ctx.integerValue("QueryTmSbjProduceDetailResponse.TmNameType"));
		queryTmSbjProduceDetailResponse.setIssueDate(_ctx.stringValue("QueryTmSbjProduceDetailResponse.IssueDate"));
		queryTmSbjProduceDetailResponse.setTmIcon(_ctx.stringValue("QueryTmSbjProduceDetailResponse.TmIcon"));
		queryTmSbjProduceDetailResponse.setGrayIconUrl(_ctx.stringValue("QueryTmSbjProduceDetailResponse.GrayIconUrl"));
		queryTmSbjProduceDetailResponse.setTmName(_ctx.stringValue("QueryTmSbjProduceDetailResponse.TmName"));
		queryTmSbjProduceDetailResponse.setLoaUrl(_ctx.stringValue("QueryTmSbjProduceDetailResponse.LoaUrl"));
		queryTmSbjProduceDetailResponse.setTmNumber(_ctx.stringValue("QueryTmSbjProduceDetailResponse.TmNumber"));
		queryTmSbjProduceDetailResponse.setNote(_ctx.stringValue("QueryTmSbjProduceDetailResponse.Note"));
		queryTmSbjProduceDetailResponse.setPrincipalName(_ctx.integerValue("QueryTmSbjProduceDetailResponse.PrincipalName"));
		queryTmSbjProduceDetailResponse.setTmOrderId(_ctx.stringValue("QueryTmSbjProduceDetailResponse.TmOrderId"));
		queryTmSbjProduceDetailResponse.setSubmitCount(_ctx.integerValue("QueryTmSbjProduceDetailResponse.SubmitCount"));
		queryTmSbjProduceDetailResponse.setOrderId(_ctx.stringValue("QueryTmSbjProduceDetailResponse.OrderId"));
		queryTmSbjProduceDetailResponse.setSubmitStatus(_ctx.stringValue("QueryTmSbjProduceDetailResponse.SubmitStatus"));
		queryTmSbjProduceDetailResponse.setMaterialName(_ctx.stringValue("QueryTmSbjProduceDetailResponse.MaterialName"));

		List<String> flags = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("QueryTmSbjProduceDetailResponse.Flags.Length"); i++) {
			flags.add(_ctx.stringValue("QueryTmSbjProduceDetailResponse.Flags["+ i +"]"));
		}
		queryTmSbjProduceDetailResponse.setFlags(flags);

		MaterialDetail materialDetail = new MaterialDetail();
		materialDetail.setContactNumber(_ctx.stringValue("QueryTmSbjProduceDetailResponse.MaterialDetail.ContactNumber"));
		materialDetail.setType(_ctx.integerValue("QueryTmSbjProduceDetailResponse.MaterialDetail.Type"));
		materialDetail.setStatus(_ctx.integerValue("QueryTmSbjProduceDetailResponse.MaterialDetail.Status"));
		materialDetail.setContactAddress(_ctx.stringValue("QueryTmSbjProduceDetailResponse.MaterialDetail.ContactAddress"));
		materialDetail.setBusinessLicenceUrl(_ctx.stringValue("QueryTmSbjProduceDetailResponse.MaterialDetail.BusinessLicenceUrl"));
		materialDetail.setPassportUrl(_ctx.stringValue("QueryTmSbjProduceDetailResponse.MaterialDetail.PassportUrl"));
		materialDetail.setContactZipcode(_ctx.stringValue("QueryTmSbjProduceDetailResponse.MaterialDetail.ContactZipcode"));
		materialDetail.setContactName(_ctx.stringValue("QueryTmSbjProduceDetailResponse.MaterialDetail.ContactName"));
		materialDetail.setCity(_ctx.stringValue("QueryTmSbjProduceDetailResponse.MaterialDetail.City"));
		materialDetail.setEAddress(_ctx.stringValue("QueryTmSbjProduceDetailResponse.MaterialDetail.EAddress"));
		materialDetail.setEName(_ctx.stringValue("QueryTmSbjProduceDetailResponse.MaterialDetail.EName"));
		materialDetail.setExpirationDate(_ctx.stringValue("QueryTmSbjProduceDetailResponse.MaterialDetail.ExpirationDate"));
		materialDetail.setIdCardUrl(_ctx.stringValue("QueryTmSbjProduceDetailResponse.MaterialDetail.IdCardUrl"));
		materialDetail.setCardNumber(_ctx.stringValue("QueryTmSbjProduceDetailResponse.MaterialDetail.CardNumber"));
		materialDetail.setContactEmail(_ctx.stringValue("QueryTmSbjProduceDetailResponse.MaterialDetail.ContactEmail"));
		materialDetail.setRegion(_ctx.integerValue("QueryTmSbjProduceDetailResponse.MaterialDetail.Region"));
		materialDetail.setLoaUrl(_ctx.stringValue("QueryTmSbjProduceDetailResponse.MaterialDetail.LoaUrl"));
		materialDetail.setAddress(_ctx.stringValue("QueryTmSbjProduceDetailResponse.MaterialDetail.Address"));
		materialDetail.setCountry(_ctx.stringValue("QueryTmSbjProduceDetailResponse.MaterialDetail.Country"));
		materialDetail.setTown(_ctx.stringValue("QueryTmSbjProduceDetailResponse.MaterialDetail.Town"));
		materialDetail.setName(_ctx.stringValue("QueryTmSbjProduceDetailResponse.MaterialDetail.Name"));
		materialDetail.setProvince(_ctx.stringValue("QueryTmSbjProduceDetailResponse.MaterialDetail.Province"));
		materialDetail.setPersonalType(_ctx.integerValue("QueryTmSbjProduceDetailResponse.MaterialDetail.PersonalType"));
		materialDetail.setIdCardNumber(_ctx.stringValue("QueryTmSbjProduceDetailResponse.MaterialDetail.IdCardNumber"));
		materialDetail.setContactProvince(_ctx.stringValue("QueryTmSbjProduceDetailResponse.MaterialDetail.ContactProvince"));
		materialDetail.setDetailedContactAddress(_ctx.stringValue("QueryTmSbjProduceDetailResponse.MaterialDetail.DetailedContactAddress"));
		queryTmSbjProduceDetailResponse.setMaterialDetail(materialDetail);

		RootCode rootCode = new RootCode();
		rootCode.setName(_ctx.stringValue("QueryTmSbjProduceDetailResponse.RootCode.Name"));
		rootCode.setCode(_ctx.stringValue("QueryTmSbjProduceDetailResponse.RootCode.Code"));
		queryTmSbjProduceDetailResponse.setRootCode(rootCode);

		List<LeafCodesItem> leafCodes = new ArrayList<LeafCodesItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryTmSbjProduceDetailResponse.LeafCodes.Length"); i++) {
			LeafCodesItem leafCodesItem = new LeafCodesItem();
			leafCodesItem.setName(_ctx.stringValue("QueryTmSbjProduceDetailResponse.LeafCodes["+ i +"].Name"));
			leafCodesItem.setCode(_ctx.stringValue("QueryTmSbjProduceDetailResponse.LeafCodes["+ i +"].Code"));

			leafCodes.add(leafCodesItem);
		}
		queryTmSbjProduceDetailResponse.setLeafCodes(leafCodes);
	 
	 	return queryTmSbjProduceDetailResponse;
	}
}