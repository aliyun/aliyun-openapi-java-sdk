/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.aliyuncs.ehpc.model.v20170714;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ehpc.transform.v20170714.ListCustomImagesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListCustomImagesResponse extends AcsResponse {

	private String requestId;

	private List<ImageInfo> images;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<ImageInfo> getImages() {
		return this.images;
	}

	public void setImages(List<ImageInfo> images) {
		this.images = images;
	}

	public static class ImageInfo {

		private String imageId;

		private String imageName;

		private String imageOwnerAlias;

		private String description;

		private BaseOsTag baseOsTag;

		public String getImageId() {
			return this.imageId;
		}

		public void setImageId(String imageId) {
			this.imageId = imageId;
		}

		public String getImageName() {
			return this.imageName;
		}

		public void setImageName(String imageName) {
			this.imageName = imageName;
		}

		public String getImageOwnerAlias() {
			return this.imageOwnerAlias;
		}

		public void setImageOwnerAlias(String imageOwnerAlias) {
			this.imageOwnerAlias = imageOwnerAlias;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public BaseOsTag getBaseOsTag() {
			return this.baseOsTag;
		}

		public void setBaseOsTag(BaseOsTag baseOsTag) {
			this.baseOsTag = baseOsTag;
		}

		public static class BaseOsTag {

			private String osTag;

			private String platform;

			private String version;

			private String architecture;

			public String getOsTag() {
				return this.osTag;
			}

			public void setOsTag(String osTag) {
				this.osTag = osTag;
			}

			public String getPlatform() {
				return this.platform;
			}

			public void setPlatform(String platform) {
				this.platform = platform;
			}

			public String getVersion() {
				return this.version;
			}

			public void setVersion(String version) {
				this.version = version;
			}

			public String getArchitecture() {
				return this.architecture;
			}

			public void setArchitecture(String architecture) {
				this.architecture = architecture;
			}
		}
	}

	@Override
	public ListCustomImagesResponse getInstance(UnmarshallerContext context) {
		return	ListCustomImagesResponseUnmarshaller.unmarshall(this, context);
	}
}
