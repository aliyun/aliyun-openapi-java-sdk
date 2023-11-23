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
import com.aliyuncs.paifeaturestore.transform.v20230621.GetLabelTableResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetLabelTableResponse extends AcsResponse {

	private String requestId;

	private String projectId;

	private String projectName;

	private String datasourceId;

	private String name;

	private String datasourceName;

	private String owner;

	private String gmtCreateTime;

	private String gmtModifiedTime;

	private List<Field> fields;

	private List<String> relatedModelFeatures;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
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

	public String getDatasourceId() {
		return this.datasourceId;
	}

	public void setDatasourceId(String datasourceId) {
		this.datasourceId = datasourceId;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDatasourceName() {
		return this.datasourceName;
	}

	public void setDatasourceName(String datasourceName) {
		this.datasourceName = datasourceName;
	}

	public String getOwner() {
		return this.owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
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

	public List<Field> getFields() {
		return this.fields;
	}

	public void setFields(List<Field> fields) {
		this.fields = fields;
	}

	public List<String> getRelatedModelFeatures() {
		return this.relatedModelFeatures;
	}

	public void setRelatedModelFeatures(List<String> relatedModelFeatures) {
		this.relatedModelFeatures = relatedModelFeatures;
	}

	public static class Field {

		private String name;

		private String type;

		private List<String> attributes;

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public List<String> getAttributes() {
			return this.attributes;
		}

		public void setAttributes(List<String> attributes) {
			this.attributes = attributes;
		}
	}

	@Override
	public GetLabelTableResponse getInstance(UnmarshallerContext context) {
		return	GetLabelTableResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
