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

import com.aliyuncs.companyreg.model.v20201022.GetTaxTypeForAliResponse;
import com.aliyuncs.companyreg.model.v20201022.GetTaxTypeForAliResponse.TaxTypeListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetTaxTypeForAliResponseUnmarshaller {

	public static GetTaxTypeForAliResponse unmarshall(GetTaxTypeForAliResponse getTaxTypeForAliResponse, UnmarshallerContext _ctx) {
		
		getTaxTypeForAliResponse.setRequestId(_ctx.stringValue("GetTaxTypeForAliResponse.RequestId"));

		List<TaxTypeListItem> taxTypeList = new ArrayList<TaxTypeListItem>();
		for (int i = 0; i < _ctx.lengthValue("GetTaxTypeForAliResponse.TaxTypeList.Length"); i++) {
			TaxTypeListItem taxTypeListItem = new TaxTypeListItem();
			taxTypeListItem.setId(_ctx.longValue("GetTaxTypeForAliResponse.TaxTypeList["+ i +"].Id"));
			taxTypeListItem.setName(_ctx.stringValue("GetTaxTypeForAliResponse.TaxTypeList["+ i +"].Name"));
			taxTypeListItem.setCode(_ctx.stringValue("GetTaxTypeForAliResponse.TaxTypeList["+ i +"].Code"));

			taxTypeList.add(taxTypeListItem);
		}
		getTaxTypeForAliResponse.setTaxTypeList(taxTypeList);
	 
	 	return getTaxTypeForAliResponse;
	}
}