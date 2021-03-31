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

package com.aliyuncs.green.model.v20170823;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.green.transform.v20170823.DescribeViewContentResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeViewContentResponse extends AcsResponse {

	private String requestId;

	private Integer pageSize;

	private Integer currentPage;

	private Integer totalCount;

	private List<ViewContent> viewContentList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getCurrentPage() {
		return this.currentPage;
	}

	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
	}

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public List<ViewContent> getViewContentList() {
		return this.viewContentList;
	}

	public void setViewContentList(List<ViewContent> viewContentList) {
		this.viewContentList = viewContentList;
	}

	public static class ViewContent {

		private String taskId;

		private String dataId;

		private String bizType;

		private String content;

		private String url;

		private String newUrl;

		private String thumbnail;

		private String requestTime;

		private String scanFinishedTime;

		private String suggestion;

		private Long id;

		private String scanResult;

		private List<Result> results;

		private List<FrameResult> frameResults;

		private List<FaceResult> faceResults;

		public String getTaskId() {
			return this.taskId;
		}

		public void setTaskId(String taskId) {
			this.taskId = taskId;
		}

		public String getDataId() {
			return this.dataId;
		}

		public void setDataId(String dataId) {
			this.dataId = dataId;
		}

		public String getBizType() {
			return this.bizType;
		}

		public void setBizType(String bizType) {
			this.bizType = bizType;
		}

		public String getContent() {
			return this.content;
		}

		public void setContent(String content) {
			this.content = content;
		}

		public String getUrl() {
			return this.url;
		}

		public void setUrl(String url) {
			this.url = url;
		}

		public String getNewUrl() {
			return this.newUrl;
		}

		public void setNewUrl(String newUrl) {
			this.newUrl = newUrl;
		}

		public String getThumbnail() {
			return this.thumbnail;
		}

		public void setThumbnail(String thumbnail) {
			this.thumbnail = thumbnail;
		}

		public String getRequestTime() {
			return this.requestTime;
		}

		public void setRequestTime(String requestTime) {
			this.requestTime = requestTime;
		}

		public String getScanFinishedTime() {
			return this.scanFinishedTime;
		}

		public void setScanFinishedTime(String scanFinishedTime) {
			this.scanFinishedTime = scanFinishedTime;
		}

		public String getSuggestion() {
			return this.suggestion;
		}

		public void setSuggestion(String suggestion) {
			this.suggestion = suggestion;
		}

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getScanResult() {
			return this.scanResult;
		}

		public void setScanResult(String scanResult) {
			this.scanResult = scanResult;
		}

		public List<Result> getResults() {
			return this.results;
		}

		public void setResults(List<Result> results) {
			this.results = results;
		}

		public List<FrameResult> getFrameResults() {
			return this.frameResults;
		}

		public void setFrameResults(List<FrameResult> frameResults) {
			this.frameResults = frameResults;
		}

		public List<FaceResult> getFaceResults() {
			return this.faceResults;
		}

		public void setFaceResults(List<FaceResult> faceResults) {
			this.faceResults = faceResults;
		}

		public static class Result {

			private String suggestion;

			private String label;

			private String scene;

			public String getSuggestion() {
				return this.suggestion;
			}

			public void setSuggestion(String suggestion) {
				this.suggestion = suggestion;
			}

			public String getLabel() {
				return this.label;
			}

			public void setLabel(String label) {
				this.label = label;
			}

			public String getScene() {
				return this.scene;
			}

			public void setScene(String scene) {
				this.scene = scene;
			}
		}

		public static class FrameResult {

			private String url;

			private Integer offset;

			private String label;

			public String getUrl() {
				return this.url;
			}

			public void setUrl(String url) {
				this.url = url;
			}

			public Integer getOffset() {
				return this.offset;
			}

			public void setOffset(Integer offset) {
				this.offset = offset;
			}

			public String getLabel() {
				return this.label;
			}

			public void setLabel(String label) {
				this.label = label;
			}
		}

		public static class FaceResult {

			private Boolean bualified;

			private Location location;

			private Gender gender;

			private Glasses glasses;

			private Age age;

			private Smile smile;

			private Quality quality;

			private Respirator respirator;

			private Hat hat;

			private Mustache mustache;

			private Bang bang;

			private Hairstyle hairstyle;

			private Image image;

			public Boolean getBualified() {
				return this.bualified;
			}

			public void setBualified(Boolean bualified) {
				this.bualified = bualified;
			}

			public Location getLocation() {
				return this.location;
			}

			public void setLocation(Location location) {
				this.location = location;
			}

			public Gender getGender() {
				return this.gender;
			}

			public void setGender(Gender gender) {
				this.gender = gender;
			}

			public Glasses getGlasses() {
				return this.glasses;
			}

			public void setGlasses(Glasses glasses) {
				this.glasses = glasses;
			}

			public Age getAge() {
				return this.age;
			}

			public void setAge(Age age) {
				this.age = age;
			}

			public Smile getSmile() {
				return this.smile;
			}

			public void setSmile(Smile smile) {
				this.smile = smile;
			}

			public Quality getQuality() {
				return this.quality;
			}

			public void setQuality(Quality quality) {
				this.quality = quality;
			}

			public Respirator getRespirator() {
				return this.respirator;
			}

			public void setRespirator(Respirator respirator) {
				this.respirator = respirator;
			}

			public Hat getHat() {
				return this.hat;
			}

			public void setHat(Hat hat) {
				this.hat = hat;
			}

			public Mustache getMustache() {
				return this.mustache;
			}

			public void setMustache(Mustache mustache) {
				this.mustache = mustache;
			}

			public Bang getBang() {
				return this.bang;
			}

			public void setBang(Bang bang) {
				this.bang = bang;
			}

			public Hairstyle getHairstyle() {
				return this.hairstyle;
			}

			public void setHairstyle(Hairstyle hairstyle) {
				this.hairstyle = hairstyle;
			}

			public Image getImage() {
				return this.image;
			}

			public void setImage(Image image) {
				this.image = image;
			}

			public static class Location {

				private Integer x;

				private Integer y;

				private Integer w;

				private Integer h;

				public Integer getX() {
					return this.x;
				}

				public void setX(Integer x) {
					this.x = x;
				}

				public Integer getY() {
					return this.y;
				}

				public void setY(Integer y) {
					this.y = y;
				}

				public Integer getW() {
					return this.w;
				}

				public void setW(Integer w) {
					this.w = w;
				}

				public Integer getH() {
					return this.h;
				}

				public void setH(Integer h) {
					this.h = h;
				}
			}

			public static class Gender {

				private Float rate;

				private String value;

				public Float getRate() {
					return this.rate;
				}

				public void setRate(Float rate) {
					this.rate = rate;
				}

				public String getValue() {
					return this.value;
				}

				public void setValue(String value) {
					this.value = value;
				}
			}

			public static class Glasses {

				private Float rate;

				private String value;

				public Float getRate() {
					return this.rate;
				}

				public void setRate(Float rate) {
					this.rate = rate;
				}

				public String getValue() {
					return this.value;
				}

				public void setValue(String value) {
					this.value = value;
				}
			}

			public static class Age {

				private Float rate;

				private Integer value;

				public Float getRate() {
					return this.rate;
				}

				public void setRate(Float rate) {
					this.rate = rate;
				}

				public Integer getValue() {
					return this.value;
				}

				public void setValue(Integer value) {
					this.value = value;
				}
			}

			public static class Smile {

				private Float rate;

				private Float value;

				public Float getRate() {
					return this.rate;
				}

				public void setRate(Float rate) {
					this.rate = rate;
				}

				public Float getValue() {
					return this.value;
				}

				public void setValue(Float value) {
					this.value = value;
				}
			}

			public static class Quality {

				private Float blur;

				private Float pitch;

				private Float yaw;

				private Float roll;

				public Float getBlur() {
					return this.blur;
				}

				public void setBlur(Float blur) {
					this.blur = blur;
				}

				public Float getPitch() {
					return this.pitch;
				}

				public void setPitch(Float pitch) {
					this.pitch = pitch;
				}

				public Float getYaw() {
					return this.yaw;
				}

				public void setYaw(Float yaw) {
					this.yaw = yaw;
				}

				public Float getRoll() {
					return this.roll;
				}

				public void setRoll(Float roll) {
					this.roll = roll;
				}
			}

			public static class Respirator {

				private Float rate;

				private String value;

				public Float getRate() {
					return this.rate;
				}

				public void setRate(Float rate) {
					this.rate = rate;
				}

				public String getValue() {
					return this.value;
				}

				public void setValue(String value) {
					this.value = value;
				}
			}

			public static class Hat {

				private Float rate;

				private String value;

				public Float getRate() {
					return this.rate;
				}

				public void setRate(Float rate) {
					this.rate = rate;
				}

				public String getValue() {
					return this.value;
				}

				public void setValue(String value) {
					this.value = value;
				}
			}

			public static class Mustache {

				private Float rate;

				private String value;

				public Float getRate() {
					return this.rate;
				}

				public void setRate(Float rate) {
					this.rate = rate;
				}

				public String getValue() {
					return this.value;
				}

				public void setValue(String value) {
					this.value = value;
				}
			}

			public static class Bang {

				private Float rate;

				private String value;

				public Float getRate() {
					return this.rate;
				}

				public void setRate(Float rate) {
					this.rate = rate;
				}

				public String getValue() {
					return this.value;
				}

				public void setValue(String value) {
					this.value = value;
				}
			}

			public static class Hairstyle {

				private Float rate;

				private String value;

				public Float getRate() {
					return this.rate;
				}

				public void setRate(Float rate) {
					this.rate = rate;
				}

				public String getValue() {
					return this.value;
				}

				public void setValue(String value) {
					this.value = value;
				}
			}

			public static class Image {

				private Integer width;

				private Integer height;

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
			}
		}
	}

	@Override
	public DescribeViewContentResponse getInstance(UnmarshallerContext context) {
		return	DescribeViewContentResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
