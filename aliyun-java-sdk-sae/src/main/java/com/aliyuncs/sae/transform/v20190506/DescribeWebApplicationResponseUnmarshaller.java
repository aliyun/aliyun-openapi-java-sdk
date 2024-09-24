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

import com.aliyuncs.sae.model.v20190506.DescribeWebApplicationResponse;
import com.aliyuncs.sae.model.v20190506.DescribeWebApplicationResponse.Data;
import com.aliyuncs.sae.model.v20190506.DescribeWebApplicationResponse.Data.RevisionConfig;
import com.aliyuncs.sae.model.v20190506.DescribeWebApplicationResponse.Data.RevisionConfig.ContainersItem;
import com.aliyuncs.sae.model.v20190506.DescribeWebApplicationResponse.Data.RevisionConfig.ContainersItem.MetricsCollectConfig;
import com.aliyuncs.sae.model.v20190506.DescribeWebApplicationResponse.Data.RevisionConfig.ContainersItem.Resources;
import com.aliyuncs.sae.model.v20190506.DescribeWebApplicationResponse.Data.RevisionConfig.ContainersItem.SLSCollectConfigs;
import com.aliyuncs.sae.model.v20190506.DescribeWebApplicationResponse.Data.RevisionConfig.ContainersItem.SLSCollectConfigs.CollectConfigsItem;
import com.aliyuncs.sae.model.v20190506.DescribeWebApplicationResponse.Data.RevisionConfig.ContainersItem.StartupProbe;
import com.aliyuncs.sae.model.v20190506.DescribeWebApplicationResponse.Data.RevisionConfig.ContainersItem.StartupProbe.ProbeHandler;
import com.aliyuncs.sae.model.v20190506.DescribeWebApplicationResponse.Data.RevisionConfig.ContainersItem.StartupProbe.ProbeHandler.HttpGet;
import com.aliyuncs.sae.model.v20190506.DescribeWebApplicationResponse.Data.RevisionConfig.ContainersItem.StartupProbe.ProbeHandler.HttpGet.HttpHeadersItem;
import com.aliyuncs.sae.model.v20190506.DescribeWebApplicationResponse.Data.RevisionConfig.ContainersItem.StartupProbe.ProbeHandler.TcpSocket;
import com.aliyuncs.sae.model.v20190506.DescribeWebApplicationResponse.Data.RevisionConfig.ContainersItem.WebNASConfig;
import com.aliyuncs.sae.model.v20190506.DescribeWebApplicationResponse.Data.RevisionConfig.ContainersItem.WebNASConfig.Item;
import com.aliyuncs.sae.model.v20190506.DescribeWebApplicationResponse.Data.RevisionConfig.ContainersItem.WebOSSConfig;
import com.aliyuncs.sae.model.v20190506.DescribeWebApplicationResponse.Data.RevisionConfig.ContainersItem.WebOSSConfig.Item2;
import com.aliyuncs.sae.model.v20190506.DescribeWebApplicationResponse.Data.RevisionConfig.WebNetworkConfig;
import com.aliyuncs.sae.model.v20190506.DescribeWebApplicationResponse.Data.WebScalingConfig;
import com.aliyuncs.sae.model.v20190506.DescribeWebApplicationResponse.Data.WebTrafficConfig;
import com.aliyuncs.sae.model.v20190506.DescribeWebApplicationResponse.Data.WebTrafficConfig.WebAclConfig;
import com.aliyuncs.sae.model.v20190506.DescribeWebApplicationResponse.Data.WebTrafficConfig.WebAclConfig.WebAclEntriesItem;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeWebApplicationResponseUnmarshaller {

	public static DescribeWebApplicationResponse unmarshall(DescribeWebApplicationResponse describeWebApplicationResponse, UnmarshallerContext _ctx) {
		
		describeWebApplicationResponse.setRequestId(_ctx.stringValue("DescribeWebApplicationResponse.RequestId"));
		describeWebApplicationResponse.setCode(_ctx.integerValue("DescribeWebApplicationResponse.Code"));
		describeWebApplicationResponse.setMessage(_ctx.stringValue("DescribeWebApplicationResponse.Message"));
		describeWebApplicationResponse.setSuccess(_ctx.booleanValue("DescribeWebApplicationResponse.Success"));

		Data data = new Data();
		data.setApplicationId(_ctx.stringValue("DescribeWebApplicationResponse.Data.ApplicationId"));
		data.setApplicationName(_ctx.stringValue("DescribeWebApplicationResponse.Data.ApplicationName"));
		data.setCreatedTime(_ctx.stringValue("DescribeWebApplicationResponse.Data.CreatedTime"));
		data.setDescription(_ctx.stringValue("DescribeWebApplicationResponse.Data.Description"));
		data.setLastModifiedTime(_ctx.stringValue("DescribeWebApplicationResponse.Data.LastModifiedTime"));
		data.setNamespaceId(_ctx.stringValue("DescribeWebApplicationResponse.Data.NamespaceId"));
		data.setInternetURL(_ctx.stringValue("DescribeWebApplicationResponse.Data.InternetURL"));
		data.setIntranetURL(_ctx.stringValue("DescribeWebApplicationResponse.Data.IntranetURL"));
		data.setVpcId(_ctx.stringValue("DescribeWebApplicationResponse.Data.VpcId"));

		RevisionConfig revisionConfig = new RevisionConfig();
		revisionConfig.setEnableArmsMetrics(_ctx.booleanValue("DescribeWebApplicationResponse.Data.RevisionConfig.EnableArmsMetrics"));

		WebNetworkConfig webNetworkConfig = new WebNetworkConfig();
		webNetworkConfig.setInternetAccess(_ctx.booleanValue("DescribeWebApplicationResponse.Data.RevisionConfig.WebNetworkConfig.InternetAccess"));
		webNetworkConfig.setSecurityGroupId(_ctx.stringValue("DescribeWebApplicationResponse.Data.RevisionConfig.WebNetworkConfig.SecurityGroupId"));

		List<String> vSwitchIds = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeWebApplicationResponse.Data.RevisionConfig.WebNetworkConfig.VSwitchIds.Length"); i++) {
			vSwitchIds.add(_ctx.stringValue("DescribeWebApplicationResponse.Data.RevisionConfig.WebNetworkConfig.VSwitchIds["+ i +"]"));
		}
		webNetworkConfig.setVSwitchIds(vSwitchIds);
		revisionConfig.setWebNetworkConfig(webNetworkConfig);

		List<ContainersItem> containers = new ArrayList<ContainersItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeWebApplicationResponse.Data.RevisionConfig.Containers.Length"); i++) {
			ContainersItem containersItem = new ContainersItem();
			containersItem.setArgs(_ctx.stringValue("DescribeWebApplicationResponse.Data.RevisionConfig.Containers["+ i +"].Args"));
			containersItem.setCommand(_ctx.stringValue("DescribeWebApplicationResponse.Data.RevisionConfig.Containers["+ i +"].Command"));
			containersItem.setEnvironmentVariables(_ctx.mapValue("DescribeWebApplicationResponse.Data.RevisionConfig.Containers["+ i +"].EnvironmentVariables"));
			containersItem.setImage(_ctx.stringValue("DescribeWebApplicationResponse.Data.RevisionConfig.Containers["+ i +"].Image"));
			containersItem.setPort(_ctx.integerValue("DescribeWebApplicationResponse.Data.RevisionConfig.Containers["+ i +"].Port"));
			containersItem.setRequestConcurrency(_ctx.integerValue("DescribeWebApplicationResponse.Data.RevisionConfig.Containers["+ i +"].RequestConcurrency"));
			containersItem.setRequestTimeout(_ctx.integerValue("DescribeWebApplicationResponse.Data.RevisionConfig.Containers["+ i +"].RequestTimeout"));

			WebNASConfig webNASConfig = new WebNASConfig();

			List<Item> mountPoints = new ArrayList<Item>();
			for (int j = 0; j < _ctx.lengthValue("DescribeWebApplicationResponse.Data.RevisionConfig.Containers["+ i +"].WebNASConfig.MountPoints.Length"); j++) {
				Item item = new Item();
				item.setMountDir(_ctx.stringValue("DescribeWebApplicationResponse.Data.RevisionConfig.Containers["+ i +"].WebNASConfig.MountPoints["+ j +"].MountDir"));
				item.setNasAddr(_ctx.stringValue("DescribeWebApplicationResponse.Data.RevisionConfig.Containers["+ i +"].WebNASConfig.MountPoints["+ j +"].NasAddr"));
				item.setNasPath(_ctx.stringValue("DescribeWebApplicationResponse.Data.RevisionConfig.Containers["+ i +"].WebNASConfig.MountPoints["+ j +"].NasPath"));

				mountPoints.add(item);
			}
			webNASConfig.setMountPoints(mountPoints);
			containersItem.setWebNASConfig(webNASConfig);

			WebOSSConfig webOSSConfig = new WebOSSConfig();

			List<Item2> mountPoints1 = new ArrayList<Item2>();
			for (int j = 0; j < _ctx.lengthValue("DescribeWebApplicationResponse.Data.RevisionConfig.Containers["+ i +"].WebOSSConfig.MountPoints.Length"); j++) {
				Item2 item2 = new Item2();
				item2.setBucketName(_ctx.stringValue("DescribeWebApplicationResponse.Data.RevisionConfig.Containers["+ i +"].WebOSSConfig.MountPoints["+ j +"].BucketName"));
				item2.setBucketPath(_ctx.stringValue("DescribeWebApplicationResponse.Data.RevisionConfig.Containers["+ i +"].WebOSSConfig.MountPoints["+ j +"].BucketPath"));
				item2.setMountDir(_ctx.stringValue("DescribeWebApplicationResponse.Data.RevisionConfig.Containers["+ i +"].WebOSSConfig.MountPoints["+ j +"].MountDir"));
				item2.setReadOnly(_ctx.booleanValue("DescribeWebApplicationResponse.Data.RevisionConfig.Containers["+ i +"].WebOSSConfig.MountPoints["+ j +"].ReadOnly"));

				mountPoints1.add(item2);
			}
			webOSSConfig.setMountPoints1(mountPoints1);
			containersItem.setWebOSSConfig(webOSSConfig);

			Resources resources = new Resources();
			resources.setCpu(_ctx.integerValue("DescribeWebApplicationResponse.Data.RevisionConfig.Containers["+ i +"].Resources.Cpu"));
			resources.setMemory(_ctx.integerValue("DescribeWebApplicationResponse.Data.RevisionConfig.Containers["+ i +"].Resources.Memory"));
			containersItem.setResources(resources);

			StartupProbe startupProbe = new StartupProbe();
			startupProbe.setFailureThreshold(_ctx.integerValue("DescribeWebApplicationResponse.Data.RevisionConfig.Containers["+ i +"].StartupProbe.FailureThreshold"));
			startupProbe.setInitialDelaySeconds(_ctx.integerValue("DescribeWebApplicationResponse.Data.RevisionConfig.Containers["+ i +"].StartupProbe.InitialDelaySeconds"));
			startupProbe.setPeriodSeconds(_ctx.integerValue("DescribeWebApplicationResponse.Data.RevisionConfig.Containers["+ i +"].StartupProbe.PeriodSeconds"));
			startupProbe.setTimeoutSeconds(_ctx.integerValue("DescribeWebApplicationResponse.Data.RevisionConfig.Containers["+ i +"].StartupProbe.TimeoutSeconds"));

			ProbeHandler probeHandler = new ProbeHandler();

			HttpGet httpGet = new HttpGet();
			httpGet.setHost(_ctx.stringValue("DescribeWebApplicationResponse.Data.RevisionConfig.Containers["+ i +"].StartupProbe.ProbeHandler.HttpGet.Host"));
			httpGet.setPath(_ctx.stringValue("DescribeWebApplicationResponse.Data.RevisionConfig.Containers["+ i +"].StartupProbe.ProbeHandler.HttpGet.Path"));
			httpGet.setPort(_ctx.integerValue("DescribeWebApplicationResponse.Data.RevisionConfig.Containers["+ i +"].StartupProbe.ProbeHandler.HttpGet.Port"));
			httpGet.setScheme(_ctx.stringValue("DescribeWebApplicationResponse.Data.RevisionConfig.Containers["+ i +"].StartupProbe.ProbeHandler.HttpGet.Scheme"));

			List<HttpHeadersItem> httpHeaders = new ArrayList<HttpHeadersItem>();
			for (int j = 0; j < _ctx.lengthValue("DescribeWebApplicationResponse.Data.RevisionConfig.Containers["+ i +"].StartupProbe.ProbeHandler.HttpGet.HttpHeaders.Length"); j++) {
				HttpHeadersItem httpHeadersItem = new HttpHeadersItem();
				httpHeadersItem.setName(_ctx.stringValue("DescribeWebApplicationResponse.Data.RevisionConfig.Containers["+ i +"].StartupProbe.ProbeHandler.HttpGet.HttpHeaders["+ j +"].name"));
				httpHeadersItem.setValue(_ctx.stringValue("DescribeWebApplicationResponse.Data.RevisionConfig.Containers["+ i +"].StartupProbe.ProbeHandler.HttpGet.HttpHeaders["+ j +"].value"));

				httpHeaders.add(httpHeadersItem);
			}
			httpGet.setHttpHeaders(httpHeaders);
			probeHandler.setHttpGet(httpGet);

			TcpSocket tcpSocket = new TcpSocket();
			tcpSocket.setHost(_ctx.stringValue("DescribeWebApplicationResponse.Data.RevisionConfig.Containers["+ i +"].StartupProbe.ProbeHandler.TcpSocket.Host"));
			tcpSocket.setPort(_ctx.integerValue("DescribeWebApplicationResponse.Data.RevisionConfig.Containers["+ i +"].StartupProbe.ProbeHandler.TcpSocket.Port"));
			probeHandler.setTcpSocket(tcpSocket);
			startupProbe.setProbeHandler(probeHandler);
			containersItem.setStartupProbe(startupProbe);

			SLSCollectConfigs sLSCollectConfigs = new SLSCollectConfigs();

			List<CollectConfigsItem> collectConfigs = new ArrayList<CollectConfigsItem>();
			for (int j = 0; j < _ctx.lengthValue("DescribeWebApplicationResponse.Data.RevisionConfig.Containers["+ i +"].SLSCollectConfigs.CollectConfigs.Length"); j++) {
				CollectConfigsItem collectConfigsItem = new CollectConfigsItem();
				collectConfigsItem.setLogPath(_ctx.stringValue("DescribeWebApplicationResponse.Data.RevisionConfig.Containers["+ i +"].SLSCollectConfigs.CollectConfigs["+ j +"].LogPath"));
				collectConfigsItem.setLogType(_ctx.stringValue("DescribeWebApplicationResponse.Data.RevisionConfig.Containers["+ i +"].SLSCollectConfigs.CollectConfigs["+ j +"].LogType"));
				collectConfigsItem.setLogstoreName(_ctx.stringValue("DescribeWebApplicationResponse.Data.RevisionConfig.Containers["+ i +"].SLSCollectConfigs.CollectConfigs["+ j +"].LogstoreName"));
				collectConfigsItem.setLogtailName(_ctx.stringValue("DescribeWebApplicationResponse.Data.RevisionConfig.Containers["+ i +"].SLSCollectConfigs.CollectConfigs["+ j +"].LogtailName"));
				collectConfigsItem.setMachineGroup(_ctx.stringValue("DescribeWebApplicationResponse.Data.RevisionConfig.Containers["+ i +"].SLSCollectConfigs.CollectConfigs["+ j +"].MachineGroup"));
				collectConfigsItem.setProjectName(_ctx.stringValue("DescribeWebApplicationResponse.Data.RevisionConfig.Containers["+ i +"].SLSCollectConfigs.CollectConfigs["+ j +"].ProjectName"));

				collectConfigs.add(collectConfigsItem);
			}
			sLSCollectConfigs.setCollectConfigs(collectConfigs);
			containersItem.setSLSCollectConfigs(sLSCollectConfigs);

			MetricsCollectConfig metricsCollectConfig = new MetricsCollectConfig();
			metricsCollectConfig.setLogstoreName(_ctx.stringValue("DescribeWebApplicationResponse.Data.RevisionConfig.Containers["+ i +"].MetricsCollectConfig.LogstoreName"));
			metricsCollectConfig.setProjectName(_ctx.stringValue("DescribeWebApplicationResponse.Data.RevisionConfig.Containers["+ i +"].MetricsCollectConfig.ProjectName"));
			metricsCollectConfig.setEnablePushToUserSLS(_ctx.booleanValue("DescribeWebApplicationResponse.Data.RevisionConfig.Containers["+ i +"].MetricsCollectConfig.EnablePushToUserSLS"));
			containersItem.setMetricsCollectConfig(metricsCollectConfig);

			containers.add(containersItem);
		}
		revisionConfig.setContainers(containers);
		data.setRevisionConfig(revisionConfig);

		WebScalingConfig webScalingConfig = new WebScalingConfig();
		webScalingConfig.setMaximumInstanceCount(_ctx.longValue("DescribeWebApplicationResponse.Data.WebScalingConfig.MaximumInstanceCount"));
		webScalingConfig.setMinimumInstanceCount(_ctx.longValue("DescribeWebApplicationResponse.Data.WebScalingConfig.MinimumInstanceCount"));
		data.setWebScalingConfig(webScalingConfig);

		WebTrafficConfig webTrafficConfig = new WebTrafficConfig();
		webTrafficConfig.setAuthType(_ctx.stringValue("DescribeWebApplicationResponse.Data.WebTrafficConfig.AuthType"));
		webTrafficConfig.setDisableInternetURL(_ctx.booleanValue("DescribeWebApplicationResponse.Data.WebTrafficConfig.DisableInternetURL"));
		webTrafficConfig.setRevisionsTrafficWeight(_ctx.mapValue("DescribeWebApplicationResponse.Data.WebTrafficConfig.RevisionsTrafficWeight"));

		WebAclConfig webAclConfig = new WebAclConfig();
		webAclConfig.setAclDescription(_ctx.stringValue("DescribeWebApplicationResponse.Data.WebTrafficConfig.WebAclConfig.AclDescription"));

		List<WebAclEntriesItem> webAclEntries = new ArrayList<WebAclEntriesItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeWebApplicationResponse.Data.WebTrafficConfig.WebAclConfig.WebAclEntries.Length"); i++) {
			WebAclEntriesItem webAclEntriesItem = new WebAclEntriesItem();
			webAclEntriesItem.setEntry(_ctx.stringValue("DescribeWebApplicationResponse.Data.WebTrafficConfig.WebAclConfig.WebAclEntries["+ i +"].Entry"));
			webAclEntriesItem.setDescription(_ctx.stringValue("DescribeWebApplicationResponse.Data.WebTrafficConfig.WebAclConfig.WebAclEntries["+ i +"].Description"));

			webAclEntries.add(webAclEntriesItem);
		}
		webAclConfig.setWebAclEntries(webAclEntries);
		webTrafficConfig.setWebAclConfig(webAclConfig);
		data.setWebTrafficConfig(webTrafficConfig);
		describeWebApplicationResponse.setData(data);
	 
	 	return describeWebApplicationResponse;
	}
}