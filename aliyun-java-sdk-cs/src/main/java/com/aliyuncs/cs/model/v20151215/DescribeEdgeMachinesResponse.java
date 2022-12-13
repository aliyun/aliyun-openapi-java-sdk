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
import com.aliyuncs.cs.transform.v20151215.DescribeEdgeMachinesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeEdgeMachinesResponse extends AcsResponse {

	private List<Edge_machinesItem> edge_machines;

	private Page_info page_info;

	public List<Edge_machinesItem> getEdge_machines() {
		return this.edge_machines;
	}

	public void setEdge_machines(List<Edge_machinesItem> edge_machines) {
		this.edge_machines = edge_machines;
	}

	public Page_info getPage_info() {
		return this.page_info;
	}

	public void setPage_info(Page_info page_info) {
		this.page_info = page_info;
	}

	public static class Edge_machinesItem {

		private String edge_machine_id;

		private String created;

		private String updated;

		private String name;

		private String hostname;

		private String sn;

		private String model;

		private String life_state;

		private String online_state;

		private String active_time;

		public String getEdge_machine_id() {
			return this.edge_machine_id;
		}

		public void setEdge_machine_id(String edge_machine_id) {
			this.edge_machine_id = edge_machine_id;
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

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getHostname() {
			return this.hostname;
		}

		public void setHostname(String hostname) {
			this.hostname = hostname;
		}

		public String getSn() {
			return this.sn;
		}

		public void setSn(String sn) {
			this.sn = sn;
		}

		public String getModel() {
			return this.model;
		}

		public void setModel(String model) {
			this.model = model;
		}

		public String getLife_state() {
			return this.life_state;
		}

		public void setLife_state(String life_state) {
			this.life_state = life_state;
		}

		public String getOnline_state() {
			return this.online_state;
		}

		public void setOnline_state(String online_state) {
			this.online_state = online_state;
		}

		public String getActive_time() {
			return this.active_time;
		}

		public void setActive_time(String active_time) {
			this.active_time = active_time;
		}
	}

	public static class Page_info {

		private Integer page_number;

		private Integer page_size;

		private Integer total_count;

		public Integer getPage_number() {
			return this.page_number;
		}

		public void setPage_number(Integer page_number) {
			this.page_number = page_number;
		}

		public Integer getPage_size() {
			return this.page_size;
		}

		public void setPage_size(Integer page_size) {
			this.page_size = page_size;
		}

		public Integer getTotal_count() {
			return this.total_count;
		}

		public void setTotal_count(Integer total_count) {
			this.total_count = total_count;
		}
	}

	@Override
	public DescribeEdgeMachinesResponse getInstance(UnmarshallerContext context) {
		return	DescribeEdgeMachinesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
