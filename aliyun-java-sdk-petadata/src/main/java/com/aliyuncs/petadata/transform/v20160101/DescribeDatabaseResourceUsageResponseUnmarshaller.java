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

package com.aliyuncs.petadata.transform.v20160101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.petadata.model.v20160101.DescribeDatabaseResourceUsageResponse;
import com.aliyuncs.petadata.model.v20160101.DescribeDatabaseResourceUsageResponse.MonitorData;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDatabaseResourceUsageResponseUnmarshaller {

	public static DescribeDatabaseResourceUsageResponse unmarshall(DescribeDatabaseResourceUsageResponse describeDatabaseResourceUsageResponse, UnmarshallerContext context) {
		
		describeDatabaseResourceUsageResponse.setRequestId(context.stringValue("DescribeDatabaseResourceUsageResponse.RequestId"));

		List<MonitorData> monitorDatas = new ArrayList<MonitorData>();
		for (int i = 0; i < context.lengthValue("DescribeDatabaseResourceUsageResponse.MonitorDatas.Length"); i++) {
			MonitorData monitorData = new MonitorData();
			monitorData.setDate(context.stringValue("DescribeDatabaseResourceUsageResponse.MonitorDatas["+ i +"].Date"));
			monitorData.setBinlogSize(context.longValue("DescribeDatabaseResourceUsageResponse.MonitorDatas["+ i +"].BinlogSize"));
			monitorData.setDataSize(context.longValue("DescribeDatabaseResourceUsageResponse.MonitorDatas["+ i +"].DataSize"));
			monitorData.setOtherSize(context.longValue("DescribeDatabaseResourceUsageResponse.MonitorDatas["+ i +"].OtherSize"));
			monitorData.setTotalSize(context.longValue("DescribeDatabaseResourceUsageResponse.MonitorDatas["+ i +"].TotalSize"));

			monitorDatas.add(monitorData);
		}
		describeDatabaseResourceUsageResponse.setMonitorDatas(monitorDatas);
	 
	 	return describeDatabaseResourceUsageResponse;
	}
}