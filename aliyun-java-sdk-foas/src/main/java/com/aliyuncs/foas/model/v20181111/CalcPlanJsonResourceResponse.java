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

package com.aliyuncs.foas.model.v20181111;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.foas.transform.v20181111.CalcPlanJsonResourceResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class CalcPlanJsonResourceResponse extends AcsResponse {

	private String requestId;

	private PlanJsonResource planJsonResource;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public PlanJsonResource getPlanJsonResource() {
		return this.planJsonResource;
	}

	public void setPlanJsonResource(PlanJsonResource planJsonResource) {
		this.planJsonResource = planJsonResource;
	}

	public static class PlanJsonResource {

		private Float cores;

		private Float memoryGB;

		public Float getCores() {
			return this.cores;
		}

		public void setCores(Float cores) {
			this.cores = cores;
		}

		public Float getMemoryGB() {
			return this.memoryGB;
		}

		public void setMemoryGB(Float memoryGB) {
			this.memoryGB = memoryGB;
		}
	}

	@Override
	public CalcPlanJsonResourceResponse getInstance(UnmarshallerContext context) {
		return	CalcPlanJsonResourceResponseUnmarshaller.unmarshall(this, context);
	}
}
