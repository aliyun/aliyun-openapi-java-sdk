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

package com.aliyuncs.polardb.model.v20170801;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.polardb.transform.v20170801.DescribeDBMiniEngineVersionsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDBMiniEngineVersionsResponse extends AcsResponse {

	private String requestId;

	private List<DBRevisionVersionListItem> dBRevisionVersionList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<DBRevisionVersionListItem> getDBRevisionVersionList() {
		return this.dBRevisionVersionList;
	}

	public void setDBRevisionVersionList(List<DBRevisionVersionListItem> dBRevisionVersionList) {
		this.dBRevisionVersionList = dBRevisionVersionList;
	}

	public static class DBRevisionVersionListItem {

		private String releaseNote;

		private String releaseType;

		private String revisionVersionCode;

		private String revisionVersionName;

		public String getReleaseNote() {
			return this.releaseNote;
		}

		public void setReleaseNote(String releaseNote) {
			this.releaseNote = releaseNote;
		}

		public String getReleaseType() {
			return this.releaseType;
		}

		public void setReleaseType(String releaseType) {
			this.releaseType = releaseType;
		}

		public String getRevisionVersionCode() {
			return this.revisionVersionCode;
		}

		public void setRevisionVersionCode(String revisionVersionCode) {
			this.revisionVersionCode = revisionVersionCode;
		}

		public String getRevisionVersionName() {
			return this.revisionVersionName;
		}

		public void setRevisionVersionName(String revisionVersionName) {
			this.revisionVersionName = revisionVersionName;
		}
	}

	@Override
	public DescribeDBMiniEngineVersionsResponse getInstance(UnmarshallerContext context) {
		return	DescribeDBMiniEngineVersionsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
