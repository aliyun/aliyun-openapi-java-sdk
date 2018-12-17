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
import com.aliyuncs.linkedmall.transform.v20180116.QueryMovieSchedulesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryMovieSchedulesResponse extends AcsResponse {

	private String requestId;

	private String logsId;

	private String subCode;

	private String subMessage;

	private String code;

	private Boolean success;

	private String message;

	private List<Schedule> schedules;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getLogsId() {
		return this.logsId;
	}

	public void setLogsId(String logsId) {
		this.logsId = logsId;
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

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public List<Schedule> getSchedules() {
		return this.schedules;
	}

	public void setSchedules(List<Schedule> schedules) {
		this.schedules = schedules;
	}

	public static class Schedule {

		private Long cinemaId;

		private String sessionEndingTime;

		private String hallName;

		private Long id;

		private Boolean isExpired;

		private Long maxCanBuy;

		private Long price;

		private String scheduleArea;

		private String sectionId;

		private Long serviceFee;

		private String releaseDate;

		private Long movieId;

		private String sessionStartingTime;

		private String movieVersion;

		public Long getCinemaId() {
			return this.cinemaId;
		}

		public void setCinemaId(Long cinemaId) {
			this.cinemaId = cinemaId;
		}

		public String getSessionEndingTime() {
			return this.sessionEndingTime;
		}

		public void setSessionEndingTime(String sessionEndingTime) {
			this.sessionEndingTime = sessionEndingTime;
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

		public String getReleaseDate() {
			return this.releaseDate;
		}

		public void setReleaseDate(String releaseDate) {
			this.releaseDate = releaseDate;
		}

		public Long getMovieId() {
			return this.movieId;
		}

		public void setMovieId(Long movieId) {
			this.movieId = movieId;
		}

		public String getSessionStartingTime() {
			return this.sessionStartingTime;
		}

		public void setSessionStartingTime(String sessionStartingTime) {
			this.sessionStartingTime = sessionStartingTime;
		}

		public String getMovieVersion() {
			return this.movieVersion;
		}

		public void setMovieVersion(String movieVersion) {
			this.movieVersion = movieVersion;
		}
	}

	@Override
	public QueryMovieSchedulesResponse getInstance(UnmarshallerContext context) {
		return	QueryMovieSchedulesResponseUnmarshaller.unmarshall(this, context);
	}
}
