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
import com.aliyuncs.yundun.transform.v20150416.GetDdosConfigOptionsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetDdosConfigOptionsResponse extends AcsResponse {

	private String requestId;

	private List<RequestThresholdOption> requestThresholdOptions1;

	private List<RequestThresholdOption> requestThresholdOptions2;

	private List<ConnectionThresholdOption> connectionThresholdOptions;

	private List<String> qpsOptions1;

	private List<String> qpsOptions2;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<RequestThresholdOption> getRequestThresholdOptions1() {
		return this.requestThresholdOptions1;
	}

	public void setRequestThresholdOptions1(List<RequestThresholdOption> requestThresholdOptions1) {
		this.requestThresholdOptions1 = requestThresholdOptions1;
	}

	public List<RequestThresholdOption> getRequestThresholdOptions2() {
		return this.requestThresholdOptions2;
	}

	public void setRequestThresholdOptions2(List<RequestThresholdOption> requestThresholdOptions2) {
		this.requestThresholdOptions2 = requestThresholdOptions2;
	}

	public List<ConnectionThresholdOption> getConnectionThresholdOptions() {
		return this.connectionThresholdOptions;
	}

	public void setConnectionThresholdOptions(List<ConnectionThresholdOption> connectionThresholdOptions) {
		this.connectionThresholdOptions = connectionThresholdOptions;
	}

	public List<String> getQpsOptions1() {
		return this.qpsOptions1;
	}

	public void setQpsOptions1(List<String> qpsOptions1) {
		this.qpsOptions1 = qpsOptions1;
	}

	public List<String> getQpsOptions2() {
		return this.qpsOptions2;
	}

	public void setQpsOptions2(List<String> qpsOptions2) {
		this.qpsOptions2 = qpsOptions2;
	}

	public static class RequestThresholdOption {

		private Long bps;

		private Long pps;

		public Long getBps() {
			return this.bps;
		}

		public void setBps(Long bps) {
			this.bps = bps;
		}

		public Long getPps() {
			return this.pps;
		}

		public void setPps(Long pps) {
			this.pps = pps;
		}
	}

	public static class ConnectionThresholdOption {

		private Long sipconn;

		private Long sipnew;

		public Long getSipconn() {
			return this.sipconn;
		}

		public void setSipconn(Long sipconn) {
			this.sipconn = sipconn;
		}

		public Long getSipnew() {
			return this.sipnew;
		}

		public void setSipnew(Long sipnew) {
			this.sipnew = sipnew;
		}
	}

	@Override
	public GetDdosConfigOptionsResponse getInstance(UnmarshallerContext context) {
		return	GetDdosConfigOptionsResponseUnmarshaller.unmarshall(this, context);
	}
}
