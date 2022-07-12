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

package com.aliyuncs.antiddos_public.model.v20170518;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.antiddos_public.transform.v20170518.DescribeBgpPackByIpResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeBgpPackByIpResponse extends AcsResponse {

	private String requestId;

	private Integer code;

	private Boolean success;

	private DdosbgpInfo ddosbgpInfo;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getCode() {
		return this.code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public DdosbgpInfo getDdosbgpInfo() {
		return this.ddosbgpInfo;
	}

	public void setDdosbgpInfo(DdosbgpInfo ddosbgpInfo) {
		this.ddosbgpInfo = ddosbgpInfo;
	}

	public static class DdosbgpInfo {

		private String ip;

		private Long expireTime;

		private Integer elasticThreshold;

		private Integer baseThreshold;

		private String ddosbgpInstanceId;

		public String getIp() {
			return this.ip;
		}

		public void setIp(String ip) {
			this.ip = ip;
		}

		public Long getExpireTime() {
			return this.expireTime;
		}

		public void setExpireTime(Long expireTime) {
			this.expireTime = expireTime;
		}

		public Integer getElasticThreshold() {
			return this.elasticThreshold;
		}

		public void setElasticThreshold(Integer elasticThreshold) {
			this.elasticThreshold = elasticThreshold;
		}

		public Integer getBaseThreshold() {
			return this.baseThreshold;
		}

		public void setBaseThreshold(Integer baseThreshold) {
			this.baseThreshold = baseThreshold;
		}

		public String getDdosbgpInstanceId() {
			return this.ddosbgpInstanceId;
		}

		public void setDdosbgpInstanceId(String ddosbgpInstanceId) {
			this.ddosbgpInstanceId = ddosbgpInstanceId;
		}
	}

	@Override
	public DescribeBgpPackByIpResponse getInstance(UnmarshallerContext context) {
		return	DescribeBgpPackByIpResponseUnmarshaller.unmarshall(this, context);
	}
}
