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

package com.aliyuncs.hbase.model.v20170115;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.hbase.transform.v20170115.DescribeSubscriptionsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeSubscriptionsResponse extends AcsResponse {

	private String requestId;

	private List<Items> subscriptions;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<Items> getSubscriptions() {
		return this.subscriptions;
	}

	public void setSubscriptions(List<Items> subscriptions) {
		this.subscriptions = subscriptions;
	}

	public static class Items {

		private String subscriptionId;

		private String subscriptionType;

		private String subscriptionDescription;

		private String subscriptionStatus;

		private String mapping;

		private List<Items1> dBInstances;

		public String getSubscriptionId() {
			return this.subscriptionId;
		}

		public void setSubscriptionId(String subscriptionId) {
			this.subscriptionId = subscriptionId;
		}

		public String getSubscriptionType() {
			return this.subscriptionType;
		}

		public void setSubscriptionType(String subscriptionType) {
			this.subscriptionType = subscriptionType;
		}

		public String getSubscriptionDescription() {
			return this.subscriptionDescription;
		}

		public void setSubscriptionDescription(String subscriptionDescription) {
			this.subscriptionDescription = subscriptionDescription;
		}

		public String getSubscriptionStatus() {
			return this.subscriptionStatus;
		}

		public void setSubscriptionStatus(String subscriptionStatus) {
			this.subscriptionStatus = subscriptionStatus;
		}

		public String getMapping() {
			return this.mapping;
		}

		public void setMapping(String mapping) {
			this.mapping = mapping;
		}

		public List<Items1> getDBInstances() {
			return this.dBInstances;
		}

		public void setDBInstances(List<Items1> dBInstances) {
			this.dBInstances = dBInstances;
		}

		public static class Items1 {

			private String dBInstanceId;

			private String regionId;

			private String role;

			public String getDBInstanceId() {
				return this.dBInstanceId;
			}

			public void setDBInstanceId(String dBInstanceId) {
				this.dBInstanceId = dBInstanceId;
			}

			public String getBizRegionId() {
				return this.regionId;
			}

			public void setBizRegionId(String regionId) {
				this.regionId = regionId;
			}

			/**
			 * @deprecated use getBizRegionId instead of this.
			 */
			@Deprecated
			public String getRegionId() {
				return this.regionId;
			}

			/**
			 * @deprecated use setBizRegionId instead of this.
			 */
			@Deprecated
			public void setRegionId(String regionId) {
				this.regionId = regionId;
			}

			public String getRole() {
				return this.role;
			}

			public void setRole(String role) {
				this.role = role;
			}
		}
	}

	@Override
	public DescribeSubscriptionsResponse getInstance(UnmarshallerContext context) {
		return	DescribeSubscriptionsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
