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
import com.aliyuncs.dcdn.transform.v20180115.DescribeDcdnWafDomainDetailResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDcdnWafDomainDetailResponse extends AcsResponse {

	private String requestId;

	private Domain domain;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Domain getDomain() {
		return this.domain;
	}

	public void setDomain(Domain domain) {
		this.domain = domain;
	}

	public static class Domain {

		private String domainName;

		private List<DefenseSceneItem> defenseScenes;

		public String getDomainName() {
			return this.domainName;
		}

		public void setDomainName(String domainName) {
			this.domainName = domainName;
		}

		public List<DefenseSceneItem> getDefenseScenes() {
			return this.defenseScenes;
		}

		public void setDefenseScenes(List<DefenseSceneItem> defenseScenes) {
			this.defenseScenes = defenseScenes;
		}

		public static class DefenseSceneItem {

			private String defenseScene;

			private Long policyId;

			public String getDefenseScene() {
				return this.defenseScene;
			}

			public void setDefenseScene(String defenseScene) {
				this.defenseScene = defenseScene;
			}

			public Long getPolicyId() {
				return this.policyId;
			}

			public void setPolicyId(Long policyId) {
				this.policyId = policyId;
			}
		}
	}

	@Override
	public DescribeDcdnWafDomainDetailResponse getInstance(UnmarshallerContext context) {
		return	DescribeDcdnWafDomainDetailResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
