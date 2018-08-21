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

package com.aliyuncs.imm.model.v20170906;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.imm.transform.v20170906.CompareFaceResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class CompareFaceResponse extends AcsResponse {

	private String requestId;

	private List<CompareResultItem> compareResult;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<CompareResultItem> getCompareResult() {
		return this.compareResult;
	}

	public void setCompareResult(List<CompareResultItem> compareResult) {
		this.compareResult = compareResult;
	}

	public static class CompareResultItem {

		private Float similarity;

		private FaceA faceA;

		private FaceB faceB;

		public Float getSimilarity() {
			return this.similarity;
		}

		public void setSimilarity(Float similarity) {
			this.similarity = similarity;
		}

		public FaceA getFaceA() {
			return this.faceA;
		}

		public void setFaceA(FaceA faceA) {
			this.faceA = faceA;
		}

		public FaceB getFaceB() {
			return this.faceB;
		}

		public void setFaceB(FaceB faceB) {
			this.faceB = faceB;
		}

		public static class FaceA {

			private String imageUrl;

			private List<String> axis;

			public String getImageUrl() {
				return this.imageUrl;
			}

			public void setImageUrl(String imageUrl) {
				this.imageUrl = imageUrl;
			}

			public List<String> getAxis() {
				return this.axis;
			}

			public void setAxis(List<String> axis) {
				this.axis = axis;
			}
		}

		public static class FaceB {

			private String imageUrl;

			private List<String> axis1;

			public String getImageUrl() {
				return this.imageUrl;
			}

			public void setImageUrl(String imageUrl) {
				this.imageUrl = imageUrl;
			}

			public List<String> getAxis1() {
				return this.axis1;
			}

			public void setAxis1(List<String> axis1) {
				this.axis1 = axis1;
			}
		}
	}

	@Override
	public CompareFaceResponse getInstance(UnmarshallerContext context) {
		return	CompareFaceResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
