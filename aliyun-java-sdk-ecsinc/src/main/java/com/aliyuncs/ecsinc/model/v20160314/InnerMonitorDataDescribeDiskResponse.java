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
import com.aliyuncs.ecsinc.transform.v20160314.InnerMonitorDataDescribeDiskResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class InnerMonitorDataDescribeDiskResponse extends AcsResponse {

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

			private Integer bPSRead;

			private Integer bPSWrite;

			private Integer iOPSRead;

			private Integer iOPSWrite;

			private Integer latencyRead;

			private Integer latencyWrite;

			private Integer iOBlockRead;

			private Integer iOBlockWrite;

			private Integer bPSTotal;

			private Integer iOPSTotal;

			private Integer iOBlockTotal;

			private Integer readPercent;

			private Integer writePercent;

			private Integer latencyTotal;

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

			public Integer getLatencyRead() {
				return this.latencyRead;
			}

			public void setLatencyRead(Integer latencyRead) {
				this.latencyRead = latencyRead;
			}

			public Integer getLatencyWrite() {
				return this.latencyWrite;
			}

			public void setLatencyWrite(Integer latencyWrite) {
				this.latencyWrite = latencyWrite;
			}

			public Integer getIOBlockRead() {
				return this.iOBlockRead;
			}

			public void setIOBlockRead(Integer iOBlockRead) {
				this.iOBlockRead = iOBlockRead;
			}

			public Integer getIOBlockWrite() {
				return this.iOBlockWrite;
			}

			public void setIOBlockWrite(Integer iOBlockWrite) {
				this.iOBlockWrite = iOBlockWrite;
			}

			public Integer getBPSTotal() {
				return this.bPSTotal;
			}

			public void setBPSTotal(Integer bPSTotal) {
				this.bPSTotal = bPSTotal;
			}

			public Integer getIOPSTotal() {
				return this.iOPSTotal;
			}

			public void setIOPSTotal(Integer iOPSTotal) {
				this.iOPSTotal = iOPSTotal;
			}

			public Integer getIOBlockTotal() {
				return this.iOBlockTotal;
			}

			public void setIOBlockTotal(Integer iOBlockTotal) {
				this.iOBlockTotal = iOBlockTotal;
			}

			public Integer getReadPercent() {
				return this.readPercent;
			}

			public void setReadPercent(Integer readPercent) {
				this.readPercent = readPercent;
			}

			public Integer getWritePercent() {
				return this.writePercent;
			}

			public void setWritePercent(Integer writePercent) {
				this.writePercent = writePercent;
			}

			public Integer getLatencyTotal() {
				return this.latencyTotal;
			}

			public void setLatencyTotal(Integer latencyTotal) {
				this.latencyTotal = latencyTotal;
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
	public InnerMonitorDataDescribeDiskResponse getInstance(UnmarshallerContext context) {
		return	InnerMonitorDataDescribeDiskResponseUnmarshaller.unmarshall(this, context);
	}
}
