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

package com.aliyuncs.linkwan.model.v20190301;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.linkwan.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class SubmitExternalNodeTuplesImportingTaskRequest extends RpcAcsRequest<SubmitExternalNodeTuplesImportingTaskResponse> {
	   

	private List<NodeTuples> nodeTupless;
	public SubmitExternalNodeTuplesImportingTaskRequest() {
		super("LinkWAN", "2019-03-01", "SubmitExternalNodeTuplesImportingTask", "linkwan");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public List<NodeTuples> getNodeTupless() {
		return this.nodeTupless;
	}

	public void setNodeTupless(List<NodeTuples> nodeTupless) {
		this.nodeTupless = nodeTupless;	
		if (nodeTupless != null) {
			for (int depth1 = 0; depth1 < nodeTupless.size(); depth1++) {
				putQueryParameter("NodeTuples." + (depth1 + 1) + ".AppSKey" , nodeTupless.get(depth1).getAppSKey());
				putQueryParameter("NodeTuples." + (depth1 + 1) + ".NwkSKey" , nodeTupless.get(depth1).getNwkSKey());
				putQueryParameter("NodeTuples." + (depth1 + 1) + ".LoraVer" , nodeTupless.get(depth1).getLoraVer());
				putQueryParameter("NodeTuples." + (depth1 + 1) + ".DevEui" , nodeTupless.get(depth1).getDevEui());
			}
		}	
	}

	public static class NodeTuples {

		private String appSKey;

		private String nwkSKey;

		private String loraVer;

		private String devEui;

		public String getAppSKey() {
			return this.appSKey;
		}

		public void setAppSKey(String appSKey) {
			this.appSKey = appSKey;
		}

		public String getNwkSKey() {
			return this.nwkSKey;
		}

		public void setNwkSKey(String nwkSKey) {
			this.nwkSKey = nwkSKey;
		}

		public String getLoraVer() {
			return this.loraVer;
		}

		public void setLoraVer(String loraVer) {
			this.loraVer = loraVer;
		}

		public String getDevEui() {
			return this.devEui;
		}

		public void setDevEui(String devEui) {
			this.devEui = devEui;
		}
	}

	@Override
	public Class<SubmitExternalNodeTuplesImportingTaskResponse> getResponseClass() {
		return SubmitExternalNodeTuplesImportingTaskResponse.class;
	}

}
