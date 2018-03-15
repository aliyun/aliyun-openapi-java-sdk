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

package com.aliyuncs.cdn.model.v20141111;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.cdn.transform.v20141111.DescribeLiveSpecificDomainMappingResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeLiveSpecificDomainMappingResponse extends AcsResponse {

	private String requestId;

	private List<DomainMappingModel> domainMappingModels;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<DomainMappingModel> getDomainMappingModels() {
		return this.domainMappingModels;
	}

	public void setDomainMappingModels(List<DomainMappingModel> domainMappingModels) {
		this.domainMappingModels = domainMappingModels;
	}

	public static class DomainMappingModel {

		private String pushDomain;

		private String pullDomain;

		public String getPushDomain() {
			return this.pushDomain;
		}

		public void setPushDomain(String pushDomain) {
			this.pushDomain = pushDomain;
		}

		public String getPullDomain() {
			return this.pullDomain;
		}

		public void setPullDomain(String pullDomain) {
			this.pullDomain = pullDomain;
		}
	}

	@Override
	public DescribeLiveSpecificDomainMappingResponse getInstance(UnmarshallerContext context) {
		return	DescribeLiveSpecificDomainMappingResponseUnmarshaller.unmarshall(this, context);
	}
}
