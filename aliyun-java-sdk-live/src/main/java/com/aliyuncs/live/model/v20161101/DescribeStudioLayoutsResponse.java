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

		private List<LayerOrderConfig> layerOrderConfigList;

		private List<MediaInputConfig> mediaInputConfigList;

		private List<ScreenInputConfig> screenInputConfigList;

		private BgImageConfig bgImageConfig;

		private CommonConfig commonConfig;

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

		public List<LayerOrderConfig> getLayerOrderConfigList() {
			return this.layerOrderConfigList;
		}

		public void setLayerOrderConfigList(List<LayerOrderConfig> layerOrderConfigList) {
			this.layerOrderConfigList = layerOrderConfigList;
		}

		public List<MediaInputConfig> getMediaInputConfigList() {
			return this.mediaInputConfigList;
		}

		public void setMediaInputConfigList(List<MediaInputConfig> mediaInputConfigList) {
			this.mediaInputConfigList = mediaInputConfigList;
		}

		public List<ScreenInputConfig> getScreenInputConfigList() {
			return this.screenInputConfigList;
		}

		public void setScreenInputConfigList(List<ScreenInputConfig> screenInputConfigList) {
			this.screenInputConfigList = screenInputConfigList;
		}

		public BgImageConfig getBgImageConfig() {
			return this.bgImageConfig;
		}

		public void setBgImageConfig(BgImageConfig bgImageConfig) {
			this.bgImageConfig = bgImageConfig;
		}

		public CommonConfig getCommonConfig() {
			return this.commonConfig;
		}

		public void setCommonConfig(CommonConfig commonConfig) {
			this.commonConfig = commonConfig;
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

		public static class MediaInputConfig {

			private String channelId;

			private String fillMode;

			private Float heightNormalized;

			private String id;

			private String imageMaterialId;

			private Integer index;

			private String positionRefer;

			private String videoResourceId;

			private Float widthNormalized;

			private List<Float> positionNormalized;

			public String getChannelId() {
				return this.channelId;
			}

			public void setChannelId(String channelId) {
				this.channelId = channelId;
			}

			public String getFillMode() {
				return this.fillMode;
			}

			public void setFillMode(String fillMode) {
				this.fillMode = fillMode;
			}

			public Float getHeightNormalized() {
				return this.heightNormalized;
			}

			public void setHeightNormalized(Float heightNormalized) {
				this.heightNormalized = heightNormalized;
			}

			public String getId() {
				return this.id;
			}

			public void setId(String id) {
				this.id = id;
			}

			public String getImageMaterialId() {
				return this.imageMaterialId;
			}

			public void setImageMaterialId(String imageMaterialId) {
				this.imageMaterialId = imageMaterialId;
			}

			public Integer getIndex() {
				return this.index;
			}

			public void setIndex(Integer index) {
				this.index = index;
			}

			public String getPositionRefer() {
				return this.positionRefer;
			}

			public void setPositionRefer(String positionRefer) {
				this.positionRefer = positionRefer;
			}

			public String getVideoResourceId() {
				return this.videoResourceId;
			}

			public void setVideoResourceId(String videoResourceId) {
				this.videoResourceId = videoResourceId;
			}

			public Float getWidthNormalized() {
				return this.widthNormalized;
			}

			public void setWidthNormalized(Float widthNormalized) {
				this.widthNormalized = widthNormalized;
			}

			public List<Float> getPositionNormalized() {
				return this.positionNormalized;
			}

			public void setPositionNormalized(List<Float> positionNormalized) {
				this.positionNormalized = positionNormalized;
			}
		}

		public static class ScreenInputConfig {

			private String channelId;

			private String color;

			private Float heightNormalized;

			private String id;

			private Integer index;

			private Boolean onlyAudio;

			private Integer portraitType;

			private String positionX;

			private String positionY;

			private String videoResourceId;

			private AudioConfig audioConfig;

			public String getChannelId() {
				return this.channelId;
			}

			public void setChannelId(String channelId) {
				this.channelId = channelId;
			}

			public String getColor() {
				return this.color;
			}

			public void setColor(String color) {
				this.color = color;
			}

			public Float getHeightNormalized() {
				return this.heightNormalized;
			}

			public void setHeightNormalized(Float heightNormalized) {
				this.heightNormalized = heightNormalized;
			}

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

			public Boolean getOnlyAudio() {
				return this.onlyAudio;
			}

			public void setOnlyAudio(Boolean onlyAudio) {
				this.onlyAudio = onlyAudio;
			}

			public Integer getPortraitType() {
				return this.portraitType;
			}

			public void setPortraitType(Integer portraitType) {
				this.portraitType = portraitType;
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

			public String getVideoResourceId() {
				return this.videoResourceId;
			}

			public void setVideoResourceId(String videoResourceId) {
				this.videoResourceId = videoResourceId;
			}

			public AudioConfig getAudioConfig() {
				return this.audioConfig;
			}

			public void setAudioConfig(AudioConfig audioConfig) {
				this.audioConfig = audioConfig;
			}

			public static class AudioConfig {

				private String validChannel;

				private Float volumeRate;

				public String getValidChannel() {
					return this.validChannel;
				}

				public void setValidChannel(String validChannel) {
					this.validChannel = validChannel;
				}

				public Float getVolumeRate() {
					return this.volumeRate;
				}

				public void setVolumeRate(Float volumeRate) {
					this.volumeRate = volumeRate;
				}
			}
		}

		public static class BgImageConfig {

			private String id;

			private String imageUrl;

			private String locationId;

			private String materialId;

			public String getId() {
				return this.id;
			}

			public void setId(String id) {
				this.id = id;
			}

			public String getImageUrl() {
				return this.imageUrl;
			}

			public void setImageUrl(String imageUrl) {
				this.imageUrl = imageUrl;
			}

			public String getLocationId() {
				return this.locationId;
			}

			public void setLocationId(String locationId) {
				this.locationId = locationId;
			}

			public String getMaterialId() {
				return this.materialId;
			}

			public void setMaterialId(String materialId) {
				this.materialId = materialId;
			}
		}

		public static class CommonConfig {

			private String channelId;

			private String videoResourceId;

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
