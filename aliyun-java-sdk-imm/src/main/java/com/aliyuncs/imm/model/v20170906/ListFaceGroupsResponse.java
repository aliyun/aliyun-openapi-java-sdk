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
import com.aliyuncs.imm.transform.v20170906.ListFaceGroupsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListFaceGroupsResponse extends AcsResponse {

	private String requestId;

	private String nextMarker;

	private List<FaceGroupsItem> faceGroups;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getNextMarker() {
		return this.nextMarker;
	}

	public void setNextMarker(String nextMarker) {
		this.nextMarker = nextMarker;
	}

	public List<FaceGroupsItem> getFaceGroups() {
		return this.faceGroups;
	}

	public void setFaceGroups(List<FaceGroupsItem> faceGroups) {
		this.faceGroups = faceGroups;
	}

	public static class FaceGroupsItem {

		private String gender;

		private String createTime;

		private String remarksC;

		private Integer faceCount;

		private String remarksArrayB;

		private String remarksD;

		private Float maxAge;

		private String groupId;

		private String groupName;

		private String remarksA;

		private Float averageAge;

		private String remarksArrayA;

		private Float minAge;

		private Integer imageCount;

		private String externalId;

		private String remarksB;

		private String modifyTime;

		private GroupCoverFace groupCoverFace;

		public String getGender() {
			return this.gender;
		}

		public void setGender(String gender) {
			this.gender = gender;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public String getRemarksC() {
			return this.remarksC;
		}

		public void setRemarksC(String remarksC) {
			this.remarksC = remarksC;
		}

		public Integer getFaceCount() {
			return this.faceCount;
		}

		public void setFaceCount(Integer faceCount) {
			this.faceCount = faceCount;
		}

		public String getRemarksArrayB() {
			return this.remarksArrayB;
		}

		public void setRemarksArrayB(String remarksArrayB) {
			this.remarksArrayB = remarksArrayB;
		}

		public String getRemarksD() {
			return this.remarksD;
		}

		public void setRemarksD(String remarksD) {
			this.remarksD = remarksD;
		}

		public Float getMaxAge() {
			return this.maxAge;
		}

		public void setMaxAge(Float maxAge) {
			this.maxAge = maxAge;
		}

		public String getGroupId() {
			return this.groupId;
		}

		public void setGroupId(String groupId) {
			this.groupId = groupId;
		}

		public String getGroupName() {
			return this.groupName;
		}

		public void setGroupName(String groupName) {
			this.groupName = groupName;
		}

		public String getRemarksA() {
			return this.remarksA;
		}

		public void setRemarksA(String remarksA) {
			this.remarksA = remarksA;
		}

		public Float getAverageAge() {
			return this.averageAge;
		}

		public void setAverageAge(Float averageAge) {
			this.averageAge = averageAge;
		}

		public String getRemarksArrayA() {
			return this.remarksArrayA;
		}

		public void setRemarksArrayA(String remarksArrayA) {
			this.remarksArrayA = remarksArrayA;
		}

		public Float getMinAge() {
			return this.minAge;
		}

		public void setMinAge(Float minAge) {
			this.minAge = minAge;
		}

		public Integer getImageCount() {
			return this.imageCount;
		}

		public void setImageCount(Integer imageCount) {
			this.imageCount = imageCount;
		}

		public String getExternalId() {
			return this.externalId;
		}

		public void setExternalId(String externalId) {
			this.externalId = externalId;
		}

		public String getRemarksB() {
			return this.remarksB;
		}

		public void setRemarksB(String remarksB) {
			this.remarksB = remarksB;
		}

		public String getModifyTime() {
			return this.modifyTime;
		}

		public void setModifyTime(String modifyTime) {
			this.modifyTime = modifyTime;
		}

		public GroupCoverFace getGroupCoverFace() {
			return this.groupCoverFace;
		}

		public void setGroupCoverFace(GroupCoverFace groupCoverFace) {
			this.groupCoverFace = groupCoverFace;
		}

		public static class GroupCoverFace {

			private String faceId;

			private String imageUri;

			private String externalId;

			private Long imageHeight;

			private Long imageWidth;

			private FaceBoundary faceBoundary;

			public String getFaceId() {
				return this.faceId;
			}

			public void setFaceId(String faceId) {
				this.faceId = faceId;
			}

			public String getImageUri() {
				return this.imageUri;
			}

			public void setImageUri(String imageUri) {
				this.imageUri = imageUri;
			}

			public String getExternalId() {
				return this.externalId;
			}

			public void setExternalId(String externalId) {
				this.externalId = externalId;
			}

			public Long getImageHeight() {
				return this.imageHeight;
			}

			public void setImageHeight(Long imageHeight) {
				this.imageHeight = imageHeight;
			}

			public Long getImageWidth() {
				return this.imageWidth;
			}

			public void setImageWidth(Long imageWidth) {
				this.imageWidth = imageWidth;
			}

			public FaceBoundary getFaceBoundary() {
				return this.faceBoundary;
			}

			public void setFaceBoundary(FaceBoundary faceBoundary) {
				this.faceBoundary = faceBoundary;
			}

			public static class FaceBoundary {

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
		}
	}

	@Override
	public ListFaceGroupsResponse getInstance(UnmarshallerContext context) {
		return	ListFaceGroupsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
