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
import com.aliyuncs.cdn.transform.v20141111.DescribeDomainCCAttackInfoResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDomainCCAttackInfoResponse extends AcsResponse {

	private String requestId;

	private String domainName;

	private String startTime;

	private String endTime;

	private List<AttackIpDatas> attackIpDataList;

	private List<AttackedUrlDatas> attackedUrlDataList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getDomainName() {
		return this.domainName;
	}

	public void setDomainName(String domainName) {
		this.domainName = domainName;
	}

	public String getStartTime() {
		return this.startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getEndTime() {
		return this.endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public List<AttackIpDatas> getAttackIpDataList() {
		return this.attackIpDataList;
	}

	public void setAttackIpDataList(List<AttackIpDatas> attackIpDataList) {
		this.attackIpDataList = attackIpDataList;
	}

	public List<AttackedUrlDatas> getAttackedUrlDataList() {
		return this.attackedUrlDataList;
	}

	public void setAttackedUrlDataList(List<AttackedUrlDatas> attackedUrlDataList) {
		this.attackedUrlDataList = attackedUrlDataList;
	}

	public static class AttackIpDatas {

		private String ip;

		private String attackCount;

		private String result;

		public String getIp() {
			return this.ip;
		}

		public void setIp(String ip) {
			this.ip = ip;
		}

		public String getAttackCount() {
			return this.attackCount;
		}

		public void setAttackCount(String attackCount) {
			this.attackCount = attackCount;
		}

		public String getResult() {
			return this.result;
		}

		public void setResult(String result) {
			this.result = result;
		}
	}

	public static class AttackedUrlDatas {

		private String url;

		private String attackCount;

		private String result;

		public String getUrl() {
			return this.url;
		}

		public void setUrl(String url) {
			this.url = url;
		}

		public String getAttackCount() {
			return this.attackCount;
		}

		public void setAttackCount(String attackCount) {
			this.attackCount = attackCount;
		}

		public String getResult() {
			return this.result;
		}

		public void setResult(String result) {
			this.result = result;
		}
	}

	@Override
	public DescribeDomainCCAttackInfoResponse getInstance(UnmarshallerContext context) {
		return	DescribeDomainCCAttackInfoResponseUnmarshaller.unmarshall(this, context);
	}
}
