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

package com.aliyuncs.ivision.model.v20190308;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ivision.transform.v20190308.SearchFaceResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class SearchFaceResponse extends AcsResponse {

	private String requestId;

	private String groupId;

	private List<FaceResult> faceResults;

	private Rect rect;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getGroupId() {
		return this.groupId;
	}

	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}

	public List<FaceResult> getFaceResults() {
		return this.faceResults;
	}

	public void setFaceResults(List<FaceResult> faceResults) {
		this.faceResults = faceResults;
	}

	public Rect getRect() {
		return this.rect;
	}

	public void setRect(Rect rect) {
		this.rect = rect;
	}

	public static class FaceResult {

		private String faceToken;

		private Float probability;

		public String getFaceToken() {
			return this.faceToken;
		}

		public void setFaceToken(String faceToken) {
			this.faceToken = faceToken;
		}

		public Float getProbability() {
			return this.probability;
		}

		public void setProbability(Float probability) {
			this.probability = probability;
		}
	}

	public static class Rect {

		private Integer top;

		private Integer width;

		private Integer height;

		private Integer left;

		public Integer getTop() {
			return this.top;
		}

		public void setTop(Integer top) {
			this.top = top;
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

		public Integer getLeft() {
			return this.left;
		}

		public void setLeft(Integer left) {
			this.left = left;
		}
	}

	@Override
	public SearchFaceResponse getInstance(UnmarshallerContext context) {
		return	SearchFaceResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
