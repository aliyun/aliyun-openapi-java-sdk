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

import com.aliyuncs.sae.model.v20190506.ListWebApplicationRevisionsResponse;
import com.aliyuncs.sae.model.v20190506.ListWebApplicationRevisionsResponse.Data;
import com.aliyuncs.sae.model.v20190506.ListWebApplicationRevisionsResponse.Data.RevisionsItem;
import com.aliyuncs.sae.model.v20190506.ListWebApplicationRevisionsResponse.Data.RevisionsItem.RevisionConfig;
import com.aliyuncs.sae.model.v20190506.ListWebApplicationRevisionsResponse.Data.RevisionsItem.RevisionConfig.ContainersItem;
import com.aliyuncs.sae.model.v20190506.ListWebApplicationRevisionsResponse.Data.RevisionsItem.RevisionConfig.ContainersItem.MetricsCollectConfig;
import com.aliyuncs.sae.model.v20190506.ListWebApplicationRevisionsResponse.Data.RevisionsItem.RevisionConfig.ContainersItem.Resources;
import com.aliyuncs.sae.model.v20190506.ListWebApplicationRevisionsResponse.Data.RevisionsItem.RevisionConfig.ContainersItem.SLSCollectConfigs;
import com.aliyuncs.sae.model.v20190506.ListWebApplicationRevisionsResponse.Data.RevisionsItem.RevisionConfig.ContainersItem.SLSCollectConfigs.CollectConfigsItem;
import com.aliyuncs.sae.model.v20190506.ListWebApplicationRevisionsResponse.Data.RevisionsItem.RevisionConfig.ContainersItem.StartupProbe;
import com.aliyuncs.sae.model.v20190506.ListWebApplicationRevisionsResponse.Data.RevisionsItem.RevisionConfig.ContainersItem.StartupProbe.ProbeHandler;
import com.aliyuncs.sae.model.v20190506.ListWebApplicationRevisionsResponse.Data.RevisionsItem.RevisionConfig.ContainersItem.StartupProbe.ProbeHandler.HttpGet;
import com.aliyuncs.sae.model.v20190506.ListWebApplicationRevisionsResponse.Data.RevisionsItem.RevisionConfig.ContainersItem.StartupProbe.ProbeHandler.HttpGet.HttpHeadersItem;
import com.aliyuncs.sae.model.v20190506.ListWebApplicationRevisionsResponse.Data.RevisionsItem.RevisionConfig.ContainersItem.StartupProbe.ProbeHandler.TcpSocket;
import com.aliyuncs.sae.model.v20190506.ListWebApplicationRevisionsResponse.Data.RevisionsItem.RevisionConfig.ContainersItem.WebNASConfig;
import com.aliyuncs.sae.model.v20190506.ListWebApplicationRevisionsResponse.Data.RevisionsItem.RevisionConfig.ContainersItem.WebNASConfig.Item;
import com.aliyuncs.sae.model.v20190506.ListWebApplicationRevisionsResponse.Data.RevisionsItem.RevisionConfig.ContainersItem.WebOSSConfig;
import com.aliyuncs.sae.model.v20190506.ListWebApplicationRevisionsResponse.Data.RevisionsItem.RevisionConfig.ContainersItem.WebOSSConfig.Item2;
import com.aliyuncs.sae.model.v20190506.ListWebApplicationRevisionsResponse.Data.RevisionsItem.RevisionConfig.WebNetworkConfig;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListWebApplicationRevisionsResponseUnmarshaller {

	public static ListWebApplicationRevisionsResponse unmarshall(ListWebApplicationRevisionsResponse listWebApplicationRevisionsResponse, UnmarshallerContext _ctx) {
		
		listWebApplicationRevisionsResponse.setRequestId(_ctx.stringValue("ListWebApplicationRevisionsResponse.RequestId"));
		listWebApplicationRevisionsResponse.setCode(_ctx.integerValue("ListWebApplicationRevisionsResponse.Code"));
		listWebApplicationRevisionsResponse.setMessage(_ctx.stringValue("ListWebApplicationRevisionsResponse.Message"));
		listWebApplicationRevisionsResponse.setSuccess(_ctx.booleanValue("ListWebApplicationRevisionsResponse.Success"));

		Data data = new Data();
		data.setNextToken(_ctx.stringValue("ListWebApplicationRevisionsResponse.Data.NextToken"));

		List<RevisionsItem> revisions = new ArrayList<RevisionsItem>();
		for (int i = 0; i < _ctx.lengthValue("ListWebApplicationRevisionsResponse.Data.Revisions.Length"); i++) {
			RevisionsItem revisionsItem = new RevisionsItem();
			revisionsItem.setCreatedTime(_ctx.stringValue("ListWebApplicationRevisionsResponse.Data.Revisions["+ i +"].CreatedTime"));
			revisionsItem.setDescription(_ctx.stringValue("ListWebApplicationRevisionsResponse.Data.Revisions["+ i +"].Description"));
			revisionsItem.setRevisionId(_ctx.stringValue("ListWebApplicationRevisionsResponse.Data.Revisions["+ i +"].RevisionId"));
			revisionsItem.setWeight(_ctx.floatValue("ListWebApplicationRevisionsResponse.Data.Revisions["+ i +"].Weight"));

			RevisionConfig revisionConfig = new RevisionConfig();
			revisionConfig.setEnableArmsMetrics(_ctx.booleanValue("ListWebApplicationRevisionsResponse.Data.Revisions["+ i +"].RevisionConfig.EnableArmsMetrics"));

			WebNetworkConfig webNetworkConfig = new WebNetworkConfig();
			webNetworkConfig.setInternetAccess(_ctx.booleanValue("ListWebApplicationRevisionsResponse.Data.Revisions["+ i +"].RevisionConfig.WebNetworkConfig.InternetAccess"));
			webNetworkConfig.setSecurityGroupId(_ctx.stringValue("ListWebApplicationRevisionsResponse.Data.Revisions["+ i +"].RevisionConfig.WebNetworkConfig.SecurityGroupId"));

			List<String> vSwitchIds = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListWebApplicationRevisionsResponse.Data.Revisions["+ i +"].RevisionConfig.WebNetworkConfig.VSwitchIds.Length"); j++) {
				vSwitchIds.add(_ctx.stringValue("ListWebApplicationRevisionsResponse.Data.Revisions["+ i +"].RevisionConfig.WebNetworkConfig.VSwitchIds["+ j +"]"));
			}
			webNetworkConfig.setVSwitchIds(vSwitchIds);
			revisionConfig.setWebNetworkConfig(webNetworkConfig);

			List<ContainersItem> containers = new ArrayList<ContainersItem>();
			for (int j = 0; j < _ctx.lengthValue("ListWebApplicationRevisionsResponse.Data.Revisions["+ i +"].RevisionConfig.Containers.Length"); j++) {
				ContainersItem containersItem = new ContainersItem();
				containersItem.setArgs(_ctx.stringValue("ListWebApplicationRevisionsResponse.Data.Revisions["+ i +"].RevisionConfig.Containers["+ j +"].Args"));
				containersItem.setCommand(_ctx.stringValue("ListWebApplicationRevisionsResponse.Data.Revisions["+ i +"].RevisionConfig.Containers["+ j +"].Command"));
				containersItem.setEnvironmentVariables(_ctx.mapValue("ListWebApplicationRevisionsResponse.Data.Revisions["+ i +"].RevisionConfig.Containers["+ j +"].EnvironmentVariables"));
				containersItem.setImage(_ctx.stringValue("ListWebApplicationRevisionsResponse.Data.Revisions["+ i +"].RevisionConfig.Containers["+ j +"].Image"));
				containersItem.setPort(_ctx.integerValue("ListWebApplicationRevisionsResponse.Data.Revisions["+ i +"].RevisionConfig.Containers["+ j +"].Port"));
				containersItem.setRequestConcurrency(_ctx.integerValue("ListWebApplicationRevisionsResponse.Data.Revisions["+ i +"].RevisionConfig.Containers["+ j +"].RequestConcurrency"));
				containersItem.setRequestTimeout(_ctx.integerValue("ListWebApplicationRevisionsResponse.Data.Revisions["+ i +"].RevisionConfig.Containers["+ j +"].RequestTimeout"));

				WebNASConfig webNASConfig = new WebNASConfig();

				List<Item> mountPoints = new ArrayList<Item>();
				for (int k = 0; k < _ctx.lengthValue("ListWebApplicationRevisionsResponse.Data.Revisions["+ i +"].RevisionConfig.Containers["+ j +"].WebNASConfig.MountPoints.Length"); k++) {
					Item item = new Item();
					item.setMountDir(_ctx.stringValue("ListWebApplicationRevisionsResponse.Data.Revisions["+ i +"].RevisionConfig.Containers["+ j +"].WebNASConfig.MountPoints["+ k +"].MountDir"));
					item.setNasAddr(_ctx.stringValue("ListWebApplicationRevisionsResponse.Data.Revisions["+ i +"].RevisionConfig.Containers["+ j +"].WebNASConfig.MountPoints["+ k +"].NasAddr"));
					item.setNasPath(_ctx.stringValue("ListWebApplicationRevisionsResponse.Data.Revisions["+ i +"].RevisionConfig.Containers["+ j +"].WebNASConfig.MountPoints["+ k +"].NasPath"));

					mountPoints.add(item);
				}
				webNASConfig.setMountPoints(mountPoints);
				containersItem.setWebNASConfig(webNASConfig);

				WebOSSConfig webOSSConfig = new WebOSSConfig();

				List<Item2> mountPoints1 = new ArrayList<Item2>();
				for (int k = 0; k < _ctx.lengthValue("ListWebApplicationRevisionsResponse.Data.Revisions["+ i +"].RevisionConfig.Containers["+ j +"].WebOSSConfig.MountPoints.Length"); k++) {
					Item2 item2 = new Item2();
					item2.setBucketName(_ctx.stringValue("ListWebApplicationRevisionsResponse.Data.Revisions["+ i +"].RevisionConfig.Containers["+ j +"].WebOSSConfig.MountPoints["+ k +"].BucketName"));
					item2.setBucketPath(_ctx.stringValue("ListWebApplicationRevisionsResponse.Data.Revisions["+ i +"].RevisionConfig.Containers["+ j +"].WebOSSConfig.MountPoints["+ k +"].BucketPath"));
					item2.setMountDir(_ctx.stringValue("ListWebApplicationRevisionsResponse.Data.Revisions["+ i +"].RevisionConfig.Containers["+ j +"].WebOSSConfig.MountPoints["+ k +"].MountDir"));
					item2.setReadOnly(_ctx.booleanValue("ListWebApplicationRevisionsResponse.Data.Revisions["+ i +"].RevisionConfig.Containers["+ j +"].WebOSSConfig.MountPoints["+ k +"].ReadOnly"));

					mountPoints1.add(item2);
				}
				webOSSConfig.setMountPoints1(mountPoints1);
				containersItem.setWebOSSConfig(webOSSConfig);

				Resources resources = new Resources();
				resources.setCpu(_ctx.integerValue("ListWebApplicationRevisionsResponse.Data.Revisions["+ i +"].RevisionConfig.Containers["+ j +"].Resources.Cpu"));
				resources.setMemory(_ctx.integerValue("ListWebApplicationRevisionsResponse.Data.Revisions["+ i +"].RevisionConfig.Containers["+ j +"].Resources.Memory"));
				containersItem.setResources(resources);

				StartupProbe startupProbe = new StartupProbe();
				startupProbe.setFailureThreshold(_ctx.integerValue("ListWebApplicationRevisionsResponse.Data.Revisions["+ i +"].RevisionConfig.Containers["+ j +"].StartupProbe.FailureThreshold"));
				startupProbe.setInitialDelaySeconds(_ctx.integerValue("ListWebApplicationRevisionsResponse.Data.Revisions["+ i +"].RevisionConfig.Containers["+ j +"].StartupProbe.InitialDelaySeconds"));
				startupProbe.setPeriodSeconds(_ctx.integerValue("ListWebApplicationRevisionsResponse.Data.Revisions["+ i +"].RevisionConfig.Containers["+ j +"].StartupProbe.PeriodSeconds"));
				startupProbe.setTimeoutSeconds(_ctx.integerValue("ListWebApplicationRevisionsResponse.Data.Revisions["+ i +"].RevisionConfig.Containers["+ j +"].StartupProbe.TimeoutSeconds"));

				ProbeHandler probeHandler = new ProbeHandler();

				HttpGet httpGet = new HttpGet();
				httpGet.setHost(_ctx.stringValue("ListWebApplicationRevisionsResponse.Data.Revisions["+ i +"].RevisionConfig.Containers["+ j +"].StartupProbe.ProbeHandler.HttpGet.Host"));
				httpGet.setPath(_ctx.stringValue("ListWebApplicationRevisionsResponse.Data.Revisions["+ i +"].RevisionConfig.Containers["+ j +"].StartupProbe.ProbeHandler.HttpGet.Path"));
				httpGet.setPort(_ctx.integerValue("ListWebApplicationRevisionsResponse.Data.Revisions["+ i +"].RevisionConfig.Containers["+ j +"].StartupProbe.ProbeHandler.HttpGet.Port"));
				httpGet.setScheme(_ctx.stringValue("ListWebApplicationRevisionsResponse.Data.Revisions["+ i +"].RevisionConfig.Containers["+ j +"].StartupProbe.ProbeHandler.HttpGet.Scheme"));

				List<HttpHeadersItem> httpHeaders = new ArrayList<HttpHeadersItem>();
				for (int k = 0; k < _ctx.lengthValue("ListWebApplicationRevisionsResponse.Data.Revisions["+ i +"].RevisionConfig.Containers["+ j +"].StartupProbe.ProbeHandler.HttpGet.HttpHeaders.Length"); k++) {
					HttpHeadersItem httpHeadersItem = new HttpHeadersItem();
					httpHeadersItem.setName(_ctx.stringValue("ListWebApplicationRevisionsResponse.Data.Revisions["+ i +"].RevisionConfig.Containers["+ j +"].StartupProbe.ProbeHandler.HttpGet.HttpHeaders["+ k +"].name"));
					httpHeadersItem.setValue(_ctx.stringValue("ListWebApplicationRevisionsResponse.Data.Revisions["+ i +"].RevisionConfig.Containers["+ j +"].StartupProbe.ProbeHandler.HttpGet.HttpHeaders["+ k +"].value"));

					httpHeaders.add(httpHeadersItem);
				}
				httpGet.setHttpHeaders(httpHeaders);
				probeHandler.setHttpGet(httpGet);

				TcpSocket tcpSocket = new TcpSocket();
				tcpSocket.setHost(_ctx.stringValue("ListWebApplicationRevisionsResponse.Data.Revisions["+ i +"].RevisionConfig.Containers["+ j +"].StartupProbe.ProbeHandler.TcpSocket.Host"));
				tcpSocket.setPort(_ctx.integerValue("ListWebApplicationRevisionsResponse.Data.Revisions["+ i +"].RevisionConfig.Containers["+ j +"].StartupProbe.ProbeHandler.TcpSocket.Port"));
				probeHandler.setTcpSocket(tcpSocket);
				startupProbe.setProbeHandler(probeHandler);
				containersItem.setStartupProbe(startupProbe);

				SLSCollectConfigs sLSCollectConfigs = new SLSCollectConfigs();

				List<CollectConfigsItem> collectConfigs = new ArrayList<CollectConfigsItem>();
				for (int k = 0; k < _ctx.lengthValue("ListWebApplicationRevisionsResponse.Data.Revisions["+ i +"].RevisionConfig.Containers["+ j +"].SLSCollectConfigs.CollectConfigs.Length"); k++) {
					CollectConfigsItem collectConfigsItem = new CollectConfigsItem();
					collectConfigsItem.setLogPath(_ctx.stringValue("ListWebApplicationRevisionsResponse.Data.Revisions["+ i +"].RevisionConfig.Containers["+ j +"].SLSCollectConfigs.CollectConfigs["+ k +"].LogPath"));
					collectConfigsItem.setLogType(_ctx.stringValue("ListWebApplicationRevisionsResponse.Data.Revisions["+ i +"].RevisionConfig.Containers["+ j +"].SLSCollectConfigs.CollectConfigs["+ k +"].LogType"));
					collectConfigsItem.setLogstoreName(_ctx.stringValue("ListWebApplicationRevisionsResponse.Data.Revisions["+ i +"].RevisionConfig.Containers["+ j +"].SLSCollectConfigs.CollectConfigs["+ k +"].LogstoreName"));
					collectConfigsItem.setLogtailName(_ctx.stringValue("ListWebApplicationRevisionsResponse.Data.Revisions["+ i +"].RevisionConfig.Containers["+ j +"].SLSCollectConfigs.CollectConfigs["+ k +"].LogtailName"));
					collectConfigsItem.setMachineGroup(_ctx.stringValue("ListWebApplicationRevisionsResponse.Data.Revisions["+ i +"].RevisionConfig.Containers["+ j +"].SLSCollectConfigs.CollectConfigs["+ k +"].MachineGroup"));
					collectConfigsItem.setProjectName(_ctx.stringValue("ListWebApplicationRevisionsResponse.Data.Revisions["+ i +"].RevisionConfig.Containers["+ j +"].SLSCollectConfigs.CollectConfigs["+ k +"].ProjectName"));

					collectConfigs.add(collectConfigsItem);
				}
				sLSCollectConfigs.setCollectConfigs(collectConfigs);
				containersItem.setSLSCollectConfigs(sLSCollectConfigs);

				MetricsCollectConfig metricsCollectConfig = new MetricsCollectConfig();
				metricsCollectConfig.setLogstoreName(_ctx.stringValue("ListWebApplicationRevisionsResponse.Data.Revisions["+ i +"].RevisionConfig.Containers["+ j +"].MetricsCollectConfig.LogstoreName"));
				metricsCollectConfig.setProjectName(_ctx.stringValue("ListWebApplicationRevisionsResponse.Data.Revisions["+ i +"].RevisionConfig.Containers["+ j +"].MetricsCollectConfig.ProjectName"));
				metricsCollectConfig.setEnablePushToUserSLS(_ctx.booleanValue("ListWebApplicationRevisionsResponse.Data.Revisions["+ i +"].RevisionConfig.Containers["+ j +"].MetricsCollectConfig.EnablePushToUserSLS"));
				containersItem.setMetricsCollectConfig(metricsCollectConfig);

				containers.add(containersItem);
			}
			revisionConfig.setContainers(containers);
			revisionsItem.setRevisionConfig(revisionConfig);

			revisions.add(revisionsItem);
		}
		data.setRevisions(revisions);
		listWebApplicationRevisionsResponse.setData(data);
	 
	 	return listWebApplicationRevisionsResponse;
	}
}