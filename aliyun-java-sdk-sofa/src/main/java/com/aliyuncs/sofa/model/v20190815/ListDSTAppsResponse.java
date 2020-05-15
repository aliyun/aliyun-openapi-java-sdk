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

package com.aliyuncs.sofa.model.v20190815;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.sofa.transform.v20190815.ListDSTAppsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListDSTAppsResponse extends AcsResponse {

	private String requestId;

	private String resultCode;

	private String resultMessage;

	private Long pageNumber;

	private Long pageSize;

	private Long totalCount;

	private List<AppsItem> apps;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getResultCode() {
		return this.resultCode;
	}

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}

	public String getResultMessage() {
		return this.resultMessage;
	}

	public void setResultMessage(String resultMessage) {
		this.resultMessage = resultMessage;
	}

	public Long getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Long pageNumber) {
		this.pageNumber = pageNumber;
	}

	public Long getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

	public Long getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}

	public List<AppsItem> getApps() {
		return this.apps;
	}

	public void setApps(List<AppsItem> apps) {
		this.apps = apps;
	}

	public static class AppsItem {

		private String bizLogAppCreator;

		private Long bizLogConfigCount;

		private Boolean bizLogEnabled;

		private Boolean collected;

		private String name;

		public String getBizLogAppCreator() {
			return this.bizLogAppCreator;
		}

		public void setBizLogAppCreator(String bizLogAppCreator) {
			this.bizLogAppCreator = bizLogAppCreator;
		}

		public Long getBizLogConfigCount() {
			return this.bizLogConfigCount;
		}

		public void setBizLogConfigCount(Long bizLogConfigCount) {
			this.bizLogConfigCount = bizLogConfigCount;
		}

		public Boolean getBizLogEnabled() {
			return this.bizLogEnabled;
		}

		public void setBizLogEnabled(Boolean bizLogEnabled) {
			this.bizLogEnabled = bizLogEnabled;
		}

		public Boolean getCollected() {
			return this.collected;
		}

		public void setCollected(Boolean collected) {
			this.collected = collected;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}
	}

	@Override
	public ListDSTAppsResponse getInstance(UnmarshallerContext context) {
		return	ListDSTAppsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
