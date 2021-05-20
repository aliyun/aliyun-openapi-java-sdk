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
		describeResourceCoverageDetailResponse.setSuccess(_ctx.booleanValue("DescribeResourceCoverageDetailResponse.Success"));
		describeResourceCoverageDetailResponse.setCode(_ctx.stringValue("DescribeResourceCoverageDetailResponse.Code"));
		describeResourceCoverageDetailResponse.setMessage(_ctx.stringValue("DescribeResourceCoverageDetailResponse.Message"));

		Data data = new Data();
		data.setTotalCount(_ctx.integerValue("DescribeResourceCoverageDetailResponse.Data.TotalCount"));
		data.setNextToken(_ctx.stringValue("DescribeResourceCoverageDetailResponse.Data.NextToken"));
		data.setMaxResults(_ctx.integerValue("DescribeResourceCoverageDetailResponse.Data.MaxResults"));

		List<Item> items = new ArrayList<Item>();
		for (int i = 0; i < _ctx.lengthValue("DescribeResourceCoverageDetailResponse.Data.Items.Length"); i++) {
			Item item = new Item();
			item.setUserId(_ctx.stringValue("DescribeResourceCoverageDetailResponse.Data.Items["+ i +"].UserId"));
			item.setUserName(_ctx.stringValue("DescribeResourceCoverageDetailResponse.Data.Items["+ i +"].UserName"));
			item.setProductCode(_ctx.stringValue("DescribeResourceCoverageDetailResponse.Data.Items["+ i +"].ProductCode"));
			item.setProductName(_ctx.stringValue("DescribeResourceCoverageDetailResponse.Data.Items["+ i +"].ProductName"));
			item.setCommodityCode(_ctx.stringValue("DescribeResourceCoverageDetailResponse.Data.Items["+ i +"].CommodityCode"));
			item.setCommodityName(_ctx.stringValue("DescribeResourceCoverageDetailResponse.Data.Items["+ i +"].CommodityName"));
			item.setInstanceId(_ctx.stringValue("DescribeResourceCoverageDetailResponse.Data.Items["+ i +"].InstanceId"));
			item.setRegion(_ctx.stringValue("DescribeResourceCoverageDetailResponse.Data.Items["+ i +"].Region"));
			item.setRegionNo(_ctx.stringValue("DescribeResourceCoverageDetailResponse.Data.Items["+ i +"].RegionNo"));
			item.setZone(_ctx.stringValue("DescribeResourceCoverageDetailResponse.Data.Items["+ i +"].Zone"));
			item.setZoneName(_ctx.stringValue("DescribeResourceCoverageDetailResponse.Data.Items["+ i +"].ZoneName"));
			item.setInstanceSpec(_ctx.stringValue("DescribeResourceCoverageDetailResponse.Data.Items["+ i +"].InstanceSpec"));
			item.setCurrency(_ctx.stringValue("DescribeResourceCoverageDetailResponse.Data.Items["+ i +"].Currency"));
			item.setCoveragePercentage(_ctx.floatValue("DescribeResourceCoverageDetailResponse.Data.Items["+ i +"].CoveragePercentage"));
			item.setPaymentAmount(_ctx.floatValue("DescribeResourceCoverageDetailResponse.Data.Items["+ i +"].PaymentAmount"));
			item.setDeductQuantity(_ctx.floatValue("DescribeResourceCoverageDetailResponse.Data.Items["+ i +"].DeductQuantity"));
			item.setTotalQuantity(_ctx.floatValue("DescribeResourceCoverageDetailResponse.Data.Items["+ i +"].TotalQuantity"));
			item.setCapacityUnit(_ctx.stringValue("DescribeResourceCoverageDetailResponse.Data.Items["+ i +"].CapacityUnit"));
			item.setStartTime(_ctx.stringValue("DescribeResourceCoverageDetailResponse.Data.Items["+ i +"].StartTime"));
			item.setEndTime(_ctx.stringValue("DescribeResourceCoverageDetailResponse.Data.Items["+ i +"].EndTime"));

			items.add(item);
		}
		data.setItems(items);
		describeResourceCoverageDetailResponse.setData(data);
	 
	 	return describeResourceCoverageDetailResponse;
	}
}