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

package com.aliyuncs.cf.model.v20151127;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.ProtocolType;

/**
 * @author auto create
 * @version 
 */
public class QuerySimpleRequest extends RpcAcsRequest<QuerySimpleResponse> {
	
	public QuerySimpleRequest() {
		super("CF", "2015-11-27", "QuerySimple", "cf");
		setProtocol(ProtocolType.HTTPS);
	}

	private String tokenId;

	private String sceneId;

	private String appKey;

	private String serialNo;

	private Long timeStamp;

	private String trans;

	public String getTokenId() {
		return this.tokenId;
	}

	public void setTokenId(String tokenId) {
		this.tokenId = tokenId;
		if(tokenId != null){
			putQueryParameter("TokenId", tokenId);
		}
	}

	public String getSceneId() {
		return this.sceneId;
	}

	public void setSceneId(String sceneId) {
		this.sceneId = sceneId;
		if(sceneId != null){
			putQueryParameter("SceneId", sceneId);
		}
	}

	public String getAppKey() {
		return this.appKey;
	}

	public void setAppKey(String appKey) {
		this.appKey = appKey;
		if(appKey != null){
			putQueryParameter("AppKey", appKey);
		}
	}

	public String getSerialNo() {
		return this.serialNo;
	}

	public void setSerialNo(String serialNo) {
		this.serialNo = serialNo;
		if(serialNo != null){
			putQueryParameter("SerialNo", serialNo);
		}
	}

	public Long getTimeStamp() {
		return this.timeStamp;
	}

	public void setTimeStamp(Long timeStamp) {
		this.timeStamp = timeStamp;
		if(timeStamp != null){
			putQueryParameter("TimeStamp", timeStamp.toString());
		}
	}

	public String getTrans() {
		return this.trans;
	}

	public void setTrans(String trans) {
		this.trans = trans;
		if(trans != null){
			putQueryParameter("Trans", trans);
		}
	}

	@Override
	public Class<QuerySimpleResponse> getResponseClass() {
		return QuerySimpleResponse.class;
	}

}
