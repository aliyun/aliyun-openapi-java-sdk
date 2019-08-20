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
import com.aliyuncs.appmallsservice.transform.v20180224.TaobaoFilmGetSoonShowsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class TaobaoFilmGetSoonShowsResponse extends AcsResponse {

	private String errorCode;

	private String msg;

	private String subCode;

	private String subMsg;

	private String logsId;

	private String requestId;

	private List<ShowsItem> shows;

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

	public List<ShowsItem> getShows() {
		return this.shows;
	}

	public void setShows(List<ShowsItem> shows) {
		this.shows = shows;
	}

	public static class ShowsItem {

		private String backgroundPicture;

		private String country;

		private String description;

		private String director;

		private Long duration;

		private String highlight;

		private Long id;

		private String language;

		private String leadingRole;

		private String openDay;

		private String openTime;

		private String poster;

		private String remark;

		private String showMark;

		private String showName;

		private String showNameEn;

		private String type;

		private List<String> showVersionList;

		private List<String> trailerList;

		public String getBackgroundPicture() {
			return this.backgroundPicture;
		}

		public void setBackgroundPicture(String backgroundPicture) {
			this.backgroundPicture = backgroundPicture;
		}

		public String getCountry() {
			return this.country;
		}

		public void setCountry(String country) {
			this.country = country;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getDirector() {
			return this.director;
		}

		public void setDirector(String director) {
			this.director = director;
		}

		public Long getDuration() {
			return this.duration;
		}

		public void setDuration(Long duration) {
			this.duration = duration;
		}

		public String getHighlight() {
			return this.highlight;
		}

		public void setHighlight(String highlight) {
			this.highlight = highlight;
		}

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getLanguage() {
			return this.language;
		}

		public void setLanguage(String language) {
			this.language = language;
		}

		public String getLeadingRole() {
			return this.leadingRole;
		}

		public void setLeadingRole(String leadingRole) {
			this.leadingRole = leadingRole;
		}

		public String getOpenDay() {
			return this.openDay;
		}

		public void setOpenDay(String openDay) {
			this.openDay = openDay;
		}

		public String getOpenTime() {
			return this.openTime;
		}

		public void setOpenTime(String openTime) {
			this.openTime = openTime;
		}

		public String getPoster() {
			return this.poster;
		}

		public void setPoster(String poster) {
			this.poster = poster;
		}

		public String getRemark() {
			return this.remark;
		}

		public void setRemark(String remark) {
			this.remark = remark;
		}

		public String getShowMark() {
			return this.showMark;
		}

		public void setShowMark(String showMark) {
			this.showMark = showMark;
		}

		public String getShowName() {
			return this.showName;
		}

		public void setShowName(String showName) {
			this.showName = showName;
		}

		public String getShowNameEn() {
			return this.showNameEn;
		}

		public void setShowNameEn(String showNameEn) {
			this.showNameEn = showNameEn;
		}

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public List<String> getShowVersionList() {
			return this.showVersionList;
		}

		public void setShowVersionList(List<String> showVersionList) {
			this.showVersionList = showVersionList;
		}

		public List<String> getTrailerList() {
			return this.trailerList;
		}

		public void setTrailerList(List<String> trailerList) {
			this.trailerList = trailerList;
		}
	}

	@Override
	public TaobaoFilmGetSoonShowsResponse getInstance(UnmarshallerContext context) {
		return	TaobaoFilmGetSoonShowsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
