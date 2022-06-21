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
public class DeleteCustomImageRequest extends RpcAcsRequest<DeleteCustomImageResponse> {
	   

	private String systemSnapshotId;

	private String dataSnapshotId;

	private String imageId;

	private String site;
	public DeleteCustomImageRequest() {
		super("SWAS", "2017-08-10", "DeleteCustomImage", "SWAS");
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

	public String getImageId() {
		return this.imageId;
	}

	public void setImageId(String imageId) {
		this.imageId = imageId;
		if(imageId != null){
			putQueryParameter("ImageId", imageId);
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

	@Override
	public Class<DeleteCustomImageResponse> getResponseClass() {
		return DeleteCustomImageResponse.class;
	}

}
