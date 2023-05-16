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

package com.aliyuncs.agency.model.v20180703;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.agency.transform.v20180703.CreateNormalAccountResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class CreateNormalAccountResponse extends AcsResponse {

	private String code;

	private String message;

	private Boolean success;

	private List<Result> data;

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

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public List<Result> getData() {
		return this.data;
	}

	public void setData(List<Result> data) {
		this.data = data;
	}

	public static class Result {

		private String code;

		private String message;

		private Boolean success;

		private EachData eachData;

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

		public Boolean getSuccess() {
			return this.success;
		}

		public void setSuccess(Boolean success) {
			this.success = success;
		}

		public EachData getEachData() {
			return this.eachData;
		}

		public void setEachData(EachData eachData) {
			this.eachData = eachData;
		}

		public static class EachData {

			private String regUrl;

			private Integer days;

			private Long id;

			public String getRegUrl() {
				return this.regUrl;
			}

			public void setRegUrl(String regUrl) {
				this.regUrl = regUrl;
			}

			public Integer getDays() {
				return this.days;
			}

			public void setDays(Integer days) {
				this.days = days;
			}

			public Long getId() {
				return this.id;
			}

			public void setId(Long id) {
				this.id = id;
			}
		}
	}

	@Override
	public CreateNormalAccountResponse getInstance(UnmarshallerContext context) {
		return	CreateNormalAccountResponseUnmarshaller.unmarshall(this, context);
	}
}
