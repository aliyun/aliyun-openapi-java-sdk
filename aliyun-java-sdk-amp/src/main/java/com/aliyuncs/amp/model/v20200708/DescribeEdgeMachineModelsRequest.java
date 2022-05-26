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

package com.aliyuncs.amp.model.v20200708;

import com.aliyuncs.RoaAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class DescribeEdgeMachineModelsRequest extends RoaAcsRequest<DescribeEdgeMachineModelsResponse> {
	   

	private String rRFEW;
	public DescribeEdgeMachineModelsRequest() {
		super("amp", "2020-07-08", "DescribeEdgeMachineModels", "jeepproduct001");
		setUriPattern("/edge_machines/models");
		setMethod(MethodType.GET);
	}

	public String getRRFEW() {
		return this.rRFEW;
	}

	public void setRRFEW(String rRFEW) {
		this.rRFEW = rRFEW;
		if(rRFEW != null){
			putQueryParameter("RRFEW", rRFEW);
		}
	}

	@Override
	public Class<DescribeEdgeMachineModelsResponse> getResponseClass() {
		return DescribeEdgeMachineModelsResponse.class;
	}

}
