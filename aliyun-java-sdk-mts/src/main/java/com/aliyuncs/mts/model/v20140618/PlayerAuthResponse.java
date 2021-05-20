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

package com.aliyuncs.mts.model.v20140618;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.mts.transform.v20140618.PlayerAuthResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class PlayerAuthResponse extends AcsResponse {

	private String requestId;

	private String logURL;

	private List<_Switch> switchList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getLogURL() {
		return this.logURL;
	}

	public void setLogURL(String logURL) {
		this.logURL = logURL;
	}

	public List<_Switch> getSwitchList() {
		return this.switchList;
	}

	public void setSwitchList(List<_Switch> switchList) {
		this.switchList = switchList;
	}

	public static class _Switch {

		private String functionId;

		private String functionName;

		private String state;

		private String switchId;

		public String getFunctionId() {
			return this.functionId;
		}

		public void setFunctionId(String functionId) {
			this.functionId = functionId;
		}

		public String getFunctionName() {
			return this.functionName;
		}

		public void setFunctionName(String functionName) {
			this.functionName = functionName;
		}

		public String getState() {
			return this.state;
		}

		public void setState(String state) {
			this.state = state;
		}

		public String getSwitchId() {
			return this.switchId;
		}

		public void setSwitchId(String switchId) {
			this.switchId = switchId;
		}
	}

	@Override
	public PlayerAuthResponse getInstance(UnmarshallerContext context) {
		return	PlayerAuthResponseUnmarshaller.unmarshall(this, context);
	}
}
