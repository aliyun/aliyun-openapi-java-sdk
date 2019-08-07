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

package com.aliyuncs.hdr.model.v20170925;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.hdr.transform.v20170925.DescribeInfrastructuresResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeInfrastructuresResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String code;

	private String message;

	private Integer totalCount;

	private Integer pageNumber;

	private Integer pageSize;

	private List<Infrastructure> infrastructures;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
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

	public List<Infrastructure> getInfrastructures() {
		return this.infrastructures;
	}

	public void setInfrastructures(List<Infrastructure> infrastructures) {
		this.infrastructures = infrastructures;
	}

	public static class Infrastructure {

		private String infrastructureId;

		private String name;

		private String type;

		private String ipAddress;

		private String errno;

		private String status;

		public String getInfrastructureId() {
			return this.infrastructureId;
		}

		public void setInfrastructureId(String infrastructureId) {
			this.infrastructureId = infrastructureId;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public String getIpAddress() {
			return this.ipAddress;
		}

		public void setIpAddress(String ipAddress) {
			this.ipAddress = ipAddress;
		}

		public String getErrno() {
			return this.errno;
		}

		public void setErrno(String errno) {
			this.errno = errno;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}
	}

	@Override
	public DescribeInfrastructuresResponse getInstance(UnmarshallerContext context) {
		return	DescribeInfrastructuresResponseUnmarshaller.unmarshall(this, context);
	}
}
