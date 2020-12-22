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

package com.aliyuncs.facebody.model.v20191230;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.facebody.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DetectPedestrianIntrusionRequest extends RpcAcsRequest<DetectPedestrianIntrusionResponse> {
	   

	private String regionType;

	private String imageURL;

	@SerializedName("region")
	private List<Region> region;
	public DetectPedestrianIntrusionRequest() {
		super("facebody", "2019-12-30", "DetectPedestrianIntrusion");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getRegionType() {
		return this.regionType;
	}

	public void setRegionType(String regionType) {
		this.regionType = regionType;
		if(regionType != null){
			putBodyParameter("RegionType", regionType);
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

	public List<Region> getRegion() {
		return this.region;
	}

	public void setRegion(List<Region> region) {
		this.region = region;	
		if (region != null) {
			putBodyParameter("Region" , new Gson().toJson(region));
		}	
	}

	public static class Region {

		@SerializedName("Rect")
		private Rect rect;

		@SerializedName("Line")
		private Line line;

		public Rect getRect() {
			return this.rect;
		}

		public void setRect(Rect rect) {
			this.rect = rect;
		}

		public Line getLine() {
			return this.line;
		}

		public void setLine(Line line) {
			this.line = line;
		}

		public static class Rect {

			@SerializedName("Top")
			private Long top;

			@SerializedName("Left")
			private Long left;

			@SerializedName("Bottom")
			private Long bottom;

			@SerializedName("Right")
			private Long right;

			public Long getTop() {
				return this.top;
			}

			public void setTop(Long top) {
				this.top = top;
			}

			public Long getLeft() {
				return this.left;
			}

			public void setLeft(Long left) {
				this.left = left;
			}

			public Long getBottom() {
				return this.bottom;
			}

			public void setBottom(Long bottom) {
				this.bottom = bottom;
			}

			public Long getRight() {
				return this.right;
			}

			public void setRight(Long right) {
				this.right = right;
			}
		}

		public static class Line {

			@SerializedName("Y1")
			private Long y1;

			@SerializedName("X1")
			private Long x1;

			@SerializedName("Y2")
			private Long y2;

			@SerializedName("X2")
			private Long x2;

			public Long getY1() {
				return this.y1;
			}

			public void setY1(Long y1) {
				this.y1 = y1;
			}

			public Long getX1() {
				return this.x1;
			}

			public void setX1(Long x1) {
				this.x1 = x1;
			}

			public Long getY2() {
				return this.y2;
			}

			public void setY2(Long y2) {
				this.y2 = y2;
			}

			public Long getX2() {
				return this.x2;
			}

			public void setX2(Long x2) {
				this.x2 = x2;
			}
		}
	}

	@Override
	public Class<DetectPedestrianIntrusionResponse> getResponseClass() {
		return DetectPedestrianIntrusionResponse.class;
	}

}
