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

package com.aliyuncs.cspro.model.v20180315;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class QueryPunishOrderListRequest extends RpcAcsRequest<QueryPunishOrderListResponse> {
	   

	private String punishOrderListRequest;
	public QueryPunishOrderListRequest() {
		super("cspro", "2018-03-15", "QueryPunishOrderList", "cspro");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.GET);
	}

	public String getPunishOrderListRequest() {
		return this.punishOrderListRequest;
	}

	public void setPunishOrderListRequest(String punishOrderListRequest) {
		this.punishOrderListRequest = punishOrderListRequest;
		if(punishOrderListRequest != null){
			putBodyParameter("PunishOrderListRequest", punishOrderListRequest);
		}
	}

	@Override
	public Class<QueryPunishOrderListResponse> getResponseClass() {
		return QueryPunishOrderListResponse.class;
	}

}
