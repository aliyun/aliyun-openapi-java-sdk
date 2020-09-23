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
import com.aliyuncs.cs.transform.v20151215.DescribeClusterNodesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeClusterNodesResponse extends AcsResponse {

	private List<Node> nodes;

	private Page page;

	public List<Node> getNodes() {
		return this.nodes;
	}

	public void setNodes(List<Node> nodes) {
		this.nodes = nodes;
	}

	public Page getPage() {
		return this.page;
	}

	public void setPage(Page page) {
		this.page = page;
	}

	public static class Node {

		private String error_message;

		private String creation_time;

		private String node_status;

		private String instance_name;

		private Boolean is_aliyun_node;

		private String node_name;

		private String expired_time;

		private String source;

		private String instance_type_family;

		private String instance_id;

		private String instance_charge_type;

		private String instance_role;

		private String state;

		private String instance_status;

		private String image_id;

		private String nodepool_id;

		private String instance_type;

		private String host_name;

		private List<String> ip_address;

		public String getError_message() {
			return this.error_message;
		}

		public void setError_message(String error_message) {
			this.error_message = error_message;
		}

		public String getCreation_time() {
			return this.creation_time;
		}

		public void setCreation_time(String creation_time) {
			this.creation_time = creation_time;
		}

		public String getNode_status() {
			return this.node_status;
		}

		public void setNode_status(String node_status) {
			this.node_status = node_status;
		}

		public String getInstance_name() {
			return this.instance_name;
		}

		public void setInstance_name(String instance_name) {
			this.instance_name = instance_name;
		}

		public Boolean getIs_aliyun_node() {
			return this.is_aliyun_node;
		}

		public void setIs_aliyun_node(Boolean is_aliyun_node) {
			this.is_aliyun_node = is_aliyun_node;
		}

		public String getNode_name() {
			return this.node_name;
		}

		public void setNode_name(String node_name) {
			this.node_name = node_name;
		}

		public String getExpired_time() {
			return this.expired_time;
		}

		public void setExpired_time(String expired_time) {
			this.expired_time = expired_time;
		}

		public String getSource() {
			return this.source;
		}

		public void setSource(String source) {
			this.source = source;
		}

		public String getInstance_type_family() {
			return this.instance_type_family;
		}

		public void setInstance_type_family(String instance_type_family) {
			this.instance_type_family = instance_type_family;
		}

		public String getInstance_id() {
			return this.instance_id;
		}

		public void setInstance_id(String instance_id) {
			this.instance_id = instance_id;
		}

		public String getInstance_charge_type() {
			return this.instance_charge_type;
		}

		public void setInstance_charge_type(String instance_charge_type) {
			this.instance_charge_type = instance_charge_type;
		}

		public String getInstance_role() {
			return this.instance_role;
		}

		public void setInstance_role(String instance_role) {
			this.instance_role = instance_role;
		}

		public String getState() {
			return this.state;
		}

		public void setState(String state) {
			this.state = state;
		}

		public String getInstance_status() {
			return this.instance_status;
		}

		public void setInstance_status(String instance_status) {
			this.instance_status = instance_status;
		}

		public String getImage_id() {
			return this.image_id;
		}

		public void setImage_id(String image_id) {
			this.image_id = image_id;
		}

		public String getNodepool_id() {
			return this.nodepool_id;
		}

		public void setNodepool_id(String nodepool_id) {
			this.nodepool_id = nodepool_id;
		}

		public String getInstance_type() {
			return this.instance_type;
		}

		public void setInstance_type(String instance_type) {
			this.instance_type = instance_type;
		}

		public String getHost_name() {
			return this.host_name;
		}

		public void setHost_name(String host_name) {
			this.host_name = host_name;
		}

		public List<String> getIp_address() {
			return this.ip_address;
		}

		public void setIp_address(List<String> ip_address) {
			this.ip_address = ip_address;
		}
	}

	public static class Page {

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
	public DescribeClusterNodesResponse getInstance(UnmarshallerContext context) {
		return	DescribeClusterNodesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
