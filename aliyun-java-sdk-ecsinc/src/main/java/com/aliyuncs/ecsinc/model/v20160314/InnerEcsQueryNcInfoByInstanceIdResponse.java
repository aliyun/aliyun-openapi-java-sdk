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
import com.aliyuncs.ecsinc.transform.v20160314.InnerEcsQueryNcInfoByInstanceIdResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class InnerEcsQueryNcInfoByInstanceIdResponse extends AcsResponse {

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

		private String ncId;

		private String ncIp;

		private String rackId;

		private String zoneNo;

		private Integer avaliableDisk;

		private Integer totalDisk;

		private Integer avaliableCpu;

		private Integer totalCpu;

		private Integer avaliableMem;

		private Integer totalMem;

		public String getNcId() {
			return this.ncId;
		}

		public void setNcId(String ncId) {
			this.ncId = ncId;
		}

		public String getNcIp() {
			return this.ncIp;
		}

		public void setNcIp(String ncIp) {
			this.ncIp = ncIp;
		}

		public String getRackId() {
			return this.rackId;
		}

		public void setRackId(String rackId) {
			this.rackId = rackId;
		}

		public String getZoneNo() {
			return this.zoneNo;
		}

		public void setZoneNo(String zoneNo) {
			this.zoneNo = zoneNo;
		}

		public Integer getAvaliableDisk() {
			return this.avaliableDisk;
		}

		public void setAvaliableDisk(Integer avaliableDisk) {
			this.avaliableDisk = avaliableDisk;
		}

		public Integer getTotalDisk() {
			return this.totalDisk;
		}

		public void setTotalDisk(Integer totalDisk) {
			this.totalDisk = totalDisk;
		}

		public Integer getAvaliableCpu() {
			return this.avaliableCpu;
		}

		public void setAvaliableCpu(Integer avaliableCpu) {
			this.avaliableCpu = avaliableCpu;
		}

		public Integer getTotalCpu() {
			return this.totalCpu;
		}

		public void setTotalCpu(Integer totalCpu) {
			this.totalCpu = totalCpu;
		}

		public Integer getAvaliableMem() {
			return this.avaliableMem;
		}

		public void setAvaliableMem(Integer avaliableMem) {
			this.avaliableMem = avaliableMem;
		}

		public Integer getTotalMem() {
			return this.totalMem;
		}

		public void setTotalMem(Integer totalMem) {
			this.totalMem = totalMem;
		}
	}

	@Override
	public InnerEcsQueryNcInfoByInstanceIdResponse getInstance(UnmarshallerContext context) {
		return	InnerEcsQueryNcInfoByInstanceIdResponseUnmarshaller.unmarshall(this, context);
	}
}
