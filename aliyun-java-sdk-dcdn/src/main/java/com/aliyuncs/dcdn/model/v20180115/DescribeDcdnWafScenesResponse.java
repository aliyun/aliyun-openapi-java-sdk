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

package com.aliyuncs.dcdn.model.v20180115;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.dcdn.transform.v20180115.DescribeDcdnWafScenesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDcdnWafScenesResponse extends AcsResponse {

	private String requestId;

	private List<DefenseSceneItem> defenseScenes;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<DefenseSceneItem> getDefenseScenes() {
		return this.defenseScenes;
	}

	public void setDefenseScenes(List<DefenseSceneItem> defenseScenes) {
		this.defenseScenes = defenseScenes;
	}

	public static class DefenseSceneItem {

		private Integer policyCount;

		private Integer ruleCount;

		private String defenseScene;

		public Integer getPolicyCount() {
			return this.policyCount;
		}

		public void setPolicyCount(Integer policyCount) {
			this.policyCount = policyCount;
		}

		public Integer getRuleCount() {
			return this.ruleCount;
		}

		public void setRuleCount(Integer ruleCount) {
			this.ruleCount = ruleCount;
		}

		public String getDefenseScene() {
			return this.defenseScene;
		}

		public void setDefenseScene(String defenseScene) {
			this.defenseScene = defenseScene;
		}
	}

	@Override
	public DescribeDcdnWafScenesResponse getInstance(UnmarshallerContext context) {
		return	DescribeDcdnWafScenesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
