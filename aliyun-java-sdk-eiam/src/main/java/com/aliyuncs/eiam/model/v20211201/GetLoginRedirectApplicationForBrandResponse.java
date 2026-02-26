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

package com.aliyuncs.eiam.model.v20211201;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.eiam.transform.v20211201.GetLoginRedirectApplicationForBrandResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetLoginRedirectApplicationForBrandResponse extends AcsResponse {

	private String requestId;

	private BrandLoginRedirectApplication brandLoginRedirectApplication;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public BrandLoginRedirectApplication getBrandLoginRedirectApplication() {
		return this.brandLoginRedirectApplication;
	}

	public void setBrandLoginRedirectApplication(BrandLoginRedirectApplication brandLoginRedirectApplication) {
		this.brandLoginRedirectApplication = brandLoginRedirectApplication;
	}

	public static class BrandLoginRedirectApplication {

		private String instanceId;

		private String brandId;

		private String applicationId;

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public String getBrandId() {
			return this.brandId;
		}

		public void setBrandId(String brandId) {
			this.brandId = brandId;
		}

		public String getApplicationId() {
			return this.applicationId;
		}

		public void setApplicationId(String applicationId) {
			this.applicationId = applicationId;
		}
	}

	@Override
	public GetLoginRedirectApplicationForBrandResponse getInstance(UnmarshallerContext context) {
		return	GetLoginRedirectApplicationForBrandResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
