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

package com.aliyuncs.ecsops.model.v20160401;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecsops.transform.v20160401.OpsQueryInstanceVfioDeviceBdfsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class OpsQueryInstanceVfioDeviceBdfsResponse extends AcsResponse {

	private String requestId;

	private List<Bdf> bdfList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<Bdf> getBdfList() {
		return this.bdfList;
	}

	public void setBdfList(List<Bdf> bdfList) {
		this.bdfList = bdfList;
	}

	public static class Bdf {

		private String sourceDomain;

		private String sourceBdf;

		private String targetDomain;

		private String targetBdf;

		public String getSourceDomain() {
			return this.sourceDomain;
		}

		public void setSourceDomain(String sourceDomain) {
			this.sourceDomain = sourceDomain;
		}

		public String getSourceBdf() {
			return this.sourceBdf;
		}

		public void setSourceBdf(String sourceBdf) {
			this.sourceBdf = sourceBdf;
		}

		public String getTargetDomain() {
			return this.targetDomain;
		}

		public void setTargetDomain(String targetDomain) {
			this.targetDomain = targetDomain;
		}

		public String getTargetBdf() {
			return this.targetBdf;
		}

		public void setTargetBdf(String targetBdf) {
			this.targetBdf = targetBdf;
		}
	}

	@Override
	public OpsQueryInstanceVfioDeviceBdfsResponse getInstance(UnmarshallerContext context) {
		return	OpsQueryInstanceVfioDeviceBdfsResponseUnmarshaller.unmarshall(this, context);
	}
}
