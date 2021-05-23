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
import com.aliyuncs.drds.transform.v20190123.GetDrdsDbRdsRelationInfoResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetDrdsDbRdsRelationInfoResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private List<DataItem> data;

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

	public List<DataItem> getData() {
		return this.data;
	}

	public void setData(List<DataItem> data) {
		this.data = data;
	}

	public static class DataItem {

		private String rdsInstanceId;

		private String usedInstanceId;

		private String usedInstanceType;

		private List<String> readOnlyInstanceInfo;

		public String getRdsInstanceId() {
			return this.rdsInstanceId;
		}

		public void setRdsInstanceId(String rdsInstanceId) {
			this.rdsInstanceId = rdsInstanceId;
		}

		public String getUsedInstanceId() {
			return this.usedInstanceId;
		}

		public void setUsedInstanceId(String usedInstanceId) {
			this.usedInstanceId = usedInstanceId;
		}

		public String getUsedInstanceType() {
			return this.usedInstanceType;
		}

		public void setUsedInstanceType(String usedInstanceType) {
			this.usedInstanceType = usedInstanceType;
		}

		public List<String> getReadOnlyInstanceInfo() {
			return this.readOnlyInstanceInfo;
		}

		public void setReadOnlyInstanceInfo(List<String> readOnlyInstanceInfo) {
			this.readOnlyInstanceInfo = readOnlyInstanceInfo;
		}
	}

	@Override
	public GetDrdsDbRdsRelationInfoResponse getInstance(UnmarshallerContext context) {
		return	GetDrdsDbRdsRelationInfoResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
