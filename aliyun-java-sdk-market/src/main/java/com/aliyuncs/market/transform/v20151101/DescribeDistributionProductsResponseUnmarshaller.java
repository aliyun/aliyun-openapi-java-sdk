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

import com.aliyuncs.market.model.v20151101.DescribeDistributionProductsResponse;
import com.aliyuncs.market.model.v20151101.DescribeDistributionProductsResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDistributionProductsResponseUnmarshaller {

	public static DescribeDistributionProductsResponse unmarshall(DescribeDistributionProductsResponse describeDistributionProductsResponse, UnmarshallerContext _ctx) {
		
		describeDistributionProductsResponse.setRequestId(_ctx.stringValue("DescribeDistributionProductsResponse.RequestId"));
		describeDistributionProductsResponse.setPageNumber(_ctx.integerValue("DescribeDistributionProductsResponse.PageNumber"));
		describeDistributionProductsResponse.setPageSize(_ctx.integerValue("DescribeDistributionProductsResponse.PageSize"));
		describeDistributionProductsResponse.setTotalCount(_ctx.integerValue("DescribeDistributionProductsResponse.TotalCount"));

		List<Result> results = new ArrayList<Result>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDistributionProductsResponse.Results.Length"); i++) {
			Result result = new Result();
			result.setFirstCategoryName(_ctx.stringValue("DescribeDistributionProductsResponse.Results["+ i +"].FirstCategoryName"));
			result.setSecondCategoryName(_ctx.stringValue("DescribeDistributionProductsResponse.Results["+ i +"].SecondCategoryName"));
			result.setType(_ctx.stringValue("DescribeDistributionProductsResponse.Results["+ i +"].Type"));
			result.setImageUrl(_ctx.stringValue("DescribeDistributionProductsResponse.Results["+ i +"].ImageUrl"));
			result.setCode(_ctx.stringValue("DescribeDistributionProductsResponse.Results["+ i +"].Code"));
			result.setName(_ctx.stringValue("DescribeDistributionProductsResponse.Results["+ i +"].Name"));
			result.setShortDescription(_ctx.stringValue("DescribeDistributionProductsResponse.Results["+ i +"].ShortDescription"));
			result.setPrice(_ctx.stringValue("DescribeDistributionProductsResponse.Results["+ i +"].Price"));
			result.setScore(_ctx.stringValue("DescribeDistributionProductsResponse.Results["+ i +"].Score"));
			result.setTradeCount(_ctx.stringValue("DescribeDistributionProductsResponse.Results["+ i +"].TradeCount"));
			result.setUserCommentCount(_ctx.stringValue("DescribeDistributionProductsResponse.Results["+ i +"].UserCommentCount"));
			result.setSubmissionRadio(_ctx.stringValue("DescribeDistributionProductsResponse.Results["+ i +"].SubmissionRadio"));
			result.setSupplierName(_ctx.stringValue("DescribeDistributionProductsResponse.Results["+ i +"].SupplierName"));
			result.setSupplierUId(_ctx.stringValue("DescribeDistributionProductsResponse.Results["+ i +"].SupplierUId"));

			results.add(result);
		}
		describeDistributionProductsResponse.setResults(results);
	 
	 	return describeDistributionProductsResponse;
	}
}