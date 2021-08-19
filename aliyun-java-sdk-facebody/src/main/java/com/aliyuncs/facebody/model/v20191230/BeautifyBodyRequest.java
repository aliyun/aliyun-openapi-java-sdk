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

package com.aliyuncs.facebody.model.v20191230;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.facebody.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class BeautifyBodyRequest extends RpcAcsRequest<BeautifyBodyResponse> {
	   

	@SerializedName("bodyBoxes")
	private List<BodyBoxes> bodyBoxes;

	private Float lengthenDegree;

	private Float maleLiquifyDegree;

	private Long originalWidth;

	@SerializedName("faceList")
	private List<FaceList> faceList;

	@SerializedName("ageRange")
	private AgeRange ageRange;

	private Long custom;

	private Long originalHeight;

	private String imageURL;

	private Float femaleLiquifyDegree;

	@SerializedName("poseList")
	private List<PoseList> poseList;
	public BeautifyBodyRequest() {
		super("facebody", "2019-12-30", "BeautifyBody");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public List<BodyBoxes> getBodyBoxes() {
		return this.bodyBoxes;
	}

	public void setBodyBoxes(List<BodyBoxes> bodyBoxes) {
		this.bodyBoxes = bodyBoxes;	
		if (bodyBoxes != null) {
			putBodyParameter("BodyBoxes" , new Gson().toJson(bodyBoxes));
		}	
	}

	public Float getLengthenDegree() {
		return this.lengthenDegree;
	}

	public void setLengthenDegree(Float lengthenDegree) {
		this.lengthenDegree = lengthenDegree;
		if(lengthenDegree != null){
			putBodyParameter("LengthenDegree", lengthenDegree.toString());
		}
	}

	public Float getMaleLiquifyDegree() {
		return this.maleLiquifyDegree;
	}

	public void setMaleLiquifyDegree(Float maleLiquifyDegree) {
		this.maleLiquifyDegree = maleLiquifyDegree;
		if(maleLiquifyDegree != null){
			putBodyParameter("MaleLiquifyDegree", maleLiquifyDegree.toString());
		}
	}

	public Long getOriginalWidth() {
		return this.originalWidth;
	}

	public void setOriginalWidth(Long originalWidth) {
		this.originalWidth = originalWidth;
		if(originalWidth != null){
			putBodyParameter("OriginalWidth", originalWidth.toString());
		}
	}

	public List<FaceList> getFaceList() {
		return this.faceList;
	}

	public void setFaceList(List<FaceList> faceList) {
		this.faceList = faceList;	
		if (faceList != null) {
			putBodyParameter("FaceList" , new Gson().toJson(faceList));
		}	
	}

	public AgeRange getAgeRange() {
		return this.ageRange;
	}

	public void setAgeRange(AgeRange ageRange) {
		this.ageRange = ageRange;	
		if (ageRange != null) {
			putBodyParameter("AgeRange" , new Gson().toJson(ageRange));
		}	
	}

	public Long getCustom() {
		return this.custom;
	}

	public void setCustom(Long custom) {
		this.custom = custom;
		if(custom != null){
			putBodyParameter("Custom", custom.toString());
		}
	}

	public Long getOriginalHeight() {
		return this.originalHeight;
	}

	public void setOriginalHeight(Long originalHeight) {
		this.originalHeight = originalHeight;
		if(originalHeight != null){
			putBodyParameter("OriginalHeight", originalHeight.toString());
		}
	}

	public String getImageURL() {
		return this.imageURL;
	}

	public void setImageURL(String imageURL) {
		this.imageURL = imageURL;
		if(imageURL != null){
			putBodyParameter("ImageURL", imageURL);
		}
	}

	public Float getFemaleLiquifyDegree() {
		return this.femaleLiquifyDegree;
	}

	public void setFemaleLiquifyDegree(Float femaleLiquifyDegree) {
		this.femaleLiquifyDegree = femaleLiquifyDegree;
		if(femaleLiquifyDegree != null){
			putBodyParameter("FemaleLiquifyDegree", femaleLiquifyDegree.toString());
		}
	}

	public List<PoseList> getPoseList() {
		return this.poseList;
	}

	public void setPoseList(List<PoseList> poseList) {
		this.poseList = poseList;	
		if (poseList != null) {
			putBodyParameter("PoseList" , new Gson().toJson(poseList));
		}	
	}

	public static class BodyBoxes {

		@SerializedName("X")
		private Float x;

		@SerializedName("Width")
		private Float width;

		@SerializedName("Y")
		private Float y;

		@SerializedName("Height")
		private Float height;

		public Float getX() {
			return this.x;
		}

		public void setX(Float x) {
			this.x = x;
		}

		public Float getWidth() {
			return this.width;
		}

		public void setWidth(Float width) {
			this.width = width;
		}

		public Float getY() {
			return this.y;
		}

		public void setY(Float y) {
			this.y = y;
		}

		public Float getHeight() {
			return this.height;
		}

		public void setHeight(Float height) {
			this.height = height;
		}
	}

	public static class FaceList {

		@SerializedName("Gender")
		private Long gender;

		@SerializedName("FaceBox")
		private FaceBox faceBox;

		@SerializedName("Age")
		private Long age;

		public Long getGender() {
			return this.gender;
		}

		public void setGender(Long gender) {
			this.gender = gender;
		}

		public FaceBox getFaceBox() {
			return this.faceBox;
		}

		public void setFaceBox(FaceBox faceBox) {
			this.faceBox = faceBox;
		}

		public Long getAge() {
			return this.age;
		}

		public void setAge(Long age) {
			this.age = age;
		}

		public static class FaceBox {

			@SerializedName("X")
			private Float x;

			@SerializedName("Width")
			private Float width;

			@SerializedName("Y")
			private Float y;

			@SerializedName("Height")
			private Float height;

			public Float getX() {
				return this.x;
			}

			public void setX(Float x) {
				this.x = x;
			}

			public Float getWidth() {
				return this.width;
			}

			public void setWidth(Float width) {
				this.width = width;
			}

			public Float getY() {
				return this.y;
			}

			public void setY(Float y) {
				this.y = y;
			}

			public Float getHeight() {
				return this.height;
			}

			public void setHeight(Float height) {
				this.height = height;
			}
		}
	}

	public static class AgeRange {

		@SerializedName("AgeMax")
		private Long ageMax;

		@SerializedName("AgeMinimum")
		private Long ageMinimum;

		public Long getAgeMax() {
			return this.ageMax;
		}

		public void setAgeMax(Long ageMax) {
			this.ageMax = ageMax;
		}

		public Long getAgeMinimum() {
			return this.ageMinimum;
		}

		public void setAgeMinimum(Long ageMinimum) {
			this.ageMinimum = ageMinimum;
		}
	}

	public static class PoseList {

		@SerializedName("Pose")
		private List<PoseItem> pose;

		public List<PoseItem> getPose() {
			return this.pose;
		}

		public void setPose(List<PoseItem> pose) {
			this.pose = pose;
		}

		public static class PoseItem {

			@SerializedName("Score")
			private Float score;

			@SerializedName("X")
			private Long x;

			@SerializedName("Y")
			private Long y;

			public Float getScore() {
				return this.score;
			}

			public void setScore(Float score) {
				this.score = score;
			}

			public Long getX() {
				return this.x;
			}

			public void setX(Long x) {
				this.x = x;
			}

			public Long getY() {
				return this.y;
			}

			public void setY(Long y) {
				this.y = y;
			}
		}
	}

	@Override
	public Class<BeautifyBodyResponse> getResponseClass() {
		return BeautifyBodyResponse.class;
	}

}
