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

package com.aliyuncs.ecsops.transform.v20160401;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecsops.model.v20160401.OpsQueryMonitorSlsDataResponse;
import com.aliyuncs.ecsops.model.v20160401.OpsQueryMonitorSlsDataResponse.MonitorSlsData;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpsQueryMonitorSlsDataResponseUnmarshaller {

	public static OpsQueryMonitorSlsDataResponse unmarshall(OpsQueryMonitorSlsDataResponse opsQueryMonitorSlsDataResponse, UnmarshallerContext _ctx) {
		
		opsQueryMonitorSlsDataResponse.setRequestId(_ctx.stringValue("OpsQueryMonitorSlsDataResponse.RequestId"));

		List<MonitorSlsData> monitorSlsDataList = new ArrayList<MonitorSlsData>();
		for (int i = 0; i < _ctx.lengthValue("OpsQueryMonitorSlsDataResponse.MonitorSlsDataList.Length"); i++) {
			MonitorSlsData monitorSlsData = new MonitorSlsData();
			monitorSlsData.setRegion(_ctx.stringValue("OpsQueryMonitorSlsDataResponse.MonitorSlsDataList["+ i +"].Region"));
			monitorSlsData.setLogstore(_ctx.stringValue("OpsQueryMonitorSlsDataResponse.MonitorSlsDataList["+ i +"].Logstore"));
			monitorSlsData.setSource(_ctx.stringValue("OpsQueryMonitorSlsDataResponse.MonitorSlsDataList["+ i +"].Source"));
			monitorSlsData.setTimestamp(_ctx.longValue("OpsQueryMonitorSlsDataResponse.MonitorSlsDataList["+ i +"].Timestamp"));
			monitorSlsData.setSlsData(_ctx.stringValue("OpsQueryMonitorSlsDataResponse.MonitorSlsDataList["+ i +"].SlsData"));
			monitorSlsData.setProject(_ctx.stringValue("OpsQueryMonitorSlsDataResponse.MonitorSlsDataList["+ i +"].Project"));

			monitorSlsDataList.add(monitorSlsData);
		}
		opsQueryMonitorSlsDataResponse.setMonitorSlsDataList(monitorSlsDataList);
	 
	 	return opsQueryMonitorSlsDataResponse;
	}
}