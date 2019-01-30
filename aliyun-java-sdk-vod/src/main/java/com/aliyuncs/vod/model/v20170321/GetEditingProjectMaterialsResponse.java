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
import com.aliyuncs.vod.transform.v20170321.GetEditingProjectMaterialsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetEditingProjectMaterialsResponse extends AcsResponse {

	private String requestId;

	private List<Material> materialList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<Material> getMaterialList() {
		return this.materialList;
	}

	public void setMaterialList(List<Material> materialList) {
		this.materialList = materialList;
	}

	public static class Material {

		private String materialId;

		private String title;

		private String tags;

		private String status;

		private Long size;

		private Float duration;

		private String description;

		private String creationTime;

		private String modifiedTime;

		private String coverURL;

		private Integer cateId;

		private String cateName;

		private String source;

		private String spriteConfig;

		private List<String> snapshots;

		private List<String> sprites;

		public String getMaterialId() {
			return this.materialId;
		}

		public void setMaterialId(String materialId) {
			this.materialId = materialId;
		}

		public String getTitle() {
			return this.title;
		}

		public void setTitle(String title) {
			this.title = title;
		}

		public String getTags() {
			return this.tags;
		}

		public void setTags(String tags) {
			this.tags = tags;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public Long getSize() {
			return this.size;
		}

		public void setSize(Long size) {
			this.size = size;
		}

		public Float getDuration() {
			return this.duration;
		}

		public void setDuration(Float duration) {
			this.duration = duration;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getCreationTime() {
			return this.creationTime;
		}

		public void setCreationTime(String creationTime) {
			this.creationTime = creationTime;
		}

		public String getModifiedTime() {
			return this.modifiedTime;
		}

		public void setModifiedTime(String modifiedTime) {
			this.modifiedTime = modifiedTime;
		}

		public String getCoverURL() {
			return this.coverURL;
		}

		public void setCoverURL(String coverURL) {
			this.coverURL = coverURL;
		}

		public Integer getCateId() {
			return this.cateId;
		}

		public void setCateId(Integer cateId) {
			this.cateId = cateId;
		}

		public String getCateName() {
			return this.cateName;
		}

		public void setCateName(String cateName) {
			this.cateName = cateName;
		}

		public String getSource() {
			return this.source;
		}

		public void setSource(String source) {
			this.source = source;
		}

		public String getSpriteConfig() {
			return this.spriteConfig;
		}

		public void setSpriteConfig(String spriteConfig) {
			this.spriteConfig = spriteConfig;
		}

		public List<String> getSnapshots() {
			return this.snapshots;
		}

		public void setSnapshots(List<String> snapshots) {
			this.snapshots = snapshots;
		}

		public List<String> getSprites() {
			return this.sprites;
		}

		public void setSprites(List<String> sprites) {
			this.sprites = sprites;
		}
	}

	@Override
	public GetEditingProjectMaterialsResponse getInstance(UnmarshallerContext context) {
		return	GetEditingProjectMaterialsResponseUnmarshaller.unmarshall(this, context);
	}
}
