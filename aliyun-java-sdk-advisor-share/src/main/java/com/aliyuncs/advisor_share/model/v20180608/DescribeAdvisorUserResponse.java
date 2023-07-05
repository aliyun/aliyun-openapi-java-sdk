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

package com.aliyuncs.advisor_share.model.v20180608;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.advisor_share.transform.v20180608.DescribeAdvisorUserResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeAdvisorUserResponse extends AcsResponse {

	private String requestId;

	private Data data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private Boolean showTam;

		private String adviceStatus;

		private Boolean authorized;

		private Boolean tamAuthorized;

		private Long aliyunId;

		private String productStatus;

		private String resourceStatus;

		private Boolean costAuthorized;

		public Boolean getShowTam() {
			return this.showTam;
		}

		public void setShowTam(Boolean showTam) {
			this.showTam = showTam;
		}

		public String getAdviceStatus() {
			return this.adviceStatus;
		}

		public void setAdviceStatus(String adviceStatus) {
			this.adviceStatus = adviceStatus;
		}

		public Boolean getAuthorized() {
			return this.authorized;
		}

		public void setAuthorized(Boolean authorized) {
			this.authorized = authorized;
		}

		public Boolean getTamAuthorized() {
			return this.tamAuthorized;
		}

		public void setTamAuthorized(Boolean tamAuthorized) {
			this.tamAuthorized = tamAuthorized;
		}

		public Long getAliyunId() {
			return this.aliyunId;
		}

		public void setAliyunId(Long aliyunId) {
			this.aliyunId = aliyunId;
		}

		public String getProductStatus() {
			return this.productStatus;
		}

		public void setProductStatus(String productStatus) {
			this.productStatus = productStatus;
		}

		public String getResourceStatus() {
			return this.resourceStatus;
		}

		public void setResourceStatus(String resourceStatus) {
			this.resourceStatus = resourceStatus;
		}

		public Boolean getCostAuthorized() {
			return this.costAuthorized;
		}

		public void setCostAuthorized(Boolean costAuthorized) {
			this.costAuthorized = costAuthorized;
		}
	}

	@Override
	public DescribeAdvisorUserResponse getInstance(UnmarshallerContext context) {
		return	DescribeAdvisorUserResponseUnmarshaller.unmarshall(this, context);
	}
}
