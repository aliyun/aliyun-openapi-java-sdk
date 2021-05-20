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

package com.aliyuncs.smartag.model.v20180313;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.smartag.transform.v20180313.GetSmartAGDpiAttributeResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetSmartAGDpiAttributeResponse extends AcsResponse {

	private String logstoreName;

	private String requestId;

	private String projectName;

	private String slsRegion;

	private String dpiMonitorStatus;

	private String dpiStatus;

	public String getLogstoreName() {
		return this.logstoreName;
	}

	public void setLogstoreName(String logstoreName) {
		this.logstoreName = logstoreName;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getProjectName() {
		return this.projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public String getSlsRegion() {
		return this.slsRegion;
	}

	public void setSlsRegion(String slsRegion) {
		this.slsRegion = slsRegion;
	}

	public String getDpiMonitorStatus() {
		return this.dpiMonitorStatus;
	}

	public void setDpiMonitorStatus(String dpiMonitorStatus) {
		this.dpiMonitorStatus = dpiMonitorStatus;
	}

	public String getDpiStatus() {
		return this.dpiStatus;
	}

	public void setDpiStatus(String dpiStatus) {
		this.dpiStatus = dpiStatus;
	}

	@Override
	public GetSmartAGDpiAttributeResponse getInstance(UnmarshallerContext context) {
		return	GetSmartAGDpiAttributeResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
