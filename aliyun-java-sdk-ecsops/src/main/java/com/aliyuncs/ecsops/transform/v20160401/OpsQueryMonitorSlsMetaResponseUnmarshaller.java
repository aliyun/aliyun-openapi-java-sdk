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

import com.aliyuncs.ecsops.model.v20160401.OpsQueryMonitorSlsMetaResponse;
import com.aliyuncs.ecsops.model.v20160401.OpsQueryMonitorSlsMetaResponse.MonitorSlsMeta;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpsQueryMonitorSlsMetaResponseUnmarshaller {

	public static OpsQueryMonitorSlsMetaResponse unmarshall(OpsQueryMonitorSlsMetaResponse opsQueryMonitorSlsMetaResponse, UnmarshallerContext _ctx) {
		
		opsQueryMonitorSlsMetaResponse.setRequestId(_ctx.stringValue("OpsQueryMonitorSlsMetaResponse.RequestId"));

		List<MonitorSlsMeta> monitorSlsMetaList = new ArrayList<MonitorSlsMeta>();
		for (int i = 0; i < _ctx.lengthValue("OpsQueryMonitorSlsMetaResponse.MonitorSlsMetaList.Length"); i++) {
			MonitorSlsMeta monitorSlsMeta = new MonitorSlsMeta();
			monitorSlsMeta.setShipperTable(_ctx.stringValue("OpsQueryMonitorSlsMetaResponse.MonitorSlsMetaList["+ i +"].ShipperTable"));
			monitorSlsMeta.setPackageName(_ctx.stringValue("OpsQueryMonitorSlsMetaResponse.MonitorSlsMetaList["+ i +"].PackageName"));
			monitorSlsMeta.setShipperName(_ctx.stringValue("OpsQueryMonitorSlsMetaResponse.MonitorSlsMetaList["+ i +"].ShipperName"));
			monitorSlsMeta.setRegionNo(_ctx.stringValue("OpsQueryMonitorSlsMetaResponse.MonitorSlsMetaList["+ i +"].RegionNo"));
			monitorSlsMeta.setProjectName(_ctx.stringValue("OpsQueryMonitorSlsMetaResponse.MonitorSlsMetaList["+ i +"].ProjectName"));
			monitorSlsMeta.setFileName(_ctx.stringValue("OpsQueryMonitorSlsMetaResponse.MonitorSlsMetaList["+ i +"].FileName"));
			monitorSlsMeta.setLogtailName(_ctx.stringValue("OpsQueryMonitorSlsMetaResponse.MonitorSlsMetaList["+ i +"].LogtailName"));
			monitorSlsMeta.setIsCenter(_ctx.stringValue("OpsQueryMonitorSlsMetaResponse.MonitorSlsMetaList["+ i +"].IsCenter"));
			monitorSlsMeta.setEndpoint(_ctx.stringValue("OpsQueryMonitorSlsMetaResponse.MonitorSlsMetaList["+ i +"].Endpoint"));
			monitorSlsMeta.setPackageId(_ctx.stringValue("OpsQueryMonitorSlsMetaResponse.MonitorSlsMetaList["+ i +"].PackageId"));
			monitorSlsMeta.setLogstoreName(_ctx.stringValue("OpsQueryMonitorSlsMetaResponse.MonitorSlsMetaList["+ i +"].LogstoreName"));
			monitorSlsMeta.setAccountName(_ctx.stringValue("OpsQueryMonitorSlsMetaResponse.MonitorSlsMetaList["+ i +"].AccountName"));

			monitorSlsMetaList.add(monitorSlsMeta);
		}
		opsQueryMonitorSlsMetaResponse.setMonitorSlsMetaList(monitorSlsMetaList);
	 
	 	return opsQueryMonitorSlsMetaResponse;
	}
}