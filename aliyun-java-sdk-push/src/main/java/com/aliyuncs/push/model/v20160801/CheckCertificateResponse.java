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

package com.aliyuncs.push.model.v20160801;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.push.transform.v20160801.CheckCertificateResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class CheckCertificateResponse extends AcsResponse {

	private String requestId;

	private Boolean android;

	private Boolean iOS;

	private ProductionCertInfo productionCertInfo;

	private DevelopmentCertInfo developmentCertInfo;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Boolean getAndroid() {
		return this.android;
	}

	public void setAndroid(Boolean android) {
		this.android = android;
	}

	public Boolean getIOS() {
		return this.iOS;
	}

	public void setIOS(Boolean iOS) {
		this.iOS = iOS;
	}

	public ProductionCertInfo getProductionCertInfo() {
		return this.productionCertInfo;
	}

	public void setProductionCertInfo(ProductionCertInfo productionCertInfo) {
		this.productionCertInfo = productionCertInfo;
	}

	public DevelopmentCertInfo getDevelopmentCertInfo() {
		return this.developmentCertInfo;
	}

	public void setDevelopmentCertInfo(DevelopmentCertInfo developmentCertInfo) {
		this.developmentCertInfo = developmentCertInfo;
	}

	public static class ProductionCertInfo {

		private Long exipreTime;

		private String status;

		public Long getExipreTime() {
			return this.exipreTime;
		}

		public void setExipreTime(Long exipreTime) {
			this.exipreTime = exipreTime;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}
	}

	public static class DevelopmentCertInfo {

		private Long exipreTime;

		private String status;

		public Long getExipreTime() {
			return this.exipreTime;
		}

		public void setExipreTime(Long exipreTime) {
			this.exipreTime = exipreTime;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}
	}

	@Override
	public CheckCertificateResponse getInstance(UnmarshallerContext context) {
		return	CheckCertificateResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
