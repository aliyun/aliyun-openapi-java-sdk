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

package com.aliyuncs.ecsops.model.v20160401;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecsops.transform.v20160401.OpsDescribeBusinessPropertiesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class OpsDescribeBusinessPropertiesResponse extends AcsResponse {

	private String requestId;

	private List<BusinessPropertySet> businessPropertySets;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<BusinessPropertySet> getBusinessPropertySets() {
		return this.businessPropertySets;
	}

	public void setBusinessPropertySets(List<BusinessPropertySet> businessPropertySets) {
		this.businessPropertySets = businessPropertySets;
	}

	public static class BusinessPropertySet {

		private Long id;

		private Long businessId;

		private String propertyCode;

		private String propertyValue;

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public Long getBusinessId() {
			return this.businessId;
		}

		public void setBusinessId(Long businessId) {
			this.businessId = businessId;
		}

		public String getPropertyCode() {
			return this.propertyCode;
		}

		public void setPropertyCode(String propertyCode) {
			this.propertyCode = propertyCode;
		}

		public String getPropertyValue() {
			return this.propertyValue;
		}

		public void setPropertyValue(String propertyValue) {
			this.propertyValue = propertyValue;
		}
	}

	@Override
	public OpsDescribeBusinessPropertiesResponse getInstance(UnmarshallerContext context) {
		return	OpsDescribeBusinessPropertiesResponseUnmarshaller.unmarshall(this, context);
	}
}
