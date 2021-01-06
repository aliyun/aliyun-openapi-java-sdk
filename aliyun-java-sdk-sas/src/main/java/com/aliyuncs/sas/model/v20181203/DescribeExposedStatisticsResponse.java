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

package com.aliyuncs.sas.model.v20181203;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.sas.transform.v20181203.DescribeExposedStatisticsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeExposedStatisticsResponse extends AcsResponse {

	private String requestId;

	private Integer exposedInstanceCount;

	private Integer gatewayAssetCount;

	private Integer exposedIpCount;

	private Integer exposedPortCount;

	private Integer exposedComponentCount;

	private Integer exposedAsapVulCount;

	private Integer exposedLaterVulCount;

	private Integer exposedNntfVulCount;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getExposedInstanceCount() {
		return this.exposedInstanceCount;
	}

	public void setExposedInstanceCount(Integer exposedInstanceCount) {
		this.exposedInstanceCount = exposedInstanceCount;
	}

	public Integer getGatewayAssetCount() {
		return this.gatewayAssetCount;
	}

	public void setGatewayAssetCount(Integer gatewayAssetCount) {
		this.gatewayAssetCount = gatewayAssetCount;
	}

	public Integer getExposedIpCount() {
		return this.exposedIpCount;
	}

	public void setExposedIpCount(Integer exposedIpCount) {
		this.exposedIpCount = exposedIpCount;
	}

	public Integer getExposedPortCount() {
		return this.exposedPortCount;
	}

	public void setExposedPortCount(Integer exposedPortCount) {
		this.exposedPortCount = exposedPortCount;
	}

	public Integer getExposedComponentCount() {
		return this.exposedComponentCount;
	}

	public void setExposedComponentCount(Integer exposedComponentCount) {
		this.exposedComponentCount = exposedComponentCount;
	}

	public Integer getExposedAsapVulCount() {
		return this.exposedAsapVulCount;
	}

	public void setExposedAsapVulCount(Integer exposedAsapVulCount) {
		this.exposedAsapVulCount = exposedAsapVulCount;
	}

	public Integer getExposedLaterVulCount() {
		return this.exposedLaterVulCount;
	}

	public void setExposedLaterVulCount(Integer exposedLaterVulCount) {
		this.exposedLaterVulCount = exposedLaterVulCount;
	}

	public Integer getExposedNntfVulCount() {
		return this.exposedNntfVulCount;
	}

	public void setExposedNntfVulCount(Integer exposedNntfVulCount) {
		this.exposedNntfVulCount = exposedNntfVulCount;
	}

	@Override
	public DescribeExposedStatisticsResponse getInstance(UnmarshallerContext context) {
		return	DescribeExposedStatisticsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
