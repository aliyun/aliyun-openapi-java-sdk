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

package com.aliyuncs.dataphin_public.model.v20230630;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.dataphin_public.transform.v20230630.GetSecurityLevelResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetSecurityLevelResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private Integer httpStatusCode;

	private String code;

	private String message;

	private SecurityLevelInfo securityLevelInfo;

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

	public SecurityLevelInfo getSecurityLevelInfo() {
		return this.securityLevelInfo;
	}

	public void setSecurityLevelInfo(SecurityLevelInfo securityLevelInfo) {
		this.securityLevelInfo = securityLevelInfo;
	}

	public static class SecurityLevelInfo {

		private String name;

		private String abbreviation;

		private String description;

		private Long index;

		private List<Long> relatedClassifyIdList;

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getAbbreviation() {
			return this.abbreviation;
		}

		public void setAbbreviation(String abbreviation) {
			this.abbreviation = abbreviation;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public Long getIndex() {
			return this.index;
		}

		public void setIndex(Long index) {
			this.index = index;
		}

		public List<Long> getRelatedClassifyIdList() {
			return this.relatedClassifyIdList;
		}

		public void setRelatedClassifyIdList(List<Long> relatedClassifyIdList) {
			this.relatedClassifyIdList = relatedClassifyIdList;
		}
	}

	@Override
	public GetSecurityLevelResponse getInstance(UnmarshallerContext context) {
		return	GetSecurityLevelResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
