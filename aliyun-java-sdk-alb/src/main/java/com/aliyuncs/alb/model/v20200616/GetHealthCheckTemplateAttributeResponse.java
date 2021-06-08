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

package com.aliyuncs.alb.model.v20200616;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.alb.transform.v20200616.GetHealthCheckTemplateAttributeResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetHealthCheckTemplateAttributeResponse extends AcsResponse {

	private Integer healthCheckConnectPort;

	private String healthCheckHost;

	private String healthCheckHttpVersion;

	private String healthCheckTemplateId;

	private Integer healthCheckInterval;

	private String healthCheckMethod;

	private String healthCheckPath;

	private String healthCheckProtocol;

	private String healthCheckTemplateName;

	private Integer healthCheckTimeout;

	private Integer healthyThreshold;

	private String requestId;

	private Integer unhealthyThreshold;

	private List<String> healthCheckCodes;

	public Integer getHealthCheckConnectPort() {
		return this.healthCheckConnectPort;
	}

	public void setHealthCheckConnectPort(Integer healthCheckConnectPort) {
		this.healthCheckConnectPort = healthCheckConnectPort;
	}

	public String getHealthCheckHost() {
		return this.healthCheckHost;
	}

	public void setHealthCheckHost(String healthCheckHost) {
		this.healthCheckHost = healthCheckHost;
	}

	public String getHealthCheckHttpVersion() {
		return this.healthCheckHttpVersion;
	}

	public void setHealthCheckHttpVersion(String healthCheckHttpVersion) {
		this.healthCheckHttpVersion = healthCheckHttpVersion;
	}

	public String getHealthCheckTemplateId() {
		return this.healthCheckTemplateId;
	}

	public void setHealthCheckTemplateId(String healthCheckTemplateId) {
		this.healthCheckTemplateId = healthCheckTemplateId;
	}

	public Integer getHealthCheckInterval() {
		return this.healthCheckInterval;
	}

	public void setHealthCheckInterval(Integer healthCheckInterval) {
		this.healthCheckInterval = healthCheckInterval;
	}

	public String getHealthCheckMethod() {
		return this.healthCheckMethod;
	}

	public void setHealthCheckMethod(String healthCheckMethod) {
		this.healthCheckMethod = healthCheckMethod;
	}

	public String getHealthCheckPath() {
		return this.healthCheckPath;
	}

	public void setHealthCheckPath(String healthCheckPath) {
		this.healthCheckPath = healthCheckPath;
	}

	public String getHealthCheckProtocol() {
		return this.healthCheckProtocol;
	}

	public void setHealthCheckProtocol(String healthCheckProtocol) {
		this.healthCheckProtocol = healthCheckProtocol;
	}

	public String getHealthCheckTemplateName() {
		return this.healthCheckTemplateName;
	}

	public void setHealthCheckTemplateName(String healthCheckTemplateName) {
		this.healthCheckTemplateName = healthCheckTemplateName;
	}

	public Integer getHealthCheckTimeout() {
		return this.healthCheckTimeout;
	}

	public void setHealthCheckTimeout(Integer healthCheckTimeout) {
		this.healthCheckTimeout = healthCheckTimeout;
	}

	public Integer getHealthyThreshold() {
		return this.healthyThreshold;
	}

	public void setHealthyThreshold(Integer healthyThreshold) {
		this.healthyThreshold = healthyThreshold;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getUnhealthyThreshold() {
		return this.unhealthyThreshold;
	}

	public void setUnhealthyThreshold(Integer unhealthyThreshold) {
		this.unhealthyThreshold = unhealthyThreshold;
	}

	public List<String> getHealthCheckCodes() {
		return this.healthCheckCodes;
	}

	public void setHealthCheckCodes(List<String> healthCheckCodes) {
		this.healthCheckCodes = healthCheckCodes;
	}

	@Override
	public GetHealthCheckTemplateAttributeResponse getInstance(UnmarshallerContext context) {
		return	GetHealthCheckTemplateAttributeResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
