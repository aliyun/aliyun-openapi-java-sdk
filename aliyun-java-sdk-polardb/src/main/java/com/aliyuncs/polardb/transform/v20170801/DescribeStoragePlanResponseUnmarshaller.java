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

package com.aliyuncs.polardb.transform.v20170801;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.polardb.model.v20170801.DescribeStoragePlanResponse;
import com.aliyuncs.polardb.model.v20170801.DescribeStoragePlanResponse.DescribeStoragePlanResponses;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeStoragePlanResponseUnmarshaller {

	public static DescribeStoragePlanResponse unmarshall(DescribeStoragePlanResponse describeStoragePlanResponse, UnmarshallerContext _ctx) {
		
		describeStoragePlanResponse.setRequestId(_ctx.stringValue("DescribeStoragePlanResponse.RequestId"));
		describeStoragePlanResponse.setTotalRecordCount(_ctx.longValue("DescribeStoragePlanResponse.TotalRecordCount"));
		describeStoragePlanResponse.setPageSize(_ctx.longValue("DescribeStoragePlanResponse.PageSize"));
		describeStoragePlanResponse.setPageNumber(_ctx.longValue("DescribeStoragePlanResponse.PageNumber"));

		List<DescribeStoragePlanResponses> items = new ArrayList<DescribeStoragePlanResponses>();
		for (int i = 0; i < _ctx.lengthValue("DescribeStoragePlanResponse.Items.Length"); i++) {
			DescribeStoragePlanResponses describeStoragePlanResponses = new DescribeStoragePlanResponses();
			describeStoragePlanResponses.setProdCode(_ctx.stringValue("DescribeStoragePlanResponse.Items["+ i +"].ProdCode"));
			describeStoragePlanResponses.setAliUid(_ctx.stringValue("DescribeStoragePlanResponse.Items["+ i +"].AliUid"));
			describeStoragePlanResponses.setCommodityCode(_ctx.stringValue("DescribeStoragePlanResponse.Items["+ i +"].CommodityCode"));
			describeStoragePlanResponses.setTemplateName(_ctx.stringValue("DescribeStoragePlanResponse.Items["+ i +"].TemplateName"));
			describeStoragePlanResponses.setStorageType(_ctx.stringValue("DescribeStoragePlanResponse.Items["+ i +"].StorageType"));
			describeStoragePlanResponses.setStatus(_ctx.stringValue("DescribeStoragePlanResponse.Items["+ i +"].Status"));
			describeStoragePlanResponses.setStartTimes(_ctx.stringValue("DescribeStoragePlanResponse.Items["+ i +"].StartTimes"));
			describeStoragePlanResponses.setEndTimes(_ctx.stringValue("DescribeStoragePlanResponse.Items["+ i +"].EndTimes"));
			describeStoragePlanResponses.setPurchaseTimes(_ctx.stringValue("DescribeStoragePlanResponse.Items["+ i +"].PurchaseTimes"));
			describeStoragePlanResponses.setInstanceId(_ctx.stringValue("DescribeStoragePlanResponse.Items["+ i +"].InstanceId"));
			describeStoragePlanResponses.setInitCapacityViewValue(_ctx.stringValue("DescribeStoragePlanResponse.Items["+ i +"].InitCapacityViewValue"));
			describeStoragePlanResponses.setInitCapaCityViewUnit(_ctx.stringValue("DescribeStoragePlanResponse.Items["+ i +"].InitCapaCityViewUnit"));
			describeStoragePlanResponses.setPeriodCapacityViewValue(_ctx.stringValue("DescribeStoragePlanResponse.Items["+ i +"].PeriodCapacityViewValue"));
			describeStoragePlanResponses.setPeriodCapaCityViewUnit(_ctx.stringValue("DescribeStoragePlanResponse.Items["+ i +"].PeriodCapaCityViewUnit"));
			describeStoragePlanResponses.setPeriodTime(_ctx.stringValue("DescribeStoragePlanResponse.Items["+ i +"].PeriodTime"));

			items.add(describeStoragePlanResponses);
		}
		describeStoragePlanResponse.setItems(items);
	 
	 	return describeStoragePlanResponse;
	}
}