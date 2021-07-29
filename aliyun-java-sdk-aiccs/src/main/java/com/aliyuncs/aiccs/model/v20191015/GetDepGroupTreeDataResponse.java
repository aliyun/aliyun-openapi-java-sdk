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

package com.aliyuncs.aiccs.model.v20191015;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.aiccs.transform.v20191015.GetDepGroupTreeDataResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetDepGroupTreeDataResponse extends AcsResponse {

	private String requestId;

	private String message;

	private String code;

	private String success;

	private List<DataItem> data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getSuccess() {
		return this.success;
	}

	public void setSuccess(String success) {
		this.success = success;
	}

	public List<DataItem> getData() {
		return this.data;
	}

	public void setData(List<DataItem> data) {
		this.data = data;
	}

	public static class DataItem {

		private String depGroupName;

		private String depGroupId;

		private List<GroupDTOSItem> groupDTOS;

		public String getDepGroupName() {
			return this.depGroupName;
		}

		public void setDepGroupName(String depGroupName) {
			this.depGroupName = depGroupName;
		}

		public String getDepGroupId() {
			return this.depGroupId;
		}

		public void setDepGroupId(String depGroupId) {
			this.depGroupId = depGroupId;
		}

		public List<GroupDTOSItem> getGroupDTOS() {
			return this.groupDTOS;
		}

		public void setGroupDTOS(List<GroupDTOSItem> groupDTOS) {
			this.groupDTOS = groupDTOS;
		}

		public static class GroupDTOSItem {

			private Long skillGroupId;

			private String name;

			public Long getSkillGroupId() {
				return this.skillGroupId;
			}

			public void setSkillGroupId(Long skillGroupId) {
				this.skillGroupId = skillGroupId;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}
		}
	}

	@Override
	public GetDepGroupTreeDataResponse getInstance(UnmarshallerContext context) {
		return	GetDepGroupTreeDataResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
