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

package com.aliyuncs.linkwan.model.v20181230;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.ProtocolType;

/**
 * @author auto create
 * @version 
 */
public class CountNodeTupleOrdersRequest extends RpcAcsRequest<CountNodeTupleOrdersResponse> {
	
	public CountNodeTupleOrdersRequest() {
		super("LinkWAN", "2018-12-30", "CountNodeTupleOrders", "linkwan");
		setProtocol(ProtocolType.HTTPS);
	}

	private Boolean isKpm;

	private List<String> statess;

	public Boolean getIsKpm() {
		return this.isKpm;
	}

	public void setIsKpm(Boolean isKpm) {
		this.isKpm = isKpm;
		if(isKpm != null){
			putBodyParameter("IsKpm", isKpm.toString());
		}
	}

	public List<String> getStatess() {
		return this.statess;
	}

	public void setStatess(List<String> statess) {
		this.statess = statess;	
		if (statess != null) {
			for (int i = 0; i < statess.size(); i++) {
				putBodyParameter("States." + (i + 1) , statess.get(i));
			}
		}	
	}

	@Override
	public Class<CountNodeTupleOrdersResponse> getResponseClass() {
		return CountNodeTupleOrdersResponse.class;
	}

}
