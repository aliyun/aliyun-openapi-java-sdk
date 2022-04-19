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

package com.aliyuncs.sas.model.v20181203;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.sas.transform.v20181203.DescribeInstallCodesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeInstallCodesResponse extends AcsResponse {

	private String requestId;

	private List<InstallCode> installCodes;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<InstallCode> getInstallCodes() {
		return this.installCodes;
	}

	public void setInstallCodes(List<InstallCode> installCodes) {
		this.installCodes = installCodes;
	}

	public static class InstallCode {

		private Boolean onlyImage;

		private String captchaCode;

		private Long groupId;

		private String groupName;

		private Long expiredDate;

		private String vendorName;

		private String os;

		private String tag;

		private Integer vendor;

		public Boolean getOnlyImage() {
			return this.onlyImage;
		}

		public void setOnlyImage(Boolean onlyImage) {
			this.onlyImage = onlyImage;
		}

		public String getCaptchaCode() {
			return this.captchaCode;
		}

		public void setCaptchaCode(String captchaCode) {
			this.captchaCode = captchaCode;
		}

		public Long getGroupId() {
			return this.groupId;
		}

		public void setGroupId(Long groupId) {
			this.groupId = groupId;
		}

		public String getGroupName() {
			return this.groupName;
		}

		public void setGroupName(String groupName) {
			this.groupName = groupName;
		}

		public Long getExpiredDate() {
			return this.expiredDate;
		}

		public void setExpiredDate(Long expiredDate) {
			this.expiredDate = expiredDate;
		}

		public String getVendorName() {
			return this.vendorName;
		}

		public void setVendorName(String vendorName) {
			this.vendorName = vendorName;
		}

		public String getOs() {
			return this.os;
		}

		public void setOs(String os) {
			this.os = os;
		}

		public String getTag() {
			return this.tag;
		}

		public void setTag(String tag) {
			this.tag = tag;
		}

		public Integer getVendor() {
			return this.vendor;
		}

		public void setVendor(Integer vendor) {
			this.vendor = vendor;
		}
	}

	@Override
	public DescribeInstallCodesResponse getInstance(UnmarshallerContext context) {
		return	DescribeInstallCodesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
