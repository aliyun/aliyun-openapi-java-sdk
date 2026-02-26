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

import com.aliyuncs.AcsResponse;
import com.aliyuncs.wyota.transform.v20210420.GetDeviceOtaInfoTestResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetDeviceOtaInfoTestResponse extends AcsResponse {

	private String requestId;

	private String code;

	private String message;

	private Data data;

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

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private Version version;

		public Version getVersion() {
			return this.version;
		}

		public void setVersion(Version version) {
			this.version = version;
		}

		public static class Version {

			private String creator;

			private String downloadUrl;

			private String localDownloadUrl;

			private String version;

			private Integer forceUpgrade;

			private Long size;

			private String md5;

			private String model;

			private String versionType;

			private String releaseNote;

			private String versionCode;

			public String getCreator() {
				return this.creator;
			}

			public void setCreator(String creator) {
				this.creator = creator;
			}

			public String getDownloadUrl() {
				return this.downloadUrl;
			}

			public void setDownloadUrl(String downloadUrl) {
				this.downloadUrl = downloadUrl;
			}

			public String getLocalDownloadUrl() {
				return this.localDownloadUrl;
			}

			public void setLocalDownloadUrl(String localDownloadUrl) {
				this.localDownloadUrl = localDownloadUrl;
			}

			public String getVersion() {
				return this.version;
			}

			public void setVersion(String version) {
				this.version = version;
			}

			public Integer getForceUpgrade() {
				return this.forceUpgrade;
			}

			public void setForceUpgrade(Integer forceUpgrade) {
				this.forceUpgrade = forceUpgrade;
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

			public String getModel() {
				return this.model;
			}

			public void setModel(String model) {
				this.model = model;
			}

			public String getVersionType() {
				return this.versionType;
			}

			public void setVersionType(String versionType) {
				this.versionType = versionType;
			}

			public String getReleaseNote() {
				return this.releaseNote;
			}

			public void setReleaseNote(String releaseNote) {
				this.releaseNote = releaseNote;
			}

			public String getVersionCode() {
				return this.versionCode;
			}

			public void setVersionCode(String versionCode) {
				this.versionCode = versionCode;
			}
		}
	}

	@Override
	public GetDeviceOtaInfoTestResponse getInstance(UnmarshallerContext context) {
		return	GetDeviceOtaInfoTestResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
