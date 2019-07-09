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

package com.aliyuncs.ecs.transform.v20140526;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecs.model.v20140526.DescribeDiskMonitorDataResponse;
import com.aliyuncs.ecs.model.v20140526.DescribeDiskMonitorDataResponse.DiskMonitorData;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDiskMonitorDataResponseUnmarshaller {

	public static DescribeDiskMonitorDataResponse unmarshall(DescribeDiskMonitorDataResponse describeDiskMonitorDataResponse, UnmarshallerContext _ctx) {
		
		describeDiskMonitorDataResponse.setRequestId(_ctx.stringValue("DescribeDiskMonitorDataResponse.RequestId"));
		describeDiskMonitorDataResponse.setTotalCount(_ctx.integerValue("DescribeDiskMonitorDataResponse.TotalCount"));

		List<DiskMonitorData> monitorData = new ArrayList<DiskMonitorData>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDiskMonitorDataResponse.MonitorData.Length"); i++) {
			DiskMonitorData diskMonitorData = new DiskMonitorData();
			diskMonitorData.setDiskId(_ctx.stringValue("DescribeDiskMonitorDataResponse.MonitorData["+ i +"].DiskId"));
			diskMonitorData.setIOPSRead(_ctx.integerValue("DescribeDiskMonitorDataResponse.MonitorData["+ i +"].IOPSRead"));
			diskMonitorData.setIOPSWrite(_ctx.integerValue("DescribeDiskMonitorDataResponse.MonitorData["+ i +"].IOPSWrite"));
			diskMonitorData.setIOPSTotal(_ctx.integerValue("DescribeDiskMonitorDataResponse.MonitorData["+ i +"].IOPSTotal"));
			diskMonitorData.setBPSRead(_ctx.integerValue("DescribeDiskMonitorDataResponse.MonitorData["+ i +"].BPSRead"));
			diskMonitorData.setBPSWrite(_ctx.integerValue("DescribeDiskMonitorDataResponse.MonitorData["+ i +"].BPSWrite"));
			diskMonitorData.setBPSTotal(_ctx.integerValue("DescribeDiskMonitorDataResponse.MonitorData["+ i +"].BPSTotal"));
			diskMonitorData.setLatencyRead(_ctx.integerValue("DescribeDiskMonitorDataResponse.MonitorData["+ i +"].LatencyRead"));
			diskMonitorData.setLatencyWrite(_ctx.integerValue("DescribeDiskMonitorDataResponse.MonitorData["+ i +"].LatencyWrite"));
			diskMonitorData.setTimeStamp(_ctx.stringValue("DescribeDiskMonitorDataResponse.MonitorData["+ i +"].TimeStamp"));

			monitorData.add(diskMonitorData);
		}
		describeDiskMonitorDataResponse.setMonitorData(monitorData);
	 
	 	return describeDiskMonitorDataResponse;
	}
}