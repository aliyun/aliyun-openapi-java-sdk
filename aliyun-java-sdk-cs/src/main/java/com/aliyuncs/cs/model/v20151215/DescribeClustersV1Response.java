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
import com.aliyuncs.cs.transform.v20151215.DescribeClustersV1ResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeClustersV1Response extends AcsResponse {

	private List<ClustersItem> clusters;

	private Page_info page_info;

	public List<ClustersItem> getClusters() {
		return this.clusters;
	}

	public void setClusters(List<ClustersItem> clusters) {
		this.clusters = clusters;
	}

	public Page_info getPage_info() {
		return this.page_info;
	}

	public void setPage_info(Page_info page_info) {
		this.page_info = page_info;
	}

	public static class ClustersItem {

		private String resource_group_id;

		private Boolean private_zone;

		private String vpc_id;

		private String network_mode;

		private String security_group_id;

		private String cluster_type;

		private String docker_version;

		private String data_disk_category;

		private String zone_id;

		private String cluster_id;

		private String external_loadbalancer_id;

		private String vswitch_id;

		private String meta_data;

		private String state;

		private String init_version;

		private String node_status;

		private Boolean deletion_protection;

		private String created;

		private String subnet_cidr;

		private String profile;

		private String region_id;

		private String master_url;

		private String current_version;

		private String vswitch_cidr;

		private String cluster_healthy;

		private Long size;

		private Long data_disk_size;

		private String name;

		private String worker_ram_role_name;

		private String updated;

		private List<TagsItem> tags;

		public String getResource_group_id() {
			return this.resource_group_id;
		}

		public void setResource_group_id(String resource_group_id) {
			this.resource_group_id = resource_group_id;
		}

		public Boolean getPrivate_zone() {
			return this.private_zone;
		}

		public void setPrivate_zone(Boolean private_zone) {
			this.private_zone = private_zone;
		}

		public String getVpc_id() {
			return this.vpc_id;
		}

		public void setVpc_id(String vpc_id) {
			this.vpc_id = vpc_id;
		}

		public String getNetwork_mode() {
			return this.network_mode;
		}

		public void setNetwork_mode(String network_mode) {
			this.network_mode = network_mode;
		}

		public String getSecurity_group_id() {
			return this.security_group_id;
		}

		public void setSecurity_group_id(String security_group_id) {
			this.security_group_id = security_group_id;
		}

		public String getCluster_type() {
			return this.cluster_type;
		}

		public void setCluster_type(String cluster_type) {
			this.cluster_type = cluster_type;
		}

		public String getDocker_version() {
			return this.docker_version;
		}

		public void setDocker_version(String docker_version) {
			this.docker_version = docker_version;
		}

		public String getData_disk_category() {
			return this.data_disk_category;
		}

		public void setData_disk_category(String data_disk_category) {
			this.data_disk_category = data_disk_category;
		}

		public String getZone_id() {
			return this.zone_id;
		}

		public void setZone_id(String zone_id) {
			this.zone_id = zone_id;
		}

		public String getCluster_id() {
			return this.cluster_id;
		}

		public void setCluster_id(String cluster_id) {
			this.cluster_id = cluster_id;
		}

		public String getExternal_loadbalancer_id() {
			return this.external_loadbalancer_id;
		}

		public void setExternal_loadbalancer_id(String external_loadbalancer_id) {
			this.external_loadbalancer_id = external_loadbalancer_id;
		}

		public String getVswitch_id() {
			return this.vswitch_id;
		}

		public void setVswitch_id(String vswitch_id) {
			this.vswitch_id = vswitch_id;
		}

		public String getMeta_data() {
			return this.meta_data;
		}

		public void setMeta_data(String meta_data) {
			this.meta_data = meta_data;
		}

		public String getState() {
			return this.state;
		}

		public void setState(String state) {
			this.state = state;
		}

		public String getInit_version() {
			return this.init_version;
		}

		public void setInit_version(String init_version) {
			this.init_version = init_version;
		}

		public String getNode_status() {
			return this.node_status;
		}

		public void setNode_status(String node_status) {
			this.node_status = node_status;
		}

		public Boolean getDeletion_protection() {
			return this.deletion_protection;
		}

		public void setDeletion_protection(Boolean deletion_protection) {
			this.deletion_protection = deletion_protection;
		}

		public String getCreated() {
			return this.created;
		}

		public void setCreated(String created) {
			this.created = created;
		}

		public String getSubnet_cidr() {
			return this.subnet_cidr;
		}

		public void setSubnet_cidr(String subnet_cidr) {
			this.subnet_cidr = subnet_cidr;
		}

		public String getProfile() {
			return this.profile;
		}

		public void setProfile(String profile) {
			this.profile = profile;
		}

		public String getRegion_id() {
			return this.region_id;
		}

		public void setRegion_id(String region_id) {
			this.region_id = region_id;
		}

		public String getMaster_url() {
			return this.master_url;
		}

		public void setMaster_url(String master_url) {
			this.master_url = master_url;
		}

		public String getCurrent_version() {
			return this.current_version;
		}

		public void setCurrent_version(String current_version) {
			this.current_version = current_version;
		}

		public String getVswitch_cidr() {
			return this.vswitch_cidr;
		}

		public void setVswitch_cidr(String vswitch_cidr) {
			this.vswitch_cidr = vswitch_cidr;
		}

		public String getCluster_healthy() {
			return this.cluster_healthy;
		}

		public void setCluster_healthy(String cluster_healthy) {
			this.cluster_healthy = cluster_healthy;
		}

		public Long getSize() {
			return this.size;
		}

		public void setSize(Long size) {
			this.size = size;
		}

		public Long getData_disk_size() {
			return this.data_disk_size;
		}

		public void setData_disk_size(Long data_disk_size) {
			this.data_disk_size = data_disk_size;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getWorker_ram_role_name() {
			return this.worker_ram_role_name;
		}

		public void setWorker_ram_role_name(String worker_ram_role_name) {
			this.worker_ram_role_name = worker_ram_role_name;
		}

		public String getUpdated() {
			return this.updated;
		}

		public void setUpdated(String updated) {
			this.updated = updated;
		}

		public List<TagsItem> getTags() {
			return this.tags;
		}

		public void setTags(List<TagsItem> tags) {
			this.tags = tags;
		}

		public static class TagsItem {

			private String value;

			private String key;

			public String getValue() {
				return this.value;
			}

			public void setValue(String value) {
				this.value = value;
			}

			public String getKey() {
				return this.key;
			}

			public void setKey(String key) {
				this.key = key;
			}
		}
	}

	public static class Page_info {

		private Integer page_number;

		private Integer total_count;

		private Integer page_size;

		public Integer getPage_number() {
			return this.page_number;
		}

		public void setPage_number(Integer page_number) {
			this.page_number = page_number;
		}

		public Integer getTotal_count() {
			return this.total_count;
		}

		public void setTotal_count(Integer total_count) {
			this.total_count = total_count;
		}

		public Integer getPage_size() {
			return this.page_size;
		}

		public void setPage_size(Integer page_size) {
			this.page_size = page_size;
		}
	}

	@Override
	public DescribeClustersV1Response getInstance(UnmarshallerContext context) {
		return	DescribeClustersV1ResponseUnmarshaller.unmarshall(this, context);
	}
}
