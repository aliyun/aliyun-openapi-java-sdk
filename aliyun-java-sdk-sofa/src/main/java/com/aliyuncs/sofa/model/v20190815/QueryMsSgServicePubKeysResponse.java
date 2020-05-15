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
import com.aliyuncs.sofa.transform.v20190815.QueryMsSgServicePubKeysResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryMsSgServicePubKeysResponse extends AcsResponse {

	private String requestId;

	private String resultCode;

	private String resultMessage;

	private Long currentPage;

	private Long pageSize;

	private Long startIndex;

	private Long totalSize;

	private List<SimpleServiceInfosItem> simpleServiceInfos;

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

	public Long getCurrentPage() {
		return this.currentPage;
	}

	public void setCurrentPage(Long currentPage) {
		this.currentPage = currentPage;
	}

	public Long getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

	public Long getStartIndex() {
		return this.startIndex;
	}

	public void setStartIndex(Long startIndex) {
		this.startIndex = startIndex;
	}

	public Long getTotalSize() {
		return this.totalSize;
	}

	public void setTotalSize(Long totalSize) {
		this.totalSize = totalSize;
	}

	public List<SimpleServiceInfosItem> getSimpleServiceInfos() {
		return this.simpleServiceInfos;
	}

	public void setSimpleServiceInfos(List<SimpleServiceInfosItem> simpleServiceInfos) {
		this.simpleServiceInfos = simpleServiceInfos;
	}

	public static class SimpleServiceInfosItem {

		private String dataId;

		private Long pubCount;

		private String serviceType;

		private Long subCount;

		private List<String> pubApp;

		public String getDataId() {
			return this.dataId;
		}

		public void setDataId(String dataId) {
			this.dataId = dataId;
		}

		public Long getPubCount() {
			return this.pubCount;
		}

		public void setPubCount(Long pubCount) {
			this.pubCount = pubCount;
		}

		public String getServiceType() {
			return this.serviceType;
		}

		public void setServiceType(String serviceType) {
			this.serviceType = serviceType;
		}

		public Long getSubCount() {
			return this.subCount;
		}

		public void setSubCount(Long subCount) {
			this.subCount = subCount;
		}

		public List<String> getPubApp() {
			return this.pubApp;
		}

		public void setPubApp(List<String> pubApp) {
			this.pubApp = pubApp;
		}
	}

	@Override
	public QueryMsSgServicePubKeysResponse getInstance(UnmarshallerContext context) {
		return	QueryMsSgServicePubKeysResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
