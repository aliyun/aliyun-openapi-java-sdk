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
public class AsadasdasdRequest extends RoaAcsRequest<AsadasdasdResponse> {
	   

	private String a;
	public AsadasdasdRequest() {
		super("amp", "2020-07-08", "Asadasdasd", "jeepproduct001");
		setUriPattern("/asdxzc");
		setMethod(MethodType.POST);
	}

	public String getA() {
		return this.a;
	}

	public void setA(String a) {
		this.a = a;
		if(a != null){
			putQueryParameter("A", a);
		}
	}

	@Override
	public Class<AsadasdasdResponse> getResponseClass() {
		return AsadasdasdResponse.class;
	}

}
