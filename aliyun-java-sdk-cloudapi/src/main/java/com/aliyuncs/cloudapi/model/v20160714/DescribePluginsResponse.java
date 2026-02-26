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

package com.aliyuncs.cloudapi.model.v20160714;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.cloudapi.transform.v20160714.DescribePluginsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribePluginsResponse extends AcsResponse {

	private Integer pageNumber;

	private String requestId;

	private Integer pageSize;

	private Integer totalCount;

	private List<PluginAttribute> plugins;

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public List<PluginAttribute> getPlugins() {
		return this.plugins;
	}

	public void setPlugins(List<PluginAttribute> plugins) {
		this.plugins = plugins;
	}

	public static class PluginAttribute {

		private String pluginId;

		private String modifiedTime;

		private String pluginData;

		private String description;

		private String pluginName;

		private String createdTime;

		private String pluginType;

		private String regionId;

		private List<TagInfo> tags;

		public String getPluginId() {
			return this.pluginId;
		}

		public void setPluginId(String pluginId) {
			this.pluginId = pluginId;
		}

		public String getModifiedTime() {
			return this.modifiedTime;
		}

		public void setModifiedTime(String modifiedTime) {
			this.modifiedTime = modifiedTime;
		}

		public String getPluginData() {
			return this.pluginData;
		}

		public void setPluginData(String pluginData) {
			this.pluginData = pluginData;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getPluginName() {
			return this.pluginName;
		}

		public void setPluginName(String pluginName) {
			this.pluginName = pluginName;
		}

		public String getCreatedTime() {
			return this.createdTime;
		}

		public void setCreatedTime(String createdTime) {
			this.createdTime = createdTime;
		}

		public String getPluginType() {
			return this.pluginType;
		}

		public void setPluginType(String pluginType) {
			this.pluginType = pluginType;
		}

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public List<TagInfo> getTags() {
			return this.tags;
		}

		public void setTags(List<TagInfo> tags) {
			this.tags = tags;
		}

		public static class TagInfo {

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
	public DescribePluginsResponse getInstance(UnmarshallerContext context) {
		return	DescribePluginsResponseUnmarshaller.unmarshall(this, context);
	}
}
