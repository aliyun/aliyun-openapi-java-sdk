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
import com.aliyuncs.ecsops.transform.v20160401.OpsDescribeGroupResourceResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class OpsDescribeGroupResourceResponse extends AcsResponse {

	private String requestId;

	private Data data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private Long groupId;

		private String vpcId;

		private String groupNo;

		private String groupDesc;

		private List<String> dirtyVms;

		public Long getGroupId() {
			return this.groupId;
		}

		public void setGroupId(Long groupId) {
			this.groupId = groupId;
		}

		public String getVpcId() {
			return this.vpcId;
		}

		public void setVpcId(String vpcId) {
			this.vpcId = vpcId;
		}

		public String getGroupNo() {
			return this.groupNo;
		}

		public void setGroupNo(String groupNo) {
			this.groupNo = groupNo;
		}

		public String getGroupDesc() {
			return this.groupDesc;
		}

		public void setGroupDesc(String groupDesc) {
			this.groupDesc = groupDesc;
		}

		public List<String> getDirtyVms() {
			return this.dirtyVms;
		}

		public void setDirtyVms(List<String> dirtyVms) {
			this.dirtyVms = dirtyVms;
		}
	}

	@Override
	public OpsDescribeGroupResourceResponse getInstance(UnmarshallerContext context) {
		return	OpsDescribeGroupResourceResponseUnmarshaller.unmarshall(this, context);
	}
}
