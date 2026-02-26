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

package com.aliyuncs.sae.transform.v20190506;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sae.model.v20190506.PublishWebApplicationRevisionResponse;
import com.aliyuncs.sae.model.v20190506.PublishWebApplicationRevisionResponse.Data;
import com.aliyuncs.sae.model.v20190506.PublishWebApplicationRevisionResponse.Data.RevisionConfig;
import com.aliyuncs.sae.model.v20190506.PublishWebApplicationRevisionResponse.Data.RevisionConfig.ContainersItem;
import com.aliyuncs.sae.model.v20190506.PublishWebApplicationRevisionResponse.Data.RevisionConfig.ContainersItem.MetricsCollectConfig;
import com.aliyuncs.sae.model.v20190506.PublishWebApplicationRevisionResponse.Data.RevisionConfig.ContainersItem.Resources;
import com.aliyuncs.sae.model.v20190506.PublishWebApplicationRevisionResponse.Data.RevisionConfig.ContainersItem.SLSCollectConfigs;
import com.aliyuncs.sae.model.v20190506.PublishWebApplicationRevisionResponse.Data.RevisionConfig.ContainersItem.SLSCollectConfigs.CollectConfigsItem;
import com.aliyuncs.sae.model.v20190506.PublishWebApplicationRevisionResponse.Data.RevisionConfig.ContainersItem.StartupProbe;
import com.aliyuncs.sae.model.v20190506.PublishWebApplicationRevisionResponse.Data.RevisionConfig.ContainersItem.StartupProbe.ProbeHandler;
import com.aliyuncs.sae.model.v20190506.PublishWebApplicationRevisionResponse.Data.RevisionConfig.ContainersItem.StartupProbe.ProbeHandler.HttpGet;
import com.aliyuncs.sae.model.v20190506.PublishWebApplicationRevisionResponse.Data.RevisionConfig.ContainersItem.StartupProbe.ProbeHandler.HttpGet.HttpHeadersItem;
import com.aliyuncs.sae.model.v20190506.PublishWebApplicationRevisionResponse.Data.RevisionConfig.ContainersItem.StartupProbe.ProbeHandler.TcpSocket;
import com.aliyuncs.sae.model.v20190506.PublishWebApplicationRevisionResponse.Data.RevisionConfig.ContainersItem.WebNASConfig;
import com.aliyuncs.sae.model.v20190506.PublishWebApplicationRevisionResponse.Data.RevisionConfig.ContainersItem.WebNASConfig.Item;
import com.aliyuncs.sae.model.v20190506.PublishWebApplicationRevisionResponse.Data.RevisionConfig.ContainersItem.WebOSSConfig;
import com.aliyuncs.sae.model.v20190506.PublishWebApplicationRevisionResponse.Data.RevisionConfig.ContainersItem.WebOSSConfig.Item2;
import com.aliyuncs.sae.model.v20190506.PublishWebApplicationRevisionResponse.Data.RevisionConfig.WebNetworkConfig;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class PublishWebApplicationRevisionResponseUnmarshaller {

	public static PublishWebApplicationRevisionResponse unmarshall(PublishWebApplicationRevisionResponse publishWebApplicationRevisionResponse, UnmarshallerContext _ctx) {
		
		publishWebApplicationRevisionResponse.setRequestId(_ctx.stringValue("PublishWebApplicationRevisionResponse.RequestId"));
		publishWebApplicationRevisionResponse.setCode(_ctx.integerValue("PublishWebApplicationRevisionResponse.Code"));
		publishWebApplicationRevisionResponse.setMessage(_ctx.stringValue("PublishWebApplicationRevisionResponse.Message"));
		publishWebApplicationRevisionResponse.setSuccess(_ctx.booleanValue("PublishWebApplicationRevisionResponse.Success"));

		Data data = new Data();
		data.setCreatedTime(_ctx.stringValue("PublishWebApplicationRevisionResponse.Data.CreatedTime"));
		data.setDescription(_ctx.stringValue("PublishWebApplicationRevisionResponse.Data.Description"));
		data.setRevisionId(_ctx.stringValue("PublishWebApplicationRevisionResponse.Data.RevisionId"));
		data.setWeight(_ctx.floatValue("PublishWebApplicationRevisionResponse.Data.Weight"));

		RevisionConfig revisionConfig = new RevisionConfig();
		revisionConfig.setEnableArmsMetrics(_ctx.booleanValue("PublishWebApplicationRevisionResponse.Data.RevisionConfig.EnableArmsMetrics"));

		WebNetworkConfig webNetworkConfig = new WebNetworkConfig();
		webNetworkConfig.setInternetAccess(_ctx.booleanValue("PublishWebApplicationRevisionResponse.Data.RevisionConfig.WebNetworkConfig.InternetAccess"));
		webNetworkConfig.setSecurityGroupId(_ctx.stringValue("PublishWebApplicationRevisionResponse.Data.RevisionConfig.WebNetworkConfig.SecurityGroupId"));

		List<String> vSwitchIds = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("PublishWebApplicationRevisionResponse.Data.RevisionConfig.WebNetworkConfig.VSwitchIds.Length"); i++) {
			vSwitchIds.add(_ctx.stringValue("PublishWebApplicationRevisionResponse.Data.RevisionConfig.WebNetworkConfig.VSwitchIds["+ i +"]"));
		}
		webNetworkConfig.setVSwitchIds(vSwitchIds);
		revisionConfig.setWebNetworkConfig(webNetworkConfig);

		List<ContainersItem> containers = new ArrayList<ContainersItem>();
		for (int i = 0; i < _ctx.lengthValue("PublishWebApplicationRevisionResponse.Data.RevisionConfig.Containers.Length"); i++) {
			ContainersItem containersItem = new ContainersItem();
			containersItem.setArgs(_ctx.stringValue("PublishWebApplicationRevisionResponse.Data.RevisionConfig.Containers["+ i +"].Args"));
			containersItem.setCommand(_ctx.stringValue("PublishWebApplicationRevisionResponse.Data.RevisionConfig.Containers["+ i +"].Command"));
			containersItem.setEnvironmentVariables(_ctx.mapValue("PublishWebApplicationRevisionResponse.Data.RevisionConfig.Containers["+ i +"].EnvironmentVariables"));
			containersItem.setImage(_ctx.stringValue("PublishWebApplicationRevisionResponse.Data.RevisionConfig.Containers["+ i +"].Image"));
			containersItem.setPort(_ctx.integerValue("PublishWebApplicationRevisionResponse.Data.RevisionConfig.Containers["+ i +"].Port"));
			containersItem.setRequestConcurrency(_ctx.integerValue("PublishWebApplicationRevisionResponse.Data.RevisionConfig.Containers["+ i +"].RequestConcurrency"));
			containersItem.setRequestTimeout(_ctx.integerValue("PublishWebApplicationRevisionResponse.Data.RevisionConfig.Containers["+ i +"].RequestTimeout"));

			WebNASConfig webNASConfig = new WebNASConfig();

			List<Item> mountPoints = new ArrayList<Item>();
			for (int j = 0; j < _ctx.lengthValue("PublishWebApplicationRevisionResponse.Data.RevisionConfig.Containers["+ i +"].WebNASConfig.MountPoints.Length"); j++) {
				Item item = new Item();
				item.setMountDir(_ctx.stringValue("PublishWebApplicationRevisionResponse.Data.RevisionConfig.Containers["+ i +"].WebNASConfig.MountPoints["+ j +"].MountDir"));
				item.setNasAddr(_ctx.stringValue("PublishWebApplicationRevisionResponse.Data.RevisionConfig.Containers["+ i +"].WebNASConfig.MountPoints["+ j +"].NasAddr"));
				item.setNasPath(_ctx.stringValue("PublishWebApplicationRevisionResponse.Data.RevisionConfig.Containers["+ i +"].WebNASConfig.MountPoints["+ j +"].NasPath"));

				mountPoints.add(item);
			}
			webNASConfig.setMountPoints(mountPoints);
			containersItem.setWebNASConfig(webNASConfig);

			WebOSSConfig webOSSConfig = new WebOSSConfig();

			List<Item2> mountPoints1 = new ArrayList<Item2>();
			for (int j = 0; j < _ctx.lengthValue("PublishWebApplicationRevisionResponse.Data.RevisionConfig.Containers["+ i +"].WebOSSConfig.MountPoints.Length"); j++) {
				Item2 item2 = new Item2();
				item2.setBucketName(_ctx.stringValue("PublishWebApplicationRevisionResponse.Data.RevisionConfig.Containers["+ i +"].WebOSSConfig.MountPoints["+ j +"].BucketName"));
				item2.setBucketPath(_ctx.stringValue("PublishWebApplicationRevisionResponse.Data.RevisionConfig.Containers["+ i +"].WebOSSConfig.MountPoints["+ j +"].BucketPath"));
				item2.setMountDir(_ctx.stringValue("PublishWebApplicationRevisionResponse.Data.RevisionConfig.Containers["+ i +"].WebOSSConfig.MountPoints["+ j +"].MountDir"));
				item2.setReadOnly(_ctx.booleanValue("PublishWebApplicationRevisionResponse.Data.RevisionConfig.Containers["+ i +"].WebOSSConfig.MountPoints["+ j +"].ReadOnly"));

				mountPoints1.add(item2);
			}
			webOSSConfig.setMountPoints1(mountPoints1);
			containersItem.setWebOSSConfig(webOSSConfig);

			Resources resources = new Resources();
			resources.setCpu(_ctx.integerValue("PublishWebApplicationRevisionResponse.Data.RevisionConfig.Containers["+ i +"].Resources.Cpu"));
			resources.setMemory(_ctx.integerValue("PublishWebApplicationRevisionResponse.Data.RevisionConfig.Containers["+ i +"].Resources.Memory"));
			containersItem.setResources(resources);

			StartupProbe startupProbe = new StartupProbe();
			startupProbe.setFailureThreshold(_ctx.integerValue("PublishWebApplicationRevisionResponse.Data.RevisionConfig.Containers["+ i +"].StartupProbe.FailureThreshold"));
			startupProbe.setInitialDelaySeconds(_ctx.integerValue("PublishWebApplicationRevisionResponse.Data.RevisionConfig.Containers["+ i +"].StartupProbe.InitialDelaySeconds"));
			startupProbe.setPeriodSeconds(_ctx.integerValue("PublishWebApplicationRevisionResponse.Data.RevisionConfig.Containers["+ i +"].StartupProbe.PeriodSeconds"));
			startupProbe.setTimeoutSeconds(_ctx.integerValue("PublishWebApplicationRevisionResponse.Data.RevisionConfig.Containers["+ i +"].StartupProbe.TimeoutSeconds"));

			ProbeHandler probeHandler = new ProbeHandler();

			HttpGet httpGet = new HttpGet();
			httpGet.setHost(_ctx.stringValue("PublishWebApplicationRevisionResponse.Data.RevisionConfig.Containers["+ i +"].StartupProbe.ProbeHandler.HttpGet.Host"));
			httpGet.setPath(_ctx.stringValue("PublishWebApplicationRevisionResponse.Data.RevisionConfig.Containers["+ i +"].StartupProbe.ProbeHandler.HttpGet.Path"));
			httpGet.setPort(_ctx.integerValue("PublishWebApplicationRevisionResponse.Data.RevisionConfig.Containers["+ i +"].StartupProbe.ProbeHandler.HttpGet.Port"));
			httpGet.setScheme(_ctx.stringValue("PublishWebApplicationRevisionResponse.Data.RevisionConfig.Containers["+ i +"].StartupProbe.ProbeHandler.HttpGet.Scheme"));

			List<HttpHeadersItem> httpHeaders = new ArrayList<HttpHeadersItem>();
			for (int j = 0; j < _ctx.lengthValue("PublishWebApplicationRevisionResponse.Data.RevisionConfig.Containers["+ i +"].StartupProbe.ProbeHandler.HttpGet.HttpHeaders.Length"); j++) {
				HttpHeadersItem httpHeadersItem = new HttpHeadersItem();
				httpHeadersItem.setName(_ctx.stringValue("PublishWebApplicationRevisionResponse.Data.RevisionConfig.Containers["+ i +"].StartupProbe.ProbeHandler.HttpGet.HttpHeaders["+ j +"].name"));
				httpHeadersItem.setValue(_ctx.stringValue("PublishWebApplicationRevisionResponse.Data.RevisionConfig.Containers["+ i +"].StartupProbe.ProbeHandler.HttpGet.HttpHeaders["+ j +"].value"));

				httpHeaders.add(httpHeadersItem);
			}
			httpGet.setHttpHeaders(httpHeaders);
			probeHandler.setHttpGet(httpGet);

			TcpSocket tcpSocket = new TcpSocket();
			tcpSocket.setHost(_ctx.stringValue("PublishWebApplicationRevisionResponse.Data.RevisionConfig.Containers["+ i +"].StartupProbe.ProbeHandler.TcpSocket.Host"));
			tcpSocket.setPort(_ctx.integerValue("PublishWebApplicationRevisionResponse.Data.RevisionConfig.Containers["+ i +"].StartupProbe.ProbeHandler.TcpSocket.Port"));
			probeHandler.setTcpSocket(tcpSocket);
			startupProbe.setProbeHandler(probeHandler);
			containersItem.setStartupProbe(startupProbe);

			SLSCollectConfigs sLSCollectConfigs = new SLSCollectConfigs();

			List<CollectConfigsItem> collectConfigs = new ArrayList<CollectConfigsItem>();
			for (int j = 0; j < _ctx.lengthValue("PublishWebApplicationRevisionResponse.Data.RevisionConfig.Containers["+ i +"].SLSCollectConfigs.CollectConfigs.Length"); j++) {
				CollectConfigsItem collectConfigsItem = new CollectConfigsItem();
				collectConfigsItem.setLogPath(_ctx.stringValue("PublishWebApplicationRevisionResponse.Data.RevisionConfig.Containers["+ i +"].SLSCollectConfigs.CollectConfigs["+ j +"].LogPath"));
				collectConfigsItem.setLogType(_ctx.stringValue("PublishWebApplicationRevisionResponse.Data.RevisionConfig.Containers["+ i +"].SLSCollectConfigs.CollectConfigs["+ j +"].LogType"));
				collectConfigsItem.setLogstoreName(_ctx.stringValue("PublishWebApplicationRevisionResponse.Data.RevisionConfig.Containers["+ i +"].SLSCollectConfigs.CollectConfigs["+ j +"].LogstoreName"));
				collectConfigsItem.setLogtailName(_ctx.stringValue("PublishWebApplicationRevisionResponse.Data.RevisionConfig.Containers["+ i +"].SLSCollectConfigs.CollectConfigs["+ j +"].LogtailName"));
				collectConfigsItem.setMachineGroup(_ctx.stringValue("PublishWebApplicationRevisionResponse.Data.RevisionConfig.Containers["+ i +"].SLSCollectConfigs.CollectConfigs["+ j +"].MachineGroup"));
				collectConfigsItem.setProjectName(_ctx.stringValue("PublishWebApplicationRevisionResponse.Data.RevisionConfig.Containers["+ i +"].SLSCollectConfigs.CollectConfigs["+ j +"].ProjectName"));

				collectConfigs.add(collectConfigsItem);
			}
			sLSCollectConfigs.setCollectConfigs(collectConfigs);
			containersItem.setSLSCollectConfigs(sLSCollectConfigs);

			MetricsCollectConfig metricsCollectConfig = new MetricsCollectConfig();
			metricsCollectConfig.setLogstoreName(_ctx.stringValue("PublishWebApplicationRevisionResponse.Data.RevisionConfig.Containers["+ i +"].MetricsCollectConfig.LogstoreName"));
			metricsCollectConfig.setProjectName(_ctx.stringValue("PublishWebApplicationRevisionResponse.Data.RevisionConfig.Containers["+ i +"].MetricsCollectConfig.ProjectName"));
			metricsCollectConfig.setEnablePushToUserSLS(_ctx.booleanValue("PublishWebApplicationRevisionResponse.Data.RevisionConfig.Containers["+ i +"].MetricsCollectConfig.EnablePushToUserSLS"));
			containersItem.setMetricsCollectConfig(metricsCollectConfig);

			containers.add(containersItem);
		}
		revisionConfig.setContainers(containers);
		data.setRevisionConfig(revisionConfig);
		publishWebApplicationRevisionResponse.setData(data);
	 
	 	return publishWebApplicationRevisionResponse;
	}
}