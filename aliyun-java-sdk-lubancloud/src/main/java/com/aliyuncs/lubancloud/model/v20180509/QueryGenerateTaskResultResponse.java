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

package com.aliyuncs.lubancloud.model.v20180509;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.lubancloud.transform.v20180509.QueryGenerateTaskResultResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryGenerateTaskResultResponse extends AcsResponse {

	private String requestId;

	private Integer totalSize;

	private Integer waitSize;

	private Integer successSize;

	private Integer failSize;

	private Integer status;

	private List<Picture> pictures;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getTotalSize() {
		return this.totalSize;
	}

	public void setTotalSize(Integer totalSize) {
		this.totalSize = totalSize;
	}

	public Integer getWaitSize() {
		return this.waitSize;
	}

	public void setWaitSize(Integer waitSize) {
		this.waitSize = waitSize;
	}

	public Integer getSuccessSize() {
		return this.successSize;
	}

	public void setSuccessSize(Integer successSize) {
		this.successSize = successSize;
	}

	public Integer getFailSize() {
		return this.failSize;
	}

	public void setFailSize(Integer failSize) {
		this.failSize = failSize;
	}

	public Integer getStatus() {
		return this.status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public List<Picture> getPictures() {
		return this.pictures;
	}

	public void setPictures(List<Picture> pictures) {
		this.pictures = pictures;
	}

	public static class Picture {

		private Long id;

		private String name;

		private String previewUrl;

		private Integer width;

		private Integer height;

		private Integer status;

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getPreviewUrl() {
			return this.previewUrl;
		}

		public void setPreviewUrl(String previewUrl) {
			this.previewUrl = previewUrl;
		}

		public Integer getWidth() {
			return this.width;
		}

		public void setWidth(Integer width) {
			this.width = width;
		}

		public Integer getHeight() {
			return this.height;
		}

		public void setHeight(Integer height) {
			this.height = height;
		}

		public Integer getStatus() {
			return this.status;
		}

		public void setStatus(Integer status) {
			this.status = status;
		}
	}

	@Override
	public QueryGenerateTaskResultResponse getInstance(UnmarshallerContext context) {
		return	QueryGenerateTaskResultResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
