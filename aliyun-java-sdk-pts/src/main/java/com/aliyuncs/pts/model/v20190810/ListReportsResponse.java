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

package com.aliyuncs.pts.model.v20190810;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.pts.transform.v20190810.ListReportsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListReportsResponse extends AcsResponse {

	private Integer pageNumber;

	private String code;

	private String requestId;

	private Boolean success;

	private Integer pageSize;

	private Integer totalCount;

	private String message;

	private Integer httpStatusCode;

	private List<Report> reports;

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Integer getHttpStatusCode() {
		return this.httpStatusCode;
	}

	public void setHttpStatusCode(Integer httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
	}

	public List<Report> getReports() {
		return this.reports;
	}

	public void setReports(List<Report> reports) {
		this.reports = reports;
	}

	public static class Report {

		private String reportId;

		private String sceneId;

		private String sceneName;

		private String sceneType;

		private Integer maxConcurrency;

		private Integer vum;

		private String duration;

		private Long beginTime;

		private Boolean sceneDeleted;

		private String requestId;

		public String getReportId() {
			return this.reportId;
		}

		public void setReportId(String reportId) {
			this.reportId = reportId;
		}

		public String getSceneId() {
			return this.sceneId;
		}

		public void setSceneId(String sceneId) {
			this.sceneId = sceneId;
		}

		public String getSceneName() {
			return this.sceneName;
		}

		public void setSceneName(String sceneName) {
			this.sceneName = sceneName;
		}

		public String getSceneType() {
			return this.sceneType;
		}

		public void setSceneType(String sceneType) {
			this.sceneType = sceneType;
		}

		public Integer getMaxConcurrency() {
			return this.maxConcurrency;
		}

		public void setMaxConcurrency(Integer maxConcurrency) {
			this.maxConcurrency = maxConcurrency;
		}

		public Integer getVum() {
			return this.vum;
		}

		public void setVum(Integer vum) {
			this.vum = vum;
		}

		public String getDuration() {
			return this.duration;
		}

		public void setDuration(String duration) {
			this.duration = duration;
		}

		public Long getBeginTime() {
			return this.beginTime;
		}

		public void setBeginTime(Long beginTime) {
			this.beginTime = beginTime;
		}

		public Boolean getSceneDeleted() {
			return this.sceneDeleted;
		}

		public void setSceneDeleted(Boolean sceneDeleted) {
			this.sceneDeleted = sceneDeleted;
		}

		public String getRequestId() {
			return this.requestId;
		}

		public void setRequestId(String requestId) {
			this.requestId = requestId;
		}
	}

	@Override
	public ListReportsResponse getInstance(UnmarshallerContext context) {
		return	ListReportsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
