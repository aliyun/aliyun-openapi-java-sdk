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

import com.aliyuncs.AcsResponse;
import com.aliyuncs.cloud_siem.transform.v20220616.AddUserSourceLogConfigResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class AddUserSourceLogConfigResponse extends AcsResponse {

	private String requestId;

	private Data data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private String diplayLine;

		private String sourceProdCode;

		private String sourceLogCode;

		private Boolean displayed;

		private Boolean imported;

		private Long mainUserId;

		private Long subUserId;

		private String subUserName;

		public String getDiplayLine() {
			return this.diplayLine;
		}

		public void setDiplayLine(String diplayLine) {
			this.diplayLine = diplayLine;
		}

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

		public Boolean getDisplayed() {
			return this.displayed;
		}

		public void setDisplayed(Boolean displayed) {
			this.displayed = displayed;
		}

		public Boolean getImported() {
			return this.imported;
		}

		public void setImported(Boolean imported) {
			this.imported = imported;
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
	public AddUserSourceLogConfigResponse getInstance(UnmarshallerContext context) {
		return	AddUserSourceLogConfigResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
