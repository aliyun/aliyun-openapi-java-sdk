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

package com.aliyuncs.market.model.v20151101;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.market.transform.v20151101.DescribeApiMeteringResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeApiMeteringResponse extends AcsResponse {

	private String requestId;

	private String code;

	private Long pageNumber;

	private Boolean success;

	private Long count;

	private Long pageSize;

	private String message;

	private String version;

	private Boolean fatal;

	private List<ResultItem> result;

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

	public Long getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Long pageNumber) {
		this.pageNumber = pageNumber;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public Long getCount() {
		return this.count;
	}

	public void setCount(Long count) {
		this.count = count;
	}

	public Long getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getVersion() {
		return this.version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public Boolean getFatal() {
		return this.fatal;
	}

	public void setFatal(Boolean fatal) {
		this.fatal = fatal;
	}

	public List<ResultItem> getResult() {
		return this.result;
	}

	public void setResult(List<ResultItem> result) {
		this.result = result;
	}

	public static class ResultItem {

		private Long aliyunPk;

		private String productCode;

		private String productName;

		private Long totalQuota;

		private Long totalUsage;

		private Long totalCapacity;

		private String unit;

		public Long getAliyunPk() {
			return this.aliyunPk;
		}

		public void setAliyunPk(Long aliyunPk) {
			this.aliyunPk = aliyunPk;
		}

		public String getProductCode() {
			return this.productCode;
		}

		public void setProductCode(String productCode) {
			this.productCode = productCode;
		}

		public String getProductName() {
			return this.productName;
		}

		public void setProductName(String productName) {
			this.productName = productName;
		}

		public Long getTotalQuota() {
			return this.totalQuota;
		}

		public void setTotalQuota(Long totalQuota) {
			this.totalQuota = totalQuota;
		}

		public Long getTotalUsage() {
			return this.totalUsage;
		}

		public void setTotalUsage(Long totalUsage) {
			this.totalUsage = totalUsage;
		}

		public Long getTotalCapacity() {
			return this.totalCapacity;
		}

		public void setTotalCapacity(Long totalCapacity) {
			this.totalCapacity = totalCapacity;
		}

		public String getUnit() {
			return this.unit;
		}

		public void setUnit(String unit) {
			this.unit = unit;
		}
	}

	@Override
	public DescribeApiMeteringResponse getInstance(UnmarshallerContext context) {
		return	DescribeApiMeteringResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
