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
import com.aliyuncs.qualitycheck.transform.v20190115.GetDataSetListResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetDataSetListResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String code;

	private String message;

	private Integer count;

	private List<DataSet> data;

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

	public Integer getCount() {
		return this.count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	public List<DataSet> getData() {
		return this.data;
	}

	public void setData(List<DataSet> data) {
		this.data = data;
	}

	public static class DataSet {

		private Long setId;

		private String setName;

		private String setDomain;

		private String setRoleArn;

		private String setBucketName;

		private String setFolderName;

		private Integer channelType;

		private Integer createType;

		private String createTime;

		private String updateTime;

		private Integer setNumber;

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

		public Integer getChannelType() {
			return this.channelType;
		}

		public void setChannelType(Integer channelType) {
			this.channelType = channelType;
		}

		public Integer getCreateType() {
			return this.createType;
		}

		public void setCreateType(Integer createType) {
			this.createType = createType;
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

		public Integer getSetNumber() {
			return this.setNumber;
		}

		public void setSetNumber(Integer setNumber) {
			this.setNumber = setNumber;
		}
	}

	@Override
	public GetDataSetListResponse getInstance(UnmarshallerContext context) {
		return	GetDataSetListResponseUnmarshaller.unmarshall(this, context);
	}
}
