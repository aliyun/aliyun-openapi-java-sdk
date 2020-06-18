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

package com.aliyuncs.dyiotapi.model.v20171111;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.dyiotapi.transform.v20171111.QueryCardFlowInfoResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryCardFlowInfoResponse extends AcsResponse {

	private String requestId;

	private String code;

	private String message;

	private List<CardFlowInfo> cardFlowInfos;

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

	public List<CardFlowInfo> getCardFlowInfos() {
		return this.cardFlowInfos;
	}

	public void setCardFlowInfos(List<CardFlowInfo> cardFlowInfos) {
		this.cardFlowInfos = cardFlowInfos;
	}

	public static class CardFlowInfo {

		private String resourceType;

		private String resName;

		private Long flowResource;

		private Long restOfFlow;

		private Long flowUsed;

		private String validDate;

		private String expireDate;

		private Long smsUsed;

		private Long voiceUsed;

		private Long voiceTotal;

		public String getResourceType() {
			return this.resourceType;
		}

		public void setResourceType(String resourceType) {
			this.resourceType = resourceType;
		}

		public String getResName() {
			return this.resName;
		}

		public void setResName(String resName) {
			this.resName = resName;
		}

		public Long getFlowResource() {
			return this.flowResource;
		}

		public void setFlowResource(Long flowResource) {
			this.flowResource = flowResource;
		}

		public Long getRestOfFlow() {
			return this.restOfFlow;
		}

		public void setRestOfFlow(Long restOfFlow) {
			this.restOfFlow = restOfFlow;
		}

		public Long getFlowUsed() {
			return this.flowUsed;
		}

		public void setFlowUsed(Long flowUsed) {
			this.flowUsed = flowUsed;
		}

		public String getValidDate() {
			return this.validDate;
		}

		public void setValidDate(String validDate) {
			this.validDate = validDate;
		}

		public String getExpireDate() {
			return this.expireDate;
		}

		public void setExpireDate(String expireDate) {
			this.expireDate = expireDate;
		}

		public Long getSmsUsed() {
			return this.smsUsed;
		}

		public void setSmsUsed(Long smsUsed) {
			this.smsUsed = smsUsed;
		}

		public Long getVoiceUsed() {
			return this.voiceUsed;
		}

		public void setVoiceUsed(Long voiceUsed) {
			this.voiceUsed = voiceUsed;
		}

		public Long getVoiceTotal() {
			return this.voiceTotal;
		}

		public void setVoiceTotal(Long voiceTotal) {
			this.voiceTotal = voiceTotal;
		}
	}

	@Override
	public QueryCardFlowInfoResponse getInstance(UnmarshallerContext context) {
		return	QueryCardFlowInfoResponseUnmarshaller.unmarshall(this, context);
	}
}
