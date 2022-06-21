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
import com.aliyuncs.live.transform.v20161101.DescribeLiveStreamWatermarksResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeLiveStreamWatermarksResponse extends AcsResponse {

	private String requestId;

	private List<Watermark> watermarkList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<Watermark> getWatermarkList() {
		return this.watermarkList;
	}

	public void setWatermarkList(List<Watermark> watermarkList) {
		this.watermarkList = watermarkList;
	}

	public static class Watermark {

		private String templateId;

		private String name;

		private Integer type;

		private String description;

		private Integer refWidth;

		private Integer refHeight;

		private Float xOffset;

		private Float yOffset;

		private Integer height;

		private Integer transparency;

		private String offsetCorner;

		private String pictureUrl;

		public String getTemplateId() {
			return this.templateId;
		}

		public void setTemplateId(String templateId) {
			this.templateId = templateId;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Integer getType() {
			return this.type;
		}

		public void setType(Integer type) {
			this.type = type;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public Integer getRefWidth() {
			return this.refWidth;
		}

		public void setRefWidth(Integer refWidth) {
			this.refWidth = refWidth;
		}

		public Integer getRefHeight() {
			return this.refHeight;
		}

		public void setRefHeight(Integer refHeight) {
			this.refHeight = refHeight;
		}

		public Float getXOffset() {
			return this.xOffset;
		}

		public void setXOffset(Float xOffset) {
			this.xOffset = xOffset;
		}

		public Float getYOffset() {
			return this.yOffset;
		}

		public void setYOffset(Float yOffset) {
			this.yOffset = yOffset;
		}

		public Integer getHeight() {
			return this.height;
		}

		public void setHeight(Integer height) {
			this.height = height;
		}

		public Integer getTransparency() {
			return this.transparency;
		}

		public void setTransparency(Integer transparency) {
			this.transparency = transparency;
		}

		public String getOffsetCorner() {
			return this.offsetCorner;
		}

		public void setOffsetCorner(String offsetCorner) {
			this.offsetCorner = offsetCorner;
		}

		public String getPictureUrl() {
			return this.pictureUrl;
		}

		public void setPictureUrl(String pictureUrl) {
			this.pictureUrl = pictureUrl;
		}
	}

	@Override
	public DescribeLiveStreamWatermarksResponse getInstance(UnmarshallerContext context) {
		return	DescribeLiveStreamWatermarksResponseUnmarshaller.unmarshall(this, context);
	}
}
