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
import com.aliyuncs.cams.transform.v20200606.GetChatappPhoneNumberMetricResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetChatappPhoneNumberMetricResponse extends AcsResponse {

	private String requestId;

	private String code;

	private String message;

	private String accessDeniedDetail;

	private List<返回数据> data;

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

	public List<返回数据> getData() {
		return this.data;
	}

	public void setData(List<返回数据> data) {
		this.data = data;
	}

	public static class 返回数据 {

		private Integer sentCount;

		private Integer deliveredCount;

		private Long start;

		private Long end;

		private String phoneNumber;

		private String granularity;

		public Integer getSentCount() {
			return this.sentCount;
		}

		public void setSentCount(Integer sentCount) {
			this.sentCount = sentCount;
		}

		public Integer getDeliveredCount() {
			return this.deliveredCount;
		}

		public void setDeliveredCount(Integer deliveredCount) {
			this.deliveredCount = deliveredCount;
		}

		public Long getStart() {
			return this.start;
		}

		public void setStart(Long start) {
			this.start = start;
		}

		public Long getEnd() {
			return this.end;
		}

		public void setEnd(Long end) {
			this.end = end;
		}

		public String getPhoneNumber() {
			return this.phoneNumber;
		}

		public void setPhoneNumber(String phoneNumber) {
			this.phoneNumber = phoneNumber;
		}

		public String getGranularity() {
			return this.granularity;
		}

		public void setGranularity(String granularity) {
			this.granularity = granularity;
		}
	}

	@Override
	public GetChatappPhoneNumberMetricResponse getInstance(UnmarshallerContext context) {
		return	GetChatappPhoneNumberMetricResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
