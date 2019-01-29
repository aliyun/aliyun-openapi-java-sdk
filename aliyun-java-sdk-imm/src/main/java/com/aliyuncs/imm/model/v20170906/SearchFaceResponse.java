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
import com.aliyuncs.imm.transform.v20170906.SearchFaceResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class SearchFaceResponse extends AcsResponse {

	private String requestId;

	private String imageUri;

	private String groupName;

	private Integer glasses;

	private Integer hat;

	private Float score;

	private List<ResultFacesItem> resultFaces;

	private List<String> axis;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getImageUri() {
		return this.imageUri;
	}

	public void setImageUri(String imageUri) {
		this.imageUri = imageUri;
	}

	public String getGroupName() {
		return this.groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	public Integer getGlasses() {
		return this.glasses;
	}

	public void setGlasses(Integer glasses) {
		this.glasses = glasses;
	}

	public Integer getHat() {
		return this.hat;
	}

	public void setHat(Integer hat) {
		this.hat = hat;
	}

	public Float getScore() {
		return this.score;
	}

	public void setScore(Float score) {
		this.score = score;
	}

	public List<ResultFacesItem> getResultFaces() {
		return this.resultFaces;
	}

	public void setResultFaces(List<ResultFacesItem> resultFaces) {
		this.resultFaces = resultFaces;
	}

	public List<String> getAxis() {
		return this.axis;
	}

	public void setAxis(List<String> axis) {
		this.axis = axis;
	}

	public static class ResultFacesItem {

		private String groupId;

		private String user;

		private String imageId;

		private Float score;

		private String imageUri;

		private Integer glasses;

		private Integer hat;

		private List<String> axis1;

		public String getGroupId() {
			return this.groupId;
		}

		public void setGroupId(String groupId) {
			this.groupId = groupId;
		}

		public String getUser() {
			return this.user;
		}

		public void setUser(String user) {
			this.user = user;
		}

		public String getImageId() {
			return this.imageId;
		}

		public void setImageId(String imageId) {
			this.imageId = imageId;
		}

		public Float getScore() {
			return this.score;
		}

		public void setScore(Float score) {
			this.score = score;
		}

		public String getImageUri() {
			return this.imageUri;
		}

		public void setImageUri(String imageUri) {
			this.imageUri = imageUri;
		}

		public Integer getGlasses() {
			return this.glasses;
		}

		public void setGlasses(Integer glasses) {
			this.glasses = glasses;
		}

		public Integer getHat() {
			return this.hat;
		}

		public void setHat(Integer hat) {
			this.hat = hat;
		}

		public List<String> getAxis1() {
			return this.axis1;
		}

		public void setAxis1(List<String> axis1) {
			this.axis1 = axis1;
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
