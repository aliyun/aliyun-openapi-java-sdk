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

import com.aliyuncs.sofa.model.v20190815.QueryLDCContainerServiceRevisionResponse;
import com.aliyuncs.sofa.model.v20190815.QueryLDCContainerServiceRevisionResponse.RevisionListItem;
import com.aliyuncs.sofa.model.v20190815.QueryLDCContainerServiceRevisionResponse.RevisionListItem.AppInfo;
import com.aliyuncs.sofa.model.v20190815.QueryLDCContainerServiceRevisionResponse.RevisionListItem.ContainerServiceConfig;
import com.aliyuncs.sofa.model.v20190815.QueryLDCContainerServiceRevisionResponse.RevisionListItem.ContainerServiceConfig.ClusterIpServicesItem;
import com.aliyuncs.sofa.model.v20190815.QueryLDCContainerServiceRevisionResponse.RevisionListItem.ContainerServiceConfig.ClusterIpServicesItem.PortsItem;
import com.aliyuncs.sofa.model.v20190815.QueryLDCContainerServiceRevisionResponse.RevisionListItem.ContainerServiceConfig.ContainerSpecsItem;
import com.aliyuncs.sofa.model.v20190815.QueryLDCContainerServiceRevisionResponse.RevisionListItem.ContainerServiceConfig.ContainerSpecsItem.EnvOverridesItem;
import com.aliyuncs.sofa.model.v20190815.QueryLDCContainerServiceRevisionResponse.RevisionListItem.ContainerServiceConfig.ContainerSpecsItem.EnvsItem;
import com.aliyuncs.sofa.model.v20190815.QueryLDCContainerServiceRevisionResponse.RevisionListItem.ContainerServiceConfig.ContainerSpecsItem.EnvsItem.ValueFrom;
import com.aliyuncs.sofa.model.v20190815.QueryLDCContainerServiceRevisionResponse.RevisionListItem.ContainerServiceConfig.ContainerSpecsItem.HealthCheckConfig;
import com.aliyuncs.sofa.model.v20190815.QueryLDCContainerServiceRevisionResponse.RevisionListItem.ContainerServiceConfig.ContainerSpecsItem.HealthCheckConfig.LivenessProbe;
import com.aliyuncs.sofa.model.v20190815.QueryLDCContainerServiceRevisionResponse.RevisionListItem.ContainerServiceConfig.ContainerSpecsItem.HealthCheckConfig.LivenessProbe.ExecAction;
import com.aliyuncs.sofa.model.v20190815.QueryLDCContainerServiceRevisionResponse.RevisionListItem.ContainerServiceConfig.ContainerSpecsItem.HealthCheckConfig.LivenessProbe.HttpGetAction;
import com.aliyuncs.sofa.model.v20190815.QueryLDCContainerServiceRevisionResponse.RevisionListItem.ContainerServiceConfig.ContainerSpecsItem.HealthCheckConfig.LivenessProbe.TcpSocketAction;
import com.aliyuncs.sofa.model.v20190815.QueryLDCContainerServiceRevisionResponse.RevisionListItem.ContainerServiceConfig.ContainerSpecsItem.HealthCheckConfig.ReadinessProbe;
import com.aliyuncs.sofa.model.v20190815.QueryLDCContainerServiceRevisionResponse.RevisionListItem.ContainerServiceConfig.ContainerSpecsItem.HealthCheckConfig.ReadinessProbe.ExecAction1;
import com.aliyuncs.sofa.model.v20190815.QueryLDCContainerServiceRevisionResponse.RevisionListItem.ContainerServiceConfig.ContainerSpecsItem.HealthCheckConfig.ReadinessProbe.HttpGetAction2;
import com.aliyuncs.sofa.model.v20190815.QueryLDCContainerServiceRevisionResponse.RevisionListItem.ContainerServiceConfig.ContainerSpecsItem.HealthCheckConfig.ReadinessProbe.TcpSocketAction3;
import com.aliyuncs.sofa.model.v20190815.QueryLDCContainerServiceRevisionResponse.RevisionListItem.ContainerServiceConfig.ContainerSpecsItem.LifecycleHook;
import com.aliyuncs.sofa.model.v20190815.QueryLDCContainerServiceRevisionResponse.RevisionListItem.ContainerServiceConfig.ContainerSpecsItem.LifecycleHook.PostStartExec;
import com.aliyuncs.sofa.model.v20190815.QueryLDCContainerServiceRevisionResponse.RevisionListItem.ContainerServiceConfig.ContainerSpecsItem.LifecycleHook.PostStartHttp;
import com.aliyuncs.sofa.model.v20190815.QueryLDCContainerServiceRevisionResponse.RevisionListItem.ContainerServiceConfig.ContainerSpecsItem.LifecycleHook.PostStartTcp;
import com.aliyuncs.sofa.model.v20190815.QueryLDCContainerServiceRevisionResponse.RevisionListItem.ContainerServiceConfig.ContainerSpecsItem.LifecycleHook.PreStopExec;
import com.aliyuncs.sofa.model.v20190815.QueryLDCContainerServiceRevisionResponse.RevisionListItem.ContainerServiceConfig.ContainerSpecsItem.LifecycleHook.PreStopHttp;
import com.aliyuncs.sofa.model.v20190815.QueryLDCContainerServiceRevisionResponse.RevisionListItem.ContainerServiceConfig.ContainerSpecsItem.LifecycleHook.PreStopTcp;
import com.aliyuncs.sofa.model.v20190815.QueryLDCContainerServiceRevisionResponse.RevisionListItem.ContainerServiceConfig.ContainerSpecsItem.LogConfigsItem;
import com.aliyuncs.sofa.model.v20190815.QueryLDCContainerServiceRevisionResponse.RevisionListItem.ContainerServiceConfig.ContainerSpecsItem.VolumeMountsItem;
import com.aliyuncs.sofa.model.v20190815.QueryLDCContainerServiceRevisionResponse.RevisionListItem.ContainerServiceConfig.ContainerSpecsItem.VolumeMountsItem.ConfigmapSecretVolumeSource;
import com.aliyuncs.sofa.model.v20190815.QueryLDCContainerServiceRevisionResponse.RevisionListItem.ContainerServiceConfig.ContainerSpecsItem.VolumeMountsItem.EmptyDirVolumeSource;
import com.aliyuncs.sofa.model.v20190815.QueryLDCContainerServiceRevisionResponse.RevisionListItem.ContainerServiceConfig.ContainerSpecsItem.VolumeMountsItem.LocalDiskVolumeSource;
import com.aliyuncs.sofa.model.v20190815.QueryLDCContainerServiceRevisionResponse.RevisionListItem.ContainerServiceConfig.ContainerSpecsItem.VolumeMountsItem.PvcSource;
import com.aliyuncs.sofa.model.v20190815.QueryLDCContainerServiceRevisionResponse.RevisionListItem.ContainerServiceConfig.DeployConfig;
import com.aliyuncs.sofa.model.v20190815.QueryLDCContainerServiceRevisionResponse.RevisionListItem.ContainerServiceConfig.DeployConfig.Affinity;
import com.aliyuncs.sofa.model.v20190815.QueryLDCContainerServiceRevisionResponse.RevisionListItem.ContainerServiceConfig.DeployConfig.Affinity.NodeAffinityItem;
import com.aliyuncs.sofa.model.v20190815.QueryLDCContainerServiceRevisionResponse.RevisionListItem.ContainerServiceConfig.DeployConfig.Affinity.NodeAffinityItem.MatchExpressionsItem;
import com.aliyuncs.sofa.model.v20190815.QueryLDCContainerServiceRevisionResponse.RevisionListItem.ContainerServiceConfig.DeployConfig.Affinity.PodAffinityItem;
import com.aliyuncs.sofa.model.v20190815.QueryLDCContainerServiceRevisionResponse.RevisionListItem.ContainerServiceConfig.DeployConfig.Affinity.PodAffinityItem.PodAffinityTerm;
import com.aliyuncs.sofa.model.v20190815.QueryLDCContainerServiceRevisionResponse.RevisionListItem.ContainerServiceConfig.DeployConfig.Affinity.PodAffinityItem.PodAffinityTerm.LabelSelectorItem;
import com.aliyuncs.sofa.model.v20190815.QueryLDCContainerServiceRevisionResponse.RevisionListItem.ContainerServiceConfig.ElasticConfig;
import com.aliyuncs.sofa.model.v20190815.QueryLDCContainerServiceRevisionResponse.RevisionListItem.ContainerServiceConfig.ElasticConfig.FixedReplica;
import com.aliyuncs.sofa.model.v20190815.QueryLDCContainerServiceRevisionResponse.RevisionListItem.ContainerServiceConfig.ElasticConfig.FixedReplica.ReplicasItem;
import com.aliyuncs.sofa.model.v20190815.QueryLDCContainerServiceRevisionResponse.RevisionListItem.ContainerServiceConfig.ElasticConfig.Hpa;
import com.aliyuncs.sofa.model.v20190815.QueryLDCContainerServiceRevisionResponse.RevisionListItem.ContainerServiceConfig.ElasticConfig.Hpa.CellsItem;
import com.aliyuncs.sofa.model.v20190815.QueryLDCContainerServiceRevisionResponse.RevisionListItem.ContainerServiceConfig.ElasticConfig.Hpa.MetricsItem;
import com.aliyuncs.sofa.model.v20190815.QueryLDCContainerServiceRevisionResponse.RevisionListItem.ContainerServiceConfig.ElasticConfig.Hpa.MetricsItem.Target;
import com.aliyuncs.sofa.model.v20190815.QueryLDCContainerServiceRevisionResponse.RevisionListItem.ContainerServiceConfig.ElasticConfig.Hpa.MetricsItem.Target.Value;
import com.aliyuncs.sofa.model.v20190815.QueryLDCContainerServiceRevisionResponse.RevisionListItem.ContainerServiceConfig.IngressesItem;
import com.aliyuncs.sofa.model.v20190815.QueryLDCContainerServiceRevisionResponse.RevisionListItem.ContainerServiceConfig.IngressesItem.ListenersItem;
import com.aliyuncs.sofa.model.v20190815.QueryLDCContainerServiceRevisionResponse.RevisionListItem.ContainerServiceConfig.IngressesItem.ListenersV2Item;
import com.aliyuncs.sofa.model.v20190815.QueryLDCContainerServiceRevisionResponse.RevisionListItem.ContainerServiceConfig.InnerLoadBalancerServicesItem;
import com.aliyuncs.sofa.model.v20190815.QueryLDCContainerServiceRevisionResponse.RevisionListItem.ContainerServiceConfig.InnerLoadBalancerServicesItem.CellSlbIaasIdMapItem;
import com.aliyuncs.sofa.model.v20190815.QueryLDCContainerServiceRevisionResponse.RevisionListItem.ContainerServiceConfig.InnerLoadBalancerServicesItem.ListenersItem5;
import com.aliyuncs.sofa.model.v20190815.QueryLDCContainerServiceRevisionResponse.RevisionListItem.ContainerServiceConfig.LoadBalancerServicesItem;
import com.aliyuncs.sofa.model.v20190815.QueryLDCContainerServiceRevisionResponse.RevisionListItem.ContainerServiceConfig.LoadBalancerServicesItem.CellSlbIaasIdMapItem13;
import com.aliyuncs.sofa.model.v20190815.QueryLDCContainerServiceRevisionResponse.RevisionListItem.ContainerServiceConfig.LoadBalancerServicesItem.ListenersItem12;
import com.aliyuncs.sofa.model.v20190815.QueryLDCContainerServiceRevisionResponse.RevisionListItem.ContainerServiceConfig.PublicLoadBalancerServicesItem;
import com.aliyuncs.sofa.model.v20190815.QueryLDCContainerServiceRevisionResponse.RevisionListItem.ContainerServiceConfig.PublicLoadBalancerServicesItem.CellSlbIaasIdMapItem9;
import com.aliyuncs.sofa.model.v20190815.QueryLDCContainerServiceRevisionResponse.RevisionListItem.ContainerServiceConfig.PublicLoadBalancerServicesItem.ListenersItem8;
import com.aliyuncs.sofa.model.v20190815.QueryLDCContainerServiceRevisionResponse.RevisionListItem.ContainerServiceConfig.SidecarConfigsItem;
import com.aliyuncs.sofa.model.v20190815.QueryLDCContainerServiceRevisionResponse.RevisionListItem.ContainerServiceReleaseInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryLDCContainerServiceRevisionResponseUnmarshaller {

	public static QueryLDCContainerServiceRevisionResponse unmarshall(QueryLDCContainerServiceRevisionResponse queryLDCContainerServiceRevisionResponse, UnmarshallerContext _ctx) {
		
		queryLDCContainerServiceRevisionResponse.setRequestId(_ctx.stringValue("QueryLDCContainerServiceRevisionResponse.RequestId"));
		queryLDCContainerServiceRevisionResponse.setResultCode(_ctx.stringValue("QueryLDCContainerServiceRevisionResponse.ResultCode"));
		queryLDCContainerServiceRevisionResponse.setResultMessage(_ctx.stringValue("QueryLDCContainerServiceRevisionResponse.ResultMessage"));
		queryLDCContainerServiceRevisionResponse.setPageNumber(_ctx.longValue("QueryLDCContainerServiceRevisionResponse.PageNumber"));
		queryLDCContainerServiceRevisionResponse.setPageSize(_ctx.longValue("QueryLDCContainerServiceRevisionResponse.PageSize"));
		queryLDCContainerServiceRevisionResponse.setTotalCount(_ctx.longValue("QueryLDCContainerServiceRevisionResponse.TotalCount"));

		List<RevisionListItem> revisionList = new ArrayList<RevisionListItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryLDCContainerServiceRevisionResponse.RevisionList.Length"); i++) {
			RevisionListItem revisionListItem = new RevisionListItem();
			revisionListItem.setContainerServiceName(_ctx.stringValue("QueryLDCContainerServiceRevisionResponse.RevisionList["+ i +"].ContainerServiceName"));
			revisionListItem.setCreatedTime(_ctx.stringValue("QueryLDCContainerServiceRevisionResponse.RevisionList["+ i +"].CreatedTime"));
			revisionListItem.setDeployStatus(_ctx.stringValue("QueryLDCContainerServiceRevisionResponse.RevisionList["+ i +"].DeployStatus"));
			revisionListItem.setDescription(_ctx.stringValue("QueryLDCContainerServiceRevisionResponse.RevisionList["+ i +"].Description"));
			revisionListItem.setLastPlanId(_ctx.stringValue("QueryLDCContainerServiceRevisionResponse.RevisionList["+ i +"].LastPlanId"));
			revisionListItem.setMetaStatus(_ctx.stringValue("QueryLDCContainerServiceRevisionResponse.RevisionList["+ i +"].MetaStatus"));
			revisionListItem.setModifiedTime(_ctx.stringValue("QueryLDCContainerServiceRevisionResponse.RevisionList["+ i +"].ModifiedTime"));
			revisionListItem.setNamespace(_ctx.stringValue("QueryLDCContainerServiceRevisionResponse.RevisionList["+ i +"].Namespace"));
			revisionListItem.setOperator(_ctx.stringValue("QueryLDCContainerServiceRevisionResponse.RevisionList["+ i +"].Operator"));
			revisionListItem.setRemarks(_ctx.stringValue("QueryLDCContainerServiceRevisionResponse.RevisionList["+ i +"].Remarks"));
			revisionListItem.setRevision(_ctx.stringValue("QueryLDCContainerServiceRevisionResponse.RevisionList["+ i +"].Revision"));

			AppInfo appInfo = new AppInfo();
			appInfo.setBuildpackVersion(_ctx.stringValue("QueryLDCContainerServiceRevisionResponse.RevisionList["+ i +"].AppInfo.BuildpackVersion"));
			appInfo.setDescription(_ctx.stringValue("QueryLDCContainerServiceRevisionResponse.RevisionList["+ i +"].AppInfo.Description"));
			appInfo.setId(_ctx.stringValue("QueryLDCContainerServiceRevisionResponse.RevisionList["+ i +"].AppInfo.Id"));
			appInfo.setName(_ctx.stringValue("QueryLDCContainerServiceRevisionResponse.RevisionList["+ i +"].AppInfo.Name"));
			appInfo.setOwner(_ctx.stringValue("QueryLDCContainerServiceRevisionResponse.RevisionList["+ i +"].AppInfo.Owner"));
			appInfo.setTechstackIdentity(_ctx.stringValue("QueryLDCContainerServiceRevisionResponse.RevisionList["+ i +"].AppInfo.TechstackIdentity"));
			appInfo.setOwnerId(_ctx.stringValue("QueryLDCContainerServiceRevisionResponse.RevisionList["+ i +"].AppInfo.OwnerId"));
			revisionListItem.setAppInfo(appInfo);

			ContainerServiceConfig containerServiceConfig = new ContainerServiceConfig();
			containerServiceConfig.setEnableBizMonitor(_ctx.booleanValue("QueryLDCContainerServiceRevisionResponse.RevisionList["+ i +"].ContainerServiceConfig.EnableBizMonitor"));
			containerServiceConfig.setEnableLogConfig(_ctx.booleanValue("QueryLDCContainerServiceRevisionResponse.RevisionList["+ i +"].ContainerServiceConfig.EnableLogConfig"));
			containerServiceConfig.setEnableSofaMesh(_ctx.booleanValue("QueryLDCContainerServiceRevisionResponse.RevisionList["+ i +"].ContainerServiceConfig.EnableSofaMesh"));
			containerServiceConfig.setUseHostNetwork(_ctx.booleanValue("QueryLDCContainerServiceRevisionResponse.RevisionList["+ i +"].ContainerServiceConfig.UseHostNetwork"));

			List<String> bizMonitorPaths = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("QueryLDCContainerServiceRevisionResponse.RevisionList["+ i +"].ContainerServiceConfig.BizMonitorPaths.Length"); j++) {
				bizMonitorPaths.add(_ctx.stringValue("QueryLDCContainerServiceRevisionResponse.RevisionList["+ i +"].ContainerServiceConfig.BizMonitorPaths["+ j +"]"));
			}
			containerServiceConfig.setBizMonitorPaths(bizMonitorPaths);

			DeployConfig deployConfig = new DeployConfig();
			deployConfig.setAnnotations(_ctx.stringValue("QueryLDCContainerServiceRevisionResponse.RevisionList["+ i +"].ContainerServiceConfig.DeployConfig.Annotations"));
			deployConfig.setCustomLabels(_ctx.stringValue("QueryLDCContainerServiceRevisionResponse.RevisionList["+ i +"].ContainerServiceConfig.DeployConfig.CustomLabels"));
			deployConfig.setGroupCount(_ctx.longValue("QueryLDCContainerServiceRevisionResponse.RevisionList["+ i +"].ContainerServiceConfig.DeployConfig.GroupCount"));
			deployConfig.setGroupStrategy(_ctx.stringValue("QueryLDCContainerServiceRevisionResponse.RevisionList["+ i +"].ContainerServiceConfig.DeployConfig.GroupStrategy"));
			deployConfig.setLabels(_ctx.stringValue("QueryLDCContainerServiceRevisionResponse.RevisionList["+ i +"].ContainerServiceConfig.DeployConfig.Labels"));
			deployConfig.setMaxGroupCapacity(_ctx.longValue("QueryLDCContainerServiceRevisionResponse.RevisionList["+ i +"].ContainerServiceConfig.DeployConfig.MaxGroupCapacity"));
			deployConfig.setNeedBeta(_ctx.booleanValue("QueryLDCContainerServiceRevisionResponse.RevisionList["+ i +"].ContainerServiceConfig.DeployConfig.NeedBeta"));
			deployConfig.setNeedConfirm(_ctx.booleanValue("QueryLDCContainerServiceRevisionResponse.RevisionList["+ i +"].ContainerServiceConfig.DeployConfig.NeedConfirm"));
			deployConfig.setEnableSofaMesh(_ctx.booleanValue("QueryLDCContainerServiceRevisionResponse.RevisionList["+ i +"].ContainerServiceConfig.DeployConfig.EnableSofaMesh"));

			Affinity affinity = new Affinity();

			List<NodeAffinityItem> nodeAffinity = new ArrayList<NodeAffinityItem>();
			for (int j = 0; j < _ctx.lengthValue("QueryLDCContainerServiceRevisionResponse.RevisionList["+ i +"].ContainerServiceConfig.DeployConfig.Affinity.NodeAffinity.Length"); j++) {
				NodeAffinityItem nodeAffinityItem = new NodeAffinityItem();
				nodeAffinityItem.setRequested(_ctx.booleanValue("QueryLDCContainerServiceRevisionResponse.RevisionList["+ i +"].ContainerServiceConfig.DeployConfig.Affinity.NodeAffinity["+ j +"].Requested"));
				nodeAffinityItem.setWeight(_ctx.longValue("QueryLDCContainerServiceRevisionResponse.RevisionList["+ i +"].ContainerServiceConfig.DeployConfig.Affinity.NodeAffinity["+ j +"].Weight"));

				List<MatchExpressionsItem> matchExpressions = new ArrayList<MatchExpressionsItem>();
				for (int k = 0; k < _ctx.lengthValue("QueryLDCContainerServiceRevisionResponse.RevisionList["+ i +"].ContainerServiceConfig.DeployConfig.Affinity.NodeAffinity["+ j +"].MatchExpressions.Length"); k++) {
					MatchExpressionsItem matchExpressionsItem = new MatchExpressionsItem();
					matchExpressionsItem.setKey(_ctx.stringValue("QueryLDCContainerServiceRevisionResponse.RevisionList["+ i +"].ContainerServiceConfig.DeployConfig.Affinity.NodeAffinity["+ j +"].MatchExpressions["+ k +"].Key"));
					matchExpressionsItem.setOperator(_ctx.stringValue("QueryLDCContainerServiceRevisionResponse.RevisionList["+ i +"].ContainerServiceConfig.DeployConfig.Affinity.NodeAffinity["+ j +"].MatchExpressions["+ k +"].Operator"));

					List<String> values = new ArrayList<String>();
					for (int l = 0; l < _ctx.lengthValue("QueryLDCContainerServiceRevisionResponse.RevisionList["+ i +"].ContainerServiceConfig.DeployConfig.Affinity.NodeAffinity["+ j +"].MatchExpressions["+ k +"].Values.Length"); l++) {
						values.add(_ctx.stringValue("QueryLDCContainerServiceRevisionResponse.RevisionList["+ i +"].ContainerServiceConfig.DeployConfig.Affinity.NodeAffinity["+ j +"].MatchExpressions["+ k +"].Values["+ l +"]"));
					}
					matchExpressionsItem.setValues(values);

					matchExpressions.add(matchExpressionsItem);
				}
				nodeAffinityItem.setMatchExpressions(matchExpressions);

				nodeAffinity.add(nodeAffinityItem);
			}
			affinity.setNodeAffinity(nodeAffinity);

			List<PodAffinityItem> podAffinity = new ArrayList<PodAffinityItem>();
			for (int j = 0; j < _ctx.lengthValue("QueryLDCContainerServiceRevisionResponse.RevisionList["+ i +"].ContainerServiceConfig.DeployConfig.Affinity.PodAffinity.Length"); j++) {
				PodAffinityItem podAffinityItem = new PodAffinityItem();
				podAffinityItem.setAntiAffinity(_ctx.booleanValue("QueryLDCContainerServiceRevisionResponse.RevisionList["+ i +"].ContainerServiceConfig.DeployConfig.Affinity.PodAffinity["+ j +"].AntiAffinity"));
				podAffinityItem.setRequested(_ctx.booleanValue("QueryLDCContainerServiceRevisionResponse.RevisionList["+ i +"].ContainerServiceConfig.DeployConfig.Affinity.PodAffinity["+ j +"].Requested"));
				podAffinityItem.setWeight(_ctx.longValue("QueryLDCContainerServiceRevisionResponse.RevisionList["+ i +"].ContainerServiceConfig.DeployConfig.Affinity.PodAffinity["+ j +"].Weight"));

				PodAffinityTerm podAffinityTerm = new PodAffinityTerm();
				podAffinityTerm.setTopologyKey(_ctx.stringValue("QueryLDCContainerServiceRevisionResponse.RevisionList["+ i +"].ContainerServiceConfig.DeployConfig.Affinity.PodAffinity["+ j +"].PodAffinityTerm.TopologyKey"));

				List<String> namespaces = new ArrayList<String>();
				for (int k = 0; k < _ctx.lengthValue("QueryLDCContainerServiceRevisionResponse.RevisionList["+ i +"].ContainerServiceConfig.DeployConfig.Affinity.PodAffinity["+ j +"].PodAffinityTerm.Namespaces.Length"); k++) {
					namespaces.add(_ctx.stringValue("QueryLDCContainerServiceRevisionResponse.RevisionList["+ i +"].ContainerServiceConfig.DeployConfig.Affinity.PodAffinity["+ j +"].PodAffinityTerm.Namespaces["+ k +"]"));
				}
				podAffinityTerm.setNamespaces(namespaces);

				List<LabelSelectorItem> labelSelector = new ArrayList<LabelSelectorItem>();
				for (int k = 0; k < _ctx.lengthValue("QueryLDCContainerServiceRevisionResponse.RevisionList["+ i +"].ContainerServiceConfig.DeployConfig.Affinity.PodAffinity["+ j +"].PodAffinityTerm.LabelSelector.Length"); k++) {
					LabelSelectorItem labelSelectorItem = new LabelSelectorItem();
					labelSelectorItem.setKey(_ctx.stringValue("QueryLDCContainerServiceRevisionResponse.RevisionList["+ i +"].ContainerServiceConfig.DeployConfig.Affinity.PodAffinity["+ j +"].PodAffinityTerm.LabelSelector["+ k +"].Key"));
					labelSelectorItem.setValue(_ctx.stringValue("QueryLDCContainerServiceRevisionResponse.RevisionList["+ i +"].ContainerServiceConfig.DeployConfig.Affinity.PodAffinity["+ j +"].PodAffinityTerm.LabelSelector["+ k +"].Value"));

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
			elasticConfig.setMode(_ctx.stringValue("QueryLDCContainerServiceRevisionResponse.RevisionList["+ i +"].ContainerServiceConfig.ElasticConfig.Mode"));

			FixedReplica fixedReplica = new FixedReplica();

			List<ReplicasItem> replicas = new ArrayList<ReplicasItem>();
			for (int j = 0; j < _ctx.lengthValue("QueryLDCContainerServiceRevisionResponse.RevisionList["+ i +"].ContainerServiceConfig.ElasticConfig.FixedReplica.Replicas.Length"); j++) {
				ReplicasItem replicasItem = new ReplicasItem();
				replicasItem.setType(_ctx.stringValue("QueryLDCContainerServiceRevisionResponse.RevisionList["+ i +"].ContainerServiceConfig.ElasticConfig.FixedReplica.Replicas["+ j +"].Type"));
				replicasItem.setName(_ctx.stringValue("QueryLDCContainerServiceRevisionResponse.RevisionList["+ i +"].ContainerServiceConfig.ElasticConfig.FixedReplica.Replicas["+ j +"].Name"));
				replicasItem.setCount(_ctx.longValue("QueryLDCContainerServiceRevisionResponse.RevisionList["+ i +"].ContainerServiceConfig.ElasticConfig.FixedReplica.Replicas["+ j +"].Count"));

				replicas.add(replicasItem);
			}
			fixedReplica.setReplicas(replicas);
			elasticConfig.setFixedReplica(fixedReplica);

			Hpa hpa = new Hpa();
			hpa.setMinReplica(_ctx.longValue("QueryLDCContainerServiceRevisionResponse.RevisionList["+ i +"].ContainerServiceConfig.ElasticConfig.Hpa.MinReplica"));
			hpa.setMaxReplica(_ctx.longValue("QueryLDCContainerServiceRevisionResponse.RevisionList["+ i +"].ContainerServiceConfig.ElasticConfig.Hpa.MaxReplica"));

			List<CellsItem> cells = new ArrayList<CellsItem>();
			for (int j = 0; j < _ctx.lengthValue("QueryLDCContainerServiceRevisionResponse.RevisionList["+ i +"].ContainerServiceConfig.ElasticConfig.Hpa.Cells.Length"); j++) {
				CellsItem cellsItem = new CellsItem();
				cellsItem.setName(_ctx.stringValue("QueryLDCContainerServiceRevisionResponse.RevisionList["+ i +"].ContainerServiceConfig.ElasticConfig.Hpa.Cells["+ j +"].Name"));
				cellsItem.setReplicas(_ctx.longValue("QueryLDCContainerServiceRevisionResponse.RevisionList["+ i +"].ContainerServiceConfig.ElasticConfig.Hpa.Cells["+ j +"].Replicas"));

				cells.add(cellsItem);
			}
			hpa.setCells(cells);

			List<MetricsItem> metrics = new ArrayList<MetricsItem>();
			for (int j = 0; j < _ctx.lengthValue("QueryLDCContainerServiceRevisionResponse.RevisionList["+ i +"].ContainerServiceConfig.ElasticConfig.Hpa.Metrics.Length"); j++) {
				MetricsItem metricsItem = new MetricsItem();
				metricsItem.setName(_ctx.stringValue("QueryLDCContainerServiceRevisionResponse.RevisionList["+ i +"].ContainerServiceConfig.ElasticConfig.Hpa.Metrics["+ j +"].Name"));

				Target target = new Target();
				target.setType(_ctx.stringValue("QueryLDCContainerServiceRevisionResponse.RevisionList["+ i +"].ContainerServiceConfig.ElasticConfig.Hpa.Metrics["+ j +"].Target.Type"));
				target.setUtilization(_ctx.longValue("QueryLDCContainerServiceRevisionResponse.RevisionList["+ i +"].ContainerServiceConfig.ElasticConfig.Hpa.Metrics["+ j +"].Target.Utilization"));

				Value value = new Value();
				value.setValue(_ctx.longValue("QueryLDCContainerServiceRevisionResponse.RevisionList["+ i +"].ContainerServiceConfig.ElasticConfig.Hpa.Metrics["+ j +"].Target.Value.Value"));
				value.setUnit(_ctx.stringValue("QueryLDCContainerServiceRevisionResponse.RevisionList["+ i +"].ContainerServiceConfig.ElasticConfig.Hpa.Metrics["+ j +"].Target.Value.Unit"));
				target.setValue(value);
				metricsItem.setTarget(target);

				metrics.add(metricsItem);
			}
			hpa.setMetrics(metrics);
			elasticConfig.setHpa(hpa);
			containerServiceConfig.setElasticConfig(elasticConfig);

			List<ClusterIpServicesItem> clusterIpServices = new ArrayList<ClusterIpServicesItem>();
			for (int j = 0; j < _ctx.lengthValue("QueryLDCContainerServiceRevisionResponse.RevisionList["+ i +"].ContainerServiceConfig.ClusterIpServices.Length"); j++) {
				ClusterIpServicesItem clusterIpServicesItem = new ClusterIpServicesItem();
				clusterIpServicesItem.setName(_ctx.stringValue("QueryLDCContainerServiceRevisionResponse.RevisionList["+ i +"].ContainerServiceConfig.ClusterIpServices["+ j +"].Name"));

				List<PortsItem> ports = new ArrayList<PortsItem>();
				for (int k = 0; k < _ctx.lengthValue("QueryLDCContainerServiceRevisionResponse.RevisionList["+ i +"].ContainerServiceConfig.ClusterIpServices["+ j +"].Ports.Length"); k++) {
					PortsItem portsItem = new PortsItem();
					portsItem.setPort(_ctx.longValue("QueryLDCContainerServiceRevisionResponse.RevisionList["+ i +"].ContainerServiceConfig.ClusterIpServices["+ j +"].Ports["+ k +"].Port"));
					portsItem.setBizProtocol(_ctx.stringValue("QueryLDCContainerServiceRevisionResponse.RevisionList["+ i +"].ContainerServiceConfig.ClusterIpServices["+ j +"].Ports["+ k +"].Protocol"));
					portsItem.setTargetPort(_ctx.longValue("QueryLDCContainerServiceRevisionResponse.RevisionList["+ i +"].ContainerServiceConfig.ClusterIpServices["+ j +"].Ports["+ k +"].TargetPort"));

					ports.add(portsItem);
				}
				clusterIpServicesItem.setPorts(ports);

				clusterIpServices.add(clusterIpServicesItem);
			}
			containerServiceConfig.setClusterIpServices(clusterIpServices);

			List<ContainerSpecsItem> containerSpecs = new ArrayList<ContainerSpecsItem>();
			for (int j = 0; j < _ctx.lengthValue("QueryLDCContainerServiceRevisionResponse.RevisionList["+ i +"].ContainerServiceConfig.ContainerSpecs.Length"); j++) {
				ContainerSpecsItem containerSpecsItem = new ContainerSpecsItem();
				containerSpecsItem.setCpuLimit(_ctx.stringValue("QueryLDCContainerServiceRevisionResponse.RevisionList["+ i +"].ContainerServiceConfig.ContainerSpecs["+ j +"].CpuLimit"));
				containerSpecsItem.setCpuRequest(_ctx.stringValue("QueryLDCContainerServiceRevisionResponse.RevisionList["+ i +"].ContainerServiceConfig.ContainerSpecs["+ j +"].CpuRequest"));
				containerSpecsItem.setImage(_ctx.stringValue("QueryLDCContainerServiceRevisionResponse.RevisionList["+ i +"].ContainerServiceConfig.ContainerSpecs["+ j +"].Image"));
				containerSpecsItem.setImageBuildName(_ctx.stringValue("QueryLDCContainerServiceRevisionResponse.RevisionList["+ i +"].ContainerServiceConfig.ContainerSpecs["+ j +"].ImageBuildName"));
				containerSpecsItem.setImagePullSecret(_ctx.stringValue("QueryLDCContainerServiceRevisionResponse.RevisionList["+ i +"].ContainerServiceConfig.ContainerSpecs["+ j +"].ImagePullSecret"));
				containerSpecsItem.setImageSource(_ctx.stringValue("QueryLDCContainerServiceRevisionResponse.RevisionList["+ i +"].ContainerServiceConfig.ContainerSpecs["+ j +"].ImageSource"));
				containerSpecsItem.setMemoryLimit(_ctx.stringValue("QueryLDCContainerServiceRevisionResponse.RevisionList["+ i +"].ContainerServiceConfig.ContainerSpecs["+ j +"].MemoryLimit"));
				containerSpecsItem.setMemoryRequest(_ctx.stringValue("QueryLDCContainerServiceRevisionResponse.RevisionList["+ i +"].ContainerServiceConfig.ContainerSpecs["+ j +"].MemoryRequest"));
				containerSpecsItem.setName(_ctx.stringValue("QueryLDCContainerServiceRevisionResponse.RevisionList["+ i +"].ContainerServiceConfig.ContainerSpecs["+ j +"].Name"));
				containerSpecsItem.setRestartPolicy(_ctx.stringValue("QueryLDCContainerServiceRevisionResponse.RevisionList["+ i +"].ContainerServiceConfig.ContainerSpecs["+ j +"].RestartPolicy"));
				containerSpecsItem.setType(_ctx.stringValue("QueryLDCContainerServiceRevisionResponse.RevisionList["+ i +"].ContainerServiceConfig.ContainerSpecs["+ j +"].Type"));
				containerSpecsItem.setVolumeMountsStr(_ctx.stringValue("QueryLDCContainerServiceRevisionResponse.RevisionList["+ i +"].ContainerServiceConfig.ContainerSpecs["+ j +"].VolumeMountsStr"));
				containerSpecsItem.setVolumesStr(_ctx.stringValue("QueryLDCContainerServiceRevisionResponse.RevisionList["+ i +"].ContainerServiceConfig.ContainerSpecs["+ j +"].VolumesStr"));

				List<String> entryPoints = new ArrayList<String>();
				for (int k = 0; k < _ctx.lengthValue("QueryLDCContainerServiceRevisionResponse.RevisionList["+ i +"].ContainerServiceConfig.ContainerSpecs["+ j +"].EntryPoints.Length"); k++) {
					entryPoints.add(_ctx.stringValue("QueryLDCContainerServiceRevisionResponse.RevisionList["+ i +"].ContainerServiceConfig.ContainerSpecs["+ j +"].EntryPoints["+ k +"]"));
				}
				containerSpecsItem.setEntryPoints(entryPoints);

				HealthCheckConfig healthCheckConfig = new HealthCheckConfig();

				LivenessProbe livenessProbe = new LivenessProbe();
				livenessProbe.setFailureThreshold(_ctx.longValue("QueryLDCContainerServiceRevisionResponse.RevisionList["+ i +"].ContainerServiceConfig.ContainerSpecs["+ j +"].HealthCheckConfig.LivenessProbe.FailureThreshold"));
				livenessProbe.setInitialDelaySeconds(_ctx.longValue("QueryLDCContainerServiceRevisionResponse.RevisionList["+ i +"].ContainerServiceConfig.ContainerSpecs["+ j +"].HealthCheckConfig.LivenessProbe.InitialDelaySeconds"));
				livenessProbe.setPeriodSeconds(_ctx.longValue("QueryLDCContainerServiceRevisionResponse.RevisionList["+ i +"].ContainerServiceConfig.ContainerSpecs["+ j +"].HealthCheckConfig.LivenessProbe.PeriodSeconds"));
				livenessProbe.setSuccessThreshold(_ctx.longValue("QueryLDCContainerServiceRevisionResponse.RevisionList["+ i +"].ContainerServiceConfig.ContainerSpecs["+ j +"].HealthCheckConfig.LivenessProbe.SuccessThreshold"));
				livenessProbe.setTimeOutSeconds(_ctx.longValue("QueryLDCContainerServiceRevisionResponse.RevisionList["+ i +"].ContainerServiceConfig.ContainerSpecs["+ j +"].HealthCheckConfig.LivenessProbe.TimeOutSeconds"));

				ExecAction execAction = new ExecAction();
				execAction.setCommand(_ctx.stringValue("QueryLDCContainerServiceRevisionResponse.RevisionList["+ i +"].ContainerServiceConfig.ContainerSpecs["+ j +"].HealthCheckConfig.LivenessProbe.ExecAction.Command"));
				livenessProbe.setExecAction(execAction);

				HttpGetAction httpGetAction = new HttpGetAction();
				httpGetAction.setPath(_ctx.stringValue("QueryLDCContainerServiceRevisionResponse.RevisionList["+ i +"].ContainerServiceConfig.ContainerSpecs["+ j +"].HealthCheckConfig.LivenessProbe.HttpGetAction.Path"));
				httpGetAction.setPort(_ctx.stringValue("QueryLDCContainerServiceRevisionResponse.RevisionList["+ i +"].ContainerServiceConfig.ContainerSpecs["+ j +"].HealthCheckConfig.LivenessProbe.HttpGetAction.Port"));
				httpGetAction.setScheme(_ctx.stringValue("QueryLDCContainerServiceRevisionResponse.RevisionList["+ i +"].ContainerServiceConfig.ContainerSpecs["+ j +"].HealthCheckConfig.LivenessProbe.HttpGetAction.Scheme"));
				livenessProbe.setHttpGetAction(httpGetAction);

				TcpSocketAction tcpSocketAction = new TcpSocketAction();
				tcpSocketAction.setPort(_ctx.stringValue("QueryLDCContainerServiceRevisionResponse.RevisionList["+ i +"].ContainerServiceConfig.ContainerSpecs["+ j +"].HealthCheckConfig.LivenessProbe.TcpSocketAction.Port"));
				livenessProbe.setTcpSocketAction(tcpSocketAction);
				healthCheckConfig.setLivenessProbe(livenessProbe);

				ReadinessProbe readinessProbe = new ReadinessProbe();
				readinessProbe.setFailureThreshold(_ctx.longValue("QueryLDCContainerServiceRevisionResponse.RevisionList["+ i +"].ContainerServiceConfig.ContainerSpecs["+ j +"].HealthCheckConfig.ReadinessProbe.FailureThreshold"));
				readinessProbe.setInitialDelaySeconds(_ctx.longValue("QueryLDCContainerServiceRevisionResponse.RevisionList["+ i +"].ContainerServiceConfig.ContainerSpecs["+ j +"].HealthCheckConfig.ReadinessProbe.InitialDelaySeconds"));
				readinessProbe.setPeriodSeconds(_ctx.longValue("QueryLDCContainerServiceRevisionResponse.RevisionList["+ i +"].ContainerServiceConfig.ContainerSpecs["+ j +"].HealthCheckConfig.ReadinessProbe.PeriodSeconds"));
				readinessProbe.setSuccessThreshold(_ctx.longValue("QueryLDCContainerServiceRevisionResponse.RevisionList["+ i +"].ContainerServiceConfig.ContainerSpecs["+ j +"].HealthCheckConfig.ReadinessProbe.SuccessThreshold"));
				readinessProbe.setTimeOutSeconds(_ctx.longValue("QueryLDCContainerServiceRevisionResponse.RevisionList["+ i +"].ContainerServiceConfig.ContainerSpecs["+ j +"].HealthCheckConfig.ReadinessProbe.TimeOutSeconds"));

				ExecAction1 execAction1 = new ExecAction1();
				execAction1.setCommand(_ctx.stringValue("QueryLDCContainerServiceRevisionResponse.RevisionList["+ i +"].ContainerServiceConfig.ContainerSpecs["+ j +"].HealthCheckConfig.ReadinessProbe.ExecAction.Command"));
				readinessProbe.setExecAction1(execAction1);

				HttpGetAction2 httpGetAction2 = new HttpGetAction2();
				httpGetAction2.setPath(_ctx.stringValue("QueryLDCContainerServiceRevisionResponse.RevisionList["+ i +"].ContainerServiceConfig.ContainerSpecs["+ j +"].HealthCheckConfig.ReadinessProbe.HttpGetAction.Path"));
				httpGetAction2.setPort(_ctx.stringValue("QueryLDCContainerServiceRevisionResponse.RevisionList["+ i +"].ContainerServiceConfig.ContainerSpecs["+ j +"].HealthCheckConfig.ReadinessProbe.HttpGetAction.Port"));
				httpGetAction2.setScheme(_ctx.stringValue("QueryLDCContainerServiceRevisionResponse.RevisionList["+ i +"].ContainerServiceConfig.ContainerSpecs["+ j +"].HealthCheckConfig.ReadinessProbe.HttpGetAction.Scheme"));
				readinessProbe.setHttpGetAction2(httpGetAction2);

				TcpSocketAction3 tcpSocketAction3 = new TcpSocketAction3();
				tcpSocketAction3.setPort(_ctx.stringValue("QueryLDCContainerServiceRevisionResponse.RevisionList["+ i +"].ContainerServiceConfig.ContainerSpecs["+ j +"].HealthCheckConfig.ReadinessProbe.TcpSocketAction.Port"));
				readinessProbe.setTcpSocketAction3(tcpSocketAction3);
				healthCheckConfig.setReadinessProbe(readinessProbe);
				containerSpecsItem.setHealthCheckConfig(healthCheckConfig);

				LifecycleHook lifecycleHook = new LifecycleHook();

				PostStartExec postStartExec = new PostStartExec();
				postStartExec.setCommand(_ctx.stringValue("QueryLDCContainerServiceRevisionResponse.RevisionList["+ i +"].ContainerServiceConfig.ContainerSpecs["+ j +"].LifecycleHook.PostStartExec.Command"));
				lifecycleHook.setPostStartExec(postStartExec);

				PostStartHttp postStartHttp = new PostStartHttp();
				postStartHttp.setPath(_ctx.stringValue("QueryLDCContainerServiceRevisionResponse.RevisionList["+ i +"].ContainerServiceConfig.ContainerSpecs["+ j +"].LifecycleHook.PostStartHttp.Path"));
				postStartHttp.setPort(_ctx.stringValue("QueryLDCContainerServiceRevisionResponse.RevisionList["+ i +"].ContainerServiceConfig.ContainerSpecs["+ j +"].LifecycleHook.PostStartHttp.Port"));
				postStartHttp.setScheme(_ctx.stringValue("QueryLDCContainerServiceRevisionResponse.RevisionList["+ i +"].ContainerServiceConfig.ContainerSpecs["+ j +"].LifecycleHook.PostStartHttp.Scheme"));
				lifecycleHook.setPostStartHttp(postStartHttp);

				PostStartTcp postStartTcp = new PostStartTcp();
				postStartTcp.setPort(_ctx.stringValue("QueryLDCContainerServiceRevisionResponse.RevisionList["+ i +"].ContainerServiceConfig.ContainerSpecs["+ j +"].LifecycleHook.PostStartTcp.Port"));
				lifecycleHook.setPostStartTcp(postStartTcp);

				PreStopExec preStopExec = new PreStopExec();
				preStopExec.setCommand(_ctx.stringValue("QueryLDCContainerServiceRevisionResponse.RevisionList["+ i +"].ContainerServiceConfig.ContainerSpecs["+ j +"].LifecycleHook.PreStopExec.Command"));
				lifecycleHook.setPreStopExec(preStopExec);

				PreStopHttp preStopHttp = new PreStopHttp();
				preStopHttp.setPath(_ctx.stringValue("QueryLDCContainerServiceRevisionResponse.RevisionList["+ i +"].ContainerServiceConfig.ContainerSpecs["+ j +"].LifecycleHook.PreStopHttp.Path"));
				preStopHttp.setPort(_ctx.stringValue("QueryLDCContainerServiceRevisionResponse.RevisionList["+ i +"].ContainerServiceConfig.ContainerSpecs["+ j +"].LifecycleHook.PreStopHttp.Port"));
				preStopHttp.setScheme(_ctx.stringValue("QueryLDCContainerServiceRevisionResponse.RevisionList["+ i +"].ContainerServiceConfig.ContainerSpecs["+ j +"].LifecycleHook.PreStopHttp.Scheme"));
				lifecycleHook.setPreStopHttp(preStopHttp);

				PreStopTcp preStopTcp = new PreStopTcp();
				preStopTcp.setPort(_ctx.stringValue("QueryLDCContainerServiceRevisionResponse.RevisionList["+ i +"].ContainerServiceConfig.ContainerSpecs["+ j +"].LifecycleHook.PreStopTcp.Port"));
				lifecycleHook.setPreStopTcp(preStopTcp);
				containerSpecsItem.setLifecycleHook(lifecycleHook);

				List<EnvsItem> envs = new ArrayList<EnvsItem>();
				for (int k = 0; k < _ctx.lengthValue("QueryLDCContainerServiceRevisionResponse.RevisionList["+ i +"].ContainerServiceConfig.ContainerSpecs["+ j +"].Envs.Length"); k++) {
					EnvsItem envsItem = new EnvsItem();
					envsItem.setName(_ctx.stringValue("QueryLDCContainerServiceRevisionResponse.RevisionList["+ i +"].ContainerServiceConfig.ContainerSpecs["+ j +"].Envs["+ k +"].Name"));
					envsItem.setValue(_ctx.stringValue("QueryLDCContainerServiceRevisionResponse.RevisionList["+ i +"].ContainerServiceConfig.ContainerSpecs["+ j +"].Envs["+ k +"].Value"));
					envsItem.setType(_ctx.stringValue("QueryLDCContainerServiceRevisionResponse.RevisionList["+ i +"].ContainerServiceConfig.ContainerSpecs["+ j +"].Envs["+ k +"].Type"));

					ValueFrom valueFrom = new ValueFrom();
					valueFrom.setObjectName(_ctx.stringValue("QueryLDCContainerServiceRevisionResponse.RevisionList["+ i +"].ContainerServiceConfig.ContainerSpecs["+ j +"].Envs["+ k +"].ValueFrom.ObjectName"));
					valueFrom.setObjectType(_ctx.stringValue("QueryLDCContainerServiceRevisionResponse.RevisionList["+ i +"].ContainerServiceConfig.ContainerSpecs["+ j +"].Envs["+ k +"].ValueFrom.ObjectType"));
					valueFrom.setKey(_ctx.stringValue("QueryLDCContainerServiceRevisionResponse.RevisionList["+ i +"].ContainerServiceConfig.ContainerSpecs["+ j +"].Envs["+ k +"].ValueFrom.Key"));
					envsItem.setValueFrom(valueFrom);

					envs.add(envsItem);
				}
				containerSpecsItem.setEnvs(envs);

				List<EnvOverridesItem> envOverrides = new ArrayList<EnvOverridesItem>();
				for (int k = 0; k < _ctx.lengthValue("QueryLDCContainerServiceRevisionResponse.RevisionList["+ i +"].ContainerServiceConfig.ContainerSpecs["+ j +"].EnvOverrides.Length"); k++) {
					EnvOverridesItem envOverridesItem = new EnvOverridesItem();
					envOverridesItem.setCell(_ctx.stringValue("QueryLDCContainerServiceRevisionResponse.RevisionList["+ i +"].ContainerServiceConfig.ContainerSpecs["+ j +"].EnvOverrides["+ k +"].Cell"));
					envOverridesItem.setName(_ctx.stringValue("QueryLDCContainerServiceRevisionResponse.RevisionList["+ i +"].ContainerServiceConfig.ContainerSpecs["+ j +"].EnvOverrides["+ k +"].Name"));
					envOverridesItem.setValue(_ctx.stringValue("QueryLDCContainerServiceRevisionResponse.RevisionList["+ i +"].ContainerServiceConfig.ContainerSpecs["+ j +"].EnvOverrides["+ k +"].Value"));

					envOverrides.add(envOverridesItem);
				}
				containerSpecsItem.setEnvOverrides(envOverrides);

				List<LogConfigsItem> logConfigs = new ArrayList<LogConfigsItem>();
				for (int k = 0; k < _ctx.lengthValue("QueryLDCContainerServiceRevisionResponse.RevisionList["+ i +"].ContainerServiceConfig.ContainerSpecs["+ j +"].LogConfigs.Length"); k++) {
					LogConfigsItem logConfigsItem = new LogConfigsItem();
					logConfigsItem.setConfigName(_ctx.stringValue("QueryLDCContainerServiceRevisionResponse.RevisionList["+ i +"].ContainerServiceConfig.ContainerSpecs["+ j +"].LogConfigs["+ k +"].ConfigName"));
					logConfigsItem.setInputType(_ctx.stringValue("QueryLDCContainerServiceRevisionResponse.RevisionList["+ i +"].ContainerServiceConfig.ContainerSpecs["+ j +"].LogConfigs["+ k +"].InputType"));
					logConfigsItem.setLogstoreName(_ctx.stringValue("QueryLDCContainerServiceRevisionResponse.RevisionList["+ i +"].ContainerServiceConfig.ContainerSpecs["+ j +"].LogConfigs["+ k +"].LogstoreName"));
					logConfigsItem.setLogPath(_ctx.stringValue("QueryLDCContainerServiceRevisionResponse.RevisionList["+ i +"].ContainerServiceConfig.ContainerSpecs["+ j +"].LogConfigs["+ k +"].LogPath"));
					logConfigsItem.setFilePattern(_ctx.stringValue("QueryLDCContainerServiceRevisionResponse.RevisionList["+ i +"].ContainerServiceConfig.ContainerSpecs["+ j +"].LogConfigs["+ k +"].FilePattern"));

					logConfigs.add(logConfigsItem);
				}
				containerSpecsItem.setLogConfigs(logConfigs);

				List<VolumeMountsItem> volumeMounts = new ArrayList<VolumeMountsItem>();
				for (int k = 0; k < _ctx.lengthValue("QueryLDCContainerServiceRevisionResponse.RevisionList["+ i +"].ContainerServiceConfig.ContainerSpecs["+ j +"].VolumeMounts.Length"); k++) {
					VolumeMountsItem volumeMountsItem = new VolumeMountsItem();
					volumeMountsItem.setMountPath(_ctx.stringValue("QueryLDCContainerServiceRevisionResponse.RevisionList["+ i +"].ContainerServiceConfig.ContainerSpecs["+ j +"].VolumeMounts["+ k +"].MountPath"));
					volumeMountsItem.setName(_ctx.stringValue("QueryLDCContainerServiceRevisionResponse.RevisionList["+ i +"].ContainerServiceConfig.ContainerSpecs["+ j +"].VolumeMounts["+ k +"].Name"));
					volumeMountsItem.setReadOnly(_ctx.booleanValue("QueryLDCContainerServiceRevisionResponse.RevisionList["+ i +"].ContainerServiceConfig.ContainerSpecs["+ j +"].VolumeMounts["+ k +"].ReadOnly"));
					volumeMountsItem.setSubPath(_ctx.stringValue("QueryLDCContainerServiceRevisionResponse.RevisionList["+ i +"].ContainerServiceConfig.ContainerSpecs["+ j +"].VolumeMounts["+ k +"].SubPath"));
					volumeMountsItem.setVolumeSourceCategoryType(_ctx.stringValue("QueryLDCContainerServiceRevisionResponse.RevisionList["+ i +"].ContainerServiceConfig.ContainerSpecs["+ j +"].VolumeMounts["+ k +"].VolumeSourceCategoryType"));

					ConfigmapSecretVolumeSource configmapSecretVolumeSource = new ConfigmapSecretVolumeSource();
					configmapSecretVolumeSource.setVolumeRefName(_ctx.stringValue("QueryLDCContainerServiceRevisionResponse.RevisionList["+ i +"].ContainerServiceConfig.ContainerSpecs["+ j +"].VolumeMounts["+ k +"].ConfigmapSecretVolumeSource.VolumeRefName"));
					volumeMountsItem.setConfigmapSecretVolumeSource(configmapSecretVolumeSource);

					EmptyDirVolumeSource emptyDirVolumeSource = new EmptyDirVolumeSource();
					emptyDirVolumeSource.setMedium(_ctx.stringValue("QueryLDCContainerServiceRevisionResponse.RevisionList["+ i +"].ContainerServiceConfig.ContainerSpecs["+ j +"].VolumeMounts["+ k +"].EmptyDirVolumeSource.Medium"));
					emptyDirVolumeSource.setName(_ctx.stringValue("QueryLDCContainerServiceRevisionResponse.RevisionList["+ i +"].ContainerServiceConfig.ContainerSpecs["+ j +"].VolumeMounts["+ k +"].EmptyDirVolumeSource.Name"));
					emptyDirVolumeSource.setSizeLimit(_ctx.stringValue("QueryLDCContainerServiceRevisionResponse.RevisionList["+ i +"].ContainerServiceConfig.ContainerSpecs["+ j +"].VolumeMounts["+ k +"].EmptyDirVolumeSource.SizeLimit"));
					volumeMountsItem.setEmptyDirVolumeSource(emptyDirVolumeSource);

					LocalDiskVolumeSource localDiskVolumeSource = new LocalDiskVolumeSource();
					localDiskVolumeSource.setHostDirectoryPath(_ctx.stringValue("QueryLDCContainerServiceRevisionResponse.RevisionList["+ i +"].ContainerServiceConfig.ContainerSpecs["+ j +"].VolumeMounts["+ k +"].LocalDiskVolumeSource.HostDirectoryPath"));
					localDiskVolumeSource.setCreateIfNotPresent(_ctx.booleanValue("QueryLDCContainerServiceRevisionResponse.RevisionList["+ i +"].ContainerServiceConfig.ContainerSpecs["+ j +"].VolumeMounts["+ k +"].LocalDiskVolumeSource.CreateIfNotPresent"));
					volumeMountsItem.setLocalDiskVolumeSource(localDiskVolumeSource);

					PvcSource pvcSource = new PvcSource();
					pvcSource.setPvcName(_ctx.stringValue("QueryLDCContainerServiceRevisionResponse.RevisionList["+ i +"].ContainerServiceConfig.ContainerSpecs["+ j +"].VolumeMounts["+ k +"].PvcSource.PvcName"));
					volumeMountsItem.setPvcSource(pvcSource);

					volumeMounts.add(volumeMountsItem);
				}
				containerSpecsItem.setVolumeMounts(volumeMounts);

				containerSpecs.add(containerSpecsItem);
			}
			containerServiceConfig.setContainerSpecs(containerSpecs);

			List<IngressesItem> ingresses = new ArrayList<IngressesItem>();
			for (int j = 0; j < _ctx.lengthValue("QueryLDCContainerServiceRevisionResponse.RevisionList["+ i +"].ContainerServiceConfig.Ingresses.Length"); j++) {
				IngressesItem ingressesItem = new IngressesItem();
				ingressesItem.setDomain(_ctx.stringValue("QueryLDCContainerServiceRevisionResponse.RevisionList["+ i +"].ContainerServiceConfig.Ingresses["+ j +"].Domain"));
				ingressesItem.setLoadBalancerIaasId(_ctx.stringValue("QueryLDCContainerServiceRevisionResponse.RevisionList["+ i +"].ContainerServiceConfig.Ingresses["+ j +"].LoadBalancerIaasId"));
				ingressesItem.setLoadBalancerName(_ctx.stringValue("QueryLDCContainerServiceRevisionResponse.RevisionList["+ i +"].ContainerServiceConfig.Ingresses["+ j +"].LoadBalancerName"));
				ingressesItem.setLoadBalancerType(_ctx.stringValue("QueryLDCContainerServiceRevisionResponse.RevisionList["+ i +"].ContainerServiceConfig.Ingresses["+ j +"].LoadBalancerType"));
				ingressesItem.setName(_ctx.stringValue("QueryLDCContainerServiceRevisionResponse.RevisionList["+ i +"].ContainerServiceConfig.Ingresses["+ j +"].Name"));
				ingressesItem.setSpannerClusterId(_ctx.stringValue("QueryLDCContainerServiceRevisionResponse.RevisionList["+ i +"].ContainerServiceConfig.Ingresses["+ j +"].SpannerClusterId"));
				ingressesItem.setUnifiedAccessInstanceName(_ctx.stringValue("QueryLDCContainerServiceRevisionResponse.RevisionList["+ i +"].ContainerServiceConfig.Ingresses["+ j +"].UnifiedAccessInstanceName"));
				ingressesItem.setUnifiedAccessRouteRule(_ctx.stringValue("QueryLDCContainerServiceRevisionResponse.RevisionList["+ i +"].ContainerServiceConfig.Ingresses["+ j +"].UnifiedAccessRouteRule"));

				List<String> unifiedAccessEntries = new ArrayList<String>();
				for (int k = 0; k < _ctx.lengthValue("QueryLDCContainerServiceRevisionResponse.RevisionList["+ i +"].ContainerServiceConfig.Ingresses["+ j +"].UnifiedAccessEntries.Length"); k++) {
					unifiedAccessEntries.add(_ctx.stringValue("QueryLDCContainerServiceRevisionResponse.RevisionList["+ i +"].ContainerServiceConfig.Ingresses["+ j +"].UnifiedAccessEntries["+ k +"]"));
				}
				ingressesItem.setUnifiedAccessEntries(unifiedAccessEntries);

				List<ListenersItem> listeners = new ArrayList<ListenersItem>();
				for (int k = 0; k < _ctx.lengthValue("QueryLDCContainerServiceRevisionResponse.RevisionList["+ i +"].ContainerServiceConfig.Ingresses["+ j +"].Listeners.Length"); k++) {
					ListenersItem listenersItem = new ListenersItem();
					listenersItem.setBackendServerPort(_ctx.longValue("QueryLDCContainerServiceRevisionResponse.RevisionList["+ i +"].ContainerServiceConfig.Ingresses["+ j +"].Listeners["+ k +"].BackendServerPort"));
					listenersItem.setBandWidth(_ctx.longValue("QueryLDCContainerServiceRevisionResponse.RevisionList["+ i +"].ContainerServiceConfig.Ingresses["+ j +"].Listeners["+ k +"].BandWidth"));
					listenersItem.setCaCertificateId(_ctx.stringValue("QueryLDCContainerServiceRevisionResponse.RevisionList["+ i +"].ContainerServiceConfig.Ingresses["+ j +"].Listeners["+ k +"].CaCertificateId"));
					listenersItem.setCookie(_ctx.stringValue("QueryLDCContainerServiceRevisionResponse.RevisionList["+ i +"].ContainerServiceConfig.Ingresses["+ j +"].Listeners["+ k +"].Cookie"));
					listenersItem.setCookieTimeout(_ctx.longValue("QueryLDCContainerServiceRevisionResponse.RevisionList["+ i +"].ContainerServiceConfig.Ingresses["+ j +"].Listeners["+ k +"].CookieTimeout"));
					listenersItem.setEstablishedTimeout(_ctx.longValue("QueryLDCContainerServiceRevisionResponse.RevisionList["+ i +"].ContainerServiceConfig.Ingresses["+ j +"].Listeners["+ k +"].EstablishedTimeout"));
					listenersItem.setHealthyThreshold(_ctx.longValue("QueryLDCContainerServiceRevisionResponse.RevisionList["+ i +"].ContainerServiceConfig.Ingresses["+ j +"].Listeners["+ k +"].HealthyThreshold"));
					listenersItem.setHealthCheck(_ctx.stringValue("QueryLDCContainerServiceRevisionResponse.RevisionList["+ i +"].ContainerServiceConfig.Ingresses["+ j +"].Listeners["+ k +"].HealthCheck"));
					listenersItem.setHealthCheckConnectPort(_ctx.longValue("QueryLDCContainerServiceRevisionResponse.RevisionList["+ i +"].ContainerServiceConfig.Ingresses["+ j +"].Listeners["+ k +"].HealthCheckConnectPort"));
					listenersItem.setHealthCheckConnectTimeout(_ctx.longValue("QueryLDCContainerServiceRevisionResponse.RevisionList["+ i +"].ContainerServiceConfig.Ingresses["+ j +"].Listeners["+ k +"].HealthCheckConnectTimeout"));
					listenersItem.setHealthCheckDomain(_ctx.stringValue("QueryLDCContainerServiceRevisionResponse.RevisionList["+ i +"].ContainerServiceConfig.Ingresses["+ j +"].Listeners["+ k +"].HealthCheckDomain"));
					listenersItem.setHealthCheckHttpCode(_ctx.stringValue("QueryLDCContainerServiceRevisionResponse.RevisionList["+ i +"].ContainerServiceConfig.Ingresses["+ j +"].Listeners["+ k +"].HealthCheckHttpCode"));
					listenersItem.setHealthCheckInterval(_ctx.longValue("QueryLDCContainerServiceRevisionResponse.RevisionList["+ i +"].ContainerServiceConfig.Ingresses["+ j +"].Listeners["+ k +"].HealthCheckInterval"));
					listenersItem.setHealthCheckThreshold(_ctx.longValue("QueryLDCContainerServiceRevisionResponse.RevisionList["+ i +"].ContainerServiceConfig.Ingresses["+ j +"].Listeners["+ k +"].HealthCheckThreshold"));
					listenersItem.setHealthCheckTimeout(_ctx.longValue("QueryLDCContainerServiceRevisionResponse.RevisionList["+ i +"].ContainerServiceConfig.Ingresses["+ j +"].Listeners["+ k +"].HealthCheckTimeout"));
					listenersItem.setHealthCheckUri(_ctx.stringValue("QueryLDCContainerServiceRevisionResponse.RevisionList["+ i +"].ContainerServiceConfig.Ingresses["+ j +"].Listeners["+ k +"].HealthCheckUri"));
					listenersItem.setListenerPort(_ctx.longValue("QueryLDCContainerServiceRevisionResponse.RevisionList["+ i +"].ContainerServiceConfig.Ingresses["+ j +"].Listeners["+ k +"].ListenerPort"));
					listenersItem.setPersistenceTimeout(_ctx.longValue("QueryLDCContainerServiceRevisionResponse.RevisionList["+ i +"].ContainerServiceConfig.Ingresses["+ j +"].Listeners["+ k +"].PersistenceTimeout"));
					listenersItem.setBizProtocol(_ctx.stringValue("QueryLDCContainerServiceRevisionResponse.RevisionList["+ i +"].ContainerServiceConfig.Ingresses["+ j +"].Listeners["+ k +"].Protocol"));
					listenersItem.setScheduler(_ctx.stringValue("QueryLDCContainerServiceRevisionResponse.RevisionList["+ i +"].ContainerServiceConfig.Ingresses["+ j +"].Listeners["+ k +"].Scheduler"));
					listenersItem.setSessionStickyType(_ctx.longValue("QueryLDCContainerServiceRevisionResponse.RevisionList["+ i +"].ContainerServiceConfig.Ingresses["+ j +"].Listeners["+ k +"].SessionStickyType"));
					listenersItem.setUnhealthyThreshold(_ctx.longValue("QueryLDCContainerServiceRevisionResponse.RevisionList["+ i +"].ContainerServiceConfig.Ingresses["+ j +"].Listeners["+ k +"].UnhealthyThreshold"));
					listenersItem.setXforwardFor(_ctx.booleanValue("QueryLDCContainerServiceRevisionResponse.RevisionList["+ i +"].ContainerServiceConfig.Ingresses["+ j +"].Listeners["+ k +"].XforwardFor"));
					listenersItem.setDomain(_ctx.stringValue("QueryLDCContainerServiceRevisionResponse.RevisionList["+ i +"].ContainerServiceConfig.Ingresses["+ j +"].Listeners["+ k +"].Domain"));
					listenersItem.setPath(_ctx.stringValue("QueryLDCContainerServiceRevisionResponse.RevisionList["+ i +"].ContainerServiceConfig.Ingresses["+ j +"].Listeners["+ k +"].Path"));

					listeners.add(listenersItem);
				}
				ingressesItem.setListeners(listeners);

				List<ListenersV2Item> listenersV2 = new ArrayList<ListenersV2Item>();
				for (int k = 0; k < _ctx.lengthValue("QueryLDCContainerServiceRevisionResponse.RevisionList["+ i +"].ContainerServiceConfig.Ingresses["+ j +"].ListenersV2.Length"); k++) {
					ListenersV2Item listenersV2Item = new ListenersV2Item();
					listenersV2Item.setBackendServerPort(_ctx.longValue("QueryLDCContainerServiceRevisionResponse.RevisionList["+ i +"].ContainerServiceConfig.Ingresses["+ j +"].ListenersV2["+ k +"].BackendServerPort"));
					listenersV2Item.setBandWidth(_ctx.longValue("QueryLDCContainerServiceRevisionResponse.RevisionList["+ i +"].ContainerServiceConfig.Ingresses["+ j +"].ListenersV2["+ k +"].BandWidth"));
					listenersV2Item.setCaCertificateId(_ctx.stringValue("QueryLDCContainerServiceRevisionResponse.RevisionList["+ i +"].ContainerServiceConfig.Ingresses["+ j +"].ListenersV2["+ k +"].CaCertificateId"));
					listenersV2Item.setCookie(_ctx.stringValue("QueryLDCContainerServiceRevisionResponse.RevisionList["+ i +"].ContainerServiceConfig.Ingresses["+ j +"].ListenersV2["+ k +"].Cookie"));
					listenersV2Item.setCookieTimeout(_ctx.longValue("QueryLDCContainerServiceRevisionResponse.RevisionList["+ i +"].ContainerServiceConfig.Ingresses["+ j +"].ListenersV2["+ k +"].CookieTimeout"));
					listenersV2Item.setEstablishedTimeout(_ctx.longValue("QueryLDCContainerServiceRevisionResponse.RevisionList["+ i +"].ContainerServiceConfig.Ingresses["+ j +"].ListenersV2["+ k +"].EstablishedTimeout"));
					listenersV2Item.setHealthyThreshold(_ctx.longValue("QueryLDCContainerServiceRevisionResponse.RevisionList["+ i +"].ContainerServiceConfig.Ingresses["+ j +"].ListenersV2["+ k +"].HealthyThreshold"));
					listenersV2Item.setHealthCheck(_ctx.stringValue("QueryLDCContainerServiceRevisionResponse.RevisionList["+ i +"].ContainerServiceConfig.Ingresses["+ j +"].ListenersV2["+ k +"].HealthCheck"));
					listenersV2Item.setHealthCheckConnectPort(_ctx.longValue("QueryLDCContainerServiceRevisionResponse.RevisionList["+ i +"].ContainerServiceConfig.Ingresses["+ j +"].ListenersV2["+ k +"].HealthCheckConnectPort"));
					listenersV2Item.setHealthCheckConnectTimeout(_ctx.longValue("QueryLDCContainerServiceRevisionResponse.RevisionList["+ i +"].ContainerServiceConfig.Ingresses["+ j +"].ListenersV2["+ k +"].HealthCheckConnectTimeout"));
					listenersV2Item.setHealthCheckDomain(_ctx.stringValue("QueryLDCContainerServiceRevisionResponse.RevisionList["+ i +"].ContainerServiceConfig.Ingresses["+ j +"].ListenersV2["+ k +"].HealthCheckDomain"));
					listenersV2Item.setHealthCheckHttpCode(_ctx.stringValue("QueryLDCContainerServiceRevisionResponse.RevisionList["+ i +"].ContainerServiceConfig.Ingresses["+ j +"].ListenersV2["+ k +"].HealthCheckHttpCode"));
					listenersV2Item.setHealthCheckInterval(_ctx.longValue("QueryLDCContainerServiceRevisionResponse.RevisionList["+ i +"].ContainerServiceConfig.Ingresses["+ j +"].ListenersV2["+ k +"].HealthCheckInterval"));
					listenersV2Item.setHealthCheckThreshold(_ctx.longValue("QueryLDCContainerServiceRevisionResponse.RevisionList["+ i +"].ContainerServiceConfig.Ingresses["+ j +"].ListenersV2["+ k +"].HealthCheckThreshold"));
					listenersV2Item.setHealthCheckTimeout(_ctx.longValue("QueryLDCContainerServiceRevisionResponse.RevisionList["+ i +"].ContainerServiceConfig.Ingresses["+ j +"].ListenersV2["+ k +"].HealthCheckTimeout"));
					listenersV2Item.setHealthCheckUri(_ctx.stringValue("QueryLDCContainerServiceRevisionResponse.RevisionList["+ i +"].ContainerServiceConfig.Ingresses["+ j +"].ListenersV2["+ k +"].HealthCheckUri"));
					listenersV2Item.setListenerPort(_ctx.longValue("QueryLDCContainerServiceRevisionResponse.RevisionList["+ i +"].ContainerServiceConfig.Ingresses["+ j +"].ListenersV2["+ k +"].ListenerPort"));
					listenersV2Item.setPersistenceTimeout(_ctx.longValue("QueryLDCContainerServiceRevisionResponse.RevisionList["+ i +"].ContainerServiceConfig.Ingresses["+ j +"].ListenersV2["+ k +"].PersistenceTimeout"));
					listenersV2Item.setBizProtocol(_ctx.stringValue("QueryLDCContainerServiceRevisionResponse.RevisionList["+ i +"].ContainerServiceConfig.Ingresses["+ j +"].ListenersV2["+ k +"].Protocol"));
					listenersV2Item.setScheduler(_ctx.stringValue("QueryLDCContainerServiceRevisionResponse.RevisionList["+ i +"].ContainerServiceConfig.Ingresses["+ j +"].ListenersV2["+ k +"].Scheduler"));
					listenersV2Item.setSessionStickyType(_ctx.longValue("QueryLDCContainerServiceRevisionResponse.RevisionList["+ i +"].ContainerServiceConfig.Ingresses["+ j +"].ListenersV2["+ k +"].SessionStickyType"));
					listenersV2Item.setUnhealthyThreshold(_ctx.longValue("QueryLDCContainerServiceRevisionResponse.RevisionList["+ i +"].ContainerServiceConfig.Ingresses["+ j +"].ListenersV2["+ k +"].UnhealthyThreshold"));
					listenersV2Item.setXforwardFor(_ctx.booleanValue("QueryLDCContainerServiceRevisionResponse.RevisionList["+ i +"].ContainerServiceConfig.Ingresses["+ j +"].ListenersV2["+ k +"].XforwardFor"));
					listenersV2Item.setDomain(_ctx.stringValue("QueryLDCContainerServiceRevisionResponse.RevisionList["+ i +"].ContainerServiceConfig.Ingresses["+ j +"].ListenersV2["+ k +"].Domain"));
					listenersV2Item.setPath(_ctx.stringValue("QueryLDCContainerServiceRevisionResponse.RevisionList["+ i +"].ContainerServiceConfig.Ingresses["+ j +"].ListenersV2["+ k +"].Path"));

					listenersV2.add(listenersV2Item);
				}
				ingressesItem.setListenersV2(listenersV2);

				ingresses.add(ingressesItem);
			}
			containerServiceConfig.setIngresses(ingresses);

			List<InnerLoadBalancerServicesItem> innerLoadBalancerServices = new ArrayList<InnerLoadBalancerServicesItem>();
			for (int j = 0; j < _ctx.lengthValue("QueryLDCContainerServiceRevisionResponse.RevisionList["+ i +"].ContainerServiceConfig.InnerLoadBalancerServices.Length"); j++) {
				InnerLoadBalancerServicesItem innerLoadBalancerServicesItem = new InnerLoadBalancerServicesItem();
				innerLoadBalancerServicesItem.setDomain(_ctx.stringValue("QueryLDCContainerServiceRevisionResponse.RevisionList["+ i +"].ContainerServiceConfig.InnerLoadBalancerServices["+ j +"].Domain"));
				innerLoadBalancerServicesItem.setLoadBalancerIaasId(_ctx.stringValue("QueryLDCContainerServiceRevisionResponse.RevisionList["+ i +"].ContainerServiceConfig.InnerLoadBalancerServices["+ j +"].LoadBalancerIaasId"));
				innerLoadBalancerServicesItem.setLoadBalancerName(_ctx.stringValue("QueryLDCContainerServiceRevisionResponse.RevisionList["+ i +"].ContainerServiceConfig.InnerLoadBalancerServices["+ j +"].LoadBalancerName"));
				innerLoadBalancerServicesItem.setName(_ctx.stringValue("QueryLDCContainerServiceRevisionResponse.RevisionList["+ i +"].ContainerServiceConfig.InnerLoadBalancerServices["+ j +"].Name"));
				innerLoadBalancerServicesItem.setSpannerClusterId(_ctx.stringValue("QueryLDCContainerServiceRevisionResponse.RevisionList["+ i +"].ContainerServiceConfig.InnerLoadBalancerServices["+ j +"].SpannerClusterId"));
				innerLoadBalancerServicesItem.setAddressType(_ctx.stringValue("QueryLDCContainerServiceRevisionResponse.RevisionList["+ i +"].ContainerServiceConfig.InnerLoadBalancerServices["+ j +"].AddressType"));

				List<ListenersItem5> listeners4 = new ArrayList<ListenersItem5>();
				for (int k = 0; k < _ctx.lengthValue("QueryLDCContainerServiceRevisionResponse.RevisionList["+ i +"].ContainerServiceConfig.InnerLoadBalancerServices["+ j +"].Listeners.Length"); k++) {
					ListenersItem5 listenersItem5 = new ListenersItem5();
					listenersItem5.setBackendServerPort(_ctx.longValue("QueryLDCContainerServiceRevisionResponse.RevisionList["+ i +"].ContainerServiceConfig.InnerLoadBalancerServices["+ j +"].Listeners["+ k +"].BackendServerPort"));
					listenersItem5.setBandWidth(_ctx.longValue("QueryLDCContainerServiceRevisionResponse.RevisionList["+ i +"].ContainerServiceConfig.InnerLoadBalancerServices["+ j +"].Listeners["+ k +"].BandWidth"));
					listenersItem5.setCaCertificateId(_ctx.stringValue("QueryLDCContainerServiceRevisionResponse.RevisionList["+ i +"].ContainerServiceConfig.InnerLoadBalancerServices["+ j +"].Listeners["+ k +"].CaCertificateId"));
					listenersItem5.setCookie(_ctx.stringValue("QueryLDCContainerServiceRevisionResponse.RevisionList["+ i +"].ContainerServiceConfig.InnerLoadBalancerServices["+ j +"].Listeners["+ k +"].Cookie"));
					listenersItem5.setCookieTimeout(_ctx.longValue("QueryLDCContainerServiceRevisionResponse.RevisionList["+ i +"].ContainerServiceConfig.InnerLoadBalancerServices["+ j +"].Listeners["+ k +"].CookieTimeout"));
					listenersItem5.setEstablishedTimeout(_ctx.longValue("QueryLDCContainerServiceRevisionResponse.RevisionList["+ i +"].ContainerServiceConfig.InnerLoadBalancerServices["+ j +"].Listeners["+ k +"].EstablishedTimeout"));
					listenersItem5.setHealthyThreshold(_ctx.longValue("QueryLDCContainerServiceRevisionResponse.RevisionList["+ i +"].ContainerServiceConfig.InnerLoadBalancerServices["+ j +"].Listeners["+ k +"].HealthyThreshold"));
					listenersItem5.setHealthCheck(_ctx.stringValue("QueryLDCContainerServiceRevisionResponse.RevisionList["+ i +"].ContainerServiceConfig.InnerLoadBalancerServices["+ j +"].Listeners["+ k +"].HealthCheck"));
					listenersItem5.setHealthCheckConnectPort(_ctx.longValue("QueryLDCContainerServiceRevisionResponse.RevisionList["+ i +"].ContainerServiceConfig.InnerLoadBalancerServices["+ j +"].Listeners["+ k +"].HealthCheckConnectPort"));
					listenersItem5.setHealthCheckConnectTimeout(_ctx.longValue("QueryLDCContainerServiceRevisionResponse.RevisionList["+ i +"].ContainerServiceConfig.InnerLoadBalancerServices["+ j +"].Listeners["+ k +"].HealthCheckConnectTimeout"));
					listenersItem5.setHealthCheckDomain(_ctx.stringValue("QueryLDCContainerServiceRevisionResponse.RevisionList["+ i +"].ContainerServiceConfig.InnerLoadBalancerServices["+ j +"].Listeners["+ k +"].HealthCheckDomain"));
					listenersItem5.setHealthCheckHttpCode(_ctx.stringValue("QueryLDCContainerServiceRevisionResponse.RevisionList["+ i +"].ContainerServiceConfig.InnerLoadBalancerServices["+ j +"].Listeners["+ k +"].HealthCheckHttpCode"));
					listenersItem5.setHealthCheckInterval(_ctx.longValue("QueryLDCContainerServiceRevisionResponse.RevisionList["+ i +"].ContainerServiceConfig.InnerLoadBalancerServices["+ j +"].Listeners["+ k +"].HealthCheckInterval"));
					listenersItem5.setHealthCheckThreshold(_ctx.longValue("QueryLDCContainerServiceRevisionResponse.RevisionList["+ i +"].ContainerServiceConfig.InnerLoadBalancerServices["+ j +"].Listeners["+ k +"].HealthCheckThreshold"));
					listenersItem5.setHealthCheckTimeout(_ctx.longValue("QueryLDCContainerServiceRevisionResponse.RevisionList["+ i +"].ContainerServiceConfig.InnerLoadBalancerServices["+ j +"].Listeners["+ k +"].HealthCheckTimeout"));
					listenersItem5.setHealthCheckUri(_ctx.stringValue("QueryLDCContainerServiceRevisionResponse.RevisionList["+ i +"].ContainerServiceConfig.InnerLoadBalancerServices["+ j +"].Listeners["+ k +"].HealthCheckUri"));
					listenersItem5.setListenerPort(_ctx.longValue("QueryLDCContainerServiceRevisionResponse.RevisionList["+ i +"].ContainerServiceConfig.InnerLoadBalancerServices["+ j +"].Listeners["+ k +"].ListenerPort"));
					listenersItem5.setPersistenceTimeout(_ctx.longValue("QueryLDCContainerServiceRevisionResponse.RevisionList["+ i +"].ContainerServiceConfig.InnerLoadBalancerServices["+ j +"].Listeners["+ k +"].PersistenceTimeout"));
					listenersItem5.setBizProtocol(_ctx.stringValue("QueryLDCContainerServiceRevisionResponse.RevisionList["+ i +"].ContainerServiceConfig.InnerLoadBalancerServices["+ j +"].Listeners["+ k +"].Protocol"));
					listenersItem5.setScheduler(_ctx.stringValue("QueryLDCContainerServiceRevisionResponse.RevisionList["+ i +"].ContainerServiceConfig.InnerLoadBalancerServices["+ j +"].Listeners["+ k +"].Scheduler"));
					listenersItem5.setSessionStickyType(_ctx.longValue("QueryLDCContainerServiceRevisionResponse.RevisionList["+ i +"].ContainerServiceConfig.InnerLoadBalancerServices["+ j +"].Listeners["+ k +"].SessionStickyType"));
					listenersItem5.setUnhealthyThreshold(_ctx.longValue("QueryLDCContainerServiceRevisionResponse.RevisionList["+ i +"].ContainerServiceConfig.InnerLoadBalancerServices["+ j +"].Listeners["+ k +"].UnhealthyThreshold"));
					listenersItem5.setXforwardFor(_ctx.booleanValue("QueryLDCContainerServiceRevisionResponse.RevisionList["+ i +"].ContainerServiceConfig.InnerLoadBalancerServices["+ j +"].Listeners["+ k +"].XforwardFor"));
					listenersItem5.setDomain(_ctx.stringValue("QueryLDCContainerServiceRevisionResponse.RevisionList["+ i +"].ContainerServiceConfig.InnerLoadBalancerServices["+ j +"].Listeners["+ k +"].Domain"));
					listenersItem5.setPath(_ctx.stringValue("QueryLDCContainerServiceRevisionResponse.RevisionList["+ i +"].ContainerServiceConfig.InnerLoadBalancerServices["+ j +"].Listeners["+ k +"].Path"));

					listeners4.add(listenersItem5);
				}
				innerLoadBalancerServicesItem.setListeners4(listeners4);

				List<CellSlbIaasIdMapItem> cellSlbIaasIdMap = new ArrayList<CellSlbIaasIdMapItem>();
				for (int k = 0; k < _ctx.lengthValue("QueryLDCContainerServiceRevisionResponse.RevisionList["+ i +"].ContainerServiceConfig.InnerLoadBalancerServices["+ j +"].CellSlbIaasIdMap.Length"); k++) {
					CellSlbIaasIdMapItem cellSlbIaasIdMapItem = new CellSlbIaasIdMapItem();
					cellSlbIaasIdMapItem.setKey(_ctx.stringValue("QueryLDCContainerServiceRevisionResponse.RevisionList["+ i +"].ContainerServiceConfig.InnerLoadBalancerServices["+ j +"].CellSlbIaasIdMap["+ k +"].Key"));
					cellSlbIaasIdMapItem.setValue(_ctx.stringValue("QueryLDCContainerServiceRevisionResponse.RevisionList["+ i +"].ContainerServiceConfig.InnerLoadBalancerServices["+ j +"].CellSlbIaasIdMap["+ k +"].Value"));

					cellSlbIaasIdMap.add(cellSlbIaasIdMapItem);
				}
				innerLoadBalancerServicesItem.setCellSlbIaasIdMap(cellSlbIaasIdMap);

				innerLoadBalancerServices.add(innerLoadBalancerServicesItem);
			}
			containerServiceConfig.setInnerLoadBalancerServices(innerLoadBalancerServices);

			List<PublicLoadBalancerServicesItem> publicLoadBalancerServices = new ArrayList<PublicLoadBalancerServicesItem>();
			for (int j = 0; j < _ctx.lengthValue("QueryLDCContainerServiceRevisionResponse.RevisionList["+ i +"].ContainerServiceConfig.PublicLoadBalancerServices.Length"); j++) {
				PublicLoadBalancerServicesItem publicLoadBalancerServicesItem = new PublicLoadBalancerServicesItem();
				publicLoadBalancerServicesItem.setDomain(_ctx.stringValue("QueryLDCContainerServiceRevisionResponse.RevisionList["+ i +"].ContainerServiceConfig.PublicLoadBalancerServices["+ j +"].Domain"));
				publicLoadBalancerServicesItem.setLoadBalancerIaasId(_ctx.stringValue("QueryLDCContainerServiceRevisionResponse.RevisionList["+ i +"].ContainerServiceConfig.PublicLoadBalancerServices["+ j +"].LoadBalancerIaasId"));
				publicLoadBalancerServicesItem.setLoadBalancerName(_ctx.stringValue("QueryLDCContainerServiceRevisionResponse.RevisionList["+ i +"].ContainerServiceConfig.PublicLoadBalancerServices["+ j +"].LoadBalancerName"));
				publicLoadBalancerServicesItem.setName(_ctx.stringValue("QueryLDCContainerServiceRevisionResponse.RevisionList["+ i +"].ContainerServiceConfig.PublicLoadBalancerServices["+ j +"].Name"));
				publicLoadBalancerServicesItem.setSpannerClusterId(_ctx.stringValue("QueryLDCContainerServiceRevisionResponse.RevisionList["+ i +"].ContainerServiceConfig.PublicLoadBalancerServices["+ j +"].SpannerClusterId"));
				publicLoadBalancerServicesItem.setAddressType(_ctx.stringValue("QueryLDCContainerServiceRevisionResponse.RevisionList["+ i +"].ContainerServiceConfig.PublicLoadBalancerServices["+ j +"].AddressType"));

				List<ListenersItem8> listeners6 = new ArrayList<ListenersItem8>();
				for (int k = 0; k < _ctx.lengthValue("QueryLDCContainerServiceRevisionResponse.RevisionList["+ i +"].ContainerServiceConfig.PublicLoadBalancerServices["+ j +"].Listeners.Length"); k++) {
					ListenersItem8 listenersItem8 = new ListenersItem8();
					listenersItem8.setBackendServerPort(_ctx.longValue("QueryLDCContainerServiceRevisionResponse.RevisionList["+ i +"].ContainerServiceConfig.PublicLoadBalancerServices["+ j +"].Listeners["+ k +"].BackendServerPort"));
					listenersItem8.setBandWidth(_ctx.longValue("QueryLDCContainerServiceRevisionResponse.RevisionList["+ i +"].ContainerServiceConfig.PublicLoadBalancerServices["+ j +"].Listeners["+ k +"].BandWidth"));
					listenersItem8.setCaCertificateId(_ctx.stringValue("QueryLDCContainerServiceRevisionResponse.RevisionList["+ i +"].ContainerServiceConfig.PublicLoadBalancerServices["+ j +"].Listeners["+ k +"].CaCertificateId"));
					listenersItem8.setCookie(_ctx.stringValue("QueryLDCContainerServiceRevisionResponse.RevisionList["+ i +"].ContainerServiceConfig.PublicLoadBalancerServices["+ j +"].Listeners["+ k +"].Cookie"));
					listenersItem8.setCookieTimeout(_ctx.longValue("QueryLDCContainerServiceRevisionResponse.RevisionList["+ i +"].ContainerServiceConfig.PublicLoadBalancerServices["+ j +"].Listeners["+ k +"].CookieTimeout"));
					listenersItem8.setEstablishedTimeout(_ctx.longValue("QueryLDCContainerServiceRevisionResponse.RevisionList["+ i +"].ContainerServiceConfig.PublicLoadBalancerServices["+ j +"].Listeners["+ k +"].EstablishedTimeout"));
					listenersItem8.setHealthyThreshold(_ctx.longValue("QueryLDCContainerServiceRevisionResponse.RevisionList["+ i +"].ContainerServiceConfig.PublicLoadBalancerServices["+ j +"].Listeners["+ k +"].HealthyThreshold"));
					listenersItem8.setHealthCheck(_ctx.stringValue("QueryLDCContainerServiceRevisionResponse.RevisionList["+ i +"].ContainerServiceConfig.PublicLoadBalancerServices["+ j +"].Listeners["+ k +"].HealthCheck"));
					listenersItem8.setHealthCheckConnectPort(_ctx.longValue("QueryLDCContainerServiceRevisionResponse.RevisionList["+ i +"].ContainerServiceConfig.PublicLoadBalancerServices["+ j +"].Listeners["+ k +"].HealthCheckConnectPort"));
					listenersItem8.setHealthCheckConnectTimeout(_ctx.longValue("QueryLDCContainerServiceRevisionResponse.RevisionList["+ i +"].ContainerServiceConfig.PublicLoadBalancerServices["+ j +"].Listeners["+ k +"].HealthCheckConnectTimeout"));
					listenersItem8.setHealthCheckDomain(_ctx.stringValue("QueryLDCContainerServiceRevisionResponse.RevisionList["+ i +"].ContainerServiceConfig.PublicLoadBalancerServices["+ j +"].Listeners["+ k +"].HealthCheckDomain"));
					listenersItem8.setHealthCheckHttpCode(_ctx.stringValue("QueryLDCContainerServiceRevisionResponse.RevisionList["+ i +"].ContainerServiceConfig.PublicLoadBalancerServices["+ j +"].Listeners["+ k +"].HealthCheckHttpCode"));
					listenersItem8.setHealthCheckInterval(_ctx.longValue("QueryLDCContainerServiceRevisionResponse.RevisionList["+ i +"].ContainerServiceConfig.PublicLoadBalancerServices["+ j +"].Listeners["+ k +"].HealthCheckInterval"));
					listenersItem8.setHealthCheckThreshold(_ctx.longValue("QueryLDCContainerServiceRevisionResponse.RevisionList["+ i +"].ContainerServiceConfig.PublicLoadBalancerServices["+ j +"].Listeners["+ k +"].HealthCheckThreshold"));
					listenersItem8.setHealthCheckTimeout(_ctx.longValue("QueryLDCContainerServiceRevisionResponse.RevisionList["+ i +"].ContainerServiceConfig.PublicLoadBalancerServices["+ j +"].Listeners["+ k +"].HealthCheckTimeout"));
					listenersItem8.setHealthCheckUri(_ctx.stringValue("QueryLDCContainerServiceRevisionResponse.RevisionList["+ i +"].ContainerServiceConfig.PublicLoadBalancerServices["+ j +"].Listeners["+ k +"].HealthCheckUri"));
					listenersItem8.setListenerPort(_ctx.longValue("QueryLDCContainerServiceRevisionResponse.RevisionList["+ i +"].ContainerServiceConfig.PublicLoadBalancerServices["+ j +"].Listeners["+ k +"].ListenerPort"));
					listenersItem8.setPersistenceTimeout(_ctx.longValue("QueryLDCContainerServiceRevisionResponse.RevisionList["+ i +"].ContainerServiceConfig.PublicLoadBalancerServices["+ j +"].Listeners["+ k +"].PersistenceTimeout"));
					listenersItem8.setBizProtocol(_ctx.stringValue("QueryLDCContainerServiceRevisionResponse.RevisionList["+ i +"].ContainerServiceConfig.PublicLoadBalancerServices["+ j +"].Listeners["+ k +"].Protocol"));
					listenersItem8.setScheduler(_ctx.stringValue("QueryLDCContainerServiceRevisionResponse.RevisionList["+ i +"].ContainerServiceConfig.PublicLoadBalancerServices["+ j +"].Listeners["+ k +"].Scheduler"));
					listenersItem8.setSessionStickyType(_ctx.longValue("QueryLDCContainerServiceRevisionResponse.RevisionList["+ i +"].ContainerServiceConfig.PublicLoadBalancerServices["+ j +"].Listeners["+ k +"].SessionStickyType"));
					listenersItem8.setUnhealthyThreshold(_ctx.longValue("QueryLDCContainerServiceRevisionResponse.RevisionList["+ i +"].ContainerServiceConfig.PublicLoadBalancerServices["+ j +"].Listeners["+ k +"].UnhealthyThreshold"));
					listenersItem8.setXforwardFor(_ctx.booleanValue("QueryLDCContainerServiceRevisionResponse.RevisionList["+ i +"].ContainerServiceConfig.PublicLoadBalancerServices["+ j +"].Listeners["+ k +"].XforwardFor"));
					listenersItem8.setDomain(_ctx.stringValue("QueryLDCContainerServiceRevisionResponse.RevisionList["+ i +"].ContainerServiceConfig.PublicLoadBalancerServices["+ j +"].Listeners["+ k +"].Domain"));
					listenersItem8.setPath(_ctx.stringValue("QueryLDCContainerServiceRevisionResponse.RevisionList["+ i +"].ContainerServiceConfig.PublicLoadBalancerServices["+ j +"].Listeners["+ k +"].Path"));

					listeners6.add(listenersItem8);
				}
				publicLoadBalancerServicesItem.setListeners6(listeners6);

				List<CellSlbIaasIdMapItem9> cellSlbIaasIdMap7 = new ArrayList<CellSlbIaasIdMapItem9>();
				for (int k = 0; k < _ctx.lengthValue("QueryLDCContainerServiceRevisionResponse.RevisionList["+ i +"].ContainerServiceConfig.PublicLoadBalancerServices["+ j +"].CellSlbIaasIdMap.Length"); k++) {
					CellSlbIaasIdMapItem9 cellSlbIaasIdMapItem9 = new CellSlbIaasIdMapItem9();
					cellSlbIaasIdMapItem9.setKey(_ctx.stringValue("QueryLDCContainerServiceRevisionResponse.RevisionList["+ i +"].ContainerServiceConfig.PublicLoadBalancerServices["+ j +"].CellSlbIaasIdMap["+ k +"].Key"));
					cellSlbIaasIdMapItem9.setValue(_ctx.stringValue("QueryLDCContainerServiceRevisionResponse.RevisionList["+ i +"].ContainerServiceConfig.PublicLoadBalancerServices["+ j +"].CellSlbIaasIdMap["+ k +"].Value"));

					cellSlbIaasIdMap7.add(cellSlbIaasIdMapItem9);
				}
				publicLoadBalancerServicesItem.setCellSlbIaasIdMap7(cellSlbIaasIdMap7);

				publicLoadBalancerServices.add(publicLoadBalancerServicesItem);
			}
			containerServiceConfig.setPublicLoadBalancerServices(publicLoadBalancerServices);

			List<SidecarConfigsItem> sidecarConfigs = new ArrayList<SidecarConfigsItem>();
			for (int j = 0; j < _ctx.lengthValue("QueryLDCContainerServiceRevisionResponse.RevisionList["+ i +"].ContainerServiceConfig.SidecarConfigs.Length"); j++) {
				SidecarConfigsItem sidecarConfigsItem = new SidecarConfigsItem();
				sidecarConfigsItem.setId(_ctx.stringValue("QueryLDCContainerServiceRevisionResponse.RevisionList["+ i +"].ContainerServiceConfig.SidecarConfigs["+ j +"].Id"));
				sidecarConfigsItem.setRegionId(_ctx.stringValue("QueryLDCContainerServiceRevisionResponse.RevisionList["+ i +"].ContainerServiceConfig.SidecarConfigs["+ j +"].RegionId"));
				sidecarConfigsItem.setScope(_ctx.stringValue("QueryLDCContainerServiceRevisionResponse.RevisionList["+ i +"].ContainerServiceConfig.SidecarConfigs["+ j +"].Scope"));
				sidecarConfigsItem.setSidecarName(_ctx.stringValue("QueryLDCContainerServiceRevisionResponse.RevisionList["+ i +"].ContainerServiceConfig.SidecarConfigs["+ j +"].SidecarName"));
				sidecarConfigsItem.setSidecarVersion(_ctx.stringValue("QueryLDCContainerServiceRevisionResponse.RevisionList["+ i +"].ContainerServiceConfig.SidecarConfigs["+ j +"].SidecarVersion"));
				sidecarConfigsItem.setTemplate(_ctx.stringValue("QueryLDCContainerServiceRevisionResponse.RevisionList["+ i +"].ContainerServiceConfig.SidecarConfigs["+ j +"].Template"));
				sidecarConfigsItem.setType(_ctx.stringValue("QueryLDCContainerServiceRevisionResponse.RevisionList["+ i +"].ContainerServiceConfig.SidecarConfigs["+ j +"].Type"));
				sidecarConfigsItem.setWorkspaceGroupId(_ctx.stringValue("QueryLDCContainerServiceRevisionResponse.RevisionList["+ i +"].ContainerServiceConfig.SidecarConfigs["+ j +"].WorkspaceGroupId"));
				sidecarConfigsItem.setWorkspaceId(_ctx.stringValue("QueryLDCContainerServiceRevisionResponse.RevisionList["+ i +"].ContainerServiceConfig.SidecarConfigs["+ j +"].WorkspaceId"));

				sidecarConfigs.add(sidecarConfigsItem);
			}
			containerServiceConfig.setSidecarConfigs(sidecarConfigs);

			List<LoadBalancerServicesItem> loadBalancerServices = new ArrayList<LoadBalancerServicesItem>();
			for (int j = 0; j < _ctx.lengthValue("QueryLDCContainerServiceRevisionResponse.RevisionList["+ i +"].ContainerServiceConfig.LoadBalancerServices.Length"); j++) {
				LoadBalancerServicesItem loadBalancerServicesItem = new LoadBalancerServicesItem();
				loadBalancerServicesItem.setDomain(_ctx.stringValue("QueryLDCContainerServiceRevisionResponse.RevisionList["+ i +"].ContainerServiceConfig.LoadBalancerServices["+ j +"].Domain"));
				loadBalancerServicesItem.setLoadBalancerIaasId(_ctx.stringValue("QueryLDCContainerServiceRevisionResponse.RevisionList["+ i +"].ContainerServiceConfig.LoadBalancerServices["+ j +"].LoadBalancerIaasId"));
				loadBalancerServicesItem.setLoadBalancerName(_ctx.stringValue("QueryLDCContainerServiceRevisionResponse.RevisionList["+ i +"].ContainerServiceConfig.LoadBalancerServices["+ j +"].LoadBalancerName"));
				loadBalancerServicesItem.setName(_ctx.stringValue("QueryLDCContainerServiceRevisionResponse.RevisionList["+ i +"].ContainerServiceConfig.LoadBalancerServices["+ j +"].Name"));
				loadBalancerServicesItem.setSpannerClusterId(_ctx.stringValue("QueryLDCContainerServiceRevisionResponse.RevisionList["+ i +"].ContainerServiceConfig.LoadBalancerServices["+ j +"].SpannerClusterId"));
				loadBalancerServicesItem.setAddressType(_ctx.stringValue("QueryLDCContainerServiceRevisionResponse.RevisionList["+ i +"].ContainerServiceConfig.LoadBalancerServices["+ j +"].AddressType"));

				List<ListenersItem12> listeners10 = new ArrayList<ListenersItem12>();
				for (int k = 0; k < _ctx.lengthValue("QueryLDCContainerServiceRevisionResponse.RevisionList["+ i +"].ContainerServiceConfig.LoadBalancerServices["+ j +"].Listeners.Length"); k++) {
					ListenersItem12 listenersItem12 = new ListenersItem12();
					listenersItem12.setBackendServerPort(_ctx.longValue("QueryLDCContainerServiceRevisionResponse.RevisionList["+ i +"].ContainerServiceConfig.LoadBalancerServices["+ j +"].Listeners["+ k +"].BackendServerPort"));
					listenersItem12.setBandWidth(_ctx.longValue("QueryLDCContainerServiceRevisionResponse.RevisionList["+ i +"].ContainerServiceConfig.LoadBalancerServices["+ j +"].Listeners["+ k +"].BandWidth"));
					listenersItem12.setCaCertificateId(_ctx.stringValue("QueryLDCContainerServiceRevisionResponse.RevisionList["+ i +"].ContainerServiceConfig.LoadBalancerServices["+ j +"].Listeners["+ k +"].CaCertificateId"));
					listenersItem12.setCookie(_ctx.stringValue("QueryLDCContainerServiceRevisionResponse.RevisionList["+ i +"].ContainerServiceConfig.LoadBalancerServices["+ j +"].Listeners["+ k +"].Cookie"));
					listenersItem12.setCookieTimeout(_ctx.longValue("QueryLDCContainerServiceRevisionResponse.RevisionList["+ i +"].ContainerServiceConfig.LoadBalancerServices["+ j +"].Listeners["+ k +"].CookieTimeout"));
					listenersItem12.setEstablishedTimeout(_ctx.longValue("QueryLDCContainerServiceRevisionResponse.RevisionList["+ i +"].ContainerServiceConfig.LoadBalancerServices["+ j +"].Listeners["+ k +"].EstablishedTimeout"));
					listenersItem12.setHealthyThreshold(_ctx.longValue("QueryLDCContainerServiceRevisionResponse.RevisionList["+ i +"].ContainerServiceConfig.LoadBalancerServices["+ j +"].Listeners["+ k +"].HealthyThreshold"));
					listenersItem12.setHealthCheck(_ctx.stringValue("QueryLDCContainerServiceRevisionResponse.RevisionList["+ i +"].ContainerServiceConfig.LoadBalancerServices["+ j +"].Listeners["+ k +"].HealthCheck"));
					listenersItem12.setHealthCheckConnectPort(_ctx.longValue("QueryLDCContainerServiceRevisionResponse.RevisionList["+ i +"].ContainerServiceConfig.LoadBalancerServices["+ j +"].Listeners["+ k +"].HealthCheckConnectPort"));
					listenersItem12.setHealthCheckConnectTimeout(_ctx.longValue("QueryLDCContainerServiceRevisionResponse.RevisionList["+ i +"].ContainerServiceConfig.LoadBalancerServices["+ j +"].Listeners["+ k +"].HealthCheckConnectTimeout"));
					listenersItem12.setHealthCheckDomain(_ctx.stringValue("QueryLDCContainerServiceRevisionResponse.RevisionList["+ i +"].ContainerServiceConfig.LoadBalancerServices["+ j +"].Listeners["+ k +"].HealthCheckDomain"));
					listenersItem12.setHealthCheckHttpCode(_ctx.stringValue("QueryLDCContainerServiceRevisionResponse.RevisionList["+ i +"].ContainerServiceConfig.LoadBalancerServices["+ j +"].Listeners["+ k +"].HealthCheckHttpCode"));
					listenersItem12.setHealthCheckInterval(_ctx.longValue("QueryLDCContainerServiceRevisionResponse.RevisionList["+ i +"].ContainerServiceConfig.LoadBalancerServices["+ j +"].Listeners["+ k +"].HealthCheckInterval"));
					listenersItem12.setHealthCheckThreshold(_ctx.longValue("QueryLDCContainerServiceRevisionResponse.RevisionList["+ i +"].ContainerServiceConfig.LoadBalancerServices["+ j +"].Listeners["+ k +"].HealthCheckThreshold"));
					listenersItem12.setHealthCheckTimeout(_ctx.longValue("QueryLDCContainerServiceRevisionResponse.RevisionList["+ i +"].ContainerServiceConfig.LoadBalancerServices["+ j +"].Listeners["+ k +"].HealthCheckTimeout"));
					listenersItem12.setHealthCheckUri(_ctx.stringValue("QueryLDCContainerServiceRevisionResponse.RevisionList["+ i +"].ContainerServiceConfig.LoadBalancerServices["+ j +"].Listeners["+ k +"].HealthCheckUri"));
					listenersItem12.setListenerPort(_ctx.longValue("QueryLDCContainerServiceRevisionResponse.RevisionList["+ i +"].ContainerServiceConfig.LoadBalancerServices["+ j +"].Listeners["+ k +"].ListenerPort"));
					listenersItem12.setPersistenceTimeout(_ctx.longValue("QueryLDCContainerServiceRevisionResponse.RevisionList["+ i +"].ContainerServiceConfig.LoadBalancerServices["+ j +"].Listeners["+ k +"].PersistenceTimeout"));
					listenersItem12.setBizProtocol(_ctx.stringValue("QueryLDCContainerServiceRevisionResponse.RevisionList["+ i +"].ContainerServiceConfig.LoadBalancerServices["+ j +"].Listeners["+ k +"].Protocol"));
					listenersItem12.setScheduler(_ctx.stringValue("QueryLDCContainerServiceRevisionResponse.RevisionList["+ i +"].ContainerServiceConfig.LoadBalancerServices["+ j +"].Listeners["+ k +"].Scheduler"));
					listenersItem12.setSessionStickyType(_ctx.longValue("QueryLDCContainerServiceRevisionResponse.RevisionList["+ i +"].ContainerServiceConfig.LoadBalancerServices["+ j +"].Listeners["+ k +"].SessionStickyType"));
					listenersItem12.setUnhealthyThreshold(_ctx.longValue("QueryLDCContainerServiceRevisionResponse.RevisionList["+ i +"].ContainerServiceConfig.LoadBalancerServices["+ j +"].Listeners["+ k +"].UnhealthyThreshold"));
					listenersItem12.setXforwardFor(_ctx.booleanValue("QueryLDCContainerServiceRevisionResponse.RevisionList["+ i +"].ContainerServiceConfig.LoadBalancerServices["+ j +"].Listeners["+ k +"].XforwardFor"));
					listenersItem12.setDomain(_ctx.stringValue("QueryLDCContainerServiceRevisionResponse.RevisionList["+ i +"].ContainerServiceConfig.LoadBalancerServices["+ j +"].Listeners["+ k +"].Domain"));
					listenersItem12.setPath(_ctx.stringValue("QueryLDCContainerServiceRevisionResponse.RevisionList["+ i +"].ContainerServiceConfig.LoadBalancerServices["+ j +"].Listeners["+ k +"].Path"));

					listeners10.add(listenersItem12);
				}
				loadBalancerServicesItem.setListeners10(listeners10);

				List<CellSlbIaasIdMapItem13> cellSlbIaasIdMap11 = new ArrayList<CellSlbIaasIdMapItem13>();
				for (int k = 0; k < _ctx.lengthValue("QueryLDCContainerServiceRevisionResponse.RevisionList["+ i +"].ContainerServiceConfig.LoadBalancerServices["+ j +"].CellSlbIaasIdMap.Length"); k++) {
					CellSlbIaasIdMapItem13 cellSlbIaasIdMapItem13 = new CellSlbIaasIdMapItem13();
					cellSlbIaasIdMapItem13.setKey(_ctx.stringValue("QueryLDCContainerServiceRevisionResponse.RevisionList["+ i +"].ContainerServiceConfig.LoadBalancerServices["+ j +"].CellSlbIaasIdMap["+ k +"].Key"));
					cellSlbIaasIdMapItem13.setValue(_ctx.stringValue("QueryLDCContainerServiceRevisionResponse.RevisionList["+ i +"].ContainerServiceConfig.LoadBalancerServices["+ j +"].CellSlbIaasIdMap["+ k +"].Value"));

					cellSlbIaasIdMap11.add(cellSlbIaasIdMapItem13);
				}
				loadBalancerServicesItem.setCellSlbIaasIdMap11(cellSlbIaasIdMap11);

				loadBalancerServices.add(loadBalancerServicesItem);
			}
			containerServiceConfig.setLoadBalancerServices(loadBalancerServices);
			revisionListItem.setContainerServiceConfig(containerServiceConfig);

			ContainerServiceReleaseInfo containerServiceReleaseInfo = new ContainerServiceReleaseInfo();
			containerServiceReleaseInfo.setCreatedPlanId(_ctx.stringValue("QueryLDCContainerServiceRevisionResponse.RevisionList["+ i +"].ContainerServiceReleaseInfo.CreatedPlanId"));
			containerServiceReleaseInfo.setLatestDeploymentStartTime(_ctx.stringValue("QueryLDCContainerServiceRevisionResponse.RevisionList["+ i +"].ContainerServiceReleaseInfo.LatestDeploymentStartTime"));
			containerServiceReleaseInfo.setLatestDeploymentEndTime(_ctx.stringValue("QueryLDCContainerServiceRevisionResponse.RevisionList["+ i +"].ContainerServiceReleaseInfo.LatestDeploymentEndTime"));
			revisionListItem.setContainerServiceReleaseInfo(containerServiceReleaseInfo);

			revisionList.add(revisionListItem);
		}
		queryLDCContainerServiceRevisionResponse.setRevisionList(revisionList);
	 
	 	return queryLDCContainerServiceRevisionResponse;
	}
}