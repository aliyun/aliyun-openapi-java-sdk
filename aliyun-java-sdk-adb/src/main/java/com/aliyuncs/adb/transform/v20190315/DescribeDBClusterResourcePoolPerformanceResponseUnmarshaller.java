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

package com.aliyuncs.adb.transform.v20190315;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.adb.model.v20190315.DescribeDBClusterResourcePoolPerformanceResponse;
import com.aliyuncs.adb.model.v20190315.DescribeDBClusterResourcePoolPerformanceResponse.PerformanceItem;
import com.aliyuncs.adb.model.v20190315.DescribeDBClusterResourcePoolPerformanceResponse.PerformanceItem.ResourcePoolPerformancesItem;
import com.aliyuncs.adb.model.v20190315.DescribeDBClusterResourcePoolPerformanceResponse.PerformanceItem.ResourcePoolPerformancesItem.ResourcePoolSeriesItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDBClusterResourcePoolPerformanceResponseUnmarshaller {

	public static DescribeDBClusterResourcePoolPerformanceResponse unmarshall(DescribeDBClusterResourcePoolPerformanceResponse describeDBClusterResourcePoolPerformanceResponse, UnmarshallerContext _ctx) {
		
		describeDBClusterResourcePoolPerformanceResponse.setRequestId(_ctx.stringValue("DescribeDBClusterResourcePoolPerformanceResponse.RequestId"));
		describeDBClusterResourcePoolPerformanceResponse.setDBClusterId(_ctx.stringValue("DescribeDBClusterResourcePoolPerformanceResponse.DBClusterId"));
		describeDBClusterResourcePoolPerformanceResponse.setStartTime(_ctx.stringValue("DescribeDBClusterResourcePoolPerformanceResponse.StartTime"));
		describeDBClusterResourcePoolPerformanceResponse.setEndTime(_ctx.stringValue("DescribeDBClusterResourcePoolPerformanceResponse.EndTime"));

		List<PerformanceItem> performances = new ArrayList<PerformanceItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDBClusterResourcePoolPerformanceResponse.Performances.Length"); i++) {
			PerformanceItem performanceItem = new PerformanceItem();
			performanceItem.setKey(_ctx.stringValue("DescribeDBClusterResourcePoolPerformanceResponse.Performances["+ i +"].Key"));
			performanceItem.setUnit(_ctx.stringValue("DescribeDBClusterResourcePoolPerformanceResponse.Performances["+ i +"].Unit"));

			List<ResourcePoolPerformancesItem> resourcePoolPerformances = new ArrayList<ResourcePoolPerformancesItem>();
			for (int j = 0; j < _ctx.lengthValue("DescribeDBClusterResourcePoolPerformanceResponse.Performances["+ i +"].ResourcePoolPerformances.Length"); j++) {
				ResourcePoolPerformancesItem resourcePoolPerformancesItem = new ResourcePoolPerformancesItem();
				resourcePoolPerformancesItem.setResourcePoolName(_ctx.stringValue("DescribeDBClusterResourcePoolPerformanceResponse.Performances["+ i +"].ResourcePoolPerformances["+ j +"].ResourcePoolName"));

				List<ResourcePoolSeriesItem> resourcePoolSeries = new ArrayList<ResourcePoolSeriesItem>();
				for (int k = 0; k < _ctx.lengthValue("DescribeDBClusterResourcePoolPerformanceResponse.Performances["+ i +"].ResourcePoolPerformances["+ j +"].ResourcePoolSeries.Length"); k++) {
					ResourcePoolSeriesItem resourcePoolSeriesItem = new ResourcePoolSeriesItem();
					resourcePoolSeriesItem.setName(_ctx.stringValue("DescribeDBClusterResourcePoolPerformanceResponse.Performances["+ i +"].ResourcePoolPerformances["+ j +"].ResourcePoolSeries["+ k +"].Name"));

					List<String> values = new ArrayList<String>();
					for (int l = 0; l < _ctx.lengthValue("DescribeDBClusterResourcePoolPerformanceResponse.Performances["+ i +"].ResourcePoolPerformances["+ j +"].ResourcePoolSeries["+ k +"].Values.Length"); l++) {
						values.add(_ctx.stringValue("DescribeDBClusterResourcePoolPerformanceResponse.Performances["+ i +"].ResourcePoolPerformances["+ j +"].ResourcePoolSeries["+ k +"].Values["+ l +"]"));
					}
					resourcePoolSeriesItem.setValues(values);

					resourcePoolSeries.add(resourcePoolSeriesItem);
				}
				resourcePoolPerformancesItem.setResourcePoolSeries(resourcePoolSeries);

				resourcePoolPerformances.add(resourcePoolPerformancesItem);
			}
			performanceItem.setResourcePoolPerformances(resourcePoolPerformances);

			performances.add(performanceItem);
		}
		describeDBClusterResourcePoolPerformanceResponse.setPerformances(performances);
	 
	 	return describeDBClusterResourcePoolPerformanceResponse;
	}
}