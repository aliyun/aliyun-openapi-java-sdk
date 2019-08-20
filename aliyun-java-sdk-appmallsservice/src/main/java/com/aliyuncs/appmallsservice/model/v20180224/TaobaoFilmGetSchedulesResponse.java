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
import com.aliyuncs.appmallsservice.transform.v20180224.TaobaoFilmGetSchedulesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class TaobaoFilmGetSchedulesResponse extends AcsResponse {

	private String errorCode;

	private String msg;

	private String subCode;

	private String subMsg;

	private String logsId;

	private String requestId;

	private List<SchedulesItem> schedules;

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

	public List<SchedulesItem> getSchedules() {
		return this.schedules;
	}

	public void setSchedules(List<SchedulesItem> schedules) {
		this.schedules = schedules;
	}

	public static class SchedulesItem {

		private Long cinemaId;

		private String closeTime;

		private String hallName;

		private Long id;

		private Boolean isExpired;

		private Long maxCanBuy;

		private Long price;

		private String scheduleArea;

		private String sectionId;

		private Long serviceFee;

		private String showDate;

		private Long showId;

		private String showTime;

		private String showVersion;

		private String hallId;

		public Long getCinemaId() {
			return this.cinemaId;
		}

		public void setCinemaId(Long cinemaId) {
			this.cinemaId = cinemaId;
		}

		public String getCloseTime() {
			return this.closeTime;
		}

		public void setCloseTime(String closeTime) {
			this.closeTime = closeTime;
		}

		public String getHallName() {
			return this.hallName;
		}

		public void setHallName(String hallName) {
			this.hallName = hallName;
		}

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public Boolean getIsExpired() {
			return this.isExpired;
		}

		public void setIsExpired(Boolean isExpired) {
			this.isExpired = isExpired;
		}

		public Long getMaxCanBuy() {
			return this.maxCanBuy;
		}

		public void setMaxCanBuy(Long maxCanBuy) {
			this.maxCanBuy = maxCanBuy;
		}

		public Long getPrice() {
			return this.price;
		}

		public void setPrice(Long price) {
			this.price = price;
		}

		public String getScheduleArea() {
			return this.scheduleArea;
		}

		public void setScheduleArea(String scheduleArea) {
			this.scheduleArea = scheduleArea;
		}

		public String getSectionId() {
			return this.sectionId;
		}

		public void setSectionId(String sectionId) {
			this.sectionId = sectionId;
		}

		public Long getServiceFee() {
			return this.serviceFee;
		}

		public void setServiceFee(Long serviceFee) {
			this.serviceFee = serviceFee;
		}

		public String getShowDate() {
			return this.showDate;
		}

		public void setShowDate(String showDate) {
			this.showDate = showDate;
		}

		public Long getShowId() {
			return this.showId;
		}

		public void setShowId(Long showId) {
			this.showId = showId;
		}

		public String getShowTime() {
			return this.showTime;
		}

		public void setShowTime(String showTime) {
			this.showTime = showTime;
		}

		public String getShowVersion() {
			return this.showVersion;
		}

		public void setShowVersion(String showVersion) {
			this.showVersion = showVersion;
		}

		public String getHallId() {
			return this.hallId;
		}

		public void setHallId(String hallId) {
			this.hallId = hallId;
		}
	}

	@Override
	public TaobaoFilmGetSchedulesResponse getInstance(UnmarshallerContext context) {
		return	TaobaoFilmGetSchedulesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
