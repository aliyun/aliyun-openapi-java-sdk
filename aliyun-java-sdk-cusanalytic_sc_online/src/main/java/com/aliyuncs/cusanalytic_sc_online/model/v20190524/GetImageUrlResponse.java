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

package com.aliyuncs.cusanalytic_sc_online.model.v20190524;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.cusanalytic_sc_online.transform.v20190524.GetImageUrlResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetImageUrlResponse extends AcsResponse {

	private String errorMsg;

	private Boolean success;

	private List<ImageUrl> urls;

	public String getErrorMsg() {
		return this.errorMsg;
	}

	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public List<ImageUrl> getUrls() {
		return this.urls;
	}

	public void setUrls(List<ImageUrl> urls) {
		this.urls = urls;
	}

	public static class ImageUrl {

		private String objectKey;

		private String url;

		public String getObjectKey() {
			return this.objectKey;
		}

		public void setObjectKey(String objectKey) {
			this.objectKey = objectKey;
		}

		public String getBizUrl() {
			return this.url;
		}

		public void setBizUrl(String url) {
			this.url = url;
		}

		/**
		 * @deprecated use getBizUrl instead of this.
		 */
		@Deprecated
		public String getUrl() {
			return this.url;
		}

		/**
		 * @deprecated use setBizUrl instead of this.
		 */
		@Deprecated
		public void setUrl(String url) {
			this.url = url;
		}
	}

	@Override
	public GetImageUrlResponse getInstance(UnmarshallerContext context) {
		return	GetImageUrlResponseUnmarshaller.unmarshall(this, context);
	}
}
