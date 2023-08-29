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
import com.aliyuncs.paifeaturestore.transform.v20230621.ListFeatureEntitiesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListFeatureEntitiesResponse extends AcsResponse {

	private String requestId;

	private Integer totalCount;

	private List<FeatureEntitiesItem> featureEntities;

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

	public List<FeatureEntitiesItem> getFeatureEntities() {
		return this.featureEntities;
	}

	public void setFeatureEntities(List<FeatureEntitiesItem> featureEntities) {
		this.featureEntities = featureEntities;
	}

	public static class FeatureEntitiesItem {

		private String featureEntityId;

		private String gmtCreateTime;

		private String joinId;

		private String name;

		private String owner;

		private String projectId;

		private String projectName;

		public String getFeatureEntityId() {
			return this.featureEntityId;
		}

		public void setFeatureEntityId(String featureEntityId) {
			this.featureEntityId = featureEntityId;
		}

		public String getGmtCreateTime() {
			return this.gmtCreateTime;
		}

		public void setGmtCreateTime(String gmtCreateTime) {
			this.gmtCreateTime = gmtCreateTime;
		}

		public String getJoinId() {
			return this.joinId;
		}

		public void setJoinId(String joinId) {
			this.joinId = joinId;
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
	}

	@Override
	public ListFeatureEntitiesResponse getInstance(UnmarshallerContext context) {
		return	ListFeatureEntitiesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
