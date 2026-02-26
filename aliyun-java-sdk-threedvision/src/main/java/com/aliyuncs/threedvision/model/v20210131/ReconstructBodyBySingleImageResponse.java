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

package com.aliyuncs.threedvision.model.v20210131;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.threedvision.transform.v20210131.ReconstructBodyBySingleImageResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ReconstructBodyBySingleImageResponse extends AcsResponse {

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

		private String depthURL;

		private String meshURL;

		public String getDepthURL() {
			return this.depthURL;
		}

		public void setDepthURL(String depthURL) {
			this.depthURL = depthURL;
		}

		public String getMeshURL() {
			return this.meshURL;
		}

		public void setMeshURL(String meshURL) {
			this.meshURL = meshURL;
		}
	}

	@Override
	public ReconstructBodyBySingleImageResponse getInstance(UnmarshallerContext context) {
		return	ReconstructBodyBySingleImageResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
