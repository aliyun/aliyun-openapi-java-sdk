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
import com.aliyuncs.cms.transform.v20190101.DescribeEventRuleTargetListResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeEventRuleTargetListResponse extends AcsResponse {

	private String code;

	private String message;

	private String requestId;

	private List<ContactParameter> contactParameters;

	private List<FCParameter> fcParameters;

	private List<MnsParameter> mnsParameters;

	private List<WebhookParameter> webhookParameters;

	private List<SlsParameter> slsParameters;

	private List<OpenApiParametersItem> openApiParameters;

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

	public List<WebhookParameter> getWebhookParameters() {
		return this.webhookParameters;
	}

	public void setWebhookParameters(List<WebhookParameter> webhookParameters) {
		this.webhookParameters = webhookParameters;
	}

	public List<SlsParameter> getSlsParameters() {
		return this.slsParameters;
	}

	public void setSlsParameters(List<SlsParameter> slsParameters) {
		this.slsParameters = slsParameters;
	}

	public List<OpenApiParametersItem> getOpenApiParameters() {
		return this.openApiParameters;
	}

	public void setOpenApiParameters(List<OpenApiParametersItem> openApiParameters) {
		this.openApiParameters = openApiParameters;
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

		private String serviceName;

		private String functionName;

		private String arn;

		private String id;

		private String region;

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

		public String getArn() {
			return this.arn;
		}

		public void setArn(String arn) {
			this.arn = arn;
		}

		public String getId() {
			return this.id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getRegion() {
			return this.region;
		}

		public void setRegion(String region) {
			this.region = region;
		}
	}

	public static class MnsParameter {

		private String queue;

		private String arn;

		private String region;

		private String id;

		private String topic;

		public String getQueue() {
			return this.queue;
		}

		public void setQueue(String queue) {
			this.queue = queue;
		}

		public String getArn() {
			return this.arn;
		}

		public void setArn(String arn) {
			this.arn = arn;
		}

		public String getRegion() {
			return this.region;
		}

		public void setRegion(String region) {
			this.region = region;
		}

		public String getId() {
			return this.id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getTopic() {
			return this.topic;
		}

		public void setTopic(String topic) {
			this.topic = topic;
		}
	}

	public static class WebhookParameter {

		private String url;

		private String method;

		private String protocol;

		private String id;

		public String getUrl() {
			return this.url;
		}

		public void setUrl(String url) {
			this.url = url;
		}

		public String getBizMethod() {
			return this.method;
		}

		public void setBizMethod(String method) {
			this.method = method;
		}

		public String getBizProtocol() {
			return this.protocol;
		}

		public void setBizProtocol(String protocol) {
			this.protocol = protocol;
		}

		public String getId() {
			return this.id;
		}

		public void setId(String id) {
			this.id = id;
		}
	}

	public static class SlsParameter {

		private String project;

		private String logStore;

		private String arn;

		private String region;

		private String id;

		public String getProject() {
			return this.project;
		}

		public void setProject(String project) {
			this.project = project;
		}

		public String getLogStore() {
			return this.logStore;
		}

		public void setLogStore(String logStore) {
			this.logStore = logStore;
		}

		public String getArn() {
			return this.arn;
		}

		public void setArn(String arn) {
			this.arn = arn;
		}

		public String getRegion() {
			return this.region;
		}

		public void setRegion(String region) {
			this.region = region;
		}

		public String getId() {
			return this.id;
		}

		public void setId(String id) {
			this.id = id;
		}
	}

	public static class OpenApiParametersItem {

		private String action;

		private String arn;

		private String id;

		private String product;

		private String region;

		private String role;

		private String version;

		private String jsonParams;

		public String getAction() {
			return this.action;
		}

		public void setAction(String action) {
			this.action = action;
		}

		public String getArn() {
			return this.arn;
		}

		public void setArn(String arn) {
			this.arn = arn;
		}

		public String getId() {
			return this.id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getProduct() {
			return this.product;
		}

		public void setProduct(String product) {
			this.product = product;
		}

		public String getRegion() {
			return this.region;
		}

		public void setRegion(String region) {
			this.region = region;
		}

		public String getRole() {
			return this.role;
		}

		public void setRole(String role) {
			this.role = role;
		}

		public String getVersion() {
			return this.version;
		}

		public void setVersion(String version) {
			this.version = version;
		}

		public String getJsonParams() {
			return this.jsonParams;
		}

		public void setJsonParams(String jsonParams) {
			this.jsonParams = jsonParams;
		}
	}

	@Override
	public DescribeEventRuleTargetListResponse getInstance(UnmarshallerContext context) {
		return	DescribeEventRuleTargetListResponseUnmarshaller.unmarshall(this, context);
	}
}
