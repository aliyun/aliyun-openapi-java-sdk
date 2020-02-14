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
import com.aliyuncs.pts.transform.v20190810.DescribeReportChainDetailResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeReportChainDetailResponse extends AcsResponse {

	private String message;

	private Integer httpStatusCode;

	private Boolean success;

	private String requestId;

	private String code;

	private List<Chain> chainDetails;

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

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
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

	public List<Chain> getChainDetails() {
		return this.chainDetails;
	}

	public void setChainDetails(List<Chain> chainDetails) {
		this.chainDetails = chainDetails;
	}

	public static class Chain {

		private Long totalFail;

		private Float qpsFail;

		private Long total3XX;

		private Float realConcurrency;

		private Long timePoint;

		private Integer maxRt;

		private Integer minRt;

		private Long totalRequest;

		private Float qps2XX;

		private Long total4XX;

		private Long total5XX;

		private Float qps4XX;

		private Float realQps;

		private Integer configQps;

		private Integer averageRt;

		private Long bpsRequest;

		private Long chainId;

		private Long bpsResponse;

		private Long total2XX;

		private Float qps5XX;

		public Long getTotalFail() {
			return this.totalFail;
		}

		public void setTotalFail(Long totalFail) {
			this.totalFail = totalFail;
		}

		public Float getQpsFail() {
			return this.qpsFail;
		}

		public void setQpsFail(Float qpsFail) {
			this.qpsFail = qpsFail;
		}

		public Long getTotal3XX() {
			return this.total3XX;
		}

		public void setTotal3XX(Long total3XX) {
			this.total3XX = total3XX;
		}

		public Float getRealConcurrency() {
			return this.realConcurrency;
		}

		public void setRealConcurrency(Float realConcurrency) {
			this.realConcurrency = realConcurrency;
		}

		public Long getTimePoint() {
			return this.timePoint;
		}

		public void setTimePoint(Long timePoint) {
			this.timePoint = timePoint;
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

		public Long getTotalRequest() {
			return this.totalRequest;
		}

		public void setTotalRequest(Long totalRequest) {
			this.totalRequest = totalRequest;
		}

		public Float getQps2XX() {
			return this.qps2XX;
		}

		public void setQps2XX(Float qps2XX) {
			this.qps2XX = qps2XX;
		}

		public Long getTotal4XX() {
			return this.total4XX;
		}

		public void setTotal4XX(Long total4XX) {
			this.total4XX = total4XX;
		}

		public Long getTotal5XX() {
			return this.total5XX;
		}

		public void setTotal5XX(Long total5XX) {
			this.total5XX = total5XX;
		}

		public Float getQps4XX() {
			return this.qps4XX;
		}

		public void setQps4XX(Float qps4XX) {
			this.qps4XX = qps4XX;
		}

		public Float getRealQps() {
			return this.realQps;
		}

		public void setRealQps(Float realQps) {
			this.realQps = realQps;
		}

		public Integer getConfigQps() {
			return this.configQps;
		}

		public void setConfigQps(Integer configQps) {
			this.configQps = configQps;
		}

		public Integer getAverageRt() {
			return this.averageRt;
		}

		public void setAverageRt(Integer averageRt) {
			this.averageRt = averageRt;
		}

		public Long getBpsRequest() {
			return this.bpsRequest;
		}

		public void setBpsRequest(Long bpsRequest) {
			this.bpsRequest = bpsRequest;
		}

		public Long getChainId() {
			return this.chainId;
		}

		public void setChainId(Long chainId) {
			this.chainId = chainId;
		}

		public Long getBpsResponse() {
			return this.bpsResponse;
		}

		public void setBpsResponse(Long bpsResponse) {
			this.bpsResponse = bpsResponse;
		}

		public Long getTotal2XX() {
			return this.total2XX;
		}

		public void setTotal2XX(Long total2XX) {
			this.total2XX = total2XX;
		}

		public Float getQps5XX() {
			return this.qps5XX;
		}

		public void setQps5XX(Float qps5XX) {
			this.qps5XX = qps5XX;
		}
	}

	@Override
	public DescribeReportChainDetailResponse getInstance(UnmarshallerContext context) {
		return	DescribeReportChainDetailResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
