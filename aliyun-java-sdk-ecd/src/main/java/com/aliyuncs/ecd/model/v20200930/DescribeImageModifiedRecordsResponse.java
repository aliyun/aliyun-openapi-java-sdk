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

package com.aliyuncs.ecd.model.v20200930;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecd.transform.v20200930.DescribeImageModifiedRecordsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeImageModifiedRecordsResponse extends AcsResponse {

	private String nextToken;

	private String requestId;

	private Integer totalCount;

	private List<ImageModifiedRecord> imageModifiedRecords;

	public String getNextToken() {
		return this.nextToken;
	}

	public void setNextToken(String nextToken) {
		this.nextToken = nextToken;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public List<ImageModifiedRecord> getImageModifiedRecords() {
		return this.imageModifiedRecords;
	}

	public void setImageModifiedRecords(List<ImageModifiedRecord> imageModifiedRecords) {
		this.imageModifiedRecords = imageModifiedRecords;
	}

	public static class ImageModifiedRecord {

		private Integer status;

		private String updateTime;

		private String newImageName;

		private String imageName;

		private String newImageId;

		private String imageId;

		public Integer getStatus() {
			return this.status;
		}

		public void setStatus(Integer status) {
			this.status = status;
		}

		public String getUpdateTime() {
			return this.updateTime;
		}

		public void setUpdateTime(String updateTime) {
			this.updateTime = updateTime;
		}

		public String getNewImageName() {
			return this.newImageName;
		}

		public void setNewImageName(String newImageName) {
			this.newImageName = newImageName;
		}

		public String getImageName() {
			return this.imageName;
		}

		public void setImageName(String imageName) {
			this.imageName = imageName;
		}

		public String getNewImageId() {
			return this.newImageId;
		}

		public void setNewImageId(String newImageId) {
			this.newImageId = newImageId;
		}

		public String getImageId() {
			return this.imageId;
		}

		public void setImageId(String imageId) {
			this.imageId = imageId;
		}
	}

	@Override
	public DescribeImageModifiedRecordsResponse getInstance(UnmarshallerContext context) {
		return	DescribeImageModifiedRecordsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
