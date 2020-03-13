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

package com.aliyuncs.sofa.transform.v20190815;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sofa.model.v20190815.DescribeDSTTimeSeriesMetricsResponse;
import com.aliyuncs.sofa.model.v20190815.DescribeDSTTimeSeriesMetricsResponse.ResultsItem;
import com.aliyuncs.sofa.model.v20190815.DescribeDSTTimeSeriesMetricsResponse.ResultsItem.TagsItem;
import com.aliyuncs.sofa.model.v20190815.DescribeDSTTimeSeriesMetricsResponse.ResultsItem.ValuesItem;
import com.aliyuncs.sofa.model.v20190815.DescribeDSTTimeSeriesMetricsResponse.ResultsItem.ValuesItem.ValueItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDSTTimeSeriesMetricsResponseUnmarshaller {

	public static DescribeDSTTimeSeriesMetricsResponse unmarshall(DescribeDSTTimeSeriesMetricsResponse describeDSTTimeSeriesMetricsResponse, UnmarshallerContext _ctx) {
		
		describeDSTTimeSeriesMetricsResponse.setRequestId(_ctx.stringValue("DescribeDSTTimeSeriesMetricsResponse.RequestId"));
		describeDSTTimeSeriesMetricsResponse.setResultCode(_ctx.stringValue("DescribeDSTTimeSeriesMetricsResponse.ResultCode"));
		describeDSTTimeSeriesMetricsResponse.setResultMessage(_ctx.stringValue("DescribeDSTTimeSeriesMetricsResponse.ResultMessage"));

		List<ResultsItem> results = new ArrayList<ResultsItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDSTTimeSeriesMetricsResponse.Results.Length"); i++) {
			ResultsItem resultsItem = new ResultsItem();
			resultsItem.setEndTime(_ctx.longValue("DescribeDSTTimeSeriesMetricsResponse.Results["+ i +"].EndTime"));
			resultsItem.setStartTime(_ctx.longValue("DescribeDSTTimeSeriesMetricsResponse.Results["+ i +"].StartTime"));
			resultsItem.setType(_ctx.stringValue("DescribeDSTTimeSeriesMetricsResponse.Results["+ i +"].Type"));

			List<TagsItem> tags = new ArrayList<TagsItem>();
			for (int j = 0; j < _ctx.lengthValue("DescribeDSTTimeSeriesMetricsResponse.Results["+ i +"].Tags.Length"); j++) {
				TagsItem tagsItem = new TagsItem();
				tagsItem.setKey(_ctx.stringValue("DescribeDSTTimeSeriesMetricsResponse.Results["+ i +"].Tags["+ j +"].Key"));
				tagsItem.setValue(_ctx.stringValue("DescribeDSTTimeSeriesMetricsResponse.Results["+ i +"].Tags["+ j +"].Value"));

				tags.add(tagsItem);
			}
			resultsItem.setTags(tags);

			List<ValuesItem> values = new ArrayList<ValuesItem>();
			for (int j = 0; j < _ctx.lengthValue("DescribeDSTTimeSeriesMetricsResponse.Results["+ i +"].Values.Length"); j++) {
				ValuesItem valuesItem = new ValuesItem();
				valuesItem.setTimestamp(_ctx.longValue("DescribeDSTTimeSeriesMetricsResponse.Results["+ i +"].Values["+ j +"].Timestamp"));

				List<ValueItem> value = new ArrayList<ValueItem>();
				for (int k = 0; k < _ctx.lengthValue("DescribeDSTTimeSeriesMetricsResponse.Results["+ i +"].Values["+ j +"].Value.Length"); k++) {
					ValueItem valueItem = new ValueItem();
					valueItem.setKey(_ctx.stringValue("DescribeDSTTimeSeriesMetricsResponse.Results["+ i +"].Values["+ j +"].Value["+ k +"].Key"));
					valueItem.setValue(_ctx.stringValue("DescribeDSTTimeSeriesMetricsResponse.Results["+ i +"].Values["+ j +"].Value["+ k +"].Value"));

					value.add(valueItem);
				}
				valuesItem.setValue(value);

				values.add(valuesItem);
			}
			resultsItem.setValues(values);

			results.add(resultsItem);
		}
		describeDSTTimeSeriesMetricsResponse.setResults(results);
	 
	 	return describeDSTTimeSeriesMetricsResponse;
	}
}