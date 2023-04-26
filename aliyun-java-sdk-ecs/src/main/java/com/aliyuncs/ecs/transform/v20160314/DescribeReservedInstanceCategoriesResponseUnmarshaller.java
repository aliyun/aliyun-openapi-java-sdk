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

package com.aliyuncs.ecs.transform.v20160314;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecs.model.v20160314.DescribeReservedInstanceCategoriesResponse;
import com.aliyuncs.ecs.model.v20160314.DescribeReservedInstanceCategoriesResponse.ReservedInstanceCategory;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeReservedInstanceCategoriesResponseUnmarshaller {

	public static DescribeReservedInstanceCategoriesResponse unmarshall(DescribeReservedInstanceCategoriesResponse describeReservedInstanceCategoriesResponse, UnmarshallerContext _ctx) {
		
		describeReservedInstanceCategoriesResponse.setRequestId(_ctx.stringValue("DescribeReservedInstanceCategoriesResponse.RequestId"));
		describeReservedInstanceCategoriesResponse.setPageSize(_ctx.integerValue("DescribeReservedInstanceCategoriesResponse.PageSize"));
		describeReservedInstanceCategoriesResponse.setPageNumber(_ctx.integerValue("DescribeReservedInstanceCategoriesResponse.PageNumber"));
		describeReservedInstanceCategoriesResponse.setTotalCount(_ctx.integerValue("DescribeReservedInstanceCategoriesResponse.TotalCount"));

		List<ReservedInstanceCategory> reservedInstanceCategories = new ArrayList<ReservedInstanceCategory>();
		for (int i = 0; i < _ctx.lengthValue("DescribeReservedInstanceCategoriesResponse.ReservedInstanceCategories.Length"); i++) {
			ReservedInstanceCategory reservedInstanceCategory = new ReservedInstanceCategory();
			reservedInstanceCategory.setAmount(_ctx.integerValue("DescribeReservedInstanceCategoriesResponse.ReservedInstanceCategories["+ i +"].Amount"));
			reservedInstanceCategory.setPlatform(_ctx.stringValue("DescribeReservedInstanceCategoriesResponse.ReservedInstanceCategories["+ i +"].Platform"));
			reservedInstanceCategory.setZoneId(_ctx.stringValue("DescribeReservedInstanceCategoriesResponse.ReservedInstanceCategories["+ i +"].ZoneId"));
			reservedInstanceCategory.setScope(_ctx.stringValue("DescribeReservedInstanceCategoriesResponse.ReservedInstanceCategories["+ i +"].Scope"));
			reservedInstanceCategory.setInstanceType(_ctx.stringValue("DescribeReservedInstanceCategoriesResponse.ReservedInstanceCategories["+ i +"].InstanceType"));
			reservedInstanceCategory.setInstanceAmount(_ctx.integerValue("DescribeReservedInstanceCategoriesResponse.ReservedInstanceCategories["+ i +"].InstanceAmount"));
			reservedInstanceCategory.setRegionId(_ctx.stringValue("DescribeReservedInstanceCategoriesResponse.ReservedInstanceCategories["+ i +"].RegionId"));

			reservedInstanceCategories.add(reservedInstanceCategory);
		}
		describeReservedInstanceCategoriesResponse.setReservedInstanceCategories(reservedInstanceCategories);
	 
	 	return describeReservedInstanceCategoriesResponse;
	}
}