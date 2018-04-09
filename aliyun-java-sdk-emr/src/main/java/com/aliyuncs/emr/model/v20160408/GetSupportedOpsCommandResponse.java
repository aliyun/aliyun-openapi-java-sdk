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
import com.aliyuncs.emr.transform.v20160408.GetSupportedOpsCommandResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetSupportedOpsCommandResponse extends AcsResponse {

	private String requestId;

	private List<OpsCommandCategory> list;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<OpsCommandCategory> getList() {
		return this.list;
	}

	public void setList(List<OpsCommandCategory> list) {
		this.list = list;
	}

	public static class OpsCommandCategory {

		private String category;

		private List<OpsCommandInfo> commandList;

		public String getCategory() {
			return this.category;
		}

		public void setCategory(String category) {
			this.category = category;
		}

		public List<OpsCommandInfo> getCommandList() {
			return this.commandList;
		}

		public void setCommandList(List<OpsCommandInfo> commandList) {
			this.commandList = commandList;
		}

		public static class OpsCommandInfo {

			private String id;

			private String name;

			private String discription;

			private String targetType;

			private String params;

			public String getId() {
				return this.id;
			}

			public void setId(String id) {
				this.id = id;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getDiscription() {
				return this.discription;
			}

			public void setDiscription(String discription) {
				this.discription = discription;
			}

			public String getTargetType() {
				return this.targetType;
			}

			public void setTargetType(String targetType) {
				this.targetType = targetType;
			}

			public String getParams() {
				return this.params;
			}

			public void setParams(String params) {
				this.params = params;
			}
		}
	}

	@Override
	public GetSupportedOpsCommandResponse getInstance(UnmarshallerContext context) {
		return	GetSupportedOpsCommandResponseUnmarshaller.unmarshall(this, context);
	}
}
