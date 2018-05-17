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

package com.aliyuncs.pvtz.model.v20180101;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.pvtz.transform.v20180101.DescribeChangeLogsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeChangeLogsResponse extends AcsResponse {

	private String requestId;

	private Integer totalItems;

	private Integer totalPages;

	private Integer pageSize;

	private Integer pageNumber;

	private List<ChangeLog> changeLogs;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getTotalItems() {
		return this.totalItems;
	}

	public void setTotalItems(Integer totalItems) {
		this.totalItems = totalItems;
	}

	public Integer getTotalPages() {
		return this.totalPages;
	}

	public void setTotalPages(Integer totalPages) {
		this.totalPages = totalPages;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public List<ChangeLog> getChangeLogs() {
		return this.changeLogs;
	}

	public void setChangeLogs(List<ChangeLog> changeLogs) {
		this.changeLogs = changeLogs;
	}

	public static class ChangeLog {

		private String operTime;

		private String operAction;

		private String operObject;

		private String entityId;

		private String entityName;

		private String operIp;

		private Long operTimestamp;

		private Long id;

		private String content;

		public String getOperTime() {
			return this.operTime;
		}

		public void setOperTime(String operTime) {
			this.operTime = operTime;
		}

		public String getOperAction() {
			return this.operAction;
		}

		public void setOperAction(String operAction) {
			this.operAction = operAction;
		}

		public String getOperObject() {
			return this.operObject;
		}

		public void setOperObject(String operObject) {
			this.operObject = operObject;
		}

		public String getEntityId() {
			return this.entityId;
		}

		public void setEntityId(String entityId) {
			this.entityId = entityId;
		}

		public String getEntityName() {
			return this.entityName;
		}

		public void setEntityName(String entityName) {
			this.entityName = entityName;
		}

		public String getOperIp() {
			return this.operIp;
		}

		public void setOperIp(String operIp) {
			this.operIp = operIp;
		}

		public Long getOperTimestamp() {
			return this.operTimestamp;
		}

		public void setOperTimestamp(Long operTimestamp) {
			this.operTimestamp = operTimestamp;
		}

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getContent() {
			return this.content;
		}

		public void setContent(String content) {
			this.content = content;
		}
	}

	@Override
	public DescribeChangeLogsResponse getInstance(UnmarshallerContext context) {
		return	DescribeChangeLogsResponseUnmarshaller.unmarshall(this, context);
	}
}
