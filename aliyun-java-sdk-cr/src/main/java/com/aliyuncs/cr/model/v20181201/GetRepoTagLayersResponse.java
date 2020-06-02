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

package com.aliyuncs.cr.model.v20181201;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.cr.transform.v20181201.GetRepoTagLayersResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetRepoTagLayersResponse extends AcsResponse {

	private Boolean isSuccess;

	private String code;

	private String requestId;

	private List<LayersItem> layers;

	public Boolean getIsSuccess() {
		return this.isSuccess;
	}

	public void setIsSuccess(Boolean isSuccess) {
		this.isSuccess = isSuccess;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<LayersItem> getLayers() {
		return this.layers;
	}

	public void setLayers(List<LayersItem> layers) {
		this.layers = layers;
	}

	public static class LayersItem {

		private String blobDigest;

		private Long blobSize;

		private String layerInstruction;

		private String layerCMD;

		private Integer layerIndex;

		public String getBlobDigest() {
			return this.blobDigest;
		}

		public void setBlobDigest(String blobDigest) {
			this.blobDigest = blobDigest;
		}

		public Long getBlobSize() {
			return this.blobSize;
		}

		public void setBlobSize(Long blobSize) {
			this.blobSize = blobSize;
		}

		public String getLayerInstruction() {
			return this.layerInstruction;
		}

		public void setLayerInstruction(String layerInstruction) {
			this.layerInstruction = layerInstruction;
		}

		public String getLayerCMD() {
			return this.layerCMD;
		}

		public void setLayerCMD(String layerCMD) {
			this.layerCMD = layerCMD;
		}

		public Integer getLayerIndex() {
			return this.layerIndex;
		}

		public void setLayerIndex(Integer layerIndex) {
			this.layerIndex = layerIndex;
		}
	}

	@Override
	public GetRepoTagLayersResponse getInstance(UnmarshallerContext context) {
		return	GetRepoTagLayersResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
