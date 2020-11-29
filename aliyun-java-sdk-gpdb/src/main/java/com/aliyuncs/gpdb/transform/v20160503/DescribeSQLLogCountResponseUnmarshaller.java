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

package com.aliyuncs.gpdb.transform.v20160503;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.gpdb.model.v20160503.DescribeSQLLogCountResponse;
import com.aliyuncs.gpdb.model.v20160503.DescribeSQLLogCountResponse.Item;
import com.aliyuncs.gpdb.model.v20160503.DescribeSQLLogCountResponse.Item.SeriesItem;
import com.aliyuncs.gpdb.model.v20160503.DescribeSQLLogCountResponse.Item.SeriesItem.ValueItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeSQLLogCountResponseUnmarshaller {

	public static DescribeSQLLogCountResponse unmarshall(DescribeSQLLogCountResponse describeSQLLogCountResponse, UnmarshallerContext _ctx) {
		
		describeSQLLogCountResponse.setRequestId(_ctx.stringValue("DescribeSQLLogCountResponse.RequestId"));
		describeSQLLogCountResponse.setDBClusterId(_ctx.stringValue("DescribeSQLLogCountResponse.DBClusterId"));
		describeSQLLogCountResponse.setStartTime(_ctx.stringValue("DescribeSQLLogCountResponse.StartTime"));
		describeSQLLogCountResponse.setEndTime(_ctx.stringValue("DescribeSQLLogCountResponse.EndTime"));

		List<Item> items = new ArrayList<Item>();
		for (int i = 0; i < _ctx.lengthValue("DescribeSQLLogCountResponse.Items.Length"); i++) {
			Item item = new Item();
			item.setName(_ctx.stringValue("DescribeSQLLogCountResponse.Items["+ i +"].Name"));

			List<SeriesItem> series = new ArrayList<SeriesItem>();
			for (int j = 0; j < _ctx.lengthValue("DescribeSQLLogCountResponse.Items["+ i +"].Series.Length"); j++) {
				SeriesItem seriesItem = new SeriesItem();

				List<ValueItem> values = new ArrayList<ValueItem>();
				for (int k = 0; k < _ctx.lengthValue("DescribeSQLLogCountResponse.Items["+ i +"].Series["+ j +"].Values.Length"); k++) {
					ValueItem valueItem = new ValueItem();

					List<String> point = new ArrayList<String>();
					for (int l = 0; l < _ctx.lengthValue("DescribeSQLLogCountResponse.Items["+ i +"].Series["+ j +"].Values["+ k +"].Point.Length"); l++) {
						point.add(_ctx.stringValue("DescribeSQLLogCountResponse.Items["+ i +"].Series["+ j +"].Values["+ k +"].Point["+ l +"]"));
					}
					valueItem.setPoint(point);

					values.add(valueItem);
				}
				seriesItem.setValues(values);

				series.add(seriesItem);
			}
			item.setSeries(series);

			items.add(item);
		}
		describeSQLLogCountResponse.setItems(items);
	 
	 	return describeSQLLogCountResponse;
	}
}