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

package com.aliyuncs.baas.model.v20181221;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class DescribeFabricPeerLogsRequest extends RpcAcsRequest<DescribeFabricPeerLogsResponse> {
	   

	private String peerName;

	private String lines;

	private String organizationId;
	public DescribeFabricPeerLogsRequest() {
		super("Baas", "2018-12-21", "DescribeFabricPeerLogs", "baas");
		setMethod(MethodType.PUT);
	}

	public String getPeerName() {
		return this.peerName;
	}

	public void setPeerName(String peerName) {
		this.peerName = peerName;
		if(peerName != null){
			putQueryParameter("PeerName", peerName);
		}
	}

	public String getLines() {
		return this.lines;
	}

	public void setLines(String lines) {
		this.lines = lines;
		if(lines != null){
			putQueryParameter("Lines", lines);
		}
	}

	public String getOrganizationId() {
		return this.organizationId;
	}

	public void setOrganizationId(String organizationId) {
		this.organizationId = organizationId;
		if(organizationId != null){
			putQueryParameter("OrganizationId", organizationId);
		}
	}

	@Override
	public Class<DescribeFabricPeerLogsResponse> getResponseClass() {
		return DescribeFabricPeerLogsResponse.class;
	}

}
