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

package com.aliyuncs.ecs.model.v20160314;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecs.transform.v20160314.DescribeAccountQuotaAttributesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeAccountQuotaAttributesResponse extends AcsResponse {

	private String requestId;

	private QuotaAttributes quotaAttributes;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public QuotaAttributes getQuotaAttributes() {
		return this.quotaAttributes;
	}

	public void setQuotaAttributes(QuotaAttributes quotaAttributes) {
		this.quotaAttributes = quotaAttributes;
	}

	public static class QuotaAttributes {

		private Boolean ecsElasticQuotaEnable;

		public Boolean getEcsElasticQuotaEnable() {
			return this.ecsElasticQuotaEnable;
		}

		public void setEcsElasticQuotaEnable(Boolean ecsElasticQuotaEnable) {
			this.ecsElasticQuotaEnable = ecsElasticQuotaEnable;
		}
	}

	@Override
	public DescribeAccountQuotaAttributesResponse getInstance(UnmarshallerContext context) {
		return	DescribeAccountQuotaAttributesResponseUnmarshaller.unmarshall(this, context);
	}
}
