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

package com.aliyuncs.sofa.model.v20190815;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.sofa.transform.v20190815.GetAKSHelmRepoChartResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetAKSHelmRepoChartResponse extends AcsResponse {

	private String requestId;

	private String resultCode;

	private String resultMessage;

	private String chartName;

	private String chartVersion;

	private String description;

	private String helmRepoChartTree;

	private String icon;

	private String readme;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getResultCode() {
		return this.resultCode;
	}

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}

	public String getResultMessage() {
		return this.resultMessage;
	}

	public void setResultMessage(String resultMessage) {
		this.resultMessage = resultMessage;
	}

	public String getChartName() {
		return this.chartName;
	}

	public void setChartName(String chartName) {
		this.chartName = chartName;
	}

	public String getChartVersion() {
		return this.chartVersion;
	}

	public void setChartVersion(String chartVersion) {
		this.chartVersion = chartVersion;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getHelmRepoChartTree() {
		return this.helmRepoChartTree;
	}

	public void setHelmRepoChartTree(String helmRepoChartTree) {
		this.helmRepoChartTree = helmRepoChartTree;
	}

	public String getIcon() {
		return this.icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	public String getReadme() {
		return this.readme;
	}

	public void setReadme(String readme) {
		this.readme = readme;
	}

	@Override
	public GetAKSHelmRepoChartResponse getInstance(UnmarshallerContext context) {
		return	GetAKSHelmRepoChartResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
