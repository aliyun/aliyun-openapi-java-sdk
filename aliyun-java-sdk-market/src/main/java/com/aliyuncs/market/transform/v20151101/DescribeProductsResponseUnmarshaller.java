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

package com.aliyuncs.market.transform.v20151101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.market.model.v20151101.DescribeProductsResponse;
import com.aliyuncs.market.model.v20151101.DescribeProductsResponse.ProductItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeProductsResponseUnmarshaller {

	public static DescribeProductsResponse unmarshall(DescribeProductsResponse describeProductsResponse, UnmarshallerContext _ctx) {
		
		describeProductsResponse.setRequestId(_ctx.stringValue("DescribeProductsResponse.RequestId"));
		describeProductsResponse.setPageNumber(_ctx.integerValue("DescribeProductsResponse.PageNumber"));
		describeProductsResponse.setPageSize(_ctx.integerValue("DescribeProductsResponse.PageSize"));
		describeProductsResponse.setTotalCount(_ctx.integerValue("DescribeProductsResponse.TotalCount"));

		List<ProductItem> productItems = new ArrayList<ProductItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeProductsResponse.ProductItems.Length"); i++) {
			ProductItem productItem = new ProductItem();
			productItem.setCode(_ctx.stringValue("DescribeProductsResponse.ProductItems["+ i +"].Code"));
			productItem.setName(_ctx.stringValue("DescribeProductsResponse.ProductItems["+ i +"].Name"));
			productItem.setCategoryId(_ctx.longValue("DescribeProductsResponse.ProductItems["+ i +"].CategoryId"));
			productItem.setSupplierId(_ctx.longValue("DescribeProductsResponse.ProductItems["+ i +"].SupplierId"));
			productItem.setSupplierName(_ctx.stringValue("DescribeProductsResponse.ProductItems["+ i +"].SupplierName"));
			productItem.setShortDescription(_ctx.stringValue("DescribeProductsResponse.ProductItems["+ i +"].ShortDescription"));
			productItem.setTags(_ctx.stringValue("DescribeProductsResponse.ProductItems["+ i +"].Tags"));
			productItem.setSuggestedPrice(_ctx.stringValue("DescribeProductsResponse.ProductItems["+ i +"].SuggestedPrice"));
			productItem.setTargetUrl(_ctx.stringValue("DescribeProductsResponse.ProductItems["+ i +"].TargetUrl"));
			productItem.setImageUrl(_ctx.stringValue("DescribeProductsResponse.ProductItems["+ i +"].ImageUrl"));
			productItem.setScore(_ctx.stringValue("DescribeProductsResponse.ProductItems["+ i +"].Score"));
			productItem.setOperationSystem(_ctx.stringValue("DescribeProductsResponse.ProductItems["+ i +"].OperationSystem"));
			productItem.setWarrantyDate(_ctx.stringValue("DescribeProductsResponse.ProductItems["+ i +"].WarrantyDate"));
			productItem.setDeliveryDate(_ctx.stringValue("DescribeProductsResponse.ProductItems["+ i +"].DeliveryDate"));
			productItem.setDeliveryWay(_ctx.stringValue("DescribeProductsResponse.ProductItems["+ i +"].DeliveryWay"));

			productItems.add(productItem);
		}
		describeProductsResponse.setProductItems(productItems);
	 
	 	return describeProductsResponse;
	}
}