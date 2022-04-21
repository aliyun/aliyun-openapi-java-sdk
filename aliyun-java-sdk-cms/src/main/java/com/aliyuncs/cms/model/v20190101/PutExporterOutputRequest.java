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

package com.aliyuncs.cms.model.v20190101;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class PutExporterOutputRequest extends RpcAcsRequest<PutExporterOutputResponse> {
	   

	private String destName;

	private String configJson;

	private String destType;

	private String desc;
	public PutExporterOutputRequest() {
		super("Cms", "2019-01-01", "PutExporterOutput", "cms");
		setMethod(MethodType.POST);
	}

	public String getDestName() {
		return this.destName;
	}

	public void setDestName(String destName) {
		this.destName = destName;
		if(destName != null){
			putQueryParameter("DestName", destName);
		}
	}

	public String getConfigJson() {
		return this.configJson;
	}

	public void setConfigJson(String configJson) {
		this.configJson = configJson;
		if(configJson != null){
			putQueryParameter("ConfigJson", configJson);
		}
	}

	public String getDestType() {
		return this.destType;
	}

	public void setDestType(String destType) {
		this.destType = destType;
		if(destType != null){
			putQueryParameter("DestType", destType);
		}
	}

	public String getDesc() {
		return this.desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
		if(desc != null){
			putQueryParameter("Desc", desc);
		}
	}

	@Override
	public Class<PutExporterOutputResponse> getResponseClass() {
		return PutExporterOutputResponse.class;
	}

}
