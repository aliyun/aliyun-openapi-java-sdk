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

package com.aliyuncs.ecs.model.v20140526;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecs.transform.v20140526.DescribeInstanceTypeFamiliesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeInstanceTypeFamiliesResponse extends AcsResponse {

	private String requestId;

	private List<InstanceTypeFamily> instanceTypeFamilies;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<InstanceTypeFamily> getInstanceTypeFamilies() {
		return this.instanceTypeFamilies;
	}

	public void setInstanceTypeFamilies(List<InstanceTypeFamily> instanceTypeFamilies) {
		this.instanceTypeFamilies = instanceTypeFamilies;
	}

	public static class InstanceTypeFamily {

		private String instanceTypeFamilyId;

		private String generation;

		public String getInstanceTypeFamilyId() {
			return this.instanceTypeFamilyId;
		}

		public void setInstanceTypeFamilyId(String instanceTypeFamilyId) {
			this.instanceTypeFamilyId = instanceTypeFamilyId;
		}

		public String getGeneration() {
			return this.generation;
		}

		public void setGeneration(String generation) {
			this.generation = generation;
		}
	}

	@Override
	public DescribeInstanceTypeFamiliesResponse getInstance(UnmarshallerContext context) {
		return	DescribeInstanceTypeFamiliesResponseUnmarshaller.unmarshall(this, context);
	}
}
