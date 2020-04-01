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

package com.aliyuncs.airec.transform.v20181012;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.airec.model.v20181012.DescribeUserMetricsResponse;
import com.aliyuncs.airec.model.v20181012.DescribeUserMetricsResponse.ResultItem;
import com.aliyuncs.airec.model.v20181012.DescribeUserMetricsResponse.ResultItem.DataPointsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeUserMetricsResponseUnmarshaller {

	public static DescribeUserMetricsResponse unmarshall(DescribeUserMetricsResponse describeUserMetricsResponse, UnmarshallerContext _ctx) {
		
		describeUserMetricsResponse.setRequestId(_ctx.stringValue("DescribeUserMetricsResponse.RequestId"));
		describeUserMetricsResponse.setCode(_ctx.stringValue("DescribeUserMetricsResponse.Code"));
		describeUserMetricsResponse.setMessage(_ctx.stringValue("DescribeUserMetricsResponse.Message"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeUserMetricsResponse.Result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setSceneId(_ctx.stringValue("DescribeUserMetricsResponse.Result["+ i +"].SceneId"));

			List<DataPointsItem> dataPoints = new ArrayList<DataPointsItem>();
			for (int j = 0; j < _ctx.lengthValue("DescribeUserMetricsResponse.Result["+ i +"].DataPoints.Length"); j++) {
				DataPointsItem dataPointsItem = new DataPointsItem();
				dataPointsItem.setVal(_ctx.floatValue("DescribeUserMetricsResponse.Result["+ i +"].DataPoints["+ j +"].Val"));
				dataPointsItem.setStartTime(_ctx.longValue("DescribeUserMetricsResponse.Result["+ i +"].DataPoints["+ j +"].StartTime"));
				dataPointsItem.setEndTime(_ctx.longValue("DescribeUserMetricsResponse.Result["+ i +"].DataPoints["+ j +"].EndTime"));

				dataPoints.add(dataPointsItem);
			}
			resultItem.setDataPoints(dataPoints);

			result.add(resultItem);
		}
		describeUserMetricsResponse.setResult(result);
	 
	 	return describeUserMetricsResponse;
	}
}