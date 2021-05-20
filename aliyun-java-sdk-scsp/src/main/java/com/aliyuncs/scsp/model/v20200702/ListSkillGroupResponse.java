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

package com.aliyuncs.scsp.model.v20200702;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.scsp.transform.v20200702.ListSkillGroupResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListSkillGroupResponse extends AcsResponse {

	private String message;

	private String requestId;

	private String code;

	private Boolean success;

	private List<SkillGroups> data;

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

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public List<SkillGroups> getData() {
		return this.data;
	}

	public void setData(List<SkillGroups> data) {
		this.data = data;
	}

	public static class SkillGroups {

		private String displayName;

		private String description;

		private Integer channelType;

		private Long skillGroupId;

		private String name;

		public String getDisplayName() {
			return this.displayName;
		}

		public void setDisplayName(String displayName) {
			this.displayName = displayName;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public Integer getChannelType() {
			return this.channelType;
		}

		public void setChannelType(Integer channelType) {
			this.channelType = channelType;
		}

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

	@Override
	public ListSkillGroupResponse getInstance(UnmarshallerContext context) {
		return	ListSkillGroupResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
