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

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class CreateAppOtaVersionRequest extends RpcAcsRequest<CreateAppOtaVersionResponse> {
	   

	private Integer clientType;

	private String snapshotId;

	private Integer otaType;

	private String snapshotRegionId;

	private String channel;

	private String project;

	private String creator;

	private String os;

	private String downloadUrl;

	private String releaseNoteJp;

	private String appVersion;

	private String osType;

	private String versionType;

	private Long size;

	private String releaseNoteEn;

	private String releaseNote;

	private String arch;

	private Integer status;

	private String md5;
	public CreateAppOtaVersionRequest() {
		super("wyota", "2021-04-20", "CreateAppOtaVersion");
		setMethod(MethodType.POST);
	}

	public Integer getClientType() {
		return this.clientType;
	}

	public void setClientType(Integer clientType) {
		this.clientType = clientType;
		if(clientType != null){
			putQueryParameter("ClientType", clientType.toString());
		}
	}

	public String getSnapshotId() {
		return this.snapshotId;
	}

	public void setSnapshotId(String snapshotId) {
		this.snapshotId = snapshotId;
		if(snapshotId != null){
			putQueryParameter("SnapshotId", snapshotId);
		}
	}

	public Integer getOtaType() {
		return this.otaType;
	}

	public void setOtaType(Integer otaType) {
		this.otaType = otaType;
		if(otaType != null){
			putQueryParameter("OtaType", otaType.toString());
		}
	}

	public String getSnapshotRegionId() {
		return this.snapshotRegionId;
	}

	public void setSnapshotRegionId(String snapshotRegionId) {
		this.snapshotRegionId = snapshotRegionId;
		if(snapshotRegionId != null){
			putQueryParameter("SnapshotRegionId", snapshotRegionId);
		}
	}

	public String getChannel() {
		return this.channel;
	}

	public void setChannel(String channel) {
		this.channel = channel;
		if(channel != null){
			putQueryParameter("Channel", channel);
		}
	}

	public String getProject() {
		return this.project;
	}

	public void setProject(String project) {
		this.project = project;
		if(project != null){
			putQueryParameter("Project", project);
		}
	}

	public String getCreator() {
		return this.creator;
	}

	public void setCreator(String creator) {
		this.creator = creator;
		if(creator != null){
			putQueryParameter("Creator", creator);
		}
	}

	public String getOs() {
		return this.os;
	}

	public void setOs(String os) {
		this.os = os;
		if(os != null){
			putQueryParameter("Os", os);
		}
	}

	public String getDownloadUrl() {
		return this.downloadUrl;
	}

	public void setDownloadUrl(String downloadUrl) {
		this.downloadUrl = downloadUrl;
		if(downloadUrl != null){
			putQueryParameter("DownloadUrl", downloadUrl);
		}
	}

	public String getReleaseNoteJp() {
		return this.releaseNoteJp;
	}

	public void setReleaseNoteJp(String releaseNoteJp) {
		this.releaseNoteJp = releaseNoteJp;
		if(releaseNoteJp != null){
			putQueryParameter("ReleaseNoteJp", releaseNoteJp);
		}
	}

	public String getAppVersion() {
		return this.appVersion;
	}

	public void setAppVersion(String appVersion) {
		this.appVersion = appVersion;
		if(appVersion != null){
			putQueryParameter("AppVersion", appVersion);
		}
	}

	public String getOsType() {
		return this.osType;
	}

	public void setOsType(String osType) {
		this.osType = osType;
		if(osType != null){
			putQueryParameter("OsType", osType);
		}
	}

	public String getVersionType() {
		return this.versionType;
	}

	public void setVersionType(String versionType) {
		this.versionType = versionType;
		if(versionType != null){
			putQueryParameter("VersionType", versionType);
		}
	}

	public Long getSize() {
		return this.size;
	}

	public void setSize(Long size) {
		this.size = size;
		if(size != null){
			putQueryParameter("Size", size.toString());
		}
	}

	public String getReleaseNoteEn() {
		return this.releaseNoteEn;
	}

	public void setReleaseNoteEn(String releaseNoteEn) {
		this.releaseNoteEn = releaseNoteEn;
		if(releaseNoteEn != null){
			putQueryParameter("ReleaseNoteEn", releaseNoteEn);
		}
	}

	public String getReleaseNote() {
		return this.releaseNote;
	}

	public void setReleaseNote(String releaseNote) {
		this.releaseNote = releaseNote;
		if(releaseNote != null){
			putQueryParameter("ReleaseNote", releaseNote);
		}
	}

	public String getArch() {
		return this.arch;
	}

	public void setArch(String arch) {
		this.arch = arch;
		if(arch != null){
			putQueryParameter("Arch", arch);
		}
	}

	public Integer getStatus() {
		return this.status;
	}

	public void setStatus(Integer status) {
		this.status = status;
		if(status != null){
			putQueryParameter("Status", status.toString());
		}
	}

	public String getMd5() {
		return this.md5;
	}

	public void setMd5(String md5) {
		this.md5 = md5;
		if(md5 != null){
			putQueryParameter("Md5", md5);
		}
	}

	@Override
	public Class<CreateAppOtaVersionResponse> getResponseClass() {
		return CreateAppOtaVersionResponse.class;
	}

}
