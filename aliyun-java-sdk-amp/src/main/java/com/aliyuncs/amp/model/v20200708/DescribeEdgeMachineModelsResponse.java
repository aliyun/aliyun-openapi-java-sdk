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

package com.aliyuncs.amp.model.v20200708;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.amp.transform.v20200708.DescribeEdgeMachineModelsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeEdgeMachineModelsResponse extends AcsResponse {

	private List<Models_info> models;

	public List<Models_info> getModels() {
		return this.models;
	}

	public void setModels(List<Models_info> models) {
		this.models = models;
	}

	public static class Models_info {

		private String model_id;

		private String created;

		private String model;

		private String description;

		private String cpu_arch;

		private Integer cpu;

		private Integer memory;

		public String getModel_id() {
			return this.model_id;
		}

		public void setModel_id(String model_id) {
			this.model_id = model_id;
		}

		public String getCreated() {
			return this.created;
		}

		public void setCreated(String created) {
			this.created = created;
		}

		public String getModel() {
			return this.model;
		}

		public void setModel(String model) {
			this.model = model;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getCpu_arch() {
			return this.cpu_arch;
		}

		public void setCpu_arch(String cpu_arch) {
			this.cpu_arch = cpu_arch;
		}

		public Integer getCpu() {
			return this.cpu;
		}

		public void setCpu(Integer cpu) {
			this.cpu = cpu;
		}

		public Integer getMemory() {
			return this.memory;
		}

		public void setMemory(Integer memory) {
			this.memory = memory;
		}
	}

	@Override
	public DescribeEdgeMachineModelsResponse getInstance(UnmarshallerContext context) {
		return	DescribeEdgeMachineModelsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
