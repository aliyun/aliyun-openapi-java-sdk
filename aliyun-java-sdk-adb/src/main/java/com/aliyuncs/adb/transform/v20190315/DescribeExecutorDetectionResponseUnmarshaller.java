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

import com.aliyuncs.adb.model.v20190315.DescribeExecutorDetectionResponse;
import com.aliyuncs.adb.model.v20190315.DescribeExecutorDetectionResponse.BaseDetectionItem;
import com.aliyuncs.adb.model.v20190315.DescribeExecutorDetectionResponse.BaseDetectionItem.Results;
import com.aliyuncs.adb.model.v20190315.DescribeExecutorDetectionResponse.BaseDetectionItem.Results.BadOperatorAgg;
import com.aliyuncs.adb.model.v20190315.DescribeExecutorDetectionResponse.BaseDetectionItem.Results.BadOperatorAgg.ResultList2;
import com.aliyuncs.adb.model.v20190315.DescribeExecutorDetectionResponse.BaseDetectionItem.Results.BadOperatorDetails;
import com.aliyuncs.adb.model.v20190315.DescribeExecutorDetectionResponse.BaseDetectionItem.Results.BadOperatorDetails.ResultList;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeExecutorDetectionResponseUnmarshaller {

	public static DescribeExecutorDetectionResponse unmarshall(DescribeExecutorDetectionResponse describeExecutorDetectionResponse, UnmarshallerContext _ctx) {
		
		describeExecutorDetectionResponse.setRequestId(_ctx.stringValue("DescribeExecutorDetectionResponse.RequestId"));
		describeExecutorDetectionResponse.setTotalCount(_ctx.stringValue("DescribeExecutorDetectionResponse.TotalCount"));
		describeExecutorDetectionResponse.setDBClusterId(_ctx.stringValue("DescribeExecutorDetectionResponse.DBClusterId"));

		List<BaseDetectionItem> detectionItems = new ArrayList<BaseDetectionItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeExecutorDetectionResponse.DetectionItems.Length"); i++) {
			BaseDetectionItem baseDetectionItem = new BaseDetectionItem();
			baseDetectionItem.setName(_ctx.stringValue("DescribeExecutorDetectionResponse.DetectionItems["+ i +"].Name"));
			baseDetectionItem.setMessage(_ctx.stringValue("DescribeExecutorDetectionResponse.DetectionItems["+ i +"].Message"));
			baseDetectionItem.setStatus(_ctx.stringValue("DescribeExecutorDetectionResponse.DetectionItems["+ i +"].Status"));

			Results results = new Results();

			List<BadOperatorDetails> operatorDetails = new ArrayList<BadOperatorDetails>();
			for (int j = 0; j < _ctx.lengthValue("DescribeExecutorDetectionResponse.DetectionItems["+ i +"].Results.OperatorDetails.Length"); j++) {
				BadOperatorDetails badOperatorDetails = new BadOperatorDetails();
				badOperatorDetails.setMetricName(_ctx.stringValue("DescribeExecutorDetectionResponse.DetectionItems["+ i +"].Results.OperatorDetails["+ j +"].MetricName"));

				List<ResultList> searchResults = new ArrayList<ResultList>();
				for (int k = 0; k < _ctx.lengthValue("DescribeExecutorDetectionResponse.DetectionItems["+ i +"].Results.OperatorDetails["+ j +"].SearchResults.Length"); k++) {
					ResultList resultList = new ResultList();
					resultList.setProcessId(_ctx.stringValue("DescribeExecutorDetectionResponse.DetectionItems["+ i +"].Results.OperatorDetails["+ j +"].SearchResults["+ k +"].ProcessId"));
					resultList.setStageId(_ctx.stringValue("DescribeExecutorDetectionResponse.DetectionItems["+ i +"].Results.OperatorDetails["+ j +"].SearchResults["+ k +"].StageId"));
					resultList.setOperatorName(_ctx.stringValue("DescribeExecutorDetectionResponse.DetectionItems["+ i +"].Results.OperatorDetails["+ j +"].SearchResults["+ k +"].OperatorName"));
					resultList.setPeakMemory(_ctx.longValue("DescribeExecutorDetectionResponse.DetectionItems["+ i +"].Results.OperatorDetails["+ j +"].SearchResults["+ k +"].PeakMemory"));
					resultList.setOperatorCost(_ctx.doubleValue("DescribeExecutorDetectionResponse.DetectionItems["+ i +"].Results.OperatorDetails["+ j +"].SearchResults["+ k +"].OperatorCost"));
					resultList.setInputRows(_ctx.longValue("DescribeExecutorDetectionResponse.DetectionItems["+ i +"].Results.OperatorDetails["+ j +"].SearchResults["+ k +"].InputRows"));
					resultList.setOutputRows(_ctx.longValue("DescribeExecutorDetectionResponse.DetectionItems["+ i +"].Results.OperatorDetails["+ j +"].SearchResults["+ k +"].OutputRows"));
					resultList.setInputSize(_ctx.longValue("DescribeExecutorDetectionResponse.DetectionItems["+ i +"].Results.OperatorDetails["+ j +"].SearchResults["+ k +"].InputSize"));
					resultList.setOutputSize(_ctx.longValue("DescribeExecutorDetectionResponse.DetectionItems["+ i +"].Results.OperatorDetails["+ j +"].SearchResults["+ k +"].OutputSize"));
					resultList.setOperatorInfo(_ctx.stringValue("DescribeExecutorDetectionResponse.DetectionItems["+ i +"].Results.OperatorDetails["+ j +"].SearchResults["+ k +"].OperatorInfo"));

					searchResults.add(resultList);
				}
				badOperatorDetails.setSearchResults(searchResults);

				operatorDetails.add(badOperatorDetails);
			}
			results.setOperatorDetails(operatorDetails);

			List<BadOperatorAgg> operatorAgg = new ArrayList<BadOperatorAgg>();
			for (int j = 0; j < _ctx.lengthValue("DescribeExecutorDetectionResponse.DetectionItems["+ i +"].Results.OperatorAgg.Length"); j++) {
				BadOperatorAgg badOperatorAgg = new BadOperatorAgg();
				badOperatorAgg.setMetricName(_ctx.stringValue("DescribeExecutorDetectionResponse.DetectionItems["+ i +"].Results.OperatorAgg["+ j +"].MetricName"));

				List<ResultList2> searchResults1 = new ArrayList<ResultList2>();
				for (int k = 0; k < _ctx.lengthValue("DescribeExecutorDetectionResponse.DetectionItems["+ i +"].Results.OperatorAgg["+ j +"].SearchResults.Length"); k++) {
					ResultList2 resultList2 = new ResultList2();
					resultList2.setOperatorName(_ctx.stringValue("DescribeExecutorDetectionResponse.DetectionItems["+ i +"].Results.OperatorAgg["+ j +"].SearchResults["+ k +"].OperatorName"));
					resultList2.setMaxValue(_ctx.longValue("DescribeExecutorDetectionResponse.DetectionItems["+ i +"].Results.OperatorAgg["+ j +"].SearchResults["+ k +"].MaxValue"));
					resultList2.setTotalValue(_ctx.longValue("DescribeExecutorDetectionResponse.DetectionItems["+ i +"].Results.OperatorAgg["+ j +"].SearchResults["+ k +"].TotalValue"));
					resultList2.setAvgValue(_ctx.doubleValue("DescribeExecutorDetectionResponse.DetectionItems["+ i +"].Results.OperatorAgg["+ j +"].SearchResults["+ k +"].AvgValue"));
					resultList2.setOperatorCount(_ctx.longValue("DescribeExecutorDetectionResponse.DetectionItems["+ i +"].Results.OperatorAgg["+ j +"].SearchResults["+ k +"].OperatorCount"));

					searchResults1.add(resultList2);
				}
				badOperatorAgg.setSearchResults1(searchResults1);

				operatorAgg.add(badOperatorAgg);
			}
			results.setOperatorAgg(operatorAgg);
			baseDetectionItem.setResults(results);

			detectionItems.add(baseDetectionItem);
		}
		describeExecutorDetectionResponse.setDetectionItems(detectionItems);
	 
	 	return describeExecutorDetectionResponse;
	}
}