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
import java.util.List;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class CreateComputeTask2Request extends RoaAcsRequest<CreateComputeTask2Response> {
	   

	@SerializedName("body")
	private Body body;
	public CreateComputeTask2Request() {
		super("umeng-finplus", "2022-09-13", "CreateComputeTask2");
		setProtocol(ProtocolType.HTTPS);
		setUriPattern("/bc/createComputeTask2");
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

		@SerializedName("clientId")
		private Long clientId;

		@SerializedName("dataSetIds")
		private String dataSetIds;

		@SerializedName("morseInfoList")
		private List<MorseInfoListItem> morseInfoList;

		@SerializedName("appId")
		private Long appId;

		@SerializedName("name")
		private String name;

		@SerializedName("type")
		private String type;

		@SerializedName("remarks")
		private String remarks;

		public Long getClientId() {
			return this.clientId;
		}

		public void setClientId(Long clientId) {
			this.clientId = clientId;
		}

		public String getDataSetIds() {
			return this.dataSetIds;
		}

		public void setDataSetIds(String dataSetIds) {
			this.dataSetIds = dataSetIds;
		}

		public List<MorseInfoListItem> getMorseInfoList() {
			return this.morseInfoList;
		}

		public void setMorseInfoList(List<MorseInfoListItem> morseInfoList) {
			this.morseInfoList = morseInfoList;
		}

		public Long getAppId() {
			return this.appId;
		}

		public void setAppId(Long appId) {
			this.appId = appId;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public String getRemarks() {
			return this.remarks;
		}

		public void setRemarks(String remarks) {
			this.remarks = remarks;
		}

		public static class MorseInfoListItem {

			@SerializedName("cuVersion")
			private String cuVersion;

			@SerializedName("cuId")
			private String cuId;

			public String getCuVersion() {
				return this.cuVersion;
			}

			public void setCuVersion(String cuVersion) {
				this.cuVersion = cuVersion;
			}

			public String getCuId() {
				return this.cuId;
			}

			public void setCuId(String cuId) {
				this.cuId = cuId;
			}
		}
	}

	@Override
	public Class<CreateComputeTask2Response> getResponseClass() {
		return CreateComputeTask2Response.class;
	}

}
