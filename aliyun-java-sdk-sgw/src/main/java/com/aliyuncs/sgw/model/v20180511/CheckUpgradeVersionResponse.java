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

package com.aliyuncs.sgw.model.v20180511;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.sgw.transform.v20180511.CheckUpgradeVersionResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class CheckUpgradeVersionResponse extends AcsResponse {

	private String requestId;

	private String message;

	private String latestVersion;

	private String option;

	private String code;

	private Boolean success;

	private List<Patch> patches;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getLatestVersion() {
		return this.latestVersion;
	}

	public void setLatestVersion(String latestVersion) {
		this.latestVersion = latestVersion;
	}

	public String getOption() {
		return this.option;
	}

	public void setOption(String option) {
		this.option = option;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public List<Patch> getPatches() {
		return this.patches;
	}

	public void setPatches(List<Patch> patches) {
		this.patches = patches;
	}

	public static class Patch {

		private String internalUrl;

		private String url;

		private String name;

		private String mD5;

		public String getInternalUrl() {
			return this.internalUrl;
		}

		public void setInternalUrl(String internalUrl) {
			this.internalUrl = internalUrl;
		}

		public String getUrl() {
			return this.url;
		}

		public void setUrl(String url) {
			this.url = url;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getMD5() {
			return this.mD5;
		}

		public void setMD5(String mD5) {
			this.mD5 = mD5;
		}
	}

	@Override
	public CheckUpgradeVersionResponse getInstance(UnmarshallerContext context) {
		return	CheckUpgradeVersionResponseUnmarshaller.unmarshall(this, context);
	}
}
