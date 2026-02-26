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

package com.aliyuncs.sas.model.v20181203;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.sas.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class SetRegistryScanDayNumRequest extends RpcAcsRequest<SetRegistryScanDayNumResponse> {
	   

	private Integer scanDayNum;
	public SetRegistryScanDayNumRequest() {
		super("Sas", "2018-12-03", "SetRegistryScanDayNum");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Integer getScanDayNum() {
		return this.scanDayNum;
	}

	public void setScanDayNum(Integer scanDayNum) {
		this.scanDayNum = scanDayNum;
		if(scanDayNum != null){
			putQueryParameter("ScanDayNum", scanDayNum.toString());
		}
	}

	@Override
	public Class<SetRegistryScanDayNumResponse> getResponseClass() {
		return SetRegistryScanDayNumResponse.class;
	}

}
