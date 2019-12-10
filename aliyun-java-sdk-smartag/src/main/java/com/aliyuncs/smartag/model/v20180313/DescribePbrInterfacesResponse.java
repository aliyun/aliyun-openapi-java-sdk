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

package com.aliyuncs.smartag.model.v20180313;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.smartag.transform.v20180313.DescribePbrInterfacesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribePbrInterfacesResponse extends AcsResponse {

	private String requestId;

	private Integer totalCount;

	private List<PbrInterface> pbrInterfaces;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public List<PbrInterface> getPbrInterfaces() {
		return this.pbrInterfaces;
	}

	public void setPbrInterfaces(List<PbrInterface> pbrInterfaces) {
		this.pbrInterfaces = pbrInterfaces;
	}

	public static class PbrInterface {

		private String interfaceName;

		private String healthCheckInstanceId;

		private Integer priority;

		private String action;

		public String getInterfaceName() {
			return this.interfaceName;
		}

		public void setInterfaceName(String interfaceName) {
			this.interfaceName = interfaceName;
		}

		public String getHealthCheckInstanceId() {
			return this.healthCheckInstanceId;
		}

		public void setHealthCheckInstanceId(String healthCheckInstanceId) {
			this.healthCheckInstanceId = healthCheckInstanceId;
		}

		public Integer getPriority() {
			return this.priority;
		}

		public void setPriority(Integer priority) {
			this.priority = priority;
		}

		public String getAction() {
			return this.action;
		}

		public void setAction(String action) {
			this.action = action;
		}
	}

	@Override
	public DescribePbrInterfacesResponse getInstance(UnmarshallerContext context) {
		return	DescribePbrInterfacesResponseUnmarshaller.unmarshall(this, context);
	}
}
