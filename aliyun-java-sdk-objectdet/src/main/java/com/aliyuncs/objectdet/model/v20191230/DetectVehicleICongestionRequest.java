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

package com.aliyuncs.objectdet.model.v20191230;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.objectdet.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DetectVehicleICongestionRequest extends RpcAcsRequest<DetectVehicleICongestionResponse> {
	   

	@SerializedName("roadRegions")
	private List<RoadRegions> roadRegions;

	@SerializedName("preRegionIntersectFeatures")
	private List<PreRegionIntersectFeatures> preRegionIntersectFeatures;

	private String imageURL;
	public DetectVehicleICongestionRequest() {
		super("objectdet", "2019-12-30", "DetectVehicleICongestion");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public List<RoadRegions> getRoadRegions() {
		return this.roadRegions;
	}

	public void setRoadRegions(List<RoadRegions> roadRegions) {
		this.roadRegions = roadRegions;	
		if (roadRegions != null) {
			putBodyParameter("RoadRegions" , new Gson().toJson(roadRegions));
		}	
	}

	public List<PreRegionIntersectFeatures> getPreRegionIntersectFeatures() {
		return this.preRegionIntersectFeatures;
	}

	public void setPreRegionIntersectFeatures(List<PreRegionIntersectFeatures> preRegionIntersectFeatures) {
		this.preRegionIntersectFeatures = preRegionIntersectFeatures;	
		if (preRegionIntersectFeatures != null) {
			putBodyParameter("PreRegionIntersectFeatures" , new Gson().toJson(preRegionIntersectFeatures));
		}	
	}

	public String getImageURL() {
		return this.imageURL;
	}

	public void setImageURL(String imageURL) {
		this.imageURL = imageURL;
		if(imageURL != null){
			putBodyParameter("ImageURL", imageURL);
		}
	}

	public static class RoadRegions {

		@SerializedName("RoadRegion")
		private List<RoadRegionItem> roadRegion;

		public List<RoadRegionItem> getRoadRegion() {
			return this.roadRegion;
		}

		public void setRoadRegion(List<RoadRegionItem> roadRegion) {
			this.roadRegion = roadRegion;
		}

		public static class RoadRegionItem {

			@SerializedName("Point")
			private Point point;

			public Point getPoint() {
				return this.point;
			}

			public void setPoint(Point point) {
				this.point = point;
			}

			public static class Point {

				@SerializedName("X")
				private Long x;

				@SerializedName("Y")
				private Long y;

				public Long getX() {
					return this.x;
				}

				public void setX(Long x) {
					this.x = x;
				}

				public Long getY() {
					return this.y;
				}

				public void setY(Long y) {
					this.y = y;
				}
			}
		}
	}

	public static class PreRegionIntersectFeatures {

		@SerializedName("Features")
		private List<String> features;

		public List<String> getFeatures() {
			return this.features;
		}

		public void setFeatures(List<String> features) {
			this.features = features;
		}
	}

	@Override
	public Class<DetectVehicleICongestionResponse> getResponseClass() {
		return DetectVehicleICongestionResponse.class;
	}

}
