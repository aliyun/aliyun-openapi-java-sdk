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

import com.aliyuncs.cs.model.v20151215.DescribeClusterNodePoolDetailResponse;
import com.aliyuncs.cs.model.v20151215.DescribeClusterNodePoolDetailResponse.Auto_scaling;
import com.aliyuncs.cs.model.v20151215.DescribeClusterNodePoolDetailResponse.Interconnect_config;
import com.aliyuncs.cs.model.v20151215.DescribeClusterNodePoolDetailResponse.Kubernetes_config;
import com.aliyuncs.cs.model.v20151215.DescribeClusterNodePoolDetailResponse.Kubernetes_config.LabelsItem;
import com.aliyuncs.cs.model.v20151215.DescribeClusterNodePoolDetailResponse.Kubernetes_config.TaintsItem;
import com.aliyuncs.cs.model.v20151215.DescribeClusterNodePoolDetailResponse.Management;
import com.aliyuncs.cs.model.v20151215.DescribeClusterNodePoolDetailResponse.Management.Upgrade_config;
import com.aliyuncs.cs.model.v20151215.DescribeClusterNodePoolDetailResponse.Nodepool_info;
import com.aliyuncs.cs.model.v20151215.DescribeClusterNodePoolDetailResponse.Scaling_group;
import com.aliyuncs.cs.model.v20151215.DescribeClusterNodePoolDetailResponse.Scaling_group.Data_disksItem;
import com.aliyuncs.cs.model.v20151215.DescribeClusterNodePoolDetailResponse.Scaling_group.Spot_price_limitItem;
import com.aliyuncs.cs.model.v20151215.DescribeClusterNodePoolDetailResponse.Scaling_group.TagsItem;
import com.aliyuncs.cs.model.v20151215.DescribeClusterNodePoolDetailResponse.Status;
import com.aliyuncs.cs.model.v20151215.DescribeClusterNodePoolDetailResponse.Tee_config;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeClusterNodePoolDetailResponseUnmarshaller {

	public static DescribeClusterNodePoolDetailResponse unmarshall(DescribeClusterNodePoolDetailResponse describeClusterNodePoolDetailResponse, UnmarshallerContext _ctx) {
		
		describeClusterNodePoolDetailResponse.setInterconnect_mode(_ctx.stringValue("DescribeClusterNodePoolDetailResponse.interconnect_mode"));
		describeClusterNodePoolDetailResponse.setMax_nodes(_ctx.longValue("DescribeClusterNodePoolDetailResponse.max_nodes"));

		Auto_scaling auto_scaling = new Auto_scaling();
		auto_scaling.setEip_bandwidth(_ctx.longValue("DescribeClusterNodePoolDetailResponse.auto_scaling.eip_bandwidth"));
		auto_scaling.setEip_internet_charge_type(_ctx.stringValue("DescribeClusterNodePoolDetailResponse.auto_scaling.eip_internet_charge_type"));
		auto_scaling.setEnable(_ctx.booleanValue("DescribeClusterNodePoolDetailResponse.auto_scaling.enable"));
		auto_scaling.setIs_bond_eip(_ctx.booleanValue("DescribeClusterNodePoolDetailResponse.auto_scaling.is_bond_eip"));
		auto_scaling.setMax_instances(_ctx.longValue("DescribeClusterNodePoolDetailResponse.auto_scaling.max_instances"));
		auto_scaling.setMin_instances(_ctx.longValue("DescribeClusterNodePoolDetailResponse.auto_scaling.min_instances"));
		auto_scaling.setType(_ctx.stringValue("DescribeClusterNodePoolDetailResponse.auto_scaling.type"));
		describeClusterNodePoolDetailResponse.setAuto_scaling(auto_scaling);

		Kubernetes_config kubernetes_config = new Kubernetes_config();
		kubernetes_config.setCms_enabled(_ctx.booleanValue("DescribeClusterNodePoolDetailResponse.kubernetes_config.cms_enabled"));
		kubernetes_config.setCpu_policy(_ctx.stringValue("DescribeClusterNodePoolDetailResponse.kubernetes_config.cpu_policy"));
		kubernetes_config.setRuntime(_ctx.stringValue("DescribeClusterNodePoolDetailResponse.kubernetes_config.runtime"));
		kubernetes_config.setRuntime_version(_ctx.stringValue("DescribeClusterNodePoolDetailResponse.kubernetes_config.runtime_version"));
		kubernetes_config.setUser_data(_ctx.stringValue("DescribeClusterNodePoolDetailResponse.kubernetes_config.user_data"));
		kubernetes_config.setNode_name_mode(_ctx.stringValue("DescribeClusterNodePoolDetailResponse.kubernetes_config.node_name_mode"));

		List<LabelsItem> labels = new ArrayList<LabelsItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeClusterNodePoolDetailResponse.kubernetes_config.labels.Length"); i++) {
			LabelsItem labelsItem = new LabelsItem();
			labelsItem.setKey(_ctx.stringValue("DescribeClusterNodePoolDetailResponse.kubernetes_config.labels["+ i +"].key"));
			labelsItem.setValue(_ctx.stringValue("DescribeClusterNodePoolDetailResponse.kubernetes_config.labels["+ i +"].value"));

			labels.add(labelsItem);
		}
		kubernetes_config.setLabels(labels);

		List<TaintsItem> taints = new ArrayList<TaintsItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeClusterNodePoolDetailResponse.kubernetes_config.taints.Length"); i++) {
			TaintsItem taintsItem = new TaintsItem();
			taintsItem.setKey(_ctx.stringValue("DescribeClusterNodePoolDetailResponse.kubernetes_config.taints["+ i +"].key"));
			taintsItem.setValue(_ctx.stringValue("DescribeClusterNodePoolDetailResponse.kubernetes_config.taints["+ i +"].value"));
			taintsItem.setEffect(_ctx.stringValue("DescribeClusterNodePoolDetailResponse.kubernetes_config.taints["+ i +"].effect"));

			taints.add(taintsItem);
		}
		kubernetes_config.setTaints(taints);
		describeClusterNodePoolDetailResponse.setKubernetes_config(kubernetes_config);

		Nodepool_info nodepool_info = new Nodepool_info();
		nodepool_info.setCreated(_ctx.stringValue("DescribeClusterNodePoolDetailResponse.nodepool_info.created"));
		nodepool_info.setIs_default(_ctx.booleanValue("DescribeClusterNodePoolDetailResponse.nodepool_info.is_default"));
		nodepool_info.setName(_ctx.stringValue("DescribeClusterNodePoolDetailResponse.nodepool_info.name"));
		nodepool_info.setNodepool_id(_ctx.stringValue("DescribeClusterNodePoolDetailResponse.nodepool_info.nodepool_id"));
		nodepool_info.setRegion_id(_ctx.stringValue("DescribeClusterNodePoolDetailResponse.nodepool_info.region_id"));
		nodepool_info.setResource_group_id(_ctx.stringValue("DescribeClusterNodePoolDetailResponse.nodepool_info.resource_group_id"));
		nodepool_info.setType(_ctx.stringValue("DescribeClusterNodePoolDetailResponse.nodepool_info.type"));
		nodepool_info.setUpdated(_ctx.stringValue("DescribeClusterNodePoolDetailResponse.nodepool_info.updated"));
		describeClusterNodePoolDetailResponse.setNodepool_info(nodepool_info);

		Scaling_group scaling_group = new Scaling_group();
		scaling_group.setAuto_renew(_ctx.booleanValue("DescribeClusterNodePoolDetailResponse.scaling_group.auto_renew"));
		scaling_group.setAuto_renew_period(_ctx.longValue("DescribeClusterNodePoolDetailResponse.scaling_group.auto_renew_period"));
		scaling_group.setImage_id(_ctx.stringValue("DescribeClusterNodePoolDetailResponse.scaling_group.image_id"));
		scaling_group.setInstance_charge_type(_ctx.stringValue("DescribeClusterNodePoolDetailResponse.scaling_group.instance_charge_type"));
		scaling_group.setMulti_az_policy(_ctx.stringValue("DescribeClusterNodePoolDetailResponse.scaling_group.multi_az_policy"));
		scaling_group.setOn_demand_base_capacity(_ctx.longValue("DescribeClusterNodePoolDetailResponse.scaling_group.on_demand_base_capacity"));
		scaling_group.setOn_demand_percentage_above_base_capacity(_ctx.longValue("DescribeClusterNodePoolDetailResponse.scaling_group.on_demand_percentage_above_base_capacity"));
		scaling_group.setSpot_instance_pools(_ctx.longValue("DescribeClusterNodePoolDetailResponse.scaling_group.spot_instance_pools"));
		scaling_group.setSpot_instance_remedy(_ctx.booleanValue("DescribeClusterNodePoolDetailResponse.scaling_group.spot_instance_remedy"));
		scaling_group.setCompensate_with_on_demand(_ctx.booleanValue("DescribeClusterNodePoolDetailResponse.scaling_group.compensate_with_on_demand"));
		scaling_group.setPeriod(_ctx.longValue("DescribeClusterNodePoolDetailResponse.scaling_group.period"));
		scaling_group.setPeriod_unit(_ctx.stringValue("DescribeClusterNodePoolDetailResponse.scaling_group.period_unit"));
		scaling_group.setPlatform(_ctx.stringValue("DescribeClusterNodePoolDetailResponse.scaling_group.platform"));
		scaling_group.setRam_policy(_ctx.stringValue("DescribeClusterNodePoolDetailResponse.scaling_group.ram_policy"));
		scaling_group.setSpot_strategy(_ctx.stringValue("DescribeClusterNodePoolDetailResponse.scaling_group.spot_strategy"));
		scaling_group.setScaling_group_id(_ctx.stringValue("DescribeClusterNodePoolDetailResponse.scaling_group.scaling_group_id"));
		scaling_group.setScaling_policy(_ctx.stringValue("DescribeClusterNodePoolDetailResponse.scaling_group.scaling_policy"));
		scaling_group.setSecurity_group_id(_ctx.stringValue("DescribeClusterNodePoolDetailResponse.scaling_group.security_group_id"));
		scaling_group.setSystem_disk_category(_ctx.stringValue("DescribeClusterNodePoolDetailResponse.scaling_group.system_disk_category"));
		scaling_group.setSystem_disk_size(_ctx.longValue("DescribeClusterNodePoolDetailResponse.scaling_group.system_disk_size"));
		scaling_group.setSystem_disk_performance_level(_ctx.stringValue("DescribeClusterNodePoolDetailResponse.scaling_group.system_disk_performance_level"));
		scaling_group.setLogin_password(_ctx.stringValue("DescribeClusterNodePoolDetailResponse.scaling_group.login_password"));
		scaling_group.setKey_pair(_ctx.stringValue("DescribeClusterNodePoolDetailResponse.scaling_group.key_pair"));
		scaling_group.setInternet_charge_type(_ctx.stringValue("DescribeClusterNodePoolDetailResponse.scaling_group.internet_charge_type"));
		scaling_group.setInternet_max_bandwidth_out(_ctx.longValue("DescribeClusterNodePoolDetailResponse.scaling_group.internet_max_bandwidth_out"));
		scaling_group.setDeploymentset_id(_ctx.stringValue("DescribeClusterNodePoolDetailResponse.scaling_group.deploymentset_id"));
		scaling_group.setDesired_size(_ctx.longValue("DescribeClusterNodePoolDetailResponse.scaling_group.desired_size"));

		List<String> instance_types = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeClusterNodePoolDetailResponse.scaling_group.instance_types.Length"); i++) {
			instance_types.add(_ctx.stringValue("DescribeClusterNodePoolDetailResponse.scaling_group.instance_types["+ i +"]"));
		}
		scaling_group.setInstance_types(instance_types);

		List<String> rds_instances = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeClusterNodePoolDetailResponse.scaling_group.rds_instances.Length"); i++) {
			rds_instances.add(_ctx.stringValue("DescribeClusterNodePoolDetailResponse.scaling_group.rds_instances["+ i +"]"));
		}
		scaling_group.setRds_instances(rds_instances);

		List<String> security_group_ids = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeClusterNodePoolDetailResponse.scaling_group.security_group_ids.Length"); i++) {
			security_group_ids.add(_ctx.stringValue("DescribeClusterNodePoolDetailResponse.scaling_group.security_group_ids["+ i +"]"));
		}
		scaling_group.setSecurity_group_ids(security_group_ids);

		List<String> vswitch_ids = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeClusterNodePoolDetailResponse.scaling_group.vswitch_ids.Length"); i++) {
			vswitch_ids.add(_ctx.stringValue("DescribeClusterNodePoolDetailResponse.scaling_group.vswitch_ids["+ i +"]"));
		}
		scaling_group.setVswitch_ids(vswitch_ids);

		List<Data_disksItem> data_disks = new ArrayList<Data_disksItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeClusterNodePoolDetailResponse.scaling_group.data_disks.Length"); i++) {
			Data_disksItem data_disksItem = new Data_disksItem();
			data_disksItem.setCategory(_ctx.stringValue("DescribeClusterNodePoolDetailResponse.scaling_group.data_disks["+ i +"].category"));
			data_disksItem.setSize(_ctx.longValue("DescribeClusterNodePoolDetailResponse.scaling_group.data_disks["+ i +"].size"));
			data_disksItem.setEncrypted(_ctx.stringValue("DescribeClusterNodePoolDetailResponse.scaling_group.data_disks["+ i +"].encrypted"));
			data_disksItem.setAuto_snapshot_policy_id(_ctx.stringValue("DescribeClusterNodePoolDetailResponse.scaling_group.data_disks["+ i +"].auto_snapshot_policy_id"));
			data_disksItem.setPerformance_level(_ctx.stringValue("DescribeClusterNodePoolDetailResponse.scaling_group.data_disks["+ i +"].performance_level"));

			data_disks.add(data_disksItem);
		}
		scaling_group.setData_disks(data_disks);

		List<Spot_price_limitItem> spot_price_limit = new ArrayList<Spot_price_limitItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeClusterNodePoolDetailResponse.scaling_group.spot_price_limit.Length"); i++) {
			Spot_price_limitItem spot_price_limitItem = new Spot_price_limitItem();
			spot_price_limitItem.setInstance_type(_ctx.stringValue("DescribeClusterNodePoolDetailResponse.scaling_group.spot_price_limit["+ i +"].instance_type"));
			spot_price_limitItem.setPrice_limit(_ctx.stringValue("DescribeClusterNodePoolDetailResponse.scaling_group.spot_price_limit["+ i +"].price_limit"));

			spot_price_limit.add(spot_price_limitItem);
		}
		scaling_group.setSpot_price_limit(spot_price_limit);

		List<TagsItem> tags = new ArrayList<TagsItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeClusterNodePoolDetailResponse.scaling_group.tags.Length"); i++) {
			TagsItem tagsItem = new TagsItem();
			tagsItem.setKey(_ctx.stringValue("DescribeClusterNodePoolDetailResponse.scaling_group.tags["+ i +"].key"));
			tagsItem.setValue(_ctx.stringValue("DescribeClusterNodePoolDetailResponse.scaling_group.tags["+ i +"].value"));

			tags.add(tagsItem);
		}
		scaling_group.setTags(tags);
		describeClusterNodePoolDetailResponse.setScaling_group(scaling_group);

		Status status = new Status();
		status.setFailed_nodes(_ctx.longValue("DescribeClusterNodePoolDetailResponse.status.failed_nodes"));
		status.setHealthy_nodes(_ctx.longValue("DescribeClusterNodePoolDetailResponse.status.healthy_nodes"));
		status.setInitial_nodes(_ctx.longValue("DescribeClusterNodePoolDetailResponse.status.initial_nodes"));
		status.setOffline_nodes(_ctx.longValue("DescribeClusterNodePoolDetailResponse.status.offline_nodes"));
		status.setRemoving_nodes(_ctx.longValue("DescribeClusterNodePoolDetailResponse.status.removing_nodes"));
		status.setServing_nodes(_ctx.longValue("DescribeClusterNodePoolDetailResponse.status.serving_nodes"));
		status.setState(_ctx.stringValue("DescribeClusterNodePoolDetailResponse.status.state"));
		status.setTotal_nodes(_ctx.longValue("DescribeClusterNodePoolDetailResponse.status.total_nodes"));
		describeClusterNodePoolDetailResponse.setStatus(status);

		Tee_config tee_config = new Tee_config();
		tee_config.setTee_enable(_ctx.booleanValue("DescribeClusterNodePoolDetailResponse.tee_config.tee_enable"));
		describeClusterNodePoolDetailResponse.setTee_config(tee_config);

		Management management = new Management();
		management.setEnable(_ctx.booleanValue("DescribeClusterNodePoolDetailResponse.management.enable"));
		management.setAuto_repair(_ctx.booleanValue("DescribeClusterNodePoolDetailResponse.management.auto_repair"));

		Upgrade_config upgrade_config = new Upgrade_config();
		upgrade_config.setAuto_upgrade(_ctx.booleanValue("DescribeClusterNodePoolDetailResponse.management.upgrade_config.auto_upgrade"));
		upgrade_config.setSurge(_ctx.longValue("DescribeClusterNodePoolDetailResponse.management.upgrade_config.surge"));
		upgrade_config.setSurge_percentage(_ctx.longValue("DescribeClusterNodePoolDetailResponse.management.upgrade_config.surge_percentage"));
		upgrade_config.setMax_unavailable(_ctx.longValue("DescribeClusterNodePoolDetailResponse.management.upgrade_config.max_unavailable"));
		management.setUpgrade_config(upgrade_config);
		describeClusterNodePoolDetailResponse.setManagement(management);

		Interconnect_config interconnect_config = new Interconnect_config();
		interconnect_config.setCen_id(_ctx.stringValue("DescribeClusterNodePoolDetailResponse.interconnect_config.cen_id"));
		interconnect_config.setCcn_id(_ctx.stringValue("DescribeClusterNodePoolDetailResponse.interconnect_config.ccn_id"));
		interconnect_config.setCcn_region_id(_ctx.stringValue("DescribeClusterNodePoolDetailResponse.interconnect_config.ccn_region_id"));
		interconnect_config.setBandwidth(_ctx.longValue("DescribeClusterNodePoolDetailResponse.interconnect_config.bandwidth"));
		interconnect_config.setImproved_period(_ctx.stringValue("DescribeClusterNodePoolDetailResponse.interconnect_config.improved_period"));
		describeClusterNodePoolDetailResponse.setInterconnect_config(interconnect_config);
	 
	 	return describeClusterNodePoolDetailResponse;
	}
}