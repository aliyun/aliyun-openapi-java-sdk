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

package com.aliyuncs.swas.model.v20170810;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.swas.transform.v20170810.GetUserImageRegistryInfoCachesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetUserImageRegistryInfoCachesResponse extends AcsResponse {

	private Boolean isSuccess;

	private String requestId;

	private String code;

	private List<ImageRegistryInfoCache> imageRegistryInfoCaches;

	public Boolean getIsSuccess() {
		return this.isSuccess;
	}

	public void setIsSuccess(Boolean isSuccess) {
		this.isSuccess = isSuccess;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public List<ImageRegistryInfoCache> getImageRegistryInfoCaches() {
		return this.imageRegistryInfoCaches;
	}

	public void setImageRegistryInfoCaches(List<ImageRegistryInfoCache> imageRegistryInfoCaches) {
		this.imageRegistryInfoCaches = imageRegistryInfoCaches;
	}

	public static class ImageRegistryInfoCache {

		private String cacheName;

		private String registry;

		public String getCacheName() {
			return this.cacheName;
		}

		public void setCacheName(String cacheName) {
			this.cacheName = cacheName;
		}

		public String getRegistry() {
			return this.registry;
		}

		public void setRegistry(String registry) {
			this.registry = registry;
		}
	}

	@Override
	public GetUserImageRegistryInfoCachesResponse getInstance(UnmarshallerContext context) {
		return	GetUserImageRegistryInfoCachesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
