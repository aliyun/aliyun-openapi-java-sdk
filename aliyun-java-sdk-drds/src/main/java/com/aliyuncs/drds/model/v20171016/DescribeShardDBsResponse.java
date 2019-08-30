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

package com.aliyuncs.drds.model.v20171016;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.drds.transform.v20171016.DescribeShardDBsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeShardDBsResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private List<DbIntancePair> data;

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

	public List<DbIntancePair> getData() {
		return this.data;
	}

	public void setData(List<DbIntancePair> data) {
		this.data = data;
	}

	public static class DbIntancePair {

		private String subDbName;

		private String instanceName;

		private String groupName;

		public String getSubDbName() {
			return this.subDbName;
		}

		public void setSubDbName(String subDbName) {
			this.subDbName = subDbName;
		}

		public String getInstanceName() {
			return this.instanceName;
		}

		public void setInstanceName(String instanceName) {
			this.instanceName = instanceName;
		}

		public String getGroupName() {
			return this.groupName;
		}

		public void setGroupName(String groupName) {
			this.groupName = groupName;
		}
	}

	@Override
	public DescribeShardDBsResponse getInstance(UnmarshallerContext context) {
		return	DescribeShardDBsResponseUnmarshaller.unmarshall(this, context);
	}
}
