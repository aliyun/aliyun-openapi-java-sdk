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

package com.aliyuncs.arms.transform.v20190808;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.arms.model.v20190808.ListCmsInstancesResponse;
import com.aliyuncs.arms.model.v20190808.ListCmsInstancesResponse.Data;
import com.aliyuncs.arms.model.v20190808.ListCmsInstancesResponse.Data.ProductsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListCmsInstancesResponseUnmarshaller {

	public static ListCmsInstancesResponse unmarshall(ListCmsInstancesResponse listCmsInstancesResponse, UnmarshallerContext _ctx) {
		
		listCmsInstancesResponse.setRequestId(_ctx.stringValue("ListCmsInstancesResponse.RequestId"));

		Data data = new Data();
		data.setEnableTag(_ctx.booleanValue("ListCmsInstancesResponse.Data.EnableTag"));

		List<ProductsItem> products = new ArrayList<ProductsItem>();
		for (int i = 0; i < _ctx.lengthValue("ListCmsInstancesResponse.Data.Products.Length"); i++) {
			ProductsItem productsItem = new ProductsItem();
			productsItem.setDescr(_ctx.stringValue("ListCmsInstancesResponse.Data.Products["+ i +"].Descr"));
			productsItem.setInstance(_ctx.stringValue("ListCmsInstancesResponse.Data.Products["+ i +"].Instance"));
			productsItem.setProd(_ctx.stringValue("ListCmsInstancesResponse.Data.Products["+ i +"].Prod"));
			productsItem.setName(_ctx.stringValue("ListCmsInstancesResponse.Data.Products["+ i +"].Name"));
			productsItem.setId(_ctx.stringValue("ListCmsInstancesResponse.Data.Products["+ i +"].Id"));
			productsItem.setState(_ctx.stringValue("ListCmsInstancesResponse.Data.Products["+ i +"].State"));
			productsItem.setTime(_ctx.stringValue("ListCmsInstancesResponse.Data.Products["+ i +"].Time"));
			productsItem.setType(_ctx.stringValue("ListCmsInstancesResponse.Data.Products["+ i +"].Type"));
			productsItem.setUrl(_ctx.stringValue("ListCmsInstancesResponse.Data.Products["+ i +"].Url"));
			productsItem.setSource(_ctx.stringValue("ListCmsInstancesResponse.Data.Products["+ i +"].Source"));

			products.add(productsItem);
		}
		data.setProducts(products);
		listCmsInstancesResponse.setData(data);
	 
	 	return listCmsInstancesResponse;
	}
}