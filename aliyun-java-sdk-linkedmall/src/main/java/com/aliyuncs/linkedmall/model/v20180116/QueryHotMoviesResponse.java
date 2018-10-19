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
import com.aliyuncs.AcsResponse;
import com.aliyuncs.linkedmall.transform.v20180116.QueryHotMoviesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryHotMoviesResponse extends AcsResponse {

	private String requestId;

	private String logsId;

	private String subCode;

	private String subMessage;

	private String code;

	private Boolean success;

	private String message;

	private List<Movie> movies;

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

	public List<Movie> getMovies() {
		return this.movies;
	}

	public void setMovies(List<Movie> movies) {
		this.movies = movies;
	}

	public static class Movie {

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

		private String movieVersion;

		private String movieName;

		private String movieNameEn;

		private String type;

		private List<String> movieTypeList;

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

		public String getMovieVersion() {
			return this.movieVersion;
		}

		public void setMovieVersion(String movieVersion) {
			this.movieVersion = movieVersion;
		}

		public String getMovieName() {
			return this.movieName;
		}

		public void setMovieName(String movieName) {
			this.movieName = movieName;
		}

		public String getMovieNameEn() {
			return this.movieNameEn;
		}

		public void setMovieNameEn(String movieNameEn) {
			this.movieNameEn = movieNameEn;
		}

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public List<String> getMovieTypeList() {
			return this.movieTypeList;
		}

		public void setMovieTypeList(List<String> movieTypeList) {
			this.movieTypeList = movieTypeList;
		}

		public List<String> getTrailerList() {
			return this.trailerList;
		}

		public void setTrailerList(List<String> trailerList) {
			this.trailerList = trailerList;
		}
	}

	@Override
	public QueryHotMoviesResponse getInstance(UnmarshallerContext context) {
		return	QueryHotMoviesResponseUnmarshaller.unmarshall(this, context);
	}
}
