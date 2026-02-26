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

package com.aliyuncs.nis.model.v20211216;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.nis.transform.v20211216.CreateAndAnalyzeNetworkPathResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class CreateAndAnalyzeNetworkPathResponse extends AcsResponse {

	private String requestId;

	private String networkReachableAnalysisId;

	private String sourceId;

	private String targetId;

	private String sourceType;

	private String targetType;

	private String sourcePort;

	private String targetPort;

	private String protocol;

	private String sourceIpAddress;

	private String targetIpAddress;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getNetworkReachableAnalysisId() {
		return this.networkReachableAnalysisId;
	}

	public void setNetworkReachableAnalysisId(String networkReachableAnalysisId) {
		this.networkReachableAnalysisId = networkReachableAnalysisId;
	}

	public String getSourceId() {
		return this.sourceId;
	}

	public void setSourceId(String sourceId) {
		this.sourceId = sourceId;
	}

	public String getTargetId() {
		return this.targetId;
	}

	public void setTargetId(String targetId) {
		this.targetId = targetId;
	}

	public String getSourceType() {
		return this.sourceType;
	}

	public void setSourceType(String sourceType) {
		this.sourceType = sourceType;
	}

	public String getTargetType() {
		return this.targetType;
	}

	public void setTargetType(String targetType) {
		this.targetType = targetType;
	}

	public String getSourcePort() {
		return this.sourcePort;
	}

	public void setSourcePort(String sourcePort) {
		this.sourcePort = sourcePort;
	}

	public String getTargetPort() {
		return this.targetPort;
	}

	public void setTargetPort(String targetPort) {
		this.targetPort = targetPort;
	}

	public String getBizProtocol() {
		return this.protocol;
	}

	public void setBizProtocol(String protocol) {
		this.protocol = protocol;
	}

	public String getSourceIpAddress() {
		return this.sourceIpAddress;
	}

	public void setSourceIpAddress(String sourceIpAddress) {
		this.sourceIpAddress = sourceIpAddress;
	}

	public String getTargetIpAddress() {
		return this.targetIpAddress;
	}

	public void setTargetIpAddress(String targetIpAddress) {
		this.targetIpAddress = targetIpAddress;
	}

	@Override
	public CreateAndAnalyzeNetworkPathResponse getInstance(UnmarshallerContext context) {
		return	CreateAndAnalyzeNetworkPathResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
