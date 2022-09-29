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
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class GetDiagnoseResultForSingleCardRequest extends RpcAcsRequest<GetDiagnoseResultForSingleCardResponse> {
	   

	private String regionNo;

	private String diagnoseTaskId;
	public GetDiagnoseResultForSingleCardRequest() {
		super("CC5G", "2022-03-14", "GetDiagnoseResultForSingleCard", "fivegcc");
		setMethod(MethodType.POST);
	}

	public String getRegionNo() {
		return this.regionNo;
	}

	public void setRegionNo(String regionNo) {
		this.regionNo = regionNo;
		if(regionNo != null){
			putQueryParameter("RegionNo", regionNo);
		}
	}

	public String getDiagnoseTaskId() {
		return this.diagnoseTaskId;
	}

	public void setDiagnoseTaskId(String diagnoseTaskId) {
		this.diagnoseTaskId = diagnoseTaskId;
		if(diagnoseTaskId != null){
			putQueryParameter("DiagnoseTaskId", diagnoseTaskId);
		}
	}

	@Override
	public Class<GetDiagnoseResultForSingleCardResponse> getResponseClass() {
		return GetDiagnoseResultForSingleCardResponse.class;
	}

}
