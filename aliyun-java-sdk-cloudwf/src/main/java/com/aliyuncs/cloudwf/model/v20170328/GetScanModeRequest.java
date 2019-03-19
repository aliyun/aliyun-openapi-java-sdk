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

package com.aliyuncs.cloudwf.model.v20170328;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;

/**
 * @author auto create
 * @version 
 */
public class GetScanModeRequest extends RpcAcsRequest<GetScanModeResponse> {
	
	public GetScanModeRequest() {
		super("cloudwf", "2017-03-28", "GetScanMode", "cloudwf");
	}

	private List<String> macLists;

	public List<String> getMacLists() {
		return this.macLists;
	}

	public void setMacLists(List<String> macLists) {
		this.macLists = macLists;	
		if (macLists != null) {
			for (int i = 0; i < macLists.size(); i++) {
				putQueryParameter("MacList." + (i + 1) , macLists.get(i));
			}
		}	
	}

	@Override
	public Class<GetScanModeResponse> getResponseClass() {
		return GetScanModeResponse.class;
	}

}
