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
import com.aliyuncs.emr.transform.v20160408.ListEmrVersionsForAdminResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListEmrVersionsForAdminResponse extends AcsResponse {

	private String requestId;

	private Integer pageNumber;

	private Integer pageSize;

	private Integer totalCount;

	private List<MainVersionKeyValue> mainVersionKeyValueList;

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

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public List<MainVersionKeyValue> getMainVersionKeyValueList() {
		return this.mainVersionKeyValueList;
	}

	public void setMainVersionKeyValueList(List<MainVersionKeyValue> mainVersionKeyValueList) {
		this.mainVersionKeyValueList = mainVersionKeyValueList;
	}

	public static class MainVersionKeyValue {

		private Integer id;

		private String key;

		private String value;

		private Integer status;

		private Long utcCreateTimestamp;

		private Long utcModifiedTimestamp;

		public Integer getId() {
			return this.id;
		}

		public void setId(Integer id) {
			this.id = id;
		}

		public String getKey() {
			return this.key;
		}

		public void setKey(String key) {
			this.key = key;
		}

		public String getValue() {
			return this.value;
		}

		public void setValue(String value) {
			this.value = value;
		}

		public Integer getStatus() {
			return this.status;
		}

		public void setStatus(Integer status) {
			this.status = status;
		}

		public Long getUtcCreateTimestamp() {
			return this.utcCreateTimestamp;
		}

		public void setUtcCreateTimestamp(Long utcCreateTimestamp) {
			this.utcCreateTimestamp = utcCreateTimestamp;
		}

		public Long getUtcModifiedTimestamp() {
			return this.utcModifiedTimestamp;
		}

		public void setUtcModifiedTimestamp(Long utcModifiedTimestamp) {
			this.utcModifiedTimestamp = utcModifiedTimestamp;
		}
	}

	@Override
	public ListEmrVersionsForAdminResponse getInstance(UnmarshallerContext context) {
		return	ListEmrVersionsForAdminResponseUnmarshaller.unmarshall(this, context);
	}
}
