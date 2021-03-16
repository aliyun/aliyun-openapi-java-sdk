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

	private String requestId;

	private String code;

	private String message;

	private String success;

	private Long total;

	private List<LimitInstance> limitInstances;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getSuccess() {
		return this.success;
	}

	public void setSuccess(String success) {
		this.success = success;
	}

	public Long getTotal() {
		return this.total;
	}

	public void setTotal(Long total) {
		this.total = total;
	}

	public List<LimitInstance> getLimitInstances() {
		return this.limitInstances;
	}

	public void setLimitInstances(List<LimitInstance> limitInstances) {
		this.limitInstances = limitInstances;
	}

	public static class LimitInstance {

		private String limitType;

		private String instanceId;

		private Long privateRxBps;

		private Long privateTxBps;

		private Long privateRxPps;

		private Long privateTxPps;

		private Long publicRxBps;

		private Long publicTxBps;

		private Long publicRxPps;

		private Long publicTxPps;

		private Long sessionQuota;

		private Long sessionEstablishRate;

		public String getLimitType() {
			return this.limitType;
		}

		public void setLimitType(String limitType) {
			this.limitType = limitType;
		}

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public Long getPrivateRxBps() {
			return this.privateRxBps;
		}

		public void setPrivateRxBps(Long privateRxBps) {
			this.privateRxBps = privateRxBps;
		}

		public Long getPrivateTxBps() {
			return this.privateTxBps;
		}

		public void setPrivateTxBps(Long privateTxBps) {
			this.privateTxBps = privateTxBps;
		}

		public Long getPrivateRxPps() {
			return this.privateRxPps;
		}

		public void setPrivateRxPps(Long privateRxPps) {
			this.privateRxPps = privateRxPps;
		}

		public Long getPrivateTxPps() {
			return this.privateTxPps;
		}

		public void setPrivateTxPps(Long privateTxPps) {
			this.privateTxPps = privateTxPps;
		}

		public Long getPublicRxBps() {
			return this.publicRxBps;
		}

		public void setPublicRxBps(Long publicRxBps) {
			this.publicRxBps = publicRxBps;
		}

		public Long getPublicTxBps() {
			return this.publicTxBps;
		}

		public void setPublicTxBps(Long publicTxBps) {
			this.publicTxBps = publicTxBps;
		}

		public Long getPublicRxPps() {
			return this.publicRxPps;
		}

		public void setPublicRxPps(Long publicRxPps) {
			this.publicRxPps = publicRxPps;
		}

		public Long getPublicTxPps() {
			return this.publicTxPps;
		}

		public void setPublicTxPps(Long publicTxPps) {
			this.publicTxPps = publicTxPps;
		}

		public Long getSessionQuota() {
			return this.sessionQuota;
		}

		public void setSessionQuota(Long sessionQuota) {
			this.sessionQuota = sessionQuota;
		}

		public Long getSessionEstablishRate() {
			return this.sessionEstablishRate;
		}

		public void setSessionEstablishRate(Long sessionEstablishRate) {
			this.sessionEstablishRate = sessionEstablishRate;
		}
	}

	@Override
	public OpsDescribeLimitInstancesResponse getInstance(UnmarshallerContext context) {
		return	OpsDescribeLimitInstancesResponseUnmarshaller.unmarshall(this, context);
	}
}
