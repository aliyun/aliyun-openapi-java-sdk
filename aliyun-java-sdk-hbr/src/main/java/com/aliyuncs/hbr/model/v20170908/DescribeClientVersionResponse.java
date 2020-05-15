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

package com.aliyuncs.hbr.model.v20170908;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.hbr.transform.v20170908.DescribeClientVersionResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeClientVersionResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String code;

	private String message;

	private String minVersion;

	private String maxVersion;

	private UpdateOpinion updateOpinion;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getMinVersion() {
		return this.minVersion;
	}

	public void setMinVersion(String minVersion) {
		this.minVersion = minVersion;
	}

	public String getMaxVersion() {
		return this.maxVersion;
	}

	public void setMaxVersion(String maxVersion) {
		this.maxVersion = maxVersion;
	}

	public UpdateOpinion getUpdateOpinion() {
		return this.updateOpinion;
	}

	public void setUpdateOpinion(UpdateOpinion updateOpinion) {
		this.updateOpinion = updateOpinion;
	}

	public static class UpdateOpinion {

		private String action;

		private String version;

		private List<PatchDetail> patchDetails;

		public String getAction() {
			return this.action;
		}

		public void setAction(String action) {
			this.action = action;
		}

		public String getVersion() {
			return this.version;
		}

		public void setVersion(String version) {
			this.version = version;
		}

		public List<PatchDetail> getPatchDetails() {
			return this.patchDetails;
		}

		public void setPatchDetails(List<PatchDetail> patchDetails) {
			this.patchDetails = patchDetails;
		}

		public static class PatchDetail {

			private String version;

			private String fileName;

			private Long size;

			private String url;

			public String getVersion() {
				return this.version;
			}

			public void setVersion(String version) {
				this.version = version;
			}

			public String getFileName() {
				return this.fileName;
			}

			public void setFileName(String fileName) {
				this.fileName = fileName;
			}

			public Long getSize() {
				return this.size;
			}

			public void setSize(Long size) {
				this.size = size;
			}

			public String getUrl() {
				return this.url;
			}

			public void setUrl(String url) {
				this.url = url;
			}
		}
	}

	@Override
	public DescribeClientVersionResponse getInstance(UnmarshallerContext context) {
		return	DescribeClientVersionResponseUnmarshaller.unmarshall(this, context);
	}
}
