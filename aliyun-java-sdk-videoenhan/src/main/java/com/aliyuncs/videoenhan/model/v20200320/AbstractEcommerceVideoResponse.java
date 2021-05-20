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

package com.aliyuncs.videoenhan.model.v20200320;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.videoenhan.transform.v20200320.AbstractEcommerceVideoResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class AbstractEcommerceVideoResponse extends AcsResponse {

	private String requestId;

	private Data data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private String videoUrl;

		private String videoCoverUrl;

		public String getVideoUrl() {
			return this.videoUrl;
		}

		public void setVideoUrl(String videoUrl) {
			this.videoUrl = videoUrl;
		}

		public String getVideoCoverUrl() {
			return this.videoCoverUrl;
		}

		public void setVideoCoverUrl(String videoCoverUrl) {
			this.videoCoverUrl = videoCoverUrl;
		}
	}

	@Override
	public AbstractEcommerceVideoResponse getInstance(UnmarshallerContext context) {
		return	AbstractEcommerceVideoResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
