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

package com.aliyuncs.rtc.model.v20180111;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.rtc.transform.v20180111.DescribeRecordTemplatesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeRecordTemplatesResponse extends AcsResponse {

	private String requestId;

	private Long totalNum;

	private Long totalPage;

	private List<Template> templates;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Long getTotalNum() {
		return this.totalNum;
	}

	public void setTotalNum(Long totalNum) {
		this.totalNum = totalNum;
	}

	public Long getTotalPage() {
		return this.totalPage;
	}

	public void setTotalPage(Long totalPage) {
		this.totalPage = totalPage;
	}

	public List<Template> getTemplates() {
		return this.templates;
	}

	public void setTemplates(List<Template> templates) {
		this.templates = templates;
	}

	public static class Template {

		private String createTime;

		private String templateId;

		private String name;

		private Integer mediaEncode;

		private Integer backgroundColor;

		private Integer fileSplitInterval;

		private String taskProfile;

		private String ossBucket;

		private String ossFilePrefix;

		private String mnsQueue;

		private String httpCallbackUrl;

		private String delayStopTime;

		private List<Background> backgrounds;

		private List<Watermark> watermarks;

		private List<Watermark1> clockWidgets;

		private List<Integer> layoutIds;

		private List<String> formats;

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

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

		public Integer getMediaEncode() {
			return this.mediaEncode;
		}

		public void setMediaEncode(Integer mediaEncode) {
			this.mediaEncode = mediaEncode;
		}

		public Integer getBackgroundColor() {
			return this.backgroundColor;
		}

		public void setBackgroundColor(Integer backgroundColor) {
			this.backgroundColor = backgroundColor;
		}

		public Integer getFileSplitInterval() {
			return this.fileSplitInterval;
		}

		public void setFileSplitInterval(Integer fileSplitInterval) {
			this.fileSplitInterval = fileSplitInterval;
		}

		public String getTaskProfile() {
			return this.taskProfile;
		}

		public void setTaskProfile(String taskProfile) {
			this.taskProfile = taskProfile;
		}

		public String getOssBucket() {
			return this.ossBucket;
		}

		public void setOssBucket(String ossBucket) {
			this.ossBucket = ossBucket;
		}

		public String getOssFilePrefix() {
			return this.ossFilePrefix;
		}

		public void setOssFilePrefix(String ossFilePrefix) {
			this.ossFilePrefix = ossFilePrefix;
		}

		public String getMnsQueue() {
			return this.mnsQueue;
		}

		public void setMnsQueue(String mnsQueue) {
			this.mnsQueue = mnsQueue;
		}

		public String getHttpCallbackUrl() {
			return this.httpCallbackUrl;
		}

		public void setHttpCallbackUrl(String httpCallbackUrl) {
			this.httpCallbackUrl = httpCallbackUrl;
		}

		public String getDelayStopTime() {
			return this.delayStopTime;
		}

		public void setDelayStopTime(String delayStopTime) {
			this.delayStopTime = delayStopTime;
		}

		public List<Background> getBackgrounds() {
			return this.backgrounds;
		}

		public void setBackgrounds(List<Background> backgrounds) {
			this.backgrounds = backgrounds;
		}

		public List<Watermark> getWatermarks() {
			return this.watermarks;
		}

		public void setWatermarks(List<Watermark> watermarks) {
			this.watermarks = watermarks;
		}

		public List<Watermark1> getClockWidgets() {
			return this.clockWidgets;
		}

		public void setClockWidgets(List<Watermark1> clockWidgets) {
			this.clockWidgets = clockWidgets;
		}

		public List<Integer> getLayoutIds() {
			return this.layoutIds;
		}

		public void setLayoutIds(List<Integer> layoutIds) {
			this.layoutIds = layoutIds;
		}

		public List<String> getFormats() {
			return this.formats;
		}

		public void setFormats(List<String> formats) {
			this.formats = formats;
		}

		public static class Background {

			private String url;

			private Integer display;

			private Float x;

			private Float y;

			private Float width;

			private Float height;

			private Integer zOrder;

			public String getUrl() {
				return this.url;
			}

			public void setUrl(String url) {
				this.url = url;
			}

			public Integer getDisplay() {
				return this.display;
			}

			public void setDisplay(Integer display) {
				this.display = display;
			}

			public Float getX() {
				return this.x;
			}

			public void setX(Float x) {
				this.x = x;
			}

			public Float getY() {
				return this.y;
			}

			public void setY(Float y) {
				this.y = y;
			}

			public Float getWidth() {
				return this.width;
			}

			public void setWidth(Float width) {
				this.width = width;
			}

			public Float getHeight() {
				return this.height;
			}

			public void setHeight(Float height) {
				this.height = height;
			}

			public Integer getZOrder() {
				return this.zOrder;
			}

			public void setZOrder(Integer zOrder) {
				this.zOrder = zOrder;
			}
		}

		public static class Watermark {

			private String url;

			private Float alpha;

			private Integer display;

			private Float x;

			private Float y;

			private Float width;

			private Float height;

			private Integer zOrder;

			public String getUrl() {
				return this.url;
			}

			public void setUrl(String url) {
				this.url = url;
			}

			public Float getAlpha() {
				return this.alpha;
			}

			public void setAlpha(Float alpha) {
				this.alpha = alpha;
			}

			public Integer getDisplay() {
				return this.display;
			}

			public void setDisplay(Integer display) {
				this.display = display;
			}

			public Float getX() {
				return this.x;
			}

			public void setX(Float x) {
				this.x = x;
			}

			public Float getY() {
				return this.y;
			}

			public void setY(Float y) {
				this.y = y;
			}

			public Float getWidth() {
				return this.width;
			}

			public void setWidth(Float width) {
				this.width = width;
			}

			public Float getHeight() {
				return this.height;
			}

			public void setHeight(Float height) {
				this.height = height;
			}

			public Integer getZOrder() {
				return this.zOrder;
			}

			public void setZOrder(Integer zOrder) {
				this.zOrder = zOrder;
			}
		}

		public static class Watermark1 {

			private Float x;

			private Float y;

			private Integer fontType;

			private Integer fontSize;

			private Integer fontColor;

			private Integer zOrder;

			public Float getX() {
				return this.x;
			}

			public void setX(Float x) {
				this.x = x;
			}

			public Float getY() {
				return this.y;
			}

			public void setY(Float y) {
				this.y = y;
			}

			public Integer getFontType() {
				return this.fontType;
			}

			public void setFontType(Integer fontType) {
				this.fontType = fontType;
			}

			public Integer getFontSize() {
				return this.fontSize;
			}

			public void setFontSize(Integer fontSize) {
				this.fontSize = fontSize;
			}

			public Integer getFontColor() {
				return this.fontColor;
			}

			public void setFontColor(Integer fontColor) {
				this.fontColor = fontColor;
			}

			public Integer getZOrder() {
				return this.zOrder;
			}

			public void setZOrder(Integer zOrder) {
				this.zOrder = zOrder;
			}
		}
	}

	@Override
	public DescribeRecordTemplatesResponse getInstance(UnmarshallerContext context) {
		return	DescribeRecordTemplatesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
