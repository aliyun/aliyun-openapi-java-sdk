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

package com.aliyuncs.codeup.model.v20200414;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.codeup.transform.v20200414.ListOrganizationSecurityScoresResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListOrganizationSecurityScoresResponse extends AcsResponse {

	private String errorCode;

	private String errorMessage;

	private String requestId;

	private Boolean success;

	private List<ResultItem> result;

	public String getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorMessage() {
		return this.errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
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

	public List<ResultItem> getResult() {
		return this.result;
	}

	public void setResult(List<ResultItem> result) {
		this.result = result;
	}

	public static class ResultItem {

		private Boolean enable;

		private Long id;

		private String organizationId;

		private OrganizationSecurityScore organizationSecurityScore;

		public Boolean getEnable() {
			return this.enable;
		}

		public void setEnable(Boolean enable) {
			this.enable = enable;
		}

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getOrganizationId() {
			return this.organizationId;
		}

		public void setOrganizationId(String organizationId) {
			this.organizationId = organizationId;
		}

		public OrganizationSecurityScore getOrganizationSecurityScore() {
			return this.organizationSecurityScore;
		}

		public void setOrganizationSecurityScore(OrganizationSecurityScore organizationSecurityScore) {
			this.organizationSecurityScore = organizationSecurityScore;
		}

		public static class OrganizationSecurityScore {

			private Integer authorityControlScore;

			private Integer codeContentScore;

			private Integer memberBehaviorScore;

			private String level;

			public Integer getAuthorityControlScore() {
				return this.authorityControlScore;
			}

			public void setAuthorityControlScore(Integer authorityControlScore) {
				this.authorityControlScore = authorityControlScore;
			}

			public Integer getCodeContentScore() {
				return this.codeContentScore;
			}

			public void setCodeContentScore(Integer codeContentScore) {
				this.codeContentScore = codeContentScore;
			}

			public Integer getMemberBehaviorScore() {
				return this.memberBehaviorScore;
			}

			public void setMemberBehaviorScore(Integer memberBehaviorScore) {
				this.memberBehaviorScore = memberBehaviorScore;
			}

			public String getLevel() {
				return this.level;
			}

			public void setLevel(String level) {
				this.level = level;
			}
		}
	}

	@Override
	public ListOrganizationSecurityScoresResponse getInstance(UnmarshallerContext context) {
		return	ListOrganizationSecurityScoresResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
