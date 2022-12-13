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

package com.aliyuncs.cs.model.v20151215;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.cs.transform.v20151215.ModifyClusterNodePoolResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ModifyClusterNodePoolResponse extends AcsResponse {

	private String task_id;

	private String nodepool_id;

	public String getTask_id() {
		return this.task_id;
	}

	public void setTask_id(String task_id) {
		this.task_id = task_id;
	}

	public String getNodepool_id() {
		return this.nodepool_id;
	}

	public void setNodepool_id(String nodepool_id) {
		this.nodepool_id = nodepool_id;
	}

	@Override
	public ModifyClusterNodePoolResponse getInstance(UnmarshallerContext context) {
		return	ModifyClusterNodePoolResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
