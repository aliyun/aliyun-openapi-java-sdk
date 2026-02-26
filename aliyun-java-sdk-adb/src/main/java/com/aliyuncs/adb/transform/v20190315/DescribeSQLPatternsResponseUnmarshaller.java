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

import com.aliyuncs.adb.model.v20190315.DescribeSQLPatternsResponse;
import com.aliyuncs.adb.model.v20190315.DescribeSQLPatternsResponse.PatternDetailsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeSQLPatternsResponseUnmarshaller {

	public static DescribeSQLPatternsResponse unmarshall(DescribeSQLPatternsResponse describeSQLPatternsResponse, UnmarshallerContext _ctx) {
		
		describeSQLPatternsResponse.setRequestId(_ctx.stringValue("DescribeSQLPatternsResponse.RequestId"));
		describeSQLPatternsResponse.setPageNumber(_ctx.integerValue("DescribeSQLPatternsResponse.PageNumber"));
		describeSQLPatternsResponse.setPageSize(_ctx.integerValue("DescribeSQLPatternsResponse.PageSize"));
		describeSQLPatternsResponse.setTotalCount(_ctx.integerValue("DescribeSQLPatternsResponse.TotalCount"));

		List<PatternDetailsItem> patternDetails = new ArrayList<PatternDetailsItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeSQLPatternsResponse.PatternDetails.Length"); i++) {
			PatternDetailsItem patternDetailsItem = new PatternDetailsItem();
			patternDetailsItem.setSQLPattern(_ctx.stringValue("DescribeSQLPatternsResponse.PatternDetails["+ i +"].SQLPattern"));
			patternDetailsItem.setPatternId(_ctx.stringValue("DescribeSQLPatternsResponse.PatternDetails["+ i +"].PatternId"));
			patternDetailsItem.setUser(_ctx.stringValue("DescribeSQLPatternsResponse.PatternDetails["+ i +"].User"));
			patternDetailsItem.setAccessIp(_ctx.stringValue("DescribeSQLPatternsResponse.PatternDetails["+ i +"].AccessIp"));
			patternDetailsItem.setTables(_ctx.stringValue("DescribeSQLPatternsResponse.PatternDetails["+ i +"].Tables"));
			patternDetailsItem.setPatternCreationTime(_ctx.stringValue("DescribeSQLPatternsResponse.PatternDetails["+ i +"].PatternCreationTime"));
			patternDetailsItem.setAverageQueryTime(_ctx.doubleValue("DescribeSQLPatternsResponse.PatternDetails["+ i +"].AverageQueryTime"));
			patternDetailsItem.setMaxQueryTime(_ctx.longValue("DescribeSQLPatternsResponse.PatternDetails["+ i +"].MaxQueryTime"));
			patternDetailsItem.setAverageExecutionTime(_ctx.doubleValue("DescribeSQLPatternsResponse.PatternDetails["+ i +"].AverageExecutionTime"));
			patternDetailsItem.setMaxExecutionTime(_ctx.longValue("DescribeSQLPatternsResponse.PatternDetails["+ i +"].MaxExecutionTime"));
			patternDetailsItem.setAveragePeakMemory(_ctx.doubleValue("DescribeSQLPatternsResponse.PatternDetails["+ i +"].AveragePeakMemory"));
			patternDetailsItem.setMaxPeakMemory(_ctx.longValue("DescribeSQLPatternsResponse.PatternDetails["+ i +"].MaxPeakMemory"));
			patternDetailsItem.setAverageScanSize(_ctx.doubleValue("DescribeSQLPatternsResponse.PatternDetails["+ i +"].AverageScanSize"));
			patternDetailsItem.setMaxScanSize(_ctx.longValue("DescribeSQLPatternsResponse.PatternDetails["+ i +"].MaxScanSize"));
			patternDetailsItem.setQueryCount(_ctx.longValue("DescribeSQLPatternsResponse.PatternDetails["+ i +"].QueryCount"));
			patternDetailsItem.setFailedCount(_ctx.longValue("DescribeSQLPatternsResponse.PatternDetails["+ i +"].FailedCount"));
			patternDetailsItem.setBlockable(_ctx.booleanValue("DescribeSQLPatternsResponse.PatternDetails["+ i +"].Blockable"));
			patternDetailsItem.setQueryTimeSum(_ctx.doubleValue("DescribeSQLPatternsResponse.PatternDetails["+ i +"].QueryTimeSum"));
			patternDetailsItem.setQueryTimePercentage(_ctx.doubleValue("DescribeSQLPatternsResponse.PatternDetails["+ i +"].QueryTimePercentage"));
			patternDetailsItem.setPeakMemorySum(_ctx.doubleValue("DescribeSQLPatternsResponse.PatternDetails["+ i +"].PeakMemorySum"));
			patternDetailsItem.setPeakMemoryPercentage(_ctx.doubleValue("DescribeSQLPatternsResponse.PatternDetails["+ i +"].PeakMemoryPercentage"));
			patternDetailsItem.setScanSizeSum(_ctx.doubleValue("DescribeSQLPatternsResponse.PatternDetails["+ i +"].ScanSizeSum"));
			patternDetailsItem.setScanSizePercentage(_ctx.doubleValue("DescribeSQLPatternsResponse.PatternDetails["+ i +"].ScanSizePercentage"));
			patternDetailsItem.setAverageOperatorCost(_ctx.doubleValue("DescribeSQLPatternsResponse.PatternDetails["+ i +"].AverageOperatorCost"));
			patternDetailsItem.setMaxOperatorCost(_ctx.doubleValue("DescribeSQLPatternsResponse.PatternDetails["+ i +"].MaxOperatorCost"));
			patternDetailsItem.setOperatorCostSum(_ctx.doubleValue("DescribeSQLPatternsResponse.PatternDetails["+ i +"].OperatorCostSum"));
			patternDetailsItem.setOperatorCostPercentage(_ctx.doubleValue("DescribeSQLPatternsResponse.PatternDetails["+ i +"].OperatorCostPercentage"));
			patternDetailsItem.setAverageScanCost(_ctx.doubleValue("DescribeSQLPatternsResponse.PatternDetails["+ i +"].AverageScanCost"));
			patternDetailsItem.setMaxScanCost(_ctx.doubleValue("DescribeSQLPatternsResponse.PatternDetails["+ i +"].MaxScanCost"));
			patternDetailsItem.setScanCostSum(_ctx.doubleValue("DescribeSQLPatternsResponse.PatternDetails["+ i +"].ScanCostSum"));
			patternDetailsItem.setScanCostPercentage(_ctx.doubleValue("DescribeSQLPatternsResponse.PatternDetails["+ i +"].ScanCostPercentage"));

			patternDetails.add(patternDetailsItem);
		}
		describeSQLPatternsResponse.setPatternDetails(patternDetails);
	 
	 	return describeSQLPatternsResponse;
	}
}