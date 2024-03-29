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

package com.aliyuncs.bssopenapi.transform.v20171214;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.bssopenapi.model.v20171214.DescribeResourceCoverageDetailResponse;
import com.aliyuncs.bssopenapi.model.v20171214.DescribeResourceCoverageDetailResponse.Data;
import com.aliyuncs.bssopenapi.model.v20171214.DescribeResourceCoverageDetailResponse.Data.Item;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeResourceCoverageDetailResponseUnmarshaller {

	public static DescribeResourceCoverageDetailResponse unmarshall(DescribeResourceCoverageDetailResponse describeResourceCoverageDetailResponse, UnmarshallerContext _ctx) {
		
		describeResourceCoverageDetailResponse.setRequestId(_ctx.stringValue("DescribeResourceCoverageDetailResponse.RequestId"));
		describeResourceCoverageDetailResponse.setCode(_ctx.stringValue("DescribeResourceCoverageDetailResponse.Code"));
		describeResourceCoverageDetailResponse.setMessage(_ctx.stringValue("DescribeResourceCoverageDetailResponse.Message"));
		describeResourceCoverageDetailResponse.setSuccess(_ctx.booleanValue("DescribeResourceCoverageDetailResponse.Success"));

		Data data = new Data();
		data.setNextToken(_ctx.stringValue("DescribeResourceCoverageDetailResponse.Data.NextToken"));
		data.setTotalCount(_ctx.integerValue("DescribeResourceCoverageDetailResponse.Data.TotalCount"));
		data.setMaxResults(_ctx.integerValue("DescribeResourceCoverageDetailResponse.Data.MaxResults"));

		List<Item> items = new ArrayList<Item>();
		for (int i = 0; i < _ctx.lengthValue("DescribeResourceCoverageDetailResponse.Data.Items.Length"); i++) {
			Item item = new Item();
			item.setCommodityCode(_ctx.stringValue("DescribeResourceCoverageDetailResponse.Data.Items["+ i +"].CommodityCode"));
			item.setProductName(_ctx.stringValue("DescribeResourceCoverageDetailResponse.Data.Items["+ i +"].ProductName"));
			item.setTotalQuantity(_ctx.floatValue("DescribeResourceCoverageDetailResponse.Data.Items["+ i +"].TotalQuantity"));
			item.setRegionNo(_ctx.stringValue("DescribeResourceCoverageDetailResponse.Data.Items["+ i +"].RegionNo"));
			item.setUserId(_ctx.stringValue("DescribeResourceCoverageDetailResponse.Data.Items["+ i +"].UserId"));
			item.setCommodityName(_ctx.stringValue("DescribeResourceCoverageDetailResponse.Data.Items["+ i +"].CommodityName"));
			item.setCapacityUnit(_ctx.stringValue("DescribeResourceCoverageDetailResponse.Data.Items["+ i +"].CapacityUnit"));
			item.setInstanceId(_ctx.stringValue("DescribeResourceCoverageDetailResponse.Data.Items["+ i +"].InstanceId"));
			item.setCurrency(_ctx.stringValue("DescribeResourceCoverageDetailResponse.Data.Items["+ i +"].Currency"));
			item.setZoneName(_ctx.stringValue("DescribeResourceCoverageDetailResponse.Data.Items["+ i +"].ZoneName"));
			item.setInstanceSpec(_ctx.stringValue("DescribeResourceCoverageDetailResponse.Data.Items["+ i +"].InstanceSpec"));
			item.setEndTime(_ctx.stringValue("DescribeResourceCoverageDetailResponse.Data.Items["+ i +"].EndTime"));
			item.setStartTime(_ctx.stringValue("DescribeResourceCoverageDetailResponse.Data.Items["+ i +"].StartTime"));
			item.setPaymentAmount(_ctx.floatValue("DescribeResourceCoverageDetailResponse.Data.Items["+ i +"].PaymentAmount"));
			item.setCoveragePercentage(_ctx.floatValue("DescribeResourceCoverageDetailResponse.Data.Items["+ i +"].CoveragePercentage"));
			item.setRegion(_ctx.stringValue("DescribeResourceCoverageDetailResponse.Data.Items["+ i +"].Region"));
			item.setDeductQuantity(_ctx.floatValue("DescribeResourceCoverageDetailResponse.Data.Items["+ i +"].DeductQuantity"));
			item.setZone(_ctx.stringValue("DescribeResourceCoverageDetailResponse.Data.Items["+ i +"].Zone"));
			item.setUserName(_ctx.stringValue("DescribeResourceCoverageDetailResponse.Data.Items["+ i +"].UserName"));
			item.setProductCode(_ctx.stringValue("DescribeResourceCoverageDetailResponse.Data.Items["+ i +"].ProductCode"));

			items.add(item);
		}
		data.setItems(items);
		describeResourceCoverageDetailResponse.setData(data);
	 
	 	return describeResourceCoverageDetailResponse;
	}
}