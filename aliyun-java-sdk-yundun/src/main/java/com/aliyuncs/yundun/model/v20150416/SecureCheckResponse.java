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
import com.aliyuncs.yundun.transform.v20150416.SecureCheckResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class SecureCheckResponse extends AcsResponse {

	private String requestId;

	private String recentInstanceId;

	private List<Info> problemList;

	private List<Info> noProblemList;

	private List<Info> noScanList;

	private List<Info> scanningList;

	private List<Info> innerIpList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getRecentInstanceId() {
		return this.recentInstanceId;
	}

	public void setRecentInstanceId(String recentInstanceId) {
		this.recentInstanceId = recentInstanceId;
	}

	public List<Info> getProblemList() {
		return this.problemList;
	}

	public void setProblemList(List<Info> problemList) {
		this.problemList = problemList;
	}

	public List<Info> getNoProblemList() {
		return this.noProblemList;
	}

	public void setNoProblemList(List<Info> noProblemList) {
		this.noProblemList = noProblemList;
	}

	public List<Info> getNoScanList() {
		return this.noScanList;
	}

	public void setNoScanList(List<Info> noScanList) {
		this.noScanList = noScanList;
	}

	public List<Info> getScanningList() {
		return this.scanningList;
	}

	public void setScanningList(List<Info> scanningList) {
		this.scanningList = scanningList;
	}

	public List<Info> getInnerIpList() {
		return this.innerIpList;
	}

	public void setInnerIpList(List<Info> innerIpList) {
		this.innerIpList = innerIpList;
	}

	public static class Info {

		private String ip;

		private String status;

		private String vulNum;

		private String instanceId;

		public String getIp() {
			return this.ip;
		}

		public void setIp(String ip) {
			this.ip = ip;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getVulNum() {
			return this.vulNum;
		}

		public void setVulNum(String vulNum) {
			this.vulNum = vulNum;
		}

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}
	}

	@Override
	public SecureCheckResponse getInstance(UnmarshallerContext context) {
		return	SecureCheckResponseUnmarshaller.unmarshall(this, context);
	}
}
