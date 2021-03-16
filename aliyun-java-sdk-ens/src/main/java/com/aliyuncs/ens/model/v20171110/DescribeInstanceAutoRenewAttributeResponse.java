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

package com.aliyuncs.ens.model.v20171110;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ens.transform.v20171110.DescribeInstanceAutoRenewAttributeResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeInstanceAutoRenewAttributeResponse extends AcsResponse {

	private String requestId;

	private Integer code;

	private List<InstanceRenewAttribute> instanceRenewAttributes;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getCode() {
		return this.code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public List<InstanceRenewAttribute> getInstanceRenewAttributes() {
		return this.instanceRenewAttributes;
	}

	public void setInstanceRenewAttributes(List<InstanceRenewAttribute> instanceRenewAttributes) {
		this.instanceRenewAttributes = instanceRenewAttributes;
	}

	public static class InstanceRenewAttribute {

		private Boolean autoRenewal;

		private String instanceId;

		private String duration;

		public Boolean getAutoRenewal() {
			return this.autoRenewal;
		}

		public void setAutoRenewal(Boolean autoRenewal) {
			this.autoRenewal = autoRenewal;
		}

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public String getDuration() {
			return this.duration;
		}

		public void setDuration(String duration) {
			this.duration = duration;
		}
	}

	@Override
	public DescribeInstanceAutoRenewAttributeResponse getInstance(UnmarshallerContext context) {
		return	DescribeInstanceAutoRenewAttributeResponseUnmarshaller.unmarshall(this, context);
	}
}
