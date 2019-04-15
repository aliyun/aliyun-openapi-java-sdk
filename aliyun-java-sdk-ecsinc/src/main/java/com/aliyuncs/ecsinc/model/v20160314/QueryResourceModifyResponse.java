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

package com.aliyuncs.ecsinc.model.v20160314;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecsinc.transform.v20160314.QueryResourceModifyResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryResourceModifyResponse extends AcsResponse {

	private String requestId;

	private List<Resource> resources;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<Resource> getResources() {
		return this.resources;
	}

	public void setResources(List<Resource> resources) {
		this.resources = resources;
	}

	public static class Resource {

		private Boolean ioOptimized;

		private List<String> systemDiskCategories;

		private List<String> dataDiskCategories;

		private List<String> networkTypes;

		private List<String> instanceTypes;

		private List<String> instanceTypeFamilies;

		private List<String> instanceGenerations;

		public Boolean getIoOptimized() {
			return this.ioOptimized;
		}

		public void setIoOptimized(Boolean ioOptimized) {
			this.ioOptimized = ioOptimized;
		}

		public List<String> getSystemDiskCategories() {
			return this.systemDiskCategories;
		}

		public void setSystemDiskCategories(List<String> systemDiskCategories) {
			this.systemDiskCategories = systemDiskCategories;
		}

		public List<String> getDataDiskCategories() {
			return this.dataDiskCategories;
		}

		public void setDataDiskCategories(List<String> dataDiskCategories) {
			this.dataDiskCategories = dataDiskCategories;
		}

		public List<String> getNetworkTypes() {
			return this.networkTypes;
		}

		public void setNetworkTypes(List<String> networkTypes) {
			this.networkTypes = networkTypes;
		}

		public List<String> getInstanceTypes() {
			return this.instanceTypes;
		}

		public void setInstanceTypes(List<String> instanceTypes) {
			this.instanceTypes = instanceTypes;
		}

		public List<String> getInstanceTypeFamilies() {
			return this.instanceTypeFamilies;
		}

		public void setInstanceTypeFamilies(List<String> instanceTypeFamilies) {
			this.instanceTypeFamilies = instanceTypeFamilies;
		}

		public List<String> getInstanceGenerations() {
			return this.instanceGenerations;
		}

		public void setInstanceGenerations(List<String> instanceGenerations) {
			this.instanceGenerations = instanceGenerations;
		}
	}

	@Override
	public QueryResourceModifyResponse getInstance(UnmarshallerContext context) {
		return	QueryResourceModifyResponseUnmarshaller.unmarshall(this, context);
	}
}
