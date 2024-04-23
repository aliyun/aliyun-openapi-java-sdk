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

package com.aliyuncs.computenestsupplier.model.v20210521;

import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.computenestsupplier.transform.v20210521.GetServiceEstimateCostResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetServiceEstimateCostResponse extends AcsResponse {

	private String requestId;

	private Map<Object,Object> resources;

	private Map<Object,Object> commodity;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Map<Object,Object> getResources() {
		return this.resources;
	}

	public void setResources(Map<Object,Object> resources) {
		this.resources = resources;
	}

	public Map<Object,Object> getCommodity() {
		return this.commodity;
	}

	public void setCommodity(Map<Object,Object> commodity) {
		this.commodity = commodity;
	}

	@Override
	public GetServiceEstimateCostResponse getInstance(UnmarshallerContext context) {
		return	GetServiceEstimateCostResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
