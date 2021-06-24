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

import com.aliyuncs.ecsops.model.v20160401.OpsGetMonitorConfigResponse;
import com.aliyuncs.ecsops.model.v20160401.OpsGetMonitorConfigResponse.MonitorConfig;
import com.aliyuncs.ecsops.model.v20160401.OpsGetMonitorConfigResponse.MonitorConfig.EventCenter;
import com.aliyuncs.ecsops.model.v20160401.OpsGetMonitorConfigResponse.MonitorConfig.Exclusion;
import com.aliyuncs.ecsops.model.v20160401.OpsGetMonitorConfigResponse.MonitorConfig.Level;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpsGetMonitorConfigResponseUnmarshaller {

	public static OpsGetMonitorConfigResponse unmarshall(OpsGetMonitorConfigResponse opsGetMonitorConfigResponse, UnmarshallerContext _ctx) {
		
		opsGetMonitorConfigResponse.setRequestId(_ctx.stringValue("OpsGetMonitorConfigResponse.RequestId"));

		List<MonitorConfig> monitorConfigs = new ArrayList<MonitorConfig>();
		for (int i = 0; i < _ctx.lengthValue("OpsGetMonitorConfigResponse.MonitorConfigs.Length"); i++) {
			MonitorConfig monitorConfig = new MonitorConfig();
			monitorConfig.setType(_ctx.stringValue("OpsGetMonitorConfigResponse.MonitorConfigs["+ i +"].Type"));
			monitorConfig.setDoc(_ctx.stringValue("OpsGetMonitorConfigResponse.MonitorConfigs["+ i +"].Doc"));
			monitorConfig.setAnalyse(_ctx.stringValue("OpsGetMonitorConfigResponse.MonitorConfigs["+ i +"].Analyse"));
			monitorConfig.setOpsTimeout(_ctx.integerValue("OpsGetMonitorConfigResponse.MonitorConfigs["+ i +"].OpsTimeout"));
			monitorConfig.setRetentionTime(_ctx.integerValue("OpsGetMonitorConfigResponse.MonitorConfigs["+ i +"].RetentionTime"));
			monitorConfig.setTimeRange(_ctx.integerValue("OpsGetMonitorConfigResponse.MonitorConfigs["+ i +"].TimeRange"));
			monitorConfig.setLogstore(_ctx.stringValue("OpsGetMonitorConfigResponse.MonitorConfigs["+ i +"].Logstore"));
			monitorConfig.setName(_ctx.stringValue("OpsGetMonitorConfigResponse.MonitorConfigs["+ i +"].Name"));
			monitorConfig.setSlsConfigName(_ctx.stringValue("OpsGetMonitorConfigResponse.MonitorConfigs["+ i +"].SlsConfigName"));
			monitorConfig.setMonitorType(_ctx.stringValue("OpsGetMonitorConfigResponse.MonitorConfigs["+ i +"].MonitorType"));
			monitorConfig.setSilent(_ctx.integerValue("OpsGetMonitorConfigResponse.MonitorConfigs["+ i +"].Silent"));
			monitorConfig.setDetailMetric(_ctx.stringValue("OpsGetMonitorConfigResponse.MonitorConfigs["+ i +"].DetailMetric"));
			monitorConfig.setQuery(_ctx.stringValue("OpsGetMonitorConfigResponse.MonitorConfigs["+ i +"].Query"));
			monitorConfig.setInterval(_ctx.integerValue("OpsGetMonitorConfigResponse.MonitorConfigs["+ i +"].Interval"));
			monitorConfig.setEnable(_ctx.booleanValue("OpsGetMonitorConfigResponse.MonitorConfigs["+ i +"].Enable"));

			List<String> linkedDimensions = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("OpsGetMonitorConfigResponse.MonitorConfigs["+ i +"].LinkedDimensions.Length"); j++) {
				linkedDimensions.add(_ctx.stringValue("OpsGetMonitorConfigResponse.MonitorConfigs["+ i +"].LinkedDimensions["+ j +"]"));
			}
			monitorConfig.setLinkedDimensions(linkedDimensions);

			List<String> notifyTokens = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("OpsGetMonitorConfigResponse.MonitorConfigs["+ i +"].NotifyTokens.Length"); j++) {
				notifyTokens.add(_ctx.stringValue("OpsGetMonitorConfigResponse.MonitorConfigs["+ i +"].NotifyTokens["+ j +"]"));
			}
			monitorConfig.setNotifyTokens(notifyTokens);

			List<String> linkedQuerys = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("OpsGetMonitorConfigResponse.MonitorConfigs["+ i +"].LinkedQuerys.Length"); j++) {
				linkedQuerys.add(_ctx.stringValue("OpsGetMonitorConfigResponse.MonitorConfigs["+ i +"].LinkedQuerys["+ j +"]"));
			}
			monitorConfig.setLinkedQuerys(linkedQuerys);

			List<String> excludeKeys = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("OpsGetMonitorConfigResponse.MonitorConfigs["+ i +"].ExcludeKeys.Length"); j++) {
				excludeKeys.add(_ctx.stringValue("OpsGetMonitorConfigResponse.MonitorConfigs["+ i +"].ExcludeKeys["+ j +"]"));
			}
			monitorConfig.setExcludeKeys(excludeKeys);

			List<String> regions = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("OpsGetMonitorConfigResponse.MonitorConfigs["+ i +"].Regions.Length"); j++) {
				regions.add(_ctx.stringValue("OpsGetMonitorConfigResponse.MonitorConfigs["+ i +"].Regions["+ j +"]"));
			}
			monitorConfig.setRegions(regions);

			List<String> slsRegionProjectList = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("OpsGetMonitorConfigResponse.MonitorConfigs["+ i +"].SlsRegionProjectList.Length"); j++) {
				slsRegionProjectList.add(_ctx.stringValue("OpsGetMonitorConfigResponse.MonitorConfigs["+ i +"].SlsRegionProjectList["+ j +"]"));
			}
			monitorConfig.setSlsRegionProjectList(slsRegionProjectList);

			List<String> slsUrlList = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("OpsGetMonitorConfigResponse.MonitorConfigs["+ i +"].SlsUrlList.Length"); j++) {
				slsUrlList.add(_ctx.stringValue("OpsGetMonitorConfigResponse.MonitorConfigs["+ i +"].SlsUrlList["+ j +"]"));
			}
			monitorConfig.setSlsUrlList(slsUrlList);

			EventCenter eventCenter = new EventCenter();
			eventCenter.setPush(_ctx.booleanValue("OpsGetMonitorConfigResponse.MonitorConfigs["+ i +"].EventCenter.Push"));
			eventCenter.setImpact(_ctx.stringValue("OpsGetMonitorConfigResponse.MonitorConfigs["+ i +"].EventCenter.Impact"));
			eventCenter.setClosureFlag(_ctx.stringValue("OpsGetMonitorConfigResponse.MonitorConfigs["+ i +"].EventCenter.ClosureFlag"));
			eventCenter.setClosureEvent(_ctx.stringValue("OpsGetMonitorConfigResponse.MonitorConfigs["+ i +"].EventCenter.ClosureEvent"));
			eventCenter.setCategory(_ctx.stringValue("OpsGetMonitorConfigResponse.MonitorConfigs["+ i +"].EventCenter.Category"));
			eventCenter.setEventSilent(_ctx.stringValue("OpsGetMonitorConfigResponse.MonitorConfigs["+ i +"].EventCenter.EventSilent"));
			eventCenter.setOpsCode(_ctx.stringValue("OpsGetMonitorConfigResponse.MonitorConfigs["+ i +"].EventCenter.OpsCode"));
			eventCenter.setResourceStatus(_ctx.stringValue("OpsGetMonitorConfigResponse.MonitorConfigs["+ i +"].EventCenter.ResourceStatus"));
			monitorConfig.setEventCenter(eventCenter);

			Exclusion exclusion = new Exclusion();
			exclusion.setExtension(_ctx.stringValue("OpsGetMonitorConfigResponse.MonitorConfigs["+ i +"].Exclusion.Extension"));

			List<String> excludedAZones = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("OpsGetMonitorConfigResponse.MonitorConfigs["+ i +"].Exclusion.ExcludedAZones.Length"); j++) {
				excludedAZones.add(_ctx.stringValue("OpsGetMonitorConfigResponse.MonitorConfigs["+ i +"].Exclusion.ExcludedAZones["+ j +"]"));
			}
			exclusion.setExcludedAZones(excludedAZones);

			List<String> excludedClusters = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("OpsGetMonitorConfigResponse.MonitorConfigs["+ i +"].Exclusion.ExcludedClusters.Length"); j++) {
				excludedClusters.add(_ctx.stringValue("OpsGetMonitorConfigResponse.MonitorConfigs["+ i +"].Exclusion.ExcludedClusters["+ j +"]"));
			}
			exclusion.setExcludedClusters(excludedClusters);

			List<String> excludedVms = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("OpsGetMonitorConfigResponse.MonitorConfigs["+ i +"].Exclusion.ExcludedVms.Length"); j++) {
				excludedVms.add(_ctx.stringValue("OpsGetMonitorConfigResponse.MonitorConfigs["+ i +"].Exclusion.ExcludedVms["+ j +"]"));
			}
			exclusion.setExcludedVms(excludedVms);

			List<String> excludedNcs = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("OpsGetMonitorConfigResponse.MonitorConfigs["+ i +"].Exclusion.ExcludedNcs.Length"); j++) {
				excludedNcs.add(_ctx.stringValue("OpsGetMonitorConfigResponse.MonitorConfigs["+ i +"].Exclusion.ExcludedNcs["+ j +"]"));
			}
			exclusion.setExcludedNcs(excludedNcs);

			List<String> excludedRegions = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("OpsGetMonitorConfigResponse.MonitorConfigs["+ i +"].Exclusion.ExcludedRegions.Length"); j++) {
				excludedRegions.add(_ctx.stringValue("OpsGetMonitorConfigResponse.MonitorConfigs["+ i +"].Exclusion.ExcludedRegions["+ j +"]"));
			}
			exclusion.setExcludedRegions(excludedRegions);
			monitorConfig.setExclusion(exclusion);

			List<Level> levels = new ArrayList<Level>();
			for (int j = 0; j < _ctx.lengthValue("OpsGetMonitorConfigResponse.MonitorConfigs["+ i +"].Levels.Length"); j++) {
				Level level = new Level();
				level.setPhoneCall(_ctx.booleanValue("OpsGetMonitorConfigResponse.MonitorConfigs["+ i +"].Levels["+ j +"].PhoneCall"));
				level.setPersistent(_ctx.booleanValue("OpsGetMonitorConfigResponse.MonitorConfigs["+ i +"].Levels["+ j +"].Persistent"));
				level.setHasVmThenAlert(_ctx.booleanValue("OpsGetMonitorConfigResponse.MonitorConfigs["+ i +"].Levels["+ j +"].HasVmThenAlert"));
				level.setExpression(_ctx.stringValue("OpsGetMonitorConfigResponse.MonitorConfigs["+ i +"].Levels["+ j +"].Expression"));
				level.setAlertOnCall(_ctx.integerValue("OpsGetMonitorConfigResponse.MonitorConfigs["+ i +"].Levels["+ j +"].AlertOnCall"));
				level.setName(_ctx.stringValue("OpsGetMonitorConfigResponse.MonitorConfigs["+ i +"].Levels["+ j +"].Name"));

				List<String> actions = new ArrayList<String>();
				for (int k = 0; k < _ctx.lengthValue("OpsGetMonitorConfigResponse.MonitorConfigs["+ i +"].Levels["+ j +"].Actions.Length"); k++) {
					actions.add(_ctx.stringValue("OpsGetMonitorConfigResponse.MonitorConfigs["+ i +"].Levels["+ j +"].Actions["+ k +"]"));
				}
				level.setActions(actions);

				List<String> notifys = new ArrayList<String>();
				for (int k = 0; k < _ctx.lengthValue("OpsGetMonitorConfigResponse.MonitorConfigs["+ i +"].Levels["+ j +"].Notifys.Length"); k++) {
					notifys.add(_ctx.stringValue("OpsGetMonitorConfigResponse.MonitorConfigs["+ i +"].Levels["+ j +"].Notifys["+ k +"]"));
				}
				level.setNotifys(notifys);

				List<String> filterChains = new ArrayList<String>();
				for (int k = 0; k < _ctx.lengthValue("OpsGetMonitorConfigResponse.MonitorConfigs["+ i +"].Levels["+ j +"].FilterChains.Length"); k++) {
					filterChains.add(_ctx.stringValue("OpsGetMonitorConfigResponse.MonitorConfigs["+ i +"].Levels["+ j +"].FilterChains["+ k +"]"));
				}
				level.setFilterChains(filterChains);

				List<String> atDutys = new ArrayList<String>();
				for (int k = 0; k < _ctx.lengthValue("OpsGetMonitorConfigResponse.MonitorConfigs["+ i +"].Levels["+ j +"].AtDutys.Length"); k++) {
					atDutys.add(_ctx.stringValue("OpsGetMonitorConfigResponse.MonitorConfigs["+ i +"].Levels["+ j +"].AtDutys["+ k +"]"));
				}
				level.setAtDutys(atDutys);

				List<String> notifyTokenUrlList = new ArrayList<String>();
				for (int k = 0; k < _ctx.lengthValue("OpsGetMonitorConfigResponse.MonitorConfigs["+ i +"].Levels["+ j +"].NotifyTokenUrlList.Length"); k++) {
					notifyTokenUrlList.add(_ctx.stringValue("OpsGetMonitorConfigResponse.MonitorConfigs["+ i +"].Levels["+ j +"].NotifyTokenUrlList["+ k +"]"));
				}
				level.setNotifyTokenUrlList(notifyTokenUrlList);

				List<String> levelNotifyTokens = new ArrayList<String>();
				for (int k = 0; k < _ctx.lengthValue("OpsGetMonitorConfigResponse.MonitorConfigs["+ i +"].Levels["+ j +"].LevelNotifyTokens.Length"); k++) {
					levelNotifyTokens.add(_ctx.stringValue("OpsGetMonitorConfigResponse.MonitorConfigs["+ i +"].Levels["+ j +"].LevelNotifyTokens["+ k +"]"));
				}
				level.setLevelNotifyTokens(levelNotifyTokens);

				levels.add(level);
			}
			monitorConfig.setLevels(levels);

			monitorConfigs.add(monitorConfig);
		}
		opsGetMonitorConfigResponse.setMonitorConfigs(monitorConfigs);
	 
	 	return opsGetMonitorConfigResponse;
	}
}