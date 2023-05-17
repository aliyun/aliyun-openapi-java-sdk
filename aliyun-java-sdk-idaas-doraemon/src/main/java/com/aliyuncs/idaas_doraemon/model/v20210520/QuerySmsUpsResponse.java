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

package com.aliyuncs.idaas_doraemon.model.v20210520;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.idaas_doraemon.transform.v20210520.QuerySmsUpsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QuerySmsUpsResponse extends AcsResponse {

	private String requestId;

	private Long totalElements;

	private List<SmsUpsItem> smsUps;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Long getTotalElements() {
		return this.totalElements;
	}

	public void setTotalElements(Long totalElements) {
		this.totalElements = totalElements;
	}

	public List<SmsUpsItem> getSmsUps() {
		return this.smsUps;
	}

	public void setSmsUps(List<SmsUpsItem> smsUps) {
		this.smsUps = smsUps;
	}

	public static class SmsUpsItem {

		private String phoneNumber;

		private String content;

		private String destCode;

		private String sequenceId;

		private String tenantId;

		private String sendTime;

		public String getPhoneNumber() {
			return this.phoneNumber;
		}

		public void setPhoneNumber(String phoneNumber) {
			this.phoneNumber = phoneNumber;
		}

		public String getContent() {
			return this.content;
		}

		public void setContent(String content) {
			this.content = content;
		}

		public String getDestCode() {
			return this.destCode;
		}

		public void setDestCode(String destCode) {
			this.destCode = destCode;
		}

		public String getSequenceId() {
			return this.sequenceId;
		}

		public void setSequenceId(String sequenceId) {
			this.sequenceId = sequenceId;
		}

		public String getTenantId() {
			return this.tenantId;
		}

		public void setTenantId(String tenantId) {
			this.tenantId = tenantId;
		}

		public String getSendTime() {
			return this.sendTime;
		}

		public void setSendTime(String sendTime) {
			this.sendTime = sendTime;
		}
	}

	@Override
	public QuerySmsUpsResponse getInstance(UnmarshallerContext context) {
		return	QuerySmsUpsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
