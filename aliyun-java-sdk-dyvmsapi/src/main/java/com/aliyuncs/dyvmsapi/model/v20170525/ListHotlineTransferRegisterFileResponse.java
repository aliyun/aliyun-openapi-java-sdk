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

package com.aliyuncs.dyvmsapi.model.v20170525;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.dyvmsapi.transform.v20170525.ListHotlineTransferRegisterFileResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListHotlineTransferRegisterFileResponse extends AcsResponse {

	private String requestId;

	private String code;

	private String message;

	private Data data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
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

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private Long total;

		private Integer pageNo;

		private Integer pageSize;

		private List<ValuesItem> values;

		public Long getTotal() {
			return this.total;
		}

		public void setTotal(Long total) {
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

		public List<ValuesItem> getValues() {
			return this.values;
		}

		public void setValues(List<ValuesItem> values) {
			this.values = values;
		}

		public static class ValuesItem {

			private String qualificationId;

			private String corpName;

			private String mngOpName;

			private String mngOpMail;

			private String mngOpMobile;

			private String mngOpIdentityCard;

			private String agree;

			private Long resUniqueCode;

			private String hotlineNumber;

			public String getQualificationId() {
				return this.qualificationId;
			}

			public void setQualificationId(String qualificationId) {
				this.qualificationId = qualificationId;
			}

			public String getCorpName() {
				return this.corpName;
			}

			public void setCorpName(String corpName) {
				this.corpName = corpName;
			}

			public String getMngOpName() {
				return this.mngOpName;
			}

			public void setMngOpName(String mngOpName) {
				this.mngOpName = mngOpName;
			}

			public String getMngOpMail() {
				return this.mngOpMail;
			}

			public void setMngOpMail(String mngOpMail) {
				this.mngOpMail = mngOpMail;
			}

			public String getMngOpMobile() {
				return this.mngOpMobile;
			}

			public void setMngOpMobile(String mngOpMobile) {
				this.mngOpMobile = mngOpMobile;
			}

			public String getMngOpIdentityCard() {
				return this.mngOpIdentityCard;
			}

			public void setMngOpIdentityCard(String mngOpIdentityCard) {
				this.mngOpIdentityCard = mngOpIdentityCard;
			}

			public String getAgree() {
				return this.agree;
			}

			public void setAgree(String agree) {
				this.agree = agree;
			}

			public Long getResUniqueCode() {
				return this.resUniqueCode;
			}

			public void setResUniqueCode(Long resUniqueCode) {
				this.resUniqueCode = resUniqueCode;
			}

			public String getHotlineNumber() {
				return this.hotlineNumber;
			}

			public void setHotlineNumber(String hotlineNumber) {
				this.hotlineNumber = hotlineNumber;
			}
		}
	}

	@Override
	public ListHotlineTransferRegisterFileResponse getInstance(UnmarshallerContext context) {
		return	ListHotlineTransferRegisterFileResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
