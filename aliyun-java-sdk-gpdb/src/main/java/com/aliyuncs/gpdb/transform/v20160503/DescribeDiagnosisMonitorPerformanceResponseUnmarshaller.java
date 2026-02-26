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

import com.aliyuncs.gpdb.model.v20160503.DescribeDiagnosisMonitorPerformanceResponse;
import com.aliyuncs.gpdb.model.v20160503.DescribeDiagnosisMonitorPerformanceResponse.Item;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDiagnosisMonitorPerformanceResponseUnmarshaller {

	public static DescribeDiagnosisMonitorPerformanceResponse unmarshall(DescribeDiagnosisMonitorPerformanceResponse describeDiagnosisMonitorPerformanceResponse, UnmarshallerContext _ctx) {
		
		describeDiagnosisMonitorPerformanceResponse.setRequestId(_ctx.stringValue("DescribeDiagnosisMonitorPerformanceResponse.RequestId"));
		describeDiagnosisMonitorPerformanceResponse.setPerformancesThreshold(_ctx.integerValue("DescribeDiagnosisMonitorPerformanceResponse.PerformancesThreshold"));
		describeDiagnosisMonitorPerformanceResponse.setPerformancesTruncated(_ctx.booleanValue("DescribeDiagnosisMonitorPerformanceResponse.PerformancesTruncated"));

		List<Item> performances = new ArrayList<Item>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDiagnosisMonitorPerformanceResponse.Performances.Length"); i++) {
			Item item = new Item();
			item.setQueryID(_ctx.stringValue("DescribeDiagnosisMonitorPerformanceResponse.Performances["+ i +"].QueryID"));
			item.setStartTime(_ctx.longValue("DescribeDiagnosisMonitorPerformanceResponse.Performances["+ i +"].StartTime"));
			item.setCost(_ctx.integerValue("DescribeDiagnosisMonitorPerformanceResponse.Performances["+ i +"].Cost"));
			item.setStatus(_ctx.stringValue("DescribeDiagnosisMonitorPerformanceResponse.Performances["+ i +"].Status"));
			item.setUser(_ctx.stringValue("DescribeDiagnosisMonitorPerformanceResponse.Performances["+ i +"].User"));
			item.setDatabase(_ctx.stringValue("DescribeDiagnosisMonitorPerformanceResponse.Performances["+ i +"].Database"));

			performances.add(item);
		}
		describeDiagnosisMonitorPerformanceResponse.setPerformances(performances);
	 
	 	return describeDiagnosisMonitorPerformanceResponse;
	}
}