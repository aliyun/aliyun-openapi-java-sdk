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

package com.aliyuncs.paifeaturestore.transform.v20230621;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.paifeaturestore.model.v20230621.ListDatasourceFeatureViewsResponse;
import com.aliyuncs.paifeaturestore.model.v20230621.ListDatasourceFeatureViewsResponse.DatasourceFeatureViews;
import com.aliyuncs.paifeaturestore.model.v20230621.ListDatasourceFeatureViewsResponse.DatasourceFeatureViews.UsageStatistics;
import com.aliyuncs.paifeaturestore.model.v20230621.ListDatasourceFeatureViewsResponse.DatasourceFeatureViews.UsageStatistics.ReadWriteCountItem;
import com.aliyuncs.paifeaturestore.model.v20230621.ListDatasourceFeatureViewsResponse.TotalUsageStatistics;
import com.aliyuncs.paifeaturestore.model.v20230621.ListDatasourceFeatureViewsResponse.TotalUsageStatistics.TotalReadWriteCountItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListDatasourceFeatureViewsResponseUnmarshaller {

	public static ListDatasourceFeatureViewsResponse unmarshall(ListDatasourceFeatureViewsResponse listDatasourceFeatureViewsResponse, UnmarshallerContext _ctx) {
		
		listDatasourceFeatureViewsResponse.setTotalCount(_ctx.longValue("ListDatasourceFeatureViewsResponse.TotalCount"));
		listDatasourceFeatureViewsResponse.setRequestId(_ctx.stringValue("ListDatasourceFeatureViewsResponse.requestId"));

		TotalUsageStatistics totalUsageStatistics = new TotalUsageStatistics();
		totalUsageStatistics.setTotalDiskUsage(_ctx.doubleValue("ListDatasourceFeatureViewsResponse.TotalUsageStatistics.TotalDiskUsage"));
		totalUsageStatistics.setTotalMemoryUsage(_ctx.doubleValue("ListDatasourceFeatureViewsResponse.TotalUsageStatistics.TotalMemoryUsage"));

		List<TotalReadWriteCountItem> totalReadWriteCount = new ArrayList<TotalReadWriteCountItem>();
		for (int i = 0; i < _ctx.lengthValue("ListDatasourceFeatureViewsResponse.TotalUsageStatistics.TotalReadWriteCount.Length"); i++) {
			TotalReadWriteCountItem totalReadWriteCountItem = new TotalReadWriteCountItem();
			totalReadWriteCountItem.setDate(_ctx.stringValue("ListDatasourceFeatureViewsResponse.TotalUsageStatistics.TotalReadWriteCount["+ i +"].Date"));
			totalReadWriteCountItem.setTotalWriteCount(_ctx.longValue("ListDatasourceFeatureViewsResponse.TotalUsageStatistics.TotalReadWriteCount["+ i +"].TotalWriteCount"));
			totalReadWriteCountItem.setTotalReadCount(_ctx.longValue("ListDatasourceFeatureViewsResponse.TotalUsageStatistics.TotalReadWriteCount["+ i +"].TotalReadCount"));

			totalReadWriteCount.add(totalReadWriteCountItem);
		}
		totalUsageStatistics.setTotalReadWriteCount(totalReadWriteCount);
		listDatasourceFeatureViewsResponse.setTotalUsageStatistics(totalUsageStatistics);

		List<DatasourceFeatureViews> featureViews = new ArrayList<DatasourceFeatureViews>();
		for (int i = 0; i < _ctx.lengthValue("ListDatasourceFeatureViewsResponse.FeatureViews.Length"); i++) {
			DatasourceFeatureViews datasourceFeatureViews = new DatasourceFeatureViews();
			datasourceFeatureViews.setFeatureViewId(_ctx.stringValue("ListDatasourceFeatureViewsResponse.FeatureViews["+ i +"].FeatureViewId"));
			datasourceFeatureViews.setName(_ctx.stringValue("ListDatasourceFeatureViewsResponse.FeatureViews["+ i +"].Name"));
			datasourceFeatureViews.setProjectName(_ctx.stringValue("ListDatasourceFeatureViewsResponse.FeatureViews["+ i +"].ProjectName"));
			datasourceFeatureViews.setType(_ctx.stringValue("ListDatasourceFeatureViewsResponse.FeatureViews["+ i +"].Type"));
			datasourceFeatureViews.setFeatureEntityName(_ctx.stringValue("ListDatasourceFeatureViewsResponse.FeatureViews["+ i +"].FeatureEntityName"));
			datasourceFeatureViews.setTTL(_ctx.integerValue("ListDatasourceFeatureViewsResponse.FeatureViews["+ i +"].TTL"));
			datasourceFeatureViews.setConfig(_ctx.stringValue("ListDatasourceFeatureViewsResponse.FeatureViews["+ i +"].Config"));

			UsageStatistics usageStatistics = new UsageStatistics();
			usageStatistics.setRowCount(_ctx.longValue("ListDatasourceFeatureViewsResponse.FeatureViews["+ i +"].UsageStatistics.RowCount"));
			usageStatistics.setDiskUsage(_ctx.doubleValue("ListDatasourceFeatureViewsResponse.FeatureViews["+ i +"].UsageStatistics.DiskUsage"));
			usageStatistics.setMemoryUsage(_ctx.doubleValue("ListDatasourceFeatureViewsResponse.FeatureViews["+ i +"].UsageStatistics.MemoryUsage"));

			List<ReadWriteCountItem> readWriteCount = new ArrayList<ReadWriteCountItem>();
			for (int j = 0; j < _ctx.lengthValue("ListDatasourceFeatureViewsResponse.FeatureViews["+ i +"].UsageStatistics.ReadWriteCount.Length"); j++) {
				ReadWriteCountItem readWriteCountItem = new ReadWriteCountItem();
				readWriteCountItem.setDate(_ctx.stringValue("ListDatasourceFeatureViewsResponse.FeatureViews["+ i +"].UsageStatistics.ReadWriteCount["+ j +"].Date"));
				readWriteCountItem.setWriteCount(_ctx.longValue("ListDatasourceFeatureViewsResponse.FeatureViews["+ i +"].UsageStatistics.ReadWriteCount["+ j +"].WriteCount"));
				readWriteCountItem.setReadCount(_ctx.longValue("ListDatasourceFeatureViewsResponse.FeatureViews["+ i +"].UsageStatistics.ReadWriteCount["+ j +"].ReadCount"));

				readWriteCount.add(readWriteCountItem);
			}
			usageStatistics.setReadWriteCount(readWriteCount);
			datasourceFeatureViews.setUsageStatistics(usageStatistics);

			featureViews.add(datasourceFeatureViews);
		}
		listDatasourceFeatureViewsResponse.setFeatureViews(featureViews);
	 
	 	return listDatasourceFeatureViewsResponse;
	}
}