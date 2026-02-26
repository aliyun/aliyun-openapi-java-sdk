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

package com.aliyuncs.cc5g.model.v20220314;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class ListCardUsagesRequest extends RpcAcsRequest<ListCardUsagesResponse> {
	   

	private List<String> iccids;

	private String wirelessCloudConnectorId;
	public ListCardUsagesRequest() {
		super("CC5G", "2022-03-14", "ListCardUsages", "fivegcc");
		setMethod(MethodType.GET);
	}

	public List<String> getIccids() {
		return this.iccids;
	}

	public void setIccids(List<String> iccids) {
		this.iccids = iccids;	
		if (iccids != null) {
			for (int depth1 = 0; depth1 < iccids.size(); depth1++) {
				putQueryParameter("Iccids." + (depth1 + 1) , iccids.get(depth1));
			}
		}	
	}

	public String getWirelessCloudConnectorId() {
		return this.wirelessCloudConnectorId;
	}

	public void setWirelessCloudConnectorId(String wirelessCloudConnectorId) {
		this.wirelessCloudConnectorId = wirelessCloudConnectorId;
		if(wirelessCloudConnectorId != null){
			putQueryParameter("WirelessCloudConnectorId", wirelessCloudConnectorId);
		}
	}

	@Override
	public Class<ListCardUsagesResponse> getResponseClass() {
		return ListCardUsagesResponse.class;
	}

}
