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

package com.aliyuncs.eds_aic.model.v20230930;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.eds_aic.transform.v20230930.DescribeDisplayConfigResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDisplayConfigResponse extends AcsResponse {

	private String requestId;

	private List<Data> displayConfigModel;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<Data> getDisplayConfigModel() {
		return this.displayConfigModel;
	}

	public void setDisplayConfigModel(List<Data> displayConfigModel) {
		this.displayConfigModel = displayConfigModel;
	}

	public static class Data {

		private String androidInstanceId;

		private Integer resolutionHeight;

		private Integer resolutionWidth;

		private Integer dpi;

		private Integer fps;

		private String lockResolution;

		public String getAndroidInstanceId() {
			return this.androidInstanceId;
		}

		public void setAndroidInstanceId(String androidInstanceId) {
			this.androidInstanceId = androidInstanceId;
		}

		public Integer getResolutionHeight() {
			return this.resolutionHeight;
		}

		public void setResolutionHeight(Integer resolutionHeight) {
			this.resolutionHeight = resolutionHeight;
		}

		public Integer getResolutionWidth() {
			return this.resolutionWidth;
		}

		public void setResolutionWidth(Integer resolutionWidth) {
			this.resolutionWidth = resolutionWidth;
		}

		public Integer getDpi() {
			return this.dpi;
		}

		public void setDpi(Integer dpi) {
			this.dpi = dpi;
		}

		public Integer getFps() {
			return this.fps;
		}

		public void setFps(Integer fps) {
			this.fps = fps;
		}

		public String getLockResolution() {
			return this.lockResolution;
		}

		public void setLockResolution(String lockResolution) {
			this.lockResolution = lockResolution;
		}
	}

	@Override
	public DescribeDisplayConfigResponse getInstance(UnmarshallerContext context) {
		return	DescribeDisplayConfigResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
