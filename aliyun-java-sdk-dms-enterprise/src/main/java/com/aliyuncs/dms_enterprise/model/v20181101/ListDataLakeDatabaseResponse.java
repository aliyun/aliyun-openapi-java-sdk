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

package com.aliyuncs.dms_enterprise.model.v20181101;

import java.util.List;
import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.dms_enterprise.transform.v20181101.ListDataLakeDatabaseResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListDataLakeDatabaseResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String errorCode;

	private String errorMessage;

	private String nextToken;

	private Integer maxResults;

	private List<Database> databaseList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorMessage() {
		return this.errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public String getNextToken() {
		return this.nextToken;
	}

	public void setNextToken(String nextToken) {
		this.nextToken = nextToken;
	}

	public Integer getMaxResults() {
		return this.maxResults;
	}

	public void setMaxResults(Integer maxResults) {
		this.maxResults = maxResults;
	}

	public List<Database> getDatabaseList() {
		return this.databaseList;
	}

	public void setDatabaseList(List<Database> databaseList) {
		this.databaseList = databaseList;
	}

	public static class Database {

		private String description;

		private Map<Object,Object> parameters;

		private Long dbId;

		private String catalogName;

		private String name;

		private String location;

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public Map<Object,Object> getParameters() {
			return this.parameters;
		}

		public void setParameters(Map<Object,Object> parameters) {
			this.parameters = parameters;
		}

		public Long getDbId() {
			return this.dbId;
		}

		public void setDbId(Long dbId) {
			this.dbId = dbId;
		}

		public String getCatalogName() {
			return this.catalogName;
		}

		public void setCatalogName(String catalogName) {
			this.catalogName = catalogName;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getLocation() {
			return this.location;
		}

		public void setLocation(String location) {
			this.location = location;
		}
	}

	@Override
	public ListDataLakeDatabaseResponse getInstance(UnmarshallerContext context) {
		return	ListDataLakeDatabaseResponseUnmarshaller.unmarshall(this, context);
	}
}
