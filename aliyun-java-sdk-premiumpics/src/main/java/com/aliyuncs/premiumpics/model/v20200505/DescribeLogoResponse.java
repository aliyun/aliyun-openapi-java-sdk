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

package com.aliyuncs.premiumpics.model.v20200505;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.premiumpics.transform.v20200505.DescribeLogoResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeLogoResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String colorOne;

	private String colorTwo;

	private String colorThree;

	private String colorDescription;

	private String namePath;

	private String fontDescription;

	private String brandName;

	private List<String> images;

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

	public String getColorOne() {
		return this.colorOne;
	}

	public void setColorOne(String colorOne) {
		this.colorOne = colorOne;
	}

	public String getColorTwo() {
		return this.colorTwo;
	}

	public void setColorTwo(String colorTwo) {
		this.colorTwo = colorTwo;
	}

	public String getColorThree() {
		return this.colorThree;
	}

	public void setColorThree(String colorThree) {
		this.colorThree = colorThree;
	}

	public String getColorDescription() {
		return this.colorDescription;
	}

	public void setColorDescription(String colorDescription) {
		this.colorDescription = colorDescription;
	}

	public String getNamePath() {
		return this.namePath;
	}

	public void setNamePath(String namePath) {
		this.namePath = namePath;
	}

	public String getFontDescription() {
		return this.fontDescription;
	}

	public void setFontDescription(String fontDescription) {
		this.fontDescription = fontDescription;
	}

	public String getBrandName() {
		return this.brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public List<String> getImages() {
		return this.images;
	}

	public void setImages(List<String> images) {
		this.images = images;
	}

	@Override
	public DescribeLogoResponse getInstance(UnmarshallerContext context) {
		return	DescribeLogoResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
