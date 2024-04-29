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

package com.aliyuncs.arms.model.v20190808;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.arms.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DeleteAppListRequest extends RpcAcsRequest<DeleteAppListResponse> {
	   

	private List<String> pidss;
	public DeleteAppListRequest() {
		super("ARMS", "2019-08-08", "DeleteAppList", "arms");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public List<String> getPidss() {
		return this.pidss;
	}

	public void setPidss(List<String> pidss) {
		this.pidss = pidss;	
		if (pidss != null) {
			for (int i = 0; i < pidss.size(); i++) {
				putQueryParameter("Pids." + (i + 1) , pidss.get(i));
			}
		}	
	}

	@Override
	public Class<DeleteAppListResponse> getResponseClass() {
		return DeleteAppListResponse.class;
	}

}
