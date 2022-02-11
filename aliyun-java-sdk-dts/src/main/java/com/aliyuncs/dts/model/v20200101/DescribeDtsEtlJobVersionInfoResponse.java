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

package com.aliyuncs.dts.model.v20200101;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.dts.transform.v20200101.DescribeDtsEtlJobVersionInfoResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDtsEtlJobVersionInfoResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String errCode;

	private Integer pageNumber;

	private Integer pageRecordCount;

	private Integer totalRecordCount;

	private String errMessage;

	private String httpStatusCode;

	private String dynamicCode;

	private String dynamicMessage;

	private List<DtsEtlJobVersionInfo> dtsEtlJobVersionInfos;

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

	public String getErrCode() {
		return this.errCode;
	}

	public void setErrCode(String errCode) {
		this.errCode = errCode;
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public Integer getPageRecordCount() {
		return this.pageRecordCount;
	}

	public void setPageRecordCount(Integer pageRecordCount) {
		this.pageRecordCount = pageRecordCount;
	}

	public Integer getTotalRecordCount() {
		return this.totalRecordCount;
	}

	public void setTotalRecordCount(Integer totalRecordCount) {
		this.totalRecordCount = totalRecordCount;
	}

	public String getErrMessage() {
		return this.errMessage;
	}

	public void setErrMessage(String errMessage) {
		this.errMessage = errMessage;
	}

	public String getHttpStatusCode() {
		return this.httpStatusCode;
	}

	public void setHttpStatusCode(String httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
	}

	public String getDynamicCode() {
		return this.dynamicCode;
	}

	public void setDynamicCode(String dynamicCode) {
		this.dynamicCode = dynamicCode;
	}

	public String getDynamicMessage() {
		return this.dynamicMessage;
	}

	public void setDynamicMessage(String dynamicMessage) {
		this.dynamicMessage = dynamicMessage;
	}

	public List<DtsEtlJobVersionInfo> getDtsEtlJobVersionInfos() {
		return this.dtsEtlJobVersionInfos;
	}

	public void setDtsEtlJobVersionInfos(List<DtsEtlJobVersionInfo> dtsEtlJobVersionInfos) {
		this.dtsEtlJobVersionInfos = dtsEtlJobVersionInfos;
	}

	public static class DtsEtlJobVersionInfo {

		private String status;

		private String dtsJobName;

		private String dtsJobId;

		private Integer version;

		private String dtsInstanceId;

		private String createTime;

		private String safeCheckpoint;

		private String creator;

		private String modifyTime;

		private String creatorName;

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getDtsJobName() {
			return this.dtsJobName;
		}

		public void setDtsJobName(String dtsJobName) {
			this.dtsJobName = dtsJobName;
		}

		public String getDtsJobId() {
			return this.dtsJobId;
		}

		public void setDtsJobId(String dtsJobId) {
			this.dtsJobId = dtsJobId;
		}

		public Integer getVersion() {
			return this.version;
		}

		public void setVersion(Integer version) {
			this.version = version;
		}

		public String getDtsInstanceId() {
			return this.dtsInstanceId;
		}

		public void setDtsInstanceId(String dtsInstanceId) {
			this.dtsInstanceId = dtsInstanceId;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public String getSafeCheckpoint() {
			return this.safeCheckpoint;
		}

		public void setSafeCheckpoint(String safeCheckpoint) {
			this.safeCheckpoint = safeCheckpoint;
		}

		public String getCreator() {
			return this.creator;
		}

		public void setCreator(String creator) {
			this.creator = creator;
		}

		public String getModifyTime() {
			return this.modifyTime;
		}

		public void setModifyTime(String modifyTime) {
			this.modifyTime = modifyTime;
		}

		public String getCreatorName() {
			return this.creatorName;
		}

		public void setCreatorName(String creatorName) {
			this.creatorName = creatorName;
		}
	}

	@Override
	public DescribeDtsEtlJobVersionInfoResponse getInstance(UnmarshallerContext context) {
		return	DescribeDtsEtlJobVersionInfoResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
