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
import java.util.List;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class DeleteAppOtaVersionsRequest extends RpcAcsRequest<DeleteAppOtaVersionsResponse> {
	   

	private List<String> versionUidLists;
	public DeleteAppOtaVersionsRequest() {
		super("wyota", "2021-04-20", "DeleteAppOtaVersions");
		setMethod(MethodType.POST);
	}

	public List<String> getVersionUidLists() {
		return this.versionUidLists;
	}

	public void setVersionUidLists(List<String> versionUidLists) {
		this.versionUidLists = versionUidLists;	
		if (versionUidLists != null) {
			for (int i = 0; i < versionUidLists.size(); i++) {
				putQueryParameter("VersionUidList." + (i + 1) , versionUidLists.get(i));
			}
		}	
	}

	@Override
	public Class<DeleteAppOtaVersionsResponse> getResponseClass() {
		return DeleteAppOtaVersionsResponse.class;
	}

}
