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
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class CopySDGRequest extends RpcAcsRequest<CopySDGResponse> {
	   

	@SerializedName("destinationRegionIds")
	private List<String> destinationRegionIds;

	private String sDGId;
	public CopySDGRequest() {
		super("Ens", "2017-11-10", "CopySDG", "ens");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.GET);
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

	public String getSDGId() {
		return this.sDGId;
	}

	public void setSDGId(String sDGId) {
		this.sDGId = sDGId;
		if(sDGId != null){
			putQueryParameter("SDGId", sDGId);
		}
	}

	@Override
	public Class<CopySDGResponse> getResponseClass() {
		return CopySDGResponse.class;
	}

}
