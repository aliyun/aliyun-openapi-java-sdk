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

package com.aliyuncs.ecsops.model.v20160401;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecsops.transform.v20160401.OpsEcsAnalyseVmStateByPassResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class OpsEcsAnalyseVmStateByPassResponse extends AcsResponse {

	private String requestId;

	private List<Item> dataList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<Item> getDataList() {
		return this.dataList;
	}

	public void setDataList(List<Item> dataList) {
		this.dataList = dataList;
	}

	public static class Item {

		private String status;

		private String description;

		private String officialResponse;

		private String detail;

		private String solution;

		private String errorType;

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getOfficialResponse() {
			return this.officialResponse;
		}

		public void setOfficialResponse(String officialResponse) {
			this.officialResponse = officialResponse;
		}

		public String getDetail() {
			return this.detail;
		}

		public void setDetail(String detail) {
			this.detail = detail;
		}

		public String getSolution() {
			return this.solution;
		}

		public void setSolution(String solution) {
			this.solution = solution;
		}

		public String getErrorType() {
			return this.errorType;
		}

		public void setErrorType(String errorType) {
			this.errorType = errorType;
		}
	}

	@Override
	public OpsEcsAnalyseVmStateByPassResponse getInstance(UnmarshallerContext context) {
		return	OpsEcsAnalyseVmStateByPassResponseUnmarshaller.unmarshall(this, context);
	}
}
