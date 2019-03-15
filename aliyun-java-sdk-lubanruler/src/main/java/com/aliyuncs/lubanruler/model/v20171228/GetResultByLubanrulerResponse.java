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

package com.aliyuncs.lubanruler.model.v20171228;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.lubanruler.transform.v20171228.GetResultByLubanrulerResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetResultByLubanrulerResponse extends AcsResponse {

	private String code;

	private String message;

	private String runStatus;

	private String requestId;

	private Data data;

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

	public String getRunStatus() {
		return this.runStatus;
	}

	public void setRunStatus(String runStatus) {
		this.runStatus = runStatus;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private Integer aonePipelineId;

		private String appName;

		private String scmUrl;

		private String scmBranch;

		private String taskStatus;

		private Integer blockerCnt;

		private Integer criticalCnt;

		private Integer infoCnt;

		private Integer majorCnt;

		private Integer minorCnt;

		private String complexity;

		private String duplicatedLinesDensity;

		private String reliabilityRating;

		private String securityRating;

		private String sqaleRating;

		private String lineOfCode;

		private String functions;

		private String resultUrl;

		private String commentLinesDensity;

		public Integer getAonePipelineId() {
			return this.aonePipelineId;
		}

		public void setAonePipelineId(Integer aonePipelineId) {
			this.aonePipelineId = aonePipelineId;
		}

		public String getAppName() {
			return this.appName;
		}

		public void setAppName(String appName) {
			this.appName = appName;
		}

		public String getScmUrl() {
			return this.scmUrl;
		}

		public void setScmUrl(String scmUrl) {
			this.scmUrl = scmUrl;
		}

		public String getScmBranch() {
			return this.scmBranch;
		}

		public void setScmBranch(String scmBranch) {
			this.scmBranch = scmBranch;
		}

		public String getTaskStatus() {
			return this.taskStatus;
		}

		public void setTaskStatus(String taskStatus) {
			this.taskStatus = taskStatus;
		}

		public Integer getBlockerCnt() {
			return this.blockerCnt;
		}

		public void setBlockerCnt(Integer blockerCnt) {
			this.blockerCnt = blockerCnt;
		}

		public Integer getCriticalCnt() {
			return this.criticalCnt;
		}

		public void setCriticalCnt(Integer criticalCnt) {
			this.criticalCnt = criticalCnt;
		}

		public Integer getInfoCnt() {
			return this.infoCnt;
		}

		public void setInfoCnt(Integer infoCnt) {
			this.infoCnt = infoCnt;
		}

		public Integer getMajorCnt() {
			return this.majorCnt;
		}

		public void setMajorCnt(Integer majorCnt) {
			this.majorCnt = majorCnt;
		}

		public Integer getMinorCnt() {
			return this.minorCnt;
		}

		public void setMinorCnt(Integer minorCnt) {
			this.minorCnt = minorCnt;
		}

		public String getComplexity() {
			return this.complexity;
		}

		public void setComplexity(String complexity) {
			this.complexity = complexity;
		}

		public String getDuplicatedLinesDensity() {
			return this.duplicatedLinesDensity;
		}

		public void setDuplicatedLinesDensity(String duplicatedLinesDensity) {
			this.duplicatedLinesDensity = duplicatedLinesDensity;
		}

		public String getReliabilityRating() {
			return this.reliabilityRating;
		}

		public void setReliabilityRating(String reliabilityRating) {
			this.reliabilityRating = reliabilityRating;
		}

		public String getSecurityRating() {
			return this.securityRating;
		}

		public void setSecurityRating(String securityRating) {
			this.securityRating = securityRating;
		}

		public String getSqaleRating() {
			return this.sqaleRating;
		}

		public void setSqaleRating(String sqaleRating) {
			this.sqaleRating = sqaleRating;
		}

		public String getLineOfCode() {
			return this.lineOfCode;
		}

		public void setLineOfCode(String lineOfCode) {
			this.lineOfCode = lineOfCode;
		}

		public String getFunctions() {
			return this.functions;
		}

		public void setFunctions(String functions) {
			this.functions = functions;
		}

		public String getResultUrl() {
			return this.resultUrl;
		}

		public void setResultUrl(String resultUrl) {
			this.resultUrl = resultUrl;
		}

		public String getCommentLinesDensity() {
			return this.commentLinesDensity;
		}

		public void setCommentLinesDensity(String commentLinesDensity) {
			this.commentLinesDensity = commentLinesDensity;
		}
	}

	@Override
	public GetResultByLubanrulerResponse getInstance(UnmarshallerContext context) {
		return	GetResultByLubanrulerResponseUnmarshaller.unmarshall(this, context);
	}
}
