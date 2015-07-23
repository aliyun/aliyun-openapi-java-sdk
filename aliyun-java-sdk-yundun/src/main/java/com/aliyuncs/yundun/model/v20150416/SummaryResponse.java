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

import com.aliyuncs.AcsResponse;
import com.aliyuncs.yundun.transform.v20150416.SummaryResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class SummaryResponse extends AcsResponse {

	private String requestId;

	private Long status;

	private Long abnormalHostCount;

	private Ddos ddos;

	private BruteForce bruteForce;

	private Webshell webshell;

	private RemoteLogin remoteLogin;

	private WebAttack webAttack;

	private WebLeak webLeak;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Long getStatus() {
		return this.status;
	}

	public void setStatus(Long status) {
		this.status = status;
	}

	public Long getAbnormalHostCount() {
		return this.abnormalHostCount;
	}

	public void setAbnormalHostCount(Long abnormalHostCount) {
		this.abnormalHostCount = abnormalHostCount;
	}

	public Ddos getDdos() {
		return this.ddos;
	}

	public void setDdos(Ddos ddos) {
		this.ddos = ddos;
	}

	public BruteForce getBruteForce() {
		return this.bruteForce;
	}

	public void setBruteForce(BruteForce bruteForce) {
		this.bruteForce = bruteForce;
	}

	public Webshell getWebshell() {
		return this.webshell;
	}

	public void setWebshell(Webshell webshell) {
		this.webshell = webshell;
	}

	public RemoteLogin getRemoteLogin() {
		return this.remoteLogin;
	}

	public void setRemoteLogin(RemoteLogin remoteLogin) {
		this.remoteLogin = remoteLogin;
	}

	public WebAttack getWebAttack() {
		return this.webAttack;
	}

	public void setWebAttack(WebAttack webAttack) {
		this.webAttack = webAttack;
	}

	public WebLeak getWebLeak() {
		return this.webLeak;
	}

	public void setWebLeak(WebLeak webLeak) {
		this.webLeak = webLeak;
	}

	public static class Ddos {

		private Long count;

		private Long hostCount;

		public Long getCount() {
			return this.count;
		}

		public void setCount(Long count) {
			this.count = count;
		}

		public Long getHostCount() {
			return this.hostCount;
		}

		public void setHostCount(Long hostCount) {
			this.hostCount = hostCount;
		}
	}

	public static class BruteForce {

		private Long count;

		private Long hostCount;

		public Long getCount() {
			return this.count;
		}

		public void setCount(Long count) {
			this.count = count;
		}

		public Long getHostCount() {
			return this.hostCount;
		}

		public void setHostCount(Long hostCount) {
			this.hostCount = hostCount;
		}
	}

	public static class Webshell {

		private Long count;

		private Long hostCount;

		public Long getCount() {
			return this.count;
		}

		public void setCount(Long count) {
			this.count = count;
		}

		public Long getHostCount() {
			return this.hostCount;
		}

		public void setHostCount(Long hostCount) {
			this.hostCount = hostCount;
		}
	}

	public static class RemoteLogin {

		private Long count;

		private Long hostCount;

		public Long getCount() {
			return this.count;
		}

		public void setCount(Long count) {
			this.count = count;
		}

		public Long getHostCount() {
			return this.hostCount;
		}

		public void setHostCount(Long hostCount) {
			this.hostCount = hostCount;
		}
	}

	public static class WebAttack {

		private Long count;

		private Long hostCount;

		public Long getCount() {
			return this.count;
		}

		public void setCount(Long count) {
			this.count = count;
		}

		public Long getHostCount() {
			return this.hostCount;
		}

		public void setHostCount(Long hostCount) {
			this.hostCount = hostCount;
		}
	}

	public static class WebLeak {

		private Long count;

		private Long hostCount;

		public Long getCount() {
			return this.count;
		}

		public void setCount(Long count) {
			this.count = count;
		}

		public Long getHostCount() {
			return this.hostCount;
		}

		public void setHostCount(Long hostCount) {
			this.hostCount = hostCount;
		}
	}

	@Override
	public SummaryResponse getInstance(UnmarshallerContext context) {
		return	SummaryResponseUnmarshaller.unmarshall(this, context);
	}
}
