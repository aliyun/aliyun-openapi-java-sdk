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

package com.aliyuncs.quickbi_public.model.v20200807;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.quickbi_public.transform.v20200807.QueryWorksBloodRelationshipResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryWorksBloodRelationshipResponse extends AcsResponse {

	private Boolean success;

	private String requestId;

	private List<Item> result;

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<Item> getResult() {
		return this.result;
	}

	public void setResult(List<Item> result) {
		this.result = result;
	}

	public static class Item {

		private String componentId;

		private String componentName;

		private Integer componentType;

		private String componentTypeName;

		private String datasetId;

		private List<QueryParam> queryParams;

		public String getComponentId() {
			return this.componentId;
		}

		public void setComponentId(String componentId) {
			this.componentId = componentId;
		}

		public String getComponentName() {
			return this.componentName;
		}

		public void setComponentName(String componentName) {
			this.componentName = componentName;
		}

		public Integer getComponentType() {
			return this.componentType;
		}

		public void setComponentType(Integer componentType) {
			this.componentType = componentType;
		}

		public String getComponentTypeName() {
			return this.componentTypeName;
		}

		public void setComponentTypeName(String componentTypeName) {
			this.componentTypeName = componentTypeName;
		}

		public String getDatasetId() {
			return this.datasetId;
		}

		public void setDatasetId(String datasetId) {
			this.datasetId = datasetId;
		}

		public List<QueryParam> getQueryParams() {
			return this.queryParams;
		}

		public void setQueryParams(List<QueryParam> queryParams) {
			this.queryParams = queryParams;
		}

		public static class QueryParam {

			private String uid;

			private String pathId;

			private String caption;

			private String dataType;

			private Boolean isMeasure;

			private String areaId;

			private String areaName;

			public String getUid() {
				return this.uid;
			}

			public void setUid(String uid) {
				this.uid = uid;
			}

			public String getPathId() {
				return this.pathId;
			}

			public void setPathId(String pathId) {
				this.pathId = pathId;
			}

			public String getCaption() {
				return this.caption;
			}

			public void setCaption(String caption) {
				this.caption = caption;
			}

			public String getDataType() {
				return this.dataType;
			}

			public void setDataType(String dataType) {
				this.dataType = dataType;
			}

			public Boolean getIsMeasure() {
				return this.isMeasure;
			}

			public void setIsMeasure(Boolean isMeasure) {
				this.isMeasure = isMeasure;
			}

			public String getAreaId() {
				return this.areaId;
			}

			public void setAreaId(String areaId) {
				this.areaId = areaId;
			}

			public String getAreaName() {
				return this.areaName;
			}

			public void setAreaName(String areaName) {
				this.areaName = areaName;
			}
		}
	}

	@Override
	public QueryWorksBloodRelationshipResponse getInstance(UnmarshallerContext context) {
		return	QueryWorksBloodRelationshipResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
