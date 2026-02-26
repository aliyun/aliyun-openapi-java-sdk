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

package com.aliyuncs.qualitycheck.model.v20190115;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.qualitycheck.transform.v20190115.ListDataSetResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListDataSetResponse extends AcsResponse {

	private Integer count;

	private Integer currentPage;

	private Integer pageSize;

	private Integer pageNumber;

	private String requestId;

	private Boolean success;

	private String code;

	private String message;

	private Integer httpStatusCode;

	private List<DataItem> data;

	private List<String> messages;

	public Integer getCount() {
		return this.count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	public Integer getCurrentPage() {
		return this.currentPage;
	}

	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

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

	public Integer getHttpStatusCode() {
		return this.httpStatusCode;
	}

	public void setHttpStatusCode(Integer httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
	}

	public List<DataItem> getData() {
		return this.data;
	}

	public void setData(List<DataItem> data) {
		this.data = data;
	}

	public List<String> getMessages() {
		return this.messages;
	}

	public void setMessages(List<String> messages) {
		this.messages = messages;
	}

	public static class DataItem {

		private Long setId;

		private String setName;

		private String setDomain;

		private String setRoleArn;

		private String setBucketName;

		private String setFolderName;

		private Integer setNumber;

		private Integer roleConfigStatus;

		private Integer channelId0;

		private Integer channelId1;

		private String roleConfigTask;

		private Integer isDelete;

		private String createTime;

		private String updateTime;

		private Integer channelType;

		private String subDir;

		private Integer createType;

		private String userGroup;

		private String roleConfigProp;

		private Integer autoTranscoding;

		private Integer setType;

		private Integer dataSetType;

		private Integer sourceDataType;

		public Long getSetId() {
			return this.setId;
		}

		public void setSetId(Long setId) {
			this.setId = setId;
		}

		public String getSetName() {
			return this.setName;
		}

		public void setSetName(String setName) {
			this.setName = setName;
		}

		public String getSetDomain() {
			return this.setDomain;
		}

		public void setSetDomain(String setDomain) {
			this.setDomain = setDomain;
		}

		public String getSetRoleArn() {
			return this.setRoleArn;
		}

		public void setSetRoleArn(String setRoleArn) {
			this.setRoleArn = setRoleArn;
		}

		public String getSetBucketName() {
			return this.setBucketName;
		}

		public void setSetBucketName(String setBucketName) {
			this.setBucketName = setBucketName;
		}

		public String getSetFolderName() {
			return this.setFolderName;
		}

		public void setSetFolderName(String setFolderName) {
			this.setFolderName = setFolderName;
		}

		public Integer getSetNumber() {
			return this.setNumber;
		}

		public void setSetNumber(Integer setNumber) {
			this.setNumber = setNumber;
		}

		public Integer getRoleConfigStatus() {
			return this.roleConfigStatus;
		}

		public void setRoleConfigStatus(Integer roleConfigStatus) {
			this.roleConfigStatus = roleConfigStatus;
		}

		public Integer getChannelId0() {
			return this.channelId0;
		}

		public void setChannelId0(Integer channelId0) {
			this.channelId0 = channelId0;
		}

		public Integer getChannelId1() {
			return this.channelId1;
		}

		public void setChannelId1(Integer channelId1) {
			this.channelId1 = channelId1;
		}

		public String getRoleConfigTask() {
			return this.roleConfigTask;
		}

		public void setRoleConfigTask(String roleConfigTask) {
			this.roleConfigTask = roleConfigTask;
		}

		public Integer getIsDelete() {
			return this.isDelete;
		}

		public void setIsDelete(Integer isDelete) {
			this.isDelete = isDelete;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public String getUpdateTime() {
			return this.updateTime;
		}

		public void setUpdateTime(String updateTime) {
			this.updateTime = updateTime;
		}

		public Integer getChannelType() {
			return this.channelType;
		}

		public void setChannelType(Integer channelType) {
			this.channelType = channelType;
		}

		public String getSubDir() {
			return this.subDir;
		}

		public void setSubDir(String subDir) {
			this.subDir = subDir;
		}

		public Integer getCreateType() {
			return this.createType;
		}

		public void setCreateType(Integer createType) {
			this.createType = createType;
		}

		public String getUserGroup() {
			return this.userGroup;
		}

		public void setUserGroup(String userGroup) {
			this.userGroup = userGroup;
		}

		public String getRoleConfigProp() {
			return this.roleConfigProp;
		}

		public void setRoleConfigProp(String roleConfigProp) {
			this.roleConfigProp = roleConfigProp;
		}

		public Integer getAutoTranscoding() {
			return this.autoTranscoding;
		}

		public void setAutoTranscoding(Integer autoTranscoding) {
			this.autoTranscoding = autoTranscoding;
		}

		public Integer getSetType() {
			return this.setType;
		}

		public void setSetType(Integer setType) {
			this.setType = setType;
		}

		public Integer getDataSetType() {
			return this.dataSetType;
		}

		public void setDataSetType(Integer dataSetType) {
			this.dataSetType = dataSetType;
		}

		public Integer getSourceDataType() {
			return this.sourceDataType;
		}

		public void setSourceDataType(Integer sourceDataType) {
			this.sourceDataType = sourceDataType;
		}
	}

	@Override
	public ListDataSetResponse getInstance(UnmarshallerContext context) {
		return	ListDataSetResponseUnmarshaller.unmarshall(this, context);
	}
}
