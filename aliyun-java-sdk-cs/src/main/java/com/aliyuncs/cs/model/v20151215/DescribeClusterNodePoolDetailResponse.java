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

package com.aliyuncs.cs.model.v20151215;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.cs.transform.v20151215.DescribeClusterNodePoolDetailResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeClusterNodePoolDetailResponse extends AcsResponse {

	private String interconnect_mode;

	private Long max_nodes;

	private Auto_scaling auto_scaling;

	private Kubernetes_config kubernetes_config;

	private Nodepool_info nodepool_info;

	private Scaling_group scaling_group;

	private Status status;

	private Tee_config tee_config;

	private Management management;

	private Interconnect_config interconnect_config;

	public String getInterconnect_mode() {
		return this.interconnect_mode;
	}

	public void setInterconnect_mode(String interconnect_mode) {
		this.interconnect_mode = interconnect_mode;
	}

	public Long getMax_nodes() {
		return this.max_nodes;
	}

	public void setMax_nodes(Long max_nodes) {
		this.max_nodes = max_nodes;
	}

	public Auto_scaling getAuto_scaling() {
		return this.auto_scaling;
	}

	public void setAuto_scaling(Auto_scaling auto_scaling) {
		this.auto_scaling = auto_scaling;
	}

	public Kubernetes_config getKubernetes_config() {
		return this.kubernetes_config;
	}

	public void setKubernetes_config(Kubernetes_config kubernetes_config) {
		this.kubernetes_config = kubernetes_config;
	}

	public Nodepool_info getNodepool_info() {
		return this.nodepool_info;
	}

	public void setNodepool_info(Nodepool_info nodepool_info) {
		this.nodepool_info = nodepool_info;
	}

	public Scaling_group getScaling_group() {
		return this.scaling_group;
	}

	public void setScaling_group(Scaling_group scaling_group) {
		this.scaling_group = scaling_group;
	}

	public Status getStatus() {
		return this.status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public Tee_config getTee_config() {
		return this.tee_config;
	}

	public void setTee_config(Tee_config tee_config) {
		this.tee_config = tee_config;
	}

	public Management getManagement() {
		return this.management;
	}

	public void setManagement(Management management) {
		this.management = management;
	}

	public Interconnect_config getInterconnect_config() {
		return this.interconnect_config;
	}

	public void setInterconnect_config(Interconnect_config interconnect_config) {
		this.interconnect_config = interconnect_config;
	}

	public static class Auto_scaling {

		private Long eip_bandwidth;

		private String eip_internet_charge_type;

		private Boolean enable;

		private Boolean is_bond_eip;

		private Long max_instances;

		private Long min_instances;

		private String type;

		public Long getEip_bandwidth() {
			return this.eip_bandwidth;
		}

		public void setEip_bandwidth(Long eip_bandwidth) {
			this.eip_bandwidth = eip_bandwidth;
		}

		public String getEip_internet_charge_type() {
			return this.eip_internet_charge_type;
		}

		public void setEip_internet_charge_type(String eip_internet_charge_type) {
			this.eip_internet_charge_type = eip_internet_charge_type;
		}

		public Boolean getEnable() {
			return this.enable;
		}

		public void setEnable(Boolean enable) {
			this.enable = enable;
		}

		public Boolean getIs_bond_eip() {
			return this.is_bond_eip;
		}

		public void setIs_bond_eip(Boolean is_bond_eip) {
			this.is_bond_eip = is_bond_eip;
		}

		public Long getMax_instances() {
			return this.max_instances;
		}

		public void setMax_instances(Long max_instances) {
			this.max_instances = max_instances;
		}

		public Long getMin_instances() {
			return this.min_instances;
		}

		public void setMin_instances(Long min_instances) {
			this.min_instances = min_instances;
		}

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}
	}

	public static class Kubernetes_config {

		private Boolean cms_enabled;

		private String cpu_policy;

		private String runtime;

		private String runtime_version;

		private String user_data;

		private String node_name_mode;

		private List<LabelsItem> labels;

		private List<TaintsItem> taints;

		public Boolean getCms_enabled() {
			return this.cms_enabled;
		}

		public void setCms_enabled(Boolean cms_enabled) {
			this.cms_enabled = cms_enabled;
		}

		public String getCpu_policy() {
			return this.cpu_policy;
		}

		public void setCpu_policy(String cpu_policy) {
			this.cpu_policy = cpu_policy;
		}

		public String getRuntime() {
			return this.runtime;
		}

		public void setRuntime(String runtime) {
			this.runtime = runtime;
		}

		public String getRuntime_version() {
			return this.runtime_version;
		}

		public void setRuntime_version(String runtime_version) {
			this.runtime_version = runtime_version;
		}

		public String getUser_data() {
			return this.user_data;
		}

		public void setUser_data(String user_data) {
			this.user_data = user_data;
		}

		public String getNode_name_mode() {
			return this.node_name_mode;
		}

		public void setNode_name_mode(String node_name_mode) {
			this.node_name_mode = node_name_mode;
		}

		public List<LabelsItem> getLabels() {
			return this.labels;
		}

		public void setLabels(List<LabelsItem> labels) {
			this.labels = labels;
		}

		public List<TaintsItem> getTaints() {
			return this.taints;
		}

		public void setTaints(List<TaintsItem> taints) {
			this.taints = taints;
		}

		public static class LabelsItem {

			private String key;

			private String value;

			public String getKey() {
				return this.key;
			}

			public void setKey(String key) {
				this.key = key;
			}

			public String getValue() {
				return this.value;
			}

			public void setValue(String value) {
				this.value = value;
			}
		}

		public static class TaintsItem {

			private String key;

			private String value;

			private String effect;

			public String getKey() {
				return this.key;
			}

			public void setKey(String key) {
				this.key = key;
			}

			public String getValue() {
				return this.value;
			}

			public void setValue(String value) {
				this.value = value;
			}

			public String getEffect() {
				return this.effect;
			}

			public void setEffect(String effect) {
				this.effect = effect;
			}
		}
	}

	public static class Nodepool_info {

		private String created;

		private Boolean is_default;

		private String name;

		private String nodepool_id;

		private String region_id;

		private String resource_group_id;

		private String type;

		private String updated;

		public String getCreated() {
			return this.created;
		}

		public void setCreated(String created) {
			this.created = created;
		}

		public Boolean getIs_default() {
			return this.is_default;
		}

		public void setIs_default(Boolean is_default) {
			this.is_default = is_default;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getNodepool_id() {
			return this.nodepool_id;
		}

		public void setNodepool_id(String nodepool_id) {
			this.nodepool_id = nodepool_id;
		}

		public String getRegion_id() {
			return this.region_id;
		}

		public void setRegion_id(String region_id) {
			this.region_id = region_id;
		}

		public String getResource_group_id() {
			return this.resource_group_id;
		}

		public void setResource_group_id(String resource_group_id) {
			this.resource_group_id = resource_group_id;
		}

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public String getUpdated() {
			return this.updated;
		}

		public void setUpdated(String updated) {
			this.updated = updated;
		}
	}

	public static class Scaling_group {

		private Boolean auto_renew;

		private Long auto_renew_period;

		private String image_id;

		private String instance_charge_type;

		private String multi_az_policy;

		private Long on_demand_base_capacity;

		private Long on_demand_percentage_above_base_capacity;

		private Long spot_instance_pools;

		private Boolean spot_instance_remedy;

		private Boolean compensate_with_on_demand;

		private Long period;

		private String period_unit;

		private String platform;

		private String ram_policy;

		private String spot_strategy;

		private String scaling_group_id;

		private String scaling_policy;

		private String security_group_id;

		private String system_disk_category;

		private Long system_disk_size;

		private String system_disk_performance_level;

		private String login_password;

		private String key_pair;

		private String internet_charge_type;

		private Long internet_max_bandwidth_out;

		private String deploymentset_id;

		private Long desired_size;

		private List<Data_disksItem> data_disks;

		private List<Spot_price_limitItem> spot_price_limit;

		private List<TagsItem> tags;

		private List<String> instance_types;

		private List<String> rds_instances;

		private List<String> security_group_ids;

		private List<String> vswitch_ids;

		public Boolean getAuto_renew() {
			return this.auto_renew;
		}

		public void setAuto_renew(Boolean auto_renew) {
			this.auto_renew = auto_renew;
		}

		public Long getAuto_renew_period() {
			return this.auto_renew_period;
		}

		public void setAuto_renew_period(Long auto_renew_period) {
			this.auto_renew_period = auto_renew_period;
		}

		public String getImage_id() {
			return this.image_id;
		}

		public void setImage_id(String image_id) {
			this.image_id = image_id;
		}

		public String getInstance_charge_type() {
			return this.instance_charge_type;
		}

		public void setInstance_charge_type(String instance_charge_type) {
			this.instance_charge_type = instance_charge_type;
		}

		public String getMulti_az_policy() {
			return this.multi_az_policy;
		}

		public void setMulti_az_policy(String multi_az_policy) {
			this.multi_az_policy = multi_az_policy;
		}

		public Long getOn_demand_base_capacity() {
			return this.on_demand_base_capacity;
		}

		public void setOn_demand_base_capacity(Long on_demand_base_capacity) {
			this.on_demand_base_capacity = on_demand_base_capacity;
		}

		public Long getOn_demand_percentage_above_base_capacity() {
			return this.on_demand_percentage_above_base_capacity;
		}

		public void setOn_demand_percentage_above_base_capacity(Long on_demand_percentage_above_base_capacity) {
			this.on_demand_percentage_above_base_capacity = on_demand_percentage_above_base_capacity;
		}

		public Long getSpot_instance_pools() {
			return this.spot_instance_pools;
		}

		public void setSpot_instance_pools(Long spot_instance_pools) {
			this.spot_instance_pools = spot_instance_pools;
		}

		public Boolean getSpot_instance_remedy() {
			return this.spot_instance_remedy;
		}

		public void setSpot_instance_remedy(Boolean spot_instance_remedy) {
			this.spot_instance_remedy = spot_instance_remedy;
		}

		public Boolean getCompensate_with_on_demand() {
			return this.compensate_with_on_demand;
		}

		public void setCompensate_with_on_demand(Boolean compensate_with_on_demand) {
			this.compensate_with_on_demand = compensate_with_on_demand;
		}

		public Long getPeriod() {
			return this.period;
		}

		public void setPeriod(Long period) {
			this.period = period;
		}

		public String getPeriod_unit() {
			return this.period_unit;
		}

		public void setPeriod_unit(String period_unit) {
			this.period_unit = period_unit;
		}

		public String getPlatform() {
			return this.platform;
		}

		public void setPlatform(String platform) {
			this.platform = platform;
		}

		public String getRam_policy() {
			return this.ram_policy;
		}

		public void setRam_policy(String ram_policy) {
			this.ram_policy = ram_policy;
		}

		public String getSpot_strategy() {
			return this.spot_strategy;
		}

		public void setSpot_strategy(String spot_strategy) {
			this.spot_strategy = spot_strategy;
		}

		public String getScaling_group_id() {
			return this.scaling_group_id;
		}

		public void setScaling_group_id(String scaling_group_id) {
			this.scaling_group_id = scaling_group_id;
		}

		public String getScaling_policy() {
			return this.scaling_policy;
		}

		public void setScaling_policy(String scaling_policy) {
			this.scaling_policy = scaling_policy;
		}

		public String getSecurity_group_id() {
			return this.security_group_id;
		}

		public void setSecurity_group_id(String security_group_id) {
			this.security_group_id = security_group_id;
		}

		public String getSystem_disk_category() {
			return this.system_disk_category;
		}

		public void setSystem_disk_category(String system_disk_category) {
			this.system_disk_category = system_disk_category;
		}

		public Long getSystem_disk_size() {
			return this.system_disk_size;
		}

		public void setSystem_disk_size(Long system_disk_size) {
			this.system_disk_size = system_disk_size;
		}

		public String getSystem_disk_performance_level() {
			return this.system_disk_performance_level;
		}

		public void setSystem_disk_performance_level(String system_disk_performance_level) {
			this.system_disk_performance_level = system_disk_performance_level;
		}

		public String getLogin_password() {
			return this.login_password;
		}

		public void setLogin_password(String login_password) {
			this.login_password = login_password;
		}

		public String getKey_pair() {
			return this.key_pair;
		}

		public void setKey_pair(String key_pair) {
			this.key_pair = key_pair;
		}

		public String getInternet_charge_type() {
			return this.internet_charge_type;
		}

		public void setInternet_charge_type(String internet_charge_type) {
			this.internet_charge_type = internet_charge_type;
		}

		public Long getInternet_max_bandwidth_out() {
			return this.internet_max_bandwidth_out;
		}

		public void setInternet_max_bandwidth_out(Long internet_max_bandwidth_out) {
			this.internet_max_bandwidth_out = internet_max_bandwidth_out;
		}

		public String getDeploymentset_id() {
			return this.deploymentset_id;
		}

		public void setDeploymentset_id(String deploymentset_id) {
			this.deploymentset_id = deploymentset_id;
		}

		public Long getDesired_size() {
			return this.desired_size;
		}

		public void setDesired_size(Long desired_size) {
			this.desired_size = desired_size;
		}

		public List<Data_disksItem> getData_disks() {
			return this.data_disks;
		}

		public void setData_disks(List<Data_disksItem> data_disks) {
			this.data_disks = data_disks;
		}

		public List<Spot_price_limitItem> getSpot_price_limit() {
			return this.spot_price_limit;
		}

		public void setSpot_price_limit(List<Spot_price_limitItem> spot_price_limit) {
			this.spot_price_limit = spot_price_limit;
		}

		public List<TagsItem> getTags() {
			return this.tags;
		}

		public void setTags(List<TagsItem> tags) {
			this.tags = tags;
		}

		public List<String> getInstance_types() {
			return this.instance_types;
		}

		public void setInstance_types(List<String> instance_types) {
			this.instance_types = instance_types;
		}

		public List<String> getRds_instances() {
			return this.rds_instances;
		}

		public void setRds_instances(List<String> rds_instances) {
			this.rds_instances = rds_instances;
		}

		public List<String> getSecurity_group_ids() {
			return this.security_group_ids;
		}

		public void setSecurity_group_ids(List<String> security_group_ids) {
			this.security_group_ids = security_group_ids;
		}

		public List<String> getVswitch_ids() {
			return this.vswitch_ids;
		}

		public void setVswitch_ids(List<String> vswitch_ids) {
			this.vswitch_ids = vswitch_ids;
		}

		public static class Data_disksItem {

			private String category;

			private Long size;

			private String encrypted;

			private String auto_snapshot_policy_id;

			private String performance_level;

			public String getCategory() {
				return this.category;
			}

			public void setCategory(String category) {
				this.category = category;
			}

			public Long getSize() {
				return this.size;
			}

			public void setSize(Long size) {
				this.size = size;
			}

			public String getEncrypted() {
				return this.encrypted;
			}

			public void setEncrypted(String encrypted) {
				this.encrypted = encrypted;
			}

			public String getAuto_snapshot_policy_id() {
				return this.auto_snapshot_policy_id;
			}

			public void setAuto_snapshot_policy_id(String auto_snapshot_policy_id) {
				this.auto_snapshot_policy_id = auto_snapshot_policy_id;
			}

			public String getPerformance_level() {
				return this.performance_level;
			}

			public void setPerformance_level(String performance_level) {
				this.performance_level = performance_level;
			}
		}

		public static class Spot_price_limitItem {

			private String instance_type;

			private String price_limit;

			public String getInstance_type() {
				return this.instance_type;
			}

			public void setInstance_type(String instance_type) {
				this.instance_type = instance_type;
			}

			public String getPrice_limit() {
				return this.price_limit;
			}

			public void setPrice_limit(String price_limit) {
				this.price_limit = price_limit;
			}
		}

		public static class TagsItem {

			private String key;

			private String value;

			public String getKey() {
				return this.key;
			}

			public void setKey(String key) {
				this.key = key;
			}

			public String getValue() {
				return this.value;
			}

			public void setValue(String value) {
				this.value = value;
			}
		}
	}

	public static class Status {

		private Long failed_nodes;

		private Long healthy_nodes;

		private Long initial_nodes;

		private Long offline_nodes;

		private Long removing_nodes;

		private Long serving_nodes;

		private String state;

		private Long total_nodes;

		public Long getFailed_nodes() {
			return this.failed_nodes;
		}

		public void setFailed_nodes(Long failed_nodes) {
			this.failed_nodes = failed_nodes;
		}

		public Long getHealthy_nodes() {
			return this.healthy_nodes;
		}

		public void setHealthy_nodes(Long healthy_nodes) {
			this.healthy_nodes = healthy_nodes;
		}

		public Long getInitial_nodes() {
			return this.initial_nodes;
		}

		public void setInitial_nodes(Long initial_nodes) {
			this.initial_nodes = initial_nodes;
		}

		public Long getOffline_nodes() {
			return this.offline_nodes;
		}

		public void setOffline_nodes(Long offline_nodes) {
			this.offline_nodes = offline_nodes;
		}

		public Long getRemoving_nodes() {
			return this.removing_nodes;
		}

		public void setRemoving_nodes(Long removing_nodes) {
			this.removing_nodes = removing_nodes;
		}

		public Long getServing_nodes() {
			return this.serving_nodes;
		}

		public void setServing_nodes(Long serving_nodes) {
			this.serving_nodes = serving_nodes;
		}

		public String getState() {
			return this.state;
		}

		public void setState(String state) {
			this.state = state;
		}

		public Long getTotal_nodes() {
			return this.total_nodes;
		}

		public void setTotal_nodes(Long total_nodes) {
			this.total_nodes = total_nodes;
		}
	}

	public static class Tee_config {

		private Boolean tee_enable;

		public Boolean getTee_enable() {
			return this.tee_enable;
		}

		public void setTee_enable(Boolean tee_enable) {
			this.tee_enable = tee_enable;
		}
	}

	public static class Management {

		private Boolean enable;

		private Boolean auto_repair;

		private Upgrade_config upgrade_config;

		public Boolean getEnable() {
			return this.enable;
		}

		public void setEnable(Boolean enable) {
			this.enable = enable;
		}

		public Boolean getAuto_repair() {
			return this.auto_repair;
		}

		public void setAuto_repair(Boolean auto_repair) {
			this.auto_repair = auto_repair;
		}

		public Upgrade_config getUpgrade_config() {
			return this.upgrade_config;
		}

		public void setUpgrade_config(Upgrade_config upgrade_config) {
			this.upgrade_config = upgrade_config;
		}

		public static class Upgrade_config {

			private Boolean auto_upgrade;

			private Long surge;

			private Long surge_percentage;

			private Long max_unavailable;

			public Boolean getAuto_upgrade() {
				return this.auto_upgrade;
			}

			public void setAuto_upgrade(Boolean auto_upgrade) {
				this.auto_upgrade = auto_upgrade;
			}

			public Long getSurge() {
				return this.surge;
			}

			public void setSurge(Long surge) {
				this.surge = surge;
			}

			public Long getSurge_percentage() {
				return this.surge_percentage;
			}

			public void setSurge_percentage(Long surge_percentage) {
				this.surge_percentage = surge_percentage;
			}

			public Long getMax_unavailable() {
				return this.max_unavailable;
			}

			public void setMax_unavailable(Long max_unavailable) {
				this.max_unavailable = max_unavailable;
			}
		}
	}

	public static class Interconnect_config {

		private String cen_id;

		private String ccn_id;

		private String ccn_region_id;

		private Long bandwidth;

		private String improved_period;

		public String getCen_id() {
			return this.cen_id;
		}

		public void setCen_id(String cen_id) {
			this.cen_id = cen_id;
		}

		public String getCcn_id() {
			return this.ccn_id;
		}

		public void setCcn_id(String ccn_id) {
			this.ccn_id = ccn_id;
		}

		public String getCcn_region_id() {
			return this.ccn_region_id;
		}

		public void setCcn_region_id(String ccn_region_id) {
			this.ccn_region_id = ccn_region_id;
		}

		public Long getBandwidth() {
			return this.bandwidth;
		}

		public void setBandwidth(Long bandwidth) {
			this.bandwidth = bandwidth;
		}

		public String getImproved_period() {
			return this.improved_period;
		}

		public void setImproved_period(String improved_period) {
			this.improved_period = improved_period;
		}
	}

	@Override
	public DescribeClusterNodePoolDetailResponse getInstance(UnmarshallerContext context) {
		return	DescribeClusterNodePoolDetailResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
