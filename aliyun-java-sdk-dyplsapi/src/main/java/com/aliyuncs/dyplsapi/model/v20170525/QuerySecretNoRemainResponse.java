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

package com.aliyuncs.dyplsapi.model.v20170525;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.dyplsapi.transform.v20170525.QuerySecretNoRemainResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QuerySecretNoRemainResponse extends AcsResponse {

	private String requestId;

	private String code;

	private String message;

	private SecretRemainDTO secretRemainDTO;

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

	public SecretRemainDTO getSecretRemainDTO() {
		return this.secretRemainDTO;
	}

	public void setSecretRemainDTO(SecretRemainDTO secretRemainDTO) {
		this.secretRemainDTO = secretRemainDTO;
	}

	public static class SecretRemainDTO {

		private String city;

		private Long amount;

		private List<RemainDTO> remainDTOList;

		public String getCity() {
			return this.city;
		}

		public void setCity(String city) {
			this.city = city;
		}

		public Long getAmount() {
			return this.amount;
		}

		public void setAmount(Long amount) {
			this.amount = amount;
		}

		public List<RemainDTO> getRemainDTOList() {
			return this.remainDTOList;
		}

		public void setRemainDTOList(List<RemainDTO> remainDTOList) {
			this.remainDTOList = remainDTOList;
		}

		public static class RemainDTO {

			private String city;

			private Long amount;

			public String getCity() {
				return this.city;
			}

			public void setCity(String city) {
				this.city = city;
			}

			public Long getAmount() {
				return this.amount;
			}

			public void setAmount(Long amount) {
				this.amount = amount;
			}
		}
	}

	@Override
	public QuerySecretNoRemainResponse getInstance(UnmarshallerContext context) {
		return	QuerySecretNoRemainResponseUnmarshaller.unmarshall(this, context);
	}
}
