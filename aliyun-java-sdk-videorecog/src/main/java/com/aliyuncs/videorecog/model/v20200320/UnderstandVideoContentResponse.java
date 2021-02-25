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

package com.aliyuncs.videorecog.model.v20200320;

import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.videorecog.transform.v20200320.UnderstandVideoContentResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class UnderstandVideoContentResponse extends AcsResponse {

	private String message;

	private String requestId;

	private String code;

	private Data data;

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

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private Map<Object,Object> tagInfo;

		private VideoInfo videoInfo;

		public Map<Object,Object> getTagInfo() {
			return this.tagInfo;
		}

		public void setTagInfo(Map<Object,Object> tagInfo) {
			this.tagInfo = tagInfo;
		}

		public VideoInfo getVideoInfo() {
			return this.videoInfo;
		}

		public void setVideoInfo(VideoInfo videoInfo) {
			this.videoInfo = videoInfo;
		}

		public static class VideoInfo {

			private Float fps;

			private Long duration;

			private Long height;

			private Long width;

			public Float getFps() {
				return this.fps;
			}

			public void setFps(Float fps) {
				this.fps = fps;
			}

			public Long getDuration() {
				return this.duration;
			}

			public void setDuration(Long duration) {
				this.duration = duration;
			}

			public Long getHeight() {
				return this.height;
			}

			public void setHeight(Long height) {
				this.height = height;
			}

			public Long getWidth() {
				return this.width;
			}

			public void setWidth(Long width) {
				this.width = width;
			}
		}
	}

	@Override
	public UnderstandVideoContentResponse getInstance(UnmarshallerContext context) {
		return	UnderstandVideoContentResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
