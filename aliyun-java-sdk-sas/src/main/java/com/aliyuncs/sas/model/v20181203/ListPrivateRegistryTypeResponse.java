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
import com.aliyuncs.sas.transform.v20181203.ListPrivateRegistryTypeResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListPrivateRegistryTypeResponse extends AcsResponse {

	private String requestId;

	private List<RegistryTypeInfo> registryTypeInfos;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<RegistryTypeInfo> getRegistryTypeInfos() {
		return this.registryTypeInfos;
	}

	public void setRegistryTypeInfos(List<RegistryTypeInfo> registryTypeInfos) {
		this.registryTypeInfos = registryTypeInfos;
	}

	public static class RegistryTypeInfo {

		private String registryType;

		private Long count;

		public String getRegistryType() {
			return this.registryType;
		}

		public void setRegistryType(String registryType) {
			this.registryType = registryType;
		}

		public Long getCount() {
			return this.count;
		}

		public void setCount(Long count) {
			this.count = count;
		}
	}

	@Override
	public ListPrivateRegistryTypeResponse getInstance(UnmarshallerContext context) {
		return	ListPrivateRegistryTypeResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
