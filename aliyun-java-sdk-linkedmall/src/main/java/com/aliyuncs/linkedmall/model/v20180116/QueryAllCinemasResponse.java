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

package com.aliyuncs.linkedmall.model.v20180116;

import java.util.List;
import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.linkedmall.transform.v20180116.QueryAllCinemasResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryAllCinemasResponse extends AcsResponse {

	private String requestId;

	private String code;

	private String message;

	private String subCode;

	private String subMessage;

	private String logsId;

	private Boolean success;

	private Long totalCount;

	private List<Cinema> cinemas;

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

	public String getSubCode() {
		return this.subCode;
	}

	public void setSubCode(String subCode) {
		this.subCode = subCode;
	}

	public String getSubMessage() {
		return this.subMessage;
	}

	public void setSubMessage(String subMessage) {
		this.subMessage = subMessage;
	}

	public String getLogsId() {
		return this.logsId;
	}

	public void setLogsId(String logsId) {
		this.logsId = logsId;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public Long getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}

	public List<Cinema> getCinemas() {
		return this.cinemas;
	}

	public void setCinemas(List<Cinema> cinemas) {
		this.cinemas = cinemas;
	}

	public static class Cinema {

		private Long cityId;

		private String cityName;

		private Long scheduleCloseTime;

		private String latitude;

		private String longitude;

		private String cinemaName;

		private String address;

		private Long id;

		private String phone;

		private String standardId;

		public Long getCityId() {
			return this.cityId;
		}

		public void setCityId(Long cityId) {
			this.cityId = cityId;
		}

		public String getCityName() {
			return this.cityName;
		}

		public void setCityName(String cityName) {
			this.cityName = cityName;
		}

		public Long getScheduleCloseTime() {
			return this.scheduleCloseTime;
		}

		public void setScheduleCloseTime(Long scheduleCloseTime) {
			this.scheduleCloseTime = scheduleCloseTime;
		}

		public String getLatitude() {
			return this.latitude;
		}

		public void setLatitude(String latitude) {
			this.latitude = latitude;
		}

		public String getLongitude() {
			return this.longitude;
		}

		public void setLongitude(String longitude) {
			this.longitude = longitude;
		}

		public String getCinemaName() {
			return this.cinemaName;
		}

		public void setCinemaName(String cinemaName) {
			this.cinemaName = cinemaName;
		}

		public String getAddress() {
			return this.address;
		}

		public void setAddress(String address) {
			this.address = address;
		}

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getPhone() {
			return this.phone;
		}

		public void setPhone(String phone) {
			this.phone = phone;
		}

		public String getStandardId() {
			return this.standardId;
		}

		public void setStandardId(String standardId) {
			this.standardId = standardId;
		}
	}

	@Override
	public QueryAllCinemasResponse getInstance(UnmarshallerContext context) {
		return	QueryAllCinemasResponseUnmarshaller.unmarshall(this, context);
	}
}
