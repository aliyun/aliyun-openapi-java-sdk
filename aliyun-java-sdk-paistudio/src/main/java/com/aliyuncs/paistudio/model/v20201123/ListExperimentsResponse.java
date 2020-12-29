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

package com.aliyuncs.paistudio.model.v20201123;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.paistudio.transform.v20201123.ListExperimentsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListExperimentsResponse extends AcsResponse {

	private String code;

	private String message;

	private String requestId;

	private Integer totalCount;

	private List<Experiment> data;

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

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public List<Experiment> getData() {
		return this.data;
	}

	public void setData(List<Experiment> data) {
		this.data = data;
	}

	public static class Experiment {

		private Long gmtCreate;

		private Long gmtModified;

		private String creator;

		private String parentUserId;

		private String workspaceId;

		private String experimentId;

		private Long version;

		private String name;

		private String description;

		private String source;

		public Long getGmtCreate() {
			return this.gmtCreate;
		}

		public void setGmtCreate(Long gmtCreate) {
			this.gmtCreate = gmtCreate;
		}

		public Long getGmtModified() {
			return this.gmtModified;
		}

		public void setGmtModified(Long gmtModified) {
			this.gmtModified = gmtModified;
		}

		public String getCreator() {
			return this.creator;
		}

		public void setCreator(String creator) {
			this.creator = creator;
		}

		public String getParentUserId() {
			return this.parentUserId;
		}

		public void setParentUserId(String parentUserId) {
			this.parentUserId = parentUserId;
		}

		public String getWorkspaceId() {
			return this.workspaceId;
		}

		public void setWorkspaceId(String workspaceId) {
			this.workspaceId = workspaceId;
		}

		public String getExperimentId() {
			return this.experimentId;
		}

		public void setExperimentId(String experimentId) {
			this.experimentId = experimentId;
		}

		public Long getVersion() {
			return this.version;
		}

		public void setVersion(Long version) {
			this.version = version;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getSource() {
			return this.source;
		}

		public void setSource(String source) {
			this.source = source;
		}
	}

	@Override
	public ListExperimentsResponse getInstance(UnmarshallerContext context) {
		return	ListExperimentsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
