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
import com.aliyuncs.idaas_doraemon.transform.v20210520.QuerySmsReportsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QuerySmsReportsResponse extends AcsResponse {

	private String requestId;

	private Long totalElements;

	private List<SmsReportsItem> smsReports;

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

	public List<SmsReportsItem> getSmsReports() {
		return this.smsReports;
	}

	public void setSmsReports(List<SmsReportsItem> smsReports) {
		this.smsReports = smsReports;
	}

	public static class SmsReportsItem {

		private String tid;

		private String mobile;

		private String code;

		private String stat;

		private String sn;

		private String tenantId;

		private String appId;

		private String eventId;

		private String time;

		private Integer chargedCount;

		public String getTid() {
			return this.tid;
		}

		public void setTid(String tid) {
			this.tid = tid;
		}

		public String getMobile() {
			return this.mobile;
		}

		public void setMobile(String mobile) {
			this.mobile = mobile;
		}

		public String getCode() {
			return this.code;
		}

		public void setCode(String code) {
			this.code = code;
		}

		public String getStat() {
			return this.stat;
		}

		public void setStat(String stat) {
			this.stat = stat;
		}

		public String getSn() {
			return this.sn;
		}

		public void setSn(String sn) {
			this.sn = sn;
		}

		public String getTenantId() {
			return this.tenantId;
		}

		public void setTenantId(String tenantId) {
			this.tenantId = tenantId;
		}

		public String getAppId() {
			return this.appId;
		}

		public void setAppId(String appId) {
			this.appId = appId;
		}

		public String getEventId() {
			return this.eventId;
		}

		public void setEventId(String eventId) {
			this.eventId = eventId;
		}

		public String getTime() {
			return this.time;
		}

		public void setTime(String time) {
			this.time = time;
		}

		public Integer getChargedCount() {
			return this.chargedCount;
		}

		public void setChargedCount(Integer chargedCount) {
			this.chargedCount = chargedCount;
		}
	}

	@Override
	public QuerySmsReportsResponse getInstance(UnmarshallerContext context) {
		return	QuerySmsReportsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
