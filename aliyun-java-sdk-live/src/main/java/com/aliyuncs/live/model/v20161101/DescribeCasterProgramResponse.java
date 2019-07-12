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

package com.aliyuncs.live.model.v20161101;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.live.transform.v20161101.DescribeCasterProgramResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeCasterProgramResponse extends AcsResponse {

	private String requestId;

	private String casterId;

	private String programName;

	private Integer programEffect;

	private Integer total;

	private List<Episode> episodes;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getCasterId() {
		return this.casterId;
	}

	public void setCasterId(String casterId) {
		this.casterId = casterId;
	}

	public String getProgramName() {
		return this.programName;
	}

	public void setProgramName(String programName) {
		this.programName = programName;
	}

	public Integer getProgramEffect() {
		return this.programEffect;
	}

	public void setProgramEffect(Integer programEffect) {
		this.programEffect = programEffect;
	}

	public Integer getTotal() {
		return this.total;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}

	public List<Episode> getEpisodes() {
		return this.episodes;
	}

	public void setEpisodes(List<Episode> episodes) {
		this.episodes = episodes;
	}

	public static class Episode {

		private String episodeId;

		private String episodeType;

		private String episodeName;

		private String resourceId;

		private String startTime;

		private String endTime;

		private String switchType;

		private Integer status;

		private List<String> componentIds;

		public String getEpisodeId() {
			return this.episodeId;
		}

		public void setEpisodeId(String episodeId) {
			this.episodeId = episodeId;
		}

		public String getEpisodeType() {
			return this.episodeType;
		}

		public void setEpisodeType(String episodeType) {
			this.episodeType = episodeType;
		}

		public String getEpisodeName() {
			return this.episodeName;
		}

		public void setEpisodeName(String episodeName) {
			this.episodeName = episodeName;
		}

		public String getResourceId() {
			return this.resourceId;
		}

		public void setResourceId(String resourceId) {
			this.resourceId = resourceId;
		}

		public String getStartTime() {
			return this.startTime;
		}

		public void setStartTime(String startTime) {
			this.startTime = startTime;
		}

		public String getEndTime() {
			return this.endTime;
		}

		public void setEndTime(String endTime) {
			this.endTime = endTime;
		}

		public String getSwitchType() {
			return this.switchType;
		}

		public void setSwitchType(String switchType) {
			this.switchType = switchType;
		}

		public Integer getStatus() {
			return this.status;
		}

		public void setStatus(Integer status) {
			this.status = status;
		}

		public List<String> getComponentIds() {
			return this.componentIds;
		}

		public void setComponentIds(List<String> componentIds) {
			this.componentIds = componentIds;
		}
	}

	@Override
	public DescribeCasterProgramResponse getInstance(UnmarshallerContext context) {
		return	DescribeCasterProgramResponseUnmarshaller.unmarshall(this, context);
	}
}
