/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.aliyuncs.cdn.model.v20141111;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.cdn.transform.v20141111.DescribeDomainHttpsDataResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDomainHttpsDataResponse extends AcsResponse {

	private String requestId;

	private String domainNames;

	private String dataInterval;

	private List<HttpsStatisticsInfo> httpsStatisticsInfos;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getDomainNames() {
		return this.domainNames;
	}

	public void setDomainNames(String domainNames) {
		this.domainNames = domainNames;
	}

	public String getDataInterval() {
		return this.dataInterval;
	}

	public void setDataInterval(String dataInterval) {
		this.dataInterval = dataInterval;
	}

	public List<HttpsStatisticsInfo> getHttpsStatisticsInfos() {
		return this.httpsStatisticsInfos;
	}

	public void setHttpsStatisticsInfos(List<HttpsStatisticsInfo> httpsStatisticsInfos) {
		this.httpsStatisticsInfos = httpsStatisticsInfos;
	}

	public static class HttpsStatisticsInfo {

		private String time;

		private Float l1HttpsBps;

		private Float l1HttpsInnerBps;

		private Float l1HttpsOutBps;

		private Long l1HttpsQps;

		private Long l1HttpsInnerQps;

		private Long l1HttpsOutQps;

		private Long l1HttpsTtraf;

		private Long httpsSrcBps;

		private Long httpsSrcTraf;

		private Long l1HttpsInnerTraf;

		private Long l1HttpsOutTraf;

		private Float httpsByteHitRate;

		private Float httpsReqHitRate;

		private Float l1HttpsHitRate;

		private Float l1HttpsInner_acc;

		private Float l1HttpsOut_acc;

		private Float l1HttpsTacc;

		private Float l1DyHttpsBps;

		private Float l1DyHttpsInnerBps;

		private Float l1DyHttpsOutBps;

		private Float l1StHttpsBps;

		private Float l1StHttpsInnerBps;

		private Float l1StHttpsOutBps;

		private Float l1DyHttpsTraf;

		private Float l1DyHttpsInnerTraf;

		private Float l1DyHttpsOutTraf;

		private Float l1StHttpsTraf;

		private Float l1StHttpsInnerTraf;

		private Float l1StHttpsOutTraf;

		private Float l1DyHttpsQps;

		private Float l1DyHttpsInnerQps;

		private Float l1DyHttpsOutQps;

		private Float l1StHttpsQps;

		private Float l1StHttpsInnerQps;

		private Float l1StHttpsOutQps;

		private Float l1DyHttpsAcc;

		private Float l1DyHttpsInnerAcc;

		private Float l1DyHttpsOutAcc;

		private Float l1StHttpsAcc;

		private Float l1StHttpsInnerAcc;

		private Float l1StHttpsOutAcc;

		public String getTime() {
			return this.time;
		}

		public void setTime(String time) {
			this.time = time;
		}

		public Float getL1HttpsBps() {
			return this.l1HttpsBps;
		}

		public void setL1HttpsBps(Float l1HttpsBps) {
			this.l1HttpsBps = l1HttpsBps;
		}

		public Float getL1HttpsInnerBps() {
			return this.l1HttpsInnerBps;
		}

		public void setL1HttpsInnerBps(Float l1HttpsInnerBps) {
			this.l1HttpsInnerBps = l1HttpsInnerBps;
		}

		public Float getL1HttpsOutBps() {
			return this.l1HttpsOutBps;
		}

		public void setL1HttpsOutBps(Float l1HttpsOutBps) {
			this.l1HttpsOutBps = l1HttpsOutBps;
		}

		public Long getL1HttpsQps() {
			return this.l1HttpsQps;
		}

		public void setL1HttpsQps(Long l1HttpsQps) {
			this.l1HttpsQps = l1HttpsQps;
		}

		public Long getL1HttpsInnerQps() {
			return this.l1HttpsInnerQps;
		}

		public void setL1HttpsInnerQps(Long l1HttpsInnerQps) {
			this.l1HttpsInnerQps = l1HttpsInnerQps;
		}

		public Long getL1HttpsOutQps() {
			return this.l1HttpsOutQps;
		}

		public void setL1HttpsOutQps(Long l1HttpsOutQps) {
			this.l1HttpsOutQps = l1HttpsOutQps;
		}

		public Long getL1HttpsTtraf() {
			return this.l1HttpsTtraf;
		}

		public void setL1HttpsTtraf(Long l1HttpsTtraf) {
			this.l1HttpsTtraf = l1HttpsTtraf;
		}

		public Long getHttpsSrcBps() {
			return this.httpsSrcBps;
		}

		public void setHttpsSrcBps(Long httpsSrcBps) {
			this.httpsSrcBps = httpsSrcBps;
		}

		public Long getHttpsSrcTraf() {
			return this.httpsSrcTraf;
		}

		public void setHttpsSrcTraf(Long httpsSrcTraf) {
			this.httpsSrcTraf = httpsSrcTraf;
		}

		public Long getL1HttpsInnerTraf() {
			return this.l1HttpsInnerTraf;
		}

		public void setL1HttpsInnerTraf(Long l1HttpsInnerTraf) {
			this.l1HttpsInnerTraf = l1HttpsInnerTraf;
		}

		public Long getL1HttpsOutTraf() {
			return this.l1HttpsOutTraf;
		}

		public void setL1HttpsOutTraf(Long l1HttpsOutTraf) {
			this.l1HttpsOutTraf = l1HttpsOutTraf;
		}

		public Float getHttpsByteHitRate() {
			return this.httpsByteHitRate;
		}

		public void setHttpsByteHitRate(Float httpsByteHitRate) {
			this.httpsByteHitRate = httpsByteHitRate;
		}

		public Float getHttpsReqHitRate() {
			return this.httpsReqHitRate;
		}

		public void setHttpsReqHitRate(Float httpsReqHitRate) {
			this.httpsReqHitRate = httpsReqHitRate;
		}

		public Float getL1HttpsHitRate() {
			return this.l1HttpsHitRate;
		}

		public void setL1HttpsHitRate(Float l1HttpsHitRate) {
			this.l1HttpsHitRate = l1HttpsHitRate;
		}

		public Float getL1HttpsInner_acc() {
			return this.l1HttpsInner_acc;
		}

		public void setL1HttpsInner_acc(Float l1HttpsInner_acc) {
			this.l1HttpsInner_acc = l1HttpsInner_acc;
		}

		public Float getL1HttpsOut_acc() {
			return this.l1HttpsOut_acc;
		}

		public void setL1HttpsOut_acc(Float l1HttpsOut_acc) {
			this.l1HttpsOut_acc = l1HttpsOut_acc;
		}

		public Float getL1HttpsTacc() {
			return this.l1HttpsTacc;
		}

		public void setL1HttpsTacc(Float l1HttpsTacc) {
			this.l1HttpsTacc = l1HttpsTacc;
		}

		public Float getL1DyHttpsBps() {
			return this.l1DyHttpsBps;
		}

		public void setL1DyHttpsBps(Float l1DyHttpsBps) {
			this.l1DyHttpsBps = l1DyHttpsBps;
		}

		public Float getL1DyHttpsInnerBps() {
			return this.l1DyHttpsInnerBps;
		}

		public void setL1DyHttpsInnerBps(Float l1DyHttpsInnerBps) {
			this.l1DyHttpsInnerBps = l1DyHttpsInnerBps;
		}

		public Float getL1DyHttpsOutBps() {
			return this.l1DyHttpsOutBps;
		}

		public void setL1DyHttpsOutBps(Float l1DyHttpsOutBps) {
			this.l1DyHttpsOutBps = l1DyHttpsOutBps;
		}

		public Float getL1StHttpsBps() {
			return this.l1StHttpsBps;
		}

		public void setL1StHttpsBps(Float l1StHttpsBps) {
			this.l1StHttpsBps = l1StHttpsBps;
		}

		public Float getL1StHttpsInnerBps() {
			return this.l1StHttpsInnerBps;
		}

		public void setL1StHttpsInnerBps(Float l1StHttpsInnerBps) {
			this.l1StHttpsInnerBps = l1StHttpsInnerBps;
		}

		public Float getL1StHttpsOutBps() {
			return this.l1StHttpsOutBps;
		}

		public void setL1StHttpsOutBps(Float l1StHttpsOutBps) {
			this.l1StHttpsOutBps = l1StHttpsOutBps;
		}

		public Float getL1DyHttpsTraf() {
			return this.l1DyHttpsTraf;
		}

		public void setL1DyHttpsTraf(Float l1DyHttpsTraf) {
			this.l1DyHttpsTraf = l1DyHttpsTraf;
		}

		public Float getL1DyHttpsInnerTraf() {
			return this.l1DyHttpsInnerTraf;
		}

		public void setL1DyHttpsInnerTraf(Float l1DyHttpsInnerTraf) {
			this.l1DyHttpsInnerTraf = l1DyHttpsInnerTraf;
		}

		public Float getL1DyHttpsOutTraf() {
			return this.l1DyHttpsOutTraf;
		}

		public void setL1DyHttpsOutTraf(Float l1DyHttpsOutTraf) {
			this.l1DyHttpsOutTraf = l1DyHttpsOutTraf;
		}

		public Float getL1StHttpsTraf() {
			return this.l1StHttpsTraf;
		}

		public void setL1StHttpsTraf(Float l1StHttpsTraf) {
			this.l1StHttpsTraf = l1StHttpsTraf;
		}

		public Float getL1StHttpsInnerTraf() {
			return this.l1StHttpsInnerTraf;
		}

		public void setL1StHttpsInnerTraf(Float l1StHttpsInnerTraf) {
			this.l1StHttpsInnerTraf = l1StHttpsInnerTraf;
		}

		public Float getL1StHttpsOutTraf() {
			return this.l1StHttpsOutTraf;
		}

		public void setL1StHttpsOutTraf(Float l1StHttpsOutTraf) {
			this.l1StHttpsOutTraf = l1StHttpsOutTraf;
		}

		public Float getL1DyHttpsQps() {
			return this.l1DyHttpsQps;
		}

		public void setL1DyHttpsQps(Float l1DyHttpsQps) {
			this.l1DyHttpsQps = l1DyHttpsQps;
		}

		public Float getL1DyHttpsInnerQps() {
			return this.l1DyHttpsInnerQps;
		}

		public void setL1DyHttpsInnerQps(Float l1DyHttpsInnerQps) {
			this.l1DyHttpsInnerQps = l1DyHttpsInnerQps;
		}

		public Float getL1DyHttpsOutQps() {
			return this.l1DyHttpsOutQps;
		}

		public void setL1DyHttpsOutQps(Float l1DyHttpsOutQps) {
			this.l1DyHttpsOutQps = l1DyHttpsOutQps;
		}

		public Float getL1StHttpsQps() {
			return this.l1StHttpsQps;
		}

		public void setL1StHttpsQps(Float l1StHttpsQps) {
			this.l1StHttpsQps = l1StHttpsQps;
		}

		public Float getL1StHttpsInnerQps() {
			return this.l1StHttpsInnerQps;
		}

		public void setL1StHttpsInnerQps(Float l1StHttpsInnerQps) {
			this.l1StHttpsInnerQps = l1StHttpsInnerQps;
		}

		public Float getL1StHttpsOutQps() {
			return this.l1StHttpsOutQps;
		}

		public void setL1StHttpsOutQps(Float l1StHttpsOutQps) {
			this.l1StHttpsOutQps = l1StHttpsOutQps;
		}

		public Float getL1DyHttpsAcc() {
			return this.l1DyHttpsAcc;
		}

		public void setL1DyHttpsAcc(Float l1DyHttpsAcc) {
			this.l1DyHttpsAcc = l1DyHttpsAcc;
		}

		public Float getL1DyHttpsInnerAcc() {
			return this.l1DyHttpsInnerAcc;
		}

		public void setL1DyHttpsInnerAcc(Float l1DyHttpsInnerAcc) {
			this.l1DyHttpsInnerAcc = l1DyHttpsInnerAcc;
		}

		public Float getL1DyHttpsOutAcc() {
			return this.l1DyHttpsOutAcc;
		}

		public void setL1DyHttpsOutAcc(Float l1DyHttpsOutAcc) {
			this.l1DyHttpsOutAcc = l1DyHttpsOutAcc;
		}

		public Float getL1StHttpsAcc() {
			return this.l1StHttpsAcc;
		}

		public void setL1StHttpsAcc(Float l1StHttpsAcc) {
			this.l1StHttpsAcc = l1StHttpsAcc;
		}

		public Float getL1StHttpsInnerAcc() {
			return this.l1StHttpsInnerAcc;
		}

		public void setL1StHttpsInnerAcc(Float l1StHttpsInnerAcc) {
			this.l1StHttpsInnerAcc = l1StHttpsInnerAcc;
		}

		public Float getL1StHttpsOutAcc() {
			return this.l1StHttpsOutAcc;
		}

		public void setL1StHttpsOutAcc(Float l1StHttpsOutAcc) {
			this.l1StHttpsOutAcc = l1StHttpsOutAcc;
		}
	}

	@Override
	public DescribeDomainHttpsDataResponse getInstance(UnmarshallerContext context) {
		return	DescribeDomainHttpsDataResponseUnmarshaller.unmarshall(this, context);
	}
}
