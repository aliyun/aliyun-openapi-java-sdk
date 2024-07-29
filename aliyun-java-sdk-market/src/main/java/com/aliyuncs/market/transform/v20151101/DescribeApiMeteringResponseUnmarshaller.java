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

import com.aliyuncs.market.model.v20151101.DescribeApiMeteringResponse;
import com.aliyuncs.market.model.v20151101.DescribeApiMeteringResponse.ResultItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeApiMeteringResponseUnmarshaller {

	public static DescribeApiMeteringResponse unmarshall(DescribeApiMeteringResponse describeApiMeteringResponse, UnmarshallerContext _ctx) {
		
		describeApiMeteringResponse.setRequestId(_ctx.stringValue("DescribeApiMeteringResponse.RequestId"));
		describeApiMeteringResponse.setCode(_ctx.stringValue("DescribeApiMeteringResponse.Code"));
		describeApiMeteringResponse.setPageNumber(_ctx.longValue("DescribeApiMeteringResponse.PageNumber"));
		describeApiMeteringResponse.setSuccess(_ctx.booleanValue("DescribeApiMeteringResponse.Success"));
		describeApiMeteringResponse.setCount(_ctx.longValue("DescribeApiMeteringResponse.Count"));
		describeApiMeteringResponse.setPageSize(_ctx.longValue("DescribeApiMeteringResponse.PageSize"));
		describeApiMeteringResponse.setMessage(_ctx.stringValue("DescribeApiMeteringResponse.Message"));
		describeApiMeteringResponse.setVersion(_ctx.stringValue("DescribeApiMeteringResponse.Version"));
		describeApiMeteringResponse.setFatal(_ctx.booleanValue("DescribeApiMeteringResponse.Fatal"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeApiMeteringResponse.Result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setAliyunPk(_ctx.longValue("DescribeApiMeteringResponse.Result["+ i +"].AliyunPk"));
			resultItem.setProductCode(_ctx.stringValue("DescribeApiMeteringResponse.Result["+ i +"].ProductCode"));
			resultItem.setProductName(_ctx.stringValue("DescribeApiMeteringResponse.Result["+ i +"].ProductName"));
			resultItem.setTotalQuota(_ctx.longValue("DescribeApiMeteringResponse.Result["+ i +"].TotalQuota"));
			resultItem.setTotalUsage(_ctx.longValue("DescribeApiMeteringResponse.Result["+ i +"].TotalUsage"));
			resultItem.setTotalCapacity(_ctx.longValue("DescribeApiMeteringResponse.Result["+ i +"].TotalCapacity"));
			resultItem.setUnit(_ctx.stringValue("DescribeApiMeteringResponse.Result["+ i +"].Unit"));

			result.add(resultItem);
		}
		describeApiMeteringResponse.setResult(result);
	 
	 	return describeApiMeteringResponse;
	}
}