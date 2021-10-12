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

package com.aliyuncs.linkvisual.model.v20180120;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.linkvisual.transform.v20180120.QueryLocalFileUploadJobResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryLocalFileUploadJobResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String code;

	private String errorMessage;

	private Data data;

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

	public String getErrorMessage() {
		return this.errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private Integer status;

		private List<ResultListItem> resultList;

		public Integer getStatus() {
			return this.status;
		}

		public void setStatus(Integer status) {
			this.status = status;
		}

		public List<ResultListItem> getResultList() {
			return this.resultList;
		}

		public void setResultList(List<ResultListItem> resultList) {
			this.resultList = resultList;
		}

		public static class ResultListItem {

			private String iotId;

			private String productKey;

			private String deviceName;

			private Integer slotStartTime;

			private Integer slotEndTime;

			private Integer slotStatus;

			private Integer code;

			private List<FileListItem> fileList;

			public String getIotId() {
				return this.iotId;
			}

			public void setIotId(String iotId) {
				this.iotId = iotId;
			}

			public String getProductKey() {
				return this.productKey;
			}

			public void setProductKey(String productKey) {
				this.productKey = productKey;
			}

			public String getDeviceName() {
				return this.deviceName;
			}

			public void setDeviceName(String deviceName) {
				this.deviceName = deviceName;
			}

			public Integer getSlotStartTime() {
				return this.slotStartTime;
			}

			public void setSlotStartTime(Integer slotStartTime) {
				this.slotStartTime = slotStartTime;
			}

			public Integer getSlotEndTime() {
				return this.slotEndTime;
			}

			public void setSlotEndTime(Integer slotEndTime) {
				this.slotEndTime = slotEndTime;
			}

			public Integer getSlotStatus() {
				return this.slotStatus;
			}

			public void setSlotStatus(Integer slotStatus) {
				this.slotStatus = slotStatus;
			}

			public Integer getCode() {
				return this.code;
			}

			public void setCode(Integer code) {
				this.code = code;
			}

			public List<FileListItem> getFileList() {
				return this.fileList;
			}

			public void setFileList(List<FileListItem> fileList) {
				this.fileList = fileList;
			}

			public static class FileListItem {

				private Integer fileStartTime;

				private Integer fileEndTime;

				private String fileName;

				public Integer getFileStartTime() {
					return this.fileStartTime;
				}

				public void setFileStartTime(Integer fileStartTime) {
					this.fileStartTime = fileStartTime;
				}

				public Integer getFileEndTime() {
					return this.fileEndTime;
				}

				public void setFileEndTime(Integer fileEndTime) {
					this.fileEndTime = fileEndTime;
				}

				public String getFileName() {
					return this.fileName;
				}

				public void setFileName(String fileName) {
					this.fileName = fileName;
				}
			}
		}
	}

	@Override
	public QueryLocalFileUploadJobResponse getInstance(UnmarshallerContext context) {
		return	QueryLocalFileUploadJobResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
