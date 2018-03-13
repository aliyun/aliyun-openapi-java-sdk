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
package com.aliyuncs.cloudwf.model.v20170328;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class DeleteApRadioSsidConfigRequest extends RpcAcsRequest<DeleteApRadioSsidConfigResponse> {
	
	public DeleteApRadioSsidConfigRequest() {
		super("cloudwf", "2017-03-28", "DeleteApRadioSsidConfig");
	}

	private Integer instantlyEffective;

	private Long id;

	public Integer getInstantlyEffective() {
		return this.instantlyEffective;
	}

	public void setInstantlyEffective(Integer instantlyEffective) {
		this.instantlyEffective = instantlyEffective;
		if(instantlyEffective != null){
			putQueryParameter("InstantlyEffective", instantlyEffective.toString());
		}
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
		if(id != null){
			putQueryParameter("Id", id.toString());
		}
	}

	@Override
	public Class<DeleteApRadioSsidConfigResponse> getResponseClass() {
		return DeleteApRadioSsidConfigResponse.class;
	}

}
