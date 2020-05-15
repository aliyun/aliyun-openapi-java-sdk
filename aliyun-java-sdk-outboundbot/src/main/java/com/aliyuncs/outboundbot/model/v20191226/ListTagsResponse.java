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

package com.aliyuncs.outboundbot.model.v20191226;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.outboundbot.transform.v20191226.ListTagsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListTagsResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String code;

	private String message;

	private Integer httpStatusCode;

	private List<Tag> tags;

	private List<TagGroup> tagGroups;

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

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Integer getHttpStatusCode() {
		return this.httpStatusCode;
	}

	public void setHttpStatusCode(Integer httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
	}

	public List<Tag> getTags() {
		return this.tags;
	}

	public void setTags(List<Tag> tags) {
		this.tags = tags;
	}

	public List<TagGroup> getTagGroups() {
		return this.tagGroups;
	}

	public void setTagGroups(List<TagGroup> tagGroups) {
		this.tagGroups = tagGroups;
	}

	public static class Tag {

		private String tagId;

		private String tagName;

		private Integer tagIndex;

		private String scriptId;

		private String tagGroup;

		public String getTagId() {
			return this.tagId;
		}

		public void setTagId(String tagId) {
			this.tagId = tagId;
		}

		public String getTagName() {
			return this.tagName;
		}

		public void setTagName(String tagName) {
			this.tagName = tagName;
		}

		public Integer getTagIndex() {
			return this.tagIndex;
		}

		public void setTagIndex(Integer tagIndex) {
			this.tagIndex = tagIndex;
		}

		public String getScriptId() {
			return this.scriptId;
		}

		public void setScriptId(String scriptId) {
			this.scriptId = scriptId;
		}

		public String getTagGroup() {
			return this.tagGroup;
		}

		public void setTagGroup(String tagGroup) {
			this.tagGroup = tagGroup;
		}
	}

	public static class TagGroup {

		private String tagGroupId;

		private Integer tagGroupIndex;

		private String scriptId;

		private String tagGroup;

		public String getTagGroupId() {
			return this.tagGroupId;
		}

		public void setTagGroupId(String tagGroupId) {
			this.tagGroupId = tagGroupId;
		}

		public Integer getTagGroupIndex() {
			return this.tagGroupIndex;
		}

		public void setTagGroupIndex(Integer tagGroupIndex) {
			this.tagGroupIndex = tagGroupIndex;
		}

		public String getScriptId() {
			return this.scriptId;
		}

		public void setScriptId(String scriptId) {
			this.scriptId = scriptId;
		}

		public String getTagGroup() {
			return this.tagGroup;
		}

		public void setTagGroup(String tagGroup) {
			this.tagGroup = tagGroup;
		}
	}

	@Override
	public ListTagsResponse getInstance(UnmarshallerContext context) {
		return	ListTagsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
