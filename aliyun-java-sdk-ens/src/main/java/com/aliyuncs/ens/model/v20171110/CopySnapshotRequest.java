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

package com.aliyuncs.ens.model.v20171110;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class CopySnapshotRequest extends RpcAcsRequest<CopySnapshotResponse> {
	   

	private String snapshotId;

	@SerializedName("destinationRegionIds")
	private List<String> destinationRegionIds;

	private String destinationSnapshotName;

	private String destinationSnapshotDescription;
	public CopySnapshotRequest() {
		super("Ens", "2017-11-10", "CopySnapshot", "ens");
		setMethod(MethodType.POST);
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

	public List<String> getDestinationRegionIds() {
		return this.destinationRegionIds;
	}

	public void setDestinationRegionIds(List<String> destinationRegionIds) {
		this.destinationRegionIds = destinationRegionIds;	
		if (destinationRegionIds != null) {
			putQueryParameter("DestinationRegionIds" , new Gson().toJson(destinationRegionIds));
		}	
	}

	public String getDestinationSnapshotName() {
		return this.destinationSnapshotName;
	}

	public void setDestinationSnapshotName(String destinationSnapshotName) {
		this.destinationSnapshotName = destinationSnapshotName;
		if(destinationSnapshotName != null){
			putQueryParameter("DestinationSnapshotName", destinationSnapshotName);
		}
	}

	public String getDestinationSnapshotDescription() {
		return this.destinationSnapshotDescription;
	}

	public void setDestinationSnapshotDescription(String destinationSnapshotDescription) {
		this.destinationSnapshotDescription = destinationSnapshotDescription;
		if(destinationSnapshotDescription != null){
			putQueryParameter("DestinationSnapshotDescription", destinationSnapshotDescription);
		}
	}

	@Override
	public Class<CopySnapshotResponse> getResponseClass() {
		return CopySnapshotResponse.class;
	}

}
