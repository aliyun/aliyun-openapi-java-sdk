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

package com.aliyuncs.alidns.model.v20150109;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.alidns.transform.v20150109.DescribeGtmMonitorConfigResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeGtmMonitorConfigResponse extends AcsResponse {

	private String requestId;

	private Integer timeout;

	private String protocolType;

	private String createTime;

	private String updateTime;

	private Integer evaluationCount;

	private Long updateTimestamp;

	private String monitorExtendInfo;

	private String monitorConfigId;

	private Long createTimestamp;

	private Integer interval;

	private List<IspCityNode> ispCityNodes;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getTimeout() {
		return this.timeout;
	}

	public void setTimeout(Integer timeout) {
		this.timeout = timeout;
	}

	public String getProtocolType() {
		return this.protocolType;
	}

	public void setProtocolType(String protocolType) {
		this.protocolType = protocolType;
	}

	public String getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public String getUpdateTime() {
		return this.updateTime;
	}

	public void setUpdateTime(String updateTime) {
		this.updateTime = updateTime;
	}

	public Integer getEvaluationCount() {
		return this.evaluationCount;
	}

	public void setEvaluationCount(Integer evaluationCount) {
		this.evaluationCount = evaluationCount;
	}

	public Long getUpdateTimestamp() {
		return this.updateTimestamp;
	}

	public void setUpdateTimestamp(Long updateTimestamp) {
		this.updateTimestamp = updateTimestamp;
	}

	public String getMonitorExtendInfo() {
		return this.monitorExtendInfo;
	}

	public void setMonitorExtendInfo(String monitorExtendInfo) {
		this.monitorExtendInfo = monitorExtendInfo;
	}

	public String getMonitorConfigId() {
		return this.monitorConfigId;
	}

	public void setMonitorConfigId(String monitorConfigId) {
		this.monitorConfigId = monitorConfigId;
	}

	public Long getCreateTimestamp() {
		return this.createTimestamp;
	}

	public void setCreateTimestamp(Long createTimestamp) {
		this.createTimestamp = createTimestamp;
	}

	public Integer getInterval() {
		return this.interval;
	}

	public void setInterval(Integer interval) {
		this.interval = interval;
	}

	public List<IspCityNode> getIspCityNodes() {
		return this.ispCityNodes;
	}

	public void setIspCityNodes(List<IspCityNode> ispCityNodes) {
		this.ispCityNodes = ispCityNodes;
	}

	public static class IspCityNode {

		private String cityCode;

		private String countryName;

		private String ispCode;

		private String cityName;

		private String countryCode;

		private String ispName;

		public String getCityCode() {
			return this.cityCode;
		}

		public void setCityCode(String cityCode) {
			this.cityCode = cityCode;
		}

		public String getCountryName() {
			return this.countryName;
		}

		public void setCountryName(String countryName) {
			this.countryName = countryName;
		}

		public String getIspCode() {
			return this.ispCode;
		}

		public void setIspCode(String ispCode) {
			this.ispCode = ispCode;
		}

		public String getCityName() {
			return this.cityName;
		}

		public void setCityName(String cityName) {
			this.cityName = cityName;
		}

		public String getCountryCode() {
			return this.countryCode;
		}

		public void setCountryCode(String countryCode) {
			this.countryCode = countryCode;
		}

		public String getIspName() {
			return this.ispName;
		}

		public void setIspName(String ispName) {
			this.ispName = ispName;
		}
	}

	@Override
	public DescribeGtmMonitorConfigResponse getInstance(UnmarshallerContext context) {
		return	DescribeGtmMonitorConfigResponseUnmarshaller.unmarshall(this, context);
	}
}
