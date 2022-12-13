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

package com.aliyuncs.cs.transform.v20151215;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cs.model.v20151215.DescribeClusterNodePoolsResponse;
import com.aliyuncs.cs.model.v20151215.DescribeClusterNodePoolsResponse.NodepoolsItem;
import com.aliyuncs.cs.model.v20151215.DescribeClusterNodePoolsResponse.NodepoolsItem.Auto_scaling;
import com.aliyuncs.cs.model.v20151215.DescribeClusterNodePoolsResponse.NodepoolsItem.Interconnect_config;
import com.aliyuncs.cs.model.v20151215.DescribeClusterNodePoolsResponse.NodepoolsItem.Kubernetes_config;
import com.aliyuncs.cs.model.v20151215.DescribeClusterNodePoolsResponse.NodepoolsItem.Kubernetes_config.LabelsItem;
import com.aliyuncs.cs.model.v20151215.DescribeClusterNodePoolsResponse.NodepoolsItem.Kubernetes_config.TaintsItem;
import com.aliyuncs.cs.model.v20151215.DescribeClusterNodePoolsResponse.NodepoolsItem.Management;
import com.aliyuncs.cs.model.v20151215.DescribeClusterNodePoolsResponse.NodepoolsItem.Management.Upgrade_config;
import com.aliyuncs.cs.model.v20151215.DescribeClusterNodePoolsResponse.NodepoolsItem.Nodepool_info;
import com.aliyuncs.cs.model.v20151215.DescribeClusterNodePoolsResponse.NodepoolsItem.Scaling_group;
import com.aliyuncs.cs.model.v20151215.DescribeClusterNodePoolsResponse.NodepoolsItem.Scaling_group.Data_disksItem;
import com.aliyuncs.cs.model.v20151215.DescribeClusterNodePoolsResponse.NodepoolsItem.Scaling_group.Spot_price_limitItem;
import com.aliyuncs.cs.model.v20151215.DescribeClusterNodePoolsResponse.NodepoolsItem.Scaling_group.TagsItem;
import com.aliyuncs.cs.model.v20151215.DescribeClusterNodePoolsResponse.NodepoolsItem.Status;
import com.aliyuncs.cs.model.v20151215.DescribeClusterNodePoolsResponse.NodepoolsItem.Tee_config;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeClusterNodePoolsResponseUnmarshaller {

	public static DescribeClusterNodePoolsResponse unmarshall(DescribeClusterNodePoolsResponse describeClusterNodePoolsResponse, UnmarshallerContext _ctx) {
		

		List<NodepoolsItem> nodepools = new ArrayList<NodepoolsItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeClusterNodePoolsResponse.nodepools.Length"); i++) {
			NodepoolsItem nodepoolsItem = new NodepoolsItem();
			nodepoolsItem.setInterconnect_mode(_ctx.stringValue("DescribeClusterNodePoolsResponse.nodepools["+ i +"].interconnect_mode"));
			nodepoolsItem.setMax_nodes(_ctx.longValue("DescribeClusterNodePoolsResponse.nodepools["+ i +"].max_nodes"));

			Auto_scaling auto_scaling = new Auto_scaling();
			auto_scaling.setEip_bandwidth(_ctx.longValue("DescribeClusterNodePoolsResponse.nodepools["+ i +"].auto_scaling.eip_bandwidth"));
			auto_scaling.setIs_bond_eip(_ctx.booleanValue("DescribeClusterNodePoolsResponse.nodepools["+ i +"].auto_scaling.is_bond_eip"));
			auto_scaling.setEip_internet_charge_type(_ctx.stringValue("DescribeClusterNodePoolsResponse.nodepools["+ i +"].auto_scaling.eip_internet_charge_type"));
			auto_scaling.setEnable(_ctx.booleanValue("DescribeClusterNodePoolsResponse.nodepools["+ i +"].auto_scaling.enable"));
			auto_scaling.setMax_instances(_ctx.longValue("DescribeClusterNodePoolsResponse.nodepools["+ i +"].auto_scaling.max_instances"));
			auto_scaling.setMin_instances(_ctx.longValue("DescribeClusterNodePoolsResponse.nodepools["+ i +"].auto_scaling.min_instances"));
			auto_scaling.setType(_ctx.stringValue("DescribeClusterNodePoolsResponse.nodepools["+ i +"].auto_scaling.type"));
			nodepoolsItem.setAuto_scaling(auto_scaling);

			Kubernetes_config kubernetes_config = new Kubernetes_config();
			kubernetes_config.setCms_enabled(_ctx.booleanValue("DescribeClusterNodePoolsResponse.nodepools["+ i +"].kubernetes_config.cms_enabled"));
			kubernetes_config.setCpu_policy(_ctx.stringValue("DescribeClusterNodePoolsResponse.nodepools["+ i +"].kubernetes_config.cpu_policy"));
			kubernetes_config.setRuntime(_ctx.stringValue("DescribeClusterNodePoolsResponse.nodepools["+ i +"].kubernetes_config.runtime"));
			kubernetes_config.setRuntime_version(_ctx.stringValue("DescribeClusterNodePoolsResponse.nodepools["+ i +"].kubernetes_config.runtime_version"));
			kubernetes_config.setUser_data(_ctx.stringValue("DescribeClusterNodePoolsResponse.nodepools["+ i +"].kubernetes_config.user_data"));
			kubernetes_config.setNode_name_mode(_ctx.stringValue("DescribeClusterNodePoolsResponse.nodepools["+ i +"].kubernetes_config.node_name_mode"));

			List<LabelsItem> labels = new ArrayList<LabelsItem>();
			for (int j = 0; j < _ctx.lengthValue("DescribeClusterNodePoolsResponse.nodepools["+ i +"].kubernetes_config.labels.Length"); j++) {
				LabelsItem labelsItem = new LabelsItem();
				labelsItem.setKey(_ctx.stringValue("DescribeClusterNodePoolsResponse.nodepools["+ i +"].kubernetes_config.labels["+ j +"].key"));
				labelsItem.setValue(_ctx.stringValue("DescribeClusterNodePoolsResponse.nodepools["+ i +"].kubernetes_config.labels["+ j +"].value"));

				labels.add(labelsItem);
			}
			kubernetes_config.setLabels(labels);

			List<TaintsItem> taints = new ArrayList<TaintsItem>();
			for (int j = 0; j < _ctx.lengthValue("DescribeClusterNodePoolsResponse.nodepools["+ i +"].kubernetes_config.taints.Length"); j++) {
				TaintsItem taintsItem = new TaintsItem();
				taintsItem.setKey(_ctx.stringValue("DescribeClusterNodePoolsResponse.nodepools["+ i +"].kubernetes_config.taints["+ j +"].key"));
				taintsItem.setValue(_ctx.stringValue("DescribeClusterNodePoolsResponse.nodepools["+ i +"].kubernetes_config.taints["+ j +"].value"));
				taintsItem.setEffect(_ctx.stringValue("DescribeClusterNodePoolsResponse.nodepools["+ i +"].kubernetes_config.taints["+ j +"].effect"));

				taints.add(taintsItem);
			}
			kubernetes_config.setTaints(taints);
			nodepoolsItem.setKubernetes_config(kubernetes_config);

			Nodepool_info nodepool_info = new Nodepool_info();
			nodepool_info.setCreated(_ctx.stringValue("DescribeClusterNodePoolsResponse.nodepools["+ i +"].nodepool_info.created"));
			nodepool_info.setIs_default(_ctx.booleanValue("DescribeClusterNodePoolsResponse.nodepools["+ i +"].nodepool_info.is_default"));
			nodepool_info.setName(_ctx.stringValue("DescribeClusterNodePoolsResponse.nodepools["+ i +"].nodepool_info.name"));
			nodepool_info.setNodepool_id(_ctx.stringValue("DescribeClusterNodePoolsResponse.nodepools["+ i +"].nodepool_info.nodepool_id"));
			nodepool_info.setRegion_id(_ctx.stringValue("DescribeClusterNodePoolsResponse.nodepools["+ i +"].nodepool_info.region_id"));
			nodepool_info.setResource_group_id(_ctx.stringValue("DescribeClusterNodePoolsResponse.nodepools["+ i +"].nodepool_info.resource_group_id"));
			nodepool_info.setType(_ctx.stringValue("DescribeClusterNodePoolsResponse.nodepools["+ i +"].nodepool_info.type"));
			nodepool_info.setUpdated(_ctx.stringValue("DescribeClusterNodePoolsResponse.nodepools["+ i +"].nodepool_info.updated"));
			nodepoolsItem.setNodepool_info(nodepool_info);

			Scaling_group scaling_group = new Scaling_group();
			scaling_group.setAuto_renew(_ctx.booleanValue("DescribeClusterNodePoolsResponse.nodepools["+ i +"].scaling_group.auto_renew"));
			scaling_group.setAuto_renew_period(_ctx.longValue("DescribeClusterNodePoolsResponse.nodepools["+ i +"].scaling_group.auto_renew_period"));
			scaling_group.setImage_id(_ctx.stringValue("DescribeClusterNodePoolsResponse.nodepools["+ i +"].scaling_group.image_id"));
			scaling_group.setInstance_charge_type(_ctx.stringValue("DescribeClusterNodePoolsResponse.nodepools["+ i +"].scaling_group.instance_charge_type"));
			scaling_group.setMulti_az_policy(_ctx.stringValue("DescribeClusterNodePoolsResponse.nodepools["+ i +"].scaling_group.multi_az_policy"));
			scaling_group.setOn_demand_base_capacity(_ctx.longValue("DescribeClusterNodePoolsResponse.nodepools["+ i +"].scaling_group.on_demand_base_capacity"));
			scaling_group.setOn_demand_percentage_above_base_capacity(_ctx.longValue("DescribeClusterNodePoolsResponse.nodepools["+ i +"].scaling_group.on_demand_percentage_above_base_capacity"));
			scaling_group.setSpot_instance_pools(_ctx.longValue("DescribeClusterNodePoolsResponse.nodepools["+ i +"].scaling_group.spot_instance_pools"));
			scaling_group.setSpot_instance_remedy(_ctx.booleanValue("DescribeClusterNodePoolsResponse.nodepools["+ i +"].scaling_group.spot_instance_remedy"));
			scaling_group.setCompensate_with_on_demand(_ctx.booleanValue("DescribeClusterNodePoolsResponse.nodepools["+ i +"].scaling_group.compensate_with_on_demand"));
			scaling_group.setPeriod(_ctx.longValue("DescribeClusterNodePoolsResponse.nodepools["+ i +"].scaling_group.period"));
			scaling_group.setPeriod_unit(_ctx.stringValue("DescribeClusterNodePoolsResponse.nodepools["+ i +"].scaling_group.period_unit"));
			scaling_group.setPlatform(_ctx.stringValue("DescribeClusterNodePoolsResponse.nodepools["+ i +"].scaling_group.platform"));
			scaling_group.setRam_policy(_ctx.stringValue("DescribeClusterNodePoolsResponse.nodepools["+ i +"].scaling_group.ram_policy"));
			scaling_group.setSpot_strategy(_ctx.stringValue("DescribeClusterNodePoolsResponse.nodepools["+ i +"].scaling_group.spot_strategy"));
			scaling_group.setScaling_group_id(_ctx.stringValue("DescribeClusterNodePoolsResponse.nodepools["+ i +"].scaling_group.scaling_group_id"));
			scaling_group.setScaling_policy(_ctx.stringValue("DescribeClusterNodePoolsResponse.nodepools["+ i +"].scaling_group.scaling_policy"));
			scaling_group.setSecurity_group_id(_ctx.stringValue("DescribeClusterNodePoolsResponse.nodepools["+ i +"].scaling_group.security_group_id"));
			scaling_group.setSystem_disk_category(_ctx.stringValue("DescribeClusterNodePoolsResponse.nodepools["+ i +"].scaling_group.system_disk_category"));
			scaling_group.setSystem_disk_size(_ctx.longValue("DescribeClusterNodePoolsResponse.nodepools["+ i +"].scaling_group.system_disk_size"));
			scaling_group.setSystem_disk_performance_level(_ctx.stringValue("DescribeClusterNodePoolsResponse.nodepools["+ i +"].scaling_group.system_disk_performance_level"));
			scaling_group.setLogin_password(_ctx.stringValue("DescribeClusterNodePoolsResponse.nodepools["+ i +"].scaling_group.login_password"));
			scaling_group.setKey_pair(_ctx.stringValue("DescribeClusterNodePoolsResponse.nodepools["+ i +"].scaling_group.key_pair"));
			scaling_group.setInternet_charge_type(_ctx.stringValue("DescribeClusterNodePoolsResponse.nodepools["+ i +"].scaling_group.internet_charge_type"));
			scaling_group.setInternet_max_bandwidth_out(_ctx.longValue("DescribeClusterNodePoolsResponse.nodepools["+ i +"].scaling_group.internet_max_bandwidth_out"));
			scaling_group.setDeploymentset_id(_ctx.stringValue("DescribeClusterNodePoolsResponse.nodepools["+ i +"].scaling_group.deploymentset_id"));
			scaling_group.setDesired_size(_ctx.longValue("DescribeClusterNodePoolsResponse.nodepools["+ i +"].scaling_group.desired_size"));

			List<String> instance_types = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeClusterNodePoolsResponse.nodepools["+ i +"].scaling_group.instance_types.Length"); j++) {
				instance_types.add(_ctx.stringValue("DescribeClusterNodePoolsResponse.nodepools["+ i +"].scaling_group.instance_types["+ j +"]"));
			}
			scaling_group.setInstance_types(instance_types);

			List<String> rds_instances = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeClusterNodePoolsResponse.nodepools["+ i +"].scaling_group.rds_instances.Length"); j++) {
				rds_instances.add(_ctx.stringValue("DescribeClusterNodePoolsResponse.nodepools["+ i +"].scaling_group.rds_instances["+ j +"]"));
			}
			scaling_group.setRds_instances(rds_instances);

			List<String> security_group_ids = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeClusterNodePoolsResponse.nodepools["+ i +"].scaling_group.security_group_ids.Length"); j++) {
				security_group_ids.add(_ctx.stringValue("DescribeClusterNodePoolsResponse.nodepools["+ i +"].scaling_group.security_group_ids["+ j +"]"));
			}
			scaling_group.setSecurity_group_ids(security_group_ids);

			List<String> vswitch_ids = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeClusterNodePoolsResponse.nodepools["+ i +"].scaling_group.vswitch_ids.Length"); j++) {
				vswitch_ids.add(_ctx.stringValue("DescribeClusterNodePoolsResponse.nodepools["+ i +"].scaling_group.vswitch_ids["+ j +"]"));
			}
			scaling_group.setVswitch_ids(vswitch_ids);

			List<Data_disksItem> data_disks = new ArrayList<Data_disksItem>();
			for (int j = 0; j < _ctx.lengthValue("DescribeClusterNodePoolsResponse.nodepools["+ i +"].scaling_group.data_disks.Length"); j++) {
				Data_disksItem data_disksItem = new Data_disksItem();
				data_disksItem.setCategory(_ctx.stringValue("DescribeClusterNodePoolsResponse.nodepools["+ i +"].scaling_group.data_disks["+ j +"].category"));
				data_disksItem.setSize(_ctx.longValue("DescribeClusterNodePoolsResponse.nodepools["+ i +"].scaling_group.data_disks["+ j +"].size"));
				data_disksItem.setEncrypted(_ctx.stringValue("DescribeClusterNodePoolsResponse.nodepools["+ i +"].scaling_group.data_disks["+ j +"].encrypted"));
				data_disksItem.setAuto_snapshot_policy_id(_ctx.stringValue("DescribeClusterNodePoolsResponse.nodepools["+ i +"].scaling_group.data_disks["+ j +"].auto_snapshot_policy_id"));
				data_disksItem.setPerformance_level(_ctx.stringValue("DescribeClusterNodePoolsResponse.nodepools["+ i +"].scaling_group.data_disks["+ j +"].performance_level"));

				data_disks.add(data_disksItem);
			}
			scaling_group.setData_disks(data_disks);

			List<Spot_price_limitItem> spot_price_limit = new ArrayList<Spot_price_limitItem>();
			for (int j = 0; j < _ctx.lengthValue("DescribeClusterNodePoolsResponse.nodepools["+ i +"].scaling_group.spot_price_limit.Length"); j++) {
				Spot_price_limitItem spot_price_limitItem = new Spot_price_limitItem();
				spot_price_limitItem.setInstance_type(_ctx.stringValue("DescribeClusterNodePoolsResponse.nodepools["+ i +"].scaling_group.spot_price_limit["+ j +"].instance_type"));
				spot_price_limitItem.setPrice_limit(_ctx.stringValue("DescribeClusterNodePoolsResponse.nodepools["+ i +"].scaling_group.spot_price_limit["+ j +"].price_limit"));

				spot_price_limit.add(spot_price_limitItem);
			}
			scaling_group.setSpot_price_limit(spot_price_limit);

			List<TagsItem> tags = new ArrayList<TagsItem>();
			for (int j = 0; j < _ctx.lengthValue("DescribeClusterNodePoolsResponse.nodepools["+ i +"].scaling_group.tags.Length"); j++) {
				TagsItem tagsItem = new TagsItem();
				tagsItem.setKey(_ctx.stringValue("DescribeClusterNodePoolsResponse.nodepools["+ i +"].scaling_group.tags["+ j +"].key"));
				tagsItem.setValue(_ctx.stringValue("DescribeClusterNodePoolsResponse.nodepools["+ i +"].scaling_group.tags["+ j +"].value"));

				tags.add(tagsItem);
			}
			scaling_group.setTags(tags);
			nodepoolsItem.setScaling_group(scaling_group);

			Status status = new Status();
			status.setFailed_nodes(_ctx.longValue("DescribeClusterNodePoolsResponse.nodepools["+ i +"].status.failed_nodes"));
			status.setHealthy_nodes(_ctx.longValue("DescribeClusterNodePoolsResponse.nodepools["+ i +"].status.healthy_nodes"));
			status.setInitial_nodes(_ctx.longValue("DescribeClusterNodePoolsResponse.nodepools["+ i +"].status.initial_nodes"));
			status.setOffline_nodes(_ctx.longValue("DescribeClusterNodePoolsResponse.nodepools["+ i +"].status.offline_nodes"));
			status.setRemoving_nodes(_ctx.longValue("DescribeClusterNodePoolsResponse.nodepools["+ i +"].status.removing_nodes"));
			status.setServing_nodes(_ctx.longValue("DescribeClusterNodePoolsResponse.nodepools["+ i +"].status.serving_nodes"));
			status.setState(_ctx.stringValue("DescribeClusterNodePoolsResponse.nodepools["+ i +"].status.state"));
			status.setTotal_nodes(_ctx.longValue("DescribeClusterNodePoolsResponse.nodepools["+ i +"].status.total_nodes"));
			nodepoolsItem.setStatus(status);

			Tee_config tee_config = new Tee_config();
			tee_config.setTee_enable(_ctx.booleanValue("DescribeClusterNodePoolsResponse.nodepools["+ i +"].tee_config.tee_enable"));
			nodepoolsItem.setTee_config(tee_config);

			Management management = new Management();
			management.setEnable(_ctx.booleanValue("DescribeClusterNodePoolsResponse.nodepools["+ i +"].management.enable"));
			management.setAuto_repair(_ctx.booleanValue("DescribeClusterNodePoolsResponse.nodepools["+ i +"].management.auto_repair"));

			Upgrade_config upgrade_config = new Upgrade_config();
			upgrade_config.setAuto_upgrade(_ctx.booleanValue("DescribeClusterNodePoolsResponse.nodepools["+ i +"].management.upgrade_config.auto_upgrade"));
			upgrade_config.setSurge(_ctx.longValue("DescribeClusterNodePoolsResponse.nodepools["+ i +"].management.upgrade_config.surge"));
			upgrade_config.setSurge_percentage(_ctx.longValue("DescribeClusterNodePoolsResponse.nodepools["+ i +"].management.upgrade_config.surge_percentage"));
			upgrade_config.setMax_unavailable(_ctx.longValue("DescribeClusterNodePoolsResponse.nodepools["+ i +"].management.upgrade_config.max_unavailable"));
			management.setUpgrade_config(upgrade_config);
			nodepoolsItem.setManagement(management);

			Interconnect_config interconnect_config = new Interconnect_config();
			interconnect_config.setCen_id(_ctx.stringValue("DescribeClusterNodePoolsResponse.nodepools["+ i +"].interconnect_config.cen_id"));
			interconnect_config.setCcn_id(_ctx.stringValue("DescribeClusterNodePoolsResponse.nodepools["+ i +"].interconnect_config.ccn_id"));
			interconnect_config.setCcn_region_id(_ctx.stringValue("DescribeClusterNodePoolsResponse.nodepools["+ i +"].interconnect_config.ccn_region_id"));
			interconnect_config.setBandwidth(_ctx.longValue("DescribeClusterNodePoolsResponse.nodepools["+ i +"].interconnect_config.bandwidth"));
			interconnect_config.setImproved_period(_ctx.stringValue("DescribeClusterNodePoolsResponse.nodepools["+ i +"].interconnect_config.improved_period"));
			nodepoolsItem.setInterconnect_config(interconnect_config);

			nodepools.add(nodepoolsItem);
		}
		describeClusterNodePoolsResponse.setNodepools(nodepools);
	 
	 	return describeClusterNodePoolsResponse;
	}
}