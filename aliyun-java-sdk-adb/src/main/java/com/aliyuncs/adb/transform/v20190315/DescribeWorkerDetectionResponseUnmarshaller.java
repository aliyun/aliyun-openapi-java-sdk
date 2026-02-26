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

import com.aliyuncs.adb.model.v20190315.DescribeWorkerDetectionResponse;
import com.aliyuncs.adb.model.v20190315.DescribeWorkerDetectionResponse.BaseDetectionItem;
import com.aliyuncs.adb.model.v20190315.DescribeWorkerDetectionResponse.BaseDetectionItem.Results;
import com.aliyuncs.adb.model.v20190315.DescribeWorkerDetectionResponse.BaseDetectionItem.Results.BadOperatorAgg;
import com.aliyuncs.adb.model.v20190315.DescribeWorkerDetectionResponse.BaseDetectionItem.Results.BadOperatorAgg.ResultList4;
import com.aliyuncs.adb.model.v20190315.DescribeWorkerDetectionResponse.BaseDetectionItem.Results.BadOperatorDetails;
import com.aliyuncs.adb.model.v20190315.DescribeWorkerDetectionResponse.BaseDetectionItem.Results.BadOperatorDetails.ResultList2;
import com.aliyuncs.adb.model.v20190315.DescribeWorkerDetectionResponse.BaseDetectionItem.Results.PartitionedTablesList;
import com.aliyuncs.adb.model.v20190315.DescribeWorkerDetectionResponse.BaseDetectionItem.Results.SkewedTablesList;
import com.aliyuncs.adb.model.v20190315.DescribeWorkerDetectionResponse.BaseDetectionItem.Results.TopAccessTablesList;
import com.aliyuncs.adb.model.v20190315.DescribeWorkerDetectionResponse.BaseDetectionItem.Results.TopAccessTablesList.ResultList;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeWorkerDetectionResponseUnmarshaller {

	public static DescribeWorkerDetectionResponse unmarshall(DescribeWorkerDetectionResponse describeWorkerDetectionResponse, UnmarshallerContext _ctx) {
		
		describeWorkerDetectionResponse.setRequestId(_ctx.stringValue("DescribeWorkerDetectionResponse.RequestId"));
		describeWorkerDetectionResponse.setTotalCount(_ctx.stringValue("DescribeWorkerDetectionResponse.TotalCount"));
		describeWorkerDetectionResponse.setDBClusterId(_ctx.stringValue("DescribeWorkerDetectionResponse.DBClusterId"));

		List<BaseDetectionItem> detectionItems = new ArrayList<BaseDetectionItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeWorkerDetectionResponse.DetectionItems.Length"); i++) {
			BaseDetectionItem baseDetectionItem = new BaseDetectionItem();
			baseDetectionItem.setName(_ctx.stringValue("DescribeWorkerDetectionResponse.DetectionItems["+ i +"].Name"));
			baseDetectionItem.setMessage(_ctx.stringValue("DescribeWorkerDetectionResponse.DetectionItems["+ i +"].Message"));
			baseDetectionItem.setStatus(_ctx.stringValue("DescribeWorkerDetectionResponse.DetectionItems["+ i +"].Status"));

			Results results = new Results();

			List<SkewedTablesList> skewedTables = new ArrayList<SkewedTablesList>();
			for (int j = 0; j < _ctx.lengthValue("DescribeWorkerDetectionResponse.DetectionItems["+ i +"].Results.SkewedTables.Length"); j++) {
				SkewedTablesList skewedTablesList = new SkewedTablesList();
				skewedTablesList.setSchemaName(_ctx.stringValue("DescribeWorkerDetectionResponse.DetectionItems["+ i +"].Results.SkewedTables["+ j +"].SchemaName"));
				skewedTablesList.setTableName(_ctx.stringValue("DescribeWorkerDetectionResponse.DetectionItems["+ i +"].Results.SkewedTables["+ j +"].TableName"));
				skewedTablesList.setDDL(_ctx.stringValue("DescribeWorkerDetectionResponse.DetectionItems["+ i +"].Results.SkewedTables["+ j +"].DDL"));
				skewedTablesList.setPartitionCount(_ctx.integerValue("DescribeWorkerDetectionResponse.DetectionItems["+ i +"].Results.SkewedTables["+ j +"].PartitionCount"));
				skewedTablesList.setTotalDataSize(_ctx.longValue("DescribeWorkerDetectionResponse.DetectionItems["+ i +"].Results.SkewedTables["+ j +"].TotalDataSize"));
				skewedTablesList.setTotalRowCount(_ctx.longValue("DescribeWorkerDetectionResponse.DetectionItems["+ i +"].Results.SkewedTables["+ j +"].TotalRowCount"));
				skewedTablesList.setTotalPkSize(_ctx.longValue("DescribeWorkerDetectionResponse.DetectionItems["+ i +"].Results.SkewedTables["+ j +"].TotalPkSize"));
				skewedTablesList.setTotalRemoteDataSize(_ctx.longValue("DescribeWorkerDetectionResponse.DetectionItems["+ i +"].Results.SkewedTables["+ j +"].TotalRemoteDataSize"));
				skewedTablesList.setTotalLocalDataSize(_ctx.stringValue("DescribeWorkerDetectionResponse.DetectionItems["+ i +"].Results.SkewedTables["+ j +"].TotalLocalDataSize"));
				skewedTablesList.setShardSkewedRows(_ctx.stringValue("DescribeWorkerDetectionResponse.DetectionItems["+ i +"].Results.SkewedTables["+ j +"].ShardSkewedRows"));

				skewedTables.add(skewedTablesList);
			}
			results.setSkewedTables(skewedTables);

			List<PartitionedTablesList> partitionedTables = new ArrayList<PartitionedTablesList>();
			for (int j = 0; j < _ctx.lengthValue("DescribeWorkerDetectionResponse.DetectionItems["+ i +"].Results.PartitionedTables.Length"); j++) {
				PartitionedTablesList partitionedTablesList = new PartitionedTablesList();
				partitionedTablesList.setSchemaName(_ctx.stringValue("DescribeWorkerDetectionResponse.DetectionItems["+ i +"].Results.PartitionedTables["+ j +"].SchemaName"));
				partitionedTablesList.setTableName(_ctx.stringValue("DescribeWorkerDetectionResponse.DetectionItems["+ i +"].Results.PartitionedTables["+ j +"].TableName"));
				partitionedTablesList.setDDL(_ctx.stringValue("DescribeWorkerDetectionResponse.DetectionItems["+ i +"].Results.PartitionedTables["+ j +"].DDL"));
				partitionedTablesList.setPartitionCount(_ctx.stringValue("DescribeWorkerDetectionResponse.DetectionItems["+ i +"].Results.PartitionedTables["+ j +"].PartitionCount"));
				partitionedTablesList.setPartitionIds(_ctx.stringValue("DescribeWorkerDetectionResponse.DetectionItems["+ i +"].Results.PartitionedTables["+ j +"].PartitionIds"));
				partitionedTablesList.setTotalDataSize(_ctx.longValue("DescribeWorkerDetectionResponse.DetectionItems["+ i +"].Results.PartitionedTables["+ j +"].TotalDataSize"));

				partitionedTables.add(partitionedTablesList);
			}
			results.setPartitionedTables(partitionedTables);

			List<TopAccessTablesList> topAccessTables = new ArrayList<TopAccessTablesList>();
			for (int j = 0; j < _ctx.lengthValue("DescribeWorkerDetectionResponse.DetectionItems["+ i +"].Results.TopAccessTables.Length"); j++) {
				TopAccessTablesList topAccessTablesList = new TopAccessTablesList();
				topAccessTablesList.setMetricName(_ctx.stringValue("DescribeWorkerDetectionResponse.DetectionItems["+ i +"].Results.TopAccessTables["+ j +"].MetricName"));

				List<ResultList> searchResults = new ArrayList<ResultList>();
				for (int k = 0; k < _ctx.lengthValue("DescribeWorkerDetectionResponse.DetectionItems["+ i +"].Results.TopAccessTables["+ j +"].SearchResults.Length"); k++) {
					ResultList resultList = new ResultList();
					resultList.setTableName(_ctx.stringValue("DescribeWorkerDetectionResponse.DetectionItems["+ i +"].Results.TopAccessTables["+ j +"].SearchResults["+ k +"].TableName"));
					resultList.setMaxScanCost(_ctx.longValue("DescribeWorkerDetectionResponse.DetectionItems["+ i +"].Results.TopAccessTables["+ j +"].SearchResults["+ k +"].MaxScanCost"));
					resultList.setAvgScanCost(_ctx.doubleValue("DescribeWorkerDetectionResponse.DetectionItems["+ i +"].Results.TopAccessTables["+ j +"].SearchResults["+ k +"].AvgScanCost"));
					resultList.setMaxScanSize(_ctx.longValue("DescribeWorkerDetectionResponse.DetectionItems["+ i +"].Results.TopAccessTables["+ j +"].SearchResults["+ k +"].MaxScanSize"));
					resultList.setAvgScanSize(_ctx.doubleValue("DescribeWorkerDetectionResponse.DetectionItems["+ i +"].Results.TopAccessTables["+ j +"].SearchResults["+ k +"].AvgScanSize"));
					resultList.setAccessCount(_ctx.longValue("DescribeWorkerDetectionResponse.DetectionItems["+ i +"].Results.TopAccessTables["+ j +"].SearchResults["+ k +"].AccessCount"));

					searchResults.add(resultList);
				}
				topAccessTablesList.setSearchResults(searchResults);

				topAccessTables.add(topAccessTablesList);
			}
			results.setTopAccessTables(topAccessTables);

			List<BadOperatorDetails> operatorDetails = new ArrayList<BadOperatorDetails>();
			for (int j = 0; j < _ctx.lengthValue("DescribeWorkerDetectionResponse.DetectionItems["+ i +"].Results.OperatorDetails.Length"); j++) {
				BadOperatorDetails badOperatorDetails = new BadOperatorDetails();
				badOperatorDetails.setMetricName(_ctx.stringValue("DescribeWorkerDetectionResponse.DetectionItems["+ i +"].Results.OperatorDetails["+ j +"].MetricName"));

				List<ResultList2> searchResults1 = new ArrayList<ResultList2>();
				for (int k = 0; k < _ctx.lengthValue("DescribeWorkerDetectionResponse.DetectionItems["+ i +"].Results.OperatorDetails["+ j +"].SearchResults.Length"); k++) {
					ResultList2 resultList2 = new ResultList2();
					resultList2.setProcessId(_ctx.stringValue("DescribeWorkerDetectionResponse.DetectionItems["+ i +"].Results.OperatorDetails["+ j +"].SearchResults["+ k +"].ProcessId"));
					resultList2.setStageId(_ctx.stringValue("DescribeWorkerDetectionResponse.DetectionItems["+ i +"].Results.OperatorDetails["+ j +"].SearchResults["+ k +"].StageId"));
					resultList2.setOperatorName(_ctx.stringValue("DescribeWorkerDetectionResponse.DetectionItems["+ i +"].Results.OperatorDetails["+ j +"].SearchResults["+ k +"].OperatorName"));
					resultList2.setPeakMemory(_ctx.longValue("DescribeWorkerDetectionResponse.DetectionItems["+ i +"].Results.OperatorDetails["+ j +"].SearchResults["+ k +"].PeakMemory"));
					resultList2.setOperatorCost(_ctx.longValue("DescribeWorkerDetectionResponse.DetectionItems["+ i +"].Results.OperatorDetails["+ j +"].SearchResults["+ k +"].OperatorCost"));
					resultList2.setInputRows(_ctx.longValue("DescribeWorkerDetectionResponse.DetectionItems["+ i +"].Results.OperatorDetails["+ j +"].SearchResults["+ k +"].InputRows"));
					resultList2.setOutputRows(_ctx.longValue("DescribeWorkerDetectionResponse.DetectionItems["+ i +"].Results.OperatorDetails["+ j +"].SearchResults["+ k +"].OutputRows"));
					resultList2.setInputSize(_ctx.longValue("DescribeWorkerDetectionResponse.DetectionItems["+ i +"].Results.OperatorDetails["+ j +"].SearchResults["+ k +"].InputSize"));
					resultList2.setOutputSize(_ctx.longValue("DescribeWorkerDetectionResponse.DetectionItems["+ i +"].Results.OperatorDetails["+ j +"].SearchResults["+ k +"].OutputSize"));
					resultList2.setOperatorInfo(_ctx.stringValue("DescribeWorkerDetectionResponse.DetectionItems["+ i +"].Results.OperatorDetails["+ j +"].SearchResults["+ k +"].OperatorInfo"));

					searchResults1.add(resultList2);
				}
				badOperatorDetails.setSearchResults1(searchResults1);

				operatorDetails.add(badOperatorDetails);
			}
			results.setOperatorDetails(operatorDetails);

			List<BadOperatorAgg> operatorAgg = new ArrayList<BadOperatorAgg>();
			for (int j = 0; j < _ctx.lengthValue("DescribeWorkerDetectionResponse.DetectionItems["+ i +"].Results.OperatorAgg.Length"); j++) {
				BadOperatorAgg badOperatorAgg = new BadOperatorAgg();
				badOperatorAgg.setMetricName(_ctx.stringValue("DescribeWorkerDetectionResponse.DetectionItems["+ i +"].Results.OperatorAgg["+ j +"].MetricName"));

				List<ResultList4> searchResults3 = new ArrayList<ResultList4>();
				for (int k = 0; k < _ctx.lengthValue("DescribeWorkerDetectionResponse.DetectionItems["+ i +"].Results.OperatorAgg["+ j +"].SearchResults.Length"); k++) {
					ResultList4 resultList4 = new ResultList4();
					resultList4.setOperatorName(_ctx.stringValue("DescribeWorkerDetectionResponse.DetectionItems["+ i +"].Results.OperatorAgg["+ j +"].SearchResults["+ k +"].OperatorName"));
					resultList4.setMaxValue(_ctx.longValue("DescribeWorkerDetectionResponse.DetectionItems["+ i +"].Results.OperatorAgg["+ j +"].SearchResults["+ k +"].MaxValue"));
					resultList4.setTotalValue(_ctx.longValue("DescribeWorkerDetectionResponse.DetectionItems["+ i +"].Results.OperatorAgg["+ j +"].SearchResults["+ k +"].TotalValue"));
					resultList4.setAvgValue(_ctx.doubleValue("DescribeWorkerDetectionResponse.DetectionItems["+ i +"].Results.OperatorAgg["+ j +"].SearchResults["+ k +"].AvgValue"));
					resultList4.setOperatorCount(_ctx.longValue("DescribeWorkerDetectionResponse.DetectionItems["+ i +"].Results.OperatorAgg["+ j +"].SearchResults["+ k +"].OperatorCount"));

					searchResults3.add(resultList4);
				}
				badOperatorAgg.setSearchResults3(searchResults3);

				operatorAgg.add(badOperatorAgg);
			}
			results.setOperatorAgg(operatorAgg);
			baseDetectionItem.setResults(results);

			detectionItems.add(baseDetectionItem);
		}
		describeWorkerDetectionResponse.setDetectionItems(detectionItems);
	 
	 	return describeWorkerDetectionResponse;
	}
}