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

package com.aliyuncs.gpdb.model.v20160503;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.gpdb.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateDBInstanceIPArrayRequest extends RpcAcsRequest<CreateDBInstanceIPArrayResponse> {
	   

	private String iPArrayName;

	private String dBInstanceId;

	private List<String> securityIPList;

	private String iPArrayAttribute;
	public CreateDBInstanceIPArrayRequest() {
		super("gpdb", "2016-05-03", "CreateDBInstanceIPArray", "GPDB");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getIPArrayName() {
		return this.iPArrayName;
	}

	public void setIPArrayName(String iPArrayName) {
		this.iPArrayName = iPArrayName;
		if(iPArrayName != null){
			putQueryParameter("IPArrayName", iPArrayName);
		}
	}

	public String getDBInstanceId() {
		return this.dBInstanceId;
	}

	public void setDBInstanceId(String dBInstanceId) {
		this.dBInstanceId = dBInstanceId;
		if(dBInstanceId != null){
			putQueryParameter("DBInstanceId", dBInstanceId);
		}
	}

	public List<String> getSecurityIPList() {
		return this.securityIPList;
	}

	public void setSecurityIPList(List<String> securityIPList) {
		this.securityIPList = securityIPList;	
		if (securityIPList != null) {
			String securityIPListArrVal = "";
			for(int depth1 = 0; depth1 < securityIPList.size(); depth1++) {
				securityIPListArrVal += securityIPList.get(depth1) + ",";
			}
			if (securityIPListArrVal.length() > 0) {
				securityIPListArrVal = securityIPListArrVal.substring(0, securityIPListArrVal.length() - 1);
			}
			putQueryParameter("SecurityIPList" , securityIPListArrVal);
		}	
	}

	public String getIPArrayAttribute() {
		return this.iPArrayAttribute;
	}

	public void setIPArrayAttribute(String iPArrayAttribute) {
		this.iPArrayAttribute = iPArrayAttribute;
		if(iPArrayAttribute != null){
			putQueryParameter("IPArrayAttribute", iPArrayAttribute);
		}
	}

	@Override
	public Class<CreateDBInstanceIPArrayResponse> getResponseClass() {
		return CreateDBInstanceIPArrayResponse.class;
	}

}
