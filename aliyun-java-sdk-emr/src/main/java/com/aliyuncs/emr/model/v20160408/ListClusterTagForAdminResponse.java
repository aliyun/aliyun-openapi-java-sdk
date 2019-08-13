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
import com.aliyuncs.emr.transform.v20160408.ListClusterTagForAdminResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListClusterTagForAdminResponse extends AcsResponse {

	private String requestId;

	private List<ClusterTag> clusterTagList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<ClusterTag> getClusterTagList() {
		return this.clusterTagList;
	}

	public void setClusterTagList(List<ClusterTag> clusterTagList) {
		this.clusterTagList = clusterTagList;
	}

	public static class ClusterTag {

		private String clusterId;

		private List<TagInfo> tagInfoList;

		public String getClusterId() {
			return this.clusterId;
		}

		public void setClusterId(String clusterId) {
			this.clusterId = clusterId;
		}

		public List<TagInfo> getTagInfoList() {
			return this.tagInfoList;
		}

		public void setTagInfoList(List<TagInfo> tagInfoList) {
			this.tagInfoList = tagInfoList;
		}

		public static class TagInfo {

			private String tagType;

			private String tagValue;

			private String tagKey;

			public String getTagType() {
				return this.tagType;
			}

			public void setTagType(String tagType) {
				this.tagType = tagType;
			}

			public String getTagValue() {
				return this.tagValue;
			}

			public void setTagValue(String tagValue) {
				this.tagValue = tagValue;
			}

			public String getTagKey() {
				return this.tagKey;
			}

			public void setTagKey(String tagKey) {
				this.tagKey = tagKey;
			}
		}
	}

	@Override
	public ListClusterTagForAdminResponse getInstance(UnmarshallerContext context) {
		return	ListClusterTagForAdminResponseUnmarshaller.unmarshall(this, context);
	}
}
