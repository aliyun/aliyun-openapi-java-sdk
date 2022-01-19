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

package com.aliyuncs.dysmsapi.model.v20170525;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.dysmsapi.transform.v20170525.QueryShortUrlResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryShortUrlResponse extends AcsResponse {

	private String requestId;

	private String code;

	private String message;

	private Data data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

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

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private String sourceUrl;

		private String shortUrlName;

		private String shortUrlStatus;

		private String shortUrl;

		private String createDate;

		private String expireDate;

		private String pageViewCount;

		private String uniqueVisitorCount;

		public String getSourceUrl() {
			return this.sourceUrl;
		}

		public void setSourceUrl(String sourceUrl) {
			this.sourceUrl = sourceUrl;
		}

		public String getShortUrlName() {
			return this.shortUrlName;
		}

		public void setShortUrlName(String shortUrlName) {
			this.shortUrlName = shortUrlName;
		}

		public String getShortUrlStatus() {
			return this.shortUrlStatus;
		}

		public void setShortUrlStatus(String shortUrlStatus) {
			this.shortUrlStatus = shortUrlStatus;
		}

		public String getShortUrl() {
			return this.shortUrl;
		}

		public void setShortUrl(String shortUrl) {
			this.shortUrl = shortUrl;
		}

		public String getCreateDate() {
			return this.createDate;
		}

		public void setCreateDate(String createDate) {
			this.createDate = createDate;
		}

		public String getExpireDate() {
			return this.expireDate;
		}

		public void setExpireDate(String expireDate) {
			this.expireDate = expireDate;
		}

		public String getPageViewCount() {
			return this.pageViewCount;
		}

		public void setPageViewCount(String pageViewCount) {
			this.pageViewCount = pageViewCount;
		}

		public String getUniqueVisitorCount() {
			return this.uniqueVisitorCount;
		}

		public void setUniqueVisitorCount(String uniqueVisitorCount) {
			this.uniqueVisitorCount = uniqueVisitorCount;
		}
	}

	@Override
	public QueryShortUrlResponse getInstance(UnmarshallerContext context) {
		return	QueryShortUrlResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
