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

package com.aliyuncs.rds.transform.v20140815;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.rds.model.v20140815.DescribeSQLLogReportListResponse;
import com.aliyuncs.rds.model.v20140815.DescribeSQLLogReportListResponse.Item;
import com.aliyuncs.rds.model.v20140815.DescribeSQLLogReportListResponse.Item.LatencyTopNItem;
import com.aliyuncs.rds.model.v20140815.DescribeSQLLogReportListResponse.Item.QPSTopNItem;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeSQLLogReportListResponseUnmarshaller {

	public static DescribeSQLLogReportListResponse unmarshall(DescribeSQLLogReportListResponse describeSQLLogReportListResponse, UnmarshallerContext context) {
		
		describeSQLLogReportListResponse.setRequestId(context.stringValue("DescribeSQLLogReportListResponse.RequestId"));
		describeSQLLogReportListResponse.setTotalRecordCount(context.integerValue("DescribeSQLLogReportListResponse.TotalRecordCount"));
		describeSQLLogReportListResponse.setPageNumber(context.integerValue("DescribeSQLLogReportListResponse.PageNumber"));
		describeSQLLogReportListResponse.setPageRecordCount(context.integerValue("DescribeSQLLogReportListResponse.PageRecordCount"));

		List<Item> items = new ArrayList<Item>();
		for (int i = 0; i < context.lengthValue("DescribeSQLLogReportListResponse.Items.Length"); i++) {
			Item item = new Item();
			item.setReportTime(context.stringValue("DescribeSQLLogReportListResponse.Items["+ i +"].ReportTime"));

			List<LatencyTopNItem> latencyTopNItems = new ArrayList<LatencyTopNItem>();
			for (int j = 0; j < context.lengthValue("DescribeSQLLogReportListResponse.Items["+ i +"].LatencyTopNItems.Length"); j++) {
				LatencyTopNItem latencyTopNItem = new LatencyTopNItem();
				latencyTopNItem.setSQLText(context.stringValue("DescribeSQLLogReportListResponse.Items["+ i +"].LatencyTopNItems["+ j +"].SQLText"));
				latencyTopNItem.setAvgLatency(context.longValue("DescribeSQLLogReportListResponse.Items["+ i +"].LatencyTopNItems["+ j +"].AvgLatency"));
				latencyTopNItem.setSQLExecuteTimes(context.longValue("DescribeSQLLogReportListResponse.Items["+ i +"].LatencyTopNItems["+ j +"].SQLExecuteTimes"));

				latencyTopNItems.add(latencyTopNItem);
			}
			item.setLatencyTopNItems(latencyTopNItems);

			List<QPSTopNItem> qPSTopNItems = new ArrayList<QPSTopNItem>();
			for (int j = 0; j < context.lengthValue("DescribeSQLLogReportListResponse.Items["+ i +"].QPSTopNItems.Length"); j++) {
				QPSTopNItem qPSTopNItem = new QPSTopNItem();
				qPSTopNItem.setSQLText(context.stringValue("DescribeSQLLogReportListResponse.Items["+ i +"].QPSTopNItems["+ j +"].SQLText"));
				qPSTopNItem.setSQLExecuteTimes(context.longValue("DescribeSQLLogReportListResponse.Items["+ i +"].QPSTopNItems["+ j +"].SQLExecuteTimes"));

				qPSTopNItems.add(qPSTopNItem);
			}
			item.setQPSTopNItems(qPSTopNItems);

			items.add(item);
		}
		describeSQLLogReportListResponse.setItems(items);
	 
	 	return describeSQLLogReportListResponse;
	}
}