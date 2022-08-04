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

import com.aliyuncs.trademark.model.v20180724.QueryProduceDetailResponse;
import com.aliyuncs.trademark.model.v20180724.QueryProduceDetailResponse.LeafCodesItem;
import com.aliyuncs.trademark.model.v20180724.QueryProduceDetailResponse.MaterialDetail;
import com.aliyuncs.trademark.model.v20180724.QueryProduceDetailResponse.RootCode;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryProduceDetailResponseUnmarshaller {

	public static QueryProduceDetailResponse unmarshall(QueryProduceDetailResponse queryProduceDetailResponse, UnmarshallerContext _ctx) {
		
		queryProduceDetailResponse.setRequestId(_ctx.stringValue("QueryProduceDetailResponse.RequestId"));
		queryProduceDetailResponse.setAcceptUrl(_ctx.stringValue("QueryProduceDetailResponse.AcceptUrl"));
		queryProduceDetailResponse.setCnInfoUrl(_ctx.stringValue("QueryProduceDetailResponse.CnInfoUrl"));
		queryProduceDetailResponse.setType(_ctx.integerValue("QueryProduceDetailResponse.Type"));
		queryProduceDetailResponse.setStatus(_ctx.integerValue("QueryProduceDetailResponse.Status"));
		queryProduceDetailResponse.setBizId(_ctx.stringValue("QueryProduceDetailResponse.BizId"));
		queryProduceDetailResponse.setExtendInfo(_ctx.mapValue("QueryProduceDetailResponse.ExtendInfo"));
		queryProduceDetailResponse.setTmNameType(_ctx.integerValue("QueryProduceDetailResponse.TmNameType"));
		queryProduceDetailResponse.setIssueDate(_ctx.stringValue("QueryProduceDetailResponse.IssueDate"));
		queryProduceDetailResponse.setTmIcon(_ctx.stringValue("QueryProduceDetailResponse.TmIcon"));
		queryProduceDetailResponse.setGrayIconUrl(_ctx.stringValue("QueryProduceDetailResponse.GrayIconUrl"));
		queryProduceDetailResponse.setTmName(_ctx.stringValue("QueryProduceDetailResponse.TmName"));
		queryProduceDetailResponse.setLoaUrl(_ctx.stringValue("QueryProduceDetailResponse.LoaUrl"));
		queryProduceDetailResponse.setTmNumber(_ctx.stringValue("QueryProduceDetailResponse.TmNumber"));
		queryProduceDetailResponse.setNote(_ctx.stringValue("QueryProduceDetailResponse.Note"));
		queryProduceDetailResponse.setPrincipalName(_ctx.integerValue("QueryProduceDetailResponse.PrincipalName"));
		queryProduceDetailResponse.setTmOrderId(_ctx.stringValue("QueryProduceDetailResponse.TmOrderId"));
		queryProduceDetailResponse.setSubmitCount(_ctx.integerValue("QueryProduceDetailResponse.SubmitCount"));
		queryProduceDetailResponse.setOrderId(_ctx.stringValue("QueryProduceDetailResponse.OrderId"));

		List<String> flags = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("QueryProduceDetailResponse.Flags.Length"); i++) {
			flags.add(_ctx.stringValue("QueryProduceDetailResponse.Flags["+ i +"]"));
		}
		queryProduceDetailResponse.setFlags(flags);

		MaterialDetail materialDetail = new MaterialDetail();
		materialDetail.setContactNumber(_ctx.stringValue("QueryProduceDetailResponse.MaterialDetail.ContactNumber"));
		materialDetail.setType(_ctx.integerValue("QueryProduceDetailResponse.MaterialDetail.Type"));
		materialDetail.setStatus(_ctx.integerValue("QueryProduceDetailResponse.MaterialDetail.Status"));
		materialDetail.setContactAddress(_ctx.stringValue("QueryProduceDetailResponse.MaterialDetail.ContactAddress"));
		materialDetail.setBusinessLicenceUrl(_ctx.stringValue("QueryProduceDetailResponse.MaterialDetail.BusinessLicenceUrl"));
		materialDetail.setPassportUrl(_ctx.stringValue("QueryProduceDetailResponse.MaterialDetail.PassportUrl"));
		materialDetail.setContactZipcode(_ctx.stringValue("QueryProduceDetailResponse.MaterialDetail.ContactZipcode"));
		materialDetail.setContactName(_ctx.stringValue("QueryProduceDetailResponse.MaterialDetail.ContactName"));
		materialDetail.setCity(_ctx.stringValue("QueryProduceDetailResponse.MaterialDetail.City"));
		materialDetail.setEAddress(_ctx.stringValue("QueryProduceDetailResponse.MaterialDetail.EAddress"));
		materialDetail.setEName(_ctx.stringValue("QueryProduceDetailResponse.MaterialDetail.EName"));
		materialDetail.setExpirationDate(_ctx.stringValue("QueryProduceDetailResponse.MaterialDetail.ExpirationDate"));
		materialDetail.setIdCardUrl(_ctx.stringValue("QueryProduceDetailResponse.MaterialDetail.IdCardUrl"));
		materialDetail.setCardNumber(_ctx.stringValue("QueryProduceDetailResponse.MaterialDetail.CardNumber"));
		materialDetail.setContactEmail(_ctx.stringValue("QueryProduceDetailResponse.MaterialDetail.ContactEmail"));
		materialDetail.setRegion(_ctx.integerValue("QueryProduceDetailResponse.MaterialDetail.Region"));
		materialDetail.setLoaUrl(_ctx.stringValue("QueryProduceDetailResponse.MaterialDetail.LoaUrl"));
		materialDetail.setAddress(_ctx.stringValue("QueryProduceDetailResponse.MaterialDetail.Address"));
		materialDetail.setCountry(_ctx.stringValue("QueryProduceDetailResponse.MaterialDetail.Country"));
		materialDetail.setTown(_ctx.stringValue("QueryProduceDetailResponse.MaterialDetail.Town"));
		materialDetail.setName(_ctx.stringValue("QueryProduceDetailResponse.MaterialDetail.Name"));
		materialDetail.setProvince(_ctx.stringValue("QueryProduceDetailResponse.MaterialDetail.Province"));
		queryProduceDetailResponse.setMaterialDetail(materialDetail);

		RootCode rootCode = new RootCode();
		rootCode.setName(_ctx.stringValue("QueryProduceDetailResponse.RootCode.Name"));
		rootCode.setCode(_ctx.stringValue("QueryProduceDetailResponse.RootCode.Code"));
		queryProduceDetailResponse.setRootCode(rootCode);

		List<LeafCodesItem> leafCodes = new ArrayList<LeafCodesItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryProduceDetailResponse.LeafCodes.Length"); i++) {
			LeafCodesItem leafCodesItem = new LeafCodesItem();
			leafCodesItem.setName(_ctx.stringValue("QueryProduceDetailResponse.LeafCodes["+ i +"].Name"));
			leafCodesItem.setCode(_ctx.stringValue("QueryProduceDetailResponse.LeafCodes["+ i +"].Code"));

			leafCodes.add(leafCodesItem);
		}
		queryProduceDetailResponse.setLeafCodes(leafCodes);
	 
	 	return queryProduceDetailResponse;
	}
}