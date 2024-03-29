/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.dcdn.model.v20180115;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.dcdn.transform.v20180115.DescribeDcdnDomainTopReferVisitResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDcdnDomainTopReferVisitResponse extends AcsResponse {

	private String startTime;

	private String requestId;

	private String domainName;

	private List<ReferList> topReferList;

	public String getStartTime() {
		return this.startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

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

	public List<ReferList> getTopReferList() {
		return this.topReferList;
	}

	public void setTopReferList(List<ReferList> topReferList) {
		this.topReferList = topReferList;
	}

	public static class ReferList {

		private String flow;

		private Float flowProportion;

		private String visitData;

		private String referDetail;

		private Float visitProportion;

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

		public String getVisitData() {
			return this.visitData;
		}

		public void setVisitData(String visitData) {
			this.visitData = visitData;
		}

		public String getReferDetail() {
			return this.referDetail;
		}

		public void setReferDetail(String referDetail) {
			this.referDetail = referDetail;
		}

		public Float getVisitProportion() {
			return this.visitProportion;
		}

		public void setVisitProportion(Float visitProportion) {
			this.visitProportion = visitProportion;
		}
	}

	@Override
	public DescribeDcdnDomainTopReferVisitResponse getInstance(UnmarshallerContext context) {
		return	DescribeDcdnDomainTopReferVisitResponseUnmarshaller.unmarshall(this, context);
	}
}
