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
import com.aliyuncs.cs.transform.v20151215.DescribeNodePoolVulsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeNodePoolVulsResponse extends AcsResponse {

	private Boolean vuls_fix_service_purchased;

	private List<Vul_recordsItem> vul_records;

	public Boolean getVuls_fix_service_purchased() {
		return this.vuls_fix_service_purchased;
	}

	public void setVuls_fix_service_purchased(Boolean vuls_fix_service_purchased) {
		this.vuls_fix_service_purchased = vuls_fix_service_purchased;
	}

	public List<Vul_recordsItem> getVul_records() {
		return this.vul_records;
	}

	public void setVul_records(List<Vul_recordsItem> vul_records) {
		this.vul_records = vul_records;
	}

	public static class Vul_recordsItem {

		private String instance_id;

		private List<Vul_listItem> vul_list;

		public String getInstance_id() {
			return this.instance_id;
		}

		public void setInstance_id(String instance_id) {
			this.instance_id = instance_id;
		}

		public List<Vul_listItem> getVul_list() {
			return this.vul_list;
		}

		public void setVul_list(List<Vul_listItem> vul_list) {
			this.vul_list = vul_list;
		}

		public static class Vul_listItem {

			private String name;

			private String alias_name;

			private String necessity;

			private List<String> cve_list;

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getAlias_name() {
				return this.alias_name;
			}

			public void setAlias_name(String alias_name) {
				this.alias_name = alias_name;
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
	}

	@Override
	public DescribeNodePoolVulsResponse getInstance(UnmarshallerContext context) {
		return	DescribeNodePoolVulsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
