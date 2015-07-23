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
package com.aliyuncs.yundun.model.v20150416;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.yundun.transform.v20150416.DdosFlowGraphResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DdosFlowGraphResponse extends AcsResponse {

	private String requestId;

	private List<NormalFlow> normalFlows;

	private List<TotalFlow> totalFlows;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<NormalFlow> getNormalFlows() {
		return this.normalFlows;
	}

	public void setNormalFlows(List<NormalFlow> normalFlows) {
		this.normalFlows = normalFlows;
	}

	public List<TotalFlow> getTotalFlows() {
		return this.totalFlows;
	}

	public void setTotalFlows(List<TotalFlow> totalFlows) {
		this.totalFlows = totalFlows;
	}

	public static class NormalFlow {

		private Long time;

		private Long bitRecv;

		private Long bitSend;

		private Long pktRecv;

		private Long pktSend;

		public Long gettime() {
			return this.time;
		}

		public void settime(Long time) {
			this.time = time;
		}

		public Long getBitRecv() {
			return this.bitRecv;
		}

		public void setBitRecv(Long bitRecv) {
			this.bitRecv = bitRecv;
		}

		public Long getBitSend() {
			return this.bitSend;
		}

		public void setBitSend(Long bitSend) {
			this.bitSend = bitSend;
		}

		public Long getPktRecv() {
			return this.pktRecv;
		}

		public void setPktRecv(Long pktRecv) {
			this.pktRecv = pktRecv;
		}

		public Long getPktSend() {
			return this.pktSend;
		}

		public void setPktSend(Long pktSend) {
			this.pktSend = pktSend;
		}
	}

	public static class TotalFlow {

		private Long time;

		private Long bitRecv;

		private Long pktRecv;

		public Long gettime() {
			return this.time;
		}

		public void settime(Long time) {
			this.time = time;
		}

		public Long getBitRecv() {
			return this.bitRecv;
		}

		public void setBitRecv(Long bitRecv) {
			this.bitRecv = bitRecv;
		}

		public Long getPktRecv() {
			return this.pktRecv;
		}

		public void setPktRecv(Long pktRecv) {
			this.pktRecv = pktRecv;
		}
	}

	@Override
	public DdosFlowGraphResponse getInstance(UnmarshallerContext context) {
		return	DdosFlowGraphResponseUnmarshaller.unmarshall(this, context);
	}
}
