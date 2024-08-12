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
import com.aliyuncs.wyota.transform.v20210420.DescribeAppOtaVersionResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeAppOtaVersionResponse extends AcsResponse {

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

		private List<AppOtaInfoDTOListItem> appOtaInfoDTOList;

		public List<AppOtaInfoDTOListItem> getAppOtaInfoDTOList() {
			return this.appOtaInfoDTOList;
		}

		public void setAppOtaInfoDTOList(List<AppOtaInfoDTOListItem> appOtaInfoDTOList) {
			this.appOtaInfoDTOList = appOtaInfoDTOList;
		}

		public static class AppOtaInfoDTOListItem {

			private String versionUid;

			private String appVersion;

			private String downloadUrl;

			private String project;

			private String osType;

			private Integer status;

			private Long size;

			private String md5;

			private String releaseNote;

			private String releaseNoteEn;

			private String versionType;

			private Long versionCode;

			private String channel;

			private String sessionType;

			private String protocolType;

			private String fullDownloadUrl;

			private String gmtCreate;

			public String getVersionUid() {
				return this.versionUid;
			}

			public void setVersionUid(String versionUid) {
				this.versionUid = versionUid;
			}

			public String getAppVersion() {
				return this.appVersion;
			}

			public void setAppVersion(String appVersion) {
				this.appVersion = appVersion;
			}

			public String getDownloadUrl() {
				return this.downloadUrl;
			}

			public void setDownloadUrl(String downloadUrl) {
				this.downloadUrl = downloadUrl;
			}

			public String getProject() {
				return this.project;
			}

			public void setProject(String project) {
				this.project = project;
			}

			public String getOsType() {
				return this.osType;
			}

			public void setOsType(String osType) {
				this.osType = osType;
			}

			public Integer getStatus() {
				return this.status;
			}

			public void setStatus(Integer status) {
				this.status = status;
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

			public String getVersionType() {
				return this.versionType;
			}

			public void setVersionType(String versionType) {
				this.versionType = versionType;
			}

			public Long getVersionCode() {
				return this.versionCode;
			}

			public void setVersionCode(Long versionCode) {
				this.versionCode = versionCode;
			}

			public String getChannel() {
				return this.channel;
			}

			public void setChannel(String channel) {
				this.channel = channel;
			}

			public String getSessionType() {
				return this.sessionType;
			}

			public void setSessionType(String sessionType) {
				this.sessionType = sessionType;
			}

			public String getProtocolType() {
				return this.protocolType;
			}

			public void setProtocolType(String protocolType) {
				this.protocolType = protocolType;
			}

			public String getFullDownloadUrl() {
				return this.fullDownloadUrl;
			}

			public void setFullDownloadUrl(String fullDownloadUrl) {
				this.fullDownloadUrl = fullDownloadUrl;
			}

			public String getGmtCreate() {
				return this.gmtCreate;
			}

			public void setGmtCreate(String gmtCreate) {
				this.gmtCreate = gmtCreate;
			}
		}
	}

	@Override
	public DescribeAppOtaVersionResponse getInstance(UnmarshallerContext context) {
		return	DescribeAppOtaVersionResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
