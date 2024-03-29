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
import com.aliyuncs.outboundbot.transform.v20191226.DescribeTagHitsSummaryResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeTagHitsSummaryResponse extends AcsResponse {

	private Integer httpStatusCode;

	private String code;

	private String message;

	private String requestId;

	private Boolean success;

	private List<TagGroup> tagGroups;

	private List<TagHits> tagHitsList;

	public Integer getHttpStatusCode() {
		return this.httpStatusCode;
	}

	public void setHttpStatusCode(Integer httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
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

	public List<TagGroup> getTagGroups() {
		return this.tagGroups;
	}

	public void setTagGroups(List<TagGroup> tagGroups) {
		this.tagGroups = tagGroups;
	}

	public List<TagHits> getTagHitsList() {
		return this.tagHitsList;
	}

	public void setTagHitsList(List<TagHits> tagHitsList) {
		this.tagHitsList = tagHitsList;
	}

	public static class TagGroup {

		private Integer tagGroupIndex;

		private String tagGroup;

		private String scriptId;

		private String id;

		public Integer getTagGroupIndex() {
			return this.tagGroupIndex;
		}

		public void setTagGroupIndex(Integer tagGroupIndex) {
			this.tagGroupIndex = tagGroupIndex;
		}

		public String getTagGroup() {
			return this.tagGroup;
		}

		public void setTagGroup(String tagGroup) {
			this.tagGroup = tagGroup;
		}

		public String getScriptId() {
			return this.scriptId;
		}

		public void setScriptId(String scriptId) {
			this.scriptId = scriptId;
		}

		public String getId() {
			return this.id;
		}

		public void setId(String id) {
			this.id = id;
		}
	}

	public static class TagHits {

		private Integer hitCount;

		private String tagGroup;

		private String tagName;

		public Integer getHitCount() {
			return this.hitCount;
		}

		public void setHitCount(Integer hitCount) {
			this.hitCount = hitCount;
		}

		public String getTagGroup() {
			return this.tagGroup;
		}

		public void setTagGroup(String tagGroup) {
			this.tagGroup = tagGroup;
		}

		public String getTagName() {
			return this.tagName;
		}

		public void setTagName(String tagName) {
			this.tagName = tagName;
		}
	}

	@Override
	public DescribeTagHitsSummaryResponse getInstance(UnmarshallerContext context) {
		return	DescribeTagHitsSummaryResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
