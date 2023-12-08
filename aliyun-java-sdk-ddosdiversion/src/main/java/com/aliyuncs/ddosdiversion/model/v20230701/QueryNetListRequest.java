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

package com.aliyuncs.ddosdiversion.model.v20230701;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class QueryNetListRequest extends RpcAcsRequest<QueryNetListResponse> {
	   

	private Long num;

	private String mainNet;

	private String mode;

	private String net;

	private String saleId;

	private Long page;
	public QueryNetListRequest() {
		super("DdosDiversion", "2023-07-01", "QueryNetList");
		setMethod(MethodType.POST);
	}

	public Long getNum() {
		return this.num;
	}

	public void setNum(Long num) {
		this.num = num;
		if(num != null){
			putQueryParameter("Num", num.toString());
		}
	}

	public String getMainNet() {
		return this.mainNet;
	}

	public void setMainNet(String mainNet) {
		this.mainNet = mainNet;
		if(mainNet != null){
			putQueryParameter("MainNet", mainNet);
		}
	}

	public String getMode() {
		return this.mode;
	}

	public void setMode(String mode) {
		this.mode = mode;
		if(mode != null){
			putQueryParameter("Mode", mode);
		}
	}

	public String getNet() {
		return this.net;
	}

	public void setNet(String net) {
		this.net = net;
		if(net != null){
			putQueryParameter("Net", net);
		}
	}

	public String getSaleId() {
		return this.saleId;
	}

	public void setSaleId(String saleId) {
		this.saleId = saleId;
		if(saleId != null){
			putQueryParameter("SaleId", saleId);
		}
	}

	public Long getPage() {
		return this.page;
	}

	public void setPage(Long page) {
		this.page = page;
		if(page != null){
			putQueryParameter("Page", page.toString());
		}
	}

	@Override
	public Class<QueryNetListResponse> getResponseClass() {
		return QueryNetListResponse.class;
	}

}
