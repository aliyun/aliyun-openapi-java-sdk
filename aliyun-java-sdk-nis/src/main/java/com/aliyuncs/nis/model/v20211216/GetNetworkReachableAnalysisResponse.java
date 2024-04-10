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
import com.aliyuncs.nis.transform.v20211216.GetNetworkReachableAnalysisResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetNetworkReachableAnalysisResponse extends AcsResponse {

	private String networkPathId;

	private String networkReachableAnalysisId;

	private String networkReachableAnalysisStatus;

	private String networkReachableAnalysisResult;

	private Boolean reachable;

	private String createTime;

	private Long aliUid;

	private String requestId;

	private String networkPathParameter;

	public String getNetworkPathId() {
		return this.networkPathId;
	}

	public void setNetworkPathId(String networkPathId) {
		this.networkPathId = networkPathId;
	}

	public String getNetworkReachableAnalysisId() {
		return this.networkReachableAnalysisId;
	}

	public void setNetworkReachableAnalysisId(String networkReachableAnalysisId) {
		this.networkReachableAnalysisId = networkReachableAnalysisId;
	}

	public String getNetworkReachableAnalysisStatus() {
		return this.networkReachableAnalysisStatus;
	}

	public void setNetworkReachableAnalysisStatus(String networkReachableAnalysisStatus) {
		this.networkReachableAnalysisStatus = networkReachableAnalysisStatus;
	}

	public String getNetworkReachableAnalysisResult() {
		return this.networkReachableAnalysisResult;
	}

	public void setNetworkReachableAnalysisResult(String networkReachableAnalysisResult) {
		this.networkReachableAnalysisResult = networkReachableAnalysisResult;
	}

	public Boolean getReachable() {
		return this.reachable;
	}

	public void setReachable(Boolean reachable) {
		this.reachable = reachable;
	}

	public String getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public Long getAliUid() {
		return this.aliUid;
	}

	public void setAliUid(Long aliUid) {
		this.aliUid = aliUid;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getNetworkPathParameter() {
		return this.networkPathParameter;
	}

	public void setNetworkPathParameter(String networkPathParameter) {
		this.networkPathParameter = networkPathParameter;
	}

	@Override
	public GetNetworkReachableAnalysisResponse getInstance(UnmarshallerContext context) {
		return	GetNetworkReachableAnalysisResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
