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
import com.aliyuncs.green.transform.v20170823.DescribeOssIncrementCheckSettingResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeOssIncrementCheckSettingResponse extends AcsResponse {

	private String requestId;

	private Boolean imageEnableLimit;

	private Long imageScanLimit;

	private Integer videoFrameInterval;

	private Integer videoMaxFrames;

	private Integer videoMaxSize;

	private String autoFreezeType;

	private List<BucketConfig> bucketConfigList;

	private List<String> imageSceneList;

	private List<String> videoSceneList;

	private List<String> videoAutoFreezeSceneList;

	private ImageAutoFreeze imageAutoFreeze;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Boolean getImageEnableLimit() {
		return this.imageEnableLimit;
	}

	public void setImageEnableLimit(Boolean imageEnableLimit) {
		this.imageEnableLimit = imageEnableLimit;
	}

	public Long getImageScanLimit() {
		return this.imageScanLimit;
	}

	public void setImageScanLimit(Long imageScanLimit) {
		this.imageScanLimit = imageScanLimit;
	}

	public Integer getVideoFrameInterval() {
		return this.videoFrameInterval;
	}

	public void setVideoFrameInterval(Integer videoFrameInterval) {
		this.videoFrameInterval = videoFrameInterval;
	}

	public Integer getVideoMaxFrames() {
		return this.videoMaxFrames;
	}

	public void setVideoMaxFrames(Integer videoMaxFrames) {
		this.videoMaxFrames = videoMaxFrames;
	}

	public Integer getVideoMaxSize() {
		return this.videoMaxSize;
	}

	public void setVideoMaxSize(Integer videoMaxSize) {
		this.videoMaxSize = videoMaxSize;
	}

	public String getAutoFreezeType() {
		return this.autoFreezeType;
	}

	public void setAutoFreezeType(String autoFreezeType) {
		this.autoFreezeType = autoFreezeType;
	}

	public List<BucketConfig> getBucketConfigList() {
		return this.bucketConfigList;
	}

	public void setBucketConfigList(List<BucketConfig> bucketConfigList) {
		this.bucketConfigList = bucketConfigList;
	}

	public List<String> getImageSceneList() {
		return this.imageSceneList;
	}

	public void setImageSceneList(List<String> imageSceneList) {
		this.imageSceneList = imageSceneList;
	}

	public List<String> getVideoSceneList() {
		return this.videoSceneList;
	}

	public void setVideoSceneList(List<String> videoSceneList) {
		this.videoSceneList = videoSceneList;
	}

	public List<String> getVideoAutoFreezeSceneList() {
		return this.videoAutoFreezeSceneList;
	}

	public void setVideoAutoFreezeSceneList(List<String> videoAutoFreezeSceneList) {
		this.videoAutoFreezeSceneList = videoAutoFreezeSceneList;
	}

	public ImageAutoFreeze getImageAutoFreeze() {
		return this.imageAutoFreeze;
	}

	public void setImageAutoFreeze(ImageAutoFreeze imageAutoFreeze) {
		this.imageAutoFreeze = imageAutoFreeze;
	}

	public static class BucketConfig {

		private Boolean selected;

		private String bucket;

		private List<String> prefixes;

		public Boolean getSelected() {
			return this.selected;
		}

		public void setSelected(Boolean selected) {
			this.selected = selected;
		}

		public String getBucket() {
			return this.bucket;
		}

		public void setBucket(String bucket) {
			this.bucket = bucket;
		}

		public List<String> getPrefixes() {
			return this.prefixes;
		}

		public void setPrefixes(List<String> prefixes) {
			this.prefixes = prefixes;
		}
	}

	public static class ImageAutoFreeze {

		private Boolean enabled;

		private String porn;

		private String terrorism;

		public Boolean getEnabled() {
			return this.enabled;
		}

		public void setEnabled(Boolean enabled) {
			this.enabled = enabled;
		}

		public String getPorn() {
			return this.porn;
		}

		public void setPorn(String porn) {
			this.porn = porn;
		}

		public String getTerrorism() {
			return this.terrorism;
		}

		public void setTerrorism(String terrorism) {
			this.terrorism = terrorism;
		}
	}

	@Override
	public DescribeOssIncrementCheckSettingResponse getInstance(UnmarshallerContext context) {
		return	DescribeOssIncrementCheckSettingResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
