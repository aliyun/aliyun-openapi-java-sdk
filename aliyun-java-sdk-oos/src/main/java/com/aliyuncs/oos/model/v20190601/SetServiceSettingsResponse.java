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

package com.aliyuncs.oos.model.v20190601;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.oos.transform.v20190601.SetServiceSettingsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class SetServiceSettingsResponse extends AcsResponse {

	private String requestId;

	private List<ServiceSetting> serviceSettings;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<ServiceSetting> getServiceSettings() {
		return this.serviceSettings;
	}

	public void setServiceSettings(List<ServiceSetting> serviceSettings) {
		this.serviceSettings = serviceSettings;
	}

	public static class ServiceSetting {

		private Boolean deliveryOssEnabled;

		private String deliveryOssBucketName;

		private String deliveryOssKeyPrefix;

		private Boolean deliverySlsEnabled;

		private String deliverySlsProjectName;

		public Boolean getDeliveryOssEnabled() {
			return this.deliveryOssEnabled;
		}

		public void setDeliveryOssEnabled(Boolean deliveryOssEnabled) {
			this.deliveryOssEnabled = deliveryOssEnabled;
		}

		public String getDeliveryOssBucketName() {
			return this.deliveryOssBucketName;
		}

		public void setDeliveryOssBucketName(String deliveryOssBucketName) {
			this.deliveryOssBucketName = deliveryOssBucketName;
		}

		public String getDeliveryOssKeyPrefix() {
			return this.deliveryOssKeyPrefix;
		}

		public void setDeliveryOssKeyPrefix(String deliveryOssKeyPrefix) {
			this.deliveryOssKeyPrefix = deliveryOssKeyPrefix;
		}

		public Boolean getDeliverySlsEnabled() {
			return this.deliverySlsEnabled;
		}

		public void setDeliverySlsEnabled(Boolean deliverySlsEnabled) {
			this.deliverySlsEnabled = deliverySlsEnabled;
		}

		public String getDeliverySlsProjectName() {
			return this.deliverySlsProjectName;
		}

		public void setDeliverySlsProjectName(String deliverySlsProjectName) {
			this.deliverySlsProjectName = deliverySlsProjectName;
		}
	}

	@Override
	public SetServiceSettingsResponse getInstance(UnmarshallerContext context) {
		return	SetServiceSettingsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
