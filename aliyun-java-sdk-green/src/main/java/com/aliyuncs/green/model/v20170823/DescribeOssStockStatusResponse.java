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
import com.aliyuncs.green.transform.v20170823.DescribeOssStockStatusResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeOssStockStatusResponse extends AcsResponse {

	private String requestId;

	private Integer stockStatus;

	private String finishedTime;

	private Integer imageTotalCount;

	private Integer imagePornCount;

	private Integer imageTerrorismCount;

	private Integer videoTotalCount;

	private Integer videoPornCount;

	private Integer videoTerrorismCount;

	private List<Bucket> bucketList;

	private List<String> sceneList;

	private List<String> resouceTypeList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getStockStatus() {
		return this.stockStatus;
	}

	public void setStockStatus(Integer stockStatus) {
		this.stockStatus = stockStatus;
	}

	public String getFinishedTime() {
		return this.finishedTime;
	}

	public void setFinishedTime(String finishedTime) {
		this.finishedTime = finishedTime;
	}

	public Integer getImageTotalCount() {
		return this.imageTotalCount;
	}

	public void setImageTotalCount(Integer imageTotalCount) {
		this.imageTotalCount = imageTotalCount;
	}

	public Integer getImagePornCount() {
		return this.imagePornCount;
	}

	public void setImagePornCount(Integer imagePornCount) {
		this.imagePornCount = imagePornCount;
	}

	public Integer getImageTerrorismCount() {
		return this.imageTerrorismCount;
	}

	public void setImageTerrorismCount(Integer imageTerrorismCount) {
		this.imageTerrorismCount = imageTerrorismCount;
	}

	public Integer getVideoTotalCount() {
		return this.videoTotalCount;
	}

	public void setVideoTotalCount(Integer videoTotalCount) {
		this.videoTotalCount = videoTotalCount;
	}

	public Integer getVideoPornCount() {
		return this.videoPornCount;
	}

	public void setVideoPornCount(Integer videoPornCount) {
		this.videoPornCount = videoPornCount;
	}

	public Integer getVideoTerrorismCount() {
		return this.videoTerrorismCount;
	}

	public void setVideoTerrorismCount(Integer videoTerrorismCount) {
		this.videoTerrorismCount = videoTerrorismCount;
	}

	public List<Bucket> getBucketList() {
		return this.bucketList;
	}

	public void setBucketList(List<Bucket> bucketList) {
		this.bucketList = bucketList;
	}

	public List<String> getSceneList() {
		return this.sceneList;
	}

	public void setSceneList(List<String> sceneList) {
		this.sceneList = sceneList;
	}

	public List<String> getResouceTypeList() {
		return this.resouceTypeList;
	}

	public void setResouceTypeList(List<String> resouceTypeList) {
		this.resouceTypeList = resouceTypeList;
	}

	public static class Bucket {

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

	@Override
	public DescribeOssStockStatusResponse getInstance(UnmarshallerContext context) {
		return	DescribeOssStockStatusResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
