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
import com.aliyuncs.cs.transform.v20151215.DescribeClusterVulsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeClusterVulsResponse extends AcsResponse {

	private List<Vul_record> vul_records;

	public List<Vul_record> getVul_records() {
		return this.vul_records;
	}

	public void setVul_records(List<Vul_record> vul_records) {
		this.vul_records = vul_records;
	}

	public static class Vul_record {

		private String nodepool_name;

		private String nodepool_id;

		private Integer node_count;

		private String vul_name;

		private String vul_alias_name;

		private String vul_type;

		private String necessity;

		private List<String> cve_list;

		public String getNodepool_name() {
			return this.nodepool_name;
		}

		public void setNodepool_name(String nodepool_name) {
			this.nodepool_name = nodepool_name;
		}

		public String getNodepool_id() {
			return this.nodepool_id;
		}

		public void setNodepool_id(String nodepool_id) {
			this.nodepool_id = nodepool_id;
		}

		public Integer getNode_count() {
			return this.node_count;
		}

		public void setNode_count(Integer node_count) {
			this.node_count = node_count;
		}

		public String getVul_name() {
			return this.vul_name;
		}

		public void setVul_name(String vul_name) {
			this.vul_name = vul_name;
		}

		public String getVul_alias_name() {
			return this.vul_alias_name;
		}

		public void setVul_alias_name(String vul_alias_name) {
			this.vul_alias_name = vul_alias_name;
		}

		public String getVul_type() {
			return this.vul_type;
		}

		public void setVul_type(String vul_type) {
			this.vul_type = vul_type;
		}

		public String getNecessity() {
			return this.necessity;
		}

		public void setNecessity(String necessity) {
			this.necessity = necessity;
		}

		public List<String> getCve_list() {
			return this.cve_list;
		}

		public void setCve_list(List<String> cve_list) {
			this.cve_list = cve_list;
		}
	}

	@Override
	public DescribeClusterVulsResponse getInstance(UnmarshallerContext context) {
		return	DescribeClusterVulsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
