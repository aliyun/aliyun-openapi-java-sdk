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
import com.aliyuncs.AcsResponse;
import com.aliyuncs.vod.transform.v20170321.GetAIVideoTagResultResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetAIVideoTagResultResponse extends AcsResponse {

	private String requestId;

	private VideoTagResult videoTagResult;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public VideoTagResult getVideoTagResult() {
		return this.videoTagResult;
	}

	public void setVideoTagResult(VideoTagResult videoTagResult) {
		this.videoTagResult = videoTagResult;
	}

	public static class VideoTagResult {

		private List<CategoryItem> category;

		private List<PersonItem> person;

		private List<TimeItem> time;

		private List<LocationItem> location;

		private List<KeywordItem> keyword;

		public List<CategoryItem> getCategory() {
			return this.category;
		}

		public void setCategory(List<CategoryItem> category) {
			this.category = category;
		}

		public List<PersonItem> getPerson() {
			return this.person;
		}

		public void setPerson(List<PersonItem> person) {
			this.person = person;
		}

		public List<TimeItem> getTime() {
			return this.time;
		}

		public void setTime(List<TimeItem> time) {
			this.time = time;
		}

		public List<LocationItem> getLocation() {
			return this.location;
		}

		public void setLocation(List<LocationItem> location) {
			this.location = location;
		}

		public List<KeywordItem> getKeyword() {
			return this.keyword;
		}

		public void setKeyword(List<KeywordItem> keyword) {
			this.keyword = keyword;
		}

		public static class CategoryItem {

			private String tag;

			public String getTag() {
				return this.tag;
			}

			public void setTag(String tag) {
				this.tag = tag;
			}
		}

		public static class PersonItem {

			private String faceUrl;

			private String tag;

			private List<String> times;

			public String getFaceUrl() {
				return this.faceUrl;
			}

			public void setFaceUrl(String faceUrl) {
				this.faceUrl = faceUrl;
			}

			public String getTag() {
				return this.tag;
			}

			public void setTag(String tag) {
				this.tag = tag;
			}

			public List<String> getTimes() {
				return this.times;
			}

			public void setTimes(List<String> times) {
				this.times = times;
			}
		}

		public static class TimeItem {

			private String tag;

			private List<String> times1;

			public String getTag() {
				return this.tag;
			}

			public void setTag(String tag) {
				this.tag = tag;
			}

			public List<String> getTimes1() {
				return this.times1;
			}

			public void setTimes1(List<String> times1) {
				this.times1 = times1;
			}
		}

		public static class LocationItem {

			private String tag;

			private List<String> times2;

			public String getTag() {
				return this.tag;
			}

			public void setTag(String tag) {
				this.tag = tag;
			}

			public List<String> getTimes2() {
				return this.times2;
			}

			public void setTimes2(List<String> times2) {
				this.times2 = times2;
			}
		}

		public static class KeywordItem {

			private String tag;

			private List<String> times3;

			public String getTag() {
				return this.tag;
			}

			public void setTag(String tag) {
				this.tag = tag;
			}

			public List<String> getTimes3() {
				return this.times3;
			}

			public void setTimes3(List<String> times3) {
				this.times3 = times3;
			}
		}
	}

	@Override
	public GetAIVideoTagResultResponse getInstance(UnmarshallerContext context) {
		return	GetAIVideoTagResultResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
