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

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecsinc.transform.v20160314.InnerMonitorDataDescribeInstanceResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class InnerMonitorDataDescribeInstanceResponse extends AcsResponse {

	private String requestId;

	private Integer count;

	private List<Item> data;

	private ErrorCode errorCode;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getCount() {
		return this.count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	public List<Item> getData() {
		return this.data;
	}

	public void setData(List<Item> data) {
		this.data = data;
	}

	public ErrorCode getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(ErrorCode errorCode) {
		this.errorCode = errorCode;
	}

	public static class Item {

		private String timeStamp;

		private String resourceStatus;

		private String resourceId;

		private Item2Value item2Value;

		public String getTimeStamp() {
			return this.timeStamp;
		}

		public void setTimeStamp(String timeStamp) {
			this.timeStamp = timeStamp;
		}

		public String getResourceStatus() {
			return this.resourceStatus;
		}

		public void setResourceStatus(String resourceStatus) {
			this.resourceStatus = resourceStatus;
		}

		public String getResourceId() {
			return this.resourceId;
		}

		public void setResourceId(String resourceId) {
			this.resourceId = resourceId;
		}

		public Item2Value getItem2Value() {
			return this.item2Value;
		}

		public void setItem2Value(Item2Value item2Value) {
			this.item2Value = item2Value;
		}

		public static class Item2Value {

			private Integer cPU;

			private Integer intranetRX;

			private Integer intranetTX;

			private Integer intranetBandwidth;

			private Integer internetRX;

			private Integer internetTX;

			private Integer internetBandwidth;

			private Integer iOPSRead;

			private Integer iOPSWrite;

			private Integer bPSRead;

			private Integer bPSWrite;

			public Integer getCPU() {
				return this.cPU;
			}

			public void setCPU(Integer cPU) {
				this.cPU = cPU;
			}

			public Integer getIntranetRX() {
				return this.intranetRX;
			}

			public void setIntranetRX(Integer intranetRX) {
				this.intranetRX = intranetRX;
			}

			public Integer getIntranetTX() {
				return this.intranetTX;
			}

			public void setIntranetTX(Integer intranetTX) {
				this.intranetTX = intranetTX;
			}

			public Integer getIntranetBandwidth() {
				return this.intranetBandwidth;
			}

			public void setIntranetBandwidth(Integer intranetBandwidth) {
				this.intranetBandwidth = intranetBandwidth;
			}

			public Integer getInternetRX() {
				return this.internetRX;
			}

			public void setInternetRX(Integer internetRX) {
				this.internetRX = internetRX;
			}

			public Integer getInternetTX() {
				return this.internetTX;
			}

			public void setInternetTX(Integer internetTX) {
				this.internetTX = internetTX;
			}

			public Integer getInternetBandwidth() {
				return this.internetBandwidth;
			}

			public void setInternetBandwidth(Integer internetBandwidth) {
				this.internetBandwidth = internetBandwidth;
			}

			public Integer getIOPSRead() {
				return this.iOPSRead;
			}

			public void setIOPSRead(Integer iOPSRead) {
				this.iOPSRead = iOPSRead;
			}

			public Integer getIOPSWrite() {
				return this.iOPSWrite;
			}

			public void setIOPSWrite(Integer iOPSWrite) {
				this.iOPSWrite = iOPSWrite;
			}

			public Integer getBPSRead() {
				return this.bPSRead;
			}

			public void setBPSRead(Integer bPSRead) {
				this.bPSRead = bPSRead;
			}

			public Integer getBPSWrite() {
				return this.bPSWrite;
			}

			public void setBPSWrite(Integer bPSWrite) {
				this.bPSWrite = bPSWrite;
			}
		}
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

	@Override
	public InnerMonitorDataDescribeInstanceResponse getInstance(UnmarshallerContext context) {
		return	InnerMonitorDataDescribeInstanceResponseUnmarshaller.unmarshall(this, context);
	}
}
