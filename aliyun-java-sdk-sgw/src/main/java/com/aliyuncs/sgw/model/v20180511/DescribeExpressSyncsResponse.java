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
import com.aliyuncs.sgw.transform.v20180511.DescribeExpressSyncsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeExpressSyncsResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String code;

	private String message;

	private List<ExpressSync> expressSyncs;

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

	public List<ExpressSync> getExpressSyncs() {
		return this.expressSyncs;
	}

	public void setExpressSyncs(List<ExpressSync> expressSyncs) {
		this.expressSyncs = expressSyncs;
	}

	public static class ExpressSync {

		private String expressSyncId;

		private String name;

		private String description;

		private String bucketRegion;

		private String bucketName;

		private String bucketPrefix;

		private String mnsTopic;

		public String getExpressSyncId() {
			return this.expressSyncId;
		}

		public void setExpressSyncId(String expressSyncId) {
			this.expressSyncId = expressSyncId;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getBucketRegion() {
			return this.bucketRegion;
		}

		public void setBucketRegion(String bucketRegion) {
			this.bucketRegion = bucketRegion;
		}

		public String getBucketName() {
			return this.bucketName;
		}

		public void setBucketName(String bucketName) {
			this.bucketName = bucketName;
		}

		public String getBucketPrefix() {
			return this.bucketPrefix;
		}

		public void setBucketPrefix(String bucketPrefix) {
			this.bucketPrefix = bucketPrefix;
		}

		public String getMnsTopic() {
			return this.mnsTopic;
		}

		public void setMnsTopic(String mnsTopic) {
			this.mnsTopic = mnsTopic;
		}
	}

	@Override
	public DescribeExpressSyncsResponse getInstance(UnmarshallerContext context) {
		return	DescribeExpressSyncsResponseUnmarshaller.unmarshall(this, context);
	}
}
