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
import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.green.transform.v20170823.DescribeImageLibResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeImageLibResponse extends AcsResponse {

	private String requestId;

	private Integer totalCount;

	private List<ImageLib> imageLibList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public List<ImageLib> getImageLibList() {
		return this.imageLibList;
	}

	public void setImageLibList(List<ImageLib> imageLibList) {
		this.imageLibList = imageLibList;
	}

	public static class ImageLib {

		private Integer imageCount;

		private String modifiedTime;

		private String code;

		private String name;

		private Integer id;

		private String source;

		private String category;

		private String serviceModule;

		private String scene;

		private List<String> bizTypes;

		public Integer getImageCount() {
			return this.imageCount;
		}

		public void setImageCount(Integer imageCount) {
			this.imageCount = imageCount;
		}

		public String getModifiedTime() {
			return this.modifiedTime;
		}

		public void setModifiedTime(String modifiedTime) {
			this.modifiedTime = modifiedTime;
		}

		public String getCode() {
			return this.code;
		}

		public void setCode(String code) {
			this.code = code;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Integer getId() {
			return this.id;
		}

		public void setId(Integer id) {
			this.id = id;
		}

		public String getSource() {
			return this.source;
		}

		public void setSource(String source) {
			this.source = source;
		}

		public String getCategory() {
			return this.category;
		}

		public void setCategory(String category) {
			this.category = category;
		}

		public String getServiceModule() {
			return this.serviceModule;
		}

		public void setServiceModule(String serviceModule) {
			this.serviceModule = serviceModule;
		}

		public String getScene() {
			return this.scene;
		}

		public void setScene(String scene) {
			this.scene = scene;
		}

		public List<String> getBizTypes() {
			return this.bizTypes;
		}

		public void setBizTypes(List<String> bizTypes) {
			this.bizTypes = bizTypes;
		}
	}

	@Override
	public DescribeImageLibResponse getInstance(UnmarshallerContext context) {
		return	DescribeImageLibResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
