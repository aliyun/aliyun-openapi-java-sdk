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

package com.aliyuncs.green.model.v20170823;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.green.transform.v20170823.DescribeWebsiteScanResultDetailResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeWebsiteScanResultDetailResponse extends AcsResponse {

	private String requestId;

	private String baseline;

	private String content;

	private String tamperedSource;

	private String resourceType;

	private List<ImageScanResult> imageScanResults;

	private List<String> hitKeywords;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getBaseline() {
		return this.baseline;
	}

	public void setBaseline(String baseline) {
		this.baseline = baseline;
	}

	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getTamperedSource() {
		return this.tamperedSource;
	}

	public void setTamperedSource(String tamperedSource) {
		this.tamperedSource = tamperedSource;
	}

	public String getResourceType() {
		return this.resourceType;
	}

	public void setResourceType(String resourceType) {
		this.resourceType = resourceType;
	}

	public List<ImageScanResult> getImageScanResults() {
		return this.imageScanResults;
	}

	public void setImageScanResults(List<ImageScanResult> imageScanResults) {
		this.imageScanResults = imageScanResults;
	}

	public List<String> getHitKeywords() {
		return this.hitKeywords;
	}

	public void setHitKeywords(List<String> hitKeywords) {
		this.hitKeywords = hitKeywords;
	}

	public static class ImageScanResult {

		private String url;

		private List<String> labels;

		public String getUrl() {
			return this.url;
		}

		public void setUrl(String url) {
			this.url = url;
		}

		public List<String> getLabels() {
			return this.labels;
		}

		public void setLabels(List<String> labels) {
			this.labels = labels;
		}
	}

	@Override
	public DescribeWebsiteScanResultDetailResponse getInstance(UnmarshallerContext context) {
		return	DescribeWebsiteScanResultDetailResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
