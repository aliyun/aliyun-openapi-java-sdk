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
import com.aliyuncs.zhuque.transform.v20160701.ListMachineTypeGroupResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListMachineTypeGroupResponse extends AcsResponse {

	private String requestId;

	private String result;

	private String message;

	private List<MachineTypeGroupItem> machineTypeGroup;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getResult() {
		return this.result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public List<MachineTypeGroupItem> getMachineTypeGroup() {
		return this.machineTypeGroup;
	}

	public void setMachineTypeGroup(List<MachineTypeGroupItem> machineTypeGroup) {
		this.machineTypeGroup = machineTypeGroup;
	}

	public static class MachineTypeGroupItem {

		private String groupName;

		private String machineTypes;

		private String description;

		private Integer id;

		private String creator;

		private String modifier;

		private String createTime;

		private String updateTime;

		private List<String> machineTypeList;

		public String getGroupName() {
			return this.groupName;
		}

		public void setGroupName(String groupName) {
			this.groupName = groupName;
		}

		public String getMachineTypes() {
			return this.machineTypes;
		}

		public void setMachineTypes(String machineTypes) {
			this.machineTypes = machineTypes;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public Integer getId() {
			return this.id;
		}

		public void setId(Integer id) {
			this.id = id;
		}

		public String getCreator() {
			return this.creator;
		}

		public void setCreator(String creator) {
			this.creator = creator;
		}

		public String getModifier() {
			return this.modifier;
		}

		public void setModifier(String modifier) {
			this.modifier = modifier;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public String getUpdateTime() {
			return this.updateTime;
		}

		public void setUpdateTime(String updateTime) {
			this.updateTime = updateTime;
		}

		public List<String> getMachineTypeList() {
			return this.machineTypeList;
		}

		public void setMachineTypeList(List<String> machineTypeList) {
			this.machineTypeList = machineTypeList;
		}
	}

	@Override
	public ListMachineTypeGroupResponse getInstance(UnmarshallerContext context) {
		return	ListMachineTypeGroupResponseUnmarshaller.unmarshall(this, context);
	}
}
