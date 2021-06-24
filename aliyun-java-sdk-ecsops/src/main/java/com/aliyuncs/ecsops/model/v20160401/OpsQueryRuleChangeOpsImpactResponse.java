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

package com.aliyuncs.ecsops.model.v20160401;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecsops.transform.v20160401.OpsQueryRuleChangeOpsImpactResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class OpsQueryRuleChangeOpsImpactResponse extends AcsResponse {

	private String status;

	private Boolean finished;

	private String requestId;

	private String errorInfo;

	private String token;

	private Boolean iterationQuery;

	private List<MatchedException> matchedExceptions;

	private List<String> iterationTokens;

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Boolean getFinished() {
		return this.finished;
	}

	public void setFinished(Boolean finished) {
		this.finished = finished;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getErrorInfo() {
		return this.errorInfo;
	}

	public void setErrorInfo(String errorInfo) {
		this.errorInfo = errorInfo;
	}

	public String getToken() {
		return this.token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public Boolean getIterationQuery() {
		return this.iterationQuery;
	}

	public void setIterationQuery(Boolean iterationQuery) {
		this.iterationQuery = iterationQuery;
	}

	public List<MatchedException> getMatchedExceptions() {
		return this.matchedExceptions;
	}

	public void setMatchedExceptions(List<MatchedException> matchedExceptions) {
		this.matchedExceptions = matchedExceptions;
	}

	public List<String> getIterationTokens() {
		return this.iterationTokens;
	}

	public void setIterationTokens(List<String> iterationTokens) {
		this.iterationTokens = iterationTokens;
	}

	public static class MatchedException {

		private String firstMatchedTime;

		private String matchedFeatures;

		private String productName;

		private String clusterName;

		private String ncIp;

		private String additionalInfo;

		public String getFirstMatchedTime() {
			return this.firstMatchedTime;
		}

		public void setFirstMatchedTime(String firstMatchedTime) {
			this.firstMatchedTime = firstMatchedTime;
		}

		public String getMatchedFeatures() {
			return this.matchedFeatures;
		}

		public void setMatchedFeatures(String matchedFeatures) {
			this.matchedFeatures = matchedFeatures;
		}

		public String getProductName() {
			return this.productName;
		}

		public void setProductName(String productName) {
			this.productName = productName;
		}

		public String getClusterName() {
			return this.clusterName;
		}

		public void setClusterName(String clusterName) {
			this.clusterName = clusterName;
		}

		public String getNcIp() {
			return this.ncIp;
		}

		public void setNcIp(String ncIp) {
			this.ncIp = ncIp;
		}

		public String getAdditionalInfo() {
			return this.additionalInfo;
		}

		public void setAdditionalInfo(String additionalInfo) {
			this.additionalInfo = additionalInfo;
		}
	}

	@Override
	public OpsQueryRuleChangeOpsImpactResponse getInstance(UnmarshallerContext context) {
		return	OpsQueryRuleChangeOpsImpactResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
