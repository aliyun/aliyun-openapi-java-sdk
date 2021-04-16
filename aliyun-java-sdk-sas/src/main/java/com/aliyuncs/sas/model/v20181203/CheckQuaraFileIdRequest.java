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
import java.util.List;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class CheckQuaraFileIdRequest extends RpcAcsRequest<CheckQuaraFileIdResponse> {
	   

	private List<String> quaraFileIdss;

	private String uuid;
	public CheckQuaraFileIdRequest() {
		super("Sas", "2018-12-03", "CheckQuaraFileId", "sas");
		setMethod(MethodType.POST);
	}

	public List<String> getQuaraFileIdss() {
		return this.quaraFileIdss;
	}

	public void setQuaraFileIdss(List<String> quaraFileIdss) {
		this.quaraFileIdss = quaraFileIdss;	
		if (quaraFileIdss != null) {
			for (int i = 0; i < quaraFileIdss.size(); i++) {
				putQueryParameter("QuaraFileIds." + (i + 1) , quaraFileIdss.get(i));
			}
		}	
	}

	public String getUuid() {
		return this.uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
		if(uuid != null){
			putQueryParameter("Uuid", uuid);
		}
	}

	@Override
	public Class<CheckQuaraFileIdResponse> getResponseClass() {
		return CheckQuaraFileIdResponse.class;
	}

}
