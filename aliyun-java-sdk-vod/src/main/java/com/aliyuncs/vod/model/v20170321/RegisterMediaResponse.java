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

package com.aliyuncs.vod.model.v20170321;

import java.util.List;
import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.vod.transform.v20170321.RegisterMediaResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class RegisterMediaResponse extends AcsResponse {

	private String requestId;

	private List<RegisteredMedia> registeredMediaList;

	private List<String> failedFileURLs;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<RegisteredMedia> getRegisteredMediaList() {
		return this.registeredMediaList;
	}

	public void setRegisteredMediaList(List<RegisteredMedia> registeredMediaList) {
		this.registeredMediaList = registeredMediaList;
	}

	public List<String> getFailedFileURLs() {
		return this.failedFileURLs;
	}

	public void setFailedFileURLs(List<String> failedFileURLs) {
		this.failedFileURLs = failedFileURLs;
	}

	public static class RegisteredMedia {

		private String mediaId;

		private String fileURL;

		private Boolean newRegister;

		public String getMediaId() {
			return this.mediaId;
		}

		public void setMediaId(String mediaId) {
			this.mediaId = mediaId;
		}

		public String getFileURL() {
			return this.fileURL;
		}

		public void setFileURL(String fileURL) {
			this.fileURL = fileURL;
		}

		public Boolean getNewRegister() {
			return this.newRegister;
		}

		public void setNewRegister(Boolean newRegister) {
			this.newRegister = newRegister;
		}
	}

	@Override
	public RegisterMediaResponse getInstance(UnmarshallerContext context) {
		return	RegisterMediaResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
