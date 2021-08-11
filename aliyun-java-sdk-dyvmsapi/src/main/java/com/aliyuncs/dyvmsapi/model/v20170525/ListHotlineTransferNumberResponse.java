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
import com.aliyuncs.dyvmsapi.transform.v20170525.ListHotlineTransferNumberResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListHotlineTransferNumberResponse extends AcsResponse {

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

			private String phoneNumber;

			private String numberOwnerName;

			private String identityCard;

			private String resUniqueCode;

			private String hotlineNumber;

			public String getQualificationId() {
				return this.qualificationId;
			}

			public void setQualificationId(String qualificationId) {
				this.qualificationId = qualificationId;
			}

			public String getPhoneNumber() {
				return this.phoneNumber;
			}

			public void setPhoneNumber(String phoneNumber) {
				this.phoneNumber = phoneNumber;
			}

			public String getNumberOwnerName() {
				return this.numberOwnerName;
			}

			public void setNumberOwnerName(String numberOwnerName) {
				this.numberOwnerName = numberOwnerName;
			}

			public String getIdentityCard() {
				return this.identityCard;
			}

			public void setIdentityCard(String identityCard) {
				this.identityCard = identityCard;
			}

			public String getResUniqueCode() {
				return this.resUniqueCode;
			}

			public void setResUniqueCode(String resUniqueCode) {
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
	public ListHotlineTransferNumberResponse getInstance(UnmarshallerContext context) {
		return	ListHotlineTransferNumberResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
