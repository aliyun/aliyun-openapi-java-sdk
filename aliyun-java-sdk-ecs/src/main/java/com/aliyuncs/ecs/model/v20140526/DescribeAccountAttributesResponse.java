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
import com.aliyuncs.ecs.transform.v20140526.DescribeAccountAttributesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeAccountAttributesResponse extends AcsResponse {

	private String requestId;

	private List<AccountAttributeItem> accountAttributeItems;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<AccountAttributeItem> getAccountAttributeItems() {
		return this.accountAttributeItems;
	}

	public void setAccountAttributeItems(List<AccountAttributeItem> accountAttributeItems) {
		this.accountAttributeItems = accountAttributeItems;
	}

	public static class AccountAttributeItem {

		private String attributeName;

		private List<ValueItem> attributeValues;

		public String getAttributeName() {
			return this.attributeName;
		}

		public void setAttributeName(String attributeName) {
			this.attributeName = attributeName;
		}

		public List<ValueItem> getAttributeValues() {
			return this.attributeValues;
		}

		public void setAttributeValues(List<ValueItem> attributeValues) {
			this.attributeValues = attributeValues;
		}

		public static class ValueItem {

			private String value;

			private String expiredTime;

			private String zoneId;

			private String instanceChargeType;

			private String instanceType;

			private Integer count;

			public String getValue() {
				return this.value;
			}

			public void setValue(String value) {
				this.value = value;
			}

			public String getExpiredTime() {
				return this.expiredTime;
			}

			public void setExpiredTime(String expiredTime) {
				this.expiredTime = expiredTime;
			}

			public String getZoneId() {
				return this.zoneId;
			}

			public void setZoneId(String zoneId) {
				this.zoneId = zoneId;
			}

			public String getInstanceChargeType() {
				return this.instanceChargeType;
			}

			public void setInstanceChargeType(String instanceChargeType) {
				this.instanceChargeType = instanceChargeType;
			}

			public String getInstanceType() {
				return this.instanceType;
			}

			public void setInstanceType(String instanceType) {
				this.instanceType = instanceType;
			}

			public Integer getCount() {
				return this.count;
			}

			public void setCount(Integer count) {
				this.count = count;
			}
		}
	}

	@Override
	public DescribeAccountAttributesResponse getInstance(UnmarshallerContext context) {
		return	DescribeAccountAttributesResponseUnmarshaller.unmarshall(this, context);
	}
}
