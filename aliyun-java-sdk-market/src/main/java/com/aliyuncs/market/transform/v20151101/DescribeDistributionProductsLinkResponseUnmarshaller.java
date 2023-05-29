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

import com.aliyuncs.market.model.v20151101.DescribeDistributionProductsLinkResponse;
import com.aliyuncs.market.model.v20151101.DescribeDistributionProductsLinkResponse.Item;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDistributionProductsLinkResponseUnmarshaller {

	public static DescribeDistributionProductsLinkResponse unmarshall(DescribeDistributionProductsLinkResponse describeDistributionProductsLinkResponse, UnmarshallerContext _ctx) {
		
		describeDistributionProductsLinkResponse.setRequestId(_ctx.stringValue("DescribeDistributionProductsLinkResponse.RequestId"));
		describeDistributionProductsLinkResponse.setTotalCount(_ctx.longValue("DescribeDistributionProductsLinkResponse.TotalCount"));
		describeDistributionProductsLinkResponse.setSuccess(_ctx.booleanValue("DescribeDistributionProductsLinkResponse.Success"));

		List<Item> result = new ArrayList<Item>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDistributionProductsLinkResponse.Result.Length"); i++) {
			Item item = new Item();
			item.setUrl(_ctx.stringValue("DescribeDistributionProductsLinkResponse.Result["+ i +"].url"));
			item.setCode(_ctx.stringValue("DescribeDistributionProductsLinkResponse.Result["+ i +"].code"));
			item.setName(_ctx.stringValue("DescribeDistributionProductsLinkResponse.Result["+ i +"].name"));

			result.add(item);
		}
		describeDistributionProductsLinkResponse.setResult(result);
	 
	 	return describeDistributionProductsLinkResponse;
	}
}