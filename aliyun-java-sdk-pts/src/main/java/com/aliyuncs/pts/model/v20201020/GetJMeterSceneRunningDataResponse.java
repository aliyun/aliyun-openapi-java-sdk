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

package com.aliyuncs.pts.model.v20201020;

import java.util.List;
import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.pts.transform.v20201020.GetJMeterSceneRunningDataResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetJMeterSceneRunningDataResponse extends AcsResponse {

	private String message;

	private String requestId;

	private String code;

	private Boolean success;

	private Integer httpStatusCode;

	private String documentUrl;

	private RunningData runningData;

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

	public Integer getHttpStatusCode() {
		return this.httpStatusCode;
	}

	public void setHttpStatusCode(Integer httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
	}

	public String getDocumentUrl() {
		return this.documentUrl;
	}

	public void setDocumentUrl(String documentUrl) {
		this.documentUrl = documentUrl;
	}

	public RunningData getRunningData() {
		return this.runningData;
	}

	public void setRunningData(RunningData runningData) {
		this.runningData = runningData;
	}

	public static class RunningData {

		private String sceneId;

		private String sceneName;

		private Integer holdFor;

		private Integer agentCount;

		private Integer concurrency;

		private Boolean hasReport;

		private Boolean isDebugging;

		private String status;

		private Long vum;

		private Long startTimeTS;

		private String stageName;

		private Map<Object,Object> allSampleStat;

		private List<String> agentIdList;

		private List<Map<Object,Object>> sampleStatList;

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

		public Integer getHoldFor() {
			return this.holdFor;
		}

		public void setHoldFor(Integer holdFor) {
			this.holdFor = holdFor;
		}

		public Integer getAgentCount() {
			return this.agentCount;
		}

		public void setAgentCount(Integer agentCount) {
			this.agentCount = agentCount;
		}

		public Integer getConcurrency() {
			return this.concurrency;
		}

		public void setConcurrency(Integer concurrency) {
			this.concurrency = concurrency;
		}

		public Boolean getHasReport() {
			return this.hasReport;
		}

		public void setHasReport(Boolean hasReport) {
			this.hasReport = hasReport;
		}

		public Boolean getIsDebugging() {
			return this.isDebugging;
		}

		public void setIsDebugging(Boolean isDebugging) {
			this.isDebugging = isDebugging;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public Long getVum() {
			return this.vum;
		}

		public void setVum(Long vum) {
			this.vum = vum;
		}

		public Long getStartTimeTS() {
			return this.startTimeTS;
		}

		public void setStartTimeTS(Long startTimeTS) {
			this.startTimeTS = startTimeTS;
		}

		public String getStageName() {
			return this.stageName;
		}

		public void setStageName(String stageName) {
			this.stageName = stageName;
		}

		public Map<Object,Object> getAllSampleStat() {
			return this.allSampleStat;
		}

		public void setAllSampleStat(Map<Object,Object> allSampleStat) {
			this.allSampleStat = allSampleStat;
		}

		public List<String> getAgentIdList() {
			return this.agentIdList;
		}

		public void setAgentIdList(List<String> agentIdList) {
			this.agentIdList = agentIdList;
		}

		public List<Map<Object,Object>> getSampleStatList() {
			return this.sampleStatList;
		}

		public void setSampleStatList(List<Map<Object,Object>> sampleStatList) {
			this.sampleStatList = sampleStatList;
		}
	}

	@Override
	public GetJMeterSceneRunningDataResponse getInstance(UnmarshallerContext context) {
		return	GetJMeterSceneRunningDataResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
