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

package com.aliyuncs.cloudcallcenter.model.v20170705;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.cloudcallcenter.transform.v20170705.GetCorpNumberResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetCorpNumberResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String code;

	private String message;

	private Integer httpStatusCode;

	private List<Number> numbers;

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

	public Integer getHttpStatusCode() {
		return this.httpStatusCode;
	}

	public void setHttpStatusCode(Integer httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
	}

	public List<Number> getNumbers() {
		return this.numbers;
	}

	public void setNumbers(List<Number> numbers) {
		this.numbers = numbers;
	}

	public static class Number {

		private Long taobaoUid;

		private Long ramId;

		private Long realNameInsId;

		private String number;

		private String regionNameProvince;

		private String regionNameCity;

		private String corpName;

		private String monthlyPrice;

		private String number1;

		public Long getTaobaoUid() {
			return this.taobaoUid;
		}

		public void setTaobaoUid(Long taobaoUid) {
			this.taobaoUid = taobaoUid;
		}

		public Long getRamId() {
			return this.ramId;
		}

		public void setRamId(Long ramId) {
			this.ramId = ramId;
		}

		public Long getRealNameInsId() {
			return this.realNameInsId;
		}

		public void setRealNameInsId(Long realNameInsId) {
			this.realNameInsId = realNameInsId;
		}

		public String getNumber() {
			return this.number;
		}

		public void setNumber(String number) {
			this.number = number;
		}

		public String getRegionNameProvince() {
			return this.regionNameProvince;
		}

		public void setRegionNameProvince(String regionNameProvince) {
			this.regionNameProvince = regionNameProvince;
		}

		public String getRegionNameCity() {
			return this.regionNameCity;
		}

		public void setRegionNameCity(String regionNameCity) {
			this.regionNameCity = regionNameCity;
		}

		public String getCorpName() {
			return this.corpName;
		}

		public void setCorpName(String corpName) {
			this.corpName = corpName;
		}

		public String getMonthlyPrice() {
			return this.monthlyPrice;
		}

		public void setMonthlyPrice(String monthlyPrice) {
			this.monthlyPrice = monthlyPrice;
		}

		public String getNumber1() {
			return this.number1;
		}

		public void setNumber1(String number1) {
			this.number1 = number1;
		}
	}

	@Override
	public GetCorpNumberResponse getInstance(UnmarshallerContext context) {
		return	GetCorpNumberResponseUnmarshaller.unmarshall(this, context);
	}
}
