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

package com.aliyuncs.ecsops.model.v20160401;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.ecsops.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class OpsModifyImagePublishStateRequest extends RpcAcsRequest<OpsModifyImagePublishStateResponse> {
	   

	private String publishState;

	private String operator;

	private String imageGroup;

	private List<ExtraData> extraDatas;

	private String auditParamStr;
	public OpsModifyImagePublishStateRequest() {
		super("Ecsops", "2016-04-01", "OpsModifyImagePublishState", "ecs");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getPublishState() {
		return this.publishState;
	}

	public void setPublishState(String publishState) {
		this.publishState = publishState;
		if(publishState != null){
			putQueryParameter("PublishState", publishState);
		}
	}

	public String getOperator() {
		return this.operator;
	}

	public void setOperator(String operator) {
		this.operator = operator;
		if(operator != null){
			putQueryParameter("Operator", operator);
		}
	}

	public String getImageGroup() {
		return this.imageGroup;
	}

	public void setImageGroup(String imageGroup) {
		this.imageGroup = imageGroup;
		if(imageGroup != null){
			putQueryParameter("ImageGroup", imageGroup);
		}
	}

	public List<ExtraData> getExtraDatas() {
		return this.extraDatas;
	}

	public void setExtraDatas(List<ExtraData> extraDatas) {
		this.extraDatas = extraDatas;	
		if (extraDatas != null) {
			for (int depth1 = 0; depth1 < extraDatas.size(); depth1++) {
				putQueryParameter("ExtraData." + (depth1 + 1) + ".Value" , extraDatas.get(depth1).getValue());
				putQueryParameter("ExtraData." + (depth1 + 1) + ".Key" , extraDatas.get(depth1).getKey());
			}
		}	
	}

	public String getAuditParamStr() {
		return this.auditParamStr;
	}

	public void setAuditParamStr(String auditParamStr) {
		this.auditParamStr = auditParamStr;
		if(auditParamStr != null){
			putQueryParameter("AuditParamStr", auditParamStr);
		}
	}

	public static class ExtraData {

		private String value;

		private String key;

		public String getValue() {
			return this.value;
		}

		public void setValue(String value) {
			this.value = value;
		}

		public String getKey() {
			return this.key;
		}

		public void setKey(String key) {
			this.key = key;
		}
	}

	@Override
	public Class<OpsModifyImagePublishStateResponse> getResponseClass() {
		return OpsModifyImagePublishStateResponse.class;
	}

}
