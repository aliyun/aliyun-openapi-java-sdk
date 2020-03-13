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

import com.aliyuncs.sofa.model.v20190815.ListDSTTopNMetricsResponse;
import com.aliyuncs.sofa.model.v20190815.ListDSTTopNMetricsResponse.ResultsItem;
import com.aliyuncs.sofa.model.v20190815.ListDSTTopNMetricsResponse.ResultsItem.ValuesItem;
import com.aliyuncs.sofa.model.v20190815.ListDSTTopNMetricsResponse.ResultsItem.ValuesItem.TagsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListDSTTopNMetricsResponseUnmarshaller {

	public static ListDSTTopNMetricsResponse unmarshall(ListDSTTopNMetricsResponse listDSTTopNMetricsResponse, UnmarshallerContext _ctx) {
		
		listDSTTopNMetricsResponse.setRequestId(_ctx.stringValue("ListDSTTopNMetricsResponse.RequestId"));
		listDSTTopNMetricsResponse.setResultCode(_ctx.stringValue("ListDSTTopNMetricsResponse.ResultCode"));
		listDSTTopNMetricsResponse.setResultMessage(_ctx.stringValue("ListDSTTopNMetricsResponse.ResultMessage"));

		List<ResultsItem> results = new ArrayList<ResultsItem>();
		for (int i = 0; i < _ctx.lengthValue("ListDSTTopNMetricsResponse.Results.Length"); i++) {
			ResultsItem resultsItem = new ResultsItem();
			resultsItem.setEndTime(_ctx.longValue("ListDSTTopNMetricsResponse.Results["+ i +"].EndTime"));
			resultsItem.setMetric(_ctx.stringValue("ListDSTTopNMetricsResponse.Results["+ i +"].Metric"));
			resultsItem.setStartTime(_ctx.longValue("ListDSTTopNMetricsResponse.Results["+ i +"].StartTime"));
			resultsItem.setType(_ctx.stringValue("ListDSTTopNMetricsResponse.Results["+ i +"].Type"));

			List<ValuesItem> values = new ArrayList<ValuesItem>();
			for (int j = 0; j < _ctx.lengthValue("ListDSTTopNMetricsResponse.Results["+ i +"].Values.Length"); j++) {
				ValuesItem valuesItem = new ValuesItem();
				valuesItem.setValue(_ctx.stringValue("ListDSTTopNMetricsResponse.Results["+ i +"].Values["+ j +"].Value"));

				List<TagsItem> tags = new ArrayList<TagsItem>();
				for (int k = 0; k < _ctx.lengthValue("ListDSTTopNMetricsResponse.Results["+ i +"].Values["+ j +"].Tags.Length"); k++) {
					TagsItem tagsItem = new TagsItem();
					tagsItem.setKey(_ctx.stringValue("ListDSTTopNMetricsResponse.Results["+ i +"].Values["+ j +"].Tags["+ k +"].Key"));
					tagsItem.setValue(_ctx.stringValue("ListDSTTopNMetricsResponse.Results["+ i +"].Values["+ j +"].Tags["+ k +"].Value"));

					tags.add(tagsItem);
				}
				valuesItem.setTags(tags);

				values.add(valuesItem);
			}
			resultsItem.setValues(values);

			results.add(resultsItem);
		}
		listDSTTopNMetricsResponse.setResults(results);
	 
	 	return listDSTTopNMetricsResponse;
	}
}