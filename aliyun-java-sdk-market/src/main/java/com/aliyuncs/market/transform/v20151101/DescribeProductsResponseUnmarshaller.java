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
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeProductsResponseUnmarshaller {

	public static DescribeProductsResponse unmarshall(DescribeProductsResponse describeProductsResponse, UnmarshallerContext context) {
		
		describeProductsResponse.setRequestId(context.stringValue("DescribeProductsResponse.RequestId"));
		describeProductsResponse.setPageNumber(context.integerValue("DescribeProductsResponse.PageNumber"));
		describeProductsResponse.setPageSize(context.integerValue("DescribeProductsResponse.PageSize"));
		describeProductsResponse.setTotalCount(context.integerValue("DescribeProductsResponse.TotalCount"));

		List<ProductItem> productItems = new ArrayList<ProductItem>();
		for (int i = 0; i < context.lengthValue("DescribeProductsResponse.ProductItems.Length"); i++) {
			ProductItem productItem = new ProductItem();
			productItem.setCode(context.stringValue("DescribeProductsResponse.ProductItems["+ i +"].Code"));
			productItem.setName(context.stringValue("DescribeProductsResponse.ProductItems["+ i +"].Name"));
			productItem.setCategoryId(context.longValue("DescribeProductsResponse.ProductItems["+ i +"].CategoryId"));
			productItem.setSupplierId(context.longValue("DescribeProductsResponse.ProductItems["+ i +"].SupplierId"));
			productItem.setSupplierName(context.stringValue("DescribeProductsResponse.ProductItems["+ i +"].SupplierName"));
			productItem.setShortDescription(context.stringValue("DescribeProductsResponse.ProductItems["+ i +"].ShortDescription"));
			productItem.setTags(context.stringValue("DescribeProductsResponse.ProductItems["+ i +"].Tags"));
			productItem.setSuggestedPrice(context.stringValue("DescribeProductsResponse.ProductItems["+ i +"].SuggestedPrice"));
			productItem.setTargetUrl(context.stringValue("DescribeProductsResponse.ProductItems["+ i +"].TargetUrl"));
			productItem.setImageUrl(context.stringValue("DescribeProductsResponse.ProductItems["+ i +"].ImageUrl"));
			productItem.setScore(context.stringValue("DescribeProductsResponse.ProductItems["+ i +"].Score"));
			productItem.setOperationSystem(context.stringValue("DescribeProductsResponse.ProductItems["+ i +"].OperationSystem"));
			productItem.setWarrantyDate(context.stringValue("DescribeProductsResponse.ProductItems["+ i +"].WarrantyDate"));
			productItem.setDeliveryDate(context.stringValue("DescribeProductsResponse.ProductItems["+ i +"].DeliveryDate"));
			productItem.setDeliveryWay(context.stringValue("DescribeProductsResponse.ProductItems["+ i +"].DeliveryWay"));

			productItems.add(productItem);
		}
		describeProductsResponse.setProductItems(productItems);
	 
	 	return describeProductsResponse;
	}
}