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

package com.aliyuncs.dataworks_public.model.v20200518;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import java.util.Map;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.dataworks_public.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DsgDesensPlanAddOrUpdateRequest extends RpcAcsRequest<DsgDesensPlanAddOrUpdateResponse> {
	   

	@SerializedName("desensRules")
	private List<DesensRules> desensRules;
	public DsgDesensPlanAddOrUpdateRequest() {
		super("dataworks-public", "2020-05-18", "DsgDesensPlanAddOrUpdate");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public List<DesensRules> getDesensRules() {
		return this.desensRules;
	}

	public void setDesensRules(List<DesensRules> desensRules) {
		this.desensRules = desensRules;	
		if (desensRules != null) {
			putQueryParameter("DesensRules" , new Gson().toJson(desensRules));
		}	
	}

	public static class DesensRules {

		@SerializedName("Owner")
		private String owner;

		@SerializedName("DataType")
		private String dataType;

		@SerializedName("RuleName")
		private String ruleName;

		@SerializedName("Id")
		private Integer id;

		@SerializedName("SceneIds")
		private List<Integer> sceneIds;

		@SerializedName("DesensPlan")
		private DesensPlan desensPlan;

		@SerializedName("CheckWatermark")
		private Boolean checkWatermark;

		@SerializedName("Status")
		private Integer status;

		public String getOwner() {
			return this.owner;
		}

		public void setOwner(String owner) {
			this.owner = owner;
		}

		public String getDataType() {
			return this.dataType;
		}

		public void setDataType(String dataType) {
			this.dataType = dataType;
		}

		public String getRuleName() {
			return this.ruleName;
		}

		public void setRuleName(String ruleName) {
			this.ruleName = ruleName;
		}

		public Integer getId() {
			return this.id;
		}

		public void setId(Integer id) {
			this.id = id;
		}

		public List<Integer> getSceneIds() {
			return this.sceneIds;
		}

		public void setSceneIds(List<Integer> sceneIds) {
			this.sceneIds = sceneIds;
		}

		public DesensPlan getDesensPlan() {
			return this.desensPlan;
		}

		public void setDesensPlan(DesensPlan desensPlan) {
			this.desensPlan = desensPlan;
		}

		public Boolean getCheckWatermark() {
			return this.checkWatermark;
		}

		public void setCheckWatermark(Boolean checkWatermark) {
			this.checkWatermark = checkWatermark;
		}

		public Integer getStatus() {
			return this.status;
		}

		public void setStatus(Integer status) {
			this.status = status;
		}

		public static class DesensPlan {

			@SerializedName("ExtParam")
			private Map<String,Object> extParam;

			@SerializedName("DesensPlanType")
			private String desensPlanType;

			public Map<String,Object> getExtParam() {
				return this.extParam;
			}

			public void setExtParam(Map<String,Object> extParam) {
				this.extParam = extParam;
			}

			public String getDesensPlanType() {
				return this.desensPlanType;
			}

			public void setDesensPlanType(String desensPlanType) {
				this.desensPlanType = desensPlanType;
			}
		}
	}

	@Override
	public Class<DsgDesensPlanAddOrUpdateResponse> getResponseClass() {
		return DsgDesensPlanAddOrUpdateResponse.class;
	}

}
