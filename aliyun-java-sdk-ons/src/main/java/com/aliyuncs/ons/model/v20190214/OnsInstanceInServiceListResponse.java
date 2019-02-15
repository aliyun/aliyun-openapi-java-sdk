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

package com.aliyuncs.ons.model.v20190214;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ons.transform.v20190214.OnsInstanceInServiceListResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class OnsInstanceInServiceListResponse extends AcsResponse {

	private String requestId;

	private String helpUrl;

	private List<InstanceVO> data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getHelpUrl() {
		return this.helpUrl;
	}

	public void setHelpUrl(String helpUrl) {
		this.helpUrl = helpUrl;
	}

	public List<InstanceVO> getData() {
		return this.data;
	}

	public void setData(List<InstanceVO> data) {
		this.data = data;
	}

	public static class InstanceVO {

		private String instanceId;

		private Integer instanceStatus;

		private Long releaseTime;

		private Integer instanceType;

		private String instanceName;

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public Integer getInstanceStatus() {
			return this.instanceStatus;
		}

		public void setInstanceStatus(Integer instanceStatus) {
			this.instanceStatus = instanceStatus;
		}

		public Long getReleaseTime() {
			return this.releaseTime;
		}

		public void setReleaseTime(Long releaseTime) {
			this.releaseTime = releaseTime;
		}

		public Integer getInstanceType() {
			return this.instanceType;
		}

		public void setInstanceType(Integer instanceType) {
			this.instanceType = instanceType;
		}

		public String getInstanceName() {
			return this.instanceName;
		}

		public void setInstanceName(String instanceName) {
			this.instanceName = instanceName;
		}
	}

	@Override
	public OnsInstanceInServiceListResponse getInstance(UnmarshallerContext context) {
		return	OnsInstanceInServiceListResponseUnmarshaller.unmarshall(this, context);
	}
}
