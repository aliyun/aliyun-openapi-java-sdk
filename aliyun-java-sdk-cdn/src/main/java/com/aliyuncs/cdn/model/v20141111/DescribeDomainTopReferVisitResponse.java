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
import com.aliyuncs.cdn.transform.v20141111.DescribeDomainTopReferVisitResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDomainTopReferVisitResponse extends AcsResponse {

	private String requestId;

	private String domainName;

	private String startTime;

	private List<ReferList> topReferList;

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

	public List<ReferList> getTopReferList() {
		return this.topReferList;
	}

	public void setTopReferList(List<ReferList> topReferList) {
		this.topReferList = topReferList;
	}

	public static class ReferList {

		private String referDetail;

		private String visitData;

		private Float visitProportion;

		private String flow;

		private Float flowProportion;

		public String getReferDetail() {
			return this.referDetail;
		}

		public void setReferDetail(String referDetail) {
			this.referDetail = referDetail;
		}

		public String getVisitData() {
			return this.visitData;
		}

		public void setVisitData(String visitData) {
			this.visitData = visitData;
		}

		public Float getVisitProportion() {
			return this.visitProportion;
		}

		public void setVisitProportion(Float visitProportion) {
			this.visitProportion = visitProportion;
		}

		public String getFlow() {
			return this.flow;
		}

		public void setFlow(String flow) {
			this.flow = flow;
		}

		public Float getFlowProportion() {
			return this.flowProportion;
		}

		public void setFlowProportion(Float flowProportion) {
			this.flowProportion = flowProportion;
		}
	}

	@Override
	public DescribeDomainTopReferVisitResponse getInstance(UnmarshallerContext context) {
		return	DescribeDomainTopReferVisitResponseUnmarshaller.unmarshall(this, context);
	}
}
