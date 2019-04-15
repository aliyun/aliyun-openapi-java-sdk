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

package com.aliyuncs.aegis.model.v20161111;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.aegis.transform.v20161111.OperateAgentClientInstallResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class OperateAgentClientInstallResponse extends AcsResponse {

	private String requestId;

	private List<AegisCelintInstallRespose> aegisCelintInstallResposeList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<AegisCelintInstallRespose> getAegisCelintInstallResposeList() {
		return this.aegisCelintInstallResposeList;
	}

	public void setAegisCelintInstallResposeList(List<AegisCelintInstallRespose> aegisCelintInstallResposeList) {
		this.aegisCelintInstallResposeList = aegisCelintInstallResposeList;
	}

	public static class AegisCelintInstallRespose {

		private String instanceId;

		private Long recordId;

		private String uuid;

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public Long getRecordId() {
			return this.recordId;
		}

		public void setRecordId(Long recordId) {
			this.recordId = recordId;
		}

		public String getUuid() {
			return this.uuid;
		}

		public void setUuid(String uuid) {
			this.uuid = uuid;
		}
	}

	@Override
	public OperateAgentClientInstallResponse getInstance(UnmarshallerContext context) {
		return	OperateAgentClientInstallResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
