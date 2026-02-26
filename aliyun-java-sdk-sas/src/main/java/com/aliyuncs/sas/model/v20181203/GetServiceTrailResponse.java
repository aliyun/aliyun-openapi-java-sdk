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

package com.aliyuncs.sas.model.v20181203;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.sas.transform.v20181203.GetServiceTrailResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetServiceTrailResponse extends AcsResponse {

	private String requestId;

	private ServiceTrail serviceTrail;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public ServiceTrail getServiceTrail() {
		return this.serviceTrail;
	}

	public void setServiceTrail(ServiceTrail serviceTrail) {
		this.serviceTrail = serviceTrail;
	}

	public static class ServiceTrail {

		private String config;

		private Long createTime;

		private Long updateTime;

		public String getConfig() {
			return this.config;
		}

		public void setConfig(String config) {
			this.config = config;
		}

		public Long getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(Long createTime) {
			this.createTime = createTime;
		}

		public Long getUpdateTime() {
			return this.updateTime;
		}

		public void setUpdateTime(Long updateTime) {
			this.updateTime = updateTime;
		}
	}

	@Override
	public GetServiceTrailResponse getInstance(UnmarshallerContext context) {
		return	GetServiceTrailResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
