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

import com.aliyuncs.adb.model.v20190315.DescribeDiagnosisRecordsResponse;
import com.aliyuncs.adb.model.v20190315.DescribeDiagnosisRecordsResponse.Items;
import com.aliyuncs.adb.model.v20190315.DescribeDiagnosisRecordsResponse.Items.QueryPropertiesItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDiagnosisRecordsResponseUnmarshaller {

	public static DescribeDiagnosisRecordsResponse unmarshall(DescribeDiagnosisRecordsResponse describeDiagnosisRecordsResponse, UnmarshallerContext _ctx) {
		
		describeDiagnosisRecordsResponse.setRequestId(_ctx.stringValue("DescribeDiagnosisRecordsResponse.RequestId"));
		describeDiagnosisRecordsResponse.setPageNumber(_ctx.integerValue("DescribeDiagnosisRecordsResponse.PageNumber"));
		describeDiagnosisRecordsResponse.setPageSize(_ctx.integerValue("DescribeDiagnosisRecordsResponse.PageSize"));
		describeDiagnosisRecordsResponse.setTotalCount(_ctx.integerValue("DescribeDiagnosisRecordsResponse.TotalCount"));

		List<Items> querys = new ArrayList<Items>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDiagnosisRecordsResponse.Querys.Length"); i++) {
			Items items = new Items();
			items.setSQL(_ctx.stringValue("DescribeDiagnosisRecordsResponse.Querys["+ i +"].SQL"));
			items.setSQLTruncatedThreshold(_ctx.longValue("DescribeDiagnosisRecordsResponse.Querys["+ i +"].SQLTruncatedThreshold"));
			items.setStatus(_ctx.stringValue("DescribeDiagnosisRecordsResponse.Querys["+ i +"].Status"));
			items.setOutputDataSize(_ctx.longValue("DescribeDiagnosisRecordsResponse.Querys["+ i +"].OutputDataSize"));
			items.setCost(_ctx.longValue("DescribeDiagnosisRecordsResponse.Querys["+ i +"].Cost"));
			items.setOutputRows(_ctx.longValue("DescribeDiagnosisRecordsResponse.Querys["+ i +"].OutputRows"));
			items.setRcHost(_ctx.stringValue("DescribeDiagnosisRecordsResponse.Querys["+ i +"].RcHost"));
			items.setScanSize(_ctx.longValue("DescribeDiagnosisRecordsResponse.Querys["+ i +"].ScanSize"));
			items.setProcessId(_ctx.stringValue("DescribeDiagnosisRecordsResponse.Querys["+ i +"].ProcessId"));
			items.setStartTime(_ctx.longValue("DescribeDiagnosisRecordsResponse.Querys["+ i +"].StartTime"));
			items.setSQLTruncated(_ctx.booleanValue("DescribeDiagnosisRecordsResponse.Querys["+ i +"].SQLTruncated"));
			items.setDatabase(_ctx.stringValue("DescribeDiagnosisRecordsResponse.Querys["+ i +"].Database"));
			items.setScanRows(_ctx.longValue("DescribeDiagnosisRecordsResponse.Querys["+ i +"].ScanRows"));
			items.setResourceCostRank(_ctx.integerValue("DescribeDiagnosisRecordsResponse.Querys["+ i +"].ResourceCostRank"));
			items.setClientIp(_ctx.stringValue("DescribeDiagnosisRecordsResponse.Querys["+ i +"].ClientIp"));
			items.setPeakMemory(_ctx.longValue("DescribeDiagnosisRecordsResponse.Querys["+ i +"].PeakMemory"));
			items.setQueueTime(_ctx.longValue("DescribeDiagnosisRecordsResponse.Querys["+ i +"].QueueTime"));
			items.setResourceGroup(_ctx.stringValue("DescribeDiagnosisRecordsResponse.Querys["+ i +"].ResourceGroup"));
			items.setUserName(_ctx.stringValue("DescribeDiagnosisRecordsResponse.Querys["+ i +"].UserName"));
			items.setExecutionTime(_ctx.longValue("DescribeDiagnosisRecordsResponse.Querys["+ i +"].ExecutionTime"));
			items.setTotalPlanningTime(_ctx.longValue("DescribeDiagnosisRecordsResponse.Querys["+ i +"].TotalPlanningTime"));
			items.setEtlWriteRows(_ctx.longValue("DescribeDiagnosisRecordsResponse.Querys["+ i +"].EtlWriteRows"));
			items.setTotalStages(_ctx.integerValue("DescribeDiagnosisRecordsResponse.Querys["+ i +"].TotalStages"));
			items.setPatternId(_ctx.stringValue("DescribeDiagnosisRecordsResponse.Querys["+ i +"].PatternId"));

			List<QueryPropertiesItem> queryProperties = new ArrayList<QueryPropertiesItem>();
			for (int j = 0; j < _ctx.lengthValue("DescribeDiagnosisRecordsResponse.Querys["+ i +"].QueryProperties.Length"); j++) {
				QueryPropertiesItem queryPropertiesItem = new QueryPropertiesItem();
				queryPropertiesItem.setName(_ctx.stringValue("DescribeDiagnosisRecordsResponse.Querys["+ i +"].QueryProperties["+ j +"].Name"));
				queryPropertiesItem.setValue(_ctx.stringValue("DescribeDiagnosisRecordsResponse.Querys["+ i +"].QueryProperties["+ j +"].Value"));

				queryProperties.add(queryPropertiesItem);
			}
			items.setQueryProperties(queryProperties);

			querys.add(items);
		}
		describeDiagnosisRecordsResponse.setQuerys(querys);
	 
	 	return describeDiagnosisRecordsResponse;
	}
}