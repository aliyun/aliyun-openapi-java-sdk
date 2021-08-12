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

package com.aliyuncs.dms_enterprise.model.v20181101;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.dms_enterprise.transform.v20181101.GetProxyResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetProxyResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String errorMessage;

	private String errorCode;

	private Long proxyId;

	private Long creatorId;

	private String creatorName;

	private Long instanceId;

	private Boolean privateEnable;

	private String privateHost;

	private Boolean publicEnable;

	private String publicHost;

	private Integer mysqlPort;

	private Integer httpsPort;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getErrorMessage() {
		return this.errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public String getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public Long getProxyId() {
		return this.proxyId;
	}

	public void setProxyId(Long proxyId) {
		this.proxyId = proxyId;
	}

	public Long getCreatorId() {
		return this.creatorId;
	}

	public void setCreatorId(Long creatorId) {
		this.creatorId = creatorId;
	}

	public String getCreatorName() {
		return this.creatorName;
	}

	public void setCreatorName(String creatorName) {
		this.creatorName = creatorName;
	}

	public Long getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(Long instanceId) {
		this.instanceId = instanceId;
	}

	public Boolean getPrivateEnable() {
		return this.privateEnable;
	}

	public void setPrivateEnable(Boolean privateEnable) {
		this.privateEnable = privateEnable;
	}

	public String getPrivateHost() {
		return this.privateHost;
	}

	public void setPrivateHost(String privateHost) {
		this.privateHost = privateHost;
	}

	public Boolean getPublicEnable() {
		return this.publicEnable;
	}

	public void setPublicEnable(Boolean publicEnable) {
		this.publicEnable = publicEnable;
	}

	public String getPublicHost() {
		return this.publicHost;
	}

	public void setPublicHost(String publicHost) {
		this.publicHost = publicHost;
	}

	public Integer getMysqlPort() {
		return this.mysqlPort;
	}

	public void setMysqlPort(Integer mysqlPort) {
		this.mysqlPort = mysqlPort;
	}

	public Integer getHttpsPort() {
		return this.httpsPort;
	}

	public void setHttpsPort(Integer httpsPort) {
		this.httpsPort = httpsPort;
	}

	@Override
	public GetProxyResponse getInstance(UnmarshallerContext context) {
		return	GetProxyResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
