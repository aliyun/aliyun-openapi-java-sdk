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

package com.aliyuncs.yundun_ds.transform.v20190103;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.yundun_ds.model.v20190103.DescribeDepartCountsResponse;
import com.aliyuncs.yundun_ds.model.v20190103.DescribeDepartCountsResponse.DepartCount;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDepartCountsResponseUnmarshaller {

	public static DescribeDepartCountsResponse unmarshall(DescribeDepartCountsResponse describeDepartCountsResponse, UnmarshallerContext context) {
		
		describeDepartCountsResponse.setRequestId(context.stringValue("DescribeDepartCountsResponse.RequestId"));
		describeDepartCountsResponse.setPageSize(context.integerValue("DescribeDepartCountsResponse.PageSize"));
		describeDepartCountsResponse.setCurrentPage(context.integerValue("DescribeDepartCountsResponse.CurrentPage"));
		describeDepartCountsResponse.setTotalCount(context.integerValue("DescribeDepartCountsResponse.TotalCount"));

		List<DepartCount> items = new ArrayList<DepartCount>();
		for (int i = 0; i < context.lengthValue("DescribeDepartCountsResponse.Items.Length"); i++) {
			DepartCount departCount = new DepartCount();
			departCount.setDepartName(context.stringValue("DescribeDepartCountsResponse.Items["+ i +"].DepartName"));
			departCount.setDepartCount(context.longValue("DescribeDepartCountsResponse.Items["+ i +"].DepartCount"));
			departCount.setCount(context.longValue("DescribeDepartCountsResponse.Items["+ i +"].Count"));
			departCount.setUserCount(context.longValue("DescribeDepartCountsResponse.Items["+ i +"].UserCount"));
			departCount.setDtCount(context.longValue("DescribeDepartCountsResponse.Items["+ i +"].DtCount"));
			departCount.setSubCount(context.longValue("DescribeDepartCountsResponse.Items["+ i +"].SubCount"));
			departCount.setSensitiveCount(context.longValue("DescribeDepartCountsResponse.Items["+ i +"].SensitiveCount"));
			departCount.setEventTotalCount(context.longValue("DescribeDepartCountsResponse.Items["+ i +"].EventTotalCount"));
			departCount.setConfirmCount(context.longValue("DescribeDepartCountsResponse.Items["+ i +"].ConfirmCount"));
			departCount.setUserConfirmCount(context.longValue("DescribeDepartCountsResponse.Items["+ i +"].UserConfirmCount"));
			departCount.setLastEventCount(context.longValue("DescribeDepartCountsResponse.Items["+ i +"].LastEventCount"));
			departCount.setTopSubTypeName(context.longValue("DescribeDepartCountsResponse.Items["+ i +"].TopSubTypeName"));
			departCount.setTopDisplayName(context.longValue("DescribeDepartCountsResponse.Items["+ i +"].TopDisplayName"));

			items.add(departCount);
		}
		describeDepartCountsResponse.setItems(items);
	 
	 	return describeDepartCountsResponse;
	}
}