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
import com.aliyuncs.cs.transform.v20151215.DescribeClustersResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeClustersResponse extends AcsResponse {

	private List<ClusterDetail> clusters;

	public List<ClusterDetail> getClusters() {
		return this.clusters;
	}

	public void setClusters(List<ClusterDetail> clusters) {
		this.clusters = clusters;
	}

	public static class ClusterDetail {

		private String name;

		private String cluster_id;

		private String region_id;

		private String state;

		private String cluster_type;

		private String current_version;

		private String meta_data;

		private String resource_group_id;

		private String vpc_id;

		private String vswitch_id;

		private String vswitch_cidr;

		private Integer data_disk_size;

		private String data_disk_category;

		private String security_group_id;

		private String zone_id;

		private String network_mode;

		private String master_url;

		private String docker_version;

		private Boolean deletion_protection;

		private String external_loadbalancer_id;

		private String created;

		private String updated;

		private String size;

		private List<TagsItem> tags;

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getCluster_id() {
			return this.cluster_id;
		}

		public void setCluster_id(String cluster_id) {
			this.cluster_id = cluster_id;
		}

		public String getRegion_id() {
			return this.region_id;
		}

		public void setRegion_id(String region_id) {
			this.region_id = region_id;
		}

		public String getState() {
			return this.state;
		}

		public void setState(String state) {
			this.state = state;
		}

		public String getCluster_type() {
			return this.cluster_type;
		}

		public void setCluster_type(String cluster_type) {
			this.cluster_type = cluster_type;
		}

		public String getCurrent_version() {
			return this.current_version;
		}

		public void setCurrent_version(String current_version) {
			this.current_version = current_version;
		}

		public String getMeta_data() {
			return this.meta_data;
		}

		public void setMeta_data(String meta_data) {
			this.meta_data = meta_data;
		}

		public String getResource_group_id() {
			return this.resource_group_id;
		}

		public void setResource_group_id(String resource_group_id) {
			this.resource_group_id = resource_group_id;
		}

		public String getVpc_id() {
			return this.vpc_id;
		}

		public void setVpc_id(String vpc_id) {
			this.vpc_id = vpc_id;
		}

		public String getVswitch_id() {
			return this.vswitch_id;
		}

		public void setVswitch_id(String vswitch_id) {
			this.vswitch_id = vswitch_id;
		}

		public String getVswitch_cidr() {
			return this.vswitch_cidr;
		}

		public void setVswitch_cidr(String vswitch_cidr) {
			this.vswitch_cidr = vswitch_cidr;
		}

		public Integer getData_disk_size() {
			return this.data_disk_size;
		}

		public void setData_disk_size(Integer data_disk_size) {
			this.data_disk_size = data_disk_size;
		}

		public String getData_disk_category() {
			return this.data_disk_category;
		}

		public void setData_disk_category(String data_disk_category) {
			this.data_disk_category = data_disk_category;
		}

		public String getSecurity_group_id() {
			return this.security_group_id;
		}

		public void setSecurity_group_id(String security_group_id) {
			this.security_group_id = security_group_id;
		}

		public String getZone_id() {
			return this.zone_id;
		}

		public void setZone_id(String zone_id) {
			this.zone_id = zone_id;
		}

		public String getNetwork_mode() {
			return this.network_mode;
		}

		public void setNetwork_mode(String network_mode) {
			this.network_mode = network_mode;
		}

		public String getMaster_url() {
			return this.master_url;
		}

		public void setMaster_url(String master_url) {
			this.master_url = master_url;
		}

		public String getDocker_version() {
			return this.docker_version;
		}

		public void setDocker_version(String docker_version) {
			this.docker_version = docker_version;
		}

		public Boolean getDeletion_protection() {
			return this.deletion_protection;
		}

		public void setDeletion_protection(Boolean deletion_protection) {
			this.deletion_protection = deletion_protection;
		}

		public String getExternal_loadbalancer_id() {
			return this.external_loadbalancer_id;
		}

		public void setExternal_loadbalancer_id(String external_loadbalancer_id) {
			this.external_loadbalancer_id = external_loadbalancer_id;
		}

		public String getCreated() {
			return this.created;
		}

		public void setCreated(String created) {
			this.created = created;
		}

		public String getUpdated() {
			return this.updated;
		}

		public void setUpdated(String updated) {
			this.updated = updated;
		}

		public String getSize() {
			return this.size;
		}

		public void setSize(String size) {
			this.size = size;
		}

		public List<TagsItem> getTags() {
			return this.tags;
		}

		public void setTags(List<TagsItem> tags) {
			this.tags = tags;
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

	@Override
	public DescribeClustersResponse getInstance(UnmarshallerContext context) {
		return	DescribeClustersResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
