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

package com.aliyuncs.sas.model.v20181203;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.sas.transform.v20181203.DescribeNoticeConfigResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeNoticeConfigResponse extends AcsResponse {

	private String requestId;

	private List<NoticeConfig> noticeConfigList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<NoticeConfig> getNoticeConfigList() {
		return this.noticeConfigList;
	}

	public void setNoticeConfigList(List<NoticeConfig> noticeConfigList) {
		this.noticeConfigList = noticeConfigList;
	}

	public static class NoticeConfig {

		private Integer timeLimit;

		private Integer route;

		private String project;

		private Long aliUid;

		private Integer currentPage;

		public Integer getTimeLimit() {
			return this.timeLimit;
		}

		public void setTimeLimit(Integer timeLimit) {
			this.timeLimit = timeLimit;
		}

		public Integer getRoute() {
			return this.route;
		}

		public void setRoute(Integer route) {
			this.route = route;
		}

		public String getProject() {
			return this.project;
		}

		public void setProject(String project) {
			this.project = project;
		}

		public Long getAliUid() {
			return this.aliUid;
		}

		public void setAliUid(Long aliUid) {
			this.aliUid = aliUid;
		}

		public Integer getCurrentPage() {
			return this.currentPage;
		}

		public void setCurrentPage(Integer currentPage) {
			this.currentPage = currentPage;
		}
	}

	@Override
	public DescribeNoticeConfigResponse getInstance(UnmarshallerContext context) {
		return	DescribeNoticeConfigResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
