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

package com.aliyuncs.cloudphoto.model.v20170711;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.cloudphoto.transform.v20170711.GetQuotaResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetQuotaResponse extends AcsResponse {

	private String code;

	private String message;

	private String requestId;

	private String action;

	private Quota quota;

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getAction() {
		return this.action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	public Quota getQuota() {
		return this.quota;
	}

	public void setQuota(Quota quota) {
		this.quota = quota;
	}

	public static class Quota {

		private Long totalQuota;

		private Integer facesCount;

		private Integer photosCount;

		private Long usedQuota;

		private Integer videosCount;

		public Long getTotalQuota() {
			return this.totalQuota;
		}

		public void setTotalQuota(Long totalQuota) {
			this.totalQuota = totalQuota;
		}

		public Integer getFacesCount() {
			return this.facesCount;
		}

		public void setFacesCount(Integer facesCount) {
			this.facesCount = facesCount;
		}

		public Integer getPhotosCount() {
			return this.photosCount;
		}

		public void setPhotosCount(Integer photosCount) {
			this.photosCount = photosCount;
		}

		public Long getUsedQuota() {
			return this.usedQuota;
		}

		public void setUsedQuota(Long usedQuota) {
			this.usedQuota = usedQuota;
		}

		public Integer getVideosCount() {
			return this.videosCount;
		}

		public void setVideosCount(Integer videosCount) {
			this.videosCount = videosCount;
		}
	}

	@Override
	public GetQuotaResponse getInstance(UnmarshallerContext context) {
		return	GetQuotaResponseUnmarshaller.unmarshall(this, context);
	}
}
