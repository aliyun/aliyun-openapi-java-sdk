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

package com.aliyuncs.pairecservice.model.v20221213;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.pairecservice.transform.v20221213.ListLayersResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListLayersResponse extends AcsResponse {

	private String requestId;

	private Long totalCount;

	private List<LayersItem> layers;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Long getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}

	public List<LayersItem> getLayers() {
		return this.layers;
	}

	public void setLayers(List<LayersItem> layers) {
		this.layers = layers;
	}

	public static class LayersItem {

		private String layerId;

		private String laboratoryId;

		private String sceneId;

		private String name;

		private String description;

		public String getLayerId() {
			return this.layerId;
		}

		public void setLayerId(String layerId) {
			this.layerId = layerId;
		}

		public String getLaboratoryId() {
			return this.laboratoryId;
		}

		public void setLaboratoryId(String laboratoryId) {
			this.laboratoryId = laboratoryId;
		}

		public String getSceneId() {
			return this.sceneId;
		}

		public void setSceneId(String sceneId) {
			this.sceneId = sceneId;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}
	}

	@Override
	public ListLayersResponse getInstance(UnmarshallerContext context) {
		return	ListLayersResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
