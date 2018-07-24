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

package com.aliyuncs.dypnsapi.model.v20170525;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.dypnsapi.transform.v20170525.GatewayVerifyInitializationResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GatewayVerifyInitializationResponse extends AcsResponse {

	private String requestId;

	private String code;

	private String message;

	private List<VendorConfigDTO> vendorConfigDTOs;

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

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public List<VendorConfigDTO> getVendorConfigDTOs() {
		return this.vendorConfigDTOs;
	}

	public void setVendorConfigDTOs(List<VendorConfigDTO> vendorConfigDTOs) {
		this.vendorConfigDTOs = vendorConfigDTOs;
	}

	public static class VendorConfigDTO {

		private String vendorKey;

		private String vendorAccessId;

		private String vendorAccessSecret;

		public String getVendorKey() {
			return this.vendorKey;
		}

		public void setVendorKey(String vendorKey) {
			this.vendorKey = vendorKey;
		}

		public String getVendorAccessId() {
			return this.vendorAccessId;
		}

		public void setVendorAccessId(String vendorAccessId) {
			this.vendorAccessId = vendorAccessId;
		}

		public String getVendorAccessSecret() {
			return this.vendorAccessSecret;
		}

		public void setVendorAccessSecret(String vendorAccessSecret) {
			this.vendorAccessSecret = vendorAccessSecret;
		}
	}

	@Override
	public GatewayVerifyInitializationResponse getInstance(UnmarshallerContext context) {
		return	GatewayVerifyInitializationResponseUnmarshaller.unmarshall(this, context);
	}
}
