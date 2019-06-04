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

package com.aliyuncs.live.model.v20161101;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.live.transform.v20161101.DescribeLiveDomainMappingResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeLiveDomainMappingResponse extends AcsResponse {

	private String requestId;

	private List<LiveDomainModel> liveDomainModels;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<LiveDomainModel> getLiveDomainModels() {
		return this.liveDomainModels;
	}

	public void setLiveDomainModels(List<LiveDomainModel> liveDomainModels) {
		this.liveDomainModels = liveDomainModels;
	}

	public static class LiveDomainModel {

		private String domainName;

		private String type;

		public String getDomainName() {
			return this.domainName;
		}

		public void setDomainName(String domainName) {
			this.domainName = domainName;
		}

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}
	}

	@Override
	public DescribeLiveDomainMappingResponse getInstance(UnmarshallerContext context) {
		return	DescribeLiveDomainMappingResponseUnmarshaller.unmarshall(this, context);
	}
}
