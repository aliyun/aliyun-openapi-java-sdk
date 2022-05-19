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
public class DemoSixHsfRequest extends RoaAcsRequest<DemoSixHsfResponse> {
	   

	private String codeMap;

	private String strMap;
	public DemoSixHsfRequest() {
		super("LmzTest", "2010-01-01", "DemoSixHsf");
		setUriPattern("/get/id/1");
		setMethod(MethodType.GET);
	}

	public String getCodeMap() {
		return this.codeMap;
	}

	public void setCodeMap(String codeMap) {
		this.codeMap = codeMap;
		if(codeMap != null){
			putQueryParameter("codeMap", codeMap);
		}
	}

	public String getStrMap() {
		return this.strMap;
	}

	public void setStrMap(String strMap) {
		this.strMap = strMap;
		if(strMap != null){
			putQueryParameter("strMap", strMap);
		}
	}

	@Override
	public Class<DemoSixHsfResponse> getResponseClass() {
		return DemoSixHsfResponse.class;
	}

}
