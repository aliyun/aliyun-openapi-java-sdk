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

package com.aliyuncs.smartag.model.v20180313;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.smartag.transform.v20180313.ListEnterpriseCodeResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListEnterpriseCodeResponse extends AcsResponse {

	private Integer totalCount;

	private String nextToken;

	private String requestId;

	private Integer maxResults;

	private List<EnterpriseCode> enterpriseCodes;

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public String getNextToken() {
		return this.nextToken;
	}

	public void setNextToken(String nextToken) {
		this.nextToken = nextToken;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getMaxResults() {
		return this.maxResults;
	}

	public void setMaxResults(Integer maxResults) {
		this.maxResults = maxResults;
	}

	public List<EnterpriseCode> getEnterpriseCodes() {
		return this.enterpriseCodes;
	}

	public void setEnterpriseCodes(List<EnterpriseCode> enterpriseCodes) {
		this.enterpriseCodes = enterpriseCodes;
	}

	public static class EnterpriseCode {

		private Boolean isDefault;

		private Integer smartAGCount;

		private String enterpriseCode;

		public Boolean getIsDefault() {
			return this.isDefault;
		}

		public void setIsDefault(Boolean isDefault) {
			this.isDefault = isDefault;
		}

		public Integer getSmartAGCount() {
			return this.smartAGCount;
		}

		public void setSmartAGCount(Integer smartAGCount) {
			this.smartAGCount = smartAGCount;
		}

		public String getEnterpriseCode() {
			return this.enterpriseCode;
		}

		public void setEnterpriseCode(String enterpriseCode) {
			this.enterpriseCode = enterpriseCode;
		}
	}

	@Override
	public ListEnterpriseCodeResponse getInstance(UnmarshallerContext context) {
		return	ListEnterpriseCodeResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
