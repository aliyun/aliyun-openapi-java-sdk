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

package com.aliyuncs.ecsops.model.v20160401;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecsops.transform.v20160401.OpsQuerySeqStartEndConfigResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class OpsQuerySeqStartEndConfigResponse extends AcsResponse {

	private String requestId;

	private List<SeqStartEndConfig> seqStartEndConfigs;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<SeqStartEndConfig> getSeqStartEndConfigs() {
		return this.seqStartEndConfigs;
	}

	public void setSeqStartEndConfigs(List<SeqStartEndConfig> seqStartEndConfigs) {
		this.seqStartEndConfigs = seqStartEndConfigs;
	}

	public static class SeqStartEndConfig {

		private String description;

		private String name;

		private List<String> startEvents;

		private List<String> endEvents;

		private List<String> relatedAlarms;

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public List<String> getStartEvents() {
			return this.startEvents;
		}

		public void setStartEvents(List<String> startEvents) {
			this.startEvents = startEvents;
		}

		public List<String> getEndEvents() {
			return this.endEvents;
		}

		public void setEndEvents(List<String> endEvents) {
			this.endEvents = endEvents;
		}

		public List<String> getRelatedAlarms() {
			return this.relatedAlarms;
		}

		public void setRelatedAlarms(List<String> relatedAlarms) {
			this.relatedAlarms = relatedAlarms;
		}
	}

	@Override
	public OpsQuerySeqStartEndConfigResponse getInstance(UnmarshallerContext context) {
		return	OpsQuerySeqStartEndConfigResponseUnmarshaller.unmarshall(this, context);
	}
}
