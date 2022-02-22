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

package com.aliyuncs.cdt.transform.v20210813;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cdt.model.v20210813.ListCdtProductsResponse;
import com.aliyuncs.cdt.model.v20210813.ListCdtProductsResponse.CdtProductsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListCdtProductsResponseUnmarshaller {

	public static ListCdtProductsResponse unmarshall(ListCdtProductsResponse listCdtProductsResponse, UnmarshallerContext _ctx) {
		
		listCdtProductsResponse.setRequestId(_ctx.stringValue("ListCdtProductsResponse.RequestId"));

		List<CdtProductsItem> cdtProducts = new ArrayList<CdtProductsItem>();
		for (int i = 0; i < _ctx.lengthValue("ListCdtProductsResponse.CdtProducts.Length"); i++) {
			CdtProductsItem cdtProductsItem = new CdtProductsItem();
			cdtProductsItem.setProduct(_ctx.stringValue("ListCdtProductsResponse.CdtProducts["+ i +"].Product"));
			cdtProductsItem.setBusinessRegionId(_ctx.stringValue("ListCdtProductsResponse.CdtProducts["+ i +"].BusinessRegionId"));
			cdtProductsItem.setBillingType(_ctx.stringValue("ListCdtProductsResponse.CdtProducts["+ i +"].BillingType"));
			cdtProductsItem.setSwitchedToCdt(_ctx.booleanValue("ListCdtProductsResponse.CdtProducts["+ i +"].SwitchedToCdt"));
			cdtProductsItem.setCdtType(_ctx.stringValue("ListCdtProductsResponse.CdtProducts["+ i +"].CdtType"));
			cdtProductsItem.setEffectiveTime(_ctx.longValue("ListCdtProductsResponse.CdtProducts["+ i +"].EffectiveTime"));
			cdtProductsItem.setExpireTime(_ctx.longValue("ListCdtProductsResponse.CdtProducts["+ i +"].ExpireTime"));

			cdtProducts.add(cdtProductsItem);
		}
		listCdtProductsResponse.setCdtProducts(cdtProducts);
	 
	 	return listCdtProductsResponse;
	}
}