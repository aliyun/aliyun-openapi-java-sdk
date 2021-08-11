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

package com.aliyuncs.ddoscoo.model.v20200101;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ddoscoo.transform.v20200101.DescribeDomainStatusCodeListResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDomainStatusCodeListResponse extends AcsResponse {

	private String requestId;

	private List<StatusCode> statusCodeList;

	private List<StatusCode> statusCodeList1;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<StatusCode> getStatusCodeList() {
		return this.statusCodeList;
	}

	public void setStatusCodeList(List<StatusCode> statusCodeList) {
		this.statusCodeList = statusCodeList;
	}

	public List<StatusCode> getStatusCodeList1() {
		return this.statusCodeList1;
	}

	public void setStatusCodeList1(List<StatusCode> statusCodeList1) {
		this.statusCodeList1 = statusCodeList1;
	}

	public static class StatusCode {

		private Integer index;

		private Long time;

		private Long status2XX;

		private Long status501;

		private Long status502;

		private Long status503;

		private Long status504;

		private Long status200;

		private Long status405;

		private Long status5XX;

		private Long status4XX;

		private Long status403;

		private Long status404;

		private Long status3XX;

		public Integer getIndex() {
			return this.index;
		}

		public void setIndex(Integer index) {
			this.index = index;
		}

		public Long getTime() {
			return this.time;
		}

		public void setTime(Long time) {
			this.time = time;
		}

		public Long getStatus2XX() {
			return this.status2XX;
		}

		public void setStatus2XX(Long status2XX) {
			this.status2XX = status2XX;
		}

		public Long getStatus501() {
			return this.status501;
		}

		public void setStatus501(Long status501) {
			this.status501 = status501;
		}

		public Long getStatus502() {
			return this.status502;
		}

		public void setStatus502(Long status502) {
			this.status502 = status502;
		}

		public Long getStatus503() {
			return this.status503;
		}

		public void setStatus503(Long status503) {
			this.status503 = status503;
		}

		public Long getStatus504() {
			return this.status504;
		}

		public void setStatus504(Long status504) {
			this.status504 = status504;
		}

		public Long getStatus200() {
			return this.status200;
		}

		public void setStatus200(Long status200) {
			this.status200 = status200;
		}

		public Long getStatus405() {
			return this.status405;
		}

		public void setStatus405(Long status405) {
			this.status405 = status405;
		}

		public Long getStatus5XX() {
			return this.status5XX;
		}

		public void setStatus5XX(Long status5XX) {
			this.status5XX = status5XX;
		}

		public Long getStatus4XX() {
			return this.status4XX;
		}

		public void setStatus4XX(Long status4XX) {
			this.status4XX = status4XX;
		}

		public Long getStatus403() {
			return this.status403;
		}

		public void setStatus403(Long status403) {
			this.status403 = status403;
		}

		public Long getStatus404() {
			return this.status404;
		}

		public void setStatus404(Long status404) {
			this.status404 = status404;
		}

		public Long getStatus3XX() {
			return this.status3XX;
		}

		public void setStatus3XX(Long status3XX) {
			this.status3XX = status3XX;
		}
	}

	@Override
	public DescribeDomainStatusCodeListResponse getInstance(UnmarshallerContext context) {
		return	DescribeDomainStatusCodeListResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
