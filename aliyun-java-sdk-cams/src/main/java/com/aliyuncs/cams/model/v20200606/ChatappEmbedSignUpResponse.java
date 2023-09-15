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

package com.aliyuncs.cams.model.v20200606;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.cams.transform.v20200606.ChatappEmbedSignUpResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ChatappEmbedSignUpResponse extends AcsResponse {

	private String requestId;

	private String code;

	private String message;

	private String accessDeniedDetail;

	private List<Waba列表> wabas;

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

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getAccessDeniedDetail() {
		return this.accessDeniedDetail;
	}

	public void setAccessDeniedDetail(String accessDeniedDetail) {
		this.accessDeniedDetail = accessDeniedDetail;
	}

	public List<Waba列表> getWabas() {
		return this.wabas;
	}

	public void setWabas(List<Waba列表> wabas) {
		this.wabas = wabas;
	}

	public static class Waba列表 {

		private String id;

		private String name;

		private String currency;

		private String accountReviewStatus;

		private String messageTemplateNamespace;

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

		public String getCurrency() {
			return this.currency;
		}

		public void setCurrency(String currency) {
			this.currency = currency;
		}

		public String getAccountReviewStatus() {
			return this.accountReviewStatus;
		}

		public void setAccountReviewStatus(String accountReviewStatus) {
			this.accountReviewStatus = accountReviewStatus;
		}

		public String getMessageTemplateNamespace() {
			return this.messageTemplateNamespace;
		}

		public void setMessageTemplateNamespace(String messageTemplateNamespace) {
			this.messageTemplateNamespace = messageTemplateNamespace;
		}
	}

	@Override
	public ChatappEmbedSignUpResponse getInstance(UnmarshallerContext context) {
		return	ChatappEmbedSignUpResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
