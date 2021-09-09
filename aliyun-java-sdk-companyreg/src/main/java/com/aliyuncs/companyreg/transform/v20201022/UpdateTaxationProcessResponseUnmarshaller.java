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

import com.aliyuncs.companyreg.model.v20201022.UpdateTaxationProcessResponse;
import com.aliyuncs.companyreg.model.v20201022.UpdateTaxationProcessResponse.TaxItemDetailListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateTaxationProcessResponseUnmarshaller {

	public static UpdateTaxationProcessResponse unmarshall(UpdateTaxationProcessResponse updateTaxationProcessResponse, UnmarshallerContext _ctx) {
		
		updateTaxationProcessResponse.setRequestId(_ctx.stringValue("UpdateTaxationProcessResponse.RequestId"));
		updateTaxationProcessResponse.setDeclareProcessType(_ctx.stringValue("UpdateTaxationProcessResponse.DeclareProcessType"));

		List<TaxItemDetailListItem> taxItemDetailList = new ArrayList<TaxItemDetailListItem>();
		for (int i = 0; i < _ctx.lengthValue("UpdateTaxationProcessResponse.TaxItemDetailList.Length"); i++) {
			TaxItemDetailListItem taxItemDetailListItem = new TaxItemDetailListItem();
			taxItemDetailListItem.setId(_ctx.longValue("UpdateTaxationProcessResponse.TaxItemDetailList["+ i +"].Id"));
			taxItemDetailListItem.setIsDeclared(_ctx.booleanValue("UpdateTaxationProcessResponse.TaxItemDetailList["+ i +"].IsDeclared"));
			taxItemDetailListItem.setIsDeclaredThisPeriod(_ctx.booleanValue("UpdateTaxationProcessResponse.TaxItemDetailList["+ i +"].IsDeclaredThisPeriod"));
			taxItemDetailListItem.setIsPaid(_ctx.booleanValue("UpdateTaxationProcessResponse.TaxItemDetailList["+ i +"].IsPaid"));
			taxItemDetailListItem.setTaxAmount(_ctx.stringValue("UpdateTaxationProcessResponse.TaxItemDetailList["+ i +"].TaxAmount"));
			taxItemDetailListItem.setTaxTypeId(_ctx.integerValue("UpdateTaxationProcessResponse.TaxItemDetailList["+ i +"].TaxTypeId"));
			taxItemDetailListItem.setTaxTypeName(_ctx.stringValue("UpdateTaxationProcessResponse.TaxItemDetailList["+ i +"].TaxTypeName"));

			taxItemDetailList.add(taxItemDetailListItem);
		}
		updateTaxationProcessResponse.setTaxItemDetailList(taxItemDetailList);
	 
	 	return updateTaxationProcessResponse;
	}
}