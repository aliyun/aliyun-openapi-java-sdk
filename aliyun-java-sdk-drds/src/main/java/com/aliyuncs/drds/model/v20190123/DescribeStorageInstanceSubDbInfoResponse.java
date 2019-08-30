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

package com.aliyuncs.drds.model.v20190123;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.drds.transform.v20190123.DescribeStorageInstanceSubDbInfoResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeStorageInstanceSubDbInfoResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

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

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private String rdsInstanceId;

		private Long use;

		private Long capacity;

		private Integer warningLevel;

		private Integer tipsType;

		private List<SubDb> subDbList;

		public String getRdsInstanceId() {
			return this.rdsInstanceId;
		}

		public void setRdsInstanceId(String rdsInstanceId) {
			this.rdsInstanceId = rdsInstanceId;
		}

		public Long getUse() {
			return this.use;
		}

		public void setUse(Long use) {
			this.use = use;
		}

		public Long getCapacity() {
			return this.capacity;
		}

		public void setCapacity(Long capacity) {
			this.capacity = capacity;
		}

		public Integer getWarningLevel() {
			return this.warningLevel;
		}

		public void setWarningLevel(Integer warningLevel) {
			this.warningLevel = warningLevel;
		}

		public Integer getTipsType() {
			return this.tipsType;
		}

		public void setTipsType(Integer tipsType) {
			this.tipsType = tipsType;
		}

		public List<SubDb> getSubDbList() {
			return this.subDbList;
		}

		public void setSubDbList(List<SubDb> subDbList) {
			this.subDbList = subDbList;
		}

		public static class SubDb {

			private String subDbName;

			private Long use;

			private Integer warningLevel;

			public String getSubDbName() {
				return this.subDbName;
			}

			public void setSubDbName(String subDbName) {
				this.subDbName = subDbName;
			}

			public Long getUse() {
				return this.use;
			}

			public void setUse(Long use) {
				this.use = use;
			}

			public Integer getWarningLevel() {
				return this.warningLevel;
			}

			public void setWarningLevel(Integer warningLevel) {
				this.warningLevel = warningLevel;
			}
		}
	}

	@Override
	public DescribeStorageInstanceSubDbInfoResponse getInstance(UnmarshallerContext context) {
		return	DescribeStorageInstanceSubDbInfoResponseUnmarshaller.unmarshall(this, context);
	}
}
