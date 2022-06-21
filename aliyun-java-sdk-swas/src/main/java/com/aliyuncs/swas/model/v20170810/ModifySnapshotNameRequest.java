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
public class ModifySnapshotNameRequest extends RpcAcsRequest<ModifySnapshotNameResponse> {
	   

	private String site;

	private String serverUid;

	private String name;

	private String snapshotUid;
	public ModifySnapshotNameRequest() {
		super("SWAS", "2017-08-10", "ModifySnapshotName", "SWAS");
		setMethod(MethodType.POST);
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

	public String getServerUid() {
		return this.serverUid;
	}

	public void setServerUid(String serverUid) {
		this.serverUid = serverUid;
		if(serverUid != null){
			putQueryParameter("ServerUid", serverUid);
		}
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
		if(name != null){
			putQueryParameter("Name", name);
		}
	}

	public String getSnapshotUid() {
		return this.snapshotUid;
	}

	public void setSnapshotUid(String snapshotUid) {
		this.snapshotUid = snapshotUid;
		if(snapshotUid != null){
			putQueryParameter("SnapshotUid", snapshotUid);
		}
	}

	@Override
	public Class<ModifySnapshotNameResponse> getResponseClass() {
		return ModifySnapshotNameResponse.class;
	}

}
