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
import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.live.transform.v20161101.AddCasterProgramResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class AddCasterProgramResponse extends AcsResponse {

	private String requestId;

	private List<EpisodeId> episodeIds;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<EpisodeId> getEpisodeIds() {
		return this.episodeIds;
	}

	public void setEpisodeIds(List<EpisodeId> episodeIds) {
		this.episodeIds = episodeIds;
	}

	public static class EpisodeId {

		private String episodeId;

		public String getEpisodeId() {
			return this.episodeId;
		}

		public void setEpisodeId(String episodeId) {
			this.episodeId = episodeId;
		}
	}

	@Override
	public AddCasterProgramResponse getInstance(UnmarshallerContext context) {
		return	AddCasterProgramResponseUnmarshaller.unmarshall(this, context);
	}
}
