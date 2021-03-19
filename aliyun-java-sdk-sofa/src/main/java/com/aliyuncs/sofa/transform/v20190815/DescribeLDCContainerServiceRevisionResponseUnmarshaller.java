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

package com.aliyuncs.sofa.transform.v20190815;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sofa.model.v20190815.DescribeLDCContainerServiceRevisionResponse;
import com.aliyuncs.sofa.model.v20190815.DescribeLDCContainerServiceRevisionResponse.Revision;
import com.aliyuncs.sofa.model.v20190815.DescribeLDCContainerServiceRevisionResponse.Revision.AppInfo;
import com.aliyuncs.sofa.model.v20190815.DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig;
import com.aliyuncs.sofa.model.v20190815.DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.ClusterIpServicesItem;
import com.aliyuncs.sofa.model.v20190815.DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.ClusterIpServicesItem.PortsItem;
import com.aliyuncs.sofa.model.v20190815.DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.ContainerSpecsItem;
import com.aliyuncs.sofa.model.v20190815.DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.ContainerSpecsItem.EnvOverridesItem;
import com.aliyuncs.sofa.model.v20190815.DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.ContainerSpecsItem.EnvsItem;
import com.aliyuncs.sofa.model.v20190815.DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.ContainerSpecsItem.EnvsItem.ValueFrom;
import com.aliyuncs.sofa.model.v20190815.DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.ContainerSpecsItem.HealthCheckConfig;
import com.aliyuncs.sofa.model.v20190815.DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.ContainerSpecsItem.HealthCheckConfig.LivenessProbe;
import com.aliyuncs.sofa.model.v20190815.DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.ContainerSpecsItem.HealthCheckConfig.LivenessProbe.ExecAction;
import com.aliyuncs.sofa.model.v20190815.DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.ContainerSpecsItem.HealthCheckConfig.LivenessProbe.HttpGetAction;
import com.aliyuncs.sofa.model.v20190815.DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.ContainerSpecsItem.HealthCheckConfig.LivenessProbe.TcpSocketAction;
import com.aliyuncs.sofa.model.v20190815.DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.ContainerSpecsItem.HealthCheckConfig.ReadinessProbe;
import com.aliyuncs.sofa.model.v20190815.DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.ContainerSpecsItem.HealthCheckConfig.ReadinessProbe.ExecAction1;
import com.aliyuncs.sofa.model.v20190815.DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.ContainerSpecsItem.HealthCheckConfig.ReadinessProbe.HttpGetAction2;
import com.aliyuncs.sofa.model.v20190815.DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.ContainerSpecsItem.HealthCheckConfig.ReadinessProbe.TcpSocketAction3;
import com.aliyuncs.sofa.model.v20190815.DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.ContainerSpecsItem.LifecycleHook;
import com.aliyuncs.sofa.model.v20190815.DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.ContainerSpecsItem.LifecycleHook.PostStartExec;
import com.aliyuncs.sofa.model.v20190815.DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.ContainerSpecsItem.LifecycleHook.PostStartHttp;
import com.aliyuncs.sofa.model.v20190815.DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.ContainerSpecsItem.LifecycleHook.PostStartTcp;
import com.aliyuncs.sofa.model.v20190815.DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.ContainerSpecsItem.LifecycleHook.PreStopExec;
import com.aliyuncs.sofa.model.v20190815.DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.ContainerSpecsItem.LifecycleHook.PreStopHttp;
import com.aliyuncs.sofa.model.v20190815.DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.ContainerSpecsItem.LifecycleHook.PreStopTcp;
import com.aliyuncs.sofa.model.v20190815.DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.ContainerSpecsItem.LogConfigsItem;
import com.aliyuncs.sofa.model.v20190815.DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.ContainerSpecsItem.VolumeMountsItem;
import com.aliyuncs.sofa.model.v20190815.DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.ContainerSpecsItem.VolumeMountsItem.ConfigmapSecretVolumeSource;
import com.aliyuncs.sofa.model.v20190815.DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.ContainerSpecsItem.VolumeMountsItem.EmptyDirVolumeSource;
import com.aliyuncs.sofa.model.v20190815.DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.ContainerSpecsItem.VolumeMountsItem.LocalDiskVolumeSource;
import com.aliyuncs.sofa.model.v20190815.DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.ContainerSpecsItem.VolumeMountsItem.PvcSource;
import com.aliyuncs.sofa.model.v20190815.DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.DeployConfig;
import com.aliyuncs.sofa.model.v20190815.DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.DeployConfig.Affinity;
import com.aliyuncs.sofa.model.v20190815.DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.DeployConfig.Affinity.NodeAffinityItem;
import com.aliyuncs.sofa.model.v20190815.DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.DeployConfig.Affinity.NodeAffinityItem.MatchExpressionsItem;
import com.aliyuncs.sofa.model.v20190815.DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.DeployConfig.Affinity.PodAffinityItem;
import com.aliyuncs.sofa.model.v20190815.DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.DeployConfig.Affinity.PodAffinityItem.PodAffinityTerm;
import com.aliyuncs.sofa.model.v20190815.DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.DeployConfig.Affinity.PodAffinityItem.PodAffinityTerm.LabelSelectorItem;
import com.aliyuncs.sofa.model.v20190815.DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.ElasticConfig;
import com.aliyuncs.sofa.model.v20190815.DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.ElasticConfig.FixedReplica;
import com.aliyuncs.sofa.model.v20190815.DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.ElasticConfig.FixedReplica.ReplicasItem;
import com.aliyuncs.sofa.model.v20190815.DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.ElasticConfig.Hpa;
import com.aliyuncs.sofa.model.v20190815.DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.ElasticConfig.Hpa.CellsItem;
import com.aliyuncs.sofa.model.v20190815.DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.ElasticConfig.Hpa.MetricsItem;
import com.aliyuncs.sofa.model.v20190815.DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.ElasticConfig.Hpa.MetricsItem.Target;
import com.aliyuncs.sofa.model.v20190815.DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.ElasticConfig.Hpa.MetricsItem.Target.Value;
import com.aliyuncs.sofa.model.v20190815.DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.IngressesItem;
import com.aliyuncs.sofa.model.v20190815.DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.IngressesItem.ListenersItem;
import com.aliyuncs.sofa.model.v20190815.DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.IngressesItem.ListenersV2Item;
import com.aliyuncs.sofa.model.v20190815.DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.InnerLoadBalancerServicesItem;
import com.aliyuncs.sofa.model.v20190815.DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.InnerLoadBalancerServicesItem.CellSlbIaasIdMapItem;
import com.aliyuncs.sofa.model.v20190815.DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.InnerLoadBalancerServicesItem.ListenersItem5;
import com.aliyuncs.sofa.model.v20190815.DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.LoadBalancerServicesItem;
import com.aliyuncs.sofa.model.v20190815.DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.LoadBalancerServicesItem.CellSlbIaasIdMapItem13;
import com.aliyuncs.sofa.model.v20190815.DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.LoadBalancerServicesItem.ListenersItem12;
import com.aliyuncs.sofa.model.v20190815.DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.PublicLoadBalancerServicesItem;
import com.aliyuncs.sofa.model.v20190815.DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.PublicLoadBalancerServicesItem.CellSlbIaasIdMapItem9;
import com.aliyuncs.sofa.model.v20190815.DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.PublicLoadBalancerServicesItem.ListenersItem8;
import com.aliyuncs.sofa.model.v20190815.DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.SidecarConfigsItem;
import com.aliyuncs.sofa.model.v20190815.DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceReleaseInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeLDCContainerServiceRevisionResponseUnmarshaller {

	public static DescribeLDCContainerServiceRevisionResponse unmarshall(DescribeLDCContainerServiceRevisionResponse describeLDCContainerServiceRevisionResponse, UnmarshallerContext _ctx) {
		
		describeLDCContainerServiceRevisionResponse.setRequestId(_ctx.stringValue("DescribeLDCContainerServiceRevisionResponse.RequestId"));
		describeLDCContainerServiceRevisionResponse.setResultCode(_ctx.stringValue("DescribeLDCContainerServiceRevisionResponse.ResultCode"));
		describeLDCContainerServiceRevisionResponse.setResultMessage(_ctx.stringValue("DescribeLDCContainerServiceRevisionResponse.ResultMessage"));

		Revision revision = new Revision();
		revision.setContainerServiceName(_ctx.stringValue("DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceName"));
		revision.setCreatedTime(_ctx.stringValue("DescribeLDCContainerServiceRevisionResponse.Revision.CreatedTime"));
		revision.setDeployStatus(_ctx.stringValue("DescribeLDCContainerServiceRevisionResponse.Revision.DeployStatus"));
		revision.setDescription(_ctx.stringValue("DescribeLDCContainerServiceRevisionResponse.Revision.Description"));
		revision.setLastPlanId(_ctx.stringValue("DescribeLDCContainerServiceRevisionResponse.Revision.LastPlanId"));
		revision.setMetaStatus(_ctx.stringValue("DescribeLDCContainerServiceRevisionResponse.Revision.MetaStatus"));
		revision.setModifiedTime(_ctx.stringValue("DescribeLDCContainerServiceRevisionResponse.Revision.ModifiedTime"));
		revision.setNamespace(_ctx.stringValue("DescribeLDCContainerServiceRevisionResponse.Revision.Namespace"));
		revision.setOperator(_ctx.stringValue("DescribeLDCContainerServiceRevisionResponse.Revision.Operator"));
		revision.setRemarks(_ctx.stringValue("DescribeLDCContainerServiceRevisionResponse.Revision.Remarks"));
		revision.setRevision(_ctx.stringValue("DescribeLDCContainerServiceRevisionResponse.Revision.Revision"));

		AppInfo appInfo = new AppInfo();
		appInfo.setBuildpackVersion(_ctx.stringValue("DescribeLDCContainerServiceRevisionResponse.Revision.AppInfo.BuildpackVersion"));
		appInfo.setDescription(_ctx.stringValue("DescribeLDCContainerServiceRevisionResponse.Revision.AppInfo.Description"));
		appInfo.setId(_ctx.stringValue("DescribeLDCContainerServiceRevisionResponse.Revision.AppInfo.Id"));
		appInfo.setName(_ctx.stringValue("DescribeLDCContainerServiceRevisionResponse.Revision.AppInfo.Name"));
		appInfo.setOwner(_ctx.stringValue("DescribeLDCContainerServiceRevisionResponse.Revision.AppInfo.Owner"));
		appInfo.setTechstackIdentity(_ctx.stringValue("DescribeLDCContainerServiceRevisionResponse.Revision.AppInfo.TechstackIdentity"));
		appInfo.setOwnerId(_ctx.stringValue("DescribeLDCContainerServiceRevisionResponse.Revision.AppInfo.OwnerId"));
		revision.setAppInfo(appInfo);

		ContainerServiceConfig containerServiceConfig = new ContainerServiceConfig();
		containerServiceConfig.setEnableBizMonitor(_ctx.booleanValue("DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.EnableBizMonitor"));
		containerServiceConfig.setEnableLogConfig(_ctx.booleanValue("DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.EnableLogConfig"));
		containerServiceConfig.setEnableSofaMesh(_ctx.booleanValue("DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.EnableSofaMesh"));
		containerServiceConfig.setUseHostNetwork(_ctx.booleanValue("DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.UseHostNetwork"));

		List<String> bizMonitorPaths = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.BizMonitorPaths.Length"); i++) {
			bizMonitorPaths.add(_ctx.stringValue("DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.BizMonitorPaths["+ i +"]"));
		}
		containerServiceConfig.setBizMonitorPaths(bizMonitorPaths);

		DeployConfig deployConfig = new DeployConfig();
		deployConfig.setAnnotations(_ctx.stringValue("DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.DeployConfig.Annotations"));
		deployConfig.setCustomLabels(_ctx.stringValue("DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.DeployConfig.CustomLabels"));
		deployConfig.setGroupCount(_ctx.longValue("DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.DeployConfig.GroupCount"));
		deployConfig.setGroupStrategy(_ctx.stringValue("DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.DeployConfig.GroupStrategy"));
		deployConfig.setLabels(_ctx.stringValue("DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.DeployConfig.Labels"));
		deployConfig.setMaxGroupCapacity(_ctx.longValue("DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.DeployConfig.MaxGroupCapacity"));
		deployConfig.setNeedBeta(_ctx.booleanValue("DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.DeployConfig.NeedBeta"));
		deployConfig.setNeedConfirm(_ctx.booleanValue("DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.DeployConfig.NeedConfirm"));
		deployConfig.setEnableSofaMesh(_ctx.booleanValue("DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.DeployConfig.EnableSofaMesh"));

		Affinity affinity = new Affinity();

		List<NodeAffinityItem> nodeAffinity = new ArrayList<NodeAffinityItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.DeployConfig.Affinity.NodeAffinity.Length"); i++) {
			NodeAffinityItem nodeAffinityItem = new NodeAffinityItem();
			nodeAffinityItem.setRequested(_ctx.booleanValue("DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.DeployConfig.Affinity.NodeAffinity["+ i +"].Requested"));
			nodeAffinityItem.setWeight(_ctx.longValue("DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.DeployConfig.Affinity.NodeAffinity["+ i +"].Weight"));

			List<MatchExpressionsItem> matchExpressions = new ArrayList<MatchExpressionsItem>();
			for (int j = 0; j < _ctx.lengthValue("DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.DeployConfig.Affinity.NodeAffinity["+ i +"].MatchExpressions.Length"); j++) {
				MatchExpressionsItem matchExpressionsItem = new MatchExpressionsItem();
				matchExpressionsItem.setKey(_ctx.stringValue("DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.DeployConfig.Affinity.NodeAffinity["+ i +"].MatchExpressions["+ j +"].Key"));
				matchExpressionsItem.setOperator(_ctx.stringValue("DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.DeployConfig.Affinity.NodeAffinity["+ i +"].MatchExpressions["+ j +"].Operator"));

				List<String> values = new ArrayList<String>();
				for (int k = 0; k < _ctx.lengthValue("DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.DeployConfig.Affinity.NodeAffinity["+ i +"].MatchExpressions["+ j +"].Values.Length"); k++) {
					values.add(_ctx.stringValue("DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.DeployConfig.Affinity.NodeAffinity["+ i +"].MatchExpressions["+ j +"].Values["+ k +"]"));
				}
				matchExpressionsItem.setValues(values);

				matchExpressions.add(matchExpressionsItem);
			}
			nodeAffinityItem.setMatchExpressions(matchExpressions);

			nodeAffinity.add(nodeAffinityItem);
		}
		affinity.setNodeAffinity(nodeAffinity);

		List<PodAffinityItem> podAffinity = new ArrayList<PodAffinityItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.DeployConfig.Affinity.PodAffinity.Length"); i++) {
			PodAffinityItem podAffinityItem = new PodAffinityItem();
			podAffinityItem.setAntiAffinity(_ctx.booleanValue("DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.DeployConfig.Affinity.PodAffinity["+ i +"].AntiAffinity"));
			podAffinityItem.setRequested(_ctx.booleanValue("DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.DeployConfig.Affinity.PodAffinity["+ i +"].Requested"));
			podAffinityItem.setWeight(_ctx.longValue("DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.DeployConfig.Affinity.PodAffinity["+ i +"].Weight"));

			PodAffinityTerm podAffinityTerm = new PodAffinityTerm();
			podAffinityTerm.setTopologyKey(_ctx.stringValue("DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.DeployConfig.Affinity.PodAffinity["+ i +"].PodAffinityTerm.TopologyKey"));

			List<String> namespaces = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.DeployConfig.Affinity.PodAffinity["+ i +"].PodAffinityTerm.Namespaces.Length"); j++) {
				namespaces.add(_ctx.stringValue("DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.DeployConfig.Affinity.PodAffinity["+ i +"].PodAffinityTerm.Namespaces["+ j +"]"));
			}
			podAffinityTerm.setNamespaces(namespaces);

			List<LabelSelectorItem> labelSelector = new ArrayList<LabelSelectorItem>();
			for (int j = 0; j < _ctx.lengthValue("DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.DeployConfig.Affinity.PodAffinity["+ i +"].PodAffinityTerm.LabelSelector.Length"); j++) {
				LabelSelectorItem labelSelectorItem = new LabelSelectorItem();
				labelSelectorItem.setKey(_ctx.stringValue("DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.DeployConfig.Affinity.PodAffinity["+ i +"].PodAffinityTerm.LabelSelector["+ j +"].Key"));
				labelSelectorItem.setValue(_ctx.stringValue("DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.DeployConfig.Affinity.PodAffinity["+ i +"].PodAffinityTerm.LabelSelector["+ j +"].Value"));

				labelSelector.add(labelSelectorItem);
			}
			podAffinityTerm.setLabelSelector(labelSelector);
			podAffinityItem.setPodAffinityTerm(podAffinityTerm);

			podAffinity.add(podAffinityItem);
		}
		affinity.setPodAffinity(podAffinity);
		deployConfig.setAffinity(affinity);
		containerServiceConfig.setDeployConfig(deployConfig);

		ElasticConfig elasticConfig = new ElasticConfig();
		elasticConfig.setMode(_ctx.stringValue("DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.ElasticConfig.Mode"));

		FixedReplica fixedReplica = new FixedReplica();

		List<ReplicasItem> replicas = new ArrayList<ReplicasItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.ElasticConfig.FixedReplica.Replicas.Length"); i++) {
			ReplicasItem replicasItem = new ReplicasItem();
			replicasItem.setType(_ctx.stringValue("DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.ElasticConfig.FixedReplica.Replicas["+ i +"].Type"));
			replicasItem.setName(_ctx.stringValue("DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.ElasticConfig.FixedReplica.Replicas["+ i +"].Name"));
			replicasItem.setCount(_ctx.longValue("DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.ElasticConfig.FixedReplica.Replicas["+ i +"].Count"));

			replicas.add(replicasItem);
		}
		fixedReplica.setReplicas(replicas);
		elasticConfig.setFixedReplica(fixedReplica);

		Hpa hpa = new Hpa();
		hpa.setMinReplica(_ctx.longValue("DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.ElasticConfig.Hpa.MinReplica"));
		hpa.setMaxReplica(_ctx.longValue("DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.ElasticConfig.Hpa.MaxReplica"));

		List<CellsItem> cells = new ArrayList<CellsItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.ElasticConfig.Hpa.Cells.Length"); i++) {
			CellsItem cellsItem = new CellsItem();
			cellsItem.setName(_ctx.stringValue("DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.ElasticConfig.Hpa.Cells["+ i +"].Name"));
			cellsItem.setReplicas(_ctx.longValue("DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.ElasticConfig.Hpa.Cells["+ i +"].Replicas"));

			cells.add(cellsItem);
		}
		hpa.setCells(cells);

		List<MetricsItem> metrics = new ArrayList<MetricsItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.ElasticConfig.Hpa.Metrics.Length"); i++) {
			MetricsItem metricsItem = new MetricsItem();
			metricsItem.setName(_ctx.stringValue("DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.ElasticConfig.Hpa.Metrics["+ i +"].Name"));

			Target target = new Target();
			target.setType(_ctx.stringValue("DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.ElasticConfig.Hpa.Metrics["+ i +"].Target.Type"));
			target.setUtilization(_ctx.longValue("DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.ElasticConfig.Hpa.Metrics["+ i +"].Target.Utilization"));

			Value value = new Value();
			value.setValue(_ctx.longValue("DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.ElasticConfig.Hpa.Metrics["+ i +"].Target.Value.Value"));
			value.setUnit(_ctx.stringValue("DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.ElasticConfig.Hpa.Metrics["+ i +"].Target.Value.Unit"));
			target.setValue(value);
			metricsItem.setTarget(target);

			metrics.add(metricsItem);
		}
		hpa.setMetrics(metrics);
		elasticConfig.setHpa(hpa);
		containerServiceConfig.setElasticConfig(elasticConfig);

		List<ClusterIpServicesItem> clusterIpServices = new ArrayList<ClusterIpServicesItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.ClusterIpServices.Length"); i++) {
			ClusterIpServicesItem clusterIpServicesItem = new ClusterIpServicesItem();
			clusterIpServicesItem.setName(_ctx.stringValue("DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.ClusterIpServices["+ i +"].Name"));

			List<PortsItem> ports = new ArrayList<PortsItem>();
			for (int j = 0; j < _ctx.lengthValue("DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.ClusterIpServices["+ i +"].Ports.Length"); j++) {
				PortsItem portsItem = new PortsItem();
				portsItem.setPort(_ctx.longValue("DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.ClusterIpServices["+ i +"].Ports["+ j +"].Port"));
				portsItem.setBizProtocol(_ctx.stringValue("DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.ClusterIpServices["+ i +"].Ports["+ j +"].Protocol"));
				portsItem.setTargetPort(_ctx.longValue("DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.ClusterIpServices["+ i +"].Ports["+ j +"].TargetPort"));

				ports.add(portsItem);
			}
			clusterIpServicesItem.setPorts(ports);

			clusterIpServices.add(clusterIpServicesItem);
		}
		containerServiceConfig.setClusterIpServices(clusterIpServices);

		List<ContainerSpecsItem> containerSpecs = new ArrayList<ContainerSpecsItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.ContainerSpecs.Length"); i++) {
			ContainerSpecsItem containerSpecsItem = new ContainerSpecsItem();
			containerSpecsItem.setCpuLimit(_ctx.stringValue("DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.ContainerSpecs["+ i +"].CpuLimit"));
			containerSpecsItem.setCpuRequest(_ctx.stringValue("DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.ContainerSpecs["+ i +"].CpuRequest"));
			containerSpecsItem.setImage(_ctx.stringValue("DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.ContainerSpecs["+ i +"].Image"));
			containerSpecsItem.setImageBuildName(_ctx.stringValue("DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.ContainerSpecs["+ i +"].ImageBuildName"));
			containerSpecsItem.setImagePullSecret(_ctx.stringValue("DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.ContainerSpecs["+ i +"].ImagePullSecret"));
			containerSpecsItem.setImageSource(_ctx.stringValue("DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.ContainerSpecs["+ i +"].ImageSource"));
			containerSpecsItem.setMemoryLimit(_ctx.stringValue("DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.ContainerSpecs["+ i +"].MemoryLimit"));
			containerSpecsItem.setMemoryRequest(_ctx.stringValue("DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.ContainerSpecs["+ i +"].MemoryRequest"));
			containerSpecsItem.setName(_ctx.stringValue("DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.ContainerSpecs["+ i +"].Name"));
			containerSpecsItem.setRestartPolicy(_ctx.stringValue("DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.ContainerSpecs["+ i +"].RestartPolicy"));
			containerSpecsItem.setType(_ctx.stringValue("DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.ContainerSpecs["+ i +"].Type"));
			containerSpecsItem.setVolumeMountsStr(_ctx.stringValue("DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.ContainerSpecs["+ i +"].VolumeMountsStr"));
			containerSpecsItem.setVolumesStr(_ctx.stringValue("DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.ContainerSpecs["+ i +"].VolumesStr"));

			List<String> entryPoints = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.ContainerSpecs["+ i +"].EntryPoints.Length"); j++) {
				entryPoints.add(_ctx.stringValue("DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.ContainerSpecs["+ i +"].EntryPoints["+ j +"]"));
			}
			containerSpecsItem.setEntryPoints(entryPoints);

			HealthCheckConfig healthCheckConfig = new HealthCheckConfig();

			LivenessProbe livenessProbe = new LivenessProbe();
			livenessProbe.setFailureThreshold(_ctx.longValue("DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.ContainerSpecs["+ i +"].HealthCheckConfig.LivenessProbe.FailureThreshold"));
			livenessProbe.setInitialDelaySeconds(_ctx.longValue("DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.ContainerSpecs["+ i +"].HealthCheckConfig.LivenessProbe.InitialDelaySeconds"));
			livenessProbe.setPeriodSeconds(_ctx.longValue("DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.ContainerSpecs["+ i +"].HealthCheckConfig.LivenessProbe.PeriodSeconds"));
			livenessProbe.setSuccessThreshold(_ctx.longValue("DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.ContainerSpecs["+ i +"].HealthCheckConfig.LivenessProbe.SuccessThreshold"));
			livenessProbe.setTimeOutSeconds(_ctx.longValue("DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.ContainerSpecs["+ i +"].HealthCheckConfig.LivenessProbe.TimeOutSeconds"));

			ExecAction execAction = new ExecAction();
			execAction.setCommand(_ctx.stringValue("DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.ContainerSpecs["+ i +"].HealthCheckConfig.LivenessProbe.ExecAction.Command"));
			livenessProbe.setExecAction(execAction);

			HttpGetAction httpGetAction = new HttpGetAction();
			httpGetAction.setPath(_ctx.stringValue("DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.ContainerSpecs["+ i +"].HealthCheckConfig.LivenessProbe.HttpGetAction.Path"));
			httpGetAction.setPort(_ctx.stringValue("DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.ContainerSpecs["+ i +"].HealthCheckConfig.LivenessProbe.HttpGetAction.Port"));
			httpGetAction.setScheme(_ctx.stringValue("DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.ContainerSpecs["+ i +"].HealthCheckConfig.LivenessProbe.HttpGetAction.Scheme"));
			livenessProbe.setHttpGetAction(httpGetAction);

			TcpSocketAction tcpSocketAction = new TcpSocketAction();
			tcpSocketAction.setPort(_ctx.stringValue("DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.ContainerSpecs["+ i +"].HealthCheckConfig.LivenessProbe.TcpSocketAction.Port"));
			livenessProbe.setTcpSocketAction(tcpSocketAction);
			healthCheckConfig.setLivenessProbe(livenessProbe);

			ReadinessProbe readinessProbe = new ReadinessProbe();
			readinessProbe.setFailureThreshold(_ctx.longValue("DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.ContainerSpecs["+ i +"].HealthCheckConfig.ReadinessProbe.FailureThreshold"));
			readinessProbe.setInitialDelaySeconds(_ctx.longValue("DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.ContainerSpecs["+ i +"].HealthCheckConfig.ReadinessProbe.InitialDelaySeconds"));
			readinessProbe.setPeriodSeconds(_ctx.longValue("DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.ContainerSpecs["+ i +"].HealthCheckConfig.ReadinessProbe.PeriodSeconds"));
			readinessProbe.setSuccessThreshold(_ctx.longValue("DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.ContainerSpecs["+ i +"].HealthCheckConfig.ReadinessProbe.SuccessThreshold"));
			readinessProbe.setTimeOutSeconds(_ctx.longValue("DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.ContainerSpecs["+ i +"].HealthCheckConfig.ReadinessProbe.TimeOutSeconds"));

			ExecAction1 execAction1 = new ExecAction1();
			execAction1.setCommand(_ctx.stringValue("DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.ContainerSpecs["+ i +"].HealthCheckConfig.ReadinessProbe.ExecAction.Command"));
			readinessProbe.setExecAction1(execAction1);

			HttpGetAction2 httpGetAction2 = new HttpGetAction2();
			httpGetAction2.setPath(_ctx.stringValue("DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.ContainerSpecs["+ i +"].HealthCheckConfig.ReadinessProbe.HttpGetAction.Path"));
			httpGetAction2.setPort(_ctx.stringValue("DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.ContainerSpecs["+ i +"].HealthCheckConfig.ReadinessProbe.HttpGetAction.Port"));
			httpGetAction2.setScheme(_ctx.stringValue("DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.ContainerSpecs["+ i +"].HealthCheckConfig.ReadinessProbe.HttpGetAction.Scheme"));
			readinessProbe.setHttpGetAction2(httpGetAction2);

			TcpSocketAction3 tcpSocketAction3 = new TcpSocketAction3();
			tcpSocketAction3.setPort(_ctx.stringValue("DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.ContainerSpecs["+ i +"].HealthCheckConfig.ReadinessProbe.TcpSocketAction.Port"));
			readinessProbe.setTcpSocketAction3(tcpSocketAction3);
			healthCheckConfig.setReadinessProbe(readinessProbe);
			containerSpecsItem.setHealthCheckConfig(healthCheckConfig);

			LifecycleHook lifecycleHook = new LifecycleHook();

			PostStartExec postStartExec = new PostStartExec();
			postStartExec.setCommand(_ctx.stringValue("DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.ContainerSpecs["+ i +"].LifecycleHook.PostStartExec.Command"));
			lifecycleHook.setPostStartExec(postStartExec);

			PostStartHttp postStartHttp = new PostStartHttp();
			postStartHttp.setPath(_ctx.stringValue("DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.ContainerSpecs["+ i +"].LifecycleHook.PostStartHttp.Path"));
			postStartHttp.setPort(_ctx.stringValue("DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.ContainerSpecs["+ i +"].LifecycleHook.PostStartHttp.Port"));
			postStartHttp.setScheme(_ctx.stringValue("DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.ContainerSpecs["+ i +"].LifecycleHook.PostStartHttp.Scheme"));
			lifecycleHook.setPostStartHttp(postStartHttp);

			PostStartTcp postStartTcp = new PostStartTcp();
			postStartTcp.setPort(_ctx.stringValue("DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.ContainerSpecs["+ i +"].LifecycleHook.PostStartTcp.Port"));
			lifecycleHook.setPostStartTcp(postStartTcp);

			PreStopExec preStopExec = new PreStopExec();
			preStopExec.setCommand(_ctx.stringValue("DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.ContainerSpecs["+ i +"].LifecycleHook.PreStopExec.Command"));
			lifecycleHook.setPreStopExec(preStopExec);

			PreStopHttp preStopHttp = new PreStopHttp();
			preStopHttp.setPath(_ctx.stringValue("DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.ContainerSpecs["+ i +"].LifecycleHook.PreStopHttp.Path"));
			preStopHttp.setPort(_ctx.stringValue("DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.ContainerSpecs["+ i +"].LifecycleHook.PreStopHttp.Port"));
			preStopHttp.setScheme(_ctx.stringValue("DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.ContainerSpecs["+ i +"].LifecycleHook.PreStopHttp.Scheme"));
			lifecycleHook.setPreStopHttp(preStopHttp);

			PreStopTcp preStopTcp = new PreStopTcp();
			preStopTcp.setPort(_ctx.stringValue("DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.ContainerSpecs["+ i +"].LifecycleHook.PreStopTcp.Port"));
			lifecycleHook.setPreStopTcp(preStopTcp);
			containerSpecsItem.setLifecycleHook(lifecycleHook);

			List<EnvsItem> envs = new ArrayList<EnvsItem>();
			for (int j = 0; j < _ctx.lengthValue("DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.ContainerSpecs["+ i +"].Envs.Length"); j++) {
				EnvsItem envsItem = new EnvsItem();
				envsItem.setName(_ctx.stringValue("DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.ContainerSpecs["+ i +"].Envs["+ j +"].Name"));
				envsItem.setValue(_ctx.stringValue("DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.ContainerSpecs["+ i +"].Envs["+ j +"].Value"));
				envsItem.setType(_ctx.stringValue("DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.ContainerSpecs["+ i +"].Envs["+ j +"].Type"));

				ValueFrom valueFrom = new ValueFrom();
				valueFrom.setObjectName(_ctx.stringValue("DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.ContainerSpecs["+ i +"].Envs["+ j +"].ValueFrom.ObjectName"));
				valueFrom.setObjectType(_ctx.stringValue("DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.ContainerSpecs["+ i +"].Envs["+ j +"].ValueFrom.ObjectType"));
				valueFrom.setKey(_ctx.stringValue("DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.ContainerSpecs["+ i +"].Envs["+ j +"].ValueFrom.Key"));
				envsItem.setValueFrom(valueFrom);

				envs.add(envsItem);
			}
			containerSpecsItem.setEnvs(envs);

			List<EnvOverridesItem> envOverrides = new ArrayList<EnvOverridesItem>();
			for (int j = 0; j < _ctx.lengthValue("DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.ContainerSpecs["+ i +"].EnvOverrides.Length"); j++) {
				EnvOverridesItem envOverridesItem = new EnvOverridesItem();
				envOverridesItem.setCell(_ctx.stringValue("DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.ContainerSpecs["+ i +"].EnvOverrides["+ j +"].Cell"));
				envOverridesItem.setName(_ctx.stringValue("DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.ContainerSpecs["+ i +"].EnvOverrides["+ j +"].Name"));
				envOverridesItem.setValue(_ctx.stringValue("DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.ContainerSpecs["+ i +"].EnvOverrides["+ j +"].Value"));

				envOverrides.add(envOverridesItem);
			}
			containerSpecsItem.setEnvOverrides(envOverrides);

			List<LogConfigsItem> logConfigs = new ArrayList<LogConfigsItem>();
			for (int j = 0; j < _ctx.lengthValue("DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.ContainerSpecs["+ i +"].LogConfigs.Length"); j++) {
				LogConfigsItem logConfigsItem = new LogConfigsItem();
				logConfigsItem.setConfigName(_ctx.stringValue("DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.ContainerSpecs["+ i +"].LogConfigs["+ j +"].ConfigName"));
				logConfigsItem.setInputType(_ctx.stringValue("DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.ContainerSpecs["+ i +"].LogConfigs["+ j +"].InputType"));
				logConfigsItem.setLogstoreName(_ctx.stringValue("DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.ContainerSpecs["+ i +"].LogConfigs["+ j +"].LogstoreName"));
				logConfigsItem.setLogPath(_ctx.stringValue("DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.ContainerSpecs["+ i +"].LogConfigs["+ j +"].LogPath"));
				logConfigsItem.setFilePattern(_ctx.stringValue("DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.ContainerSpecs["+ i +"].LogConfigs["+ j +"].FilePattern"));

				logConfigs.add(logConfigsItem);
			}
			containerSpecsItem.setLogConfigs(logConfigs);

			List<VolumeMountsItem> volumeMounts = new ArrayList<VolumeMountsItem>();
			for (int j = 0; j < _ctx.lengthValue("DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.ContainerSpecs["+ i +"].VolumeMounts.Length"); j++) {
				VolumeMountsItem volumeMountsItem = new VolumeMountsItem();
				volumeMountsItem.setMountPath(_ctx.stringValue("DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.ContainerSpecs["+ i +"].VolumeMounts["+ j +"].MountPath"));
				volumeMountsItem.setName(_ctx.stringValue("DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.ContainerSpecs["+ i +"].VolumeMounts["+ j +"].Name"));
				volumeMountsItem.setReadOnly(_ctx.booleanValue("DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.ContainerSpecs["+ i +"].VolumeMounts["+ j +"].ReadOnly"));
				volumeMountsItem.setSubPath(_ctx.stringValue("DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.ContainerSpecs["+ i +"].VolumeMounts["+ j +"].SubPath"));
				volumeMountsItem.setVolumeSourceCategoryType(_ctx.stringValue("DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.ContainerSpecs["+ i +"].VolumeMounts["+ j +"].VolumeSourceCategoryType"));

				ConfigmapSecretVolumeSource configmapSecretVolumeSource = new ConfigmapSecretVolumeSource();
				configmapSecretVolumeSource.setVolumeRefName(_ctx.stringValue("DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.ContainerSpecs["+ i +"].VolumeMounts["+ j +"].ConfigmapSecretVolumeSource.VolumeRefName"));
				volumeMountsItem.setConfigmapSecretVolumeSource(configmapSecretVolumeSource);

				EmptyDirVolumeSource emptyDirVolumeSource = new EmptyDirVolumeSource();
				emptyDirVolumeSource.setMedium(_ctx.stringValue("DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.ContainerSpecs["+ i +"].VolumeMounts["+ j +"].EmptyDirVolumeSource.Medium"));
				emptyDirVolumeSource.setName(_ctx.stringValue("DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.ContainerSpecs["+ i +"].VolumeMounts["+ j +"].EmptyDirVolumeSource.Name"));
				emptyDirVolumeSource.setSizeLimit(_ctx.stringValue("DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.ContainerSpecs["+ i +"].VolumeMounts["+ j +"].EmptyDirVolumeSource.SizeLimit"));
				volumeMountsItem.setEmptyDirVolumeSource(emptyDirVolumeSource);

				LocalDiskVolumeSource localDiskVolumeSource = new LocalDiskVolumeSource();
				localDiskVolumeSource.setHostDirectoryPath(_ctx.stringValue("DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.ContainerSpecs["+ i +"].VolumeMounts["+ j +"].LocalDiskVolumeSource.HostDirectoryPath"));
				localDiskVolumeSource.setCreateIfNotPresent(_ctx.booleanValue("DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.ContainerSpecs["+ i +"].VolumeMounts["+ j +"].LocalDiskVolumeSource.CreateIfNotPresent"));
				volumeMountsItem.setLocalDiskVolumeSource(localDiskVolumeSource);

				PvcSource pvcSource = new PvcSource();
				pvcSource.setPvcName(_ctx.stringValue("DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.ContainerSpecs["+ i +"].VolumeMounts["+ j +"].PvcSource.PvcName"));
				volumeMountsItem.setPvcSource(pvcSource);

				volumeMounts.add(volumeMountsItem);
			}
			containerSpecsItem.setVolumeMounts(volumeMounts);

			containerSpecs.add(containerSpecsItem);
		}
		containerServiceConfig.setContainerSpecs(containerSpecs);

		List<IngressesItem> ingresses = new ArrayList<IngressesItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.Ingresses.Length"); i++) {
			IngressesItem ingressesItem = new IngressesItem();
			ingressesItem.setDomain(_ctx.stringValue("DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.Ingresses["+ i +"].Domain"));
			ingressesItem.setLoadBalancerIaasId(_ctx.stringValue("DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.Ingresses["+ i +"].LoadBalancerIaasId"));
			ingressesItem.setLoadBalancerName(_ctx.stringValue("DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.Ingresses["+ i +"].LoadBalancerName"));
			ingressesItem.setLoadBalancerType(_ctx.stringValue("DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.Ingresses["+ i +"].LoadBalancerType"));
			ingressesItem.setName(_ctx.stringValue("DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.Ingresses["+ i +"].Name"));
			ingressesItem.setSpannerClusterId(_ctx.stringValue("DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.Ingresses["+ i +"].SpannerClusterId"));
			ingressesItem.setUnifiedAccessInstanceName(_ctx.stringValue("DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.Ingresses["+ i +"].UnifiedAccessInstanceName"));
			ingressesItem.setUnifiedAccessRouteRule(_ctx.stringValue("DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.Ingresses["+ i +"].UnifiedAccessRouteRule"));

			List<String> unifiedAccessEntries = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.Ingresses["+ i +"].UnifiedAccessEntries.Length"); j++) {
				unifiedAccessEntries.add(_ctx.stringValue("DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.Ingresses["+ i +"].UnifiedAccessEntries["+ j +"]"));
			}
			ingressesItem.setUnifiedAccessEntries(unifiedAccessEntries);

			List<ListenersItem> listeners = new ArrayList<ListenersItem>();
			for (int j = 0; j < _ctx.lengthValue("DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.Ingresses["+ i +"].Listeners.Length"); j++) {
				ListenersItem listenersItem = new ListenersItem();
				listenersItem.setBackendServerPort(_ctx.longValue("DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.Ingresses["+ i +"].Listeners["+ j +"].BackendServerPort"));
				listenersItem.setBandWidth(_ctx.longValue("DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.Ingresses["+ i +"].Listeners["+ j +"].BandWidth"));
				listenersItem.setCaCertificateId(_ctx.stringValue("DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.Ingresses["+ i +"].Listeners["+ j +"].CaCertificateId"));
				listenersItem.setCookie(_ctx.stringValue("DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.Ingresses["+ i +"].Listeners["+ j +"].Cookie"));
				listenersItem.setCookieTimeout(_ctx.longValue("DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.Ingresses["+ i +"].Listeners["+ j +"].CookieTimeout"));
				listenersItem.setEstablishedTimeout(_ctx.longValue("DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.Ingresses["+ i +"].Listeners["+ j +"].EstablishedTimeout"));
				listenersItem.setHealthyThreshold(_ctx.longValue("DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.Ingresses["+ i +"].Listeners["+ j +"].HealthyThreshold"));
				listenersItem.setHealthCheck(_ctx.stringValue("DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.Ingresses["+ i +"].Listeners["+ j +"].HealthCheck"));
				listenersItem.setHealthCheckConnectPort(_ctx.longValue("DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.Ingresses["+ i +"].Listeners["+ j +"].HealthCheckConnectPort"));
				listenersItem.setHealthCheckConnectTimeout(_ctx.longValue("DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.Ingresses["+ i +"].Listeners["+ j +"].HealthCheckConnectTimeout"));
				listenersItem.setHealthCheckDomain(_ctx.stringValue("DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.Ingresses["+ i +"].Listeners["+ j +"].HealthCheckDomain"));
				listenersItem.setHealthCheckHttpCode(_ctx.stringValue("DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.Ingresses["+ i +"].Listeners["+ j +"].HealthCheckHttpCode"));
				listenersItem.setHealthCheckInterval(_ctx.longValue("DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.Ingresses["+ i +"].Listeners["+ j +"].HealthCheckInterval"));
				listenersItem.setHealthCheckThreshold(_ctx.longValue("DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.Ingresses["+ i +"].Listeners["+ j +"].HealthCheckThreshold"));
				listenersItem.setHealthCheckTimeout(_ctx.longValue("DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.Ingresses["+ i +"].Listeners["+ j +"].HealthCheckTimeout"));
				listenersItem.setHealthCheckUri(_ctx.stringValue("DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.Ingresses["+ i +"].Listeners["+ j +"].HealthCheckUri"));
				listenersItem.setListenerPort(_ctx.longValue("DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.Ingresses["+ i +"].Listeners["+ j +"].ListenerPort"));
				listenersItem.setPersistenceTimeout(_ctx.longValue("DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.Ingresses["+ i +"].Listeners["+ j +"].PersistenceTimeout"));
				listenersItem.setBizProtocol(_ctx.stringValue("DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.Ingresses["+ i +"].Listeners["+ j +"].Protocol"));
				listenersItem.setScheduler(_ctx.stringValue("DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.Ingresses["+ i +"].Listeners["+ j +"].Scheduler"));
				listenersItem.setSessionStickyType(_ctx.longValue("DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.Ingresses["+ i +"].Listeners["+ j +"].SessionStickyType"));
				listenersItem.setUnhealthyThreshold(_ctx.longValue("DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.Ingresses["+ i +"].Listeners["+ j +"].UnhealthyThreshold"));
				listenersItem.setXforwardFor(_ctx.booleanValue("DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.Ingresses["+ i +"].Listeners["+ j +"].XforwardFor"));
				listenersItem.setDomain(_ctx.stringValue("DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.Ingresses["+ i +"].Listeners["+ j +"].Domain"));
				listenersItem.setPath(_ctx.stringValue("DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.Ingresses["+ i +"].Listeners["+ j +"].Path"));

				listeners.add(listenersItem);
			}
			ingressesItem.setListeners(listeners);

			List<ListenersV2Item> listenersV2 = new ArrayList<ListenersV2Item>();
			for (int j = 0; j < _ctx.lengthValue("DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.Ingresses["+ i +"].ListenersV2.Length"); j++) {
				ListenersV2Item listenersV2Item = new ListenersV2Item();
				listenersV2Item.setBackendServerPort(_ctx.longValue("DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.Ingresses["+ i +"].ListenersV2["+ j +"].BackendServerPort"));
				listenersV2Item.setBandWidth(_ctx.longValue("DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.Ingresses["+ i +"].ListenersV2["+ j +"].BandWidth"));
				listenersV2Item.setCaCertificateId(_ctx.stringValue("DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.Ingresses["+ i +"].ListenersV2["+ j +"].CaCertificateId"));
				listenersV2Item.setCookie(_ctx.stringValue("DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.Ingresses["+ i +"].ListenersV2["+ j +"].Cookie"));
				listenersV2Item.setCookieTimeout(_ctx.longValue("DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.Ingresses["+ i +"].ListenersV2["+ j +"].CookieTimeout"));
				listenersV2Item.setEstablishedTimeout(_ctx.longValue("DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.Ingresses["+ i +"].ListenersV2["+ j +"].EstablishedTimeout"));
				listenersV2Item.setHealthyThreshold(_ctx.longValue("DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.Ingresses["+ i +"].ListenersV2["+ j +"].HealthyThreshold"));
				listenersV2Item.setHealthCheck(_ctx.stringValue("DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.Ingresses["+ i +"].ListenersV2["+ j +"].HealthCheck"));
				listenersV2Item.setHealthCheckConnectPort(_ctx.longValue("DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.Ingresses["+ i +"].ListenersV2["+ j +"].HealthCheckConnectPort"));
				listenersV2Item.setHealthCheckConnectTimeout(_ctx.longValue("DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.Ingresses["+ i +"].ListenersV2["+ j +"].HealthCheckConnectTimeout"));
				listenersV2Item.setHealthCheckDomain(_ctx.stringValue("DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.Ingresses["+ i +"].ListenersV2["+ j +"].HealthCheckDomain"));
				listenersV2Item.setHealthCheckHttpCode(_ctx.stringValue("DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.Ingresses["+ i +"].ListenersV2["+ j +"].HealthCheckHttpCode"));
				listenersV2Item.setHealthCheckInterval(_ctx.longValue("DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.Ingresses["+ i +"].ListenersV2["+ j +"].HealthCheckInterval"));
				listenersV2Item.setHealthCheckThreshold(_ctx.longValue("DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.Ingresses["+ i +"].ListenersV2["+ j +"].HealthCheckThreshold"));
				listenersV2Item.setHealthCheckTimeout(_ctx.longValue("DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.Ingresses["+ i +"].ListenersV2["+ j +"].HealthCheckTimeout"));
				listenersV2Item.setHealthCheckUri(_ctx.stringValue("DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.Ingresses["+ i +"].ListenersV2["+ j +"].HealthCheckUri"));
				listenersV2Item.setListenerPort(_ctx.longValue("DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.Ingresses["+ i +"].ListenersV2["+ j +"].ListenerPort"));
				listenersV2Item.setPersistenceTimeout(_ctx.longValue("DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.Ingresses["+ i +"].ListenersV2["+ j +"].PersistenceTimeout"));
				listenersV2Item.setBizProtocol(_ctx.stringValue("DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.Ingresses["+ i +"].ListenersV2["+ j +"].Protocol"));
				listenersV2Item.setScheduler(_ctx.stringValue("DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.Ingresses["+ i +"].ListenersV2["+ j +"].Scheduler"));
				listenersV2Item.setSessionStickyType(_ctx.longValue("DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.Ingresses["+ i +"].ListenersV2["+ j +"].SessionStickyType"));
				listenersV2Item.setUnhealthyThreshold(_ctx.longValue("DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.Ingresses["+ i +"].ListenersV2["+ j +"].UnhealthyThreshold"));
				listenersV2Item.setXforwardFor(_ctx.booleanValue("DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.Ingresses["+ i +"].ListenersV2["+ j +"].XforwardFor"));
				listenersV2Item.setDomain(_ctx.stringValue("DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.Ingresses["+ i +"].ListenersV2["+ j +"].Domain"));
				listenersV2Item.setPath(_ctx.stringValue("DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.Ingresses["+ i +"].ListenersV2["+ j +"].Path"));

				listenersV2.add(listenersV2Item);
			}
			ingressesItem.setListenersV2(listenersV2);

			ingresses.add(ingressesItem);
		}
		containerServiceConfig.setIngresses(ingresses);

		List<InnerLoadBalancerServicesItem> innerLoadBalancerServices = new ArrayList<InnerLoadBalancerServicesItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.InnerLoadBalancerServices.Length"); i++) {
			InnerLoadBalancerServicesItem innerLoadBalancerServicesItem = new InnerLoadBalancerServicesItem();
			innerLoadBalancerServicesItem.setDomain(_ctx.stringValue("DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.InnerLoadBalancerServices["+ i +"].Domain"));
			innerLoadBalancerServicesItem.setLoadBalancerIaasId(_ctx.stringValue("DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.InnerLoadBalancerServices["+ i +"].LoadBalancerIaasId"));
			innerLoadBalancerServicesItem.setLoadBalancerName(_ctx.stringValue("DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.InnerLoadBalancerServices["+ i +"].LoadBalancerName"));
			innerLoadBalancerServicesItem.setName(_ctx.stringValue("DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.InnerLoadBalancerServices["+ i +"].Name"));
			innerLoadBalancerServicesItem.setSpannerClusterId(_ctx.stringValue("DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.InnerLoadBalancerServices["+ i +"].SpannerClusterId"));
			innerLoadBalancerServicesItem.setAddressType(_ctx.stringValue("DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.InnerLoadBalancerServices["+ i +"].AddressType"));

			List<ListenersItem5> listeners4 = new ArrayList<ListenersItem5>();
			for (int j = 0; j < _ctx.lengthValue("DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.InnerLoadBalancerServices["+ i +"].Listeners.Length"); j++) {
				ListenersItem5 listenersItem5 = new ListenersItem5();
				listenersItem5.setBackendServerPort(_ctx.longValue("DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.InnerLoadBalancerServices["+ i +"].Listeners["+ j +"].BackendServerPort"));
				listenersItem5.setBandWidth(_ctx.longValue("DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.InnerLoadBalancerServices["+ i +"].Listeners["+ j +"].BandWidth"));
				listenersItem5.setCaCertificateId(_ctx.stringValue("DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.InnerLoadBalancerServices["+ i +"].Listeners["+ j +"].CaCertificateId"));
				listenersItem5.setCookie(_ctx.stringValue("DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.InnerLoadBalancerServices["+ i +"].Listeners["+ j +"].Cookie"));
				listenersItem5.setCookieTimeout(_ctx.longValue("DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.InnerLoadBalancerServices["+ i +"].Listeners["+ j +"].CookieTimeout"));
				listenersItem5.setEstablishedTimeout(_ctx.longValue("DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.InnerLoadBalancerServices["+ i +"].Listeners["+ j +"].EstablishedTimeout"));
				listenersItem5.setHealthyThreshold(_ctx.longValue("DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.InnerLoadBalancerServices["+ i +"].Listeners["+ j +"].HealthyThreshold"));
				listenersItem5.setHealthCheck(_ctx.stringValue("DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.InnerLoadBalancerServices["+ i +"].Listeners["+ j +"].HealthCheck"));
				listenersItem5.setHealthCheckConnectPort(_ctx.longValue("DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.InnerLoadBalancerServices["+ i +"].Listeners["+ j +"].HealthCheckConnectPort"));
				listenersItem5.setHealthCheckConnectTimeout(_ctx.longValue("DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.InnerLoadBalancerServices["+ i +"].Listeners["+ j +"].HealthCheckConnectTimeout"));
				listenersItem5.setHealthCheckDomain(_ctx.stringValue("DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.InnerLoadBalancerServices["+ i +"].Listeners["+ j +"].HealthCheckDomain"));
				listenersItem5.setHealthCheckHttpCode(_ctx.stringValue("DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.InnerLoadBalancerServices["+ i +"].Listeners["+ j +"].HealthCheckHttpCode"));
				listenersItem5.setHealthCheckInterval(_ctx.longValue("DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.InnerLoadBalancerServices["+ i +"].Listeners["+ j +"].HealthCheckInterval"));
				listenersItem5.setHealthCheckThreshold(_ctx.longValue("DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.InnerLoadBalancerServices["+ i +"].Listeners["+ j +"].HealthCheckThreshold"));
				listenersItem5.setHealthCheckTimeout(_ctx.longValue("DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.InnerLoadBalancerServices["+ i +"].Listeners["+ j +"].HealthCheckTimeout"));
				listenersItem5.setHealthCheckUri(_ctx.stringValue("DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.InnerLoadBalancerServices["+ i +"].Listeners["+ j +"].HealthCheckUri"));
				listenersItem5.setListenerPort(_ctx.longValue("DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.InnerLoadBalancerServices["+ i +"].Listeners["+ j +"].ListenerPort"));
				listenersItem5.setPersistenceTimeout(_ctx.longValue("DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.InnerLoadBalancerServices["+ i +"].Listeners["+ j +"].PersistenceTimeout"));
				listenersItem5.setBizProtocol(_ctx.stringValue("DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.InnerLoadBalancerServices["+ i +"].Listeners["+ j +"].Protocol"));
				listenersItem5.setScheduler(_ctx.stringValue("DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.InnerLoadBalancerServices["+ i +"].Listeners["+ j +"].Scheduler"));
				listenersItem5.setSessionStickyType(_ctx.longValue("DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.InnerLoadBalancerServices["+ i +"].Listeners["+ j +"].SessionStickyType"));
				listenersItem5.setUnhealthyThreshold(_ctx.longValue("DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.InnerLoadBalancerServices["+ i +"].Listeners["+ j +"].UnhealthyThreshold"));
				listenersItem5.setXforwardFor(_ctx.booleanValue("DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.InnerLoadBalancerServices["+ i +"].Listeners["+ j +"].XforwardFor"));
				listenersItem5.setDomain(_ctx.stringValue("DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.InnerLoadBalancerServices["+ i +"].Listeners["+ j +"].Domain"));
				listenersItem5.setPath(_ctx.stringValue("DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.InnerLoadBalancerServices["+ i +"].Listeners["+ j +"].Path"));

				listeners4.add(listenersItem5);
			}
			innerLoadBalancerServicesItem.setListeners4(listeners4);

			List<CellSlbIaasIdMapItem> cellSlbIaasIdMap = new ArrayList<CellSlbIaasIdMapItem>();
			for (int j = 0; j < _ctx.lengthValue("DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.InnerLoadBalancerServices["+ i +"].CellSlbIaasIdMap.Length"); j++) {
				CellSlbIaasIdMapItem cellSlbIaasIdMapItem = new CellSlbIaasIdMapItem();
				cellSlbIaasIdMapItem.setKey(_ctx.stringValue("DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.InnerLoadBalancerServices["+ i +"].CellSlbIaasIdMap["+ j +"].Key"));
				cellSlbIaasIdMapItem.setValue(_ctx.stringValue("DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.InnerLoadBalancerServices["+ i +"].CellSlbIaasIdMap["+ j +"].Value"));

				cellSlbIaasIdMap.add(cellSlbIaasIdMapItem);
			}
			innerLoadBalancerServicesItem.setCellSlbIaasIdMap(cellSlbIaasIdMap);

			innerLoadBalancerServices.add(innerLoadBalancerServicesItem);
		}
		containerServiceConfig.setInnerLoadBalancerServices(innerLoadBalancerServices);

		List<PublicLoadBalancerServicesItem> publicLoadBalancerServices = new ArrayList<PublicLoadBalancerServicesItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.PublicLoadBalancerServices.Length"); i++) {
			PublicLoadBalancerServicesItem publicLoadBalancerServicesItem = new PublicLoadBalancerServicesItem();
			publicLoadBalancerServicesItem.setDomain(_ctx.stringValue("DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.PublicLoadBalancerServices["+ i +"].Domain"));
			publicLoadBalancerServicesItem.setLoadBalancerIaasId(_ctx.stringValue("DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.PublicLoadBalancerServices["+ i +"].LoadBalancerIaasId"));
			publicLoadBalancerServicesItem.setLoadBalancerName(_ctx.stringValue("DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.PublicLoadBalancerServices["+ i +"].LoadBalancerName"));
			publicLoadBalancerServicesItem.setName(_ctx.stringValue("DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.PublicLoadBalancerServices["+ i +"].Name"));
			publicLoadBalancerServicesItem.setSpannerClusterId(_ctx.stringValue("DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.PublicLoadBalancerServices["+ i +"].SpannerClusterId"));
			publicLoadBalancerServicesItem.setAddressType(_ctx.stringValue("DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.PublicLoadBalancerServices["+ i +"].AddressType"));

			List<ListenersItem8> listeners6 = new ArrayList<ListenersItem8>();
			for (int j = 0; j < _ctx.lengthValue("DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.PublicLoadBalancerServices["+ i +"].Listeners.Length"); j++) {
				ListenersItem8 listenersItem8 = new ListenersItem8();
				listenersItem8.setBackendServerPort(_ctx.longValue("DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.PublicLoadBalancerServices["+ i +"].Listeners["+ j +"].BackendServerPort"));
				listenersItem8.setBandWidth(_ctx.longValue("DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.PublicLoadBalancerServices["+ i +"].Listeners["+ j +"].BandWidth"));
				listenersItem8.setCaCertificateId(_ctx.stringValue("DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.PublicLoadBalancerServices["+ i +"].Listeners["+ j +"].CaCertificateId"));
				listenersItem8.setCookie(_ctx.stringValue("DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.PublicLoadBalancerServices["+ i +"].Listeners["+ j +"].Cookie"));
				listenersItem8.setCookieTimeout(_ctx.longValue("DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.PublicLoadBalancerServices["+ i +"].Listeners["+ j +"].CookieTimeout"));
				listenersItem8.setEstablishedTimeout(_ctx.longValue("DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.PublicLoadBalancerServices["+ i +"].Listeners["+ j +"].EstablishedTimeout"));
				listenersItem8.setHealthyThreshold(_ctx.longValue("DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.PublicLoadBalancerServices["+ i +"].Listeners["+ j +"].HealthyThreshold"));
				listenersItem8.setHealthCheck(_ctx.stringValue("DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.PublicLoadBalancerServices["+ i +"].Listeners["+ j +"].HealthCheck"));
				listenersItem8.setHealthCheckConnectPort(_ctx.longValue("DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.PublicLoadBalancerServices["+ i +"].Listeners["+ j +"].HealthCheckConnectPort"));
				listenersItem8.setHealthCheckConnectTimeout(_ctx.longValue("DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.PublicLoadBalancerServices["+ i +"].Listeners["+ j +"].HealthCheckConnectTimeout"));
				listenersItem8.setHealthCheckDomain(_ctx.stringValue("DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.PublicLoadBalancerServices["+ i +"].Listeners["+ j +"].HealthCheckDomain"));
				listenersItem8.setHealthCheckHttpCode(_ctx.stringValue("DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.PublicLoadBalancerServices["+ i +"].Listeners["+ j +"].HealthCheckHttpCode"));
				listenersItem8.setHealthCheckInterval(_ctx.longValue("DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.PublicLoadBalancerServices["+ i +"].Listeners["+ j +"].HealthCheckInterval"));
				listenersItem8.setHealthCheckThreshold(_ctx.longValue("DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.PublicLoadBalancerServices["+ i +"].Listeners["+ j +"].HealthCheckThreshold"));
				listenersItem8.setHealthCheckTimeout(_ctx.longValue("DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.PublicLoadBalancerServices["+ i +"].Listeners["+ j +"].HealthCheckTimeout"));
				listenersItem8.setHealthCheckUri(_ctx.stringValue("DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.PublicLoadBalancerServices["+ i +"].Listeners["+ j +"].HealthCheckUri"));
				listenersItem8.setListenerPort(_ctx.longValue("DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.PublicLoadBalancerServices["+ i +"].Listeners["+ j +"].ListenerPort"));
				listenersItem8.setPersistenceTimeout(_ctx.longValue("DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.PublicLoadBalancerServices["+ i +"].Listeners["+ j +"].PersistenceTimeout"));
				listenersItem8.setBizProtocol(_ctx.stringValue("DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.PublicLoadBalancerServices["+ i +"].Listeners["+ j +"].Protocol"));
				listenersItem8.setScheduler(_ctx.stringValue("DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.PublicLoadBalancerServices["+ i +"].Listeners["+ j +"].Scheduler"));
				listenersItem8.setSessionStickyType(_ctx.longValue("DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.PublicLoadBalancerServices["+ i +"].Listeners["+ j +"].SessionStickyType"));
				listenersItem8.setUnhealthyThreshold(_ctx.longValue("DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.PublicLoadBalancerServices["+ i +"].Listeners["+ j +"].UnhealthyThreshold"));
				listenersItem8.setXforwardFor(_ctx.booleanValue("DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.PublicLoadBalancerServices["+ i +"].Listeners["+ j +"].XforwardFor"));
				listenersItem8.setDomain(_ctx.stringValue("DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.PublicLoadBalancerServices["+ i +"].Listeners["+ j +"].Domain"));
				listenersItem8.setPath(_ctx.stringValue("DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.PublicLoadBalancerServices["+ i +"].Listeners["+ j +"].Path"));

				listeners6.add(listenersItem8);
			}
			publicLoadBalancerServicesItem.setListeners6(listeners6);

			List<CellSlbIaasIdMapItem9> cellSlbIaasIdMap7 = new ArrayList<CellSlbIaasIdMapItem9>();
			for (int j = 0; j < _ctx.lengthValue("DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.PublicLoadBalancerServices["+ i +"].CellSlbIaasIdMap.Length"); j++) {
				CellSlbIaasIdMapItem9 cellSlbIaasIdMapItem9 = new CellSlbIaasIdMapItem9();
				cellSlbIaasIdMapItem9.setKey(_ctx.stringValue("DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.PublicLoadBalancerServices["+ i +"].CellSlbIaasIdMap["+ j +"].Key"));
				cellSlbIaasIdMapItem9.setValue(_ctx.stringValue("DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.PublicLoadBalancerServices["+ i +"].CellSlbIaasIdMap["+ j +"].Value"));

				cellSlbIaasIdMap7.add(cellSlbIaasIdMapItem9);
			}
			publicLoadBalancerServicesItem.setCellSlbIaasIdMap7(cellSlbIaasIdMap7);

			publicLoadBalancerServices.add(publicLoadBalancerServicesItem);
		}
		containerServiceConfig.setPublicLoadBalancerServices(publicLoadBalancerServices);

		List<SidecarConfigsItem> sidecarConfigs = new ArrayList<SidecarConfigsItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.SidecarConfigs.Length"); i++) {
			SidecarConfigsItem sidecarConfigsItem = new SidecarConfigsItem();
			sidecarConfigsItem.setId(_ctx.stringValue("DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.SidecarConfigs["+ i +"].Id"));
			sidecarConfigsItem.setRegionId(_ctx.stringValue("DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.SidecarConfigs["+ i +"].RegionId"));
			sidecarConfigsItem.setScope(_ctx.stringValue("DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.SidecarConfigs["+ i +"].Scope"));
			sidecarConfigsItem.setSidecarName(_ctx.stringValue("DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.SidecarConfigs["+ i +"].SidecarName"));
			sidecarConfigsItem.setSidecarVersion(_ctx.stringValue("DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.SidecarConfigs["+ i +"].SidecarVersion"));
			sidecarConfigsItem.setTemplate(_ctx.stringValue("DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.SidecarConfigs["+ i +"].Template"));
			sidecarConfigsItem.setType(_ctx.stringValue("DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.SidecarConfigs["+ i +"].Type"));
			sidecarConfigsItem.setWorkspaceGroupId(_ctx.stringValue("DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.SidecarConfigs["+ i +"].WorkspaceGroupId"));
			sidecarConfigsItem.setWorkspaceId(_ctx.stringValue("DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.SidecarConfigs["+ i +"].WorkspaceId"));

			sidecarConfigs.add(sidecarConfigsItem);
		}
		containerServiceConfig.setSidecarConfigs(sidecarConfigs);

		List<LoadBalancerServicesItem> loadBalancerServices = new ArrayList<LoadBalancerServicesItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.LoadBalancerServices.Length"); i++) {
			LoadBalancerServicesItem loadBalancerServicesItem = new LoadBalancerServicesItem();
			loadBalancerServicesItem.setDomain(_ctx.stringValue("DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.LoadBalancerServices["+ i +"].Domain"));
			loadBalancerServicesItem.setLoadBalancerIaasId(_ctx.stringValue("DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.LoadBalancerServices["+ i +"].LoadBalancerIaasId"));
			loadBalancerServicesItem.setLoadBalancerName(_ctx.stringValue("DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.LoadBalancerServices["+ i +"].LoadBalancerName"));
			loadBalancerServicesItem.setName(_ctx.stringValue("DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.LoadBalancerServices["+ i +"].Name"));
			loadBalancerServicesItem.setSpannerClusterId(_ctx.stringValue("DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.LoadBalancerServices["+ i +"].SpannerClusterId"));
			loadBalancerServicesItem.setAddressType(_ctx.stringValue("DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.LoadBalancerServices["+ i +"].AddressType"));

			List<ListenersItem12> listeners10 = new ArrayList<ListenersItem12>();
			for (int j = 0; j < _ctx.lengthValue("DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.LoadBalancerServices["+ i +"].Listeners.Length"); j++) {
				ListenersItem12 listenersItem12 = new ListenersItem12();
				listenersItem12.setBackendServerPort(_ctx.longValue("DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.LoadBalancerServices["+ i +"].Listeners["+ j +"].BackendServerPort"));
				listenersItem12.setBandWidth(_ctx.longValue("DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.LoadBalancerServices["+ i +"].Listeners["+ j +"].BandWidth"));
				listenersItem12.setCaCertificateId(_ctx.stringValue("DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.LoadBalancerServices["+ i +"].Listeners["+ j +"].CaCertificateId"));
				listenersItem12.setCookie(_ctx.stringValue("DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.LoadBalancerServices["+ i +"].Listeners["+ j +"].Cookie"));
				listenersItem12.setCookieTimeout(_ctx.longValue("DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.LoadBalancerServices["+ i +"].Listeners["+ j +"].CookieTimeout"));
				listenersItem12.setEstablishedTimeout(_ctx.longValue("DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.LoadBalancerServices["+ i +"].Listeners["+ j +"].EstablishedTimeout"));
				listenersItem12.setHealthyThreshold(_ctx.longValue("DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.LoadBalancerServices["+ i +"].Listeners["+ j +"].HealthyThreshold"));
				listenersItem12.setHealthCheck(_ctx.stringValue("DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.LoadBalancerServices["+ i +"].Listeners["+ j +"].HealthCheck"));
				listenersItem12.setHealthCheckConnectPort(_ctx.longValue("DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.LoadBalancerServices["+ i +"].Listeners["+ j +"].HealthCheckConnectPort"));
				listenersItem12.setHealthCheckConnectTimeout(_ctx.longValue("DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.LoadBalancerServices["+ i +"].Listeners["+ j +"].HealthCheckConnectTimeout"));
				listenersItem12.setHealthCheckDomain(_ctx.stringValue("DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.LoadBalancerServices["+ i +"].Listeners["+ j +"].HealthCheckDomain"));
				listenersItem12.setHealthCheckHttpCode(_ctx.stringValue("DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.LoadBalancerServices["+ i +"].Listeners["+ j +"].HealthCheckHttpCode"));
				listenersItem12.setHealthCheckInterval(_ctx.longValue("DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.LoadBalancerServices["+ i +"].Listeners["+ j +"].HealthCheckInterval"));
				listenersItem12.setHealthCheckThreshold(_ctx.longValue("DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.LoadBalancerServices["+ i +"].Listeners["+ j +"].HealthCheckThreshold"));
				listenersItem12.setHealthCheckTimeout(_ctx.longValue("DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.LoadBalancerServices["+ i +"].Listeners["+ j +"].HealthCheckTimeout"));
				listenersItem12.setHealthCheckUri(_ctx.stringValue("DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.LoadBalancerServices["+ i +"].Listeners["+ j +"].HealthCheckUri"));
				listenersItem12.setListenerPort(_ctx.longValue("DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.LoadBalancerServices["+ i +"].Listeners["+ j +"].ListenerPort"));
				listenersItem12.setPersistenceTimeout(_ctx.longValue("DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.LoadBalancerServices["+ i +"].Listeners["+ j +"].PersistenceTimeout"));
				listenersItem12.setBizProtocol(_ctx.stringValue("DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.LoadBalancerServices["+ i +"].Listeners["+ j +"].Protocol"));
				listenersItem12.setScheduler(_ctx.stringValue("DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.LoadBalancerServices["+ i +"].Listeners["+ j +"].Scheduler"));
				listenersItem12.setSessionStickyType(_ctx.longValue("DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.LoadBalancerServices["+ i +"].Listeners["+ j +"].SessionStickyType"));
				listenersItem12.setUnhealthyThreshold(_ctx.longValue("DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.LoadBalancerServices["+ i +"].Listeners["+ j +"].UnhealthyThreshold"));
				listenersItem12.setXforwardFor(_ctx.booleanValue("DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.LoadBalancerServices["+ i +"].Listeners["+ j +"].XforwardFor"));
				listenersItem12.setDomain(_ctx.stringValue("DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.LoadBalancerServices["+ i +"].Listeners["+ j +"].Domain"));
				listenersItem12.setPath(_ctx.stringValue("DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.LoadBalancerServices["+ i +"].Listeners["+ j +"].Path"));

				listeners10.add(listenersItem12);
			}
			loadBalancerServicesItem.setListeners10(listeners10);

			List<CellSlbIaasIdMapItem13> cellSlbIaasIdMap11 = new ArrayList<CellSlbIaasIdMapItem13>();
			for (int j = 0; j < _ctx.lengthValue("DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.LoadBalancerServices["+ i +"].CellSlbIaasIdMap.Length"); j++) {
				CellSlbIaasIdMapItem13 cellSlbIaasIdMapItem13 = new CellSlbIaasIdMapItem13();
				cellSlbIaasIdMapItem13.setKey(_ctx.stringValue("DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.LoadBalancerServices["+ i +"].CellSlbIaasIdMap["+ j +"].Key"));
				cellSlbIaasIdMapItem13.setValue(_ctx.stringValue("DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceConfig.LoadBalancerServices["+ i +"].CellSlbIaasIdMap["+ j +"].Value"));

				cellSlbIaasIdMap11.add(cellSlbIaasIdMapItem13);
			}
			loadBalancerServicesItem.setCellSlbIaasIdMap11(cellSlbIaasIdMap11);

			loadBalancerServices.add(loadBalancerServicesItem);
		}
		containerServiceConfig.setLoadBalancerServices(loadBalancerServices);
		revision.setContainerServiceConfig(containerServiceConfig);

		ContainerServiceReleaseInfo containerServiceReleaseInfo = new ContainerServiceReleaseInfo();
		containerServiceReleaseInfo.setCreatedPlanId(_ctx.stringValue("DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceReleaseInfo.CreatedPlanId"));
		containerServiceReleaseInfo.setLatestDeploymentStartTime(_ctx.stringValue("DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceReleaseInfo.LatestDeploymentStartTime"));
		containerServiceReleaseInfo.setLatestDeploymentEndTime(_ctx.stringValue("DescribeLDCContainerServiceRevisionResponse.Revision.ContainerServiceReleaseInfo.LatestDeploymentEndTime"));
		revision.setContainerServiceReleaseInfo(containerServiceReleaseInfo);
		describeLDCContainerServiceRevisionResponse.setRevision(revision);
	 
	 	return describeLDCContainerServiceRevisionResponse;
	}
}