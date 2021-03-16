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

package com.aliyuncs.ecsops.model.v20160401;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecsops.transform.v20160401.OpsCreateChangeGuestOSDiagnoseResultResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class OpsCreateChangeGuestOSDiagnoseResultResponse extends AcsResponse {

	private String requestId;

	private List<GuestOSDiagnoseResult> data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<GuestOSDiagnoseResult> getData() {
		return this.data;
	}

	public void setData(List<GuestOSDiagnoseResult> data) {
		this.data = data;
	}

	public static class GuestOSDiagnoseResult {

		private String status;

		private String name;

		private String parameters;

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getParameters() {
			return this.parameters;
		}

		public void setParameters(String parameters) {
			this.parameters = parameters;
		}
	}

	@Override
	public OpsCreateChangeGuestOSDiagnoseResultResponse getInstance(UnmarshallerContext context) {
		return	OpsCreateChangeGuestOSDiagnoseResultResponseUnmarshaller.unmarshall(this, context);
	}
}
