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

package com.aliyuncs.trademark_inner.transform.v20180801;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.trademark_inner.model.v20180801.QueryProduceDetailResponse;
import com.aliyuncs.trademark_inner.model.v20180801.QueryProduceDetailResponse.LeafCodesItem;
import com.aliyuncs.trademark_inner.model.v20180801.QueryProduceDetailResponse.MaterialDetail;
import com.aliyuncs.trademark_inner.model.v20180801.QueryProduceDetailResponse.RootCode;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryProduceDetailResponseUnmarshaller {

	public static QueryProduceDetailResponse unmarshall(QueryProduceDetailResponse queryProduceDetailResponse, UnmarshallerContext context) {
		
		queryProduceDetailResponse.setRequestId(context.stringValue("QueryProduceDetailResponse.RequestId"));
		queryProduceDetailResponse.setStatus(context.integerValue("QueryProduceDetailResponse.Status"));
		queryProduceDetailResponse.setLoaUrl(context.stringValue("QueryProduceDetailResponse.LoaUrl"));
		queryProduceDetailResponse.setTmIcon(context.stringValue("QueryProduceDetailResponse.TmIcon"));
		queryProduceDetailResponse.setOrderId(context.stringValue("QueryProduceDetailResponse.OrderId"));
		queryProduceDetailResponse.setType(context.integerValue("QueryProduceDetailResponse.Type"));
		queryProduceDetailResponse.setTmNameType(context.integerValue("QueryProduceDetailResponse.TmNameType"));
		queryProduceDetailResponse.setTmName(context.stringValue("QueryProduceDetailResponse.TmName"));
		queryProduceDetailResponse.setBizId(context.stringValue("QueryProduceDetailResponse.BizId"));
		queryProduceDetailResponse.setGrayIconUrl(context.stringValue("QueryProduceDetailResponse.GrayIconUrl"));
		queryProduceDetailResponse.setNote(context.stringValue("QueryProduceDetailResponse.Note"));
		queryProduceDetailResponse.setTmNumber(context.stringValue("QueryProduceDetailResponse.TmNumber"));
		queryProduceDetailResponse.setCnInfoUrl(context.stringValue("QueryProduceDetailResponse.CnInfoUrl"));
		queryProduceDetailResponse.setTmOrderId(context.stringValue("QueryProduceDetailResponse.TmOrderId"));
		queryProduceDetailResponse.setSubmitCount(context.integerValue("QueryProduceDetailResponse.SubmitCount"));

		MaterialDetail materialDetail = new MaterialDetail();
		materialDetail.setCardNumber(context.stringValue("QueryProduceDetailResponse.MaterialDetail.CardNumber"));
		materialDetail.setContactAddress(context.stringValue("QueryProduceDetailResponse.MaterialDetail.ContactAddress"));
		materialDetail.setStatus(context.integerValue("QueryProduceDetailResponse.MaterialDetail.Status"));
		materialDetail.setEName(context.stringValue("QueryProduceDetailResponse.MaterialDetail.EName"));
		materialDetail.setAddress(context.stringValue("QueryProduceDetailResponse.MaterialDetail.Address"));
		materialDetail.setLoaUrl(context.stringValue("QueryProduceDetailResponse.MaterialDetail.LoaUrl"));
		materialDetail.setCity(context.stringValue("QueryProduceDetailResponse.MaterialDetail.City"));
		materialDetail.setPassportUrl(context.stringValue("QueryProduceDetailResponse.MaterialDetail.PassportUrl"));
		materialDetail.setProvince(context.stringValue("QueryProduceDetailResponse.MaterialDetail.Province"));
		materialDetail.setEAddress(context.stringValue("QueryProduceDetailResponse.MaterialDetail.EAddress"));
		materialDetail.setName(context.stringValue("QueryProduceDetailResponse.MaterialDetail.Name"));
		materialDetail.setIdCardUrl(context.stringValue("QueryProduceDetailResponse.MaterialDetail.IdCardUrl"));
		materialDetail.setBusinessLicenceUrl(context.stringValue("QueryProduceDetailResponse.MaterialDetail.BusinessLicenceUrl"));
		materialDetail.setType(context.integerValue("QueryProduceDetailResponse.MaterialDetail.Type"));
		materialDetail.setExpirationDate(context.stringValue("QueryProduceDetailResponse.MaterialDetail.ExpirationDate"));
		materialDetail.setContactZipcode(context.stringValue("QueryProduceDetailResponse.MaterialDetail.ContactZipcode"));
		materialDetail.setTown(context.stringValue("QueryProduceDetailResponse.MaterialDetail.Town"));
		materialDetail.setContactNumber(context.stringValue("QueryProduceDetailResponse.MaterialDetail.ContactNumber"));
		materialDetail.setContactEmail(context.stringValue("QueryProduceDetailResponse.MaterialDetail.ContactEmail"));
		materialDetail.setCountry(context.stringValue("QueryProduceDetailResponse.MaterialDetail.Country"));
		materialDetail.setRegion(context.integerValue("QueryProduceDetailResponse.MaterialDetail.Region"));
		materialDetail.setContactName(context.stringValue("QueryProduceDetailResponse.MaterialDetail.ContactName"));
		queryProduceDetailResponse.setMaterialDetail(materialDetail);

		RootCode rootCode = new RootCode();
		rootCode.setCode(context.stringValue("QueryProduceDetailResponse.RootCode.Code"));
		rootCode.setName(context.stringValue("QueryProduceDetailResponse.RootCode.Name"));
		queryProduceDetailResponse.setRootCode(rootCode);

		List<LeafCodesItem> leafCodes = new ArrayList<LeafCodesItem>();
		for (int i = 0; i < context.lengthValue("QueryProduceDetailResponse.LeafCodes.Length"); i++) {
			LeafCodesItem leafCodesItem = new LeafCodesItem();
			leafCodesItem.setCode(context.stringValue("QueryProduceDetailResponse.LeafCodes["+ i +"].Code"));
			leafCodesItem.setName(context.stringValue("QueryProduceDetailResponse.LeafCodes["+ i +"].Name"));

			leafCodes.add(leafCodesItem);
		}
		queryProduceDetailResponse.setLeafCodes(leafCodes);
	 
	 	return queryProduceDetailResponse;
	}
}