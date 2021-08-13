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

package com.aliyuncs.smartag.model.v20180313;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.smartag.transform.v20180313.ListDpiSignaturesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListDpiSignaturesResponse extends AcsResponse {

	private Integer totalCount;

	private String nextToken;

	private String requestId;

	private List<DpiSignatureItem> dpiSignature;

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public String getNextToken() {
		return this.nextToken;
	}

	public void setNextToken(String nextToken) {
		this.nextToken = nextToken;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<DpiSignatureItem> getDpiSignature() {
		return this.dpiSignature;
	}

	public void setDpiSignature(List<DpiSignatureItem> dpiSignature) {
		this.dpiSignature = dpiSignature;
	}

	public static class DpiSignatureItem {

		private String dpiSignatureId;

		private String minSignatureDbVersion;

		private String dpiGroupId;

		private String minEngineVersion;

		private String dpiSignatureName;

		public String getDpiSignatureId() {
			return this.dpiSignatureId;
		}

		public void setDpiSignatureId(String dpiSignatureId) {
			this.dpiSignatureId = dpiSignatureId;
		}

		public String getMinSignatureDbVersion() {
			return this.minSignatureDbVersion;
		}

		public void setMinSignatureDbVersion(String minSignatureDbVersion) {
			this.minSignatureDbVersion = minSignatureDbVersion;
		}

		public String getDpiGroupId() {
			return this.dpiGroupId;
		}

		public void setDpiGroupId(String dpiGroupId) {
			this.dpiGroupId = dpiGroupId;
		}

		public String getMinEngineVersion() {
			return this.minEngineVersion;
		}

		public void setMinEngineVersion(String minEngineVersion) {
			this.minEngineVersion = minEngineVersion;
		}

		public String getDpiSignatureName() {
			return this.dpiSignatureName;
		}

		public void setDpiSignatureName(String dpiSignatureName) {
			this.dpiSignatureName = dpiSignatureName;
		}
	}

	@Override
	public ListDpiSignaturesResponse getInstance(UnmarshallerContext context) {
		return	ListDpiSignaturesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
