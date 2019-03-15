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

package com.aliyuncs.emr.model.v20160408;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.emr.transform.v20160408.MetastoreListDataResourcesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class MetastoreListDataResourcesResponse extends AcsResponse {

	private String requestId;

	private List<DataResourceInfo> dataResources;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<DataResourceInfo> getDataResources() {
		return this.dataResources;
	}

	public void setDataResources(List<DataResourceInfo> dataResources) {
		this.dataResources = dataResources;
	}

	public static class DataResourceInfo {

		private String id;

		private String regionId;

		private String name;

		private String metaType;

		private Long clusterId;

		private String accessType;

		private Boolean _default;

		private String description;

		public String getId() {
			return this.id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getBizRegionId() {
			return this.regionId;
		}

		public void setBizRegionId(String regionId) {
			this.regionId = regionId;
		}

		/**
		 * @deprecated use getBizRegionId instead of this.
		 */
		@Deprecated
		public String getRegionId() {
			return this.regionId;
		}

		/**
		 * @deprecated use setBizRegionId instead of this.
		 */
		@Deprecated
		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getMetaType() {
			return this.metaType;
		}

		public void setMetaType(String metaType) {
			this.metaType = metaType;
		}

		public Long getClusterId() {
			return this.clusterId;
		}

		public void setClusterId(Long clusterId) {
			this.clusterId = clusterId;
		}

		public String getAccessType() {
			return this.accessType;
		}

		public void setAccessType(String accessType) {
			this.accessType = accessType;
		}

		public Boolean get_Default() {
			return this._default;
		}

		public void set_Default(Boolean _default) {
			this._default = _default;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}
	}

	@Override
	public MetastoreListDataResourcesResponse getInstance(UnmarshallerContext context) {
		return	MetastoreListDataResourcesResponseUnmarshaller.unmarshall(this, context);
	}
}
