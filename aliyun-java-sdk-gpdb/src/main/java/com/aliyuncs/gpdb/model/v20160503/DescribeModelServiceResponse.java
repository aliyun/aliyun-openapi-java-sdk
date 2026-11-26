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

package com.aliyuncs.gpdb.model.v20160503;

import java.util.List;
import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.gpdb.transform.v20160503.DescribeModelServiceResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeModelServiceResponse extends AcsResponse {

	private String status;

	private String publicConnectUrl;

	private String privateConnectUrl;

	private String modelName;

	private String apiKey;

	private String description;

	private String requestId;

	private String securityIpList;

	private String createTime;

	private String modelServiceId;

	private Map<Object,Object> modelParams;

	private List<String> aiNodes;

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getPublicConnectUrl() {
		return this.publicConnectUrl;
	}

	public void setPublicConnectUrl(String publicConnectUrl) {
		this.publicConnectUrl = publicConnectUrl;
	}

	public String getPrivateConnectUrl() {
		return this.privateConnectUrl;
	}

	public void setPrivateConnectUrl(String privateConnectUrl) {
		this.privateConnectUrl = privateConnectUrl;
	}

	public String getModelName() {
		return this.modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public String getApiKey() {
		return this.apiKey;
	}

	public void setApiKey(String apiKey) {
		this.apiKey = apiKey;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getSecurityIpList() {
		return this.securityIpList;
	}

	public void setSecurityIpList(String securityIpList) {
		this.securityIpList = securityIpList;
	}

	public String getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public String getModelServiceId() {
		return this.modelServiceId;
	}

	public void setModelServiceId(String modelServiceId) {
		this.modelServiceId = modelServiceId;
	}

	public Map<Object,Object> getModelParams() {
		return this.modelParams;
	}

	public void setModelParams(Map<Object,Object> modelParams) {
		this.modelParams = modelParams;
	}

	public List<String> getAiNodes() {
		return this.aiNodes;
	}

	public void setAiNodes(List<String> aiNodes) {
		this.aiNodes = aiNodes;
	}

	@Override
	public DescribeModelServiceResponse getInstance(UnmarshallerContext context) {
		return	DescribeModelServiceResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
