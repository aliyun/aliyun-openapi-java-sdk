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

package com.aliyuncs.cr.model.v20181201;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.cr.transform.v20181201.GetArtifactBuildTaskResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetArtifactBuildTaskResponse extends AcsResponse {

	private Integer endTime;

	private Integer startTime;

	private String artifactBuildType;

	private String requestId;

	private String taskStatus;

	private String buildTaskId;

	private String code;

	private Boolean isSuccess;

	private List<String> instructions;

	private SourceArtifact sourceArtifact;

	private TargetArtifact targetArtifact;

	public Integer getEndTime() {
		return this.endTime;
	}

	public void setEndTime(Integer endTime) {
		this.endTime = endTime;
	}

	public Integer getStartTime() {
		return this.startTime;
	}

	public void setStartTime(Integer startTime) {
		this.startTime = startTime;
	}

	public String getArtifactBuildType() {
		return this.artifactBuildType;
	}

	public void setArtifactBuildType(String artifactBuildType) {
		this.artifactBuildType = artifactBuildType;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getTaskStatus() {
		return this.taskStatus;
	}

	public void setTaskStatus(String taskStatus) {
		this.taskStatus = taskStatus;
	}

	public String getBuildTaskId() {
		return this.buildTaskId;
	}

	public void setBuildTaskId(String buildTaskId) {
		this.buildTaskId = buildTaskId;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Boolean getIsSuccess() {
		return this.isSuccess;
	}

	public void setIsSuccess(Boolean isSuccess) {
		this.isSuccess = isSuccess;
	}

	public List<String> getInstructions() {
		return this.instructions;
	}

	public void setInstructions(List<String> instructions) {
		this.instructions = instructions;
	}

	public SourceArtifact getSourceArtifact() {
		return this.sourceArtifact;
	}

	public void setSourceArtifact(SourceArtifact sourceArtifact) {
		this.sourceArtifact = sourceArtifact;
	}

	public TargetArtifact getTargetArtifact() {
		return this.targetArtifact;
	}

	public void setTargetArtifact(TargetArtifact targetArtifact) {
		this.targetArtifact = targetArtifact;
	}

	public static class SourceArtifact {

		private String repoId;

		private String version;

		private String artifactType;

		public String getRepoId() {
			return this.repoId;
		}

		public void setRepoId(String repoId) {
			this.repoId = repoId;
		}

		public String getVersion() {
			return this.version;
		}

		public void setVersion(String version) {
			this.version = version;
		}

		public String getArtifactType() {
			return this.artifactType;
		}

		public void setArtifactType(String artifactType) {
			this.artifactType = artifactType;
		}
	}

	public static class TargetArtifact {

		private String repoId;

		private String version;

		private String artifactType;

		public String getRepoId() {
			return this.repoId;
		}

		public void setRepoId(String repoId) {
			this.repoId = repoId;
		}

		public String getVersion() {
			return this.version;
		}

		public void setVersion(String version) {
			this.version = version;
		}

		public String getArtifactType() {
			return this.artifactType;
		}

		public void setArtifactType(String artifactType) {
			this.artifactType = artifactType;
		}
	}

	@Override
	public GetArtifactBuildTaskResponse getInstance(UnmarshallerContext context) {
		return	GetArtifactBuildTaskResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
