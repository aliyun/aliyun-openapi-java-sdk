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

package com.aliyuncs.cms.model.v20190101;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.cms.transform.v20190101.PutEventRuleTargetsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class PutEventRuleTargetsResponse extends AcsResponse {

	private Boolean success;

	private String code;

	private String message;

	private String requestId;

	private String failedParameterCount;

	private List<ContactParameter> failedContactParameters;

	private List<MnsParameter> failedMnsParameters;

	private List<FcParameter> failedFcParameters;

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getFailedParameterCount() {
		return this.failedParameterCount;
	}

	public void setFailedParameterCount(String failedParameterCount) {
		this.failedParameterCount = failedParameterCount;
	}

	public List<ContactParameter> getFailedContactParameters() {
		return this.failedContactParameters;
	}

	public void setFailedContactParameters(List<ContactParameter> failedContactParameters) {
		this.failedContactParameters = failedContactParameters;
	}

	public List<MnsParameter> getFailedMnsParameters() {
		return this.failedMnsParameters;
	}

	public void setFailedMnsParameters(List<MnsParameter> failedMnsParameters) {
		this.failedMnsParameters = failedMnsParameters;
	}

	public List<FcParameter> getFailedFcParameters() {
		return this.failedFcParameters;
	}

	public void setFailedFcParameters(List<FcParameter> failedFcParameters) {
		this.failedFcParameters = failedFcParameters;
	}

	public static class ContactParameter {

		private Integer id;

		private String contactGroupName;

		private String level;

		public Integer getId() {
			return this.id;
		}

		public void setId(Integer id) {
			this.id = id;
		}

		public String getContactGroupName() {
			return this.contactGroupName;
		}

		public void setContactGroupName(String contactGroupName) {
			this.contactGroupName = contactGroupName;
		}

		public String getLevel() {
			return this.level;
		}

		public void setLevel(String level) {
			this.level = level;
		}
	}

	public static class MnsParameter {

		private Integer id;

		private String region;

		private String queue;

		public Integer getId() {
			return this.id;
		}

		public void setId(Integer id) {
			this.id = id;
		}

		public String getRegion() {
			return this.region;
		}

		public void setRegion(String region) {
			this.region = region;
		}

		public String getQueue() {
			return this.queue;
		}

		public void setQueue(String queue) {
			this.queue = queue;
		}
	}

	public static class FcParameter {

		private Integer id;

		private String region;

		private String serviceName;

		private String functionName;

		public Integer getId() {
			return this.id;
		}

		public void setId(Integer id) {
			this.id = id;
		}

		public String getRegion() {
			return this.region;
		}

		public void setRegion(String region) {
			this.region = region;
		}

		public String getServiceName() {
			return this.serviceName;
		}

		public void setServiceName(String serviceName) {
			this.serviceName = serviceName;
		}

		public String getFunctionName() {
			return this.functionName;
		}

		public void setFunctionName(String functionName) {
			this.functionName = functionName;
		}
	}

	@Override
	public PutEventRuleTargetsResponse getInstance(UnmarshallerContext context) {
		return	PutEventRuleTargetsResponseUnmarshaller.unmarshall(this, context);
	}
}
