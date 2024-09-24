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

import com.aliyuncs.sae.model.v20190506.ListWebApplicationsResponse;
import com.aliyuncs.sae.model.v20190506.ListWebApplicationsResponse.Data;
import com.aliyuncs.sae.model.v20190506.ListWebApplicationsResponse.Data.WebApplicationWithInstanceCountItem;
import com.aliyuncs.sae.model.v20190506.ListWebApplicationsResponse.Data.WebApplicationWithInstanceCountItem.WebApplication;
import com.aliyuncs.sae.model.v20190506.ListWebApplicationsResponse.Data.WebApplicationWithInstanceCountItem.WebApplication.RevisionConfig;
import com.aliyuncs.sae.model.v20190506.ListWebApplicationsResponse.Data.WebApplicationWithInstanceCountItem.WebApplication.RevisionConfig.ContainersItem;
import com.aliyuncs.sae.model.v20190506.ListWebApplicationsResponse.Data.WebApplicationWithInstanceCountItem.WebApplication.RevisionConfig.ContainersItem.MetricsCollectConfig;
import com.aliyuncs.sae.model.v20190506.ListWebApplicationsResponse.Data.WebApplicationWithInstanceCountItem.WebApplication.RevisionConfig.ContainersItem.Resources;
import com.aliyuncs.sae.model.v20190506.ListWebApplicationsResponse.Data.WebApplicationWithInstanceCountItem.WebApplication.RevisionConfig.ContainersItem.SLSCollectConfigs;
import com.aliyuncs.sae.model.v20190506.ListWebApplicationsResponse.Data.WebApplicationWithInstanceCountItem.WebApplication.RevisionConfig.ContainersItem.SLSCollectConfigs.CollectConfigsItem;
import com.aliyuncs.sae.model.v20190506.ListWebApplicationsResponse.Data.WebApplicationWithInstanceCountItem.WebApplication.RevisionConfig.ContainersItem.StartupProbe;
import com.aliyuncs.sae.model.v20190506.ListWebApplicationsResponse.Data.WebApplicationWithInstanceCountItem.WebApplication.RevisionConfig.ContainersItem.StartupProbe.ProbeHandler;
import com.aliyuncs.sae.model.v20190506.ListWebApplicationsResponse.Data.WebApplicationWithInstanceCountItem.WebApplication.RevisionConfig.ContainersItem.StartupProbe.ProbeHandler.HttpGet;
import com.aliyuncs.sae.model.v20190506.ListWebApplicationsResponse.Data.WebApplicationWithInstanceCountItem.WebApplication.RevisionConfig.ContainersItem.StartupProbe.ProbeHandler.HttpGet.HttpHeadersItem;
import com.aliyuncs.sae.model.v20190506.ListWebApplicationsResponse.Data.WebApplicationWithInstanceCountItem.WebApplication.RevisionConfig.ContainersItem.StartupProbe.ProbeHandler.TcpSocket;
import com.aliyuncs.sae.model.v20190506.ListWebApplicationsResponse.Data.WebApplicationWithInstanceCountItem.WebApplication.RevisionConfig.ContainersItem.WebNASConfig;
import com.aliyuncs.sae.model.v20190506.ListWebApplicationsResponse.Data.WebApplicationWithInstanceCountItem.WebApplication.RevisionConfig.ContainersItem.WebNASConfig.Item;
import com.aliyuncs.sae.model.v20190506.ListWebApplicationsResponse.Data.WebApplicationWithInstanceCountItem.WebApplication.RevisionConfig.ContainersItem.WebOSSConfig;
import com.aliyuncs.sae.model.v20190506.ListWebApplicationsResponse.Data.WebApplicationWithInstanceCountItem.WebApplication.RevisionConfig.ContainersItem.WebOSSConfig.Item2;
import com.aliyuncs.sae.model.v20190506.ListWebApplicationsResponse.Data.WebApplicationWithInstanceCountItem.WebApplication.RevisionConfig.WebNetworkConfig;
import com.aliyuncs.sae.model.v20190506.ListWebApplicationsResponse.Data.WebApplicationWithInstanceCountItem.WebApplication.WebScalingConfig;
import com.aliyuncs.sae.model.v20190506.ListWebApplicationsResponse.Data.WebApplicationWithInstanceCountItem.WebApplication.WebTrafficConfig;
import com.aliyuncs.sae.model.v20190506.ListWebApplicationsResponse.Data.WebApplicationWithInstanceCountItem.WebApplication.WebTrafficConfig.WebAclConfig;
import com.aliyuncs.sae.model.v20190506.ListWebApplicationsResponse.Data.WebApplicationWithInstanceCountItem.WebApplication.WebTrafficConfig.WebAclConfig.WebAclEntriesItem;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListWebApplicationsResponseUnmarshaller {

	public static ListWebApplicationsResponse unmarshall(ListWebApplicationsResponse listWebApplicationsResponse, UnmarshallerContext _ctx) {
		
		listWebApplicationsResponse.setRequestId(_ctx.stringValue("ListWebApplicationsResponse.RequestId"));
		listWebApplicationsResponse.setCode(_ctx.integerValue("ListWebApplicationsResponse.Code"));
		listWebApplicationsResponse.setMessage(_ctx.stringValue("ListWebApplicationsResponse.Message"));
		listWebApplicationsResponse.setSuccess(_ctx.booleanValue("ListWebApplicationsResponse.Success"));

		Data data = new Data();
		data.setNextToken(_ctx.stringValue("ListWebApplicationsResponse.Data.NextToken"));

		List<WebApplicationWithInstanceCountItem> webApplicationWithInstanceCount = new ArrayList<WebApplicationWithInstanceCountItem>();
		for (int i = 0; i < _ctx.lengthValue("ListWebApplicationsResponse.Data.WebApplicationWithInstanceCount.Length"); i++) {
			WebApplicationWithInstanceCountItem webApplicationWithInstanceCountItem = new WebApplicationWithInstanceCountItem();
			webApplicationWithInstanceCountItem.setInstanceCount(_ctx.longValue("ListWebApplicationsResponse.Data.WebApplicationWithInstanceCount["+ i +"].InstanceCount"));

			WebApplication webApplication = new WebApplication();
			webApplication.setApplicationId(_ctx.stringValue("ListWebApplicationsResponse.Data.WebApplicationWithInstanceCount["+ i +"].WebApplication.ApplicationId"));
			webApplication.setApplicationName(_ctx.stringValue("ListWebApplicationsResponse.Data.WebApplicationWithInstanceCount["+ i +"].WebApplication.ApplicationName"));
			webApplication.setCreatedTime(_ctx.stringValue("ListWebApplicationsResponse.Data.WebApplicationWithInstanceCount["+ i +"].WebApplication.CreatedTime"));
			webApplication.setDescription(_ctx.stringValue("ListWebApplicationsResponse.Data.WebApplicationWithInstanceCount["+ i +"].WebApplication.Description"));
			webApplication.setLastModifiedTime(_ctx.stringValue("ListWebApplicationsResponse.Data.WebApplicationWithInstanceCount["+ i +"].WebApplication.LastModifiedTime"));
			webApplication.setNamespaceId(_ctx.stringValue("ListWebApplicationsResponse.Data.WebApplicationWithInstanceCount["+ i +"].WebApplication.NamespaceId"));
			webApplication.setInternetURL(_ctx.stringValue("ListWebApplicationsResponse.Data.WebApplicationWithInstanceCount["+ i +"].WebApplication.InternetURL"));
			webApplication.setIntranetURL(_ctx.stringValue("ListWebApplicationsResponse.Data.WebApplicationWithInstanceCount["+ i +"].WebApplication.IntranetURL"));
			webApplication.setVpcId(_ctx.stringValue("ListWebApplicationsResponse.Data.WebApplicationWithInstanceCount["+ i +"].WebApplication.VpcId"));

			RevisionConfig revisionConfig = new RevisionConfig();
			revisionConfig.setEnableArmsMetrics(_ctx.booleanValue("ListWebApplicationsResponse.Data.WebApplicationWithInstanceCount["+ i +"].WebApplication.RevisionConfig.EnableArmsMetrics"));

			WebNetworkConfig webNetworkConfig = new WebNetworkConfig();
			webNetworkConfig.setInternetAccess(_ctx.booleanValue("ListWebApplicationsResponse.Data.WebApplicationWithInstanceCount["+ i +"].WebApplication.RevisionConfig.WebNetworkConfig.InternetAccess"));
			webNetworkConfig.setSecurityGroupId(_ctx.stringValue("ListWebApplicationsResponse.Data.WebApplicationWithInstanceCount["+ i +"].WebApplication.RevisionConfig.WebNetworkConfig.SecurityGroupId"));

			List<String> vSwitchIds = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListWebApplicationsResponse.Data.WebApplicationWithInstanceCount["+ i +"].WebApplication.RevisionConfig.WebNetworkConfig.VSwitchIds.Length"); j++) {
				vSwitchIds.add(_ctx.stringValue("ListWebApplicationsResponse.Data.WebApplicationWithInstanceCount["+ i +"].WebApplication.RevisionConfig.WebNetworkConfig.VSwitchIds["+ j +"]"));
			}
			webNetworkConfig.setVSwitchIds(vSwitchIds);
			revisionConfig.setWebNetworkConfig(webNetworkConfig);

			List<ContainersItem> containers = new ArrayList<ContainersItem>();
			for (int j = 0; j < _ctx.lengthValue("ListWebApplicationsResponse.Data.WebApplicationWithInstanceCount["+ i +"].WebApplication.RevisionConfig.Containers.Length"); j++) {
				ContainersItem containersItem = new ContainersItem();
				containersItem.setArgs(_ctx.stringValue("ListWebApplicationsResponse.Data.WebApplicationWithInstanceCount["+ i +"].WebApplication.RevisionConfig.Containers["+ j +"].Args"));
				containersItem.setCommand(_ctx.stringValue("ListWebApplicationsResponse.Data.WebApplicationWithInstanceCount["+ i +"].WebApplication.RevisionConfig.Containers["+ j +"].Command"));
				containersItem.setEnvironmentVariables(_ctx.mapValue("ListWebApplicationsResponse.Data.WebApplicationWithInstanceCount["+ i +"].WebApplication.RevisionConfig.Containers["+ j +"].EnvironmentVariables"));
				containersItem.setImage(_ctx.stringValue("ListWebApplicationsResponse.Data.WebApplicationWithInstanceCount["+ i +"].WebApplication.RevisionConfig.Containers["+ j +"].Image"));
				containersItem.setPort(_ctx.integerValue("ListWebApplicationsResponse.Data.WebApplicationWithInstanceCount["+ i +"].WebApplication.RevisionConfig.Containers["+ j +"].Port"));
				containersItem.setRequestConcurrency(_ctx.integerValue("ListWebApplicationsResponse.Data.WebApplicationWithInstanceCount["+ i +"].WebApplication.RevisionConfig.Containers["+ j +"].RequestConcurrency"));
				containersItem.setRequestTimeout(_ctx.integerValue("ListWebApplicationsResponse.Data.WebApplicationWithInstanceCount["+ i +"].WebApplication.RevisionConfig.Containers["+ j +"].RequestTimeout"));

				WebNASConfig webNASConfig = new WebNASConfig();

				List<Item> mountPoints = new ArrayList<Item>();
				for (int k = 0; k < _ctx.lengthValue("ListWebApplicationsResponse.Data.WebApplicationWithInstanceCount["+ i +"].WebApplication.RevisionConfig.Containers["+ j +"].WebNASConfig.MountPoints.Length"); k++) {
					Item item = new Item();
					item.setMountDir(_ctx.stringValue("ListWebApplicationsResponse.Data.WebApplicationWithInstanceCount["+ i +"].WebApplication.RevisionConfig.Containers["+ j +"].WebNASConfig.MountPoints["+ k +"].MountDir"));
					item.setNasAddr(_ctx.stringValue("ListWebApplicationsResponse.Data.WebApplicationWithInstanceCount["+ i +"].WebApplication.RevisionConfig.Containers["+ j +"].WebNASConfig.MountPoints["+ k +"].NasAddr"));
					item.setNasPath(_ctx.stringValue("ListWebApplicationsResponse.Data.WebApplicationWithInstanceCount["+ i +"].WebApplication.RevisionConfig.Containers["+ j +"].WebNASConfig.MountPoints["+ k +"].NasPath"));

					mountPoints.add(item);
				}
				webNASConfig.setMountPoints(mountPoints);
				containersItem.setWebNASConfig(webNASConfig);

				WebOSSConfig webOSSConfig = new WebOSSConfig();

				List<Item2> mountPoints1 = new ArrayList<Item2>();
				for (int k = 0; k < _ctx.lengthValue("ListWebApplicationsResponse.Data.WebApplicationWithInstanceCount["+ i +"].WebApplication.RevisionConfig.Containers["+ j +"].WebOSSConfig.MountPoints.Length"); k++) {
					Item2 item2 = new Item2();
					item2.setBucketName(_ctx.stringValue("ListWebApplicationsResponse.Data.WebApplicationWithInstanceCount["+ i +"].WebApplication.RevisionConfig.Containers["+ j +"].WebOSSConfig.MountPoints["+ k +"].BucketName"));
					item2.setBucketPath(_ctx.stringValue("ListWebApplicationsResponse.Data.WebApplicationWithInstanceCount["+ i +"].WebApplication.RevisionConfig.Containers["+ j +"].WebOSSConfig.MountPoints["+ k +"].BucketPath"));
					item2.setMountDir(_ctx.stringValue("ListWebApplicationsResponse.Data.WebApplicationWithInstanceCount["+ i +"].WebApplication.RevisionConfig.Containers["+ j +"].WebOSSConfig.MountPoints["+ k +"].MountDir"));
					item2.setReadOnly(_ctx.booleanValue("ListWebApplicationsResponse.Data.WebApplicationWithInstanceCount["+ i +"].WebApplication.RevisionConfig.Containers["+ j +"].WebOSSConfig.MountPoints["+ k +"].ReadOnly"));

					mountPoints1.add(item2);
				}
				webOSSConfig.setMountPoints1(mountPoints1);
				containersItem.setWebOSSConfig(webOSSConfig);

				Resources resources = new Resources();
				resources.setCpu(_ctx.integerValue("ListWebApplicationsResponse.Data.WebApplicationWithInstanceCount["+ i +"].WebApplication.RevisionConfig.Containers["+ j +"].Resources.Cpu"));
				resources.setMemory(_ctx.integerValue("ListWebApplicationsResponse.Data.WebApplicationWithInstanceCount["+ i +"].WebApplication.RevisionConfig.Containers["+ j +"].Resources.Memory"));
				containersItem.setResources(resources);

				StartupProbe startupProbe = new StartupProbe();
				startupProbe.setFailureThreshold(_ctx.integerValue("ListWebApplicationsResponse.Data.WebApplicationWithInstanceCount["+ i +"].WebApplication.RevisionConfig.Containers["+ j +"].StartupProbe.FailureThreshold"));
				startupProbe.setInitialDelaySeconds(_ctx.integerValue("ListWebApplicationsResponse.Data.WebApplicationWithInstanceCount["+ i +"].WebApplication.RevisionConfig.Containers["+ j +"].StartupProbe.InitialDelaySeconds"));
				startupProbe.setPeriodSeconds(_ctx.integerValue("ListWebApplicationsResponse.Data.WebApplicationWithInstanceCount["+ i +"].WebApplication.RevisionConfig.Containers["+ j +"].StartupProbe.PeriodSeconds"));
				startupProbe.setTimeoutSeconds(_ctx.integerValue("ListWebApplicationsResponse.Data.WebApplicationWithInstanceCount["+ i +"].WebApplication.RevisionConfig.Containers["+ j +"].StartupProbe.TimeoutSeconds"));

				ProbeHandler probeHandler = new ProbeHandler();

				HttpGet httpGet = new HttpGet();
				httpGet.setHost(_ctx.stringValue("ListWebApplicationsResponse.Data.WebApplicationWithInstanceCount["+ i +"].WebApplication.RevisionConfig.Containers["+ j +"].StartupProbe.ProbeHandler.HttpGet.Host"));
				httpGet.setPath(_ctx.stringValue("ListWebApplicationsResponse.Data.WebApplicationWithInstanceCount["+ i +"].WebApplication.RevisionConfig.Containers["+ j +"].StartupProbe.ProbeHandler.HttpGet.Path"));
				httpGet.setPort(_ctx.integerValue("ListWebApplicationsResponse.Data.WebApplicationWithInstanceCount["+ i +"].WebApplication.RevisionConfig.Containers["+ j +"].StartupProbe.ProbeHandler.HttpGet.Port"));
				httpGet.setScheme(_ctx.stringValue("ListWebApplicationsResponse.Data.WebApplicationWithInstanceCount["+ i +"].WebApplication.RevisionConfig.Containers["+ j +"].StartupProbe.ProbeHandler.HttpGet.Scheme"));

				List<HttpHeadersItem> httpHeaders = new ArrayList<HttpHeadersItem>();
				for (int k = 0; k < _ctx.lengthValue("ListWebApplicationsResponse.Data.WebApplicationWithInstanceCount["+ i +"].WebApplication.RevisionConfig.Containers["+ j +"].StartupProbe.ProbeHandler.HttpGet.HttpHeaders.Length"); k++) {
					HttpHeadersItem httpHeadersItem = new HttpHeadersItem();
					httpHeadersItem.setName(_ctx.stringValue("ListWebApplicationsResponse.Data.WebApplicationWithInstanceCount["+ i +"].WebApplication.RevisionConfig.Containers["+ j +"].StartupProbe.ProbeHandler.HttpGet.HttpHeaders["+ k +"].name"));
					httpHeadersItem.setValue(_ctx.stringValue("ListWebApplicationsResponse.Data.WebApplicationWithInstanceCount["+ i +"].WebApplication.RevisionConfig.Containers["+ j +"].StartupProbe.ProbeHandler.HttpGet.HttpHeaders["+ k +"].value"));

					httpHeaders.add(httpHeadersItem);
				}
				httpGet.setHttpHeaders(httpHeaders);
				probeHandler.setHttpGet(httpGet);

				TcpSocket tcpSocket = new TcpSocket();
				tcpSocket.setHost(_ctx.stringValue("ListWebApplicationsResponse.Data.WebApplicationWithInstanceCount["+ i +"].WebApplication.RevisionConfig.Containers["+ j +"].StartupProbe.ProbeHandler.TcpSocket.Host"));
				tcpSocket.setPort(_ctx.integerValue("ListWebApplicationsResponse.Data.WebApplicationWithInstanceCount["+ i +"].WebApplication.RevisionConfig.Containers["+ j +"].StartupProbe.ProbeHandler.TcpSocket.Port"));
				probeHandler.setTcpSocket(tcpSocket);
				startupProbe.setProbeHandler(probeHandler);
				containersItem.setStartupProbe(startupProbe);

				SLSCollectConfigs sLSCollectConfigs = new SLSCollectConfigs();

				List<CollectConfigsItem> collectConfigs = new ArrayList<CollectConfigsItem>();
				for (int k = 0; k < _ctx.lengthValue("ListWebApplicationsResponse.Data.WebApplicationWithInstanceCount["+ i +"].WebApplication.RevisionConfig.Containers["+ j +"].SLSCollectConfigs.CollectConfigs.Length"); k++) {
					CollectConfigsItem collectConfigsItem = new CollectConfigsItem();
					collectConfigsItem.setLogPath(_ctx.stringValue("ListWebApplicationsResponse.Data.WebApplicationWithInstanceCount["+ i +"].WebApplication.RevisionConfig.Containers["+ j +"].SLSCollectConfigs.CollectConfigs["+ k +"].LogPath"));
					collectConfigsItem.setLogType(_ctx.stringValue("ListWebApplicationsResponse.Data.WebApplicationWithInstanceCount["+ i +"].WebApplication.RevisionConfig.Containers["+ j +"].SLSCollectConfigs.CollectConfigs["+ k +"].LogType"));
					collectConfigsItem.setLogstoreName(_ctx.stringValue("ListWebApplicationsResponse.Data.WebApplicationWithInstanceCount["+ i +"].WebApplication.RevisionConfig.Containers["+ j +"].SLSCollectConfigs.CollectConfigs["+ k +"].LogstoreName"));
					collectConfigsItem.setLogtailName(_ctx.stringValue("ListWebApplicationsResponse.Data.WebApplicationWithInstanceCount["+ i +"].WebApplication.RevisionConfig.Containers["+ j +"].SLSCollectConfigs.CollectConfigs["+ k +"].LogtailName"));
					collectConfigsItem.setMachineGroup(_ctx.stringValue("ListWebApplicationsResponse.Data.WebApplicationWithInstanceCount["+ i +"].WebApplication.RevisionConfig.Containers["+ j +"].SLSCollectConfigs.CollectConfigs["+ k +"].MachineGroup"));
					collectConfigsItem.setProjectName(_ctx.stringValue("ListWebApplicationsResponse.Data.WebApplicationWithInstanceCount["+ i +"].WebApplication.RevisionConfig.Containers["+ j +"].SLSCollectConfigs.CollectConfigs["+ k +"].ProjectName"));

					collectConfigs.add(collectConfigsItem);
				}
				sLSCollectConfigs.setCollectConfigs(collectConfigs);
				containersItem.setSLSCollectConfigs(sLSCollectConfigs);

				MetricsCollectConfig metricsCollectConfig = new MetricsCollectConfig();
				metricsCollectConfig.setLogstoreName(_ctx.stringValue("ListWebApplicationsResponse.Data.WebApplicationWithInstanceCount["+ i +"].WebApplication.RevisionConfig.Containers["+ j +"].MetricsCollectConfig.LogstoreName"));
				metricsCollectConfig.setProjectName(_ctx.stringValue("ListWebApplicationsResponse.Data.WebApplicationWithInstanceCount["+ i +"].WebApplication.RevisionConfig.Containers["+ j +"].MetricsCollectConfig.ProjectName"));
				metricsCollectConfig.setEnablePushToUserSLS(_ctx.booleanValue("ListWebApplicationsResponse.Data.WebApplicationWithInstanceCount["+ i +"].WebApplication.RevisionConfig.Containers["+ j +"].MetricsCollectConfig.EnablePushToUserSLS"));
				containersItem.setMetricsCollectConfig(metricsCollectConfig);

				containers.add(containersItem);
			}
			revisionConfig.setContainers(containers);
			webApplication.setRevisionConfig(revisionConfig);

			WebScalingConfig webScalingConfig = new WebScalingConfig();
			webScalingConfig.setMaximumInstanceCount(_ctx.longValue("ListWebApplicationsResponse.Data.WebApplicationWithInstanceCount["+ i +"].WebApplication.WebScalingConfig.MaximumInstanceCount"));
			webScalingConfig.setMinimumInstanceCount(_ctx.longValue("ListWebApplicationsResponse.Data.WebApplicationWithInstanceCount["+ i +"].WebApplication.WebScalingConfig.MinimumInstanceCount"));
			webApplication.setWebScalingConfig(webScalingConfig);

			WebTrafficConfig webTrafficConfig = new WebTrafficConfig();
			webTrafficConfig.setAuthType(_ctx.stringValue("ListWebApplicationsResponse.Data.WebApplicationWithInstanceCount["+ i +"].WebApplication.WebTrafficConfig.AuthType"));
			webTrafficConfig.setDisableInternetURL(_ctx.booleanValue("ListWebApplicationsResponse.Data.WebApplicationWithInstanceCount["+ i +"].WebApplication.WebTrafficConfig.DisableInternetURL"));
			webTrafficConfig.setRevisionsTrafficWeight(_ctx.mapValue("ListWebApplicationsResponse.Data.WebApplicationWithInstanceCount["+ i +"].WebApplication.WebTrafficConfig.RevisionsTrafficWeight"));

			WebAclConfig webAclConfig = new WebAclConfig();
			webAclConfig.setAclDescription(_ctx.stringValue("ListWebApplicationsResponse.Data.WebApplicationWithInstanceCount["+ i +"].WebApplication.WebTrafficConfig.WebAclConfig.AclDescription"));

			List<WebAclEntriesItem> webAclEntries = new ArrayList<WebAclEntriesItem>();
			for (int j = 0; j < _ctx.lengthValue("ListWebApplicationsResponse.Data.WebApplicationWithInstanceCount["+ i +"].WebApplication.WebTrafficConfig.WebAclConfig.WebAclEntries.Length"); j++) {
				WebAclEntriesItem webAclEntriesItem = new WebAclEntriesItem();
				webAclEntriesItem.setEntry(_ctx.stringValue("ListWebApplicationsResponse.Data.WebApplicationWithInstanceCount["+ i +"].WebApplication.WebTrafficConfig.WebAclConfig.WebAclEntries["+ j +"].Entry"));
				webAclEntriesItem.setDescription(_ctx.stringValue("ListWebApplicationsResponse.Data.WebApplicationWithInstanceCount["+ i +"].WebApplication.WebTrafficConfig.WebAclConfig.WebAclEntries["+ j +"].Description"));

				webAclEntries.add(webAclEntriesItem);
			}
			webAclConfig.setWebAclEntries(webAclEntries);
			webTrafficConfig.setWebAclConfig(webAclConfig);
			webApplication.setWebTrafficConfig(webTrafficConfig);
			webApplicationWithInstanceCountItem.setWebApplication(webApplication);

			webApplicationWithInstanceCount.add(webApplicationWithInstanceCountItem);
		}
		data.setWebApplicationWithInstanceCount(webApplicationWithInstanceCount);
		listWebApplicationsResponse.setData(data);
	 
	 	return listWebApplicationsResponse;
	}
}