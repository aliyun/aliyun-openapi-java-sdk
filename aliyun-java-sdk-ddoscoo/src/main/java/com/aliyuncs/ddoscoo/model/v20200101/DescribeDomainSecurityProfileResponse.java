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

package com.aliyuncs.ddoscoo.model.v20200101;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ddoscoo.transform.v20200101.DescribeDomainSecurityProfileResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDomainSecurityProfileResponse extends AcsResponse {

	private String requestId;

	private List<Data> result;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<Data> getResult() {
		return this.result;
	}

	public void setResult(List<Data> result) {
		this.result = result;
	}

	public static class Data {

		private String globalMode;

		private Boolean globalEnable;

		public String getGlobalMode() {
			return this.globalMode;
		}

		public void setGlobalMode(String globalMode) {
			this.globalMode = globalMode;
		}

		public Boolean getGlobalEnable() {
			return this.globalEnable;
		}

		public void setGlobalEnable(Boolean globalEnable) {
			this.globalEnable = globalEnable;
		}
	}

	@Override
	public DescribeDomainSecurityProfileResponse getInstance(UnmarshallerContext context) {
		return	DescribeDomainSecurityProfileResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
