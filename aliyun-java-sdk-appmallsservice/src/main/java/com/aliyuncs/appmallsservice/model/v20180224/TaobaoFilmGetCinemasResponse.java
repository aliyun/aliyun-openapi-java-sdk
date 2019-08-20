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

package com.aliyuncs.appmallsservice.model.v20180224;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.appmallsservice.transform.v20180224.TaobaoFilmGetCinemasResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class TaobaoFilmGetCinemasResponse extends AcsResponse {

	private String errorCode;

	private String msg;

	private String subCode;

	private String subMsg;

	private Long totalCount;

	private String logsId;

	private String requestId;

	private List<CinemasItem> cinemas;

	public String getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getMsg() {
		return this.msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public String getSubCode() {
		return this.subCode;
	}

	public void setSubCode(String subCode) {
		this.subCode = subCode;
	}

	public String getSubMsg() {
		return this.subMsg;
	}

	public void setSubMsg(String subMsg) {
		this.subMsg = subMsg;
	}

	public Long getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}

	public String getLogsId() {
		return this.logsId;
	}

	public void setLogsId(String logsId) {
		this.logsId = logsId;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<CinemasItem> getCinemas() {
		return this.cinemas;
	}

	public void setCinemas(List<CinemasItem> cinemas) {
		this.cinemas = cinemas;
	}

	public static class CinemasItem {

		private String address;

		private String cinemaName;

		private Long cityId;

		private Long id;

		private String latitude;

		private String longitude;

		private String phone;

		private String regionName;

		private Long scheduleCloseTime;

		private String standardId;

		public String getAddress() {
			return this.address;
		}

		public void setAddress(String address) {
			this.address = address;
		}

		public String getCinemaName() {
			return this.cinemaName;
		}

		public void setCinemaName(String cinemaName) {
			this.cinemaName = cinemaName;
		}

		public Long getCityId() {
			return this.cityId;
		}

		public void setCityId(Long cityId) {
			this.cityId = cityId;
		}

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
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

		public String getPhone() {
			return this.phone;
		}

		public void setPhone(String phone) {
			this.phone = phone;
		}

		public String getRegionName() {
			return this.regionName;
		}

		public void setRegionName(String regionName) {
			this.regionName = regionName;
		}

		public Long getScheduleCloseTime() {
			return this.scheduleCloseTime;
		}

		public void setScheduleCloseTime(Long scheduleCloseTime) {
			this.scheduleCloseTime = scheduleCloseTime;
		}

		public String getStandardId() {
			return this.standardId;
		}

		public void setStandardId(String standardId) {
			this.standardId = standardId;
		}
	}

	@Override
	public TaobaoFilmGetCinemasResponse getInstance(UnmarshallerContext context) {
		return	TaobaoFilmGetCinemasResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
