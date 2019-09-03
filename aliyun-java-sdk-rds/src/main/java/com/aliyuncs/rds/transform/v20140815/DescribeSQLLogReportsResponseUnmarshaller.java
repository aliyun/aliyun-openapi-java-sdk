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

import com.aliyuncs.rds.model.v20140815.DescribeSQLLogReportsResponse;
import com.aliyuncs.rds.model.v20140815.DescribeSQLLogReportsResponse.Item;
import com.aliyuncs.rds.model.v20140815.DescribeSQLLogReportsResponse.Item.LatencyTopNItem;
import com.aliyuncs.rds.model.v20140815.DescribeSQLLogReportsResponse.Item.QPSTopNItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeSQLLogReportsResponseUnmarshaller {

	public static DescribeSQLLogReportsResponse unmarshall(DescribeSQLLogReportsResponse describeSQLLogReportsResponse, UnmarshallerContext _ctx) {
		
		describeSQLLogReportsResponse.setRequestId(_ctx.stringValue("DescribeSQLLogReportsResponse.RequestId"));
		describeSQLLogReportsResponse.setTotalRecordCount(_ctx.integerValue("DescribeSQLLogReportsResponse.TotalRecordCount"));
		describeSQLLogReportsResponse.setPageNumber(_ctx.integerValue("DescribeSQLLogReportsResponse.PageNumber"));
		describeSQLLogReportsResponse.setPageRecordCount(_ctx.integerValue("DescribeSQLLogReportsResponse.PageRecordCount"));

		List<Item> items = new ArrayList<Item>();
		for (int i = 0; i < _ctx.lengthValue("DescribeSQLLogReportsResponse.Items.Length"); i++) {
			Item item = new Item();
			item.setReportTime(_ctx.stringValue("DescribeSQLLogReportsResponse.Items["+ i +"].ReportTime"));

			List<LatencyTopNItem> latencyTopNItems = new ArrayList<LatencyTopNItem>();
			for (int j = 0; j < _ctx.lengthValue("DescribeSQLLogReportsResponse.Items["+ i +"].LatencyTopNItems.Length"); j++) {
				LatencyTopNItem latencyTopNItem = new LatencyTopNItem();
				latencyTopNItem.setSQLText(_ctx.stringValue("DescribeSQLLogReportsResponse.Items["+ i +"].LatencyTopNItems["+ j +"].SQLText"));
				latencyTopNItem.setAvgLatency(_ctx.longValue("DescribeSQLLogReportsResponse.Items["+ i +"].LatencyTopNItems["+ j +"].AvgLatency"));
				latencyTopNItem.setSQLExecuteTimes(_ctx.longValue("DescribeSQLLogReportsResponse.Items["+ i +"].LatencyTopNItems["+ j +"].SQLExecuteTimes"));

				latencyTopNItems.add(latencyTopNItem);
			}
			item.setLatencyTopNItems(latencyTopNItems);

			List<QPSTopNItem> qPSTopNItems = new ArrayList<QPSTopNItem>();
			for (int j = 0; j < _ctx.lengthValue("DescribeSQLLogReportsResponse.Items["+ i +"].QPSTopNItems.Length"); j++) {
				QPSTopNItem qPSTopNItem = new QPSTopNItem();
				qPSTopNItem.setSQLText(_ctx.stringValue("DescribeSQLLogReportsResponse.Items["+ i +"].QPSTopNItems["+ j +"].SQLText"));
				qPSTopNItem.setSQLExecuteTimes(_ctx.longValue("DescribeSQLLogReportsResponse.Items["+ i +"].QPSTopNItems["+ j +"].SQLExecuteTimes"));

				qPSTopNItems.add(qPSTopNItem);
			}
			item.setQPSTopNItems(qPSTopNItems);

			items.add(item);
		}
		describeSQLLogReportsResponse.setItems(items);
	 
	 	return describeSQLLogReportsResponse;
	}
}