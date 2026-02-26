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

package com.aliyuncs.ecs.model.v20140526;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecs.transform.v20140526.DescribeElasticityAssuranceAutoRenewAttributeResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeElasticityAssuranceAutoRenewAttributeResponse extends AcsResponse {

	private String requestId;

	private List<ElasticityAssuranceRenewAttribute> elasticityAssuranceRenewAttributes;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<ElasticityAssuranceRenewAttribute> getElasticityAssuranceRenewAttributes() {
		return this.elasticityAssuranceRenewAttributes;
	}

	public void setElasticityAssuranceRenewAttributes(List<ElasticityAssuranceRenewAttribute> elasticityAssuranceRenewAttributes) {
		this.elasticityAssuranceRenewAttributes = elasticityAssuranceRenewAttributes;
	}

	public static class ElasticityAssuranceRenewAttribute {

		private String periodUnit;

		private Integer period;

		private String privatePoolOptionsId;

		private String renewalStatus;

		public String getPeriodUnit() {
			return this.periodUnit;
		}

		public void setPeriodUnit(String periodUnit) {
			this.periodUnit = periodUnit;
		}

		public Integer getPeriod() {
			return this.period;
		}

		public void setPeriod(Integer period) {
			this.period = period;
		}

		public String getPrivatePoolOptionsId() {
			return this.privatePoolOptionsId;
		}

		public void setPrivatePoolOptionsId(String privatePoolOptionsId) {
			this.privatePoolOptionsId = privatePoolOptionsId;
		}

		public String getRenewalStatus() {
			return this.renewalStatus;
		}

		public void setRenewalStatus(String renewalStatus) {
			this.renewalStatus = renewalStatus;
		}
	}

	@Override
	public DescribeElasticityAssuranceAutoRenewAttributeResponse getInstance(UnmarshallerContext context) {
		return	DescribeElasticityAssuranceAutoRenewAttributeResponseUnmarshaller.unmarshall(this, context);
	}
}
