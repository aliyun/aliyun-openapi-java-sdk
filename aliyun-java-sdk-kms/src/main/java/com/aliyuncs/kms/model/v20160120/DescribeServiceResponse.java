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

package com.aliyuncs.kms.model.v20160120;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.kms.transform.v20160120.DescribeServiceResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeServiceResponse extends AcsResponse {

	private String requestId;

	private List<ProtectionLevel> protectionLevels;

	private List<KeySpec> keySpecs;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<ProtectionLevel> getProtectionLevels() {
		return this.protectionLevels;
	}

	public void setProtectionLevels(List<ProtectionLevel> protectionLevels) {
		this.protectionLevels = protectionLevels;
	}

	public List<KeySpec> getKeySpecs() {
		return this.keySpecs;
	}

	public void setKeySpecs(List<KeySpec> keySpecs) {
		this.keySpecs = keySpecs;
	}

	public static class ProtectionLevel {

		private String type;

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}
	}

	public static class KeySpec {

		private String name;

		private List<String> supportedProtectionLevels;

		private List<String> usages;

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public List<String> getSupportedProtectionLevels() {
			return this.supportedProtectionLevels;
		}

		public void setSupportedProtectionLevels(List<String> supportedProtectionLevels) {
			this.supportedProtectionLevels = supportedProtectionLevels;
		}

		public List<String> getUsages() {
			return this.usages;
		}

		public void setUsages(List<String> usages) {
			this.usages = usages;
		}
	}

	@Override
	public DescribeServiceResponse getInstance(UnmarshallerContext context) {
		return	DescribeServiceResponseUnmarshaller.unmarshall(this, context);
	}
}
