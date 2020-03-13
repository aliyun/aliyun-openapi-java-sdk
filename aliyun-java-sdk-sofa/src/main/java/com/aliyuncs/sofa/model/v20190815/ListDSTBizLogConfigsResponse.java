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
import com.aliyuncs.sofa.transform.v20190815.ListDSTBizLogConfigsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListDSTBizLogConfigsResponse extends AcsResponse {

	private String requestId;

	private String resultCode;

	private String resultMessage;

	private Long pageNumber;

	private Long pageSize;

	private Long totalCount;

	private List<BizLogConfigsItem> bizLogConfigs;

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

	public List<BizLogConfigsItem> getBizLogConfigs() {
		return this.bizLogConfigs;
	}

	public void setBizLogConfigs(List<BizLogConfigsItem> bizLogConfigs) {
		this.bizLogConfigs = bizLogConfigs;
	}

	public static class BizLogConfigsItem {

		private Boolean advSetValid;

		private String app;

		private String checkCondition;

		private Long id;

		private String logBeginRegex;

		private String logPath;

		private String logSample;

		private String name;

		public Boolean getAdvSetValid() {
			return this.advSetValid;
		}

		public void setAdvSetValid(Boolean advSetValid) {
			this.advSetValid = advSetValid;
		}

		public String getApp() {
			return this.app;
		}

		public void setApp(String app) {
			this.app = app;
		}

		public String getCheckCondition() {
			return this.checkCondition;
		}

		public void setCheckCondition(String checkCondition) {
			this.checkCondition = checkCondition;
		}

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getLogBeginRegex() {
			return this.logBeginRegex;
		}

		public void setLogBeginRegex(String logBeginRegex) {
			this.logBeginRegex = logBeginRegex;
		}

		public String getLogPath() {
			return this.logPath;
		}

		public void setLogPath(String logPath) {
			this.logPath = logPath;
		}

		public String getLogSample() {
			return this.logSample;
		}

		public void setLogSample(String logSample) {
			this.logSample = logSample;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}
	}

	@Override
	public ListDSTBizLogConfigsResponse getInstance(UnmarshallerContext context) {
		return	ListDSTBizLogConfigsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
