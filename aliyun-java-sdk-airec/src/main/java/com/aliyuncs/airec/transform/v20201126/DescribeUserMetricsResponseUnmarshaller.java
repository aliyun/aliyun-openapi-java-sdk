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

package com.aliyuncs.airec.transform.v20201126;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.airec.model.v20201126.DescribeUserMetricsResponse;
import com.aliyuncs.airec.model.v20201126.DescribeUserMetricsResponse.ResultItem;
import com.aliyuncs.airec.model.v20201126.DescribeUserMetricsResponse.ResultItem.DataPointsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeUserMetricsResponseUnmarshaller {

	public static DescribeUserMetricsResponse unmarshall(DescribeUserMetricsResponse describeUserMetricsResponse, UnmarshallerContext _ctx) {
		
		describeUserMetricsResponse.setCode(_ctx.stringValue("DescribeUserMetricsResponse.code"));
		describeUserMetricsResponse.setMessage(_ctx.stringValue("DescribeUserMetricsResponse.message"));
		describeUserMetricsResponse.setRequestId(_ctx.stringValue("DescribeUserMetricsResponse.requestId"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeUserMetricsResponse.result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setSceneId(_ctx.stringValue("DescribeUserMetricsResponse.result["+ i +"].sceneId"));

			List<DataPointsItem> dataPoints = new ArrayList<DataPointsItem>();
			for (int j = 0; j < _ctx.lengthValue("DescribeUserMetricsResponse.result["+ i +"].dataPoints.Length"); j++) {
				DataPointsItem dataPointsItem = new DataPointsItem();
				dataPointsItem.setEndTime(_ctx.longValue("DescribeUserMetricsResponse.result["+ i +"].dataPoints["+ j +"].endTime"));
				dataPointsItem.setStartTime(_ctx.longValue("DescribeUserMetricsResponse.result["+ i +"].dataPoints["+ j +"].startTime"));
				dataPointsItem.setVal(_ctx.floatValue("DescribeUserMetricsResponse.result["+ i +"].dataPoints["+ j +"].val"));

				dataPoints.add(dataPointsItem);
			}
			resultItem.setDataPoints(dataPoints);

			result.add(resultItem);
		}
		describeUserMetricsResponse.setResult(result);
	 
	 	return describeUserMetricsResponse;
	}
}