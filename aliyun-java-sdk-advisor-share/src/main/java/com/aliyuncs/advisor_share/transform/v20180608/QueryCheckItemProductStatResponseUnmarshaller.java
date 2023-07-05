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

package com.aliyuncs.advisor_share.transform.v20180608;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.advisor_share.model.v20180608.QueryCheckItemProductStatResponse;
import com.aliyuncs.advisor_share.model.v20180608.QueryCheckItemProductStatResponse.Data;
import com.aliyuncs.advisor_share.model.v20180608.QueryCheckItemProductStatResponse.Data.SeriesItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryCheckItemProductStatResponseUnmarshaller {

	public static QueryCheckItemProductStatResponse unmarshall(QueryCheckItemProductStatResponse queryCheckItemProductStatResponse, UnmarshallerContext _ctx) {
		
		queryCheckItemProductStatResponse.setRequestId(_ctx.stringValue("QueryCheckItemProductStatResponse.RequestId"));

		Data data = new Data();

		List<String> categories = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("QueryCheckItemProductStatResponse.Data.Categories.Length"); i++) {
			categories.add(_ctx.stringValue("QueryCheckItemProductStatResponse.Data.Categories["+ i +"]"));
		}
		data.setCategories(categories);

		List<SeriesItem> series = new ArrayList<SeriesItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryCheckItemProductStatResponse.Data.Series.Length"); i++) {
			SeriesItem seriesItem = new SeriesItem();
			seriesItem.setName(_ctx.stringValue("QueryCheckItemProductStatResponse.Data.Series["+ i +"].Name"));
			seriesItem.setUnit(_ctx.stringValue("QueryCheckItemProductStatResponse.Data.Series["+ i +"].Unit"));

			List<String> data1 = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("QueryCheckItemProductStatResponse.Data.Series["+ i +"].Data.Length"); j++) {
				data1.add(_ctx.stringValue("QueryCheckItemProductStatResponse.Data.Series["+ i +"].Data["+ j +"]"));
			}
			seriesItem.setData1(data1);

			series.add(seriesItem);
		}
		data.setSeries(series);
		queryCheckItemProductStatResponse.setData(data);
	 
	 	return queryCheckItemProductStatResponse;
	}
}