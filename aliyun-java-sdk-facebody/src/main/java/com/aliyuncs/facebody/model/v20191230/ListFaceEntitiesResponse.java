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

package com.aliyuncs.facebody.model.v20191230;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.facebody.transform.v20191230.ListFaceEntitiesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListFaceEntitiesResponse extends AcsResponse {

	private String requestId;

	private Data data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private Integer totalCount;

		private String token;

		private List<Entity> entities;

		public Integer getTotalCount() {
			return this.totalCount;
		}

		public void setTotalCount(Integer totalCount) {
			this.totalCount = totalCount;
		}

		public String getToken() {
			return this.token;
		}

		public void setToken(String token) {
			this.token = token;
		}

		public List<Entity> getEntities() {
			return this.entities;
		}

		public void setEntities(List<Entity> entities) {
			this.entities = entities;
		}

		public static class Entity {

			private String entityId;

			private Long createdAt;

			private String labels;

			private String dbName;

			private Long updatedAt;

			private Integer faceCount;

			public String getEntityId() {
				return this.entityId;
			}

			public void setEntityId(String entityId) {
				this.entityId = entityId;
			}

			public Long getCreatedAt() {
				return this.createdAt;
			}

			public void setCreatedAt(Long createdAt) {
				this.createdAt = createdAt;
			}

			public String getLabels() {
				return this.labels;
			}

			public void setLabels(String labels) {
				this.labels = labels;
			}

			public String getDbName() {
				return this.dbName;
			}

			public void setDbName(String dbName) {
				this.dbName = dbName;
			}

			public Long getUpdatedAt() {
				return this.updatedAt;
			}

			public void setUpdatedAt(Long updatedAt) {
				this.updatedAt = updatedAt;
			}

			public Integer getFaceCount() {
				return this.faceCount;
			}

			public void setFaceCount(Integer faceCount) {
				this.faceCount = faceCount;
			}
		}
	}

	@Override
	public ListFaceEntitiesResponse getInstance(UnmarshallerContext context) {
		return	ListFaceEntitiesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
