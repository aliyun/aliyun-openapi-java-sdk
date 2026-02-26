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

package com.aliyuncs.sas.model.v20181203;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.sas.transform.v20181203.ListInstanceCatalogResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListInstanceCatalogResponse extends AcsResponse {

	private String requestId;

	private List<VendorsItem> vendors;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<VendorsItem> getVendors() {
		return this.vendors;
	}

	public void setVendors(List<VendorsItem> vendors) {
		this.vendors = vendors;
	}

	public static class VendorsItem {

		private String name;

		private List<InstanceTypesItem> instanceTypes;

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public List<InstanceTypesItem> getInstanceTypes() {
			return this.instanceTypes;
		}

		public void setInstanceTypes(List<InstanceTypesItem> instanceTypes) {
			this.instanceTypes = instanceTypes;
		}

		public static class InstanceTypesItem {

			private String name;

			private List<InstanceSubTypesItem> instanceSubTypes;

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public List<InstanceSubTypesItem> getInstanceSubTypes() {
				return this.instanceSubTypes;
			}

			public void setInstanceSubTypes(List<InstanceSubTypesItem> instanceSubTypes) {
				this.instanceSubTypes = instanceSubTypes;
			}

			public static class InstanceSubTypesItem {

				private String name;

				public String getName() {
					return this.name;
				}

				public void setName(String name) {
					this.name = name;
				}
			}
		}
	}

	@Override
	public ListInstanceCatalogResponse getInstance(UnmarshallerContext context) {
		return	ListInstanceCatalogResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
