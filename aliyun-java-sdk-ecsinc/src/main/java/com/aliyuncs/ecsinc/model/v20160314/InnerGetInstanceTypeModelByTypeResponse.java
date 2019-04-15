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

package com.aliyuncs.ecsinc.model.v20160314;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecsinc.transform.v20160314.InnerGetInstanceTypeModelByTypeResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class InnerGetInstanceTypeModelByTypeResponse extends AcsResponse {

	private String requestId;

	private ErrorCode errorCode;

	private Data data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public ErrorCode getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(ErrorCode errorCode) {
		this.errorCode = errorCode;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class ErrorCode {

		private String code;

		private String message;

		private Boolean isSuccess;

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

		public Boolean getIsSuccess() {
			return this.isSuccess;
		}

		public void setIsSuccess(Boolean isSuccess) {
			this.isSuccess = isSuccess;
		}
	}

	public static class Data {

		private Integer mem;

		private String supportIoOptimized;

		private Long diskSize;

		private Integer cores;

		private Integer diskNum;

		private String instanceTypeFamily;

		private String generation;

		private String gmtCreated;

		private String gmtModified;

		private String instanceType;

		private Integer status;

		public Integer getMem() {
			return this.mem;
		}

		public void setMem(Integer mem) {
			this.mem = mem;
		}

		public String getSupportIoOptimized() {
			return this.supportIoOptimized;
		}

		public void setSupportIoOptimized(String supportIoOptimized) {
			this.supportIoOptimized = supportIoOptimized;
		}

		public Long getDiskSize() {
			return this.diskSize;
		}

		public void setDiskSize(Long diskSize) {
			this.diskSize = diskSize;
		}

		public Integer getCores() {
			return this.cores;
		}

		public void setCores(Integer cores) {
			this.cores = cores;
		}

		public Integer getDiskNum() {
			return this.diskNum;
		}

		public void setDiskNum(Integer diskNum) {
			this.diskNum = diskNum;
		}

		public String getInstanceTypeFamily() {
			return this.instanceTypeFamily;
		}

		public void setInstanceTypeFamily(String instanceTypeFamily) {
			this.instanceTypeFamily = instanceTypeFamily;
		}

		public String getGeneration() {
			return this.generation;
		}

		public void setGeneration(String generation) {
			this.generation = generation;
		}

		public String getGmtCreated() {
			return this.gmtCreated;
		}

		public void setGmtCreated(String gmtCreated) {
			this.gmtCreated = gmtCreated;
		}

		public String getGmtModified() {
			return this.gmtModified;
		}

		public void setGmtModified(String gmtModified) {
			this.gmtModified = gmtModified;
		}

		public String getInstanceType() {
			return this.instanceType;
		}

		public void setInstanceType(String instanceType) {
			this.instanceType = instanceType;
		}

		public Integer getStatus() {
			return this.status;
		}

		public void setStatus(Integer status) {
			this.status = status;
		}
	}

	@Override
	public InnerGetInstanceTypeModelByTypeResponse getInstance(UnmarshallerContext context) {
		return	InnerGetInstanceTypeModelByTypeResponseUnmarshaller.unmarshall(this, context);
	}
}
