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

package com.aliyuncs.cloudcallcenter.model.v20170705;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class UpdateTaobaoAccessTokenByAliyunPkRequest extends RpcAcsRequest<UpdateTaobaoAccessTokenByAliyunPkResponse> {
	
	public UpdateTaobaoAccessTokenByAliyunPkRequest() {
		super("CloudCallCenter", "2017-07-05", "UpdateTaobaoAccessTokenByAliyunPk", "CloudCallCenter", "innerAPI");
	}

	private Long aliyunPk;

	private String taobaoAccessToken;

	private Integer taobaoAccessTokenExpiresIn;

	public Long getAliyunPk() {
		return this.aliyunPk;
	}

	public void setAliyunPk(Long aliyunPk) {
		this.aliyunPk = aliyunPk;
		if(aliyunPk != null){
			putQueryParameter("AliyunPk", aliyunPk.toString());
		}
	}

	public String getTaobaoAccessToken() {
		return this.taobaoAccessToken;
	}

	public void setTaobaoAccessToken(String taobaoAccessToken) {
		this.taobaoAccessToken = taobaoAccessToken;
		if(taobaoAccessToken != null){
			putQueryParameter("TaobaoAccessToken", taobaoAccessToken);
		}
	}

	public Integer getTaobaoAccessTokenExpiresIn() {
		return this.taobaoAccessTokenExpiresIn;
	}

	public void setTaobaoAccessTokenExpiresIn(Integer taobaoAccessTokenExpiresIn) {
		this.taobaoAccessTokenExpiresIn = taobaoAccessTokenExpiresIn;
		if(taobaoAccessTokenExpiresIn != null){
			putQueryParameter("TaobaoAccessTokenExpiresIn", taobaoAccessTokenExpiresIn.toString());
		}
	}

	@Override
	public Class<UpdateTaobaoAccessTokenByAliyunPkResponse> getResponseClass() {
		return UpdateTaobaoAccessTokenByAliyunPkResponse.class;
	}

}
