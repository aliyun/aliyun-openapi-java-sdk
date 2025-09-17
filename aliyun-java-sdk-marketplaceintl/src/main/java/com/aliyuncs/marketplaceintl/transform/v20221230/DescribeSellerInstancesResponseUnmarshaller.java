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

package com.aliyuncs.marketplaceintl.transform.v20221230;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.marketplaceintl.model.v20221230.DescribeSellerInstancesResponse;
import com.aliyuncs.marketplaceintl.model.v20221230.DescribeSellerInstancesResponse.ResultItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeSellerInstancesResponseUnmarshaller {

	public static DescribeSellerInstancesResponse unmarshall(DescribeSellerInstancesResponse describeSellerInstancesResponse, UnmarshallerContext _ctx) {
		
		describeSellerInstancesResponse.setRequestId(_ctx.stringValue("DescribeSellerInstancesResponse.RequestId"));
		describeSellerInstancesResponse.setPageSize(_ctx.longValue("DescribeSellerInstancesResponse.PageSize"));
		describeSellerInstancesResponse.setMessage(_ctx.stringValue("DescribeSellerInstancesResponse.Message"));
		describeSellerInstancesResponse.setPageNumber(_ctx.longValue("DescribeSellerInstancesResponse.PageNumber"));
		describeSellerInstancesResponse.setVersion(_ctx.stringValue("DescribeSellerInstancesResponse.Version"));
		describeSellerInstancesResponse.setCount(_ctx.longValue("DescribeSellerInstancesResponse.Count"));
		describeSellerInstancesResponse.setFatal(_ctx.booleanValue("DescribeSellerInstancesResponse.Fatal"));
		describeSellerInstancesResponse.setCode(_ctx.stringValue("DescribeSellerInstancesResponse.Code"));
		describeSellerInstancesResponse.setSuccess(_ctx.booleanValue("DescribeSellerInstancesResponse.Success"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeSellerInstancesResponse.Result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setAppInfo(_ctx.stringValue("DescribeSellerInstancesResponse.Result["+ i +"].AppInfo"));
			resultItem.setCommodityCode(_ctx.stringValue("DescribeSellerInstancesResponse.Result["+ i +"].CommodityCode"));
			resultItem.setCreatedOn(_ctx.longValue("DescribeSellerInstancesResponse.Result["+ i +"].CreatedOn"));
			resultItem.setInstanceId(_ctx.longValue("DescribeSellerInstancesResponse.Result["+ i +"].InstanceId"));
			resultItem.setInstanceStatus(_ctx.stringValue("DescribeSellerInstancesResponse.Result["+ i +"].InstanceStatus"));
			resultItem.setUserId(_ctx.longValue("DescribeSellerInstancesResponse.Result["+ i +"].UserId"));
			resultItem.setHostInfo(_ctx.stringValue("DescribeSellerInstancesResponse.Result["+ i +"].HostInfo"));
			resultItem.setInfo(_ctx.stringValue("DescribeSellerInstancesResponse.Result["+ i +"].Info"));
			resultItem.setChargeType(_ctx.integerValue("DescribeSellerInstancesResponse.Result["+ i +"].ChargeType"));

			result.add(resultItem);
		}
		describeSellerInstancesResponse.setResult(result);
	 
	 	return describeSellerInstancesResponse;
	}
}