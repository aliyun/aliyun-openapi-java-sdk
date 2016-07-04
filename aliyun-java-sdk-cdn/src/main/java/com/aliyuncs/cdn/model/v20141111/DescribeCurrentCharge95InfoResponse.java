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

import com.aliyuncs.AcsResponse;
import com.aliyuncs.cdn.transform.v20141111.DescribeCurrentCharge95InfoResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeCurrentCharge95InfoResponse extends AcsResponse {

	private String requestId;

	private CurrentCharge95Info currentCharge95Info;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public CurrentCharge95Info getCurrentCharge95Info() {
		return this.currentCharge95Info;
	}

	public void setCurrentCharge95Info(CurrentCharge95Info currentCharge95Info) {
		this.currentCharge95Info = currentCharge95Info;
	}

	public static class CurrentCharge95Info {

		private Long max95Bps;

		private Long domesticMax95Bps;

		private Long overseasMax95Bps;

		private Float effectiveFactor;

		private Float cost;

		private String userName;

		public Long getMax95Bps() {
			return this.max95Bps;
		}

		public void setMax95Bps(Long max95Bps) {
			this.max95Bps = max95Bps;
		}

		public Long getDomesticMax95Bps() {
			return this.domesticMax95Bps;
		}

		public void setDomesticMax95Bps(Long domesticMax95Bps) {
			this.domesticMax95Bps = domesticMax95Bps;
		}

		public Long getOverseasMax95Bps() {
			return this.overseasMax95Bps;
		}

		public void setOverseasMax95Bps(Long overseasMax95Bps) {
			this.overseasMax95Bps = overseasMax95Bps;
		}

		public Float getEffectiveFactor() {
			return this.effectiveFactor;
		}

		public void setEffectiveFactor(Float effectiveFactor) {
			this.effectiveFactor = effectiveFactor;
		}

		public Float getCost() {
			return this.cost;
		}

		public void setCost(Float cost) {
			this.cost = cost;
		}

		public String getUserName() {
			return this.userName;
		}

		public void setUserName(String userName) {
			this.userName = userName;
		}
	}

	@Override
	public DescribeCurrentCharge95InfoResponse getInstance(UnmarshallerContext context) {
		return	DescribeCurrentCharge95InfoResponseUnmarshaller.unmarshall(this, context);
	}
}
