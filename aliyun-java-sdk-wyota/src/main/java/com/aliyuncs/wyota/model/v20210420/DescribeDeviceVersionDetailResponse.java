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

package com.aliyuncs.wyota.model.v20210420;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.wyota.transform.v20210420.DescribeDeviceVersionDetailResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDeviceVersionDetailResponse extends AcsResponse {

	private String requestId;

	private String code;

	private String message;

	private List<DeviceOtaVersionDTO> data;

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

	public List<DeviceOtaVersionDTO> getData() {
		return this.data;
	}

	public void setData(List<DeviceOtaVersionDTO> data) {
		this.data = data;
	}

	public static class DeviceOtaVersionDTO {

		private String version;

		private String downloadUrl;

		private String versionType;

		private String versionCode;

		private Long size;

		private String md5;

		private String releaseNote;

		private String releaseNoteEn;

		private String model;

		private String creator;

		private Integer clientType;

		private String channel;

		private String cnImageDownloadUrl;

		private String enImageDownloadUrl;

		private String multiCnImageDownloadUrl;

		private String multiEnImageDownloadUrl;

		private String androidHorizontalMultiCnImageDownloadUrl;

		private String androidHorizontalMultiEnImageDownloadUrl;

		private String androidVerticalMultiCnImageDownloadUrl;

		private String androidVerticalMultiEnImageDownloadUrl;

		public String getVersion() {
			return this.version;
		}

		public void setVersion(String version) {
			this.version = version;
		}

		public String getDownloadUrl() {
			return this.downloadUrl;
		}

		public void setDownloadUrl(String downloadUrl) {
			this.downloadUrl = downloadUrl;
		}

		public String getVersionType() {
			return this.versionType;
		}

		public void setVersionType(String versionType) {
			this.versionType = versionType;
		}

		public String getVersionCode() {
			return this.versionCode;
		}

		public void setVersionCode(String versionCode) {
			this.versionCode = versionCode;
		}

		public Long getSize() {
			return this.size;
		}

		public void setSize(Long size) {
			this.size = size;
		}

		public String getMd5() {
			return this.md5;
		}

		public void setMd5(String md5) {
			this.md5 = md5;
		}

		public String getReleaseNote() {
			return this.releaseNote;
		}

		public void setReleaseNote(String releaseNote) {
			this.releaseNote = releaseNote;
		}

		public String getReleaseNoteEn() {
			return this.releaseNoteEn;
		}

		public void setReleaseNoteEn(String releaseNoteEn) {
			this.releaseNoteEn = releaseNoteEn;
		}

		public String getModel() {
			return this.model;
		}

		public void setModel(String model) {
			this.model = model;
		}

		public String getCreator() {
			return this.creator;
		}

		public void setCreator(String creator) {
			this.creator = creator;
		}

		public Integer getClientType() {
			return this.clientType;
		}

		public void setClientType(Integer clientType) {
			this.clientType = clientType;
		}

		public String getChannel() {
			return this.channel;
		}

		public void setChannel(String channel) {
			this.channel = channel;
		}

		public String getCnImageDownloadUrl() {
			return this.cnImageDownloadUrl;
		}

		public void setCnImageDownloadUrl(String cnImageDownloadUrl) {
			this.cnImageDownloadUrl = cnImageDownloadUrl;
		}

		public String getEnImageDownloadUrl() {
			return this.enImageDownloadUrl;
		}

		public void setEnImageDownloadUrl(String enImageDownloadUrl) {
			this.enImageDownloadUrl = enImageDownloadUrl;
		}

		public String getMultiCnImageDownloadUrl() {
			return this.multiCnImageDownloadUrl;
		}

		public void setMultiCnImageDownloadUrl(String multiCnImageDownloadUrl) {
			this.multiCnImageDownloadUrl = multiCnImageDownloadUrl;
		}

		public String getMultiEnImageDownloadUrl() {
			return this.multiEnImageDownloadUrl;
		}

		public void setMultiEnImageDownloadUrl(String multiEnImageDownloadUrl) {
			this.multiEnImageDownloadUrl = multiEnImageDownloadUrl;
		}

		public String getAndroidHorizontalMultiCnImageDownloadUrl() {
			return this.androidHorizontalMultiCnImageDownloadUrl;
		}

		public void setAndroidHorizontalMultiCnImageDownloadUrl(String androidHorizontalMultiCnImageDownloadUrl) {
			this.androidHorizontalMultiCnImageDownloadUrl = androidHorizontalMultiCnImageDownloadUrl;
		}

		public String getAndroidHorizontalMultiEnImageDownloadUrl() {
			return this.androidHorizontalMultiEnImageDownloadUrl;
		}

		public void setAndroidHorizontalMultiEnImageDownloadUrl(String androidHorizontalMultiEnImageDownloadUrl) {
			this.androidHorizontalMultiEnImageDownloadUrl = androidHorizontalMultiEnImageDownloadUrl;
		}

		public String getAndroidVerticalMultiCnImageDownloadUrl() {
			return this.androidVerticalMultiCnImageDownloadUrl;
		}

		public void setAndroidVerticalMultiCnImageDownloadUrl(String androidVerticalMultiCnImageDownloadUrl) {
			this.androidVerticalMultiCnImageDownloadUrl = androidVerticalMultiCnImageDownloadUrl;
		}

		public String getAndroidVerticalMultiEnImageDownloadUrl() {
			return this.androidVerticalMultiEnImageDownloadUrl;
		}

		public void setAndroidVerticalMultiEnImageDownloadUrl(String androidVerticalMultiEnImageDownloadUrl) {
			this.androidVerticalMultiEnImageDownloadUrl = androidVerticalMultiEnImageDownloadUrl;
		}
	}

	@Override
	public DescribeDeviceVersionDetailResponse getInstance(UnmarshallerContext context) {
		return	DescribeDeviceVersionDetailResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
