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

package com.aliyuncs.onsmqtt.model.v20200420;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.onsmqtt.transform.v20200420.ListCaCertificateResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListCaCertificateResponse extends AcsResponse {

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

		private Integer total;

		private Integer pageNo;

		private Integer pageSize;

		private List<CaCertificateVO> caCertificateVOS;

		public Integer getTotal() {
			return this.total;
		}

		public void setTotal(Integer total) {
			this.total = total;
		}

		public Integer getPageNo() {
			return this.pageNo;
		}

		public void setPageNo(Integer pageNo) {
			this.pageNo = pageNo;
		}

		public Integer getPageSize() {
			return this.pageSize;
		}

		public void setPageSize(Integer pageSize) {
			this.pageSize = pageSize;
		}

		public List<CaCertificateVO> getCaCertificateVOS() {
			return this.caCertificateVOS;
		}

		public void setCaCertificateVOS(List<CaCertificateVO> caCertificateVOS) {
			this.caCertificateVOS = caCertificateVOS;
		}

		public static class CaCertificateVO {

			private String registrationCode;

			private String caName;

			private String sn;

			private String caContent;

			private String verificationContent;

			private String validBegin;

			private String validEnd;

			private String status;

			public String getRegistrationCode() {
				return this.registrationCode;
			}

			public void setRegistrationCode(String registrationCode) {
				this.registrationCode = registrationCode;
			}

			public String getCaName() {
				return this.caName;
			}

			public void setCaName(String caName) {
				this.caName = caName;
			}

			public String getSn() {
				return this.sn;
			}

			public void setSn(String sn) {
				this.sn = sn;
			}

			public String getCaContent() {
				return this.caContent;
			}

			public void setCaContent(String caContent) {
				this.caContent = caContent;
			}

			public String getVerificationContent() {
				return this.verificationContent;
			}

			public void setVerificationContent(String verificationContent) {
				this.verificationContent = verificationContent;
			}

			public String getValidBegin() {
				return this.validBegin;
			}

			public void setValidBegin(String validBegin) {
				this.validBegin = validBegin;
			}

			public String getValidEnd() {
				return this.validEnd;
			}

			public void setValidEnd(String validEnd) {
				this.validEnd = validEnd;
			}

			public String getStatus() {
				return this.status;
			}

			public void setStatus(String status) {
				this.status = status;
			}
		}
	}

	@Override
	public ListCaCertificateResponse getInstance(UnmarshallerContext context) {
		return	ListCaCertificateResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
