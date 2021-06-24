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

import com.aliyuncs.ecsops.model.v20160401.OpsQueryMonitorStoragesResponse;
import com.aliyuncs.ecsops.model.v20160401.OpsQueryMonitorStoragesResponse.MonitorStorage;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpsQueryMonitorStoragesResponseUnmarshaller {

	public static OpsQueryMonitorStoragesResponse unmarshall(OpsQueryMonitorStoragesResponse opsQueryMonitorStoragesResponse, UnmarshallerContext _ctx) {
		
		opsQueryMonitorStoragesResponse.setRequestId(_ctx.stringValue("OpsQueryMonitorStoragesResponse.RequestId"));

		List<MonitorStorage> monitorStorageList = new ArrayList<MonitorStorage>();
		for (int i = 0; i < _ctx.lengthValue("OpsQueryMonitorStoragesResponse.MonitorStorageList.Length"); i++) {
			MonitorStorage monitorStorage = new MonitorStorage();
			monitorStorage.setShipperTable(_ctx.stringValue("OpsQueryMonitorStoragesResponse.MonitorStorageList["+ i +"].ShipperTable"));
			monitorStorage.setPackageName(_ctx.stringValue("OpsQueryMonitorStoragesResponse.MonitorStorageList["+ i +"].PackageName"));
			monitorStorage.setShipperName(_ctx.stringValue("OpsQueryMonitorStoragesResponse.MonitorStorageList["+ i +"].ShipperName"));
			monitorStorage.setRegionNo(_ctx.stringValue("OpsQueryMonitorStoragesResponse.MonitorStorageList["+ i +"].RegionNo"));
			monitorStorage.setProjectName(_ctx.stringValue("OpsQueryMonitorStoragesResponse.MonitorStorageList["+ i +"].ProjectName"));
			monitorStorage.setFileName(_ctx.stringValue("OpsQueryMonitorStoragesResponse.MonitorStorageList["+ i +"].FileName"));
			monitorStorage.setLogtailName(_ctx.stringValue("OpsQueryMonitorStoragesResponse.MonitorStorageList["+ i +"].LogtailName"));
			monitorStorage.setIsCenter(_ctx.stringValue("OpsQueryMonitorStoragesResponse.MonitorStorageList["+ i +"].IsCenter"));
			monitorStorage.setEndpoint(_ctx.stringValue("OpsQueryMonitorStoragesResponse.MonitorStorageList["+ i +"].Endpoint"));
			monitorStorage.setPackageId(_ctx.stringValue("OpsQueryMonitorStoragesResponse.MonitorStorageList["+ i +"].PackageId"));
			monitorStorage.setLogstoreName(_ctx.stringValue("OpsQueryMonitorStoragesResponse.MonitorStorageList["+ i +"].LogstoreName"));
			monitorStorage.setAccountName(_ctx.stringValue("OpsQueryMonitorStoragesResponse.MonitorStorageList["+ i +"].AccountName"));

			monitorStorageList.add(monitorStorage);
		}
		opsQueryMonitorStoragesResponse.setMonitorStorageList(monitorStorageList);
	 
	 	return opsQueryMonitorStoragesResponse;
	}
}