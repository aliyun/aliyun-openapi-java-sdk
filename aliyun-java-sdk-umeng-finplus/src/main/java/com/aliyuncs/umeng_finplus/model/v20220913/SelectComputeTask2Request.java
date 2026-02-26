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

package com.aliyuncs.umeng_finplus.model.v20220913;

import com.aliyuncs.RoaAcsRequest;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class SelectComputeTask2Request extends RoaAcsRequest<SelectComputeTask2Response> {
	   

	@SerializedName("body")
	private Body body;
	public SelectComputeTask2Request() {
		super("umeng-finplus", "2022-09-13", "SelectComputeTask2");
		setProtocol(ProtocolType.HTTPS);
		setUriPattern("/bc/selectComputeTask2");
		setMethod(MethodType.POST);
	}

	public Body getBody() {
		return this.body;
	}

	public void setBody(Body body) {
		this.body = body;	
		if (body != null) {
			putBodyParameter("body" , new Gson().toJson(body));
		}	
	}

	public static class Body {

		@SerializedName("bcId")
		private Long bcId;

		@SerializedName("clientId")
		private Long clientId;

		@SerializedName("bcConfirm")
		private Boolean bcConfirm;

		public Long getBcId() {
			return this.bcId;
		}

		public void setBcId(Long bcId) {
			this.bcId = bcId;
		}

		public Long getClientId() {
			return this.clientId;
		}

		public void setClientId(Long clientId) {
			this.clientId = clientId;
		}

		public Boolean getBcConfirm() {
			return this.bcConfirm;
		}

		public void setBcConfirm(Boolean bcConfirm) {
			this.bcConfirm = bcConfirm;
		}
	}

	@Override
	public Class<SelectComputeTask2Response> getResponseClass() {
		return SelectComputeTask2Response.class;
	}

}
