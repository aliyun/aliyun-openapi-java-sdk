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

package com.aliyuncs.sofa.model.v20190815;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.sofa.transform.v20190815.ExecLinkeantcodeAntcodeProjectbranchmergeResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ExecLinkeantcodeAntcodeProjectbranchmergeResponse extends AcsResponse {

	private String requestId;

	private String resultCode;

	private String resultMessage;

	private String mergeAccessLevel;

	private String name;

	private Boolean _protected;

	private String protectRule;

	private Boolean protectRuleExactMatched;

	private String pushAccessLevel;

	private String ref;

	private Long responseStatusCode;

	private Commit commit;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getResultCode() {
		return this.resultCode;
	}

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}

	public String getResultMessage() {
		return this.resultMessage;
	}

	public void setResultMessage(String resultMessage) {
		this.resultMessage = resultMessage;
	}

	public String getMergeAccessLevel() {
		return this.mergeAccessLevel;
	}

	public void setMergeAccessLevel(String mergeAccessLevel) {
		this.mergeAccessLevel = mergeAccessLevel;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Boolean get_Protected() {
		return this._protected;
	}

	public void set_Protected(Boolean _protected) {
		this._protected = _protected;
	}

	public String getProtectRule() {
		return this.protectRule;
	}

	public void setProtectRule(String protectRule) {
		this.protectRule = protectRule;
	}

	public Boolean getProtectRuleExactMatched() {
		return this.protectRuleExactMatched;
	}

	public void setProtectRuleExactMatched(Boolean protectRuleExactMatched) {
		this.protectRuleExactMatched = protectRuleExactMatched;
	}

	public String getPushAccessLevel() {
		return this.pushAccessLevel;
	}

	public void setPushAccessLevel(String pushAccessLevel) {
		this.pushAccessLevel = pushAccessLevel;
	}

	public String getRef() {
		return this.ref;
	}

	public void setRef(String ref) {
		this.ref = ref;
	}

	public Long getResponseStatusCode() {
		return this.responseStatusCode;
	}

	public void setResponseStatusCode(Long responseStatusCode) {
		this.responseStatusCode = responseStatusCode;
	}

	public Commit getCommit() {
		return this.commit;
	}

	public void setCommit(Commit commit) {
		this.commit = commit;
	}

	public static class Commit {

		private String author;

		private String authoredDate;

		private String authorEmail;

		private String authorName;

		private String committedDate;

		private String committer;

		private String committerEmail;

		private String committerName;

		private String createdAt;

		private String id;

		private String message;

		private String shortId;

		private String signature;

		private String title;

		private List<String> checkSuites;

		private List<String> parentIds;

		public String getAuthor() {
			return this.author;
		}

		public void setAuthor(String author) {
			this.author = author;
		}

		public String getAuthoredDate() {
			return this.authoredDate;
		}

		public void setAuthoredDate(String authoredDate) {
			this.authoredDate = authoredDate;
		}

		public String getAuthorEmail() {
			return this.authorEmail;
		}

		public void setAuthorEmail(String authorEmail) {
			this.authorEmail = authorEmail;
		}

		public String getAuthorName() {
			return this.authorName;
		}

		public void setAuthorName(String authorName) {
			this.authorName = authorName;
		}

		public String getCommittedDate() {
			return this.committedDate;
		}

		public void setCommittedDate(String committedDate) {
			this.committedDate = committedDate;
		}

		public String getCommitter() {
			return this.committer;
		}

		public void setCommitter(String committer) {
			this.committer = committer;
		}

		public String getCommitterEmail() {
			return this.committerEmail;
		}

		public void setCommitterEmail(String committerEmail) {
			this.committerEmail = committerEmail;
		}

		public String getCommitterName() {
			return this.committerName;
		}

		public void setCommitterName(String committerName) {
			this.committerName = committerName;
		}

		public String getCreatedAt() {
			return this.createdAt;
		}

		public void setCreatedAt(String createdAt) {
			this.createdAt = createdAt;
		}

		public String getId() {
			return this.id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getMessage() {
			return this.message;
		}

		public void setMessage(String message) {
			this.message = message;
		}

		public String getShortId() {
			return this.shortId;
		}

		public void setShortId(String shortId) {
			this.shortId = shortId;
		}

		public String getSignature() {
			return this.signature;
		}

		public void setSignature(String signature) {
			this.signature = signature;
		}

		public String getTitle() {
			return this.title;
		}

		public void setTitle(String title) {
			this.title = title;
		}

		public List<String> getCheckSuites() {
			return this.checkSuites;
		}

		public void setCheckSuites(List<String> checkSuites) {
			this.checkSuites = checkSuites;
		}

		public List<String> getParentIds() {
			return this.parentIds;
		}

		public void setParentIds(List<String> parentIds) {
			this.parentIds = parentIds;
		}
	}

	@Override
	public ExecLinkeantcodeAntcodeProjectbranchmergeResponse getInstance(UnmarshallerContext context) {
		return	ExecLinkeantcodeAntcodeProjectbranchmergeResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
