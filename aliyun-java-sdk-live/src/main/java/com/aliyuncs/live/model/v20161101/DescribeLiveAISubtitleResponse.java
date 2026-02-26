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
import com.aliyuncs.live.transform.v20161101.DescribeLiveAISubtitleResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeLiveAISubtitleResponse extends AcsResponse {

	private String requestId;

	private List<SubtitleConfig> subtitleConfigs;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<SubtitleConfig> getSubtitleConfigs() {
		return this.subtitleConfigs;
	}

	public void setSubtitleConfigs(List<SubtitleConfig> subtitleConfigs) {
		this.subtitleConfigs = subtitleConfigs;
	}

	public static class SubtitleConfig {

		private String dstLanguage;

		private String srcLanguage;

		private String fontColor;

		private String fontName;

		private Integer showSourceLan;

		private Integer maxLines;

		private Integer wordPerline;

		private String bgColor;

		private Float bgWidthNormalized;

		private Float borderWidthNormalized;

		private String width;

		private String height;

		private String subtitleName;

		private String subtitleId;

		private String fontSizeNormalized;

		private String description;

		private List<Float> positionNormalized;

		private List<String> rulesRefer;

		public String getDstLanguage() {
			return this.dstLanguage;
		}

		public void setDstLanguage(String dstLanguage) {
			this.dstLanguage = dstLanguage;
		}

		public String getSrcLanguage() {
			return this.srcLanguage;
		}

		public void setSrcLanguage(String srcLanguage) {
			this.srcLanguage = srcLanguage;
		}

		public String getFontColor() {
			return this.fontColor;
		}

		public void setFontColor(String fontColor) {
			this.fontColor = fontColor;
		}

		public String getFontName() {
			return this.fontName;
		}

		public void setFontName(String fontName) {
			this.fontName = fontName;
		}

		public Integer getShowSourceLan() {
			return this.showSourceLan;
		}

		public void setShowSourceLan(Integer showSourceLan) {
			this.showSourceLan = showSourceLan;
		}

		public Integer getMaxLines() {
			return this.maxLines;
		}

		public void setMaxLines(Integer maxLines) {
			this.maxLines = maxLines;
		}

		public Integer getWordPerline() {
			return this.wordPerline;
		}

		public void setWordPerline(Integer wordPerline) {
			this.wordPerline = wordPerline;
		}

		public String getBgColor() {
			return this.bgColor;
		}

		public void setBgColor(String bgColor) {
			this.bgColor = bgColor;
		}

		public Float getBgWidthNormalized() {
			return this.bgWidthNormalized;
		}

		public void setBgWidthNormalized(Float bgWidthNormalized) {
			this.bgWidthNormalized = bgWidthNormalized;
		}

		public Float getBorderWidthNormalized() {
			return this.borderWidthNormalized;
		}

		public void setBorderWidthNormalized(Float borderWidthNormalized) {
			this.borderWidthNormalized = borderWidthNormalized;
		}

		public String getWidth() {
			return this.width;
		}

		public void setWidth(String width) {
			this.width = width;
		}

		public String getHeight() {
			return this.height;
		}

		public void setHeight(String height) {
			this.height = height;
		}

		public String getSubtitleName() {
			return this.subtitleName;
		}

		public void setSubtitleName(String subtitleName) {
			this.subtitleName = subtitleName;
		}

		public String getSubtitleId() {
			return this.subtitleId;
		}

		public void setSubtitleId(String subtitleId) {
			this.subtitleId = subtitleId;
		}

		public String getFontSizeNormalized() {
			return this.fontSizeNormalized;
		}

		public void setFontSizeNormalized(String fontSizeNormalized) {
			this.fontSizeNormalized = fontSizeNormalized;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public List<Float> getPositionNormalized() {
			return this.positionNormalized;
		}

		public void setPositionNormalized(List<Float> positionNormalized) {
			this.positionNormalized = positionNormalized;
		}

		public List<String> getRulesRefer() {
			return this.rulesRefer;
		}

		public void setRulesRefer(List<String> rulesRefer) {
			this.rulesRefer = rulesRefer;
		}
	}

	@Override
	public DescribeLiveAISubtitleResponse getInstance(UnmarshallerContext context) {
		return	DescribeLiveAISubtitleResponseUnmarshaller.unmarshall(this, context);
	}
}
