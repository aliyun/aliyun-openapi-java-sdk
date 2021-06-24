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

import com.aliyuncs.ecsops.model.v20160401.OpsQueryMonitorConfigsResponse;
import com.aliyuncs.ecsops.model.v20160401.OpsQueryMonitorConfigsResponse.MonitorConfig;
import com.aliyuncs.ecsops.model.v20160401.OpsQueryMonitorConfigsResponse.MonitorConfig.Exclusion;
import com.aliyuncs.ecsops.model.v20160401.OpsQueryMonitorConfigsResponse.MonitorConfig.Inclusion;
import com.aliyuncs.ecsops.model.v20160401.OpsQueryMonitorConfigsResponse.MonitorConfig.MonitorResultKey;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpsQueryMonitorConfigsResponseUnmarshaller {

	public static OpsQueryMonitorConfigsResponse unmarshall(OpsQueryMonitorConfigsResponse opsQueryMonitorConfigsResponse, UnmarshallerContext _ctx) {
		
		opsQueryMonitorConfigsResponse.setRequestId(_ctx.stringValue("OpsQueryMonitorConfigsResponse.RequestId"));

		List<MonitorConfig> monitorConfigList = new ArrayList<MonitorConfig>();
		for (int i = 0; i < _ctx.lengthValue("OpsQueryMonitorConfigsResponse.MonitorConfigList.Length"); i++) {
			MonitorConfig monitorConfig = new MonitorConfig();
			monitorConfig.setTimeout(_ctx.integerValue("OpsQueryMonitorConfigsResponse.MonitorConfigList["+ i +"].Timeout"));
			monitorConfig.setMonitorCodeFile(_ctx.stringValue("OpsQueryMonitorConfigsResponse.MonitorConfigList["+ i +"].MonitorCodeFile"));
			monitorConfig.setTrigger(_ctx.stringValue("OpsQueryMonitorConfigsResponse.MonitorConfigList["+ i +"].Trigger"));
			monitorConfig.setOwner(_ctx.stringValue("OpsQueryMonitorConfigsResponse.MonitorConfigList["+ i +"].Owner"));
			monitorConfig.setMonitorItem(_ctx.stringValue("OpsQueryMonitorConfigsResponse.MonitorConfigList["+ i +"].MonitorItem"));
			monitorConfig.setExecutor(_ctx.stringValue("OpsQueryMonitorConfigsResponse.MonitorConfigList["+ i +"].Executor"));
			monitorConfig.setDescription(_ctx.stringValue("OpsQueryMonitorConfigsResponse.MonitorConfigList["+ i +"].Description"));
			monitorConfig.setTotalSeconds(_ctx.integerValue("OpsQueryMonitorConfigsResponse.MonitorConfigList["+ i +"].TotalSeconds"));
			monitorConfig.setCategory(_ctx.stringValue("OpsQueryMonitorConfigsResponse.MonitorConfigList["+ i +"].Category"));
			monitorConfig.setEnable(_ctx.booleanValue("OpsQueryMonitorConfigsResponse.MonitorConfigList["+ i +"].Enable"));

			List<String> monitorResultFiles = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("OpsQueryMonitorConfigsResponse.MonitorConfigList["+ i +"].MonitorResultFiles.Length"); j++) {
				monitorResultFiles.add(_ctx.stringValue("OpsQueryMonitorConfigsResponse.MonitorConfigList["+ i +"].MonitorResultFiles["+ j +"]"));
			}
			monitorConfig.setMonitorResultFiles(monitorResultFiles);

			Inclusion inclusion = new Inclusion();
			inclusion.setExt(_ctx.stringValue("OpsQueryMonitorConfigsResponse.MonitorConfigList["+ i +"].Inclusion.Ext"));

			List<String> nc = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("OpsQueryMonitorConfigsResponse.MonitorConfigList["+ i +"].Inclusion.Nc.Length"); j++) {
				nc.add(_ctx.stringValue("OpsQueryMonitorConfigsResponse.MonitorConfigList["+ i +"].Inclusion.Nc["+ j +"]"));
			}
			inclusion.setNc(nc);

			List<String> cluster = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("OpsQueryMonitorConfigsResponse.MonitorConfigList["+ i +"].Inclusion.Cluster.Length"); j++) {
				cluster.add(_ctx.stringValue("OpsQueryMonitorConfigsResponse.MonitorConfigList["+ i +"].Inclusion.Cluster["+ j +"]"));
			}
			inclusion.setCluster(cluster);
			monitorConfig.setInclusion(inclusion);

			Exclusion exclusion = new Exclusion();
			exclusion.setExt(_ctx.stringValue("OpsQueryMonitorConfigsResponse.MonitorConfigList["+ i +"].Exclusion.Ext"));

			List<String> nc1 = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("OpsQueryMonitorConfigsResponse.MonitorConfigList["+ i +"].Exclusion.Nc.Length"); j++) {
				nc1.add(_ctx.stringValue("OpsQueryMonitorConfigsResponse.MonitorConfigList["+ i +"].Exclusion.Nc["+ j +"]"));
			}
			exclusion.setNc1(nc1);

			List<String> cluster2 = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("OpsQueryMonitorConfigsResponse.MonitorConfigList["+ i +"].Exclusion.Cluster.Length"); j++) {
				cluster2.add(_ctx.stringValue("OpsQueryMonitorConfigsResponse.MonitorConfigList["+ i +"].Exclusion.Cluster["+ j +"]"));
			}
			exclusion.setCluster2(cluster2);
			monitorConfig.setExclusion(exclusion);

			List<MonitorResultKey> monitorResultKeys = new ArrayList<MonitorResultKey>();
			for (int j = 0; j < _ctx.lengthValue("OpsQueryMonitorConfigsResponse.MonitorConfigList["+ i +"].MonitorResultKeys.Length"); j++) {
				MonitorResultKey monitorResultKey = new MonitorResultKey();
				monitorResultKey.setResultFile(_ctx.stringValue("OpsQueryMonitorConfigsResponse.MonitorConfigList["+ i +"].MonitorResultKeys["+ j +"].ResultFile"));

				List<String> resultKeys = new ArrayList<String>();
				for (int k = 0; k < _ctx.lengthValue("OpsQueryMonitorConfigsResponse.MonitorConfigList["+ i +"].MonitorResultKeys["+ j +"].ResultKeys.Length"); k++) {
					resultKeys.add(_ctx.stringValue("OpsQueryMonitorConfigsResponse.MonitorConfigList["+ i +"].MonitorResultKeys["+ j +"].ResultKeys["+ k +"]"));
				}
				monitorResultKey.setResultKeys(resultKeys);

				monitorResultKeys.add(monitorResultKey);
			}
			monitorConfig.setMonitorResultKeys(monitorResultKeys);

			monitorConfigList.add(monitorConfig);
		}
		opsQueryMonitorConfigsResponse.setMonitorConfigList(monitorConfigList);
	 
	 	return opsQueryMonitorConfigsResponse;
	}
}