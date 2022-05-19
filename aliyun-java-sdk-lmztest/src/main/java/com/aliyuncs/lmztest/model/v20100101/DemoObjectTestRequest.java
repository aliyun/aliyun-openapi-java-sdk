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

package com.aliyuncs.lmztest.model.v20100101;

import com.aliyuncs.RoaAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class DemoObjectTestRequest extends RoaAcsRequest<DemoObjectTestResponse> {
	   

	private String myMap;

	private Boolean isvalid;

	private String id;

	private String infos;
	public DemoObjectTestRequest() {
		super("LmzTest", "2010-01-01", "DemoObjectTest");
		setUriPattern("/test/v2/demo14");
		setMethod(MethodType.POST);
	}

	public String getMyMap() {
		return this.myMap;
	}

	public void setMyMap(String myMap) {
		this.myMap = myMap;
		if(myMap != null){
			putQueryParameter("myMap", myMap);
		}
	}

	public Boolean getIsvalid() {
		return this.isvalid;
	}

	public void setIsvalid(Boolean isvalid) {
		this.isvalid = isvalid;
		if(isvalid != null){
			putQueryParameter("isvalid", isvalid.toString());
		}
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
		if(id != null){
			putQueryParameter("id", id);
		}
	}

	public String getInfos() {
		return this.infos;
	}

	public void setInfos(String infos) {
		this.infos = infos;
		if(infos != null){
			putQueryParameter("infos", infos);
		}
	}

	@Override
	public Class<DemoObjectTestResponse> getResponseClass() {
		return DemoObjectTestResponse.class;
	}

}
