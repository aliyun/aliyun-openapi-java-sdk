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

package com.aliyuncs.pts.model.v20190810;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.pts.transform.v20190810.DescribeReportChainSummaryResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeReportChainSummaryResponse extends AcsResponse {

	private String message;

	private Integer httpStatusCode;

	private String requestId;

	private String code;

	private Boolean success;

	private List<Chain> chainSummary;

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Integer getHttpStatusCode() {
		return this.httpStatusCode;
	}

	public void setHttpStatusCode(Integer httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public List<Chain> getChainSummary() {
		return this.chainSummary;
	}

	public void setChainSummary(List<Chain> chainSummary) {
		this.chainSummary = chainSummary;
	}

	public static class Chain {

		private Long chainId;

		private Float averageTps;

		private Float succeedRequestRate;

		private Boolean hasCheckPoint;

		private String chainName;

		private Long totalRequest;

		private Long count5XX;

		private String relationName;

		private Long count4XX;

		private Long countTimeout;

		private Long seg75Rt;

		private Long failedBusinessCount;

		private Long failedRequestCount;

		private Long seg90Rt;

		private Integer maxRt;

		private Integer minRt;

		private Long count3XX;

		private Float averageRt;

		private Long relationId;

		private Float succeedBusinessRate;

		private Integer seg50Rt;

		private Integer seg99Rt;

		private Float averageConcurrency;

		public Long getChainId() {
			return this.chainId;
		}

		public void setChainId(Long chainId) {
			this.chainId = chainId;
		}

		public Float getAverageTps() {
			return this.averageTps;
		}

		public void setAverageTps(Float averageTps) {
			this.averageTps = averageTps;
		}

		public Float getSucceedRequestRate() {
			return this.succeedRequestRate;
		}

		public void setSucceedRequestRate(Float succeedRequestRate) {
			this.succeedRequestRate = succeedRequestRate;
		}

		public Boolean getHasCheckPoint() {
			return this.hasCheckPoint;
		}

		public void setHasCheckPoint(Boolean hasCheckPoint) {
			this.hasCheckPoint = hasCheckPoint;
		}

		public String getChainName() {
			return this.chainName;
		}

		public void setChainName(String chainName) {
			this.chainName = chainName;
		}

		public Long getTotalRequest() {
			return this.totalRequest;
		}

		public void setTotalRequest(Long totalRequest) {
			this.totalRequest = totalRequest;
		}

		public Long getCount5XX() {
			return this.count5XX;
		}

		public void setCount5XX(Long count5XX) {
			this.count5XX = count5XX;
		}

		public String getRelationName() {
			return this.relationName;
		}

		public void setRelationName(String relationName) {
			this.relationName = relationName;
		}

		public Long getCount4XX() {
			return this.count4XX;
		}

		public void setCount4XX(Long count4XX) {
			this.count4XX = count4XX;
		}

		public Long getCountTimeout() {
			return this.countTimeout;
		}

		public void setCountTimeout(Long countTimeout) {
			this.countTimeout = countTimeout;
		}

		public Long getSeg75Rt() {
			return this.seg75Rt;
		}

		public void setSeg75Rt(Long seg75Rt) {
			this.seg75Rt = seg75Rt;
		}

		public Long getFailedBusinessCount() {
			return this.failedBusinessCount;
		}

		public void setFailedBusinessCount(Long failedBusinessCount) {
			this.failedBusinessCount = failedBusinessCount;
		}

		public Long getFailedRequestCount() {
			return this.failedRequestCount;
		}

		public void setFailedRequestCount(Long failedRequestCount) {
			this.failedRequestCount = failedRequestCount;
		}

		public Long getSeg90Rt() {
			return this.seg90Rt;
		}

		public void setSeg90Rt(Long seg90Rt) {
			this.seg90Rt = seg90Rt;
		}

		public Integer getMaxRt() {
			return this.maxRt;
		}

		public void setMaxRt(Integer maxRt) {
			this.maxRt = maxRt;
		}

		public Integer getMinRt() {
			return this.minRt;
		}

		public void setMinRt(Integer minRt) {
			this.minRt = minRt;
		}

		public Long getCount3XX() {
			return this.count3XX;
		}

		public void setCount3XX(Long count3XX) {
			this.count3XX = count3XX;
		}

		public Float getAverageRt() {
			return this.averageRt;
		}

		public void setAverageRt(Float averageRt) {
			this.averageRt = averageRt;
		}

		public Long getRelationId() {
			return this.relationId;
		}

		public void setRelationId(Long relationId) {
			this.relationId = relationId;
		}

		public Float getSucceedBusinessRate() {
			return this.succeedBusinessRate;
		}

		public void setSucceedBusinessRate(Float succeedBusinessRate) {
			this.succeedBusinessRate = succeedBusinessRate;
		}

		public Integer getSeg50Rt() {
			return this.seg50Rt;
		}

		public void setSeg50Rt(Integer seg50Rt) {
			this.seg50Rt = seg50Rt;
		}

		public Integer getSeg99Rt() {
			return this.seg99Rt;
		}

		public void setSeg99Rt(Integer seg99Rt) {
			this.seg99Rt = seg99Rt;
		}

		public Float getAverageConcurrency() {
			return this.averageConcurrency;
		}

		public void setAverageConcurrency(Float averageConcurrency) {
			this.averageConcurrency = averageConcurrency;
		}
	}

	@Override
	public DescribeReportChainSummaryResponse getInstance(UnmarshallerContext context) {
		return	DescribeReportChainSummaryResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
