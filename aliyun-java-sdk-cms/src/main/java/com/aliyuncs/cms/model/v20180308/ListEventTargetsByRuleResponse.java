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

package com.aliyuncs.cms.model.v20180308;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.cms.transform.v20180308.ListEventTargetsByRuleResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListEventTargetsByRuleResponse extends AcsResponse {

	private String code;

	private String message;

	private String requestId;

	private Integer parameterCount;

	private List<ContactParameter> contactParameters;

	private List<FCParameter> fcParameters;

	private List<MnsParameter> mnsParameters;

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

	public Integer getParameterCount() {
		return this.parameterCount;
	}

	public void setParameterCount(Integer parameterCount) {
		this.parameterCount = parameterCount;
	}

	public List<ContactParameter> getContactParameters() {
		return this.contactParameters;
	}

	public void setContactParameters(List<ContactParameter> contactParameters) {
		this.contactParameters = contactParameters;
	}

	public List<FCParameter> getFcParameters() {
		return this.fcParameters;
	}

	public void setFcParameters(List<FCParameter> fcParameters) {
		this.fcParameters = fcParameters;
	}

	public List<MnsParameter> getMnsParameters() {
		return this.mnsParameters;
	}

	public void setMnsParameters(List<MnsParameter> mnsParameters) {
		this.mnsParameters = mnsParameters;
	}

	public static class ContactParameter {

		private String contactGroupName;

		private String level;

		private String id;

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

		public String getId() {
			return this.id;
		}

		public void setId(String id) {
			this.id = id;
		}
	}

	public static class FCParameter {

		private String region;

		private String serviceName;

		private String functionName;

		private String id;

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

		public String getId() {
			return this.id;
		}

		public void setId(String id) {
			this.id = id;
		}
	}

	public static class MnsParameter {

		private String region;

		private String queue;

		private String id;

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

		public String getId() {
			return this.id;
		}

		public void setId(String id) {
			this.id = id;
		}
	}

	@Override
	public ListEventTargetsByRuleResponse getInstance(UnmarshallerContext context) {
		return	ListEventTargetsByRuleResponseUnmarshaller.unmarshall(this, context);
	}
}
