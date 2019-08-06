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

package com.aliyuncs.imm.model.v20170906;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.imm.transform.v20170906.IndexTagResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class IndexTagResponse extends AcsResponse {

	private String requestId;

	private String setId;

	private String successIndexNum;

	private List<FailDetailsItem> failDetails;

	private List<SuccessDetailsItem> successDetails;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getSetId() {
		return this.setId;
	}

	public void setSetId(String setId) {
		this.setId = setId;
	}

	public String getSuccessIndexNum() {
		return this.successIndexNum;
	}

	public void setSuccessIndexNum(String successIndexNum) {
		this.successIndexNum = successIndexNum;
	}

	public List<FailDetailsItem> getFailDetails() {
		return this.failDetails;
	}

	public void setFailDetails(List<FailDetailsItem> failDetails) {
		this.failDetails = failDetails;
	}

	public List<SuccessDetailsItem> getSuccessDetails() {
		return this.successDetails;
	}

	public void setSuccessDetails(List<SuccessDetailsItem> successDetails) {
		this.successDetails = successDetails;
	}

	public static class FailDetailsItem {

		private String srcUri;

		private String reason;

		public String getSrcUri() {
			return this.srcUri;
		}

		public void setSrcUri(String srcUri) {
			this.srcUri = srcUri;
		}

		public String getReason() {
			return this.reason;
		}

		public void setReason(String reason) {
			this.reason = reason;
		}
	}

	public static class SuccessDetailsItem {

		private String srcUri;

		private List<TagsItem> tags;

		public String getSrcUri() {
			return this.srcUri;
		}

		public void setSrcUri(String srcUri) {
			this.srcUri = srcUri;
		}

		public List<TagsItem> getTags() {
			return this.tags;
		}

		public void setTags(List<TagsItem> tags) {
			this.tags = tags;
		}

		public static class TagsItem {

			private String tagId;

			private String tagLevel;

			private String tagName;

			private String parentTagId;

			private String parentTagName;

			private String tagScore;

			public String getTagId() {
				return this.tagId;
			}

			public void setTagId(String tagId) {
				this.tagId = tagId;
			}

			public String getTagLevel() {
				return this.tagLevel;
			}

			public void setTagLevel(String tagLevel) {
				this.tagLevel = tagLevel;
			}

			public String getTagName() {
				return this.tagName;
			}

			public void setTagName(String tagName) {
				this.tagName = tagName;
			}

			public String getParentTagId() {
				return this.parentTagId;
			}

			public void setParentTagId(String parentTagId) {
				this.parentTagId = parentTagId;
			}

			public String getParentTagName() {
				return this.parentTagName;
			}

			public void setParentTagName(String parentTagName) {
				this.parentTagName = parentTagName;
			}

			public String getTagScore() {
				return this.tagScore;
			}

			public void setTagScore(String tagScore) {
				this.tagScore = tagScore;
			}
		}
	}

	@Override
	public IndexTagResponse getInstance(UnmarshallerContext context) {
		return	IndexTagResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
