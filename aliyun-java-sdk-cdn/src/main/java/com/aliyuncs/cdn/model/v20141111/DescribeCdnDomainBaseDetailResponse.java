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
import com.aliyuncs.cdn.transform.v20141111.DescribeCdnDomainBaseDetailResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeCdnDomainBaseDetailResponse extends AcsResponse {

	private String requestId;

	private DomainBaseDetailModel domainBaseDetailModel;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public DomainBaseDetailModel getDomainBaseDetailModel() {
		return this.domainBaseDetailModel;
	}

	public void setDomainBaseDetailModel(DomainBaseDetailModel domainBaseDetailModel) {
		this.domainBaseDetailModel = domainBaseDetailModel;
	}

	public static class DomainBaseDetailModel {

		private String cname;

		private String cdnType;

		private String domainStatus;

		private String sourceType;

		private String region;

		private String domainName;

		private String remark;

		private String gmtModified;

		private String gmtCreated;

		private List<String> sources;

		public String getCname() {
			return this.cname;
		}

		public void setCname(String cname) {
			this.cname = cname;
		}

		public String getCdnType() {
			return this.cdnType;
		}

		public void setCdnType(String cdnType) {
			this.cdnType = cdnType;
		}

		public String getDomainStatus() {
			return this.domainStatus;
		}

		public void setDomainStatus(String domainStatus) {
			this.domainStatus = domainStatus;
		}

		public String getSourceType() {
			return this.sourceType;
		}

		public void setSourceType(String sourceType) {
			this.sourceType = sourceType;
		}

		public String getRegion() {
			return this.region;
		}

		public void setRegion(String region) {
			this.region = region;
		}

		public String getDomainName() {
			return this.domainName;
		}

		public void setDomainName(String domainName) {
			this.domainName = domainName;
		}

		public String getRemark() {
			return this.remark;
		}

		public void setRemark(String remark) {
			this.remark = remark;
		}

		public String getGmtModified() {
			return this.gmtModified;
		}

		public void setGmtModified(String gmtModified) {
			this.gmtModified = gmtModified;
		}

		public String getGmtCreated() {
			return this.gmtCreated;
		}

		public void setGmtCreated(String gmtCreated) {
			this.gmtCreated = gmtCreated;
		}

		public List<String> getSources() {
			return this.sources;
		}

		public void setSources(List<String> sources) {
			this.sources = sources;
		}
	}

	@Override
	public DescribeCdnDomainBaseDetailResponse getInstance(UnmarshallerContext context) {
		return	DescribeCdnDomainBaseDetailResponseUnmarshaller.unmarshall(this, context);
	}
}
