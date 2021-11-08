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

package com.aliyuncs.elasticsearch.model.v20170613;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.elasticsearch.transform.v20170613.ListInstanceIndicesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListInstanceIndicesResponse extends AcsResponse {

	private String requestId;

	private List<ResultItem> result;

	private Headers headers;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<ResultItem> getResult() {
		return this.result;
	}

	public void setResult(List<ResultItem> result) {
		this.result = result;
	}

	public Headers getHeaders() {
		return this.headers;
	}

	public void setHeaders(Headers headers) {
		this.headers = headers;
	}

	public static class ResultItem {

		private String isManaged;

		private String createTime;

		private Long size;

		private String managedStatus;

		private String name;

		private String health;

		private String phase;

		private String ilmExplain;

		public String getIsManaged() {
			return this.isManaged;
		}

		public void setIsManaged(String isManaged) {
			this.isManaged = isManaged;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public Long getSize() {
			return this.size;
		}

		public void setSize(Long size) {
			this.size = size;
		}

		public String getManagedStatus() {
			return this.managedStatus;
		}

		public void setManagedStatus(String managedStatus) {
			this.managedStatus = managedStatus;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getHealth() {
			return this.health;
		}

		public void setHealth(String health) {
			this.health = health;
		}

		public String getPhase() {
			return this.phase;
		}

		public void setPhase(String phase) {
			this.phase = phase;
		}

		public String getIlmExplain() {
			return this.ilmExplain;
		}

		public void setIlmExplain(String ilmExplain) {
			this.ilmExplain = ilmExplain;
		}
	}

	public static class Headers {

		private Long xManagedStorageSize;

		private Integer xManagedCount;

		private Long xOSSStorageSize;

		private Integer xOSSCount;

		public Long getXManagedStorageSize() {
			return this.xManagedStorageSize;
		}

		public void setXManagedStorageSize(Long xManagedStorageSize) {
			this.xManagedStorageSize = xManagedStorageSize;
		}

		public Integer getXManagedCount() {
			return this.xManagedCount;
		}

		public void setXManagedCount(Integer xManagedCount) {
			this.xManagedCount = xManagedCount;
		}

		public Long getXOSSStorageSize() {
			return this.xOSSStorageSize;
		}

		public void setXOSSStorageSize(Long xOSSStorageSize) {
			this.xOSSStorageSize = xOSSStorageSize;
		}

		public Integer getXOSSCount() {
			return this.xOSSCount;
		}

		public void setXOSSCount(Integer xOSSCount) {
			this.xOSSCount = xOSSCount;
		}
	}

	@Override
	public ListInstanceIndicesResponse getInstance(UnmarshallerContext context) {
		return	ListInstanceIndicesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
