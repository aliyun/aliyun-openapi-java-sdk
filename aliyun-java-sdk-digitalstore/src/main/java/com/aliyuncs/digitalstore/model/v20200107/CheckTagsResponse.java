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

package com.aliyuncs.digitalstore.model.v20200107;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.digitalstore.transform.v20200107.CheckTagsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class CheckTagsResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private List<CheckTagResultBiz> checkResult;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public List<CheckTagResultBiz> getCheckResult() {
		return this.checkResult;
	}

	public void setCheckResult(List<CheckTagResultBiz> checkResult) {
		this.checkResult = checkResult;
	}

	public static class CheckTagResultBiz {

		private String tagValue;

		private String tagId;

		private String barcode;

		private Boolean beValid;

		private Boolean beBound;

		private Boolean beOrderTag;

		private Boolean beBoxing;

		private String tagPositionType;

		private String styleId;

		private String styleCode;

		private String styleName;

		private String sKUId;

		private String sKUName;

		private String colorCode;

		private String colorName;

		private String sizeCode;

		private String sizeName;

		private String tagPositionId;

		private String brandCode;

		private String brandName;

		private String caseId;

		private String sizeId;

		private String colorId;

		private String caseCode;

		private String brandId;

		public String getTagValue() {
			return this.tagValue;
		}

		public void setTagValue(String tagValue) {
			this.tagValue = tagValue;
		}

		public String getTagId() {
			return this.tagId;
		}

		public void setTagId(String tagId) {
			this.tagId = tagId;
		}

		public String getBarcode() {
			return this.barcode;
		}

		public void setBarcode(String barcode) {
			this.barcode = barcode;
		}

		public Boolean getBeValid() {
			return this.beValid;
		}

		public void setBeValid(Boolean beValid) {
			this.beValid = beValid;
		}

		public Boolean getBeBound() {
			return this.beBound;
		}

		public void setBeBound(Boolean beBound) {
			this.beBound = beBound;
		}

		public Boolean getBeOrderTag() {
			return this.beOrderTag;
		}

		public void setBeOrderTag(Boolean beOrderTag) {
			this.beOrderTag = beOrderTag;
		}

		public Boolean getBeBoxing() {
			return this.beBoxing;
		}

		public void setBeBoxing(Boolean beBoxing) {
			this.beBoxing = beBoxing;
		}

		public String getTagPositionType() {
			return this.tagPositionType;
		}

		public void setTagPositionType(String tagPositionType) {
			this.tagPositionType = tagPositionType;
		}

		public String getStyleId() {
			return this.styleId;
		}

		public void setStyleId(String styleId) {
			this.styleId = styleId;
		}

		public String getStyleCode() {
			return this.styleCode;
		}

		public void setStyleCode(String styleCode) {
			this.styleCode = styleCode;
		}

		public String getStyleName() {
			return this.styleName;
		}

		public void setStyleName(String styleName) {
			this.styleName = styleName;
		}

		public String getSKUId() {
			return this.sKUId;
		}

		public void setSKUId(String sKUId) {
			this.sKUId = sKUId;
		}

		public String getSKUName() {
			return this.sKUName;
		}

		public void setSKUName(String sKUName) {
			this.sKUName = sKUName;
		}

		public String getColorCode() {
			return this.colorCode;
		}

		public void setColorCode(String colorCode) {
			this.colorCode = colorCode;
		}

		public String getColorName() {
			return this.colorName;
		}

		public void setColorName(String colorName) {
			this.colorName = colorName;
		}

		public String getSizeCode() {
			return this.sizeCode;
		}

		public void setSizeCode(String sizeCode) {
			this.sizeCode = sizeCode;
		}

		public String getSizeName() {
			return this.sizeName;
		}

		public void setSizeName(String sizeName) {
			this.sizeName = sizeName;
		}

		public String getTagPositionId() {
			return this.tagPositionId;
		}

		public void setTagPositionId(String tagPositionId) {
			this.tagPositionId = tagPositionId;
		}

		public String getBrandCode() {
			return this.brandCode;
		}

		public void setBrandCode(String brandCode) {
			this.brandCode = brandCode;
		}

		public String getBrandName() {
			return this.brandName;
		}

		public void setBrandName(String brandName) {
			this.brandName = brandName;
		}

		public String getCaseId() {
			return this.caseId;
		}

		public void setCaseId(String caseId) {
			this.caseId = caseId;
		}

		public String getSizeId() {
			return this.sizeId;
		}

		public void setSizeId(String sizeId) {
			this.sizeId = sizeId;
		}

		public String getColorId() {
			return this.colorId;
		}

		public void setColorId(String colorId) {
			this.colorId = colorId;
		}

		public String getCaseCode() {
			return this.caseCode;
		}

		public void setCaseCode(String caseCode) {
			this.caseCode = caseCode;
		}

		public String getBrandId() {
			return this.brandId;
		}

		public void setBrandId(String brandId) {
			this.brandId = brandId;
		}
	}

	@Override
	public CheckTagsResponse getInstance(UnmarshallerContext context) {
		return	CheckTagsResponseUnmarshaller.unmarshall(this, context);
	}
}
