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

/**
 * @author auto create
 * @version 
 */
public class ProfileHistoryRequest extends RpcAcsRequest<ProfileHistoryResponse> {
	
	public ProfileHistoryRequest() {
		super("cloudwf", "2017-03-28", "ProfileHistory", "cloudwf");
	}

	private Long idtype;

	private String endMonth;

	private String beginMonth;

	private Long agsid;

	public Long getIdtype() {
		return this.idtype;
	}

	public void setIdtype(Long idtype) {
		this.idtype = idtype;
		if(idtype != null){
			putQueryParameter("Idtype", idtype.toString());
		}
	}

	public String getEndMonth() {
		return this.endMonth;
	}

	public void setEndMonth(String endMonth) {
		this.endMonth = endMonth;
		if(endMonth != null){
			putQueryParameter("EndMonth", endMonth);
		}
	}

	public String getBeginMonth() {
		return this.beginMonth;
	}

	public void setBeginMonth(String beginMonth) {
		this.beginMonth = beginMonth;
		if(beginMonth != null){
			putQueryParameter("BeginMonth", beginMonth);
		}
	}

	public Long getAgsid() {
		return this.agsid;
	}

	public void setAgsid(Long agsid) {
		this.agsid = agsid;
		if(agsid != null){
			putQueryParameter("Agsid", agsid.toString());
		}
	}

	@Override
	public Class<ProfileHistoryResponse> getResponseClass() {
		return ProfileHistoryResponse.class;
	}

}
