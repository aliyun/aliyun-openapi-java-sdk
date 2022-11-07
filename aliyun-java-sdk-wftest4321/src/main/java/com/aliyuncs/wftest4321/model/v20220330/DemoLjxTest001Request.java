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

package com.aliyuncs.wftest4321.model.v20220330;

import com.aliyuncs.RoaAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class DemoLjxTest001Request extends RoaAcsRequest<DemoLjxTest001Response> {
	   

	private String node;

	private String newparam1;

	private String chi;

	private String id;
	public DemoLjxTest001Request() {
		super("Wftest4321", "2022-03-30", "DemoLjxTest001");
		setUriPattern("/get/info/123");
		setMethod(MethodType.POST);
	}

	public String getNode() {
		return this.node;
	}

	public void setNode(String node) {
		this.node = node;
		if(node != null){
			putQueryParameter("Node", node);
		}
	}

	public String getNewparam1() {
		return this.newparam1;
	}

	public void setNewparam1(String newparam1) {
		this.newparam1 = newparam1;
		if(newparam1 != null){
			putQueryParameter("new-param-1", newparam1);
		}
	}

	public String getChi() {
		return this.chi;
	}

	public void setChi(String chi) {
		this.chi = chi;
		if(chi != null){
			putQueryParameter("Chi", chi);
		}
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
		if(id != null){
			putQueryParameter("Id", id);
		}
	}

	@Override
	public Class<DemoLjxTest001Response> getResponseClass() {
		return DemoLjxTest001Response.class;
	}

}
