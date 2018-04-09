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

package com.aliyuncs.emr.model.v20160408;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.emr.transform.v20160408.DescribeStackRelationResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeStackRelationResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private List<EmrStackRelation> emrStackRelationList;

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

	public List<EmrStackRelation> getEmrStackRelationList() {
		return this.emrStackRelationList;
	}

	public void setEmrStackRelationList(List<EmrStackRelation> emrStackRelationList) {
		this.emrStackRelationList = emrStackRelationList;
	}

	public static class EmrStackRelation {

		private String emrVersion;

		private String stackVersion;

		public String getEmrVersion() {
			return this.emrVersion;
		}

		public void setEmrVersion(String emrVersion) {
			this.emrVersion = emrVersion;
		}

		public String getStackVersion() {
			return this.stackVersion;
		}

		public void setStackVersion(String stackVersion) {
			this.stackVersion = stackVersion;
		}
	}

	@Override
	public DescribeStackRelationResponse getInstance(UnmarshallerContext context) {
		return	DescribeStackRelationResponseUnmarshaller.unmarshall(this, context);
	}
}
