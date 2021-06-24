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
import com.aliyuncs.ecsops.transform.v20160401.OpsEccHistoryQueryByClusterNameResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class OpsEccHistoryQueryByClusterNameResponse extends AcsResponse {

	private String message;

	private String requestId;

	private List<ClusterRenderHistory> data;

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<ClusterRenderHistory> getData() {
		return this.data;
	}

	public void setData(List<ClusterRenderHistory> data) {
		this.data = data;
	}

	public static class ClusterRenderHistory {

		private Integer checkCount;

		private String clusterInventory;

		private String validCount;

		private Long checkTS;

		private String clusterName;

		private List<String> checkItems;

		public Integer getCheckCount() {
			return this.checkCount;
		}

		public void setCheckCount(Integer checkCount) {
			this.checkCount = checkCount;
		}

		public String getClusterInventory() {
			return this.clusterInventory;
		}

		public void setClusterInventory(String clusterInventory) {
			this.clusterInventory = clusterInventory;
		}

		public String getValidCount() {
			return this.validCount;
		}

		public void setValidCount(String validCount) {
			this.validCount = validCount;
		}

		public Long getCheckTS() {
			return this.checkTS;
		}

		public void setCheckTS(Long checkTS) {
			this.checkTS = checkTS;
		}

		public String getClusterName() {
			return this.clusterName;
		}

		public void setClusterName(String clusterName) {
			this.clusterName = clusterName;
		}

		public List<String> getCheckItems() {
			return this.checkItems;
		}

		public void setCheckItems(List<String> checkItems) {
			this.checkItems = checkItems;
		}
	}

	@Override
	public OpsEccHistoryQueryByClusterNameResponse getInstance(UnmarshallerContext context) {
		return	OpsEccHistoryQueryByClusterNameResponseUnmarshaller.unmarshall(this, context);
	}
}
