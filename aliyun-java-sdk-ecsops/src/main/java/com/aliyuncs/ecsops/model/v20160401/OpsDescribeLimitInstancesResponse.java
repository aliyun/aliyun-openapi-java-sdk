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

package com.aliyuncs.ecsops.model.v20160401;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecsops.transform.v20160401.OpsDescribeLimitInstancesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class OpsDescribeLimitInstancesResponse extends AcsResponse {

	private String message;

	private String requestId;

	private Long total;

	private String code;

	private String success;

	private List<LimitInstance> limitInstances;

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Long getTotal() {
		return this.total;
	}

	public void setTotal(Long total) {
		this.total = total;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getSuccess() {
		return this.success;
	}

	public void setSuccess(String success) {
		this.success = success;
	}

	public List<LimitInstance> getLimitInstances() {
		return this.limitInstances;
	}

	public void setLimitInstances(List<LimitInstance> limitInstances) {
		this.limitInstances = limitInstances;
	}

	public static class LimitInstance {

		private Long publicTxPps;

		private Long publicRxPps;

		private Long sessionEstablishRate;

		private Long publicTxBps;

		private Long privateRxBps;

		private Long privateRxPps;

		private String instanceId;

		private Long publicRxBps;

		private Long privateTxBps;

		private String limitType;

		private Long privateTxPps;

		private Long sessionQuota;

		public Long getPublicTxPps() {
			return this.publicTxPps;
		}

		public void setPublicTxPps(Long publicTxPps) {
			this.publicTxPps = publicTxPps;
		}

		public Long getPublicRxPps() {
			return this.publicRxPps;
		}

		public void setPublicRxPps(Long publicRxPps) {
			this.publicRxPps = publicRxPps;
		}

		public Long getSessionEstablishRate() {
			return this.sessionEstablishRate;
		}

		public void setSessionEstablishRate(Long sessionEstablishRate) {
			this.sessionEstablishRate = sessionEstablishRate;
		}

		public Long getPublicTxBps() {
			return this.publicTxBps;
		}

		public void setPublicTxBps(Long publicTxBps) {
			this.publicTxBps = publicTxBps;
		}

		public Long getPrivateRxBps() {
			return this.privateRxBps;
		}

		public void setPrivateRxBps(Long privateRxBps) {
			this.privateRxBps = privateRxBps;
		}

		public Long getPrivateRxPps() {
			return this.privateRxPps;
		}

		public void setPrivateRxPps(Long privateRxPps) {
			this.privateRxPps = privateRxPps;
		}

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public Long getPublicRxBps() {
			return this.publicRxBps;
		}

		public void setPublicRxBps(Long publicRxBps) {
			this.publicRxBps = publicRxBps;
		}

		public Long getPrivateTxBps() {
			return this.privateTxBps;
		}

		public void setPrivateTxBps(Long privateTxBps) {
			this.privateTxBps = privateTxBps;
		}

		public String getLimitType() {
			return this.limitType;
		}

		public void setLimitType(String limitType) {
			this.limitType = limitType;
		}

		public Long getPrivateTxPps() {
			return this.privateTxPps;
		}

		public void setPrivateTxPps(Long privateTxPps) {
			this.privateTxPps = privateTxPps;
		}

		public Long getSessionQuota() {
			return this.sessionQuota;
		}

		public void setSessionQuota(Long sessionQuota) {
			this.sessionQuota = sessionQuota;
		}
	}

	@Override
	public OpsDescribeLimitInstancesResponse getInstance(UnmarshallerContext context) {
		return	OpsDescribeLimitInstancesResponseUnmarshaller.unmarshall(this, context);
	}
}
