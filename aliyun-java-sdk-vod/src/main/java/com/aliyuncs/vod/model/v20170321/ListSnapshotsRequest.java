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

package com.aliyuncs.vod.model.v20170321;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.vod.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ListSnapshotsRequest extends RpcAcsRequest<ListSnapshotsResponse> {
	   

	private String pageSize;

	private String authTimeout;

	private String videoId;

	private String snapshotType;

	private String pageNo;
	public ListSnapshotsRequest() {
		super("vod", "2017-03-21", "ListSnapshots", "vod");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(String pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putQueryParameter("PageSize", pageSize);
		}
	}

	public String getAuthTimeout() {
		return this.authTimeout;
	}

	public void setAuthTimeout(String authTimeout) {
		this.authTimeout = authTimeout;
		if(authTimeout != null){
			putQueryParameter("AuthTimeout", authTimeout);
		}
	}

	public String getVideoId() {
		return this.videoId;
	}

	public void setVideoId(String videoId) {
		this.videoId = videoId;
		if(videoId != null){
			putQueryParameter("VideoId", videoId);
		}
	}

	public String getSnapshotType() {
		return this.snapshotType;
	}

	public void setSnapshotType(String snapshotType) {
		this.snapshotType = snapshotType;
		if(snapshotType != null){
			putQueryParameter("SnapshotType", snapshotType);
		}
	}

	public String getPageNo() {
		return this.pageNo;
	}

	public void setPageNo(String pageNo) {
		this.pageNo = pageNo;
		if(pageNo != null){
			putQueryParameter("PageNo", pageNo);
		}
	}

	@Override
	public Class<ListSnapshotsResponse> getResponseClass() {
		return ListSnapshotsResponse.class;
	}

}
