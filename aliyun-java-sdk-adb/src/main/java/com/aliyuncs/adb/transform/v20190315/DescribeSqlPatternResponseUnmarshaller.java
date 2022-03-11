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

import com.aliyuncs.adb.model.v20190315.DescribeSqlPatternResponse;
import com.aliyuncs.adb.model.v20190315.DescribeSqlPatternResponse.ItemsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeSqlPatternResponseUnmarshaller {

	public static DescribeSqlPatternResponse unmarshall(DescribeSqlPatternResponse describeSqlPatternResponse, UnmarshallerContext _ctx) {
		
		describeSqlPatternResponse.setRequestId(_ctx.stringValue("DescribeSqlPatternResponse.RequestId"));
		describeSqlPatternResponse.setPageSize(_ctx.integerValue("DescribeSqlPatternResponse.PageSize"));
		describeSqlPatternResponse.setPageNumber(_ctx.integerValue("DescribeSqlPatternResponse.PageNumber"));
		describeSqlPatternResponse.setTotalCount(_ctx.integerValue("DescribeSqlPatternResponse.TotalCount"));

		List<ItemsItem> items = new ArrayList<ItemsItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeSqlPatternResponse.Items.Length"); i++) {
			ItemsItem itemsItem = new ItemsItem();
			itemsItem.setAvgStageCount(_ctx.stringValue("DescribeSqlPatternResponse.Items["+ i +"].AvgStageCount"));
			itemsItem.setMaxCpuTime(_ctx.stringValue("DescribeSqlPatternResponse.Items["+ i +"].MaxCpuTime"));
			itemsItem.setAccessIP(_ctx.stringValue("DescribeSqlPatternResponse.Items["+ i +"].AccessIP"));
			itemsItem.setAvgScanSize(_ctx.stringValue("DescribeSqlPatternResponse.Items["+ i +"].AvgScanSize"));
			itemsItem.setMaxScanSize(_ctx.stringValue("DescribeSqlPatternResponse.Items["+ i +"].MaxScanSize"));
			itemsItem.setMaxPeakMemory(_ctx.stringValue("DescribeSqlPatternResponse.Items["+ i +"].MaxPeakMemory"));
			itemsItem.setAvgCpuTime(_ctx.stringValue("DescribeSqlPatternResponse.Items["+ i +"].AvgCpuTime"));
			itemsItem.setUser(_ctx.stringValue("DescribeSqlPatternResponse.Items["+ i +"].User"));
			itemsItem.setAvgPeakMemory(_ctx.stringValue("DescribeSqlPatternResponse.Items["+ i +"].AvgPeakMemory"));
			itemsItem.setMaxStageCount(_ctx.stringValue("DescribeSqlPatternResponse.Items["+ i +"].MaxStageCount"));
			itemsItem.setMaxTaskCount(_ctx.stringValue("DescribeSqlPatternResponse.Items["+ i +"].MaxTaskCount"));
			itemsItem.setInstanceName(_ctx.stringValue("DescribeSqlPatternResponse.Items["+ i +"].InstanceName"));
			itemsItem.setQueryCount(_ctx.stringValue("DescribeSqlPatternResponse.Items["+ i +"].QueryCount"));
			itemsItem.setReportDate(_ctx.stringValue("DescribeSqlPatternResponse.Items["+ i +"].ReportDate"));
			itemsItem.setPattern(_ctx.stringValue("DescribeSqlPatternResponse.Items["+ i +"].Pattern"));
			itemsItem.setAvgTaskCount(_ctx.stringValue("DescribeSqlPatternResponse.Items["+ i +"].AvgTaskCount"));

			items.add(itemsItem);
		}
		describeSqlPatternResponse.setItems(items);
	 
	 	return describeSqlPatternResponse;
	}
}