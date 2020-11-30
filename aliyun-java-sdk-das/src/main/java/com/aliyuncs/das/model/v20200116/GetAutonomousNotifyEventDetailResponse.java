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

package com.aliyuncs.das.model.v20200116;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.das.transform.v20200116.GetAutonomousNotifyEventDetailResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetAutonomousNotifyEventDetailResponse extends AcsResponse {

	private String code;

	private String message;

	private String requestId;

	private String success;

	private Data data;

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

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getSuccess() {
		return this.success;
	}

	public void setSuccess(String success) {
		this.success = success;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private Long serialVersionUID;

		private Integer dEFAULT_INITIAL_CAPACITY;

		private String map;

		public Long getSerialVersionUID() {
			return this.serialVersionUID;
		}

		public void setSerialVersionUID(Long serialVersionUID) {
			this.serialVersionUID = serialVersionUID;
		}

		public Integer getDEFAULT_INITIAL_CAPACITY() {
			return this.dEFAULT_INITIAL_CAPACITY;
		}

		public void setDEFAULT_INITIAL_CAPACITY(Integer dEFAULT_INITIAL_CAPACITY) {
			this.dEFAULT_INITIAL_CAPACITY = dEFAULT_INITIAL_CAPACITY;
		}

		public String getMap() {
			return this.map;
		}

		public void setMap(String map) {
			this.map = map;
		}
	}

	@Override
	public GetAutonomousNotifyEventDetailResponse getInstance(UnmarshallerContext context) {
		return	GetAutonomousNotifyEventDetailResponseUnmarshaller.unmarshall(this, context);
	}
}
