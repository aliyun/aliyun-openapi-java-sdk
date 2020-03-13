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

package com.aliyuncs.sofa.model.v20190815;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.sofa.transform.v20190815.DescribeDSTAppResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDSTAppResponse extends AcsResponse {

	private String requestId;

	private String resultCode;

	private String resultMessage;

	private App app;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getResultCode() {
		return this.resultCode;
	}

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}

	public String getResultMessage() {
		return this.resultMessage;
	}

	public void setResultMessage(String resultMessage) {
		this.resultMessage = resultMessage;
	}

	public App getApp() {
		return this.app;
	}

	public void setApp(App app) {
		this.app = app;
	}

	public static class App {

		private Boolean bizLogEnabled;

		private Boolean collected;

		private String name;

		public Boolean getBizLogEnabled() {
			return this.bizLogEnabled;
		}

		public void setBizLogEnabled(Boolean bizLogEnabled) {
			this.bizLogEnabled = bizLogEnabled;
		}

		public Boolean getCollected() {
			return this.collected;
		}

		public void setCollected(Boolean collected) {
			this.collected = collected;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}
	}

	@Override
	public DescribeDSTAppResponse getInstance(UnmarshallerContext context) {
		return	DescribeDSTAppResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
