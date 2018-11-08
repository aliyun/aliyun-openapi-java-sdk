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

package com.aliyuncs.rtc.model.v20180111;

import java.util.List;
import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.rtc.transform.v20180111.RemoveTerminalsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class RemoveTerminalsResponse extends AcsResponse {

	private String requestId;

	private List<Terminal> terminals;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<Terminal> getTerminals() {
		return this.terminals;
	}

	public void setTerminals(List<Terminal> terminals) {
		this.terminals = terminals;
	}

	public static class Terminal {

		private String id;

		private Integer code;

		private String message;

		public String getId() {
			return this.id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public Integer getCode() {
			return this.code;
		}

		public void setCode(Integer code) {
			this.code = code;
		}

		public String getMessage() {
			return this.message;
		}

		public void setMessage(String message) {
			this.message = message;
		}
	}

	@Override
	public RemoveTerminalsResponse getInstance(UnmarshallerContext context) {
		return	RemoveTerminalsResponseUnmarshaller.unmarshall(this, context);
	}
}
