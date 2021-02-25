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

package com.aliyuncs.oos.model.v20190601;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.oos.transform.v20190601.ListInstancePatchesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListInstancePatchesResponse extends AcsResponse {

	private Integer maxResults;

	private String nextToken;

	private String requestId;

	private List<Patch> patches;

	public Integer getMaxResults() {
		return this.maxResults;
	}

	public void setMaxResults(Integer maxResults) {
		this.maxResults = maxResults;
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

	public List<Patch> getPatches() {
		return this.patches;
	}

	public void setPatches(List<Patch> patches) {
		this.patches = patches;
	}

	public static class Patch {

		private String classification;

		private String installedTime;

		private String kBId;

		private String severity;

		private String status;

		private String title;

		public String getClassification() {
			return this.classification;
		}

		public void setClassification(String classification) {
			this.classification = classification;
		}

		public String getInstalledTime() {
			return this.installedTime;
		}

		public void setInstalledTime(String installedTime) {
			this.installedTime = installedTime;
		}

		public String getKBId() {
			return this.kBId;
		}

		public void setKBId(String kBId) {
			this.kBId = kBId;
		}

		public String getSeverity() {
			return this.severity;
		}

		public void setSeverity(String severity) {
			this.severity = severity;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getTitle() {
			return this.title;
		}

		public void setTitle(String title) {
			this.title = title;
		}
	}

	@Override
	public ListInstancePatchesResponse getInstance(UnmarshallerContext context) {
		return	ListInstancePatchesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
