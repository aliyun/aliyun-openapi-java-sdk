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

package com.aliyuncs.dypnsapi.model.v20170525;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.dypnsapi.transform.v20170525.JyQueryAppInfoBySceneCodeResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class JyQueryAppInfoBySceneCodeResponse extends AcsResponse {

	private String code;

	private String message;

	private String requestId;

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

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private String cmAppId;

		private String cmAppKey;

		private String ctAppId;

		private String ctAppKey;

		public String getCmAppId() {
			return this.cmAppId;
		}

		public void setCmAppId(String cmAppId) {
			this.cmAppId = cmAppId;
		}

		public String getCmAppKey() {
			return this.cmAppKey;
		}

		public void setCmAppKey(String cmAppKey) {
			this.cmAppKey = cmAppKey;
		}

		public String getCtAppId() {
			return this.ctAppId;
		}

		public void setCtAppId(String ctAppId) {
			this.ctAppId = ctAppId;
		}

		public String getCtAppKey() {
			return this.ctAppKey;
		}

		public void setCtAppKey(String ctAppKey) {
			this.ctAppKey = ctAppKey;
		}
	}

	@Override
	public JyQueryAppInfoBySceneCodeResponse getInstance(UnmarshallerContext context) {
		return	JyQueryAppInfoBySceneCodeResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
