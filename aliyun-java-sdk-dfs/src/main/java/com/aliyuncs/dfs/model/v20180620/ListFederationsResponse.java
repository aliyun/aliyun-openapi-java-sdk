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

package com.aliyuncs.dfs.model.v20180620;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.dfs.transform.v20180620.ListFederationsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListFederationsResponse extends AcsResponse {

	private String requestId;

	private List<Federation> federations;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<Federation> getFederations() {
		return this.federations;
	}

	public void setFederations(List<Federation> federations) {
		this.federations = federations;
	}

	public static class Federation {

		private String federationId;

		private String fileSystemIds;

		public String getFederationId() {
			return this.federationId;
		}

		public void setFederationId(String federationId) {
			this.federationId = federationId;
		}

		public String getFileSystemIds() {
			return this.fileSystemIds;
		}

		public void setFileSystemIds(String fileSystemIds) {
			this.fileSystemIds = fileSystemIds;
		}
	}

	@Override
	public ListFederationsResponse getInstance(UnmarshallerContext context) {
		return	ListFederationsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
