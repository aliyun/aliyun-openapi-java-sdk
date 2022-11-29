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

package com.aliyuncs.cas.model.v20200630;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.cas.transform.v20200630.GetCAInstanceStatusResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetCAInstanceStatusResponse extends AcsResponse {

	private String requestId;

	private List<InstanceStatus> instanceStatusList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<InstanceStatus> getInstanceStatusList() {
		return this.instanceStatusList;
	}

	public void setInstanceStatusList(List<InstanceStatus> instanceStatusList) {
		this.instanceStatusList = instanceStatusList;
	}

	public static class InstanceStatus {

		private Integer certTotalCount;

		private String status;

		private String type;

		private Integer certIssuedCount;

		private Long beforeTime;

		private String identifier;

		private Long afterTime;

		private String instanceId;

		private Long useExpireTime;

		public Integer getCertTotalCount() {
			return this.certTotalCount;
		}

		public void setCertTotalCount(Integer certTotalCount) {
			this.certTotalCount = certTotalCount;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public Integer getCertIssuedCount() {
			return this.certIssuedCount;
		}

		public void setCertIssuedCount(Integer certIssuedCount) {
			this.certIssuedCount = certIssuedCount;
		}

		public Long getBeforeTime() {
			return this.beforeTime;
		}

		public void setBeforeTime(Long beforeTime) {
			this.beforeTime = beforeTime;
		}

		public String getIdentifier() {
			return this.identifier;
		}

		public void setIdentifier(String identifier) {
			this.identifier = identifier;
		}

		public Long getAfterTime() {
			return this.afterTime;
		}

		public void setAfterTime(Long afterTime) {
			this.afterTime = afterTime;
		}

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public Long getUseExpireTime() {
			return this.useExpireTime;
		}

		public void setUseExpireTime(Long useExpireTime) {
			this.useExpireTime = useExpireTime;
		}
	}

	@Override
	public GetCAInstanceStatusResponse getInstance(UnmarshallerContext context) {
		return	GetCAInstanceStatusResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
