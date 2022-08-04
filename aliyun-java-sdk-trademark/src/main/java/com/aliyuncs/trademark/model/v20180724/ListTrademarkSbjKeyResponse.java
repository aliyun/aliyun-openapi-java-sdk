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

package com.aliyuncs.trademark.model.v20180724;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.trademark.transform.v20180724.ListTrademarkSbjKeyResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListTrademarkSbjKeyResponse extends AcsResponse {

	private String requestId;

	private List<TmSbjKeyInfoItem> tmSbjKeyInfo;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<TmSbjKeyInfoItem> getTmSbjKeyInfo() {
		return this.tmSbjKeyInfo;
	}

	public void setTmSbjKeyInfo(List<TmSbjKeyInfoItem> tmSbjKeyInfo) {
		this.tmSbjKeyInfo = tmSbjKeyInfo;
	}

	public static class TmSbjKeyInfoItem {

		private String typeCert;

		private Integer keyType;

		private String signData;

		private String agentId;

		private String signCert;

		private String submitSignData;

		private String validDate;

		private String clearData;

		private String pin;

		private String hashData;

		private String principalName;

		private String tmurl;

		private String name;

		private String startValidDate;

		private String agreeProt;

		private String principalKey;

		private String username;

		private String certInfo;

		public String getTypeCert() {
			return this.typeCert;
		}

		public void setTypeCert(String typeCert) {
			this.typeCert = typeCert;
		}

		public Integer getKeyType() {
			return this.keyType;
		}

		public void setKeyType(Integer keyType) {
			this.keyType = keyType;
		}

		public String getSignData() {
			return this.signData;
		}

		public void setSignData(String signData) {
			this.signData = signData;
		}

		public String getAgentId() {
			return this.agentId;
		}

		public void setAgentId(String agentId) {
			this.agentId = agentId;
		}

		public String getSignCert() {
			return this.signCert;
		}

		public void setSignCert(String signCert) {
			this.signCert = signCert;
		}

		public String getSubmitSignData() {
			return this.submitSignData;
		}

		public void setSubmitSignData(String submitSignData) {
			this.submitSignData = submitSignData;
		}

		public String getValidDate() {
			return this.validDate;
		}

		public void setValidDate(String validDate) {
			this.validDate = validDate;
		}

		public String getClearData() {
			return this.clearData;
		}

		public void setClearData(String clearData) {
			this.clearData = clearData;
		}

		public String getPin() {
			return this.pin;
		}

		public void setPin(String pin) {
			this.pin = pin;
		}

		public String getHashData() {
			return this.hashData;
		}

		public void setHashData(String hashData) {
			this.hashData = hashData;
		}

		public String getPrincipalName() {
			return this.principalName;
		}

		public void setPrincipalName(String principalName) {
			this.principalName = principalName;
		}

		public String getTmurl() {
			return this.tmurl;
		}

		public void setTmurl(String tmurl) {
			this.tmurl = tmurl;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getStartValidDate() {
			return this.startValidDate;
		}

		public void setStartValidDate(String startValidDate) {
			this.startValidDate = startValidDate;
		}

		public String getAgreeProt() {
			return this.agreeProt;
		}

		public void setAgreeProt(String agreeProt) {
			this.agreeProt = agreeProt;
		}

		public String getPrincipalKey() {
			return this.principalKey;
		}

		public void setPrincipalKey(String principalKey) {
			this.principalKey = principalKey;
		}

		public String getUsername() {
			return this.username;
		}

		public void setUsername(String username) {
			this.username = username;
		}

		public String getCertInfo() {
			return this.certInfo;
		}

		public void setCertInfo(String certInfo) {
			this.certInfo = certInfo;
		}
	}

	@Override
	public ListTrademarkSbjKeyResponse getInstance(UnmarshallerContext context) {
		return	ListTrademarkSbjKeyResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
