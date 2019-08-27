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

package com.aliyuncs.cusanalytic_sc_online.model.v20190524;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.cusanalytic_sc_online.transform.v20190524.GetHeatMapDataResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetHeatMapDataResponse extends AcsResponse {

	private String eMapName;

	private Float width;

	private String eMapUrl;

	private Long storeId;

	private Float height;

	private List<HeatMapItem> heatMapItems;

	public String getEMapName() {
		return this.eMapName;
	}

	public void setEMapName(String eMapName) {
		this.eMapName = eMapName;
	}

	public Float getWidth() {
		return this.width;
	}

	public void setWidth(Float width) {
		this.width = width;
	}

	public String getEMapUrl() {
		return this.eMapUrl;
	}

	public void setEMapUrl(String eMapUrl) {
		this.eMapUrl = eMapUrl;
	}

	public Long getStoreId() {
		return this.storeId;
	}

	public void setStoreId(Long storeId) {
		this.storeId = storeId;
	}

	public Float getHeight() {
		return this.height;
	}

	public void setHeight(Float height) {
		this.height = height;
	}

	public List<HeatMapItem> getHeatMapItems() {
		return this.heatMapItems;
	}

	public void setHeatMapItems(List<HeatMapItem> heatMapItems) {
		this.heatMapItems = heatMapItems;
	}

	public static class HeatMapItem {

		private Float y;

		private Float weight;

		private Float x;

		public Float getY() {
			return this.y;
		}

		public void setY(Float y) {
			this.y = y;
		}

		public Float getWeight() {
			return this.weight;
		}

		public void setWeight(Float weight) {
			this.weight = weight;
		}

		public Float getX() {
			return this.x;
		}

		public void setX(Float x) {
			this.x = x;
		}
	}

	@Override
	public GetHeatMapDataResponse getInstance(UnmarshallerContext context) {
		return	GetHeatMapDataResponseUnmarshaller.unmarshall(this, context);
	}
}
