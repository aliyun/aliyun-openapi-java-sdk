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

package com.aliyuncs.aegis.model.v20161111;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.aegis.transform.v20161111.DescribeMachineConfigResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeMachineConfigResponse extends AcsResponse {

	private String requestId;

	private Integer count;

	private List<ConfigTarget> configTargets;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getCount() {
		return this.count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	public List<ConfigTarget> getConfigTargets() {
		return this.configTargets;
	}

	public void setConfigTargets(List<ConfigTarget> configTargets) {
		this.configTargets = configTargets;
	}

	public static class ConfigTarget {

		private String targetType;

		private String target;

		private String flag;

		public String getTargetType() {
			return this.targetType;
		}

		public void setTargetType(String targetType) {
			this.targetType = targetType;
		}

		public String getTarget() {
			return this.target;
		}

		public void setTarget(String target) {
			this.target = target;
		}

		public String getFlag() {
			return this.flag;
		}

		public void setFlag(String flag) {
			this.flag = flag;
		}
	}

	@Override
	public DescribeMachineConfigResponse getInstance(UnmarshallerContext context) {
		return	DescribeMachineConfigResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
