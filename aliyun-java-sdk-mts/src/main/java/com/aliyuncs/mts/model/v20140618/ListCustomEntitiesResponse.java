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

package com.aliyuncs.mts.model.v20140618;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.mts.transform.v20140618.ListCustomEntitiesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListCustomEntitiesResponse extends AcsResponse {

	private String requestId;

	private Integer pageNumber;

	private Integer pageSize;

	private Long totalCount;

	private List<CustomEntity> customEntities;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
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

	public Long getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}

	public List<CustomEntity> getCustomEntities() {
		return this.customEntities;
	}

	public void setCustomEntities(List<CustomEntity> customEntities) {
		this.customEntities = customEntities;
	}

	public static class CustomEntity {

		private String customEntityId;

		private String customEntityName;

		private String customEntityInfo;

		public String getCustomEntityId() {
			return this.customEntityId;
		}

		public void setCustomEntityId(String customEntityId) {
			this.customEntityId = customEntityId;
		}

		public String getCustomEntityName() {
			return this.customEntityName;
		}

		public void setCustomEntityName(String customEntityName) {
			this.customEntityName = customEntityName;
		}

		public String getCustomEntityInfo() {
			return this.customEntityInfo;
		}

		public void setCustomEntityInfo(String customEntityInfo) {
			this.customEntityInfo = customEntityInfo;
		}
	}

	@Override
	public ListCustomEntitiesResponse getInstance(UnmarshallerContext context) {
		return	ListCustomEntitiesResponseUnmarshaller.unmarshall(this, context);
	}
}
