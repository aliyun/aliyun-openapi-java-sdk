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

package com.aliyuncs.sas.model.v20181203;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.sas.transform.v20181203.GetHoneypotPresetResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetHoneypotPresetResponse extends AcsResponse {

	private Boolean success;

	private String code;

	private String message;

	private String requestId;

	private Integer httpStatusCode;

	private Data data;

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

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getHttpStatusCode() {
		return this.httpStatusCode;
	}

	public void setHttpStatusCode(Integer httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private String honeypotImageName;

		private String presetName;

		private String honeypotPresetId;

		private String meta;

		private String nodeId;

		private String controlNodeName;

		private String honeypotImageDisplayName;

		private String presetType;

		private List<FileInfoListItem> fileInfoList;

		public String getHoneypotImageName() {
			return this.honeypotImageName;
		}

		public void setHoneypotImageName(String honeypotImageName) {
			this.honeypotImageName = honeypotImageName;
		}

		public String getPresetName() {
			return this.presetName;
		}

		public void setPresetName(String presetName) {
			this.presetName = presetName;
		}

		public String getHoneypotPresetId() {
			return this.honeypotPresetId;
		}

		public void setHoneypotPresetId(String honeypotPresetId) {
			this.honeypotPresetId = honeypotPresetId;
		}

		public String getMeta() {
			return this.meta;
		}

		public void setMeta(String meta) {
			this.meta = meta;
		}

		public String getNodeId() {
			return this.nodeId;
		}

		public void setNodeId(String nodeId) {
			this.nodeId = nodeId;
		}

		public String getControlNodeName() {
			return this.controlNodeName;
		}

		public void setControlNodeName(String controlNodeName) {
			this.controlNodeName = controlNodeName;
		}

		public String getHoneypotImageDisplayName() {
			return this.honeypotImageDisplayName;
		}

		public void setHoneypotImageDisplayName(String honeypotImageDisplayName) {
			this.honeypotImageDisplayName = honeypotImageDisplayName;
		}

		public String getPresetType() {
			return this.presetType;
		}

		public void setPresetType(String presetType) {
			this.presetType = presetType;
		}

		public List<FileInfoListItem> getFileInfoList() {
			return this.fileInfoList;
		}

		public void setFileInfoList(List<FileInfoListItem> fileInfoList) {
			this.fileInfoList = fileInfoList;
		}

		public static class FileInfoListItem {

			private String fileId;

			private String fileName;

			private String ossUrl;

			public String getFileId() {
				return this.fileId;
			}

			public void setFileId(String fileId) {
				this.fileId = fileId;
			}

			public String getFileName() {
				return this.fileName;
			}

			public void setFileName(String fileName) {
				this.fileName = fileName;
			}

			public String getOssUrl() {
				return this.ossUrl;
			}

			public void setOssUrl(String ossUrl) {
				this.ossUrl = ossUrl;
			}
		}
	}

	@Override
	public GetHoneypotPresetResponse getInstance(UnmarshallerContext context) {
		return	GetHoneypotPresetResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
