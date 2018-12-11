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

package com.aliyuncs.rds.model.v20140815;

import java.util.List;
import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.rds.transform.v20140815.DescribeTagsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeTagsResponse extends AcsResponse {

	private String requestId;

	private List<TagInfos> items;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<TagInfos> getItems() {
		return this.items;
	}

	public void setItems(List<TagInfos> items) {
		this.items = items;
	}

	public static class TagInfos {

		private String tagKey;

		private String tagValue;

		private List<String> dBInstanceIds;

		public String getTagKey() {
			return this.tagKey;
		}

		public void setTagKey(String tagKey) {
			this.tagKey = tagKey;
		}

		public String getTagValue() {
			return this.tagValue;
		}

		public void setTagValue(String tagValue) {
			this.tagValue = tagValue;
		}

		public List<String> getDBInstanceIds() {
			return this.dBInstanceIds;
		}

		public void setDBInstanceIds(List<String> dBInstanceIds) {
			this.dBInstanceIds = dBInstanceIds;
		}
	}

	@Override
	public DescribeTagsResponse getInstance(UnmarshallerContext context) {
		return	DescribeTagsResponseUnmarshaller.unmarshall(this, context);
	}
}
