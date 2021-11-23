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

import com.aliyuncs.bssopenapi.model.v20171214.DescribeResourceUsageDetailResponse;
import com.aliyuncs.bssopenapi.model.v20171214.DescribeResourceUsageDetailResponse.Data;
import com.aliyuncs.bssopenapi.model.v20171214.DescribeResourceUsageDetailResponse.Data.Item;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeResourceUsageDetailResponseUnmarshaller {

	public static DescribeResourceUsageDetailResponse unmarshall(DescribeResourceUsageDetailResponse describeResourceUsageDetailResponse, UnmarshallerContext _ctx) {
		
		describeResourceUsageDetailResponse.setRequestId(_ctx.stringValue("DescribeResourceUsageDetailResponse.RequestId"));
		describeResourceUsageDetailResponse.setCode(_ctx.stringValue("DescribeResourceUsageDetailResponse.Code"));
		describeResourceUsageDetailResponse.setMessage(_ctx.stringValue("DescribeResourceUsageDetailResponse.Message"));
		describeResourceUsageDetailResponse.setSuccess(_ctx.booleanValue("DescribeResourceUsageDetailResponse.Success"));

		Data data = new Data();
		data.setNextToken(_ctx.stringValue("DescribeResourceUsageDetailResponse.Data.NextToken"));
		data.setTotalCount(_ctx.integerValue("DescribeResourceUsageDetailResponse.Data.TotalCount"));
		data.setMaxResults(_ctx.integerValue("DescribeResourceUsageDetailResponse.Data.MaxResults"));

		List<Item> items = new ArrayList<Item>();
		for (int i = 0; i < _ctx.lengthValue("DescribeResourceUsageDetailResponse.Data.Items.Length"); i++) {
			Item item = new Item();
			item.setStatus(_ctx.stringValue("DescribeResourceUsageDetailResponse.Data.Items["+ i +"].Status"));
			item.setUsagePercentage(_ctx.floatValue("DescribeResourceUsageDetailResponse.Data.Items["+ i +"].UsagePercentage"));
			item.setResourceInstanceId(_ctx.stringValue("DescribeResourceUsageDetailResponse.Data.Items["+ i +"].ResourceInstanceId"));
			item.setTotalQuantity(_ctx.floatValue("DescribeResourceUsageDetailResponse.Data.Items["+ i +"].TotalQuantity"));
			item.setReservationCost(_ctx.stringValue("DescribeResourceUsageDetailResponse.Data.Items["+ i +"].ReservationCost"));
			item.setRegionNo(_ctx.stringValue("DescribeResourceUsageDetailResponse.Data.Items["+ i +"].RegionNo"));
			item.setUserId(_ctx.stringValue("DescribeResourceUsageDetailResponse.Data.Items["+ i +"].UserId"));
			item.setStatusName(_ctx.stringValue("DescribeResourceUsageDetailResponse.Data.Items["+ i +"].StatusName"));
			item.setCapacityUnit(_ctx.stringValue("DescribeResourceUsageDetailResponse.Data.Items["+ i +"].CapacityUnit"));
			item.setPotentialSavedCost(_ctx.stringValue("DescribeResourceUsageDetailResponse.Data.Items["+ i +"].PotentialSavedCost"));
			item.setCurrency(_ctx.stringValue("DescribeResourceUsageDetailResponse.Data.Items["+ i +"].Currency"));
			item.setZoneName(_ctx.stringValue("DescribeResourceUsageDetailResponse.Data.Items["+ i +"].ZoneName"));
			item.setInstanceSpec(_ctx.stringValue("DescribeResourceUsageDetailResponse.Data.Items["+ i +"].InstanceSpec"));
			item.setEndTime(_ctx.stringValue("DescribeResourceUsageDetailResponse.Data.Items["+ i +"].EndTime"));
			item.setPostpaidCost(_ctx.stringValue("DescribeResourceUsageDetailResponse.Data.Items["+ i +"].PostpaidCost"));
			item.setImageType(_ctx.stringValue("DescribeResourceUsageDetailResponse.Data.Items["+ i +"].ImageType"));
			item.setStartTime(_ctx.stringValue("DescribeResourceUsageDetailResponse.Data.Items["+ i +"].StartTime"));
			item.setRegion(_ctx.stringValue("DescribeResourceUsageDetailResponse.Data.Items["+ i +"].Region"));
			item.setDeductQuantity(_ctx.floatValue("DescribeResourceUsageDetailResponse.Data.Items["+ i +"].DeductQuantity"));
			item.setSavedCost(_ctx.stringValue("DescribeResourceUsageDetailResponse.Data.Items["+ i +"].SavedCost"));
			item.setZone(_ctx.stringValue("DescribeResourceUsageDetailResponse.Data.Items["+ i +"].Zone"));
			item.setUserName(_ctx.stringValue("DescribeResourceUsageDetailResponse.Data.Items["+ i +"].UserName"));
			item.setQuantity(_ctx.longValue("DescribeResourceUsageDetailResponse.Data.Items["+ i +"].Quantity"));

			items.add(item);
		}
		data.setItems(items);
		describeResourceUsageDetailResponse.setData(data);
	 
	 	return describeResourceUsageDetailResponse;
	}
}