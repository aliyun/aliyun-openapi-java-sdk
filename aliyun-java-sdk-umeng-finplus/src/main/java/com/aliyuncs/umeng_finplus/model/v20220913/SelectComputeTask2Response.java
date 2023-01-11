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

package com.aliyuncs.umeng_finplus.model.v20220913;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.umeng_finplus.transform.v20220913.SelectComputeTask2ResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class SelectComputeTask2Response extends AcsResponse {

	private String requestId;

	private String msg;

	private String code;

	private Boolean success;

	private Data data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getMsg() {
		return this.msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
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

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private Long appId;

		private Long bcId;

		private String computeOssFileTitle;

		private String datasetIds;

		private Long fileNum;

		private String name;

		private String status;

		private String remarks;

		private String extInfo;

		private String hint;

		private List<A> taskResultList;

		private List<B> exportOssFileList;

		public Long getAppId() {
			return this.appId;
		}

		public void setAppId(Long appId) {
			this.appId = appId;
		}

		public Long getBcId() {
			return this.bcId;
		}

		public void setBcId(Long bcId) {
			this.bcId = bcId;
		}

		public String getComputeOssFileTitle() {
			return this.computeOssFileTitle;
		}

		public void setComputeOssFileTitle(String computeOssFileTitle) {
			this.computeOssFileTitle = computeOssFileTitle;
		}

		public String getDatasetIds() {
			return this.datasetIds;
		}

		public void setDatasetIds(String datasetIds) {
			this.datasetIds = datasetIds;
		}

		public Long getFileNum() {
			return this.fileNum;
		}

		public void setFileNum(Long fileNum) {
			this.fileNum = fileNum;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getRemarks() {
			return this.remarks;
		}

		public void setRemarks(String remarks) {
			this.remarks = remarks;
		}

		public String getExtInfo() {
			return this.extInfo;
		}

		public void setExtInfo(String extInfo) {
			this.extInfo = extInfo;
		}

		public String getHint() {
			return this.hint;
		}

		public void setHint(String hint) {
			this.hint = hint;
		}

		public List<A> getTaskResultList() {
			return this.taskResultList;
		}

		public void setTaskResultList(List<A> taskResultList) {
			this.taskResultList = taskResultList;
		}

		public List<B> getExportOssFileList() {
			return this.exportOssFileList;
		}

		public void setExportOssFileList(List<B> exportOssFileList) {
			this.exportOssFileList = exportOssFileList;
		}

		public static class A {

			private Long bcId;

			private Integer code;

			private Long lineNum;

			public Long getBcId() {
				return this.bcId;
			}

			public void setBcId(Long bcId) {
				this.bcId = bcId;
			}

			public Integer getCode() {
				return this.code;
			}

			public void setCode(Integer code) {
				this.code = code;
			}

			public Long getLineNum() {
				return this.lineNum;
			}

			public void setLineNum(Long lineNum) {
				this.lineNum = lineNum;
			}
		}

		public static class B {

			private String downLoadUrl;

			private String password;

			public String getDownLoadUrl() {
				return this.downLoadUrl;
			}

			public void setDownLoadUrl(String downLoadUrl) {
				this.downLoadUrl = downLoadUrl;
			}

			public String getPassword() {
				return this.password;
			}

			public void setPassword(String password) {
				this.password = password;
			}
		}
	}

	@Override
	public SelectComputeTask2Response getInstance(UnmarshallerContext context) {
		return	SelectComputeTask2ResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
