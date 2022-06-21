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

package com.aliyuncs.swas.model.v20170810;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class InnerListCustomImagesRequest extends RpcAcsRequest<InnerListCustomImagesResponse> {
	   

	private String systemSnapshotId;

	private String dataSnapshotId;

	private String snapshotName;

	private Long userId;

	private Long pageNumber;

	private String imageName;

	private String serverUid;

	private Long pageSize;

	private String site;

	private Boolean showAll;
	public InnerListCustomImagesRequest() {
		super("SWAS", "2017-08-10", "InnerListCustomImages", "SWAS");
		setMethod(MethodType.POST);
	}

	public String getSystemSnapshotId() {
		return this.systemSnapshotId;
	}

	public void setSystemSnapshotId(String systemSnapshotId) {
		this.systemSnapshotId = systemSnapshotId;
		if(systemSnapshotId != null){
			putQueryParameter("SystemSnapshotId", systemSnapshotId);
		}
	}

	public String getDataSnapshotId() {
		return this.dataSnapshotId;
	}

	public void setDataSnapshotId(String dataSnapshotId) {
		this.dataSnapshotId = dataSnapshotId;
		if(dataSnapshotId != null){
			putQueryParameter("DataSnapshotId", dataSnapshotId);
		}
	}

	public String getSnapshotName() {
		return this.snapshotName;
	}

	public void setSnapshotName(String snapshotName) {
		this.snapshotName = snapshotName;
		if(snapshotName != null){
			putQueryParameter("SnapshotName", snapshotName);
		}
	}

	public Long getUserId() {
		return this.userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
		if(userId != null){
			putQueryParameter("UserId", userId.toString());
		}
	}

	public Long getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Long pageNumber) {
		this.pageNumber = pageNumber;
		if(pageNumber != null){
			putQueryParameter("PageNumber", pageNumber.toString());
		}
	}

	public String getImageName() {
		return this.imageName;
	}

	public void setImageName(String imageName) {
		this.imageName = imageName;
		if(imageName != null){
			putQueryParameter("ImageName", imageName);
		}
	}

	public String getServerUid() {
		return this.serverUid;
	}

	public void setServerUid(String serverUid) {
		this.serverUid = serverUid;
		if(serverUid != null){
			putQueryParameter("ServerUid", serverUid);
		}
	}

	public Long getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putQueryParameter("PageSize", pageSize.toString());
		}
	}

	public String getSite() {
		return this.site;
	}

	public void setSite(String site) {
		this.site = site;
		if(site != null){
			putQueryParameter("Site", site);
		}
	}

	public Boolean getShowAll() {
		return this.showAll;
	}

	public void setShowAll(Boolean showAll) {
		this.showAll = showAll;
		if(showAll != null){
			putQueryParameter("ShowAll", showAll.toString());
		}
	}

	@Override
	public Class<InnerListCustomImagesResponse> getResponseClass() {
		return InnerListCustomImagesResponse.class;
	}

}
