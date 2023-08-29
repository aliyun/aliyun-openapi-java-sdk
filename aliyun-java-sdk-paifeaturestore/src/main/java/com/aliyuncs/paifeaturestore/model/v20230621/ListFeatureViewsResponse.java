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

package com.aliyuncs.paifeaturestore.model.v20230621;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.paifeaturestore.transform.v20230621.ListFeatureViewsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListFeatureViewsResponse extends AcsResponse {

	private String requestId;

	private Long totalCount;

	private List<FeatureViewsItem> featureViews;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Long getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}

	public List<FeatureViewsItem> getFeatureViews() {
		return this.featureViews;
	}

	public void setFeatureViews(List<FeatureViewsItem> featureViews) {
		this.featureViews = featureViews;
	}

	public static class FeatureViewsItem {

		private String featureViewId;

		private String projectId;

		private String projectName;

		private String featureEntityName;

		private String name;

		private String owner;

		private String type;

		private String gmtCreateTime;

		private String gmtModifiedTime;

		private String registerTable;

		private String registerDatasourceName;

		private Integer tTL;

		private String registerDatasourceId;

		public String getFeatureViewId() {
			return this.featureViewId;
		}

		public void setFeatureViewId(String featureViewId) {
			this.featureViewId = featureViewId;
		}

		public String getProjectId() {
			return this.projectId;
		}

		public void setProjectId(String projectId) {
			this.projectId = projectId;
		}

		public String getProjectName() {
			return this.projectName;
		}

		public void setProjectName(String projectName) {
			this.projectName = projectName;
		}

		public String getFeatureEntityName() {
			return this.featureEntityName;
		}

		public void setFeatureEntityName(String featureEntityName) {
			this.featureEntityName = featureEntityName;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getOwner() {
			return this.owner;
		}

		public void setOwner(String owner) {
			this.owner = owner;
		}

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public String getGmtCreateTime() {
			return this.gmtCreateTime;
		}

		public void setGmtCreateTime(String gmtCreateTime) {
			this.gmtCreateTime = gmtCreateTime;
		}

		public String getGmtModifiedTime() {
			return this.gmtModifiedTime;
		}

		public void setGmtModifiedTime(String gmtModifiedTime) {
			this.gmtModifiedTime = gmtModifiedTime;
		}

		public String getRegisterTable() {
			return this.registerTable;
		}

		public void setRegisterTable(String registerTable) {
			this.registerTable = registerTable;
		}

		public String getRegisterDatasourceName() {
			return this.registerDatasourceName;
		}

		public void setRegisterDatasourceName(String registerDatasourceName) {
			this.registerDatasourceName = registerDatasourceName;
		}

		public Integer getTTL() {
			return this.tTL;
		}

		public void setTTL(Integer tTL) {
			this.tTL = tTL;
		}

		public String getRegisterDatasourceId() {
			return this.registerDatasourceId;
		}

		public void setRegisterDatasourceId(String registerDatasourceId) {
			this.registerDatasourceId = registerDatasourceId;
		}
	}

	@Override
	public ListFeatureViewsResponse getInstance(UnmarshallerContext context) {
		return	ListFeatureViewsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
