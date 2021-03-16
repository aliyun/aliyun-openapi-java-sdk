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

package com.aliyuncs.ecsops.transform.v20160401;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecsops.model.v20160401.OpsQueryEcsApiMetaSettingsResponse;
import com.aliyuncs.ecsops.model.v20160401.OpsQueryEcsApiMetaSettingsResponse.ProductsItem;
import com.aliyuncs.ecsops.model.v20160401.OpsQueryEcsApiMetaSettingsResponse.ProductsItem.MetaInfosItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpsQueryEcsApiMetaSettingsResponseUnmarshaller {

	public static OpsQueryEcsApiMetaSettingsResponse unmarshall(OpsQueryEcsApiMetaSettingsResponse opsQueryEcsApiMetaSettingsResponse, UnmarshallerContext _ctx) {
		
		opsQueryEcsApiMetaSettingsResponse.setRequestId(_ctx.stringValue("OpsQueryEcsApiMetaSettingsResponse.RequestId"));
		opsQueryEcsApiMetaSettingsResponse.setPageNumber(_ctx.integerValue("OpsQueryEcsApiMetaSettingsResponse.PageNumber"));
		opsQueryEcsApiMetaSettingsResponse.setPageSize(_ctx.integerValue("OpsQueryEcsApiMetaSettingsResponse.PageSize"));
		opsQueryEcsApiMetaSettingsResponse.setTotalCount(_ctx.integerValue("OpsQueryEcsApiMetaSettingsResponse.TotalCount"));

		List<ProductsItem> products = new ArrayList<ProductsItem>();
		for (int i = 0; i < _ctx.lengthValue("OpsQueryEcsApiMetaSettingsResponse.Products.Length"); i++) {
			ProductsItem productsItem = new ProductsItem();
			productsItem.setProductName(_ctx.stringValue("OpsQueryEcsApiMetaSettingsResponse.Products["+ i +"].ProductName"));
			productsItem.setVersionName(_ctx.stringValue("OpsQueryEcsApiMetaSettingsResponse.Products["+ i +"].VersionName"));
			productsItem.setProApiName(_ctx.stringValue("OpsQueryEcsApiMetaSettingsResponse.Products["+ i +"].ProApiName"));

			List<MetaInfosItem> metaInfos = new ArrayList<MetaInfosItem>();
			for (int j = 0; j < _ctx.lengthValue("OpsQueryEcsApiMetaSettingsResponse.Products["+ i +"].MetaInfos.Length"); j++) {
				MetaInfosItem metaInfosItem = new MetaInfosItem();
				metaInfosItem.setKey(_ctx.stringValue("OpsQueryEcsApiMetaSettingsResponse.Products["+ i +"].MetaInfos["+ j +"].Key"));
				metaInfosItem.setValue(_ctx.stringValue("OpsQueryEcsApiMetaSettingsResponse.Products["+ i +"].MetaInfos["+ j +"].Value"));

				metaInfos.add(metaInfosItem);
			}
			productsItem.setMetaInfos(metaInfos);

			products.add(productsItem);
		}
		opsQueryEcsApiMetaSettingsResponse.setProducts(products);
	 
	 	return opsQueryEcsApiMetaSettingsResponse;
	}
}