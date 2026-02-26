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

package com.aliyuncs.ess.model.v20140828;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ess.transform.v20140828.DescribePatternTypesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribePatternTypesResponse extends AcsResponse {

	private String requestId;

	private List<PatternType> patternTypes;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<PatternType> getPatternTypes() {
		return this.patternTypes;
	}

	public void setPatternTypes(List<PatternType> patternTypes) {
		this.patternTypes = patternTypes;
	}

	public static class PatternType {

		private String instanceType;

		private String instanceFamilyLevel;

		private String instanceTypeFamily;

		private Integer cores;

		private Float memory;

		public String getInstanceType() {
			return this.instanceType;
		}

		public void setInstanceType(String instanceType) {
			this.instanceType = instanceType;
		}

		public String getInstanceFamilyLevel() {
			return this.instanceFamilyLevel;
		}

		public void setInstanceFamilyLevel(String instanceFamilyLevel) {
			this.instanceFamilyLevel = instanceFamilyLevel;
		}

		public String getInstanceTypeFamily() {
			return this.instanceTypeFamily;
		}

		public void setInstanceTypeFamily(String instanceTypeFamily) {
			this.instanceTypeFamily = instanceTypeFamily;
		}

		public Integer getCores() {
			return this.cores;
		}

		public void setCores(Integer cores) {
			this.cores = cores;
		}

		public Float getMemory() {
			return this.memory;
		}

		public void setMemory(Float memory) {
			this.memory = memory;
		}
	}

	@Override
	public DescribePatternTypesResponse getInstance(UnmarshallerContext context) {
		return	DescribePatternTypesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
