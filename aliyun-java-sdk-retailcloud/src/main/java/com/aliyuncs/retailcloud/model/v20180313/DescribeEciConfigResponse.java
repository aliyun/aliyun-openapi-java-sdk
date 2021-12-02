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

package com.aliyuncs.retailcloud.model.v20180313;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.retailcloud.transform.v20180313.DescribeEciConfigResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeEciConfigResponse extends AcsResponse {

	private String requestId;

	private String errMsg;

	private Integer code;

	private Result result;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getErrMsg() {
		return this.errMsg;
	}

	public void setErrMsg(String errMsg) {
		this.errMsg = errMsg;
	}

	public Integer getCode() {
		return this.code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public Result getResult() {
		return this.result;
	}

	public void setResult(Result result) {
		this.result = result;
	}

	public static class Result {

		private Long appEnvId;

		private Boolean scheduleVirtualNode;

		private Boolean mirrorCache;

		private Integer eipBandwidth;

		private Integer normalInstanceLimit;

		private Boolean enableEciSchedulePolicy;

		public Long getAppEnvId() {
			return this.appEnvId;
		}

		public void setAppEnvId(Long appEnvId) {
			this.appEnvId = appEnvId;
		}

		public Boolean getScheduleVirtualNode() {
			return this.scheduleVirtualNode;
		}

		public void setScheduleVirtualNode(Boolean scheduleVirtualNode) {
			this.scheduleVirtualNode = scheduleVirtualNode;
		}

		public Boolean getMirrorCache() {
			return this.mirrorCache;
		}

		public void setMirrorCache(Boolean mirrorCache) {
			this.mirrorCache = mirrorCache;
		}

		public Integer getEipBandwidth() {
			return this.eipBandwidth;
		}

		public void setEipBandwidth(Integer eipBandwidth) {
			this.eipBandwidth = eipBandwidth;
		}

		public Integer getNormalInstanceLimit() {
			return this.normalInstanceLimit;
		}

		public void setNormalInstanceLimit(Integer normalInstanceLimit) {
			this.normalInstanceLimit = normalInstanceLimit;
		}

		public Boolean getEnableEciSchedulePolicy() {
			return this.enableEciSchedulePolicy;
		}

		public void setEnableEciSchedulePolicy(Boolean enableEciSchedulePolicy) {
			this.enableEciSchedulePolicy = enableEciSchedulePolicy;
		}
	}

	@Override
	public DescribeEciConfigResponse getInstance(UnmarshallerContext context) {
		return	DescribeEciConfigResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
