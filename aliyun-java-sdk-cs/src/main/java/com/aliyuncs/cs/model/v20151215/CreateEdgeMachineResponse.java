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
import com.aliyuncs.cs.transform.v20151215.CreateEdgeMachineResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class CreateEdgeMachineResponse extends AcsResponse {

	private String request_id;

	private String edge_machine_id;

	public String getRequest_id() {
		return this.request_id;
	}

	public void setRequest_id(String request_id) {
		this.request_id = request_id;
	}

	public String getEdge_machine_id() {
		return this.edge_machine_id;
	}

	public void setEdge_machine_id(String edge_machine_id) {
		this.edge_machine_id = edge_machine_id;
	}

	@Override
	public CreateEdgeMachineResponse getInstance(UnmarshallerContext context) {
		return	CreateEdgeMachineResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
