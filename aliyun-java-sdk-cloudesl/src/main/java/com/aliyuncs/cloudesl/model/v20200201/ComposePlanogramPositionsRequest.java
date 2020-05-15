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

package com.aliyuncs.cloudesl.model.v20200201;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.cloudesl.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ComposePlanogramPositionsRequest extends RpcAcsRequest<ComposePlanogramPositionsResponse> {
	   

	private String actionType;

	private Boolean beAutoRefresh;

	private String storeId;

	private Integer layer;

	private String shelf;

	private String layerOrigin;

	private List<ShelfPositionInfo> shelfPositionInfos;
	public ComposePlanogramPositionsRequest() {
		super("cloudesl", "2020-02-01", "ComposePlanogramPositions", "cloudesl");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getActionType() {
		return this.actionType;
	}

	public void setActionType(String actionType) {
		this.actionType = actionType;
		if(actionType != null){
			putBodyParameter("ActionType", actionType);
		}
	}

	public Boolean getBeAutoRefresh() {
		return this.beAutoRefresh;
	}

	public void setBeAutoRefresh(Boolean beAutoRefresh) {
		this.beAutoRefresh = beAutoRefresh;
		if(beAutoRefresh != null){
			putBodyParameter("BeAutoRefresh", beAutoRefresh.toString());
		}
	}

	public String getStoreId() {
		return this.storeId;
	}

	public void setStoreId(String storeId) {
		this.storeId = storeId;
		if(storeId != null){
			putBodyParameter("StoreId", storeId);
		}
	}

	public Integer getLayer() {
		return this.layer;
	}

	public void setLayer(Integer layer) {
		this.layer = layer;
		if(layer != null){
			putBodyParameter("Layer", layer.toString());
		}
	}

	public String getShelf() {
		return this.shelf;
	}

	public void setShelf(String shelf) {
		this.shelf = shelf;
		if(shelf != null){
			putBodyParameter("Shelf", shelf);
		}
	}

	public String getLayerOrigin() {
		return this.layerOrigin;
	}

	public void setLayerOrigin(String layerOrigin) {
		this.layerOrigin = layerOrigin;
		if(layerOrigin != null){
			putBodyParameter("LayerOrigin", layerOrigin);
		}
	}

	public List<ShelfPositionInfo> getShelfPositionInfos() {
		return this.shelfPositionInfos;
	}

	public void setShelfPositionInfos(List<ShelfPositionInfo> shelfPositionInfos) {
		this.shelfPositionInfos = shelfPositionInfos;	
		if (shelfPositionInfos != null) {
			for (int depth1 = 0; depth1 < shelfPositionInfos.size(); depth1++) {
				putBodyParameter("ShelfPositionInfo." + (depth1 + 1) + ".OffsetFrom" , shelfPositionInfos.get(depth1).getOffsetFrom());
				putBodyParameter("ShelfPositionInfo." + (depth1 + 1) + ".Depth" , shelfPositionInfos.get(depth1).getDepth());
				putBodyParameter("ShelfPositionInfo." + (depth1 + 1) + ".Column" , shelfPositionInfos.get(depth1).getColumn());
				putBodyParameter("ShelfPositionInfo." + (depth1 + 1) + ".Facing" , shelfPositionInfos.get(depth1).getFacing());
				putBodyParameter("ShelfPositionInfo." + (depth1 + 1) + ".OffsetTo" , shelfPositionInfos.get(depth1).getOffsetTo());
				putBodyParameter("ShelfPositionInfo." + (depth1 + 1) + ".ItemBarCode" , shelfPositionInfos.get(depth1).getItemBarCode());
			}
		}	
	}

	public static class ShelfPositionInfo {

		private Float offsetFrom;

		private Float depth;

		private String column;

		private Integer facing;

		private Float offsetTo;

		private String itemBarCode;

		public Float getOffsetFrom() {
			return this.offsetFrom;
		}

		public void setOffsetFrom(Float offsetFrom) {
			this.offsetFrom = offsetFrom;
		}

		public Float getDepth() {
			return this.depth;
		}

		public void setDepth(Float depth) {
			this.depth = depth;
		}

		public String getColumn() {
			return this.column;
		}

		public void setColumn(String column) {
			this.column = column;
		}

		public Integer getFacing() {
			return this.facing;
		}

		public void setFacing(Integer facing) {
			this.facing = facing;
		}

		public Float getOffsetTo() {
			return this.offsetTo;
		}

		public void setOffsetTo(Float offsetTo) {
			this.offsetTo = offsetTo;
		}

		public String getItemBarCode() {
			return this.itemBarCode;
		}

		public void setItemBarCode(String itemBarCode) {
			this.itemBarCode = itemBarCode;
		}
	}

	@Override
	public Class<ComposePlanogramPositionsResponse> getResponseClass() {
		return ComposePlanogramPositionsResponse.class;
	}

}
