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

package com.aliyuncs.reid_cloud.model.v20201029;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.reid_cloud.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DescribeCursorRequest extends RpcAcsRequest<DescribeCursorResponse> {
	   

	private Integer partitionIndex;

	private Long storeId;

	private String time;
	public DescribeCursorRequest() {
		super("reid_cloud", "2020-10-29", "DescribeCursor", "1.2.1");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Integer getPartitionIndex() {
		return this.partitionIndex;
	}

	public void setPartitionIndex(Integer partitionIndex) {
		this.partitionIndex = partitionIndex;
		if(partitionIndex != null){
			putBodyParameter("PartitionIndex", partitionIndex.toString());
		}
	}

	public Long getStoreId() {
		return this.storeId;
	}

	public void setStoreId(Long storeId) {
		this.storeId = storeId;
		if(storeId != null){
			putBodyParameter("StoreId", storeId.toString());
		}
	}

	public String getTime() {
		return this.time;
	}

	public void setTime(String time) {
		this.time = time;
		if(time != null){
			putBodyParameter("Time", time);
		}
	}

	@Override
	public Class<DescribeCursorResponse> getResponseClass() {
		return DescribeCursorResponse.class;
	}

}
