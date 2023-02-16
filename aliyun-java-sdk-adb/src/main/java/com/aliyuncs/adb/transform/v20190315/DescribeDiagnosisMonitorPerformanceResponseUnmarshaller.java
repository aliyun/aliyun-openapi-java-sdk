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

import com.aliyuncs.adb.model.v20190315.DescribeDiagnosisMonitorPerformanceResponse;
import com.aliyuncs.adb.model.v20190315.DescribeDiagnosisMonitorPerformanceResponse.Items;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDiagnosisMonitorPerformanceResponseUnmarshaller {

	public static DescribeDiagnosisMonitorPerformanceResponse unmarshall(DescribeDiagnosisMonitorPerformanceResponse describeDiagnosisMonitorPerformanceResponse, UnmarshallerContext _ctx) {
		
		describeDiagnosisMonitorPerformanceResponse.setRequestId(_ctx.stringValue("DescribeDiagnosisMonitorPerformanceResponse.RequestId"));
		describeDiagnosisMonitorPerformanceResponse.setPerformancesThreshold(_ctx.integerValue("DescribeDiagnosisMonitorPerformanceResponse.PerformancesThreshold"));
		describeDiagnosisMonitorPerformanceResponse.setPerformancesTruncated(_ctx.booleanValue("DescribeDiagnosisMonitorPerformanceResponse.PerformancesTruncated"));

		List<Items> performances = new ArrayList<Items>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDiagnosisMonitorPerformanceResponse.Performances.Length"); i++) {
			Items items = new Items();
			items.setStatus(_ctx.stringValue("DescribeDiagnosisMonitorPerformanceResponse.Performances["+ i +"].Status"));
			items.setProcessId(_ctx.stringValue("DescribeDiagnosisMonitorPerformanceResponse.Performances["+ i +"].ProcessId"));
			items.setStartTime(_ctx.longValue("DescribeDiagnosisMonitorPerformanceResponse.Performances["+ i +"].StartTime"));
			items.setCost(_ctx.longValue("DescribeDiagnosisMonitorPerformanceResponse.Performances["+ i +"].Cost"));
			items.setScanRows(_ctx.longValue("DescribeDiagnosisMonitorPerformanceResponse.Performances["+ i +"].ScanRows"));
			items.setPeakMemory(_ctx.longValue("DescribeDiagnosisMonitorPerformanceResponse.Performances["+ i +"].PeakMemory"));
			items.setRcHost(_ctx.stringValue("DescribeDiagnosisMonitorPerformanceResponse.Performances["+ i +"].RcHost"));
			items.setScanSize(_ctx.longValue("DescribeDiagnosisMonitorPerformanceResponse.Performances["+ i +"].ScanSize"));
			items.setUserName(_ctx.stringValue("DescribeDiagnosisMonitorPerformanceResponse.Performances["+ i +"].UserName"));

			performances.add(items);
		}
		describeDiagnosisMonitorPerformanceResponse.setPerformances(performances);
	 
	 	return describeDiagnosisMonitorPerformanceResponse;
	}
}