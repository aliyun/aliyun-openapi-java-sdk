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

package com.aliyuncs.cloud_siem.model.v20220616;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.cloud_siem.transform.v20220616.ListUsersByProdResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListUsersByProdResponse extends AcsResponse {

	private String requestId;

	private List<DataItem> data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<DataItem> getData() {
		return this.data;
	}

	public void setData(List<DataItem> data) {
		this.data = data;
	}

	public static class DataItem {

		private String sourceProdCode;

		private String sourceLogCode;

		private String sourceLogName;

		private String cloudCode;

		private Boolean imported;

		private String logMdsCode;

		private Long mainUserId;

		private Long subUserId;

		private String subUserName;

		public String getSourceProdCode() {
			return this.sourceProdCode;
		}

		public void setSourceProdCode(String sourceProdCode) {
			this.sourceProdCode = sourceProdCode;
		}

		public String getSourceLogCode() {
			return this.sourceLogCode;
		}

		public void setSourceLogCode(String sourceLogCode) {
			this.sourceLogCode = sourceLogCode;
		}

		public String getSourceLogName() {
			return this.sourceLogName;
		}

		public void setSourceLogName(String sourceLogName) {
			this.sourceLogName = sourceLogName;
		}

		public String getCloudCode() {
			return this.cloudCode;
		}

		public void setCloudCode(String cloudCode) {
			this.cloudCode = cloudCode;
		}

		public Boolean getImported() {
			return this.imported;
		}

		public void setImported(Boolean imported) {
			this.imported = imported;
		}

		public String getLogMdsCode() {
			return this.logMdsCode;
		}

		public void setLogMdsCode(String logMdsCode) {
			this.logMdsCode = logMdsCode;
		}

		public Long getMainUserId() {
			return this.mainUserId;
		}

		public void setMainUserId(Long mainUserId) {
			this.mainUserId = mainUserId;
		}

		public Long getSubUserId() {
			return this.subUserId;
		}

		public void setSubUserId(Long subUserId) {
			this.subUserId = subUserId;
		}

		public String getSubUserName() {
			return this.subUserName;
		}

		public void setSubUserName(String subUserName) {
			this.subUserName = subUserName;
		}
	}

	@Override
	public ListUsersByProdResponse getInstance(UnmarshallerContext context) {
		return	ListUsersByProdResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
