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
import com.aliyuncs.ecsops.transform.v20160401.OpsShowVportsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class OpsShowVportsResponse extends AcsResponse {

	private String requestId;

	private List<ShowVportModel> showVportModels;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<ShowVportModel> getShowVportModels() {
		return this.showVportModels;
	}

	public void setShowVportModels(List<ShowVportModel> showVportModels) {
		this.showVportModels = showVportModels;
	}

	public static class ShowVportModel {

		private String errorMessage;

		private String vportStatus;

		private String eniNetworkType;

		private String code;

		private String vportName;

		private String instanceId;

		private String eniStatus;

		private String eniId;

		private String eniType;

		public String getErrorMessage() {
			return this.errorMessage;
		}

		public void setErrorMessage(String errorMessage) {
			this.errorMessage = errorMessage;
		}

		public String getVportStatus() {
			return this.vportStatus;
		}

		public void setVportStatus(String vportStatus) {
			this.vportStatus = vportStatus;
		}

		public String getEniNetworkType() {
			return this.eniNetworkType;
		}

		public void setEniNetworkType(String eniNetworkType) {
			this.eniNetworkType = eniNetworkType;
		}

		public String getCode() {
			return this.code;
		}

		public void setCode(String code) {
			this.code = code;
		}

		public String getVportName() {
			return this.vportName;
		}

		public void setVportName(String vportName) {
			this.vportName = vportName;
		}

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public String getEniStatus() {
			return this.eniStatus;
		}

		public void setEniStatus(String eniStatus) {
			this.eniStatus = eniStatus;
		}

		public String getEniId() {
			return this.eniId;
		}

		public void setEniId(String eniId) {
			this.eniId = eniId;
		}

		public String getEniType() {
			return this.eniType;
		}

		public void setEniType(String eniType) {
			this.eniType = eniType;
		}
	}

	@Override
	public OpsShowVportsResponse getInstance(UnmarshallerContext context) {
		return	OpsShowVportsResponseUnmarshaller.unmarshall(this, context);
	}
}
