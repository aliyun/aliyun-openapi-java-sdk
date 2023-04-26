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

package com.aliyuncs.ecs.model.v20160314;

import java.util.List;
import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecs.transform.v20160314.DescribeEcsScenarioFacadeResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeEcsScenarioFacadeResponse extends AcsResponse {

	private String requestId;

	private List<Scenario> scenarios;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<Scenario> getScenarios() {
		return this.scenarios;
	}

	public void setScenarios(List<Scenario> scenarios) {
		this.scenarios = scenarios;
	}

	public static class Scenario {

		private String scenario;

		private List<Content> contents;

		public String getScenario() {
			return this.scenario;
		}

		public void setScenario(String scenario) {
			this.scenario = scenario;
		}

		public List<Content> getContents() {
			return this.contents;
		}

		public void setContents(List<Content> contents) {
			this.contents = contents;
		}

		public static class Content {

			private Map<Object,Object> action;

			private Map<Object,Object> track;

			private Map<Object,Object> attributes;

			private String title;

			private String description;

			private String icon;

			private String tips;

			private String colorLevel;

			private String supportCancel;

			private List<EcsScenarioContent> ecsScenarioContentData;

			public Map<Object,Object> getAction() {
				return this.action;
			}

			public void setAction(Map<Object,Object> action) {
				this.action = action;
			}

			public Map<Object,Object> getTrack() {
				return this.track;
			}

			public void setTrack(Map<Object,Object> track) {
				this.track = track;
			}

			public Map<Object,Object> getAttributes() {
				return this.attributes;
			}

			public void setAttributes(Map<Object,Object> attributes) {
				this.attributes = attributes;
			}

			public String getTitle() {
				return this.title;
			}

			public void setTitle(String title) {
				this.title = title;
			}

			public String getDescription() {
				return this.description;
			}

			public void setDescription(String description) {
				this.description = description;
			}

			public String getIcon() {
				return this.icon;
			}

			public void setIcon(String icon) {
				this.icon = icon;
			}

			public String getTips() {
				return this.tips;
			}

			public void setTips(String tips) {
				this.tips = tips;
			}

			public String getColorLevel() {
				return this.colorLevel;
			}

			public void setColorLevel(String colorLevel) {
				this.colorLevel = colorLevel;
			}

			public String getSupportCancel() {
				return this.supportCancel;
			}

			public void setSupportCancel(String supportCancel) {
				this.supportCancel = supportCancel;
			}

			public List<EcsScenarioContent> getEcsScenarioContentData() {
				return this.ecsScenarioContentData;
			}

			public void setEcsScenarioContentData(List<EcsScenarioContent> ecsScenarioContentData) {
				this.ecsScenarioContentData = ecsScenarioContentData;
			}

			public static class EcsScenarioContent {

				private String type;

				private List<String> values;

				public String getType() {
					return this.type;
				}

				public void setType(String type) {
					this.type = type;
				}

				public List<String> getValues() {
					return this.values;
				}

				public void setValues(List<String> values) {
					this.values = values;
				}
			}
		}
	}

	@Override
	public DescribeEcsScenarioFacadeResponse getInstance(UnmarshallerContext context) {
		return	DescribeEcsScenarioFacadeResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
