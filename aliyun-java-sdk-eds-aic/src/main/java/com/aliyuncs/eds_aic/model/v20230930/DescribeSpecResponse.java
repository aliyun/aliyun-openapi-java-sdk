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

package com.aliyuncs.eds_aic.model.v20230930;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.eds_aic.transform.v20230930.DescribeSpecResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeSpecResponse extends AcsResponse {

	private String requestId;

	private Integer totalCount;

	private String nextToken;

	private List<Data> specInfoModel;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public String getNextToken() {
		return this.nextToken;
	}

	public void setNextToken(String nextToken) {
		this.nextToken = nextToken;
	}

	public List<Data> getSpecInfoModel() {
		return this.specInfoModel;
	}

	public void setSpecInfoModel(List<Data> specInfoModel) {
		this.specInfoModel = specInfoModel;
	}

	public static class Data {

		private String specId;

		private Integer core;

		private Integer memory;

		private Integer systemDiskSize;

		private String specType;

		private String specStatus;

		private String phoneCount;

		private String resolution;

		private String maxPhoneCount;

		private String minPhoneCount;

		public String getSpecId() {
			return this.specId;
		}

		public void setSpecId(String specId) {
			this.specId = specId;
		}

		public Integer getCore() {
			return this.core;
		}

		public void setCore(Integer core) {
			this.core = core;
		}

		public Integer getMemory() {
			return this.memory;
		}

		public void setMemory(Integer memory) {
			this.memory = memory;
		}

		public Integer getSystemDiskSize() {
			return this.systemDiskSize;
		}

		public void setSystemDiskSize(Integer systemDiskSize) {
			this.systemDiskSize = systemDiskSize;
		}

		public String getSpecType() {
			return this.specType;
		}

		public void setSpecType(String specType) {
			this.specType = specType;
		}

		public String getSpecStatus() {
			return this.specStatus;
		}

		public void setSpecStatus(String specStatus) {
			this.specStatus = specStatus;
		}

		public String getPhoneCount() {
			return this.phoneCount;
		}

		public void setPhoneCount(String phoneCount) {
			this.phoneCount = phoneCount;
		}

		public String getResolution() {
			return this.resolution;
		}

		public void setResolution(String resolution) {
			this.resolution = resolution;
		}

		public String getMaxPhoneCount() {
			return this.maxPhoneCount;
		}

		public void setMaxPhoneCount(String maxPhoneCount) {
			this.maxPhoneCount = maxPhoneCount;
		}

		public String getMinPhoneCount() {
			return this.minPhoneCount;
		}

		public void setMinPhoneCount(String minPhoneCount) {
			this.minPhoneCount = minPhoneCount;
		}
	}

	@Override
	public DescribeSpecResponse getInstance(UnmarshallerContext context) {
		return	DescribeSpecResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
