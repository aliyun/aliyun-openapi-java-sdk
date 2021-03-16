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

package com.aliyuncs.ecsops.model.v20160401;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecsops.transform.v20160401.OpsDescribeDiagnosticPluginResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class OpsDescribeDiagnosticPluginResponse extends AcsResponse {

	private String requestId;

	private Integer totalCount;

	private Integer pageNumber;

	private Integer pageSize;

	private List<Plugin> plugins;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public List<Plugin> getPlugins() {
		return this.plugins;
	}

	public void setPlugins(List<Plugin> plugins) {
		this.plugins = plugins;
	}

	public static class Plugin {

		private Long id;

		private String pluginCode;

		private String description;

		private String version;

		private String status;

		private String owner;

		private String gmtCreate;

		private String gmtModified;

		private List<PluginItem> pluginItems;

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getPluginCode() {
			return this.pluginCode;
		}

		public void setPluginCode(String pluginCode) {
			this.pluginCode = pluginCode;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getVersion() {
			return this.version;
		}

		public void setVersion(String version) {
			this.version = version;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getOwner() {
			return this.owner;
		}

		public void setOwner(String owner) {
			this.owner = owner;
		}

		public String getGmtCreate() {
			return this.gmtCreate;
		}

		public void setGmtCreate(String gmtCreate) {
			this.gmtCreate = gmtCreate;
		}

		public String getGmtModified() {
			return this.gmtModified;
		}

		public void setGmtModified(String gmtModified) {
			this.gmtModified = gmtModified;
		}

		public List<PluginItem> getPluginItems() {
			return this.pluginItems;
		}

		public void setPluginItems(List<PluginItem> pluginItems) {
			this.pluginItems = pluginItems;
		}

		public static class PluginItem {

			private Long pluginId;

			private String itemCode;

			private String itemCategory;

			private Integer weight;

			private String status;

			private String creator;

			private String gmtCreate;

			private String gmtModified;

			public Long getPluginId() {
				return this.pluginId;
			}

			public void setPluginId(Long pluginId) {
				this.pluginId = pluginId;
			}

			public String getItemCode() {
				return this.itemCode;
			}

			public void setItemCode(String itemCode) {
				this.itemCode = itemCode;
			}

			public String getItemCategory() {
				return this.itemCategory;
			}

			public void setItemCategory(String itemCategory) {
				this.itemCategory = itemCategory;
			}

			public Integer getWeight() {
				return this.weight;
			}

			public void setWeight(Integer weight) {
				this.weight = weight;
			}

			public String getStatus() {
				return this.status;
			}

			public void setStatus(String status) {
				this.status = status;
			}

			public String getCreator() {
				return this.creator;
			}

			public void setCreator(String creator) {
				this.creator = creator;
			}

			public String getGmtCreate() {
				return this.gmtCreate;
			}

			public void setGmtCreate(String gmtCreate) {
				this.gmtCreate = gmtCreate;
			}

			public String getGmtModified() {
				return this.gmtModified;
			}

			public void setGmtModified(String gmtModified) {
				this.gmtModified = gmtModified;
			}
		}
	}

	@Override
	public OpsDescribeDiagnosticPluginResponse getInstance(UnmarshallerContext context) {
		return	OpsDescribeDiagnosticPluginResponseUnmarshaller.unmarshall(this, context);
	}
}
