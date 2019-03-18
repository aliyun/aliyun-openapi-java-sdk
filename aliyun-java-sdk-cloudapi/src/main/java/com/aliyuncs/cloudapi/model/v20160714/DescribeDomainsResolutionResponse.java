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
package com.aliyuncs.cloudapi.model.v20160714;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.cloudapi.transform.v20160714.DescribeDomainsResolutionResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

import java.util.List;

/**
 * @author auto create
 * @version 
 */
public class DescribeDomainsResolutionResponse extends AcsResponse {

	private String requestId;

	private String groupId;

	private List<DomainResolution> domainResolutions;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getGroupId() {
		return this.groupId;
	}

	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}

	public List<DomainResolution> getDomainResolutions() {
		return this.domainResolutions;
	}

	public void setDomainResolutions(List<DomainResolution> domainResolutions) {
		this.domainResolutions = domainResolutions;
	}

	public static class DomainResolution {

		private String domainName;

		private String domainResolutionStatus;

		public String getDomainName() {
			return this.domainName;
		}

		public void setDomainName(String domainName) {
			this.domainName = domainName;
		}

		public String getDomainResolutionStatus() {
			return this.domainResolutionStatus;
		}

		public void setDomainResolutionStatus(String domainResolutionStatus) {
			this.domainResolutionStatus = domainResolutionStatus;
		}
	}

	@Override
	public DescribeDomainsResolutionResponse getInstance(UnmarshallerContext context) {
		return	DescribeDomainsResolutionResponseUnmarshaller.unmarshall(this, context);
	}
}
