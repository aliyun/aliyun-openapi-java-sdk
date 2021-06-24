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
import com.aliyuncs.ecsops.transform.v20160401.OpsDescribeEcsFlowLimitResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class OpsDescribeEcsFlowLimitResponse extends AcsResponse {

	private String requestId;

	private List<EcsFlowLimit> ecsFlowLimits;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<EcsFlowLimit> getEcsFlowLimits() {
		return this.ecsFlowLimits;
	}

	public void setEcsFlowLimits(List<EcsFlowLimit> ecsFlowLimits) {
		this.ecsFlowLimits = ecsFlowLimits;
	}

	public static class EcsFlowLimit {

		private String networkType;

		private String instanceId;

		private AvsIntranetFlowLimit avsIntranetFlowLimit;

		private EcsControlInternetFlowLimit ecsControlInternetFlowLimit;

		private EcsControlIntranetFlowLimit ecsControlIntranetFlowLimit;

		private AvsInternetFlowLimit avsInternetFlowLimit;

		public String getNetworkType() {
			return this.networkType;
		}

		public void setNetworkType(String networkType) {
			this.networkType = networkType;
		}

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public AvsIntranetFlowLimit getAvsIntranetFlowLimit() {
			return this.avsIntranetFlowLimit;
		}

		public void setAvsIntranetFlowLimit(AvsIntranetFlowLimit avsIntranetFlowLimit) {
			this.avsIntranetFlowLimit = avsIntranetFlowLimit;
		}

		public EcsControlInternetFlowLimit getEcsControlInternetFlowLimit() {
			return this.ecsControlInternetFlowLimit;
		}

		public void setEcsControlInternetFlowLimit(EcsControlInternetFlowLimit ecsControlInternetFlowLimit) {
			this.ecsControlInternetFlowLimit = ecsControlInternetFlowLimit;
		}

		public EcsControlIntranetFlowLimit getEcsControlIntranetFlowLimit() {
			return this.ecsControlIntranetFlowLimit;
		}

		public void setEcsControlIntranetFlowLimit(EcsControlIntranetFlowLimit ecsControlIntranetFlowLimit) {
			this.ecsControlIntranetFlowLimit = ecsControlIntranetFlowLimit;
		}

		public AvsInternetFlowLimit getAvsInternetFlowLimit() {
			return this.avsInternetFlowLimit;
		}

		public void setAvsInternetFlowLimit(AvsInternetFlowLimit avsInternetFlowLimit) {
			this.avsInternetFlowLimit = avsInternetFlowLimit;
		}

		public static class AvsIntranetFlowLimit {

			private Long inhibitType;

			private Float rxCreditConsumRate;

			private Long sessionEstablishRate;

			private Long txMaxCredit;

			private Float inhibitRatio;

			private Long rxBps;

			private Long rxBurst;

			private Long txBps;

			private Float txCreditConsumRate;

			private Long txInitCredit;

			private Long txPps;

			private Long rxMaxCredit;

			private Long txBurst;

			private Float rxCreditAccumRate;

			private Long sessionQuota;

			private Long rxPps;

			private Long rxInitCredit;

			private Float txCreditAccumRate;

			public Long getInhibitType() {
				return this.inhibitType;
			}

			public void setInhibitType(Long inhibitType) {
				this.inhibitType = inhibitType;
			}

			public Float getRxCreditConsumRate() {
				return this.rxCreditConsumRate;
			}

			public void setRxCreditConsumRate(Float rxCreditConsumRate) {
				this.rxCreditConsumRate = rxCreditConsumRate;
			}

			public Long getSessionEstablishRate() {
				return this.sessionEstablishRate;
			}

			public void setSessionEstablishRate(Long sessionEstablishRate) {
				this.sessionEstablishRate = sessionEstablishRate;
			}

			public Long getTxMaxCredit() {
				return this.txMaxCredit;
			}

			public void setTxMaxCredit(Long txMaxCredit) {
				this.txMaxCredit = txMaxCredit;
			}

			public Float getInhibitRatio() {
				return this.inhibitRatio;
			}

			public void setInhibitRatio(Float inhibitRatio) {
				this.inhibitRatio = inhibitRatio;
			}

			public Long getRxBps() {
				return this.rxBps;
			}

			public void setRxBps(Long rxBps) {
				this.rxBps = rxBps;
			}

			public Long getRxBurst() {
				return this.rxBurst;
			}

			public void setRxBurst(Long rxBurst) {
				this.rxBurst = rxBurst;
			}

			public Long getTxBps() {
				return this.txBps;
			}

			public void setTxBps(Long txBps) {
				this.txBps = txBps;
			}

			public Float getTxCreditConsumRate() {
				return this.txCreditConsumRate;
			}

			public void setTxCreditConsumRate(Float txCreditConsumRate) {
				this.txCreditConsumRate = txCreditConsumRate;
			}

			public Long getTxInitCredit() {
				return this.txInitCredit;
			}

			public void setTxInitCredit(Long txInitCredit) {
				this.txInitCredit = txInitCredit;
			}

			public Long getTxPps() {
				return this.txPps;
			}

			public void setTxPps(Long txPps) {
				this.txPps = txPps;
			}

			public Long getRxMaxCredit() {
				return this.rxMaxCredit;
			}

			public void setRxMaxCredit(Long rxMaxCredit) {
				this.rxMaxCredit = rxMaxCredit;
			}

			public Long getTxBurst() {
				return this.txBurst;
			}

			public void setTxBurst(Long txBurst) {
				this.txBurst = txBurst;
			}

			public Float getRxCreditAccumRate() {
				return this.rxCreditAccumRate;
			}

			public void setRxCreditAccumRate(Float rxCreditAccumRate) {
				this.rxCreditAccumRate = rxCreditAccumRate;
			}

			public Long getSessionQuota() {
				return this.sessionQuota;
			}

			public void setSessionQuota(Long sessionQuota) {
				this.sessionQuota = sessionQuota;
			}

			public Long getRxPps() {
				return this.rxPps;
			}

			public void setRxPps(Long rxPps) {
				this.rxPps = rxPps;
			}

			public Long getRxInitCredit() {
				return this.rxInitCredit;
			}

			public void setRxInitCredit(Long rxInitCredit) {
				this.rxInitCredit = rxInitCredit;
			}

			public Float getTxCreditAccumRate() {
				return this.txCreditAccumRate;
			}

			public void setTxCreditAccumRate(Float txCreditAccumRate) {
				this.txCreditAccumRate = txCreditAccumRate;
			}
		}

		public static class EcsControlInternetFlowLimit {

			private Long inhibitType;

			private Float rxCreditConsumRate;

			private Long sessionEstablishRate;

			private Long txMaxCredit;

			private Float inhibitRatio;

			private Long rxBps;

			private Long rxBurst;

			private Long txBps;

			private Float txCreditConsumRate;

			private Long txInitCredit;

			private Long txPps;

			private Long rxMaxCredit;

			private Long txBurst;

			private Float rxCreditAccumRate;

			private Long sessionQuota;

			private Long rxPps;

			private Long rxInitCredit;

			private Float txCreditAccumRate;

			public Long getInhibitType() {
				return this.inhibitType;
			}

			public void setInhibitType(Long inhibitType) {
				this.inhibitType = inhibitType;
			}

			public Float getRxCreditConsumRate() {
				return this.rxCreditConsumRate;
			}

			public void setRxCreditConsumRate(Float rxCreditConsumRate) {
				this.rxCreditConsumRate = rxCreditConsumRate;
			}

			public Long getSessionEstablishRate() {
				return this.sessionEstablishRate;
			}

			public void setSessionEstablishRate(Long sessionEstablishRate) {
				this.sessionEstablishRate = sessionEstablishRate;
			}

			public Long getTxMaxCredit() {
				return this.txMaxCredit;
			}

			public void setTxMaxCredit(Long txMaxCredit) {
				this.txMaxCredit = txMaxCredit;
			}

			public Float getInhibitRatio() {
				return this.inhibitRatio;
			}

			public void setInhibitRatio(Float inhibitRatio) {
				this.inhibitRatio = inhibitRatio;
			}

			public Long getRxBps() {
				return this.rxBps;
			}

			public void setRxBps(Long rxBps) {
				this.rxBps = rxBps;
			}

			public Long getRxBurst() {
				return this.rxBurst;
			}

			public void setRxBurst(Long rxBurst) {
				this.rxBurst = rxBurst;
			}

			public Long getTxBps() {
				return this.txBps;
			}

			public void setTxBps(Long txBps) {
				this.txBps = txBps;
			}

			public Float getTxCreditConsumRate() {
				return this.txCreditConsumRate;
			}

			public void setTxCreditConsumRate(Float txCreditConsumRate) {
				this.txCreditConsumRate = txCreditConsumRate;
			}

			public Long getTxInitCredit() {
				return this.txInitCredit;
			}

			public void setTxInitCredit(Long txInitCredit) {
				this.txInitCredit = txInitCredit;
			}

			public Long getTxPps() {
				return this.txPps;
			}

			public void setTxPps(Long txPps) {
				this.txPps = txPps;
			}

			public Long getRxMaxCredit() {
				return this.rxMaxCredit;
			}

			public void setRxMaxCredit(Long rxMaxCredit) {
				this.rxMaxCredit = rxMaxCredit;
			}

			public Long getTxBurst() {
				return this.txBurst;
			}

			public void setTxBurst(Long txBurst) {
				this.txBurst = txBurst;
			}

			public Float getRxCreditAccumRate() {
				return this.rxCreditAccumRate;
			}

			public void setRxCreditAccumRate(Float rxCreditAccumRate) {
				this.rxCreditAccumRate = rxCreditAccumRate;
			}

			public Long getSessionQuota() {
				return this.sessionQuota;
			}

			public void setSessionQuota(Long sessionQuota) {
				this.sessionQuota = sessionQuota;
			}

			public Long getRxPps() {
				return this.rxPps;
			}

			public void setRxPps(Long rxPps) {
				this.rxPps = rxPps;
			}

			public Long getRxInitCredit() {
				return this.rxInitCredit;
			}

			public void setRxInitCredit(Long rxInitCredit) {
				this.rxInitCredit = rxInitCredit;
			}

			public Float getTxCreditAccumRate() {
				return this.txCreditAccumRate;
			}

			public void setTxCreditAccumRate(Float txCreditAccumRate) {
				this.txCreditAccumRate = txCreditAccumRate;
			}
		}

		public static class EcsControlIntranetFlowLimit {

			private Long inhibitType;

			private Float rxCreditConsumRate;

			private Long sessionEstablishRate;

			private Long txMaxCredit;

			private Float inhibitRatio;

			private Long rxBps;

			private Long rxBurst;

			private Long txBps;

			private Float txCreditConsumRate;

			private Long txInitCredit;

			private Long txPps;

			private Long rxMaxCredit;

			private Long txBurst;

			private Float rxCreditAccumRate;

			private Long sessionQuota;

			private Long rxPps;

			private Long rxInitCredit;

			private Float txCreditAccumRate;

			public Long getInhibitType() {
				return this.inhibitType;
			}

			public void setInhibitType(Long inhibitType) {
				this.inhibitType = inhibitType;
			}

			public Float getRxCreditConsumRate() {
				return this.rxCreditConsumRate;
			}

			public void setRxCreditConsumRate(Float rxCreditConsumRate) {
				this.rxCreditConsumRate = rxCreditConsumRate;
			}

			public Long getSessionEstablishRate() {
				return this.sessionEstablishRate;
			}

			public void setSessionEstablishRate(Long sessionEstablishRate) {
				this.sessionEstablishRate = sessionEstablishRate;
			}

			public Long getTxMaxCredit() {
				return this.txMaxCredit;
			}

			public void setTxMaxCredit(Long txMaxCredit) {
				this.txMaxCredit = txMaxCredit;
			}

			public Float getInhibitRatio() {
				return this.inhibitRatio;
			}

			public void setInhibitRatio(Float inhibitRatio) {
				this.inhibitRatio = inhibitRatio;
			}

			public Long getRxBps() {
				return this.rxBps;
			}

			public void setRxBps(Long rxBps) {
				this.rxBps = rxBps;
			}

			public Long getRxBurst() {
				return this.rxBurst;
			}

			public void setRxBurst(Long rxBurst) {
				this.rxBurst = rxBurst;
			}

			public Long getTxBps() {
				return this.txBps;
			}

			public void setTxBps(Long txBps) {
				this.txBps = txBps;
			}

			public Float getTxCreditConsumRate() {
				return this.txCreditConsumRate;
			}

			public void setTxCreditConsumRate(Float txCreditConsumRate) {
				this.txCreditConsumRate = txCreditConsumRate;
			}

			public Long getTxInitCredit() {
				return this.txInitCredit;
			}

			public void setTxInitCredit(Long txInitCredit) {
				this.txInitCredit = txInitCredit;
			}

			public Long getTxPps() {
				return this.txPps;
			}

			public void setTxPps(Long txPps) {
				this.txPps = txPps;
			}

			public Long getRxMaxCredit() {
				return this.rxMaxCredit;
			}

			public void setRxMaxCredit(Long rxMaxCredit) {
				this.rxMaxCredit = rxMaxCredit;
			}

			public Long getTxBurst() {
				return this.txBurst;
			}

			public void setTxBurst(Long txBurst) {
				this.txBurst = txBurst;
			}

			public Float getRxCreditAccumRate() {
				return this.rxCreditAccumRate;
			}

			public void setRxCreditAccumRate(Float rxCreditAccumRate) {
				this.rxCreditAccumRate = rxCreditAccumRate;
			}

			public Long getSessionQuota() {
				return this.sessionQuota;
			}

			public void setSessionQuota(Long sessionQuota) {
				this.sessionQuota = sessionQuota;
			}

			public Long getRxPps() {
				return this.rxPps;
			}

			public void setRxPps(Long rxPps) {
				this.rxPps = rxPps;
			}

			public Long getRxInitCredit() {
				return this.rxInitCredit;
			}

			public void setRxInitCredit(Long rxInitCredit) {
				this.rxInitCredit = rxInitCredit;
			}

			public Float getTxCreditAccumRate() {
				return this.txCreditAccumRate;
			}

			public void setTxCreditAccumRate(Float txCreditAccumRate) {
				this.txCreditAccumRate = txCreditAccumRate;
			}
		}

		public static class AvsInternetFlowLimit {

			private Long inhibitType;

			private Float rxCreditConsumRate;

			private Long sessionEstablishRate;

			private Long txMaxCredit;

			private Float inhibitRatio;

			private Long rxBps;

			private Long rxBurst;

			private Long txBps;

			private Float txCreditConsumRate;

			private Long txInitCredit;

			private Long txPps;

			private Long rxMaxCredit;

			private Long txBurst;

			private Float rxCreditAccumRate;

			private Long sessionQuota;

			private Long rxPps;

			private Long rxInitCredit;

			private Float txCreditAccumRate;

			public Long getInhibitType() {
				return this.inhibitType;
			}

			public void setInhibitType(Long inhibitType) {
				this.inhibitType = inhibitType;
			}

			public Float getRxCreditConsumRate() {
				return this.rxCreditConsumRate;
			}

			public void setRxCreditConsumRate(Float rxCreditConsumRate) {
				this.rxCreditConsumRate = rxCreditConsumRate;
			}

			public Long getSessionEstablishRate() {
				return this.sessionEstablishRate;
			}

			public void setSessionEstablishRate(Long sessionEstablishRate) {
				this.sessionEstablishRate = sessionEstablishRate;
			}

			public Long getTxMaxCredit() {
				return this.txMaxCredit;
			}

			public void setTxMaxCredit(Long txMaxCredit) {
				this.txMaxCredit = txMaxCredit;
			}

			public Float getInhibitRatio() {
				return this.inhibitRatio;
			}

			public void setInhibitRatio(Float inhibitRatio) {
				this.inhibitRatio = inhibitRatio;
			}

			public Long getRxBps() {
				return this.rxBps;
			}

			public void setRxBps(Long rxBps) {
				this.rxBps = rxBps;
			}

			public Long getRxBurst() {
				return this.rxBurst;
			}

			public void setRxBurst(Long rxBurst) {
				this.rxBurst = rxBurst;
			}

			public Long getTxBps() {
				return this.txBps;
			}

			public void setTxBps(Long txBps) {
				this.txBps = txBps;
			}

			public Float getTxCreditConsumRate() {
				return this.txCreditConsumRate;
			}

			public void setTxCreditConsumRate(Float txCreditConsumRate) {
				this.txCreditConsumRate = txCreditConsumRate;
			}

			public Long getTxInitCredit() {
				return this.txInitCredit;
			}

			public void setTxInitCredit(Long txInitCredit) {
				this.txInitCredit = txInitCredit;
			}

			public Long getTxPps() {
				return this.txPps;
			}

			public void setTxPps(Long txPps) {
				this.txPps = txPps;
			}

			public Long getRxMaxCredit() {
				return this.rxMaxCredit;
			}

			public void setRxMaxCredit(Long rxMaxCredit) {
				this.rxMaxCredit = rxMaxCredit;
			}

			public Long getTxBurst() {
				return this.txBurst;
			}

			public void setTxBurst(Long txBurst) {
				this.txBurst = txBurst;
			}

			public Float getRxCreditAccumRate() {
				return this.rxCreditAccumRate;
			}

			public void setRxCreditAccumRate(Float rxCreditAccumRate) {
				this.rxCreditAccumRate = rxCreditAccumRate;
			}

			public Long getSessionQuota() {
				return this.sessionQuota;
			}

			public void setSessionQuota(Long sessionQuota) {
				this.sessionQuota = sessionQuota;
			}

			public Long getRxPps() {
				return this.rxPps;
			}

			public void setRxPps(Long rxPps) {
				this.rxPps = rxPps;
			}

			public Long getRxInitCredit() {
				return this.rxInitCredit;
			}

			public void setRxInitCredit(Long rxInitCredit) {
				this.rxInitCredit = rxInitCredit;
			}

			public Float getTxCreditAccumRate() {
				return this.txCreditAccumRate;
			}

			public void setTxCreditAccumRate(Float txCreditAccumRate) {
				this.txCreditAccumRate = txCreditAccumRate;
			}
		}
	}

	@Override
	public OpsDescribeEcsFlowLimitResponse getInstance(UnmarshallerContext context) {
		return	OpsDescribeEcsFlowLimitResponseUnmarshaller.unmarshall(this, context);
	}
}
