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

package com.aliyuncs.companyreg.transform.v20201022;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.companyreg.model.v20201022.GetTaxationInfoResponse;
import com.aliyuncs.companyreg.model.v20201022.GetTaxationInfoResponse.TaxItemDetailListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetTaxationInfoResponseUnmarshaller {

	public static GetTaxationInfoResponse unmarshall(GetTaxationInfoResponse getTaxationInfoResponse, UnmarshallerContext _ctx) {
		
		getTaxationInfoResponse.setRequestId(_ctx.stringValue("GetTaxationInfoResponse.RequestId"));
		getTaxationInfoResponse.setDeclareProcessType(_ctx.stringValue("GetTaxationInfoResponse.DeclareProcessType"));

		List<TaxItemDetailListItem> taxItemDetailList = new ArrayList<TaxItemDetailListItem>();
		for (int i = 0; i < _ctx.lengthValue("GetTaxationInfoResponse.TaxItemDetailList.Length"); i++) {
			TaxItemDetailListItem taxItemDetailListItem = new TaxItemDetailListItem();
			taxItemDetailListItem.setId(_ctx.longValue("GetTaxationInfoResponse.TaxItemDetailList["+ i +"].Id"));
			taxItemDetailListItem.setIsDeclaredThisPeriod(_ctx.booleanValue("GetTaxationInfoResponse.TaxItemDetailList["+ i +"].IsDeclaredThisPeriod"));
			taxItemDetailListItem.setIsDeclared(_ctx.booleanValue("GetTaxationInfoResponse.TaxItemDetailList["+ i +"].IsDeclared"));
			taxItemDetailListItem.setIsPaid(_ctx.booleanValue("GetTaxationInfoResponse.TaxItemDetailList["+ i +"].IsPaid"));
			taxItemDetailListItem.setTaxAmount(_ctx.stringValue("GetTaxationInfoResponse.TaxItemDetailList["+ i +"].TaxAmount"));
			taxItemDetailListItem.setTaxTypeId(_ctx.integerValue("GetTaxationInfoResponse.TaxItemDetailList["+ i +"].TaxTypeId"));
			taxItemDetailListItem.setTaxTypeName(_ctx.stringValue("GetTaxationInfoResponse.TaxItemDetailList["+ i +"].TaxTypeName"));

			taxItemDetailList.add(taxItemDetailListItem);
		}
		getTaxationInfoResponse.setTaxItemDetailList(taxItemDetailList);
	 
	 	return getTaxationInfoResponse;
	}
}