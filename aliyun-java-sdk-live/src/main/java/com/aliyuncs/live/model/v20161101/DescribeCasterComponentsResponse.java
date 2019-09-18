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
import com.aliyuncs.live.transform.v20161101.DescribeCasterComponentsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeCasterComponentsResponse extends AcsResponse {

	private String requestId;

	private Integer total;

	private List<Component> components;

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

	public List<Component> getComponents() {
		return this.components;
	}

	public void setComponents(List<Component> components) {
		this.components = components;
	}

	public static class Component {

		private String componentId;

		private String componentName;

		private String locationId;

		private String componentType;

		private String effect;

		private ComponentLayer componentLayer;

		private TextLayerContent textLayerContent;

		private ImageLayerContent imageLayerContent;

		private CaptionLayerContent captionLayerContent;

		public String getComponentId() {
			return this.componentId;
		}

		public void setComponentId(String componentId) {
			this.componentId = componentId;
		}

		public String getComponentName() {
			return this.componentName;
		}

		public void setComponentName(String componentName) {
			this.componentName = componentName;
		}

		public String getLocationId() {
			return this.locationId;
		}

		public void setLocationId(String locationId) {
			this.locationId = locationId;
		}

		public String getComponentType() {
			return this.componentType;
		}

		public void setComponentType(String componentType) {
			this.componentType = componentType;
		}

		public String getEffect() {
			return this.effect;
		}

		public void setEffect(String effect) {
			this.effect = effect;
		}

		public ComponentLayer getComponentLayer() {
			return this.componentLayer;
		}

		public void setComponentLayer(ComponentLayer componentLayer) {
			this.componentLayer = componentLayer;
		}

		public TextLayerContent getTextLayerContent() {
			return this.textLayerContent;
		}

		public void setTextLayerContent(TextLayerContent textLayerContent) {
			this.textLayerContent = textLayerContent;
		}

		public ImageLayerContent getImageLayerContent() {
			return this.imageLayerContent;
		}

		public void setImageLayerContent(ImageLayerContent imageLayerContent) {
			this.imageLayerContent = imageLayerContent;
		}

		public CaptionLayerContent getCaptionLayerContent() {
			return this.captionLayerContent;
		}

		public void setCaptionLayerContent(CaptionLayerContent captionLayerContent) {
			this.captionLayerContent = captionLayerContent;
		}

		public static class ComponentLayer {

			private Float heightNormalized;

			private Float widthNormalized;

			private String positionRefer;

			private Integer transparency;

			private List<Float> positionNormalizeds;

			public Float getHeightNormalized() {
				return this.heightNormalized;
			}

			public void setHeightNormalized(Float heightNormalized) {
				this.heightNormalized = heightNormalized;
			}

			public Float getWidthNormalized() {
				return this.widthNormalized;
			}

			public void setWidthNormalized(Float widthNormalized) {
				this.widthNormalized = widthNormalized;
			}

			public String getPositionRefer() {
				return this.positionRefer;
			}

			public void setPositionRefer(String positionRefer) {
				this.positionRefer = positionRefer;
			}

			public Integer getTransparency() {
				return this.transparency;
			}

			public void setTransparency(Integer transparency) {
				this.transparency = transparency;
			}

			public List<Float> getPositionNormalizeds() {
				return this.positionNormalizeds;
			}

			public void setPositionNormalizeds(List<Float> positionNormalizeds) {
				this.positionNormalizeds = positionNormalizeds;
			}
		}

		public static class TextLayerContent {

			private String text;

			private String color;

			private String fontName;

			private Float sizeNormalized;

			private Float borderWidthNormalized;

			private String borderColor;

			public String getText() {
				return this.text;
			}

			public void setText(String text) {
				this.text = text;
			}

			public String getColor() {
				return this.color;
			}

			public void setColor(String color) {
				this.color = color;
			}

			public String getFontName() {
				return this.fontName;
			}

			public void setFontName(String fontName) {
				this.fontName = fontName;
			}

			public Float getSizeNormalized() {
				return this.sizeNormalized;
			}

			public void setSizeNormalized(Float sizeNormalized) {
				this.sizeNormalized = sizeNormalized;
			}

			public Float getBorderWidthNormalized() {
				return this.borderWidthNormalized;
			}

			public void setBorderWidthNormalized(Float borderWidthNormalized) {
				this.borderWidthNormalized = borderWidthNormalized;
			}

			public String getBorderColor() {
				return this.borderColor;
			}

			public void setBorderColor(String borderColor) {
				this.borderColor = borderColor;
			}
		}

		public static class ImageLayerContent {

			private String materialId;

			public String getMaterialId() {
				return this.materialId;
			}

			public void setMaterialId(String materialId) {
				this.materialId = materialId;
			}
		}

		public static class CaptionLayerContent {

			private String locationId;

			private Integer ptsOffset;

			private Integer wordsCount;

			private String color;

			private String fontName;

			private Float sizeNormalized;

			private Float borderWidthNormalized;

			private String borderColor;

			private Integer wordCountPerLine;

			private Float wordSpaceNormalized;

			private Float lineSpaceNormalized;

			public String getLocationId() {
				return this.locationId;
			}

			public void setLocationId(String locationId) {
				this.locationId = locationId;
			}

			public Integer getPtsOffset() {
				return this.ptsOffset;
			}

			public void setPtsOffset(Integer ptsOffset) {
				this.ptsOffset = ptsOffset;
			}

			public Integer getWordsCount() {
				return this.wordsCount;
			}

			public void setWordsCount(Integer wordsCount) {
				this.wordsCount = wordsCount;
			}

			public String getColor() {
				return this.color;
			}

			public void setColor(String color) {
				this.color = color;
			}

			public String getFontName() {
				return this.fontName;
			}

			public void setFontName(String fontName) {
				this.fontName = fontName;
			}

			public Float getSizeNormalized() {
				return this.sizeNormalized;
			}

			public void setSizeNormalized(Float sizeNormalized) {
				this.sizeNormalized = sizeNormalized;
			}

			public Float getBorderWidthNormalized() {
				return this.borderWidthNormalized;
			}

			public void setBorderWidthNormalized(Float borderWidthNormalized) {
				this.borderWidthNormalized = borderWidthNormalized;
			}

			public String getBorderColor() {
				return this.borderColor;
			}

			public void setBorderColor(String borderColor) {
				this.borderColor = borderColor;
			}

			public Integer getWordCountPerLine() {
				return this.wordCountPerLine;
			}

			public void setWordCountPerLine(Integer wordCountPerLine) {
				this.wordCountPerLine = wordCountPerLine;
			}

			public Float getWordSpaceNormalized() {
				return this.wordSpaceNormalized;
			}

			public void setWordSpaceNormalized(Float wordSpaceNormalized) {
				this.wordSpaceNormalized = wordSpaceNormalized;
			}

			public Float getLineSpaceNormalized() {
				return this.lineSpaceNormalized;
			}

			public void setLineSpaceNormalized(Float lineSpaceNormalized) {
				this.lineSpaceNormalized = lineSpaceNormalized;
			}
		}
	}

	@Override
	public DescribeCasterComponentsResponse getInstance(UnmarshallerContext context) {
		return	DescribeCasterComponentsResponseUnmarshaller.unmarshall(this, context);
	}
}
