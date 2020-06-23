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

import com.aliyuncs.AcsResponse;
import com.aliyuncs.cs.transform.v20151215.DescribeClusterAddonUpgradeStatusResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeClusterAddonUpgradeStatusResponse extends AcsResponse {

	private String template;

	private Boolean can_upgrade;

	private Addon_info addon_info;

	public String getTemplate() {
		return this.template;
	}

	public void setTemplate(String template) {
		this.template = template;
	}

	public Boolean getCan_upgrade() {
		return this.can_upgrade;
	}

	public void setCan_upgrade(Boolean can_upgrade) {
		this.can_upgrade = can_upgrade;
	}

	public Addon_info getAddon_info() {
		return this.addon_info;
	}

	public void setAddon_info(Addon_info addon_info) {
		this.addon_info = addon_info;
	}

	public static class Addon_info {

		private String message;

		private String category;

		private String yaml;

		private String component_name;

		private String version;

		public String getMessage() {
			return this.message;
		}

		public void setMessage(String message) {
			this.message = message;
		}

		public String getCategory() {
			return this.category;
		}

		public void setCategory(String category) {
			this.category = category;
		}

		public String getYaml() {
			return this.yaml;
		}

		public void setYaml(String yaml) {
			this.yaml = yaml;
		}

		public String getComponent_name() {
			return this.component_name;
		}

		public void setComponent_name(String component_name) {
			this.component_name = component_name;
		}

		public String getVersion() {
			return this.version;
		}

		public void setVersion(String version) {
			this.version = version;
		}
	}

	@Override
	public DescribeClusterAddonUpgradeStatusResponse getInstance(UnmarshallerContext context) {
		return	DescribeClusterAddonUpgradeStatusResponseUnmarshaller.unmarshall(this, context);
	}
}
