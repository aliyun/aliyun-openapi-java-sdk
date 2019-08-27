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

package com.aliyuncs.cusanalytic_sc_online.model.v20190524;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.cusanalytic_sc_online.transform.v20190524.DescribeActionDataResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeActionDataResponse extends AcsResponse {

	private Integer pageNo;

	private Long tsStart;

	private Integer pageLimit;

	private Integer pageCount;

	private Boolean isSuccess;

	private String errorMsg;

	private String storeId;

	private Long tsEnd;

	private List<ActionsMsgItem> actionsMsgItems;

	public Integer getPageNo() {
		return this.pageNo;
	}

	public void setPageNo(Integer pageNo) {
		this.pageNo = pageNo;
	}

	public Long getTsStart() {
		return this.tsStart;
	}

	public void setTsStart(Long tsStart) {
		this.tsStart = tsStart;
	}

	public Integer getPageLimit() {
		return this.pageLimit;
	}

	public void setPageLimit(Integer pageLimit) {
		this.pageLimit = pageLimit;
	}

	public Integer getPageCount() {
		return this.pageCount;
	}

	public void setPageCount(Integer pageCount) {
		this.pageCount = pageCount;
	}

	public Boolean getIsSuccess() {
		return this.isSuccess;
	}

	public void setIsSuccess(Boolean isSuccess) {
		this.isSuccess = isSuccess;
	}

	public String getErrorMsg() {
		return this.errorMsg;
	}

	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}

	public String getStoreId() {
		return this.storeId;
	}

	public void setStoreId(String storeId) {
		this.storeId = storeId;
	}

	public Long getTsEnd() {
		return this.tsEnd;
	}

	public void setTsEnd(Long tsEnd) {
		this.tsEnd = tsEnd;
	}

	public List<ActionsMsgItem> getActionsMsgItems() {
		return this.actionsMsgItems;
	}

	public void setActionsMsgItems(List<ActionsMsgItem> actionsMsgItems) {
		this.actionsMsgItems = actionsMsgItems;
	}

	public static class ActionsMsgItem {

		private Long locationId;

		private Long ukId;

		private String gmtModified;

		private Long status;

		private String gmtCreate;

		private Long storeId;

		private String tag;

		private Long id;

		private String locationLayerType;

		private ActionInfosItem actionInfosItem;

		private AttributesMsgItem attributesMsgItem;

		public Long getLocationId() {
			return this.locationId;
		}

		public void setLocationId(Long locationId) {
			this.locationId = locationId;
		}

		public Long getUkId() {
			return this.ukId;
		}

		public void setUkId(Long ukId) {
			this.ukId = ukId;
		}

		public String getGmtModified() {
			return this.gmtModified;
		}

		public void setGmtModified(String gmtModified) {
			this.gmtModified = gmtModified;
		}

		public Long getStatus() {
			return this.status;
		}

		public void setStatus(Long status) {
			this.status = status;
		}

		public String getGmtCreate() {
			return this.gmtCreate;
		}

		public void setGmtCreate(String gmtCreate) {
			this.gmtCreate = gmtCreate;
		}

		public Long getStoreId() {
			return this.storeId;
		}

		public void setStoreId(Long storeId) {
			this.storeId = storeId;
		}

		public String getTag() {
			return this.tag;
		}

		public void setTag(String tag) {
			this.tag = tag;
		}

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getLocationLayerType() {
			return this.locationLayerType;
		}

		public void setLocationLayerType(String locationLayerType) {
			this.locationLayerType = locationLayerType;
		}

		public ActionInfosItem getActionInfosItem() {
			return this.actionInfosItem;
		}

		public void setActionInfosItem(ActionInfosItem actionInfosItem) {
			this.actionInfosItem = actionInfosItem;
		}

		public AttributesMsgItem getAttributesMsgItem() {
			return this.attributesMsgItem;
		}

		public void setAttributesMsgItem(AttributesMsgItem attributesMsgItem) {
			this.attributesMsgItem = attributesMsgItem;
		}

		public static class ActionInfosItem {

			private Long maxts;

			private Long stayValid;

			private Long stayPeriod;

			private Long rawId;

			private Long mints;

			private MapImagePoint mapImagePoint;

			private FaceImgRect faceImgRect;

			public Long getMaxts() {
				return this.maxts;
			}

			public void setMaxts(Long maxts) {
				this.maxts = maxts;
			}

			public Long getStayValid() {
				return this.stayValid;
			}

			public void setStayValid(Long stayValid) {
				this.stayValid = stayValid;
			}

			public Long getStayPeriod() {
				return this.stayPeriod;
			}

			public void setStayPeriod(Long stayPeriod) {
				this.stayPeriod = stayPeriod;
			}

			public Long getRawId() {
				return this.rawId;
			}

			public void setRawId(Long rawId) {
				this.rawId = rawId;
			}

			public Long getMints() {
				return this.mints;
			}

			public void setMints(Long mints) {
				this.mints = mints;
			}

			public MapImagePoint getMapImagePoint() {
				return this.mapImagePoint;
			}

			public void setMapImagePoint(MapImagePoint mapImagePoint) {
				this.mapImagePoint = mapImagePoint;
			}

			public FaceImgRect getFaceImgRect() {
				return this.faceImgRect;
			}

			public void setFaceImgRect(FaceImgRect faceImgRect) {
				this.faceImgRect = faceImgRect;
			}

			public static class MapImagePoint {

				private Float x;

				private Float y;

				public Float getX() {
					return this.x;
				}

				public void setX(Float x) {
					this.x = x;
				}

				public Float getY() {
					return this.y;
				}

				public void setY(Float y) {
					this.y = y;
				}
			}

			public static class FaceImgRect {

				private Float bottom;

				private Float left;

				private Float top;

				private Float right;

				public Float getBottom() {
					return this.bottom;
				}

				public void setBottom(Float bottom) {
					this.bottom = bottom;
				}

				public Float getLeft() {
					return this.left;
				}

				public void setLeft(Float left) {
					this.left = left;
				}

				public Float getTop() {
					return this.top;
				}

				public void setTop(Float top) {
					this.top = top;
				}

				public Float getRight() {
					return this.right;
				}

				public void setRight(Float right) {
					this.right = right;
				}
			}
		}

		public static class AttributesMsgItem {

			private String imgUrl;

			private Long score;

			private String gender;

			private Long isClerk;

			private Integer ageNum;

			private String imgObjectKey;

			private String imgType;

			public String getImgUrl() {
				return this.imgUrl;
			}

			public void setImgUrl(String imgUrl) {
				this.imgUrl = imgUrl;
			}

			public Long getScore() {
				return this.score;
			}

			public void setScore(Long score) {
				this.score = score;
			}

			public String getGender() {
				return this.gender;
			}

			public void setGender(String gender) {
				this.gender = gender;
			}

			public Long getIsClerk() {
				return this.isClerk;
			}

			public void setIsClerk(Long isClerk) {
				this.isClerk = isClerk;
			}

			public Integer getAgeNum() {
				return this.ageNum;
			}

			public void setAgeNum(Integer ageNum) {
				this.ageNum = ageNum;
			}

			public String getImgObjectKey() {
				return this.imgObjectKey;
			}

			public void setImgObjectKey(String imgObjectKey) {
				this.imgObjectKey = imgObjectKey;
			}

			public String getImgType() {
				return this.imgType;
			}

			public void setImgType(String imgType) {
				this.imgType = imgType;
			}
		}
	}

	@Override
	public DescribeActionDataResponse getInstance(UnmarshallerContext context) {
		return	DescribeActionDataResponseUnmarshaller.unmarshall(this, context);
	}
}
