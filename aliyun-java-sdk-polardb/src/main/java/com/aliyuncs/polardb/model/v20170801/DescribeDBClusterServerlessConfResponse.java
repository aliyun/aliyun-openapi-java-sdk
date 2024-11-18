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

package com.aliyuncs.polardb.model.v20170801;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.polardb.transform.v20170801.DescribeDBClusterServerlessConfResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDBClusterServerlessConfResponse extends AcsResponse {

	private String requestId;

	private String scaleMin;

	private String scaleMax;

	private String scaleRoNumMin;

	private String scaleRoNumMax;

	private String allowShutDown;

	private String secondsUntilAutoPause;

	private String dBClusterId;

	private String scaleApRoNumMin;

	private String scaleApRoNumMax;

	private String switchs;

	private String dBMaxscaleId;

	private String serverlessRuleMode;

	private String serverlessRuleCpuEnlargeThreshold;

	private String serverlessRuleCpuShrinkThreshold;

	private String traditionalScaleMaxThreshold;

	private String agileScaleMax;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getScaleMin() {
		return this.scaleMin;
	}

	public void setScaleMin(String scaleMin) {
		this.scaleMin = scaleMin;
	}

	public String getScaleMax() {
		return this.scaleMax;
	}

	public void setScaleMax(String scaleMax) {
		this.scaleMax = scaleMax;
	}

	public String getScaleRoNumMin() {
		return this.scaleRoNumMin;
	}

	public void setScaleRoNumMin(String scaleRoNumMin) {
		this.scaleRoNumMin = scaleRoNumMin;
	}

	public String getScaleRoNumMax() {
		return this.scaleRoNumMax;
	}

	public void setScaleRoNumMax(String scaleRoNumMax) {
		this.scaleRoNumMax = scaleRoNumMax;
	}

	public String getAllowShutDown() {
		return this.allowShutDown;
	}

	public void setAllowShutDown(String allowShutDown) {
		this.allowShutDown = allowShutDown;
	}

	public String getSecondsUntilAutoPause() {
		return this.secondsUntilAutoPause;
	}

	public void setSecondsUntilAutoPause(String secondsUntilAutoPause) {
		this.secondsUntilAutoPause = secondsUntilAutoPause;
	}

	public String getDBClusterId() {
		return this.dBClusterId;
	}

	public void setDBClusterId(String dBClusterId) {
		this.dBClusterId = dBClusterId;
	}

	public String getScaleApRoNumMin() {
		return this.scaleApRoNumMin;
	}

	public void setScaleApRoNumMin(String scaleApRoNumMin) {
		this.scaleApRoNumMin = scaleApRoNumMin;
	}

	public String getScaleApRoNumMax() {
		return this.scaleApRoNumMax;
	}

	public void setScaleApRoNumMax(String scaleApRoNumMax) {
		this.scaleApRoNumMax = scaleApRoNumMax;
	}

	public String getSwitchs() {
		return this.switchs;
	}

	public void setSwitchs(String switchs) {
		this.switchs = switchs;
	}

	public String getDBMaxscaleId() {
		return this.dBMaxscaleId;
	}

	public void setDBMaxscaleId(String dBMaxscaleId) {
		this.dBMaxscaleId = dBMaxscaleId;
	}

	public String getServerlessRuleMode() {
		return this.serverlessRuleMode;
	}

	public void setServerlessRuleMode(String serverlessRuleMode) {
		this.serverlessRuleMode = serverlessRuleMode;
	}

	public String getServerlessRuleCpuEnlargeThreshold() {
		return this.serverlessRuleCpuEnlargeThreshold;
	}

	public void setServerlessRuleCpuEnlargeThreshold(String serverlessRuleCpuEnlargeThreshold) {
		this.serverlessRuleCpuEnlargeThreshold = serverlessRuleCpuEnlargeThreshold;
	}

	public String getServerlessRuleCpuShrinkThreshold() {
		return this.serverlessRuleCpuShrinkThreshold;
	}

	public void setServerlessRuleCpuShrinkThreshold(String serverlessRuleCpuShrinkThreshold) {
		this.serverlessRuleCpuShrinkThreshold = serverlessRuleCpuShrinkThreshold;
	}

	public String getTraditionalScaleMaxThreshold() {
		return this.traditionalScaleMaxThreshold;
	}

	public void setTraditionalScaleMaxThreshold(String traditionalScaleMaxThreshold) {
		this.traditionalScaleMaxThreshold = traditionalScaleMaxThreshold;
	}

	public String getAgileScaleMax() {
		return this.agileScaleMax;
	}

	public void setAgileScaleMax(String agileScaleMax) {
		this.agileScaleMax = agileScaleMax;
	}

	@Override
	public DescribeDBClusterServerlessConfResponse getInstance(UnmarshallerContext context) {
		return	DescribeDBClusterServerlessConfResponseUnmarshaller.unmarshall(this, context);
	}
}
