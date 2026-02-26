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

package com.aliyuncs.ebs.transform.v20210730;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ebs.model.v20210730.DescribeDiskMonitorDataListResponse;
import com.aliyuncs.ebs.model.v20210730.DescribeDiskMonitorDataListResponse.DiskMonitorData;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDiskMonitorDataListResponseUnmarshaller {

	public static DescribeDiskMonitorDataListResponse unmarshall(DescribeDiskMonitorDataListResponse describeDiskMonitorDataListResponse, UnmarshallerContext _ctx) {
		
		describeDiskMonitorDataListResponse.setRequestId(_ctx.stringValue("DescribeDiskMonitorDataListResponse.RequestId"));
		describeDiskMonitorDataListResponse.setTotalCount(_ctx.longValue("DescribeDiskMonitorDataListResponse.TotalCount"));
		describeDiskMonitorDataListResponse.setNextToken(_ctx.stringValue("DescribeDiskMonitorDataListResponse.NextToken"));

		List<DiskMonitorData> monitorData = new ArrayList<DiskMonitorData>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDiskMonitorDataListResponse.MonitorData.Length"); i++) {
			DiskMonitorData diskMonitorData = new DiskMonitorData();
			diskMonitorData.setDiskId(_ctx.stringValue("DescribeDiskMonitorDataListResponse.MonitorData["+ i +"].DiskId"));
			diskMonitorData.setTimestamp(_ctx.stringValue("DescribeDiskMonitorDataListResponse.MonitorData["+ i +"].Timestamp"));
			diskMonitorData.setBurstIOCount(_ctx.longValue("DescribeDiskMonitorDataListResponse.MonitorData["+ i +"].BurstIOCount"));

			monitorData.add(diskMonitorData);
		}
		describeDiskMonitorDataListResponse.setMonitorData(monitorData);
	 
	 	return describeDiskMonitorDataListResponse;
	}
}