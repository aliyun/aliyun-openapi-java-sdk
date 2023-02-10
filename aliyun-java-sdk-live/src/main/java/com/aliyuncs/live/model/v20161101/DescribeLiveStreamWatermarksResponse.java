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

	private Integer total;

	private String requestId;

	private List<Watermark> watermarkList;

	public Integer getTotal() {
		return this.total;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}

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

		private Integer type;

		private Float xOffset;

		private Integer refWidth;

		private Float yOffset;

		private Integer height;

		private Integer refHeight;

		private String pictureUrl;

		private Integer transparency;

		private String description;

		private String offsetCorner;

		private Integer ruleCount;

		private String name;

		private String templateId;

		public Integer getType() {
			return this.type;
		}

		public void setType(Integer type) {
			this.type = type;
		}

		public Float getXOffset() {
			return this.xOffset;
		}

		public void setXOffset(Float xOffset) {
			this.xOffset = xOffset;
		}

		public Integer getRefWidth() {
			return this.refWidth;
		}

		public void setRefWidth(Integer refWidth) {
			this.refWidth = refWidth;
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

		public Integer getRefHeight() {
			return this.refHeight;
		}

		public void setRefHeight(Integer refHeight) {
			this.refHeight = refHeight;
		}

		public String getPictureUrl() {
			return this.pictureUrl;
		}

		public void setPictureUrl(String pictureUrl) {
			this.pictureUrl = pictureUrl;
		}

		public Integer getTransparency() {
			return this.transparency;
		}

		public void setTransparency(Integer transparency) {
			this.transparency = transparency;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getOffsetCorner() {
			return this.offsetCorner;
		}

		public void setOffsetCorner(String offsetCorner) {
			this.offsetCorner = offsetCorner;
		}

		public Integer getRuleCount() {
			return this.ruleCount;
		}

		public void setRuleCount(Integer ruleCount) {
			this.ruleCount = ruleCount;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getTemplateId() {
			return this.templateId;
		}

		public void setTemplateId(String templateId) {
			this.templateId = templateId;
		}
	}

	@Override
	public DescribeLiveStreamWatermarksResponse getInstance(UnmarshallerContext context) {
		return	DescribeLiveStreamWatermarksResponseUnmarshaller.unmarshall(this, context);
	}
}
