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
public class CreateClusterSpecialRequest extends RoaAcsRequest<CreateClusterSpecialResponse> {
	   

	private String ytoken;

	private String xtoken;

	private String filter1;

	private Long pid;

	private Boolean filter2;

	private String cid;
	public CreateClusterSpecialRequest() {
		super("amp", "2020-07-08", "CreateClusterSpecial", "jeepproduct001");
		setUriPattern("/clusters/[Cid]/[Pid]/[aaa]/sdasd/[nnn]");
		setMethod(MethodType.POST);
	}

	public String getYtoken() {
		return this.ytoken;
	}

	public void setYtoken(String ytoken) {
		this.ytoken = ytoken;
		if(ytoken != null){
			putHeaderParameter("Y-token", ytoken);
		}
	}

	public String getXtoken() {
		return this.xtoken;
	}

	public void setXtoken(String xtoken) {
		this.xtoken = xtoken;
		if(xtoken != null){
			putHeaderParameter("X-token", xtoken);
		}
	}

	public String getFilter1() {
		return this.filter1;
	}

	public void setFilter1(String filter1) {
		this.filter1 = filter1;
		if(filter1 != null){
			putQueryParameter("Filter1", filter1);
		}
	}

	public Long getPid() {
		return this.pid;
	}

	public void setPid(Long pid) {
		this.pid = pid;
		if(pid != null){
			putPathParameter("Pid", pid.toString());
		}
	}

	public Boolean getFilter2() {
		return this.filter2;
	}

	public void setFilter2(Boolean filter2) {
		this.filter2 = filter2;
		if(filter2 != null){
			putQueryParameter("Filter2", filter2.toString());
		}
	}

	public String getCid() {
		return this.cid;
	}

	public void setCid(String cid) {
		this.cid = cid;
		if(cid != null){
			putPathParameter("Cid", cid);
		}
	}

	@Override
	public Class<CreateClusterSpecialResponse> getResponseClass() {
		return CreateClusterSpecialResponse.class;
	}

}
