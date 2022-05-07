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

package com.aliyuncs.amptest.model.v20201230;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class HuichengTestResponseArrayComplexRequest extends RpcAcsRequest<HuichengTestResponseArrayComplexResponse> {
	   

	private String home;
	public HuichengTestResponseArrayComplexRequest() {
		super("AmpTest", "2020-12-30", "HuichengTestResponseArrayComplex");
		setMethod(MethodType.POST);
	}

	public String getHome() {
		return this.home;
	}

	public void setHome(String home) {
		this.home = home;
		if(home != null){
			putQueryParameter("Home", home);
		}
	}

	@Override
	public Class<HuichengTestResponseArrayComplexResponse> getResponseClass() {
		return HuichengTestResponseArrayComplexResponse.class;
	}

}
