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

package com.aliyuncs.zhuque.model.v20160701;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.zhuque.transform.v20160701.QueryProject4PimsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryProject4PimsResponse extends AcsResponse {

	private String requestId;

	private List<VersionItem> versionItemList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<VersionItem> getVersionItemList() {
		return this.versionItemList;
	}

	public void setVersionItemList(List<VersionItem> versionItemList) {
		this.versionItemList = versionItemList;
	}

	public static class VersionItem {

		private String versionId;

		private String versionName;

		private String status;

		private String modifyTime;

		private String modifier;

		public String getVersionId() {
			return this.versionId;
		}

		public void setVersionId(String versionId) {
			this.versionId = versionId;
		}

		public String getVersionName() {
			return this.versionName;
		}

		public void setVersionName(String versionName) {
			this.versionName = versionName;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getModifyTime() {
			return this.modifyTime;
		}

		public void setModifyTime(String modifyTime) {
			this.modifyTime = modifyTime;
		}

		public String getModifier() {
			return this.modifier;
		}

		public void setModifier(String modifier) {
			this.modifier = modifier;
		}
	}

	@Override
	public QueryProject4PimsResponse getInstance(UnmarshallerContext context) {
		return	QueryProject4PimsResponseUnmarshaller.unmarshall(this, context);
	}
}
