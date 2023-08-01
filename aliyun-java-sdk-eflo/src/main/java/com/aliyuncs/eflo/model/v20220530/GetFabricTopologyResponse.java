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

package com.aliyuncs.eflo.model.v20220530;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.eflo.transform.v20220530.GetFabricTopologyResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetFabricTopologyResponse extends AcsResponse {

	private Integer code;

	private String message;

	private String requestId;

	private Content content;

	public Integer getCode() {
		return this.code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Content getContent() {
		return this.content;
	}

	public void setContent(Content content) {
		this.content = content;
	}

	public static class Content {

		private String regionId;

		private String vpdId;

		private List<Layer> topoInfo;

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public String getVpdId() {
			return this.vpdId;
		}

		public void setVpdId(String vpdId) {
			this.vpdId = vpdId;
		}

		public List<Layer> getTopoInfo() {
			return this.topoInfo;
		}

		public void setTopoInfo(List<Layer> topoInfo) {
			this.topoInfo = topoInfo;
		}

		public static class Layer {

			private String layerType;

			private String layerName;

			private List<String> nextLayer;

			public String getLayerType() {
				return this.layerType;
			}

			public void setLayerType(String layerType) {
				this.layerType = layerType;
			}

			public String getLayerName() {
				return this.layerName;
			}

			public void setLayerName(String layerName) {
				this.layerName = layerName;
			}

			public List<String> getNextLayer() {
				return this.nextLayer;
			}

			public void setNextLayer(List<String> nextLayer) {
				this.nextLayer = nextLayer;
			}
		}
	}

	@Override
	public GetFabricTopologyResponse getInstance(UnmarshallerContext context) {
		return	GetFabricTopologyResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
