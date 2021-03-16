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
import com.aliyuncs.ecsops.transform.v20160401.OpsHouyiQueryAllWorkflowTypesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class OpsHouyiQueryAllWorkflowTypesResponse extends AcsResponse {

	private List<String> workflowTypes;

	public List<String> getWorkflowTypes() {
		return this.workflowTypes;
	}

	public void setWorkflowTypes(List<String> workflowTypes) {
		this.workflowTypes = workflowTypes;
	}

	@Override
	public OpsHouyiQueryAllWorkflowTypesResponse getInstance(UnmarshallerContext context) {
		return	OpsHouyiQueryAllWorkflowTypesResponseUnmarshaller.unmarshall(this, context);
	}
}
