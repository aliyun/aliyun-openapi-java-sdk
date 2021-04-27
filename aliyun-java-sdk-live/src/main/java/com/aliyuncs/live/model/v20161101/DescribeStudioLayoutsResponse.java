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

package com.aliyuncs.live.model.v20161101;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.live.transform.v20161101.DescribeStudioLayoutsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeStudioLayoutsResponse extends AcsResponse {

	private String requestId;

	private Integer total;

	private List<StudioLayout> studioLayouts;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getTotal() {
		return this.total;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}

	public List<StudioLayout> getStudioLayouts() {
		return this.studioLayouts;
	}

	public void setStudioLayouts(List<StudioLayout> studioLayouts) {
		this.studioLayouts = studioLayouts;
	}

	public static class StudioLayout {

		private String layoutId;

		private String layoutName;

		private String layoutType;

		private List<ScreenInputConfig> screenInputConfigList;

		private List<MediaInputConfig> mediaInputConfigList;

		private List<LayerOrderConfig> layerOrderConfigList;

		private CommonConfig commonConfig;

		private BgImageConfig bgImageConfig;

		public String getLayoutId() {
			return this.layoutId;
		}

		public void setLayoutId(String layoutId) {
			this.layoutId = layoutId;
		}

		public String getLayoutName() {
			return this.layoutName;
		}

		public void setLayoutName(String layoutName) {
			this.layoutName = layoutName;
		}

		public String getLayoutType() {
			return this.layoutType;
		}

		public void setLayoutType(String layoutType) {
			this.layoutType = layoutType;
		}

		public List<ScreenInputConfig> getScreenInputConfigList() {
			return this.screenInputConfigList;
		}

		public void setScreenInputConfigList(List<ScreenInputConfig> screenInputConfigList) {
			this.screenInputConfigList = screenInputConfigList;
		}

		public List<MediaInputConfig> getMediaInputConfigList() {
			return this.mediaInputConfigList;
		}

		public void setMediaInputConfigList(List<MediaInputConfig> mediaInputConfigList) {
			this.mediaInputConfigList = mediaInputConfigList;
		}

		public List<LayerOrderConfig> getLayerOrderConfigList() {
			return this.layerOrderConfigList;
		}

		public void setLayerOrderConfigList(List<LayerOrderConfig> layerOrderConfigList) {
			this.layerOrderConfigList = layerOrderConfigList;
		}

		public CommonConfig getCommonConfig() {
			return this.commonConfig;
		}

		public void setCommonConfig(CommonConfig commonConfig) {
			this.commonConfig = commonConfig;
		}

		public BgImageConfig getBgImageConfig() {
			return this.bgImageConfig;
		}

		public void setBgImageConfig(BgImageConfig bgImageConfig) {
			this.bgImageConfig = bgImageConfig;
		}

		public static class ScreenInputConfig {

			private String id;

			private Integer index;

			private String channelId;

			private String videoResourceId;

			private String color;

			private String positionX;

			private String positionY;

			private Float heightNormalized;

			private Integer portraitType;

			public String getId() {
				return this.id;
			}

			public void setId(String id) {
				this.id = id;
			}

			public Integer getIndex() {
				return this.index;
			}

			public void setIndex(Integer index) {
				this.index = index;
			}

			public String getChannelId() {
				return this.channelId;
			}

			public void setChannelId(String channelId) {
				this.channelId = channelId;
			}

			public String getVideoResourceId() {
				return this.videoResourceId;
			}

			public void setVideoResourceId(String videoResourceId) {
				this.videoResourceId = videoResourceId;
			}

			public String getColor() {
				return this.color;
			}

			public void setColor(String color) {
				this.color = color;
			}

			public String getPositionX() {
				return this.positionX;
			}

			public void setPositionX(String positionX) {
				this.positionX = positionX;
			}

			public String getPositionY() {
				return this.positionY;
			}

			public void setPositionY(String positionY) {
				this.positionY = positionY;
			}

			public Float getHeightNormalized() {
				return this.heightNormalized;
			}

			public void setHeightNormalized(Float heightNormalized) {
				this.heightNormalized = heightNormalized;
			}

			public Integer getPortraitType() {
				return this.portraitType;
			}

			public void setPortraitType(Integer portraitType) {
				this.portraitType = portraitType;
			}
		}

		public static class MediaInputConfig {

			private String id;

			private Integer index;

			private String channelId;

			private String videoResourceId;

			private String imageMaterialId;

			private String fillMode;

			private String positionRefer;

			private Float widthNormalized;

			private Float heightNormalized;

			private List<Float> positionNormalized;

			public String getId() {
				return this.id;
			}

			public void setId(String id) {
				this.id = id;
			}

			public Integer getIndex() {
				return this.index;
			}

			public void setIndex(Integer index) {
				this.index = index;
			}

			public String getChannelId() {
				return this.channelId;
			}

			public void setChannelId(String channelId) {
				this.channelId = channelId;
			}

			public String getVideoResourceId() {
				return this.videoResourceId;
			}

			public void setVideoResourceId(String videoResourceId) {
				this.videoResourceId = videoResourceId;
			}

			public String getImageMaterialId() {
				return this.imageMaterialId;
			}

			public void setImageMaterialId(String imageMaterialId) {
				this.imageMaterialId = imageMaterialId;
			}

			public String getFillMode() {
				return this.fillMode;
			}

			public void setFillMode(String fillMode) {
				this.fillMode = fillMode;
			}

			public String getPositionRefer() {
				return this.positionRefer;
			}

			public void setPositionRefer(String positionRefer) {
				this.positionRefer = positionRefer;
			}

			public Float getWidthNormalized() {
				return this.widthNormalized;
			}

			public void setWidthNormalized(Float widthNormalized) {
				this.widthNormalized = widthNormalized;
			}

			public Float getHeightNormalized() {
				return this.heightNormalized;
			}

			public void setHeightNormalized(Float heightNormalized) {
				this.heightNormalized = heightNormalized;
			}

			public List<Float> getPositionNormalized() {
				return this.positionNormalized;
			}

			public void setPositionNormalized(List<Float> positionNormalized) {
				this.positionNormalized = positionNormalized;
			}
		}

		public static class LayerOrderConfig {

			private String id;

			private String type;

			public String getId() {
				return this.id;
			}

			public void setId(String id) {
				this.id = id;
			}

			public String getType() {
				return this.type;
			}

			public void setType(String type) {
				this.type = type;
			}
		}

		public static class CommonConfig {

			private String videoResourceId;

			private String channelId;

			public String getVideoResourceId() {
				return this.videoResourceId;
			}

			public void setVideoResourceId(String videoResourceId) {
				this.videoResourceId = videoResourceId;
			}

			public String getChannelId() {
				return this.channelId;
			}

			public void setChannelId(String channelId) {
				this.channelId = channelId;
			}
		}

		public static class BgImageConfig {

			private String id;

			private String materialId;

			private String imageUrl;

			public String getId() {
				return this.id;
			}

			public void setId(String id) {
				this.id = id;
			}

			public String getMaterialId() {
				return this.materialId;
			}

			public void setMaterialId(String materialId) {
				this.materialId = materialId;
			}

			public String getImageUrl() {
				return this.imageUrl;
			}

			public void setImageUrl(String imageUrl) {
				this.imageUrl = imageUrl;
			}
		}
	}

	@Override
	public DescribeStudioLayoutsResponse getInstance(UnmarshallerContext context) {
		return	DescribeStudioLayoutsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
